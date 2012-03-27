/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

/**
 * 查询抽象语法树节点的类型，用16位整型表示。
 * @author Jeff Tang
 *
 */
public interface QueryAstKinds {
	public final static short QUERY_AST_BASE 				= 0x0300;
	public final static short QUERY_DECLARATION				= QUERY_AST_BASE + 0x01; //QueryDeclaration
	public final static short SUB_QUERY						= QUERY_AST_BASE + 0x02;
	public final static short QUERY_STATEMENT				= QUERY_AST_BASE + 0x03;
	public final static short UNION_STATEMENT				= QUERY_AST_BASE + 0x04;
	public final static short SELECT_STATEMENT				= QUERY_AST_BASE + 0x10;
	public final static short FROM_STATEMENT				= QUERY_AST_BASE + 0x20;
	public final static short WHERE_STATEMENT				= QUERY_AST_BASE + 0x30;
	public final static short GROUP_STATEMENT				= QUERY_AST_BASE + 0x40;
	public final static short HAVING_STATEMENT				= QUERY_AST_BASE + 0x50;
	public final static short ORDER_STATEMENT				= QUERY_AST_BASE + 0x60;
	public final static short WITH_STATEMENT				= QUERY_AST_BASE + 0x70;
	public final static short DERIVED_COLUMN				= QUERY_AST_BASE + 0x11;
	public final static short COLUMN_REFERENCE				= QUERY_AST_BASE + 0x12;
	public final static short COLUMN_CALL_EXPRESSION		= QUERY_AST_BASE + 0x13;
	public final static short VALUE_QUERY_EXPRESSION		= QUERY_AST_BASE + 0x14;
	public final static short TABLE_MODIFIER				= QUERY_AST_BASE + 0x21;
	public final static short TABLE_REFERENCE				= QUERY_AST_BASE + 0x22;
	public final static short TABLE_RELATION				= QUERY_AST_BASE + 0x23;
	public final static short TABLE_REFERENCE_STATEMENT		= QUERY_AST_BASE + 0x28;
	public final static short TABLE_RELATION_STATEMENT		= QUERY_AST_BASE + 0x29;
	public final static short TABLE_JOIN_STATEMENT			= QUERY_AST_BASE + 0x2A;
	public final static short SUBQUERY_REFERENCE			= QUERY_AST_BASE + 0x2B;
	public final static short HIERARCHY_PREDICATE			= QUERY_AST_BASE + 0x31;
	public final static short HIERARCHY_FUNCTION_CALL_EXPRESSION		= QUERY_AST_BASE + 0x32;
	public final static short EXISTS_PREDICATE				= QUERY_AST_BASE + 0x33;
	public final static short GROUP_COLUMN					= QUERY_AST_BASE + 0x41;
	public final static short ORDER_EXPRESSION				= QUERY_AST_BASE + 0x61;
}
