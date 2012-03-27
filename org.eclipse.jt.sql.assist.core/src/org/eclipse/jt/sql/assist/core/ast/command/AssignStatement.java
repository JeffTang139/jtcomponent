/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class AssignStatement extends Statement implements ICommandAstNode {
	
	public static final String  ASSIGN_OPERATOR = "=";

	protected TokenNode fColumn;
	protected ValueExpression fValue;
	
	/**
	 * @param position
	 */
	public AssignStatement(ISourcePosition begin, TokenNode column, ValueExpression value, ISourcePosition end) {
		super(union(begin,end));
		fColumn = column;
		fValue = value;
	}
	
	public TokenNode getColumn() {
		return fColumn;
	}
	
	public ValueExpression getValue() {
		return fValue;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode#accept(org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitAssignStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return CommandAstKinds.COMMAND_ASSIGN_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return ASSIGN_OPERATOR;
	}

}
