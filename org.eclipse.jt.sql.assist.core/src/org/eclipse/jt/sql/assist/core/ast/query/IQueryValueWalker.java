/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryValueWalker extends IAstWalker {

	public boolean enterColumnCallExpression(ColumnCallExpression ast);
	public boolean enterColumnReference(ColumnReference ast);
	public boolean enterHierarchyFunCallExpression(HierarchyFunCallExpression ast);
	public boolean enterValueQueryExpression(ValueQueryExpression ast);
	
	public boolean exitColumnCallExpression(ColumnCallExpression ast);
	public boolean exitColumnReference(ColumnReference ast);
	public boolean exitHierarchyFunCallExpression(HierarchyFunCallExpression ast);
	public boolean exitValueQueryExpression(ValueQueryExpression ast);
	
}
