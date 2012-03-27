/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public interface IGeneralScopeDataKinds extends IBaseScopeDataKinds {
	public static final int ARGUMENT			=0x00000010;
	public static final int TABLE_REFERENCE		=0x00000020;
	
	public static final int ANY			= ARGUMENT | TABLE_REFERENCE | IBaseScopeDataKinds.ANY;
}
