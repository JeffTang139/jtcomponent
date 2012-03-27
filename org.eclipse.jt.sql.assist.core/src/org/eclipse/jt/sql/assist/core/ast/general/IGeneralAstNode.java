/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralAstNode extends IAstNode {
	public <TResult, TData> TResult accept(IGeneralAstVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
