/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.kinds;

/**
 * @author Jeff Tang
 *
 */
public interface SemanticWarningKinds {
	public final static int KIND_UNKNOWN=0x1000;
	public final static int KIND_EXCEPTION=0x1001;
	public final static int KIND_INTERNAL=0x1002;
	public final static int KIND_NON_SUPPORTED=0x1003;

	public final static int KIND_ILL_LITERAL=0x1010;
	public final static int KIND_ILL_DATE_FORMAT=0x1011;
	public final static int KIND_ILL_NUMBER_FORMAT=0x1012;
	public final static int KIND_ILL_GUID_FORMAT=0x1013;
	public final static int KIND_ILL_BYTES_FORMAT=0x1014;
	public final static int KIND_ILL_BOOLEAN_FORMAT=0x1015;
	public final static int KIND_ILL_ARGUMENT_NAME=0x101A;
	public final static int KIND_ILL_DECLARATION_NAME=0x101B;
	public final static int KIND_ILL_QUERY_NAME=0x101C;
	public final static int KIND_ILL_ORM_NAME=0x101D;
	public final static int KIND_ILL_COMMAND_NAME=0x101E;
	
	public final static int KIND_TYPE_MISS_MATCH=0x1020;
	public final static int KIND_PARAMETER_LIST_MISS_MATCH=0x1021;
	public final static int KIND_UNION_LIST_MISS_MATCH=0x1022;
	

	public final static int KIND_ARGUMENT_ALREADY_EXIST=0x1030;
	public final static int KIND_TABLE_ALREDAY_EXIST=0x1031;
	public final static int KIND_RELATION_ALREADY_EXIST=0x1032;
	public final static int KIND_COLUMN_ALIAS_ALREADY_EXIST=0x1033;
	public final static int KIND_WITH_ALIAS_ALREADY_EXIST=0x1034;

	public final static int KIND_TYPE_NOT_EXIST=0x1040;
	public final static int KIND_RELATION_NOT_EXIST=0x0041;
	public final static int KIND_TABLE_REFERENCE_NOT_EXIST=0x0042;
	public final static int KIND_FIELD_NOT_EXIST=0x0043;
	public final static int KIND_ARGUMENT_NOT_EXIST=0x0044;
	public final static int KIND_FUNCTION_NOT_EXIST=0x0045;
	public final static int KIND_ENTITY_NOT_EXIST=0x0046;
	public final static int KIND_ORM_NOT_EXIST=0x0047;
	public final static int KIND_QUERY_NOT_EXIST=0x0048;

	public final static int KIND_TABLE_NONE_REFERENCED=0x0050;
	public final static int KIND_RELATION_NONE_REFERENCED=0x0051;
	public final static int KIND_ARGUMENT_NONE_REFERENCED=0x0052;

	public final static int KIND_LOAD_DATA_FAILED=0x0060;
	public final static int KIND_LOAD_TABLE_FAILED=0x0061;
	public final static int KIND_LOAD_ENTITY_FAILED=0x0062;
	public final static int KIND_LOAD_ORM_FAILED=0x0063;
	public final static int KIND_LOAD_QUERY_FAILED=0x0064;

	public final static int KIND_BAD_HIERARCHY_PREDICATE=0x0070;
	
	public final static int KIND_ENTITY_FEILD_NAME_MISMATCH=0x0080;
	public final static int KIND_ENTITY_FEILD_TYPE_MISMATCH=0x0080;
	
	
}
