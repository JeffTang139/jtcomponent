/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IMappingAstNode extends IAstNode {
	public <TResult, TData> TResult accept(IMappingAstVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
