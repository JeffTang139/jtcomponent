/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface IEntityDefine extends IDataDefine {
	public IJavaFieldDefine[] getFields();
	public IJavaFieldDefine getField(String name);
	public boolean containFields(String name);
}
