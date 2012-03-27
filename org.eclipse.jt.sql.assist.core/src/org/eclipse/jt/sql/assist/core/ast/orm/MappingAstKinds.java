/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

/**
 * ORM�����﷨���ڵ�����ͣ���16λ���ͱ�ʾ��
 * @author Jeff Tang
 *
 */
public interface MappingAstKinds {
	public final static short MAPPING_AST_BASE 				= 0x0400;
	public final static short MAPPING_DECLARATION			= MAPPING_AST_BASE + 0x01;
	public final static short MAPPING_STATEMENT				= MAPPING_AST_BASE + 0x08;
	public final static short MAPPING_OVERRIDE				= MAPPING_AST_BASE + 0x09;
}
