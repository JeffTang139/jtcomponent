/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;


/**
 * @author Jeff Tang
 * 
 */
public interface IGeneralAccessor<TScope extends AbstractGeneralDataScope<TScope>> extends IAstAccessor<TScope> {
	
	public boolean enterArgumentDeclaration(ArgumentDeclaration ast, TScope scope);
	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope);
	public boolean enterTableRefReference(TableRefReference ast, TScope scope);
	public boolean enterClassReference(ClassReference ast, TScope scope);
	
	public boolean exitArgumentDeclaration(ArgumentDeclaration ast, TScope scope);
	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope);
	public boolean exitTableRefReference(TableRefReference ast, TScope scope);
	public boolean exitClassReference(ClassReference ast, TScope scope);
	
	

	public boolean enterParenConditionExpression(ParenConditionExpression ast, TScope scope);
	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope);
	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope);
	
	public boolean exitParenConditionExpression(ParenConditionExpression ast, TScope scope);
	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope);
	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope);
	
	

	public boolean enterArgumentReference(ArgumentReference ast, TScope scope);
	public boolean enterCaseExpression(CaseExpression ast, TScope scope);
	public boolean enterConstantExpression(ConstantExpression ast, TScope scope);
	public boolean enterFunctionCallExpression(FunctionCallExpression ast, TScope scope);
	public boolean enterNullExpression(NullExpression ast, TScope scope);
	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope);
	public boolean enterParenValueExpression(ParenValueExpression ast, TScope scope);

	public boolean exitArgumentReference(ArgumentReference ast, TScope scope);
	public boolean exitCaseExpression(CaseExpression ast, TScope scope);
	public boolean exitConstantExpression(ConstantExpression ast, TScope scope);
	public boolean exitFunctionCallExpression(FunctionCallExpression ast, TScope scope);
	public boolean exitNullExpression(NullExpression ast, TScope scope);
	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope);
	public boolean exitParenValueExpression(ParenValueExpression ast, TScope scope);
} 
