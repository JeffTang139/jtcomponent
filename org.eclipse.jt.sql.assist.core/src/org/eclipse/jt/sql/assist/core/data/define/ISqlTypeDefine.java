/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface ISqlTypeDefine extends IDataDefine {

	public static final String TYPE_NAME_DATE = "date";
	public static final String TYPE_NAME_GUID = "guid";
	public static final String TYPE_NAME_BYTES = "bytes";
	public static final String TYPE_NAME_STRING = "string";
	public static final String TYPE_NAME_BOOLEAN = "boolean";
	public static final String TYPE_NAME_FLOAT = "float";
	public static final String TYPE_NAME_DOUBLE = "double";
	public static final String TYPE_NAME_INTEGER = "int";
	public static final String TYPE_NAME_LONG = "long";
	public static final String TYPE_NAME_TABLE_REFERENCE = "tableReference";
	public static final String TYPE_NAME_NULL = "null";
	
	/**
	 * ��֧�ָ�ֵ
	 */
	public static final int ASSIGN_CASE_NO=0;
	/**
	 * ��Ҫ����ת��
	 */
	public static final int ASSIGN_CASE_CONVERT=1;
	/**
	 * ��ʾת��
	 */
	public static final int ASSIGN_CASE_EXPLICIT=2;
	/**
	 * ��ʽת��
	 */
	public static final int ASSIGN_CASE_IMPLICIT=3;
	/**
	 * ��ͬ
	 */
	public static final int ASSIGN_CASE_SAME=4;

	public IJavaTypeDefine getJavaType();
	public int isAssignableFrom(ISqlTypeDefine other);
	public int isAssignableFrom(String id);
	public int isAssignableTo(ISqlTypeDefine other);
	public int isAssignableTo(String id);
	public boolean isNumberic();
	public ISqlTypeDefine getRootType();
	public boolean isLOB();
	public boolean isValid(String value);
}
