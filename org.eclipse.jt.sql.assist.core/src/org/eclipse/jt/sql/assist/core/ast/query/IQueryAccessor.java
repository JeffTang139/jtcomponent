/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;


/**
 * @author Jeff Tang
 *
 */
public interface IQueryAccessor<TScope extends AbstractQueryDataScope<TScope>> extends IAstAccessor<TScope> {

	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope);
	public boolean enterSelectStatement(SelectStatement ast, TScope scope);
	public boolean enterFromStatement(FromStatement ast, TScope scope);
	public boolean enterGroupColumn(GroupColumn ast, TScope scope);
	public boolean enterGroupStatement(GroupStatement ast, TScope scope);
	public boolean enterHavingStatement(HavingStatement ast, TScope scope);
	public boolean enterOrderExpression(OrderExpression ast, TScope scope);
	public boolean enterOrderStatement(OrderStatement ast, TScope scope);
	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope);
	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope);
	public boolean enterQueryStatement(QueryStatement ast, TScope scope);
	public boolean enterUnionStatement(UnionStatement ast, TScope scope);
	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope);
	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope);
	public boolean enterTableReference(TableReference ast, TScope scope);
	public boolean enterTableReferenceStatement(TableReferenceStatement ast, TScope scope);
	public boolean enterTableRelation(TableRelation ast, TScope scope);
	public boolean enterTableRelationStatement(TableRelationStatement ast, TScope scope);
	public boolean enterWhereStatement(WhereStatement ast, TScope scope);
	public boolean enterWithStatement(WithStatement ast, TScope scope);

	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope);
	public boolean exitSelectStatement(SelectStatement ast, TScope scope);
	public boolean exitFromStatement(FromStatement ast, TScope scope);
	public boolean exitGroupColumn(GroupColumn ast, TScope scope);
	public boolean exitGroupStatement(GroupStatement ast, TScope scope);
	public boolean exitHavingStatement(HavingStatement ast, TScope scope);
	public boolean exitOrderExpression(OrderExpression ast, TScope scope);
	public boolean exitOrderStatement(OrderStatement ast, TScope scope);
	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope);
	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope);
	public boolean exitQueryStatement(QueryStatement ast, TScope scope);
	public boolean exitUnionStatement(UnionStatement ast, TScope scope);
	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope);
	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope);
	public boolean exitTableReference(TableReference ast, TScope scope);
	public boolean exitTableReferenceStatement(TableReferenceStatement ast, TScope scope);
	public boolean exitTableRelation(TableRelation ast, TScope scope);
	public boolean exitTableRelationStatement(TableRelationStatement ast, TScope scope);
	public boolean exitWhereStatement(WhereStatement ast, TScope scope);
	public boolean exitWithStatement(WithStatement ast, TScope scope);
	
	
	

	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope);
	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope);
	
	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope);
	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope);
	
	

	public boolean enterColumnCallExpression(ColumnCallExpression ast, TScope scope);
	public boolean enterColumnReference(ColumnReference ast, TScope scope);
	public boolean enterHierarchyFunCallExpression(HierarchyFunCallExpression ast, TScope scope);
	public boolean enterValueQueryExpression(ValueQueryExpression ast, TScope scope);
	
	public boolean exitColumnCallExpression(ColumnCallExpression ast, TScope scope);
	public boolean exitColumnReference(ColumnReference ast, TScope scope);
	public boolean exitHierarchyFunCallExpression(HierarchyFunCallExpression ast, TScope scope);
	public boolean exitValueQueryExpression(ValueQueryExpression ast, TScope scope);
} 
