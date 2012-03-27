/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public interface IMappingScopeDataKinds extends IQueryScopeDataKinds {
	public static final int MAPPING				=0x00000800;
	public static final int OVERRIDE			=0x00000900;
	

	public static final int ALL_MAPPING			= MAPPING | OVERRIDE | IQueryScopeDataKinds.ANY;
}
