/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast;

/**
 * @author Jeff Tang
 *
 */
public interface BaseAstKinds {
	public final static short BASE_AST_BASE					= 0x0000;
	public final static short UNKNOWN						= BASE_AST_BASE + 0x00;
	public final static short TOKEN 						= BASE_AST_BASE + 0x01;
	public final static short STRUCTURED 					= BASE_AST_BASE + 0xFF;
}
