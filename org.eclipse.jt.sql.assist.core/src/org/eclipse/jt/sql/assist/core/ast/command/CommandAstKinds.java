/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

/**
 * @author Jeff Tang
 *
 */
public interface CommandAstKinds {
	public final static short COMMAND_AST_BASE 				= 0x0500;
	
	public final static short COMMAND_INSERT_STATEMENT		= COMMAND_AST_BASE + 0x01;
	public final static short COMMAND_UPDATE_STATEMENT		= COMMAND_AST_BASE + 0x02;
	public final static short COMMAND_DELETE_STATEMENT		= COMMAND_AST_BASE + 0x03;
	
	public final static short COMMAND_INSERT_DECLARATION	= COMMAND_AST_BASE + 0x11;
	public final static short COMMAND_UPDATE_DECLARATION	= COMMAND_AST_BASE + 0x12;
	public final static short COMMAND_DELETE_DECLARATION	= COMMAND_AST_BASE + 0x13;
	
	public final static short COMMAND_ASSIGN_STATEMENT		= COMMAND_AST_BASE + 0x21;
}
