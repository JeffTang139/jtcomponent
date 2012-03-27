/**
 * 
 */
package org.eclipse.jt.sql.assist.core.exception;

/**
 * @author Jeff Tang
 *
 */
public class SqlFatalException extends SqlException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8534285913035206954L;

	/**
	 * 
	 */
	public SqlFatalException() {
	}

	/**
	 * @param message
	 */
	public SqlFatalException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SqlFatalException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SqlFatalException(String message, Throwable cause) {
		super(message, cause);
	}

}
