/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstVisitor;
/**
 * @author Jeff Tang
 *
 */
public interface IQueryAstVisitor<TResult,TData> extends IAstVisitor {

	public TResult visitDerivedColumn(DerivedColumn ast, TData data) throws Throwable;
	public TResult visitSelectStatement(SelectStatement ast, TData data) throws Throwable;
	public TResult visitFromStatement(FromStatement ast, TData data) throws Throwable;
	public TResult visitGroupColumn(GroupColumn ast, TData data) throws Throwable;
	public TResult visitGroupStatement(GroupStatement ast, TData data) throws Throwable;
	public TResult visitHavingStatement(HavingStatement ast, TData data) throws Throwable;
	public TResult visitOrderExpression(OrderExpression ast, TData data) throws Throwable;
	public TResult visitOrderStatement(OrderStatement ast, TData data) throws Throwable;
	public TResult visitQueryDeclaration(QueryDeclaration ast, TData data) throws Throwable;
	public TResult visitSubQueryStatement(SubQueryStatement ast, TData data) throws Throwable;
	public TResult visitQueryStatement(QueryStatement ast, TData data) throws Throwable;
	public TResult visitUnionStatement(UnionStatement ast, TData data) throws Throwable;
	public TResult visitTableJoinStatement(TableJoinStatement ast, TData data) throws Throwable;
	public TResult visitTableReference(TableReference ast, TData data) throws Throwable;
	public TResult visitTableReferenceStatement(TableReferenceStatement ast, TData data) throws Throwable;
	public TResult visitTableRelation(TableRelation ast, TData data) throws Throwable;
	public TResult visitTableRelationStatement(TableRelationStatement ast, TData data) throws Throwable;
	public TResult visitSubQueryReference(SubQueryReference ast, TData data) throws Throwable;
	public TResult visitWhereStatement(WhereStatement ast, TData data) throws Throwable;
	public TResult visitWithStatement(WithStatement ast, TData data) throws Throwable;
}
