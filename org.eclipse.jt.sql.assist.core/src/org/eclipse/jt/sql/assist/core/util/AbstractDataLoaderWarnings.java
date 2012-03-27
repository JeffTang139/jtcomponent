/**
 * 
 */
package org.eclipse.jt.sql.assist.core.util;

import org.eclipse.jt.script.assist.IWarnings;


/**
 * @author Jeff Tang
 *
 */
@Deprecated
public abstract class AbstractDataLoaderWarnings<TWarnings extends IWarnings> implements IWarnings {
	
	public static final String MESSAGE_PROFIX = "Loading data: ";
	
	protected final TWarnings fWarnings;
	
	public AbstractDataLoaderWarnings(TWarnings warnings) {
		fWarnings = warnings;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#debug(java.lang.String)
	 */
	public void debug(String message) {
		if(fWarnings!=null) fWarnings.debug(MESSAGE_PROFIX+message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#fatal(java.lang.String)
	 */
	public void fatal(String message) {
		if(fWarnings!=null) fWarnings.fatal(MESSAGE_PROFIX+message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#info(java.lang.String)
	 */
	public void info(String message) {
		if(fWarnings!=null) fWarnings.info(MESSAGE_PROFIX+message);
	}

}
