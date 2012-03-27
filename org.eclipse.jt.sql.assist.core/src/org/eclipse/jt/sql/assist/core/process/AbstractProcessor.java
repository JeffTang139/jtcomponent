/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IWarnings;


/**
 * @author Jeff Tang
 *
 */
public class AbstractProcessor<TScope extends IDataScope<TScope>, TWarnings extends IWarnings> extends AbstractMessager<TWarnings> {
	protected TScope fScope;
	
	/**
	 * @return the fPrimaryScope
	 */
	public TScope getScope() {
		return fScope;
	}
	/**
	 * @param primaryScope the fPrimaryScope to set
	 */
	public void setScope(TScope scope) {
		fScope = scope;
	}
}
