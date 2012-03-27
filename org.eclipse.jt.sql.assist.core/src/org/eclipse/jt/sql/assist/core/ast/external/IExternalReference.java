/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.external;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IExternalReference extends IAstNode {
	public String getTargetName();
}
