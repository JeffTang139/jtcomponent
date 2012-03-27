/**
 * 
 */
package org.eclipse.jt.sql.assist.core.exception;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IWarningPosition;


/**
 * @author Jeff Tang
 *
 */
public class ErrorWarningException extends SqlException {

	private static final long serialVersionUID = -3156852528950844963L;
	
	private final IWarningPosition fPosition;
	private final IAstNode fAst;

	public IAstNode getAst() {
		return fAst;
	}

	public IWarningPosition getPosition() {
		return fPosition;
	}

	public ErrorWarningException(IWarningPosition pos, IAstNode ast) {
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param arg0
	 */
	public ErrorWarningException(String arg0, IWarningPosition pos, IAstNode ast) {
		super(arg0);
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param arg0
	 */
	public ErrorWarningException(Throwable arg0, IWarningPosition pos, IAstNode ast) {
		super(arg0);
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ErrorWarningException(String arg0, Throwable arg1, IWarningPosition pos, IAstNode ast) {
		super(arg0, arg1);
		fPosition=pos;
		fAst = ast;
	}

}
