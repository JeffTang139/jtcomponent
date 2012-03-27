/**
 * 
 */
package org.eclipse.jt.sql.assist.core.process;

import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.sql.assist.core.ast.IScopeStatement;


/**
 * @author Jeff Tang
 *
 */
public class DefaultVisitControler<TScope extends IDataScope<TScope>> implements IVisitControler<TScope> {
	
	protected int fPolicy;
	protected int fBuildScopeDataKind;
	protected TScope fDataScope;
	protected int fSubScopeIndex;
	
	public DefaultVisitControler(int policy, int buildScopeDataKind, TScope dataScope) {
		fPolicy = policy ;
		fBuildScopeDataKind=buildScopeDataKind;
		fDataScope=dataScope;
		fSubScopeIndex=0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWalkControler#getControler(org.eclipse.jt.script.assist.IAstNode)
	 */
	public IVisitControler<TScope> getControler(IAstNode ast) {
		if(usingSubScope(ast)) {
			TScope sub=null;
			List<TScope> subs=fDataScope.getSubScopes();
			if(subs==null || fSubScopeIndex>=subs.size()) {
				sub=fDataScope.createSubScope();
			} else {
				sub=subs.get(fSubScopeIndex);
			}
			fSubScopeIndex++;
			return new DefaultVisitControler<TScope>(fPolicy,fBuildScopeDataKind,sub);
		}
		return this;
	}
	
	protected boolean usingSubScope(IAstNode ast) {
		return fDataScope!=null && (ast instanceof IScopeStatement);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWalkControler#walkNode(org.eclipse.jt.script.assist.IAstNode)
	 */
	public boolean walkNode(IAstNode ast) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWalkControler#getPolicy(org.eclipse.jt.script.assist.IAstNode)
	 */
	public int getPolicy(IAstNode ast) {
		return fPolicy;
	}

	public TScope getDataScope() {
		return fDataScope;
	}

	public boolean isBuildScopeData(int kind) {
		return (fBuildScopeDataKind & kind)>0;
	}

	public void setBuildScopeDataKind(int buildScopeDataKind) {
		fBuildScopeDataKind = buildScopeDataKind;
	}
	
	public void setDataScope(TScope dataScope) {
		fDataScope = dataScope;
	}
	
	public void reset() {
		fSubScopeIndex=0;
	}
}
