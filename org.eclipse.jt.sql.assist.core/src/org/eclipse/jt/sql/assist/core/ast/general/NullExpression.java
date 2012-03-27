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
public class NullExpression extends ValueExpression implements IGeneralValueNode {
	
	public static final String NULL_WORD="null";

	public NullExpression(ISourcePosition position) {
		super(position);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.NULL_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitNullExpression(this, data);
	}

	public String getTitle() {
		return NULL_WORD;
	}

	@Override
	public boolean isStatic() {
		return true;
	}
}
