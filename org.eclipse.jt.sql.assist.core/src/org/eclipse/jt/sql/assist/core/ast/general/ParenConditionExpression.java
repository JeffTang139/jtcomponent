/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;


/**
 * @author Jeff Tang
 *
 */
public class ParenConditionExpression extends ConditionExpression implements IGeneralConditionNode {

	public static final String PAREN_WORD="()";
	
	public ParenConditionExpression(ISourcePosition position,
			ConditionExpression primary) {
		super(position, primary);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.PAREN_CONDITION_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IGeneralConditionVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitParenConditionExpression(this, data);
	}

	public String getTitle() {
		return PAREN_WORD;
	}
}
