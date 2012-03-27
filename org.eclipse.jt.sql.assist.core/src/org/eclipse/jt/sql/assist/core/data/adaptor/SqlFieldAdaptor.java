/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.adaptor;

import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;

/**
 * @author Jeff Tang
 *
 */
public class SqlFieldAdaptor implements ISqlFieldDefine {

	private String fName;
	private ISqlTypeDefine fType;
	private String fDescription;
	private Object fSource;
	
	public SqlFieldAdaptor(String name, ISqlTypeDefine type, Object source) {
		fName = name;
		fType = type;
		fSource = source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine#getSqlType()
	 */
	public ISqlTypeDefine getSqlType() {
		return fType;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDefine#getName()
	 */
	public String getName() {
		return fName;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getDescription()
	 */
	public String getDescription() {
		return fDescription;
	}
	
	public void setDescription(String description) {
		this.fDescription = description;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getID()
	 */
	public String getID() {
		return fName;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getKind()
	 */
	public int getKind() {
		return DataKinds.SQL_FIELD_DEFINE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAdaptable#getAdaptor(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		if(ISqlTypeDefine.class.equals(clazz)) {
			return (TAdaptor)fType;
		}
		return null;
	}

	public Object getSource() {
		return fSource;
	}

}
