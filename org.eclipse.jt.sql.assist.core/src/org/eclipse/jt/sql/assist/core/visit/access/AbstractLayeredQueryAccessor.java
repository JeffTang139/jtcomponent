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
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractLayeredQueryAccessor<TScope extends AbstractQueryDataScope<TScope>> 
		extends AbstractLayeredGeneralAccessor<TScope> 
		implements IQueryAccessor<TScope> {
	
	private IGeneralAccessor<TScope> fGeneralAccessor;

	public AbstractLayeredQueryAccessor(IAstAccessor<TScope> superAccessor) {
		super(superAccessor);
	}

	public AbstractLayeredQueryAccessor(IAstAccessor<TScope> superAccessor, IAstAccessor<TScope> baseAccessor) {
		super(superAccessor, baseAccessor);
	}
	
	
	@Override
	protected void setSuperLayerAccessor(IAstAccessor<TScope> superAccessor) {
		super.setSuperLayerAccessor(superAccessor);
		if(this!=superAccessor && (superAccessor instanceof IGeneralAccessor<?>)) {
			fGeneralAccessor = (IGeneralAccessor<TScope>)superAccessor;
		} else {
			throw new IllegalArgumentException("base accessor of LayeredQueryAccessor must be a instance of implement of IGeneralAccessor.");
		}
		
	}

	public boolean enterArgumentDeclaration(ArgumentDeclaration ast,
			TScope scope) {
		return fGeneralAccessor.enterArgumentDeclaration(ast, scope);
	}

	public boolean enterArgumentReference(ArgumentReference ast, TScope scope) {
		return fGeneralAccessor.enterArgumentReference(ast, scope);
	}

	public boolean enterCaseExpression(CaseExpression ast, TScope scope) {
		return fGeneralAccessor.enterCaseExpression(ast, scope);
	}

	public boolean enterClassReference(ClassReference ast, TScope scope) {
		return fGeneralAccessor.enterClassReference(ast, scope);
	}

	public boolean enterConstantExpression(ConstantExpression ast, TScope scope) {
		return fGeneralAccessor.enterConstantExpression(ast, scope);
	}

	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope) {
		return fGeneralAccessor.enterDataTypeReference(ast, scope);
	}

	public boolean enterFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return fGeneralAccessor.enterFunctionCallExpression(ast, scope);
	}

	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return fGeneralAccessor.enterLogicalPredicate(ast, scope);
	}

	public boolean enterNullExpression(NullExpression ast, TScope scope) {
		return fGeneralAccessor.enterNullExpression(ast, scope);
	}

	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope) {
		return fGeneralAccessor.enterOperatorExpression(ast, scope);
	}

	public boolean enterParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return fGeneralAccessor.enterParenConditionExpression(ast, scope);
	}

	public boolean enterParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return fGeneralAccessor.enterParenValueExpression(ast, scope);
	}

	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope) {
		return fGeneralAccessor.enterRelationPredicate(ast, scope);
	}

	public boolean enterTableRefReference(TableRefReference ast, TScope scope) {
		return fGeneralAccessor.enterTableRefReference(ast, scope);
	}

	public boolean exitArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		return fGeneralAccessor.exitArgumentDeclaration(ast, scope);
	}

	public boolean exitArgumentReference(ArgumentReference ast, TScope scope) {
		return fGeneralAccessor.exitArgumentReference(ast, scope);
	}

	public boolean exitCaseExpression(CaseExpression ast, TScope scope) {
		return fGeneralAccessor.exitCaseExpression(ast, scope);
	}

	public boolean exitClassReference(ClassReference ast, TScope scope) {
		return fGeneralAccessor.exitClassReference(ast, scope);
	}

	public boolean exitConstantExpression(ConstantExpression ast, TScope scope) {
		return fGeneralAccessor.exitConstantExpression(ast, scope);
	}

	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope) {
		return fGeneralAccessor.exitDataTypeReference(ast, scope);
	}

	public boolean exitFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return fGeneralAccessor.exitFunctionCallExpression(ast, scope);
	}

	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return fGeneralAccessor.exitLogicalPredicate(ast, scope);
	}

	public boolean exitNullExpression(NullExpression ast, TScope scope) {
		return fGeneralAccessor.exitNullExpression(ast, scope);
	}

	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope) {
		return fGeneralAccessor.exitOperatorExpression(ast, scope);
	}

	public boolean exitParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return fGeneralAccessor.exitParenConditionExpression(ast, scope);
	}

	public boolean exitParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return fGeneralAccessor.exitParenValueExpression(ast, scope);
	}

	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope) {
		return fGeneralAccessor.exitRelationPredicate(ast, scope);
	}

	public boolean exitTableRefReference(TableRefReference ast, TScope scope) {
		return fGeneralAccessor.exitTableRefReference(ast, scope);
	}
	

}
