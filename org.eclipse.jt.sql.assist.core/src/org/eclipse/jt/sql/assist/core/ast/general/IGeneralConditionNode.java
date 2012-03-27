/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralConditionNode extends IAstNode {
	public <TResult, TData> TResult accept(IGeneralConditionVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
