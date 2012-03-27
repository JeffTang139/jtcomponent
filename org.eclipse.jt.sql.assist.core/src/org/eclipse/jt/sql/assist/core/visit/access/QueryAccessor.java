/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnReference;
import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.ast.query.ExistsPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.FromStatement;
import org.eclipse.jt.sql.assist.core.ast.query.GroupColumn;
import org.eclipse.jt.sql.assist.core.ast.query.GroupStatement;
import org.eclipse.jt.sql.assist.core.ast.query.HavingStatement;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAccessor;
import org.eclipse.jt.sql.assist.core.ast.query.OrderExpression;
import org.eclipse.jt.sql.assist.core.ast.query.OrderStatement;
import org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.SelectStatement;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryReference;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableJoinStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableReference;
import org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableRelation;
import org.eclipse.jt.sql.assist.core.ast.query.TableRelationStatement;
import org.eclipse.jt.sql.assist.core.ast.query.UnionStatement;
import org.eclipse.jt.sql.assist.core.ast.query.ValueQueryExpression;
import org.eclipse.jt.sql.assist.core.ast.query.WhereStatement;
import org.eclipse.jt.sql.assist.core.ast.query.WithStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;


/**
 * @author Jeff Tang
 *
 */
public class QueryAccessor<TScope extends AbstractQueryDataScope<TScope>> extends GeneralAccessor<TScope> implements
		IQueryAccessor<TScope> {
	
	public QueryAccessor() {
		super();
	}

	public QueryAccessor(IAstAccessor<TScope> baseAccessor) {
		super(baseAccessor);
	}

	public boolean enterColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterColumnReference(ColumnReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterFromStatement(FromStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterGroupColumn(GroupColumn ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterGroupStatement(GroupStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterHavingStatement(HavingStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterOrderExpression(OrderExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterOrderStatement(OrderStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterQueryStatement(QueryStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterSelectStatement(SelectStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableReference(TableReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableRelation(TableRelation ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterWhereStatement(WhereStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitColumnReference(ColumnReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitFromStatement(FromStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitGroupColumn(GroupColumn ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitGroupStatement(GroupStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitHavingStatement(HavingStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitOrderExpression(OrderExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitOrderStatement(OrderStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitQueryStatement(QueryStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitSelectStatement(SelectStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableReference(TableReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableRelation(TableRelation ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitWhereStatement(WhereStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean enterValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterWithStatement(WithStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitWithStatement(WithStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean enterUnionStatement(UnionStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitUnionStatement(UnionStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

}
