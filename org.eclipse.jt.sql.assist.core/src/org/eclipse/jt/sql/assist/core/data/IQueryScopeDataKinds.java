/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public interface IQueryScopeDataKinds extends IGeneralScopeDataKinds {
	public static final int COLUMN				=0x00000100;
	public static final int WITHS				=0x00000200;
	

	public static final int ANY			= COLUMN | WITHS | IGeneralScopeDataKinds.ANY;
}
