/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnReference;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryValueWalker;
import org.eclipse.jt.sql.assist.core.ast.query.ValueQueryExpression;


/**
 * 默认的查询值表达式的简单访问器
 * @author Jeff Tang
 *
 */
public class QueryValueWalker extends AbstractAstWalker implements
		IQueryValueWalker {

	public QueryValueWalker() {
		this(null);
	}
	
	public QueryValueWalker(IAstWalker baseWalker) {
		super(baseWalker);
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

	public boolean enterValueQueryExpression(ValueQueryExpression ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast) {
		return internalExitGeneral(ast);
	}

}
