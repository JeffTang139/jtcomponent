/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

/**
 * @author Jeff Tang
 *
 */
public interface ITableDefineReference {
	public ITableDefine getTarget();
	public String getTargetName();
	public String getAlias();
	public boolean isForUpdate();
}
