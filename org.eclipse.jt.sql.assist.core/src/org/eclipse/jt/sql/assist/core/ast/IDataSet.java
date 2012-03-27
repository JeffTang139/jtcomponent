/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 *
 */
public interface IDataSet extends IAstNode, IAliasHolder {

	/**
	 * @return the ForUpdate
	 */
	public boolean isForUpdate();
}
