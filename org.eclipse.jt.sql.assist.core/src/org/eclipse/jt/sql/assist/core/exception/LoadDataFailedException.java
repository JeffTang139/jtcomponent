/**
 * 
 */
package org.eclipse.jt.sql.assist.core.exception;

/**
 * @author Jeff Tang
 *
 */
public class LoadDataFailedException extends SqlException {

	private static final long serialVersionUID = -6535319599885348036L;

	public LoadDataFailedException() {
	}

	/**
	 * @param arg0
	 */
	public LoadDataFailedException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public LoadDataFailedException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public LoadDataFailedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
