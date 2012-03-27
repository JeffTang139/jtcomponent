/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralValueVisitor<TResult,TData> extends IAstVisitor {
	public TResult visitArgumentReference(ArgumentReference ast, TData data) throws Throwable;
	public TResult visitCaseExpression(CaseExpression ast, TData data) throws Throwable;
	public TResult visitConstantExpression(ConstantExpression ast, TData data) throws Throwable;
	public TResult visitFunctionCallExpression(FunctionCallExpression ast, TData data) throws Throwable;
	public TResult visitNullExpression(NullExpression ast, TData data) throws Throwable;
	public TResult visitOperatorExpression(OperatorExpression ast, TData data) throws Throwable;
	public TResult visitParenValueExpression(ParenValueExpression ast, TData data) throws Throwable;
}
