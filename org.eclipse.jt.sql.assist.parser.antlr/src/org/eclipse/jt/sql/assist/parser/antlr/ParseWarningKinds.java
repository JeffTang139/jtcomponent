/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.antlr;

/**
 * @author Jeff Tang
 *
 */
public interface ParseWarningKinds {
	public final static int KIND_UNKNOWN=0;

	public final static int KIND_MISS_TABLE_REFERENCE=0x0010;
	public final static int KIND_MISS_COLUMN_NAME=0x0011;
	public final static int KIND_MISS_ENTITY_NAME=0x0012;
	public final static int KIND_MISS_COLUMN=0x0013;
	public final static int KIND_MISS_CONDITION=0x0014;
	public final static int KIND_MISS_OVERRIDE_NAME=0x0015;
	public final static int KIND_MISS_ASSIGN_STATEMENT=0x0016;
	public final static int KIND_MISS_VALUE_EXPRESSION=0x0017;
	public final static int KIND_MISS_ARGUMENT_DECLARATION=0x0018;
	public final static int KIND_MISS_SUBQUERY=0x0019;
	public final static int KIND_MISS_CLASS_NAME=0x001A;
	public final static int KIND_EMPTY_ARGUMENT_NAME=0x0021;
	public final static int KIND_BAD_ARGUMENT_TYPE=0x0022;
	public final static int KIND_COLUMN_ALIAS_REQUIRED=0x0032;
	public final static int KIND_TABLE_ALIAS_REQUIRED=0x0033;
	public final static int KIND_RELATION_ALIAS_REQUIRED=0x0034;
	public final static int KIND_DEFINE_END_REQUIRED=0x0035;
	public final static int KIND_UGLY_EXPRESSION=0x0035;
	public final static int KIND_UGLY_PARAMETER_LIST=0x0036;
	public final static int KIND_ALIAS_REQUIRED=0x0037;
	public final static int KIND_SIZE_REQUIRED=0x0038;
	public final static int KIND_SCALE_REQUIRED=0x0039;
	
	public final static int KIND_EARLY_EXIT=0x0100;
	public final static int KIND_FAILED_PREDICATE=0x0101;
	public final static int KIND_MISMATCHED_RANGE=0x0102;
	public final static int KIND_MISMATCHED_SET=0x0103;
	public final static int KIND_MISMATCHED_NOT_SET=0x0104;
	public final static int KIND_MISMATCHED_TOKEN=0x0105;
	public final static int KIND_MISSING_TOKEN=0x0106;
	public final static int KIND_UNWANTED_TOKEN=0x0107;
	public final static int KIND_MISMATCHED_TREE_NODE=0x0108;
	public final static int KIND_NO_VIABLE_ALT=0x0109;
}
