/**
 * 
 */
package org.eclipse.jt.sql.assist.core.exception;

/**
 * @author Jeff Tang
 *
 */
public class SqlException extends Exception {

	private static final long serialVersionUID = 3874584344332378291L;

	public SqlException() {
	}

	/**
	 * @param message
	 */
	public SqlException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SqlException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SqlException(String message, Throwable cause) {
		super(message, cause);
	}

}
