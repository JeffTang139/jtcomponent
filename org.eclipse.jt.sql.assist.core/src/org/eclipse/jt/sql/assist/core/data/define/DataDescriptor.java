/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDescriptor;


/**
 * @author Jeff Tang
 *
 */
public class DataDescriptor implements IDataDescriptor {
	
	private final String fID;
	private final String fDescription;
	private final int fKind;
	private final Object fSource;
	
	public DataDescriptor(int kind, String id, String description) {
		fKind=kind;
		fID=id;
		fDescription=description;
		fSource = null;
	}
	
	public DataDescriptor(int kind, String id, String description, Object source) {
		fKind=kind;
		fID=id;
		fDescription=description;
		fSource = source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataDescriptor#getDescription()
	 */
	public String getDescription() {
		return fDescription;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataDescriptor#getID()
	 */
	public String getID() {
		return fID;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataDescriptor#getKind()
	 */
	public int getKind() {
		return fKind;
	}

	public Object getSource() {
		return fSource;
	}

}
