/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface ISqlFieldDefine extends IDataDefine {
	public ISqlTypeDefine getSqlType();
}
