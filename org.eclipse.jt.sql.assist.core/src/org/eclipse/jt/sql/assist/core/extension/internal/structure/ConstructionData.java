/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.sql.assist.core.process.AbstractMessager;


/**
 * @author Jeff Tang
 *
 */
public class ConstructionData<TSNode extends IStructuredAstNode<TSNode>> extends AbstractMessager<IWarnings> {
	
	public TSNode result;
	
	private IPositionManager fPositionManager;
	private IDataProvider fDataLoader;
	private boolean fDetails;
//	private IWarnings fDataLoaderWarnings;
	
	public ConstructionData(IWarnings warnings) {
		super();
		fWarnings=warnings;
	}

	public IPositionManager getPositionManager() {
		return fPositionManager;
	}

	public void setPositionManager(IPositionManager positionManager) {
		fPositionManager = positionManager;
	}

	public IDataProvider getDataLoader() {
		return fDataLoader;
	}

	public void setDataLoader(IDataProvider dataLoader) {
		fDataLoader = dataLoader;
	}

	public boolean isDetails() {
		return fDetails;
	}

	public void setDetails(boolean details) {
		fDetails = details;
	}
	
	public String getSource(ISourcePosition pos) {
		if(fPositionManager!=null) {
			fPositionManager.getSource(pos);
		}
		return null;
	}
	
//	public Object loadData(int dataKind, String dataName) throws Throwable {
//		if(fDataLoader!=null) {
//			fDataLoader.loadData(dataName, dataKind, getDataLoaderWarnings());
//		}
//		return null;
//	}
//	
//
//	public IWarnings getDataLoaderWarnings() {
//		if(fDataLoaderWarnings==null) {
//			synchronized (this) {
//				if(fDataLoaderWarnings==null) {
//					fDataLoaderWarnings=new AbstractDataLoaderWarnings<IWarnings>(fWarnings) {
//						
//						public void report(Throwable throwable, Object reporter) {
//							if(throwable instanceof ErrorWarningException) {
//								throwable = new LoadDataFailedException("Load data for construction failed",throwable);
//								reporter=ConstructionData.this;
//							} else if(throwable instanceof WarnWarningException) {
//								return;
//							}
//							ConstructionData.this.report(throwable, reporter);
//						}
//						
//					};
//				}
//			}
//		}
//		return fDataLoaderWarnings;
//	}
}
