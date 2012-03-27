/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralValueWalker;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;


/**
 * 默认的普通值表达式的简单访问器
 * @author Jeff Tang
 *
 */
public class GeneralValueWalker extends AbstractAstWalker implements
		IGeneralValueWalker {

	public GeneralValueWalker() {
		this(null);
	}
	
	public GeneralValueWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterArgumentReference(org.eclipse.jt.sql.assist.core.ast.ArgumentReference)
	 */
	public boolean enterArgumentReference(ArgumentReference ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterCaseExpression(org.eclipse.jt.sql.assist.core.ast.CaseExpression)
	 */
	public boolean enterCaseExpression(CaseExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterConstantExpression(org.eclipse.jt.sql.assist.core.ast.ConstantExpression)
	 */
	public boolean enterConstantExpression(ConstantExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterFunctionCallExpression(org.eclipse.jt.sql.assist.core.ast.FunctionCallExpression)
	 */
	public boolean enterFunctionCallExpression(FunctionCallExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterNullExpression(org.eclipse.jt.sql.assist.core.ast.NullExpression)
	 */
	public boolean enterNullExpression(NullExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterOperatorExpression(org.eclipse.jt.sql.assist.core.ast.OperatorExpression)
	 */
	public boolean enterOperatorExpression(OperatorExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#enterParenValueExpression(org.eclipse.jt.sql.assist.core.ast.ParenValueExpression)
	 */
	public boolean enterParenValueExpression(ParenValueExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitArgumentReference(org.eclipse.jt.sql.assist.core.ast.ArgumentReference)
	 */
	public boolean exitArgumentReference(ArgumentReference ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitCaseExpression(org.eclipse.jt.sql.assist.core.ast.CaseExpression)
	 */
	public boolean exitCaseExpression(CaseExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitConstantExpression(org.eclipse.jt.sql.assist.core.ast.ConstantExpression)
	 */
	public boolean exitConstantExpression(ConstantExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitFunctionCallExpression(org.eclipse.jt.sql.assist.core.ast.FunctionCallExpression)
	 */
	public boolean exitFunctionCallExpression(FunctionCallExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitNullExpression(org.eclipse.jt.sql.assist.core.ast.NullExpression)
	 */
	public boolean exitNullExpression(NullExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitOperatorExpression(org.eclipse.jt.sql.assist.core.ast.OperatorExpression)
	 */
	public boolean exitOperatorExpression(OperatorExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralValueWalker#exitParenValueExpression(org.eclipse.jt.sql.assist.core.ast.ParenValueExpression)
	 */
	public boolean exitParenValueExpression(ParenValueExpression ast) {
		return internalExitGeneral(ast);
	}

}
