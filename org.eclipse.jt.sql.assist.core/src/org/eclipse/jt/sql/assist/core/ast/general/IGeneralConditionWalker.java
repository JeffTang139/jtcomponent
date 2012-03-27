/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralConditionWalker extends IAstWalker {
	
	public boolean enterParenConditionExpression(ParenConditionExpression ast);
	public boolean enterLogicalPredicate(LogicalPredicate ast);
	public boolean enterRelationPredicate(RelationPredicate ast);
	
	public boolean exitParenConditionExpression(ParenConditionExpression ast);
	public boolean exitLogicalPredicate(LogicalPredicate ast);
	public boolean exitRelationPredicate(RelationPredicate ast);
}
