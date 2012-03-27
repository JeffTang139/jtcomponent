/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralConditionVisitor<TResult,TData> extends IAstVisitor {
	public TResult visitParenConditionExpression(ParenConditionExpression ast, TData data) throws Throwable;
	public TResult visitLogicalPredicate(LogicalPredicate ast, TData data) throws Throwable;
	public TResult visitRelationPredicate(RelationPredicate ast, TData data) throws Throwable;
}
