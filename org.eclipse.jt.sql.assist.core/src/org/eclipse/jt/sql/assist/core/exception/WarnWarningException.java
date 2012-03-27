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
public class WarnWarningException extends SqlException {

	private static final long serialVersionUID = -8490000887729014986L;

	
	private final IWarningPosition fPosition;
	private final IAstNode fAst;

	public IAstNode getAst() {
		return fAst;
	}

	public IWarningPosition getPosition() {
		return fPosition;
	}
	
	public WarnWarningException(IWarningPosition pos, IAstNode ast) {
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param message
	 */
	public WarnWarningException(String message, IWarningPosition pos, IAstNode ast) {
		super(message);
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param cause
	 */
	public WarnWarningException(Throwable cause, IWarningPosition pos, IAstNode ast) {
		super(cause);
		fPosition=pos;
		fAst = ast;
	}

	/**
	 * @param message
	 * @param cause
	 */
	public WarnWarningException(String message, Throwable cause, IWarningPosition pos, IAstNode ast) {
		super(message, cause);
		fPosition=pos;
		fAst = ast;
	}

}
