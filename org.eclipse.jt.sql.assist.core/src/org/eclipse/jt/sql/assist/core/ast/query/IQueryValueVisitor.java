/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryValueVisitor<TResult,TData> extends IAstVisitor {

	public TResult visitColumnCallExpression(ColumnCallExpression ast, TData data) throws Throwable;
	public TResult visitColumnReference(ColumnReference ast, TData data) throws Throwable;
	public TResult visitValueQueryExpression(ValueQueryExpression ast, TData data) throws Throwable;
	public TResult visitHierarchyFunCallExpression(HierarchyFunCallExpression ast, TData data) throws Throwable;
}
