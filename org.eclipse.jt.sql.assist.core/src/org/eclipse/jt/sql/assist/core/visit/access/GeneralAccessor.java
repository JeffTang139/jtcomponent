/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;



/**
 * @author Jeff Tang
 *
 */
public class GeneralAccessor<TScope extends AbstractGeneralDataScope<TScope>> 
		extends AbstractAstAccessor<TScope> 
		implements IGeneralAccessor<TScope> {
	
	public GeneralAccessor() {
		super();
	}
	

	public GeneralAccessor(IAstAccessor<TScope> baseAccessor) {
		super(baseAccessor);
	}
	
	

	public boolean enterArgumentDeclaration(ArgumentDeclaration ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterArgumentReference(ArgumentReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterCaseExpression(CaseExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterClassReference(ClassReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterConstantExpression(ConstantExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterNullExpression(NullExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterTableRefReference(TableRefReference ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitArgumentReference(ArgumentReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitCaseExpression(CaseExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitClassReference(ClassReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitConstantExpression(ConstantExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitNullExpression(NullExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitTableRefReference(TableRefReference ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

}
