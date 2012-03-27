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
	 * ���ݵ���������
	 * @see IDataProvider#listDescriptors(String, int, java.util.Map)
	 * @see IDataProvider#loadData(String, int, java.util.Map, org.eclipse.jt.script.assist.IWarnings)
	 */
	public final static String CONFIG_KEY_LIMIT = "limit";
	
	/**
	 * ����Χ
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_PACKAGE = "package";
	
	/**
	 * ������Χ
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_DEPENDENCE = "dependence";
	
	/**
	 * ���أ����磺����ǰ���̣�
	 * @see #CONFIG_KEY_LIMIT
	 */
	public final static String CONFIG_VALUE_LOCAL = "local";
}
