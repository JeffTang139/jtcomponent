/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public class FullWalker extends MappingWalker {

	public FullWalker() {
		super(null);
	}
	
	public FullWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
}
