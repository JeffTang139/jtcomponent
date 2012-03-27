/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstWalker;
/**
 * @author Jeff Tang
 *
 */
public interface IQueryAstWalker extends IAstWalker {

	public boolean enterDerivedColumn(DerivedColumn ast);
	public boolean enterSelectStatement(SelectStatement ast);
	public boolean enterFromStatement(FromStatement ast);
	public boolean enterGroupColumn(GroupColumn ast);
	public boolean enterGroupStatement(GroupStatement ast);
	public boolean enterHavingStatement(HavingStatement ast);
	public boolean enterOrderExpression(OrderExpression ast);
	public boolean enterOrderStatement(OrderStatement ast);
	public boolean enterQueryDeclaration(QueryDeclaration ast);
	public boolean enterSubQueryStatement(SubQueryStatement ast);
	public boolean enterQueryStatement(QueryStatement ast);
	public boolean enterUnionStatement(UnionStatement ast);
	public boolean enterSubQueryReference(SubQueryReference ast);
	public boolean enterTableJoinStatement(TableJoinStatement ast);
	public boolean enterTableReference(TableReference ast);
	public boolean enterTableReferenceStatement(TableReferenceStatement ast);
	public boolean enterTableRelation(TableRelation ast);
	public boolean enterTableRelationStatement(TableRelationStatement ast);
	public boolean enterWhereStatement(WhereStatement ast);
	public boolean enterWithStatement(WithStatement ast);

	public boolean exitDerivedColumn(DerivedColumn ast);
	public boolean exitSelectStatement(SelectStatement ast);
	public boolean exitFromStatement(FromStatement ast);
	public boolean exitGroupColumn(GroupColumn ast);
	public boolean exitGroupStatement(GroupStatement ast);
	public boolean exitHavingStatement(HavingStatement ast);
	public boolean exitOrderExpression(OrderExpression ast);
	public boolean exitOrderStatement(OrderStatement ast);
	public boolean exitQueryDeclaration(QueryDeclaration ast);
	public boolean exitSubQueryStatement(SubQueryStatement ast);
	public boolean exitQueryStatement(QueryStatement ast);
	public boolean exitUnionStatement(UnionStatement ast);
	public boolean exitSubQueryReference(SubQueryReference ast);
	public boolean exitTableJoinStatement(TableJoinStatement ast);
	public boolean exitTableReference(TableReference ast);
	public boolean exitTableReferenceStatement(TableReferenceStatement ast);
	public boolean exitTableRelation(TableRelation ast);
	public boolean exitTableRelationStatement(TableRelationStatement ast);
	public boolean exitWhereStatement(WhereStatement ast);
	public boolean exitWithStatement(WithStatement ast);
}
