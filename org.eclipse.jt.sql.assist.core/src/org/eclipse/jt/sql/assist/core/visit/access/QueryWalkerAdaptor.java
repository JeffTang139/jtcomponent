/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstWalker;
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
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionWalker;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker;
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
import org.eclipse.jt.sql.assist.core.visit.walk.QueryAstWalker;
import org.eclipse.jt.sql.assist.core.visit.walk.QueryConditionWalker;
import org.eclipse.jt.sql.assist.core.visit.walk.QueryValueWalker;


/**
 * @author Jeff Tang
 *
 */
public class QueryWalkerAdaptor<TScope extends AbstractQueryDataScope<TScope>>
		extends GeneralWalkerAdaptor<TScope>
		implements IQueryAccessor<TScope> {

	private IQueryAstWalker fQueryAstWalker;
	private IQueryConditionWalker fQueryConditionWalker;
	private IQueryValueWalker fQueryValueWalker;

	public QueryWalkerAdaptor(IAstWalker walker) {
		super(walker);
	}
	
	@Override
	public void setWalker(IAstWalker walker) {
		super.setWalker(walker);
		if(walker instanceof IQueryAstWalker) {
			fQueryAstWalker=(IQueryAstWalker)walker;
		} else {
			fQueryAstWalker =new QueryAstWalker(walker);
		}
		if(walker instanceof IQueryConditionWalker) {
			fQueryConditionWalker=(IQueryConditionWalker)walker;
		} else {
			fQueryConditionWalker =new QueryConditionWalker(walker);
		}
		if(walker instanceof IQueryValueWalker) {
			fQueryValueWalker=(IQueryValueWalker)walker;
		} else {
			fQueryValueWalker =new QueryValueWalker(walker);
		}
	}

	public boolean enterColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return fQueryValueWalker.enterColumnCallExpression(ast);
	}

	public boolean enterColumnReference(ColumnReference ast, TScope scope) {
		return fQueryValueWalker.enterColumnReference(ast);
	}

	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope) {
		return fQueryAstWalker.enterDerivedColumn(ast);
	}

	public boolean enterFromStatement(FromStatement ast, TScope scope) {
		return fQueryAstWalker.enterFromStatement(ast);
	}

	public boolean enterGroupColumn(GroupColumn ast, TScope scope) {
		return fQueryAstWalker.enterGroupColumn(ast);
	}

	public boolean enterGroupStatement(GroupStatement ast, TScope scope) {
		return fQueryAstWalker.enterGroupStatement(ast);
	}

	public boolean enterHavingStatement(HavingStatement ast, TScope scope) {
		return fQueryAstWalker.enterHavingStatement(ast);
	}

	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return fQueryValueWalker.enterHierarchyFunCallExpression(ast);
	}

	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return fQueryConditionWalker.enterHierarchyPredicate(ast);
	}

	public boolean enterOrderExpression(OrderExpression ast, TScope scope) {
		return fQueryAstWalker.enterOrderExpression(ast);
	}

	public boolean enterOrderStatement(OrderStatement ast, TScope scope) {
		return fQueryAstWalker.enterOrderStatement(ast);
	}

	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return fQueryAstWalker.enterQueryDeclaration(ast);
	}

	public boolean enterQueryStatement(QueryStatement ast, TScope scope) {
		return fQueryAstWalker.enterQueryStatement(ast);
	}

	public boolean enterSelectStatement(SelectStatement ast, TScope scope) {
		return fQueryAstWalker.enterSelectStatement(ast);
	}

	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return fQueryAstWalker.enterSubQueryStatement(ast);
	}

	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return fQueryAstWalker.enterTableJoinStatement(ast);
	}

	public boolean enterTableReference(TableReference ast, TScope scope) {
		return fQueryAstWalker.enterTableReference(ast);
	}

	public boolean enterTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return fQueryAstWalker.enterTableReferenceStatement(ast);
	}

	public boolean enterTableRelation(TableRelation ast, TScope scope) {
		return fQueryAstWalker.enterTableRelation(ast);
	}

	public boolean enterTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return fQueryAstWalker.enterTableRelationStatement(ast);
	}

	public boolean enterWhereStatement(WhereStatement ast, TScope scope) {
		return fQueryAstWalker.enterWhereStatement(ast);
	}

	public boolean exitColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return fQueryValueWalker.exitColumnCallExpression(ast);
	}

	public boolean exitColumnReference(ColumnReference ast, TScope scope) {
		return fQueryValueWalker.exitColumnReference(ast);
	}

	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		return fQueryAstWalker.exitDerivedColumn(ast);
	}

	public boolean exitFromStatement(FromStatement ast, TScope scope) {
		return fQueryAstWalker.exitFromStatement(ast);
	}

	public boolean exitGroupColumn(GroupColumn ast, TScope scope) {
		return fQueryAstWalker.exitGroupColumn(ast);
	}

	public boolean exitGroupStatement(GroupStatement ast, TScope scope) {
		return fQueryAstWalker.exitGroupStatement(ast);
	}

	public boolean exitHavingStatement(HavingStatement ast, TScope scope) {
		return fQueryAstWalker.exitHavingStatement(ast);
	}

	public boolean exitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return fQueryValueWalker.exitHierarchyFunCallExpression(ast);
	}

	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return fQueryConditionWalker.exitHierarchyPredicate(ast);
	}

	public boolean exitOrderExpression(OrderExpression ast, TScope scope) {
		return fQueryAstWalker.exitOrderExpression(ast);
	}

	public boolean exitOrderStatement(OrderStatement ast, TScope scope) {
		return fQueryAstWalker.exitOrderStatement(ast);
	}

	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return fQueryAstWalker.exitQueryDeclaration(ast);
	}

	public boolean exitQueryStatement(QueryStatement ast, TScope scope) {
		return fQueryAstWalker.exitQueryStatement(ast);
	}

	public boolean exitSelectStatement(SelectStatement ast, TScope scope) {
		return fQueryAstWalker.exitSelectStatement(ast);
	}

	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return fQueryAstWalker.exitSubQueryStatement(ast);
	}

	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return fQueryAstWalker.exitTableJoinStatement(ast);
	}

	public boolean exitTableReference(TableReference ast, TScope scope) {
		return fQueryAstWalker.exitTableReference(ast);
	}

	public boolean exitTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return fQueryAstWalker.exitTableReferenceStatement(ast);
	}

	public boolean exitTableRelation(TableRelation ast, TScope scope) {
		return fQueryAstWalker.exitTableRelation(ast);
	}

	public boolean exitTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return fQueryAstWalker.exitTableRelationStatement(ast);
	}

	public boolean exitWhereStatement(WhereStatement ast, TScope scope) {
		return fQueryAstWalker.exitWhereStatement(ast);
	}
	


	public boolean enterValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return fQueryValueWalker.enterValueQueryExpression(ast);
	}

	public boolean enterWithStatement(WithStatement ast, TScope scope) {
		return fQueryAstWalker.enterWithStatement(ast);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return fQueryValueWalker.exitValueQueryExpression(ast);
	}

	public boolean exitWithStatement(WithStatement ast, TScope scope) {
		return fQueryAstWalker.exitWithStatement(ast);
	}

	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope) {
		return fQueryAstWalker.enterSubQueryReference(ast);
	}

	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope) {
		return fQueryAstWalker.exitSubQueryReference(ast);
	}

	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope) {
		return fQueryConditionWalker.enterExistsPredicate(ast);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope) {
		return fQueryConditionWalker.exitExistsPredicate(ast);
	}

	public boolean enterUnionStatement(UnionStatement ast, TScope scope) {
		return fQueryAstWalker.enterUnionStatement(ast);
	}

	public boolean exitUnionStatement(UnionStatement ast, TScope scope) {
		return fQueryAstWalker.exitUnionStatement(ast);
	}
}
