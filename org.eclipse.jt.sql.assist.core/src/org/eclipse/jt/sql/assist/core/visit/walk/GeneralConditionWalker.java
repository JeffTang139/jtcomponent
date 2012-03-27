/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralConditionWalker;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;


/**
 * 默认的普通条件表达式的简单访问器
 * @author Jeff Tang
 *
 */
public class GeneralConditionWalker extends AbstractAstWalker implements
		IGeneralConditionWalker {

	public GeneralConditionWalker() {
		this(null);
	}
	
	public GeneralConditionWalker(IAstWalker baseWalker) {
		super(baseWalker);
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

}
