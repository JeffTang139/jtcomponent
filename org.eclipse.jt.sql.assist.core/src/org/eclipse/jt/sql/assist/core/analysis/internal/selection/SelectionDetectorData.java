/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.analysis.ISelectionMessager;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.process.AbstractMessager;


/**
 * @author Jeff Tang
 *
 */
public class SelectionDetectorData<TScope extends IDataScope<TScope>> extends AbstractMessager<ISelectionMessager<TScope>> {
	public final IDataProvider dataLoader;
	public final IAstNode selection;
	public final ISourcePosition position;
	public final IVisitDriver<TScope> processor;
	public SelectionTargetData<TScope> target;
	public boolean pretreatment;
	
	public SelectionDetectorData(IAstNode selection, ISourcePosition position, IDataProvider dataLoader, ISelectionMessager<TScope> messager, IVisitDriver<TScope> processor) {
		this.dataLoader=dataLoader;
		this.selection=selection;
		this.position=position;
		this.fWarnings=messager;
		this.processor=processor;
	}
	
	public void assit(ISourcePosition position, IAstNode ast, TScope scope) {
		if(this.fWarnings!=null) {
			this.fWarnings.assit(position, ast, scope);
		}
	}
	
	public void assit(ISourcePosition position, SelectionTargetData<TScope> targetData) {
		if(this.fWarnings!=null) {
			this.fWarnings.assit(position, targetData.ast, targetData.scope);
		}
	}

//	public void assit(DataReference<IAstNode, String> ref) {
//		if(this.fWarnings!=null && ref!=null) {
//			this.fWarnings.assit(ref.ast, ref.data);
//		}
//	}
}
