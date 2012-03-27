/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDefine;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.frontend.ISemanticChecker;
import org.eclipse.jt.script.assist.frontend.ISemanticWarnings;
import org.eclipse.jt.sql.assist.core.data.DataConstants;
import org.eclipse.jt.sql.assist.core.exception.ErrorWarningException;
import org.eclipse.jt.sql.assist.core.exception.LoadDataFailedException;
import org.eclipse.jt.sql.assist.core.exception.WarnWarningException;
import org.eclipse.jt.sql.assist.core.kinds.SemanticWarningKinds;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractSemanticChecker<TScope extends IDataScope<TScope>> extends AbstractProcessor<TScope, ISemanticWarnings>
		implements ISemanticChecker, SemanticWarningKinds {
	
	public static boolean DEBUG=Boolean.parseBoolean(System.getProperty("dnasql.assist.semanticchecker.debug"));

	protected IDataProvider fDataLoader;
	protected boolean fHasError;
	protected boolean fClean;
//	private IWarnings fDataLoaderWarnings;
	
	protected final void fatal(String message, IAstNode obj) {
		fHasError=true;
		if(this.fWarnings!=null) {
			fWarnings.fatal(message);
		} else {
			System.out.print("!fatal:\t");
			System.out.println(message);
		}
	}
	
	protected final void error(int id, String[] arguments, String message, IAstNode obj) {
		fHasError=true;
		if(this.fWarnings!=null) {
			fWarnings.error(id, arguments, message, obj);
		} else {
			System.out.print("!error:\t");
			System.out.println(message);
		}
	}
	
	protected final void warn(int id, String[] arguments, String message, IAstNode obj) {
		if(this.fWarnings!=null) {
			fWarnings.warn(id, arguments, message, obj);
		} else {
			System.out.print("!warn:\t");
			System.out.println(message);
		}
	}
	
	@Override
	public void fatal(String message) {
		fHasError=true;
		super.fatal(message);
	}
	
	@Override
	public void report(Throwable throwable, Object reporter) {
		fHasError=true;
		super.report(throwable, reporter);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ISemanticChecker#check(org.eclipse.jt.script.assist.IAstNode, org.eclipse.jt.sql.assist.core.ISemanticWarnings)
	 */
	public final boolean check(IAstNode ast, IDataProvider loader, ISemanticWarnings warnings) {
		return check(ast,loader,warnings,null);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ISemanticChecker#check(org.eclipse.jt.script.assist.IAstNode, org.eclipse.jt.sql.assist.core.IDataProvider, org.eclipse.jt.sql.assist.core.ISemanticWarnings, org.eclipse.jt.sql.assist.core.IInitializer)
	 */
	public final boolean check(IAstNode ast, IDataProvider loader, ISemanticWarnings warnings, IDataScope<?> dataScope) {
		fClean=true;
		fHasError=false;
		fDataLoader=loader;
		fWarnings=warnings;
		try {
			initialize(dataScope);
			doCheck(ast);
			if(fClean) clean();
		} catch (Throwable e) {
			report(e,ast);
		}
		return !fHasError;
	}
	
	protected void initialize(IDataScope<?> dataScope) {
		if(dataScope==null) {
			fScope=createDefaultScope();
		} else {
			fScope=convertScope(dataScope);
		}
	}
	
	protected abstract TScope convertScope(IDataScope<?> dataScope);
	
	protected abstract TScope createDefaultScope();
	
	protected abstract void doCheck(IAstNode ast) throws Throwable;
	
	protected abstract void clean();

	protected void processDataLoaderReports(Throwable[] throwables, String msgPrefix, IAstNode ast, String dataName, int dataType) {
		if(throwables==null) return;
		for(int i=0; i<throwables.length; i++) {
			Throwable throwable=throwables[i];
			if(throwable instanceof ErrorWarningException) {
				error(KIND_LOAD_DATA_FAILED,new String[]{},msgPrefix !=null? msgPrefix + throwable.getMessage() : throwable.getMessage(), ast);
				continue;
			} else if(throwable instanceof WarnWarningException) {
				warn(KIND_LOAD_DATA_FAILED,new String[]{},msgPrefix !=null? msgPrefix + throwable.getMessage() : throwable.getMessage(), ast);
				continue;
			}
			report(new LoadDataFailedException(throwable), this);
		}
	}
	
	protected IDataDefine getData(String id, int kind, Map<String, String> configs, IAstNode ast, String problemPrefix) 
			throws Throwable {
		IDataDefine data=null;
		if(fDataLoader!=null) {
			WarningsCollector<IWarnings> wCollector=new WarningsCollector<IWarnings>(DataConstants.MESSAGE_PREFIX, fWarnings);
			try {
				data=fDataLoader.loadData(id, kind, configs, wCollector);
			} catch (Throwable e) {
				wCollector.report(e, ast);
			}
			processDataLoaderReports(wCollector.getReports(), problemPrefix, ast, id, kind);
		}
		return data;
	}
//
//	public IWarnings getDataLoaderWarnings() {
//		if(fDataLoaderWarnings==null) {
//			synchronized (this) {
//				if(fDataLoaderWarnings==null) {
//					fDataLoaderWarnings=new AbstractDataLoaderWarnings<ISemanticWarnings>(fWarnings) {
//						
//						public void report(Throwable throwable, Object reporter) {
//							if(throwable instanceof ErrorWarningException) {
//								AbstractSemanticChecker.this.error(KIND_LOAD_DATA_FAILED,new String[]{},throwable.getMessage(), ((ErrorWarningException)throwable).getAst());
//								return;
//							} else if(throwable instanceof WarnWarningException) {
//								AbstractSemanticChecker.this.warn(KIND_LOAD_DATA_FAILED,new String[]{},throwable.getMessage(), ((WarnWarningException)throwable).getAst());
//								return;
//							}
//							AbstractSemanticChecker.this.report(new LoadDataFailedException(throwable), reporter);
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
}
