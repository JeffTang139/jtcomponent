/**
 * 
 */
package org.eclipse.jt.sql.assist.core.process;

import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDefine;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstVisitor;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.data.DataConstants;
import org.eclipse.jt.sql.assist.core.exception.LoadDataFailedException;
import org.eclipse.jt.sql.assist.core.exception.WarnWarningException;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractVisitDriver<TScope extends IDataScope<TScope>> 
			extends AbstractMessager<IWarnings>
			implements IAstVisitor, IVisitDriver<TScope> {
	
	public static boolean DEBUG = false;
	

	protected IVisitControler<TScope> fRootControler;
	protected IAstAccessor<TScope> fAccessor;
	protected IAstWalker fWalker;
	protected IDataProvider fDataLoader;
	protected IWarnings fWarnings;
//	private IWarnings fDataLoaderWarnings;
	
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		fAccessor = accessor;
		fDataLoader = dataLoader;
		fWalker = null;
	}
	
	public void initialize(IAstWalker walker) {
		fWalker = walker;
		fAccessor = null;
		fDataLoader = null;
	}

	public void process(IAstNode ast) throws Throwable {
		visitGeneral(ast, fRootControler);
	}
	
	public IAstWalker getWalker() {
		return fWalker;
	}
	
	public IDataProvider getDataLoader() {
		return fDataLoader;
	}
	
	public IAstAccessor<TScope> getAccessor() {
		return fAccessor;
	}
	
	public IVisitControler<TScope> getPrimaryVisitControler() {
		return fRootControler;
	}
	
	public void setPrimaryVisitControler(IVisitControler<TScope> walkControler) {
		fRootControler=walkControler;
	}
	
	public IWarnings getWarnings() {
		return fWarnings;
	}
	
	public void setWarnings(IWarnings warnings) {
		fWarnings=warnings;
	}
	
	protected IVisitControler<TScope> getSubControler(IVisitControler<TScope> data, IAstNode ast) {
		return data.getControler(ast);
	}
	
	protected void processDataLoaderReports(Throwable[] throwables, IAstNode ast, String dataName, int dataType) {
		if(throwables==null) return;
		for(int i=0; i<throwables.length; i++) {
			Throwable throwable=throwables[i];
			if(!(throwable instanceof WarnWarningException)) {
				throwable = new LoadDataFailedException("Load data for visit failed",throwable);
				AbstractVisitDriver.this.report(throwable, this);
			}
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
//	
//	protected IWarnings getDataLoaderWarnings() {
//		if(fDataLoaderWarnings==null) {
//			synchronized (this) {
//				if(fDataLoaderWarnings==null) {
//					fDataLoaderWarnings=new AbstractDataLoaderWarnings<IWarnings>(fWarnings) {
//						
//						public void report(Throwable throwable, Object reporter) {
//							if(throwable instanceof ErrorWarningException) {
//								reporter=AbstractVisitDriver.this;
//							} else if(throwable instanceof WarnWarningException) {
//								return;
//							}
//							throwable = new LoadDataFailedException("Load data for visit failed",throwable);
//							AbstractVisitDriver.this.report(throwable, reporter);
//						}
//						
//					};
//				}
//			}
//		}
//		return fDataLoaderWarnings;
//	}
//
//	protected void setDataLoaderWarnings(IWarnings dataLoaderWarnings) {
//		this.fDataLoaderWarnings = dataLoaderWarnings;
//	}
	
	protected abstract void visitGeneral(IAstNode ast, IVisitControler<TScope> data) throws Throwable;

}
