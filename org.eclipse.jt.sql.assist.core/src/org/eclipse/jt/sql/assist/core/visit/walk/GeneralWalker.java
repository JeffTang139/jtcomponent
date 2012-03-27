/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralWalker;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;



/**
 * 默认的普通抽象语法树的简单访问器
 * @author Jeff Tang
 *
 */
public class GeneralWalker extends AbstractAstWalker implements IGeneralWalker {

	public GeneralWalker() {
		super(null);
	}
	
	public GeneralWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterArgumentDeclaration(org.eclipse.jt.sql.assist.core.ast.ArgumentDeclaration)
	 */
	public boolean enterArgumentDeclaration(ArgumentDeclaration ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterDataTypeReference(org.eclipse.jt.sql.assist.core.ast.DataTypeReference)
	 */
	public boolean enterDataTypeReference(DataTypeReference ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterTableRefReference(org.eclipse.jt.sql.assist.core.ast.TableRefReference)
	 */
	public boolean enterTableRefReference(TableRefReference ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitArgumentDeclaration(org.eclipse.jt.sql.assist.core.ast.ArgumentDeclaration)
	 */
	public boolean exitArgumentDeclaration(ArgumentDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitDataTypeReference(org.eclipse.jt.sql.assist.core.ast.DataTypeReference)
	 */
	public boolean exitDataTypeReference(DataTypeReference ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitTableRefReference(org.eclipse.jt.sql.assist.core.ast.TableRefReference)
	 */
	public boolean exitTableRefReference(TableRefReference ast) {
		return internalExitGeneral(ast);
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#enterLogicalPredicate(org.eclipse.jt.sql.assist.core.ast.LogicalPredicate)
	 */
	public boolean enterLogicalPredicate(LogicalPredicate ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#enterParenConditionExpression(org.eclipse.jt.sql.assist.core.ast.ParenConditionExpression)
	 */
	public boolean enterParenConditionExpression(ParenConditionExpression ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#enterRelationPredicate(org.eclipse.jt.sql.assist.core.ast.RelationPredicate)
	 */
	public boolean enterRelationPredicate(RelationPredicate ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#exitLogicalPredicate(org.eclipse.jt.sql.assist.core.ast.LogicalPredicate)
	 */
	public boolean exitLogicalPredicate(LogicalPredicate ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#exitParenConditionExpression(org.eclipse.jt.sql.assist.core.ast.ParenConditionExpression)
	 */
	public boolean exitParenConditionExpression(ParenConditionExpression ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralConditionWalker#exitRelationPredicate(org.eclipse.jt.sql.assist.core.ast.RelationPredicate)
	 */
	public boolean exitRelationPredicate(RelationPredicate ast) {
		return internalExitGeneral(ast);
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

	public boolean enterClassReference(ClassReference ast) {
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

	public boolean exitClassReference(ClassReference ast) {
		return internalExitGeneral(ast);
	}

}
