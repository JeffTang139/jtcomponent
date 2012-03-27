/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralConditionWalker;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralValueWalker;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;
import org.eclipse.jt.sql.assist.core.visit.walk.GeneralAstWalker;
import org.eclipse.jt.sql.assist.core.visit.walk.GeneralConditionWalker;
import org.eclipse.jt.sql.assist.core.visit.walk.GeneralValueWalker;


/**
 * @author Jeff Tang
 *
 */
public class GeneralWalkerAdaptor<TScope extends AbstractGeneralDataScope<TScope>>
		extends BaseWalkerAdaptor<TScope> 
		implements IGeneralAccessor<TScope> {
	
	private IGeneralAstWalker fGeneralAstWalker;
	private IGeneralConditionWalker fGeneralConditionWalker;
	private IGeneralValueWalker fGeneralValueWalker;

	public GeneralWalkerAdaptor(IAstWalker walker) {
		super(walker);
	}
	
	@Override
	public void setWalker(IAstWalker walker) {
		super.setWalker(walker);
		if(walker instanceof IGeneralAstWalker) {
			fGeneralAstWalker=(IGeneralAstWalker) walker;
		} else {
			fGeneralAstWalker=new GeneralAstWalker(walker);
		}
		if(walker instanceof IGeneralConditionWalker) {
			fGeneralConditionWalker=(IGeneralConditionWalker) walker;
		} else {
			fGeneralConditionWalker=new GeneralConditionWalker(walker);
		}
		if(walker instanceof IGeneralValueWalker) {
			fGeneralValueWalker=(IGeneralValueWalker) walker;
		} else {
			fGeneralValueWalker=new GeneralValueWalker(walker);
		}
	}

	public boolean enterArgumentDeclaration(ArgumentDeclaration ast,
			TScope scope) {
		return fGeneralAstWalker.enterArgumentDeclaration(ast);
	}

	public boolean enterArgumentReference(ArgumentReference ast, TScope scope) {
		return fGeneralValueWalker.enterArgumentReference(ast);
	}

	public boolean enterCaseExpression(CaseExpression ast, TScope scope) {
		return fGeneralValueWalker.enterCaseExpression(ast);
	}

	public boolean enterClassReference(ClassReference ast, TScope scope) {
		return fGeneralAstWalker.enterClassReference(ast);
	}

	public boolean enterConstantExpression(ConstantExpression ast, TScope scope) {
		return fGeneralValueWalker.enterConstantExpression(ast);
	}

	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope) {
		return fGeneralAstWalker.enterDataTypeReference(ast);
	}

	public boolean enterFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return fGeneralValueWalker.enterFunctionCallExpression(ast);
	}

	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return fGeneralConditionWalker.enterLogicalPredicate(ast);
	}

	public boolean enterNullExpression(NullExpression ast, TScope scope) {
		return fGeneralValueWalker.enterNullExpression(ast);
	}

	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope) {
		return fGeneralValueWalker.enterOperatorExpression(ast);
	}

	public boolean enterParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return fGeneralConditionWalker.enterParenConditionExpression(ast);
	}

	public boolean enterParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return fGeneralValueWalker.enterParenValueExpression(ast);
	}

	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope) {
		return fGeneralConditionWalker.enterRelationPredicate(ast);
	}

	public boolean enterTableRefReference(TableRefReference ast, TScope scope) {
		return fGeneralAstWalker.enterTableRefReference(ast);
	}

	public boolean exitArgumentDeclaration(ArgumentDeclaration ast,
			TScope scope) {
		return fGeneralAstWalker.exitArgumentDeclaration(ast);
	}

	public boolean exitArgumentReference(ArgumentReference ast, TScope scope) {
		return fGeneralValueWalker.exitArgumentReference(ast);
	}

	public boolean exitCaseExpression(CaseExpression ast, TScope scope) {
		return fGeneralValueWalker.exitCaseExpression(ast);
	}

	public boolean exitClassReference(ClassReference ast, TScope scope) {
		return fGeneralAstWalker.exitClassReference(ast);
	}

	public boolean exitConstantExpression(ConstantExpression ast, TScope scope) {
		return fGeneralValueWalker.exitConstantExpression(ast);
	}

	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope) {
		return fGeneralAstWalker.exitDataTypeReference(ast);
	}

	public boolean exitFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return fGeneralValueWalker.exitFunctionCallExpression(ast);
	}

	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return fGeneralConditionWalker.exitLogicalPredicate(ast);
	}

	public boolean exitNullExpression(NullExpression ast, TScope scope) {
		return fGeneralValueWalker.exitNullExpression(ast);
	}

	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope) {
		return fGeneralValueWalker.exitOperatorExpression(ast);
	}

	public boolean exitParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return fGeneralConditionWalker.exitParenConditionExpression(ast);
	}

	public boolean exitParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return fGeneralValueWalker.exitParenValueExpression(ast);
	}

	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope) {
		return fGeneralConditionWalker.exitRelationPredicate(ast);
	}

	public boolean exitTableRefReference(TableRefReference ast, TScope scope) {
		return fGeneralAstWalker.exitTableRefReference(ast);
	}

}
