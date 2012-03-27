/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDefine;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.analysis.ICompletionDetector;
import org.eclipse.jt.script.assist.analysis.ICompletionMessager;
import org.eclipse.jt.script.assist.analysis.ICompletionProposal;
import org.eclipse.jt.sql.assist.core.analysis.kinds.CompletionProposalKinds;
import org.eclipse.jt.sql.assist.core.data.DataConstants;
import org.eclipse.jt.sql.assist.core.exception.ErrorWarningException;
import org.eclipse.jt.sql.assist.core.exception.LoadDataFailedException;
import org.eclipse.jt.sql.assist.core.exception.WarnWarningException;
import org.eclipse.jt.sql.assist.core.process.AbstractProcessor;
import org.eclipse.jt.sql.assist.core.process.WarningsCollector;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractCompletionDetector<TScope extends IDataScope<TScope>> extends AbstractProcessor<TScope, ICompletionMessager> 
		implements ICompletionDetector, CompletionProposalKinds {
	
	public static boolean DEBUG=Boolean.parseBoolean(System.getProperty("dnasql.assist.completiondetector.debug"));

	protected String fContent;
	protected int fPosition;
	protected boolean fIsAssited;
	protected IDataProvider fDataLoader;
//	private IWarnings fDataLoaderWarnings;

	public final boolean isIgnored(int kind, Boolean forceIgnore) {
		boolean ignore= (forceIgnore!=null && forceIgnore==true) 
		|| (this.fWarnings!=null && this.fWarnings.isIgnored(kind));
		return ignore;
	}
	
	public final void assit(ICompletionProposal proposal) {
		if(this.fWarnings!=null)
			this.fWarnings.assit(proposal);
		fIsAssited=true;
	}
	
	public final boolean isInplace(IAstNode ast) {
		if(ast==null||ast.getPosition()==null) return false;
		return ast.getPosition().getStart()<=fPosition && ast.getPosition().getEnd()>=fPosition;
	}
	
	/**
	 * 光标是否在在节点的区域内，包括紧随节点的情况
	 * @param ast
	 * @return
	 */
	public final boolean isSurround(IAstNode ast) {
		if(ast==null||ast.getPosition()==null) return false;
		return ast.getPosition().getStart()<=fPosition && ast.getPosition().getEnd()>=fPosition;
	}
	
	public final boolean isSurround(ISourcePosition position) {
		return position!=null&&isSurround(position.getStart(),position.getEnd());
	}
	
	public final boolean isSurround(int start, int end) {
		return start<=fPosition && end>=fPosition;
	}
	
	/**
	 * 节点是否为光标位置的前驱
	 * @param ast
	 * @return
	 */
	public final boolean isVan(IAstNode ast) {
		if(ast==null||ast.getPosition()==null) return false;
		return isVan(ast.getPosition().getEnd());
	}
	
	public final boolean isVan(ISourcePosition position) {
		return position!=null&&isVan(position.getEnd());
	}
	
	public final boolean isVan(int end) {
		if(end<0||end>fPosition) return false;
		for(int i=end;i<fPosition;i++) {
			char c=fContent.charAt(i);
			if(!Character.isWhitespace(c)) return false;
		}
		return true;
	}
	
	/**
	 * 节点是否为光标的后驱
	 * @param ast
	 * @return
	 */
	public final boolean isRear(IAstNode ast) {
		if(ast==null||ast.getPosition()==null) return false;
		return isRear(ast.getPosition().getStart()-1);
	}
	
	public final boolean isRear(ISourcePosition position) {
		return position!=null&&isRear(position.getStart()-1);
	}
	
	public final boolean isRear(int begin) {
		if(begin>=fContent.length()||begin<fPosition) return false;
		for(int i=begin;i>fPosition;i--) {
			char c=fContent.charAt(i);
			if(!Character.isWhitespace(c)) return false;
		}
		return true;
	}
	
	public final int passChar(int offset, char ch, boolean ignoreCase) {
		if(offset<0||offset>=fContent.length()) return offset;
		if(ignoreCase) ch=Character.toUpperCase(ch);
		int index=offset;
		for(;index<fContent.length();index++) {
			char c=fContent.charAt(index);
			if(ignoreCase) c=Character.toUpperCase(c);
			if(c==ch) return index+1;
			if(!Character.isWhitespace(c)) break;
		}
		return offset;
	}
	
	public final int passString(int offset, String str, boolean ignoreCase) {
		if(offset<0||offset>=fContent.length()||str==null) return offset;
		int index=offset;
		for(;index<fContent.length();index++) {
			char c=fContent.charAt(index);
			if(!Character.isWhitespace(c)) break;
		}

		if(ignoreCase){
			if(index<fContent.length() && fContent.substring(index,index+str.length()).equalsIgnoreCase(str))
				return index+str.length();
		} else {
			if(index<fContent.length() && fContent.startsWith(str, index))
				return index+str.length();
		}
		return offset;
	}
	
	public final int backChar(int offset, char ch, boolean ignoreCase) {
		if(offset<0||offset>=fContent.length()) return offset;
		if(ignoreCase) ch=Character.toUpperCase(ch);
		int index=offset;
		for(;index>=0;index--) {
			char c=fContent.charAt(index);
			if(ignoreCase) c=Character.toUpperCase(c);
			if(c==ch) return index-1;
			if(!Character.isWhitespace(c)) break;
		}
		return offset;
	}
	
	public final int backString(int offset, String str, boolean ignoreCase) {
		if(offset<0||offset>=fContent.length()||str==null) return offset;
		int index=offset;
		for(;index>=0;index--) {
			char c=fContent.charAt(index);
			if(!Character.isWhitespace(c)) break;
		}
		index-=str.length()-1;
		if(ignoreCase){
			if(index>=0 && fContent.substring(index,index+str.length()).equalsIgnoreCase(str))
				return index-1;
		} else {
			if(index>=0 && fContent.startsWith(str, index))
				return index-1;
		}
		return offset;
	}
	
	public final boolean isNewStart(int offset) {
		return offset==0 || (offset<fContent.length()&&Character.isWhitespace(fContent.charAt(offset-1)));
	}
	
	protected void processDataLoaderReports(Throwable[] throwables, IAstNode ast, String dataName, int dataType) {
		if(throwables==null) return;
		for(int i=0; i<throwables.length; i++) {
			Throwable throwable=throwables[i];
			if(throwable instanceof ErrorWarningException) {
				throwable = new LoadDataFailedException("Load data for completion failed",throwable);
			} else if(throwable instanceof WarnWarningException) {
				continue;
			}
			report(throwable, this);
		}
	}

	protected IDataDefine getData(String id, int kind, Map<String, String> configs, IAstNode ast) 
			throws Throwable {
		IDataDefine data=null;
		if(fDataLoader!=null) {
			WarningsCollector<IWarnings> wCollector=new WarningsCollector<IWarnings>(DataConstants.MESSAGE_PREFIX, fWarnings);
			try {
				data=fDataLoader.loadData(id, kind, configs, wCollector);
			} catch (Throwable e) {
				wCollector.report(e, ast);
			}
			processDataLoaderReports(wCollector.getReports(), ast, id, kind);
		}
		return data;
	}
//	public IWarnings getDataLoaderWarnings() {
//		if(fDataLoaderWarnings==null) {
//			synchronized (this) {
//				if(fDataLoaderWarnings==null) {
//					fDataLoaderWarnings=new AbstractDataLoaderWarnings<ICompletionMessager>(fWarnings) {
//						
//						public void report(Throwable throwable, Object reporter) {
//							if(throwable instanceof ErrorWarningException) {
//								throwable = new LoadDataFailedException("Load data for completion failed",throwable);
//								reporter=AbstractCompletionDetector.this;
//							} else if(throwable instanceof WarnWarningException) {
//								return;
//							}
//							AbstractCompletionDetector.this.report(throwable, reporter);
//						}
//						
//					};
//				}
//			}
//		}
//		return fDataLoaderWarnings;
//	}
//
//	public void setDataLoaderWarnings(IWarnings dataLoaderWarnings) {
//		this.fDataLoaderWarnings = dataLoaderWarnings;
//	}
	
	public final void detectCompletion(IAstNode ast, String content, int position, ICompletionMessager messager, IDataProvider dataLoader) {
		fWarnings=messager;
		fContent=content;
		fPosition=position;
		fIsAssited=false;
		fDataLoader=dataLoader;
		fScope=createDefaultScope();
		doDetect(ast);
	}
	
	protected abstract TScope createDefaultScope();
	
	protected abstract void doDetect(IAstNode ast);

}
