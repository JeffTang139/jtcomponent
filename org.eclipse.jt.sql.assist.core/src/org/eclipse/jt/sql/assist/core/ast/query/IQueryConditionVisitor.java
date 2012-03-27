/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryConditionVisitor<TResult,TData> extends IAstVisitor {

	public TResult visitHierarchyPredicate(HierarchyPredicate ast, TData data) throws Throwable;
	public TResult visitExistsPredicate(ExistsPredicate ast, TData data) throws Throwable;
}
