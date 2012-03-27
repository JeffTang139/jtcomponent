/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryConditionNode extends IAstNode {
	public <TResult, TData> TResult accept(IQueryConditionVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
