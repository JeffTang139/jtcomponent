/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

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
import org.eclipse.jt.sql.assist.core.ast.query.IQueryWaker;
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


/**
 * 默认的查询抽象语法树的简单访问器
 * @author Jeff Tang
 *
 */
public class QueryWalker extends GeneralWalker implements IQueryWaker {

	public QueryWalker() {
		super(null);
	}
	
	public QueryWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterDerivedColumn(org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn)
	 */
	public boolean enterDerivedColumn(DerivedColumn ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterFromStatement(org.eclipse.jt.sql.assist.core.ast.query.FromStatement)
	 */
	public boolean enterFromStatement(FromStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterGroupColumn(org.eclipse.jt.sql.assist.core.ast.query.GroupColumn)
	 */
	public boolean enterGroupColumn(GroupColumn ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterGroupStatement(org.eclipse.jt.sql.assist.core.ast.query.GroupStatement)
	 */
	public boolean enterGroupStatement(GroupStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterHavingStatement(org.eclipse.jt.sql.assist.core.ast.query.HavingStatement)
	 */
	public boolean enterHavingStatement(HavingStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterOrderExpression(org.eclipse.jt.sql.assist.core.ast.query.OrderExpression)
	 */
	public boolean enterOrderExpression(OrderExpression ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterOrderStatement(org.eclipse.jt.sql.assist.core.ast.query.OrderStatement)
	 */
	public boolean enterOrderStatement(OrderStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterQueryDeclaration(org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration)
	 */
	public boolean enterQueryDeclaration(QueryDeclaration ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.QueryStatement)
	 */
	public boolean enterQueryStatement(QueryStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterSelectStatement(org.eclipse.jt.sql.assist.core.ast.query.SelectStatement)
	 */
	public boolean enterSelectStatement(SelectStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterSubQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement)
	 */
	public boolean enterSubQueryStatement(SubQueryStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterTableJoinStatement(org.eclipse.jt.sql.assist.core.ast.query.TableJoinStatement)
	 */
	public boolean enterTableJoinStatement(TableJoinStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterTableReference(org.eclipse.jt.sql.assist.core.ast.query.TableReference)
	 */
	public boolean enterTableReference(TableReference ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterTableReferenceStatement(org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement)
	 */
	public boolean enterTableReferenceStatement(TableReferenceStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterTableRelation(org.eclipse.jt.sql.assist.core.ast.query.TableRelation)
	 */
	public boolean enterTableRelation(TableRelation ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterTableRelationStatement(org.eclipse.jt.sql.assist.core.ast.query.TableRelationStatement)
	 */
	public boolean enterTableRelationStatement(TableRelationStatement ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#enterWhereStatement(org.eclipse.jt.sql.assist.core.ast.query.WhereStatement)
	 */
	public boolean enterWhereStatement(WhereStatement ast) {
		
		return internalEnterGeneral(ast);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitDerivedColumn(org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn)
	 */
	public boolean exitDerivedColumn(DerivedColumn ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitFromStatement(org.eclipse.jt.sql.assist.core.ast.query.FromStatement)
	 */
	public boolean exitFromStatement(FromStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitGroupColumn(org.eclipse.jt.sql.assist.core.ast.query.GroupColumn)
	 */
	public boolean exitGroupColumn(GroupColumn ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitGroupStatement(org.eclipse.jt.sql.assist.core.ast.query.GroupStatement)
	 */
	public boolean exitGroupStatement(GroupStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitHavingStatement(org.eclipse.jt.sql.assist.core.ast.query.HavingStatement)
	 */
	public boolean exitHavingStatement(HavingStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitOrderExpression(org.eclipse.jt.sql.assist.core.ast.query.OrderExpression)
	 */
	public boolean exitOrderExpression(OrderExpression ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitOrderStatement(org.eclipse.jt.sql.assist.core.ast.query.OrderStatement)
	 */
	public boolean exitOrderStatement(OrderStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitQueryDeclaration(org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration)
	 */
	public boolean exitQueryDeclaration(QueryDeclaration ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.QueryStatement)
	 */
	public boolean exitQueryStatement(QueryStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitSelectStatement(org.eclipse.jt.sql.assist.core.ast.query.SelectStatement)
	 */
	public boolean exitSelectStatement(SelectStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitSubQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement)
	 */
	public boolean exitSubQueryStatement(SubQueryStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitTableJoinStatement(org.eclipse.jt.sql.assist.core.ast.query.TableJoinStatement)
	 */
	public boolean exitTableJoinStatement(TableJoinStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitTableReference(org.eclipse.jt.sql.assist.core.ast.query.TableReference)
	 */
	public boolean exitTableReference(TableReference ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitTableReferenceStatement(org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement)
	 */
	public boolean exitTableReferenceStatement(TableReferenceStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitTableRelation(org.eclipse.jt.sql.assist.core.ast.query.TableRelation)
	 */
	public boolean exitTableRelation(TableRelation ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitTableRelationStatement(org.eclipse.jt.sql.assist.core.ast.query.TableRelationStatement)
	 */
	public boolean exitTableRelationStatement(TableRelationStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstWalker#exitWhereStatement(org.eclipse.jt.sql.assist.core.ast.query.WhereStatement)
	 */
	public boolean exitWhereStatement(WhereStatement ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionWalker#enterHierarchyPredicate(org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate)
	 */
	public boolean enterHierarchyPredicate(HierarchyPredicate ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionWalker#exitHierarchyPredicate(org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate)
	 */
	public boolean exitHierarchyPredicate(HierarchyPredicate ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#enterColumnCallExpression(org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression)
	 */
	public boolean enterColumnCallExpression(ColumnCallExpression ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#enterColumnReference(org.eclipse.jt.sql.assist.core.ast.query.ColumnReference)
	 */
	public boolean enterColumnReference(ColumnReference ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#enterHierarchyFunCallExpression(org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression)
	 */
	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast) {
		
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#exitColumnCallExpression(org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression)
	 */
	public boolean exitColumnCallExpression(ColumnCallExpression ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#exitColumnReference(org.eclipse.jt.sql.assist.core.ast.query.ColumnReference)
	 */
	public boolean exitColumnReference(ColumnReference ast) {
		
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker#exitHierarchyFunCallExpression(org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression)
	 */
	public boolean exitHierarchyFunCallExpression(HierarchyFunCallExpression ast) {
		
		return internalExitGeneral(ast);
	}

	public boolean enterWithStatement(WithStatement ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitWithStatement(WithStatement ast) {
		return internalExitGeneral(ast);
	}

	public boolean enterValueQueryExpression(ValueQueryExpression ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast) {
		return internalExitGeneral(ast);
	}

	public boolean enterSubQueryReference(SubQueryReference ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitSubQueryReference(SubQueryReference ast) {
		return internalExitGeneral(ast);
	}

	public boolean enterExistsPredicate(ExistsPredicate ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast) {
		return internalExitGeneral(ast);
	}

	public boolean enterUnionStatement(UnionStatement ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitUnionStatement(UnionStatement ast) {
		return internalExitGeneral(ast);
	}
}
