/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractCommandDataScope<TScope extends AbstractCommandDataScope<TScope>>
		extends AbstractQueryDataScope<TScope>
		implements ICommandScopeDataKinds {

	
	protected AbstractCommandDataScope() {
		super();
	}
	
	protected AbstractCommandDataScope(TScope parent) {
		super(parent);
	}
	
	@Override
	public void clear() {
		super.clear();
	}
}
