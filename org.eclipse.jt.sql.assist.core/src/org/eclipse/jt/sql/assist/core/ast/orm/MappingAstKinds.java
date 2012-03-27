/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

/**
 * ORM抽象语法树节点的类型，用16位整型表示。
 * @author Jeff Tang
 *
 */
public interface MappingAstKinds {
	public final static short MAPPING_AST_BASE 				= 0x0400;
	public final static short MAPPING_DECLARATION			= MAPPING_AST_BASE + 0x01;
	public final static short MAPPING_STATEMENT				= MAPPING_AST_BASE + 0x08;
	public final static short MAPPING_OVERRIDE				= MAPPING_AST_BASE + 0x09;
}
