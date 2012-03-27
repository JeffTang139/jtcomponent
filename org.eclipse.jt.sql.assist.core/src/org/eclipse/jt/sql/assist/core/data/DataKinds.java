/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

import org.eclipse.jt.sql.assist.core.DnaSql;

/**
 * @author Jeff Tang
 *
 */
public interface DataKinds {

	public final static int ENTITY_DEFINE=DnaSql.ENTITY_DEFINE;
	
	public final static int TABLE_DEFINE=DnaSql.TABLE_DEFINE;
	
	public final static int QUERY_DEFINE=DnaSql.QUERY_DEFINE;
	
	public final static int MAPPING_DEFINE=DnaSql.ORM_DEFINE;
	
	/**
	 * 表关系定义，数据标识如:"TABLE1.REL1"
	 */
	public final static int RELATION_DEFINE=0x10;
	/**
	 * Java类的字段定义，数据标识如："Class1.Field1"
	 */
	public final static int JAVA_FIELD_DEFINE=0x11;
	/**
	 * SQL对象的字段定义，数据标识如"TABLE1.FIELD1"
	 */
	public final static int SQL_FIELD_DEFINE=0x12;
	/**
	 * 存储表的级次定义
	 */
	public final static int HIERARCHY_DEFINE=0x13;
	/**
	 * 参数定义
	 */
	public final static int PARAMETER_DEFINE=0x14;
	
	/**
	 * Java类的字段类型
	 */
	public final static int JAVA_TYPE_DEFINE=0x20;
	/**
	 * SQL对象的字段类型
	 */
	public final static int SQL_TYPE_DEFINE=0x21;
	/**
	 * SQL函数定义
	 */
	public final static int SQL_FUNCTION_DEFINE=0x22;
	/**
	 * SQL函数模型（定义的参数列表，特定的重载函数）
	 */
	public final static int SQL_FUNCTION_PATTERN=0x23;
	
	
	
	
	public final static int TYPE_COUNT=0x40;
	
	
	

	
	/**
	 * DNA SQL 的包类型，用在IDataDescriptor中描述容纳数据的包类型，并不真实存在类型为PACKAGE的数据
	 */
	public final static int PACKAGE=0xFFFFFF01;
}
