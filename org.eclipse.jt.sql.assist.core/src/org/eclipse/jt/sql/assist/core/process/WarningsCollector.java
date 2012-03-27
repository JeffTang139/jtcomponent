/**
 * 
 */
package org.eclipse.jt.sql.assist.core.process;

import java.util.ArrayList;

import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.sql.assist.core.exception.SqlFatalException;


/**
 * @author Jeff Tang
 *
 */
public class WarningsCollector<TWarnings extends IWarnings> implements IWarnings {


	private final String fMsgPrefix;
	private final TWarnings fWarnings;
	private ArrayList<Throwable> fReports;
	
	public WarningsCollector(String msgPrefix, TWarnings warnings) {
		fMsgPrefix = msgPrefix;
		fWarnings = warnings;
		fReports = new ArrayList<Throwable>();
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#debug(java.lang.String)
	 */
	public void debug(String message) {
		if(fWarnings!=null) fWarnings.debug(fMsgPrefix+message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#fatal(java.lang.String)
	 */
	public void fatal(String message) {
		if(fWarnings!=null) fWarnings.fatal(fMsgPrefix+message);
		Throwable throwable = new SqlFatalException(message);
		fReports.add(throwable);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#info(java.lang.String)
	 */
	public void info(String message) {
		if(fWarnings!=null) fWarnings.info(fMsgPrefix+message);
	}
	
	public void report(Throwable throwable, Object reporter) {
		if(fWarnings!=null) fWarnings.report(throwable, reporter);
		fReports.add(throwable);
	}
	
	public Throwable[] getReports() {
		return fReports.toArray(new Throwable[fReports.size()]);
	}
	
	public void clear() {
		fReports.clear();
	}
}
