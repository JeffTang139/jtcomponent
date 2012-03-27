/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface IJavaTypeDefine extends IDataDefine {
	public Class<?> getJavaClass();
	public ISqlTypeDefine getSqlType();
}
