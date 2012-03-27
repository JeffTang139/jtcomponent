/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class SelectionTargetData<TScope extends IDataScope<TScope>> {

	public final IAstNode ast;
	public final TScope scope;
	public final ISourcePosition position;
	
	public SelectionTargetData(IAstNode ast, TScope scope, ISourcePosition position) {
		this.ast=ast;
		this.scope=scope;
		this.position=position;
	}
	
	public SelectionTargetData(IAstNode ast, TScope scope) {
		this(ast,scope,null);
	}

}
