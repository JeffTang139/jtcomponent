/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;


/**
 * @author Jeff Tang
 *
 */
public interface IArgumentContainer extends IAstNode {

	
	public List<ArgumentDeclaration> getArguments();
	
	public void addArgument(ArgumentDeclaration argument);
}
