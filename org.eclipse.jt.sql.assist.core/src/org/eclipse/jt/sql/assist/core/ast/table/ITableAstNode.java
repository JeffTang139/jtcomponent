/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface ITableAstNode extends IAstNode {

	public <TResult, TData> TResult accept(ITableAstVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
