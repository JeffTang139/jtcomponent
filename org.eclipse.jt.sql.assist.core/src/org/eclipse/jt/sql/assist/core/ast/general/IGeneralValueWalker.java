/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralValueWalker extends IAstWalker {
	
	public boolean enterArgumentReference(ArgumentReference ast);
	public boolean enterCaseExpression(CaseExpression ast);
	public boolean enterConstantExpression(ConstantExpression ast);
	public boolean enterFunctionCallExpression(FunctionCallExpression ast);
	public boolean enterNullExpression(NullExpression ast);
	public boolean enterOperatorExpression(OperatorExpression ast);
	public boolean enterParenValueExpression(ParenValueExpression ast);

	public boolean exitArgumentReference(ArgumentReference ast);
	public boolean exitCaseExpression(CaseExpression ast);
	public boolean exitConstantExpression(ConstantExpression ast);
	public boolean exitFunctionCallExpression(FunctionCallExpression ast);
	public boolean exitNullExpression(NullExpression ast);
	public boolean exitOperatorExpression(OperatorExpression ast);
	public boolean exitParenValueExpression(ParenValueExpression ast);
}
