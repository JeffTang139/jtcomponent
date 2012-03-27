/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

/**
 * 普通抽象语法树节点的类型，用16位整型表示。
 * 
 * @author Jeff Tang
 * 
 */
public interface GeneralAstKinds {
	public final static short GENERAL_AST_BASE 				= 0x0200;
	public final static short DATA_TYPE 					= GENERAL_AST_BASE + 0x04;
	public final static short ARGUMENT_DECLARATION 			= GENERAL_AST_BASE + 0x05;
	public final static short TABLE_REF_REFERENCE 			= GENERAL_AST_BASE + 0x0A;
	public final static short CLASS_REFERENCE 				= GENERAL_AST_BASE + 0x0E;
	public final static short VALUE_EXPRESSION 				= GENERAL_AST_BASE + 0x10;
	public final static short NULL_EXPRESSION 				= GENERAL_AST_BASE + 0x11;
	public final static short OPERATOR_EXPRESSION 			= GENERAL_AST_BASE + 0x12;
	public final static short FUNCTION_CALL_EXPRESSION 		= GENERAL_AST_BASE + 0x13;
	public final static short CASE_EXPRESSION 				= GENERAL_AST_BASE + 0x14;
	public final static short PAREN_VALUE_EXPRESSION 		= GENERAL_AST_BASE + 0x15;
	public final static short ARGUMENT_REFERENCE 			= GENERAL_AST_BASE + 0x16;
	public final static short CONSTANT_EXPRESSION 			= GENERAL_AST_BASE + 0x17;
	public final static short PAREN_CONDITION_EXPRESSION 	= GENERAL_AST_BASE + 0x20;
	public final static short LOGICAL_PREDICATE 			= GENERAL_AST_BASE + 0x21;
	public final static short RELATION_PREDICATE 			= GENERAL_AST_BASE + 0x22;
}
