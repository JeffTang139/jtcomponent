/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public class CommandDataScope extends AbstractCommandDataScope<CommandDataScope> {

	public static CommandDataScope getInstance() {
		return new CommandDataScope();
	}
	
	private CommandDataScope() {
		super();
	}
	
	private CommandDataScope(CommandDataScope parent) {
		super(parent);
	}

	@Override
	protected CommandDataScope internalCreateSubScope() {
		return new CommandDataScope(this);
	}

}
