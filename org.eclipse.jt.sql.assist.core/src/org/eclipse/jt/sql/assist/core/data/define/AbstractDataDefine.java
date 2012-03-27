/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractDataDefine<TSource extends Object> implements IDataDefine {

	protected String name;
	protected String description;
	protected TSource source;
	
	public AbstractDataDefine(String name, TSource source) {
		this.name = name;
		this.source = source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getID()
	 */
	public String getID() {
		return name;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDefine#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getDescription()
	 */
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public TSource getSource() {
		return source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAdaptable#getAdaptor(java.lang.Class)
	 */
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		return null;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
