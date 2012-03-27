/**
 * 
 */
package org.eclipse.jt.sql.assist.core;

import org.eclipse.jt.script.assist.IDataProvider;

/**
 * @author Jeff Tang
 *
 */
public class DataConfigures {

	/**
	 * 数据的限制配置
	 * @see IDataProvider#listDescriptors(String, int, java.util.Map)
	 * @see IDataProvider#loadData(String, int, java.util.Map, org.eclipse.jt.script.assist.IWarnings)
	 */
	public final static String CONFIG_KEY_LIMIT = "limit";
	
	/**
	 * 包范围
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_PACKAGE = "package";
	
	/**
	 * 依赖范围
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_DEPENDENCE = "dependence";
	
	/**
	 * 本地（例如：仅当前工程）
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_LOCAL = "local";
}
