/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
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
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractLayeredMappingAccessor<TScope extends AbstractMappingDataScope<TScope>> 
			extends AbstractLayeredQueryAccessor<TScope> 
			implements IMappingAccessor<TScope> {
	
	private IQueryAccessor<TScope> fQueryAccessor;

	public AbstractLayeredMappingAccessor(IAstAccessor<TScope> superAccessor) {
		super(superAccessor);
	}
	
	public AbstractLayeredMappingAccessor(IAstAccessor<TScope> superAccessor, IAstAccessor<TScope> baseAccessor) {
		super(superAccessor, baseAccessor);
	}
	
	@Override
	protected void setSuperLayerAccessor(IAstAccessor<TScope> superAccessor) {
		super.setSuperLayerAccessor(superAccessor);
		if(this!=superAccessor && (superAccessor instanceof IQueryAccessor<?>)) {
			fQueryAccessor = (IQueryAccessor<TScope>)superAccessor;
		} else {
			throw new IllegalArgumentException("base accessor of LayeredMappingAccessor must be a instance of implement of IQueryAccessor.");
		}
	}

	public boolean enterColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return fQueryAccessor.enterColumnCallExpression(ast, scope);
	}


	public boolean enterColumnReference(ColumnReference ast, TScope scope) {
		return fQueryAccessor.enterColumnReference(ast, scope);
	}


	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope) {
		return fQueryAccessor.enterDerivedColumn(ast, scope);
	}


	public boolean enterFromStatement(FromStatement ast, TScope scope) {
		return fQueryAccessor.enterFromStatement(ast, scope);
	}


	public boolean enterGroupColumn(GroupColumn ast, TScope scope) {
		return fQueryAccessor.enterGroupColumn(ast, scope);
	}


	public boolean enterGroupStatement(GroupStatement ast, TScope scope) {
		return fQueryAccessor.enterGroupStatement(ast, scope);
	}


	public boolean enterHavingStatement(HavingStatement ast, TScope scope) {
		return fQueryAccessor.enterHavingStatement(ast, scope);
	}


	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return fQueryAccessor.enterHierarchyFunCallExpression(ast, scope);
	}


	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return fQueryAccessor.enterHierarchyPredicate(ast, scope);
	}


	public boolean enterOrderExpression(OrderExpression ast, TScope scope) {
		return fQueryAccessor.enterOrderExpression(ast, scope);
	}


	public boolean enterOrderStatement(OrderStatement ast, TScope scope) {
		return fQueryAccessor.enterOrderStatement(ast, scope);
	}


	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return fQueryAccessor.enterQueryDeclaration(ast, scope);
	}


	public boolean enterQueryStatement(QueryStatement ast, TScope scope) {
		return fQueryAccessor.enterQueryStatement(ast, scope);
	}


	public boolean enterSelectStatement(SelectStatement ast, TScope scope) {
		return fQueryAccessor.enterSelectStatement(ast, scope);
	}


	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return fQueryAccessor.enterSubQueryStatement(ast, scope);
	}


	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return fQueryAccessor.enterTableJoinStatement(ast, scope);
	}


	public boolean enterTableReference(TableReference ast, TScope scope) {
		return fQueryAccessor.enterTableReference(ast, scope);
	}


	public boolean enterTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return fQueryAccessor.enterTableReferenceStatement(ast, scope);
	}


	public boolean enterTableRelation(TableRelation ast, TScope scope) {
		return fQueryAccessor.enterTableRelation(ast, scope);
	}


	public boolean enterTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return fQueryAccessor.enterTableRelationStatement(ast, scope);
	}


	public boolean enterWhereStatement(WhereStatement ast, TScope scope) {
		return fQueryAccessor.enterWhereStatement(ast, scope);
	}


	public boolean exitColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return fQueryAccessor.exitColumnCallExpression(ast, scope);
	}


	public boolean exitColumnReference(ColumnReference ast, TScope scope) {
		return fQueryAccessor.exitColumnReference(ast, scope);
	}


	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		return fQueryAccessor.exitDerivedColumn(ast, scope);
	}


	public boolean exitFromStatement(FromStatement ast, TScope scope) {
		return fQueryAccessor.exitFromStatement(ast, scope);
	}


	public boolean exitGroupColumn(GroupColumn ast, TScope scope) {
		return fQueryAccessor.exitGroupColumn(ast, scope);
	}


	public boolean exitGroupStatement(GroupStatement ast, TScope scope) {
		return fQueryAccessor.exitGroupStatement(ast, scope);
	}


	public boolean exitHavingStatement(HavingStatement ast, TScope scope) {
		return fQueryAccessor.exitHavingStatement(ast, scope);
	}


	public boolean exitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return fQueryAccessor.exitHierarchyFunCallExpression(ast, scope);
	}


	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return fQueryAccessor.exitHierarchyPredicate(ast, scope);
	}


	public boolean exitOrderExpression(OrderExpression ast, TScope scope) {
		return fQueryAccessor.exitOrderExpression(ast, scope);
	}


	public boolean exitOrderStatement(OrderStatement ast, TScope scope) {
		return fQueryAccessor.exitOrderStatement(ast, scope);
	}


	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return fQueryAccessor.exitQueryDeclaration(ast, scope);
	}


	public boolean exitQueryStatement(QueryStatement ast, TScope scope) {
		return fQueryAccessor.exitQueryStatement(ast, scope);
	}


	public boolean exitSelectStatement(SelectStatement ast, TScope scope) {
		return fQueryAccessor.exitSelectStatement(ast, scope);
	}


	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return fQueryAccessor.exitSubQueryStatement(ast, scope);
	}


	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return fQueryAccessor.exitTableJoinStatement(ast, scope);
	}


	public boolean exitTableReference(TableReference ast, TScope scope) {
		return fQueryAccessor.exitTableReference(ast, scope);
	}


	public boolean exitTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return fQueryAccessor.exitTableReferenceStatement(ast, scope);
	}


	public boolean exitTableRelation(TableRelation ast, TScope scope) {
		return fQueryAccessor.exitTableRelation(ast, scope);
	}


	public boolean exitTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return fQueryAccessor.exitTableRelationStatement(ast, scope);
	}


	public boolean exitWhereStatement(WhereStatement ast, TScope scope) {
		return fQueryAccessor.exitWhereStatement(ast, scope);
	}



	public boolean enterValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return fQueryAccessor.enterValueQueryExpression(ast, scope);
	}

	public boolean enterWithStatement(WithStatement ast, TScope scope) {
		return fQueryAccessor.enterWithStatement(ast, scope);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return fQueryAccessor.exitValueQueryExpression(ast, scope);
	}

	public boolean exitWithStatement(WithStatement ast, TScope scope) {
		return fQueryAccessor.exitWithStatement(ast, scope);
	}

	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope) {
		return fQueryAccessor.enterSubQueryReference(ast, scope);
	}

	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope) {
		return fQueryAccessor.exitSubQueryReference(ast, scope);
	}

	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope) {
		return fQueryAccessor.enterExistsPredicate(ast, scope);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope) {
		return fQueryAccessor.exitExistsPredicate(ast, scope);
	}
	
	public boolean enterUnionStatement(UnionStatement ast, TScope scope) {
		return fQueryAccessor.enterUnionStatement(ast, scope);
	}

	public boolean exitUnionStatement(UnionStatement ast, TScope scope) {
		return fQueryAccessor.exitUnionStatement(ast, scope);
	}
	
}
