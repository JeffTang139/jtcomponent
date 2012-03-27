/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.analysis.ISelectionDetector;
import org.eclipse.jt.script.assist.analysis.ISelectionMessager;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.process.DefaultVisitControler;
import org.eclipse.jt.sql.assist.core.visit.access.AbstractAstAccessor;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractSelectionDetector<TScope extends IDataScope<TScope>> extends AbstractAstAccessor<TScope> implements ISelectionDetector<TScope> {

	protected SelectionDetectorData<TScope> fData;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.assit.ISelectionDetecotor#detectSelection(org.eclipse.jt.script.assist.IAstNode, org.eclipse.jt.script.assist.IAstNode, org.eclipse.jt.sql.assist.core.assit.ISelectionMessager)
	 */
	public final void detectOccurrence(IAstNode ast, IAstNode selection, ISourcePosition position, IDataProvider loader,
			ISelectionMessager<TScope> messager) {
		TScope scope=createScope();
		IVisitControler<TScope> controler= createWalkControler(scope, selection);
		IVisitDriver<TScope> processor=DnaSql.getDefault().createVisitDriver(getSqlKind(), controler);
		processor.initialize(this,loader);
		fData=new SelectionDetectorData<TScope>(selection,position,loader,messager, processor);
		try {
			fData.pretreatment=true;
			processor.process(ast);
			if(fData.target!=null) {
				fData.pretreatment=false;
				processor.setPrimaryVisitControler(createWalkControler(scope, null));
				processor.process(ast);
			}
		} catch (Throwable e) {
			fData.report(e, this);
		}
	}
	
	public void detectReference(IAstNode ast, IAstNode selection, ISourcePosition position,
			IDataProvider loader, ISelectionMessager<TScope> messager) {
		TScope scope=createScope();
		IVisitControler<TScope> controler= createWalkControler(scope, selection);
		IVisitDriver<TScope> processor=DnaSql.getDefault().createVisitDriver(getSqlKind(), controler);
		processor.initialize(this,loader);
		fData=new SelectionDetectorData<TScope>(selection,position,loader,messager, processor);
		try {
			fData.pretreatment=true;
			processor.process(ast);
			if(fData.target!=null) {
				ISourcePosition pos=fData.target.position;
				if(pos==null) pos=fData.target.ast.getPosition();
				fData.assit(pos, fData.target);
			}
		} catch (Throwable e) {
			fData.report(e, this);
		}
	}

	public abstract int getSqlKind();
	
	protected abstract TScope createScope();
	
	protected IVisitControler<TScope> createWalkControler(TScope scope, IAstNode selection) {
		return new DefaultVisitControler<TScope>(DnaSql.POLICY_PROCESS, getBuildScopeDataKind(selection), scope);
	}
	
	protected abstract int getBuildScopeDataKind(IAstNode selection);
	
	@Override
	public boolean enterGeneral(IAstNode ast, TScope scope) {
		return !fData.pretreatment || fData.target == null;
	}
	
	@Override
	public boolean exitGeneral(IAstNode ast, TScope scope) {
		return false;
	}
}
