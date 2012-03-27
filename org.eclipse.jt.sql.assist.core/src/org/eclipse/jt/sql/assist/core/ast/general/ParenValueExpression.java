/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class ParenValueExpression extends ValueExpression implements IGeneralValueNode {

	public static final String PAREN_WORD="()";
	
	public ParenValueExpression(ISourcePosition position, ValueExpression exp) {
		super(position, exp);
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitParenValueExpression(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.PAREN_VALUE_EXPRESSION;
	}

	public String getTitle() {
		return PAREN_WORD;
	}

	@Override
	public boolean isStatic() {
		return this.fPrimary!=null ? this.fPrimary.isStatic() : false;
	}
}
