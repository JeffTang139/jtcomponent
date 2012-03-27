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
public class ArgumentReference extends ValueExpression implements IGeneralValueNode{
	
	protected String fArgumentName;

	public ArgumentReference(ISourcePosition position, String argumentName) {
		super(position);
		fArgumentName=argumentName;
	}

	/**
	 * @return the fArgumentName
	 */
	public String getArgumentName() {
		return fArgumentName;
	}

	/**
	 * @param argumentName the fArgumentName to set
	 */
	public void setArgumentName(String argumentName, ISourcePosition pos) {
		this.updatePosition(pos);
		fArgumentName = argumentName;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.ARGUMENT_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitArgumentReference(this, data);
	}

	public String getTitle() {
		return fArgumentName;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
