/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IDataScope;



/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractDataScope<TScope extends AbstractDataScope<TScope>> 
		implements IDataScope<TScope>, IBaseScopeDataKinds {
	
	protected final TScope fPrimary;
	protected final TScope fParent;
	protected List<TScope> fSubScopes;
	
	@SuppressWarnings("unchecked")
	public AbstractDataScope() {
		fParent=null;
		fPrimary=(TScope) this;
	}
	
	protected AbstractDataScope(TScope parent) {
		fParent=parent;
		fPrimary = (TScope) parent.getPrimary();
	}
	
	public final TScope createSubScope() {
		TScope subscope=internalCreateSubScope();
		if(fSubScopes==null) {
			fSubScopes = new ArrayList<TScope>();
		}
		fSubScopes.add(subscope);
		return subscope;
	}
	
	/**
	 * 子类必需重写该方法
	 */
	protected abstract TScope internalCreateSubScope();

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataScope#getPrimary()
	 */
	public TScope getPrimary() {
		return fPrimary;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataScope#getParent()
	 */
	public TScope getParent() {
		return fParent;
	}
	
	public List<TScope> getSubScopes() {
		return fSubScopes;
	}
	
	public void clear() {
		if(fSubScopes!=null) {
			for(TScope subscope : fSubScopes) {
				if(subscope!=null) {
					subscope.clear();
				}
			}
			fSubScopes.clear();
		}
	}
	
}
