/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryAstNode extends IAstNode {
	public <TResult, TData> TResult accept(IQueryAstVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
