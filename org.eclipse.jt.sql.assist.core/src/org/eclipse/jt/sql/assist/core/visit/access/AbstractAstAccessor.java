/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.visit.IAstAccessor;


/**
 * @author Jeff Tang
 *
 */
public class AbstractAstAccessor<TScope extends IDataScope<TScope>> implements IAstAccessor<TScope> {

	private IAstAccessor<TScope> fBaseAccessor;
	
	public AbstractAstAccessor() {
		setBaseAccessor(null);
	}

	public AbstractAstAccessor(IAstAccessor<TScope> baseAccessor) {
		setBaseAccessor(baseAccessor);
	}
	
	public IAstAccessor<TScope> getBaseAccessor() {
		return fBaseAccessor;
	}
	
	public void setBaseAccessor(IAstAccessor<TScope> baseAccessor) {
		this.fBaseAccessor = (null==baseAccessor)? this : baseAccessor;
	}
	
	protected boolean internalEnterGeneral(IAstNode ast, TScope scope) {
		return fBaseAccessor.enterGeneral(ast, scope);
	}
	
	protected boolean internalExitGeneral(IAstNode ast, TScope scope) {
		return fBaseAccessor.exitGeneral(ast, scope);
	}
	
	public boolean enterGeneral(IAstNode ast, TScope scope) {
		return true;
	}

	public boolean exitGeneral(IAstNode ast, TScope scope) {
		return true;
	}

	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		return null;
	}

}
