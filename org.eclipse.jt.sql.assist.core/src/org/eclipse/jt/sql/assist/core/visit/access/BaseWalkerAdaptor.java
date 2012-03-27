/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstWalker;


/**
 * @author Jeff Tang
 *
 */
public class BaseWalkerAdaptor<TScope extends IDataScope<TScope>> implements IAstAccessor<TScope> {

	private IAstWalker fBaseWalker;
	
	public BaseWalkerAdaptor(IAstWalker walker) {
		setWalker(walker);
	}
	
	public void setWalker(IAstWalker walker) {
		fBaseWalker = walker;
	}

	public boolean enterGeneral(IAstNode ast, TScope scope) {
		return fBaseWalker.enterGeneral(ast);
	}

	public boolean exitGeneral(IAstNode ast, TScope scope) {
		return fBaseWalker.exitGeneral(ast);
	}

	@SuppressWarnings("unchecked")
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		if(IAstWalker.class.equals(clazz)) {
			return (TAdaptor) fBaseWalker;
		}
		return fBaseWalker.getAdaptor(clazz);
	}

}
