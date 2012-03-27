/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

/**
 * @author Jeff Tang
 *
 */
public interface TableAstKinds {

	public final static short TABLE_AST_BASE 				= 0x0600;
	

	public final static short COLUMN_DECLARATION			= TABLE_AST_BASE + 0x01;
	public final static short COLUMN_DEFAULT_STATEMENT		= TABLE_AST_BASE + 0x02;
	public final static short COLUMN_RELATION_STATEMENT		= TABLE_AST_BASE + 0x03;
	public final static short COLUMNS_STATEMENT				= TABLE_AST_BASE + 0x04;
	
	public final static short HIERARCHY_DECLARATION			= TABLE_AST_BASE + 0x05;
	public final static short HIERARCHIES_STATEMENT			= TABLE_AST_BASE + 0x06;
	
	public final static short INDEX_DECLARATION				= TABLE_AST_BASE + 0x07;
	public final static short INDEX_COLUMN_DECLARATION		= TABLE_AST_BASE + 0x08;
	public final static short INDEXES_STATEMENT				= TABLE_AST_BASE + 0x09;
	
	public final static short PARTITION_STATEMENT			= TABLE_AST_BASE + 0x0A;
	
	public final static short RELATION_DECLARATION			= TABLE_AST_BASE + 0x0B;
	public final static short RELATIONS_STATEMENT			= TABLE_AST_BASE + 0x0C;
	
	public final static short TABLE_COLUMN_REFERENCE		= TABLE_AST_BASE + 0x0D;
	public final static short COLUMN_TYPE_REFERENCE			= TABLE_AST_BASE + 0x0E;

	public final static short ABSTRACT_TABLE_DECLARATION		= TABLE_AST_BASE + 0x11;
	public final static short ABSTRACT_TABLE_DEFINE_STATEMENT	= TABLE_AST_BASE + 0x12;
	public final static short NORMAL_TABLE_DECLARATION			= TABLE_AST_BASE + 0x13;
	public final static short NORMAL_TABLE_DEFINE_STATEMENT		= TABLE_AST_BASE + 0x14;
	
	
}
