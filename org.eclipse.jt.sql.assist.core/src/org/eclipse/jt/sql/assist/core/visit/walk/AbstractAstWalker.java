/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * 默认的普通抽象语法树的简单访问器的抽象
 * @author Jeff Tang
 * 
 */
public abstract class AbstractAstWalker implements IAstWalker {
	
	private IAstWalker fBaseWalker;
	
	public AbstractAstWalker() {
		this(null);
	}
	
	public AbstractAstWalker(IAstWalker baseWalker) {
		setBaseWalker(baseWalker);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.visit.IAstWalker#enterGeneral(org.eclipse.jt.script.assist.IAstNode)
	 */
	public boolean enterGeneral(IAstNode ast) {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.visit.IAstWalker#exitGeneral(org.eclipse.jt.script.assist.IAstNode)
	 */
	public boolean exitGeneral(IAstNode ast) {
		return true;
	}

	public IAstWalker getBaseWalker() {
		return fBaseWalker;
	}
	
	public void setBaseWalker(IAstWalker baseWalker) {
		this.fBaseWalker = (null==baseWalker)? this : baseWalker;
	}
	
	protected boolean internalEnterGeneral(IAstNode ast) {
		return fBaseWalker.enterGeneral(ast);
	}
	
	protected boolean internalExitGeneral(IAstNode ast) {
		return fBaseWalker.exitGeneral(ast);
	}

	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		return null;
	}
}
