/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IAliasHolder extends IAstNode {
	public TokenNode getAliasTarget();
	public TokenNode getAs();
	public void setAs(TokenNode as);
	public TokenNode getAlias();
	public void setAlias(TokenNode alias);
}
