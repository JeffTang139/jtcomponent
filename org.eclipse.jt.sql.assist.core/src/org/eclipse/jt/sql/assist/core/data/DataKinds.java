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
	 * ���ϵ���壬���ݱ�ʶ��:"TABLE1.REL1"
	 */
	public final static int RELATION_DEFINE=0x10;
	/**
	 * Java����ֶζ��壬���ݱ�ʶ�磺"Class1.Field1"
	 */
	public final static int JAVA_FIELD_DEFINE=0x11;
	/**
	 * SQL������ֶζ��壬���ݱ�ʶ��"TABLE1.FIELD1"
	 */
	public final static int SQL_FIELD_DEFINE=0x12;
	/**
	 * �洢��ļ��ζ���
	 */
	public final static int HIERARCHY_DEFINE=0x13;
	/**
	 * ��������
	 */
	public final static int PARAMETER_DEFINE=0x14;
	
	/**
	 * Java����ֶ�����
	 */
	public final static int JAVA_TYPE_DEFINE=0x20;
	/**
	 * SQL������ֶ�����
	 */
	public final static int SQL_TYPE_DEFINE=0x21;
	/**
	 * SQL��������
	 */
	public final static int SQL_FUNCTION_DEFINE=0x22;
	/**
	 * SQL����ģ�ͣ�����Ĳ����б��ض������غ�����
	 */
	public final static int SQL_FUNCTION_PATTERN=0x23;
	
	
	
	
	public final static int TYPE_COUNT=0x40;
	
	
	

	
	/**
	 * DNA SQL �İ����ͣ�����IDataDescriptor�������������ݵİ����ͣ�������ʵ��������ΪPACKAGE������
	 */
	public final static int PACKAGE=0xFFFFFF01;
}
