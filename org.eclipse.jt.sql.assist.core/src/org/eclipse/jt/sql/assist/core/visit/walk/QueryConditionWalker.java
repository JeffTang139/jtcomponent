/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.query.ExistsPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionWalker;


/**
 * 默认的查询条件表达式的简单访问器
 * @author Jeff Tang
 *
 */
public class QueryConditionWalker extends AbstractAstWalker implements
		IQueryConditionWalker {

	public QueryConditionWalker() {
		this(null);
	}
	
	public QueryConditionWalker(IAstWalker baseWalker) {
		super(baseWalker);
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

	public boolean enterExistsPredicate(ExistsPredicate ast) {
		return internalEnterGeneral(ast);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast) {
		return internalExitGeneral(ast);
	}

}
