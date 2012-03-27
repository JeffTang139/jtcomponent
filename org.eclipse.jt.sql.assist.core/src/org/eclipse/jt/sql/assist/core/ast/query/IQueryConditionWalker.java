/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryConditionWalker extends IAstWalker {

	public boolean enterHierarchyPredicate(HierarchyPredicate ast);
	public boolean exitHierarchyPredicate(HierarchyPredicate ast);
	
	public boolean enterExistsPredicate(ExistsPredicate ast);
	public boolean exitExistsPredicate(ExistsPredicate ast);
}
