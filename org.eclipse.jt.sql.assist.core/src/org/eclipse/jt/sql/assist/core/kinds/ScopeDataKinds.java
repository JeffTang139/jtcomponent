/**
 * 
 */
package org.eclipse.jt.sql.assist.core.kinds;

import org.eclipse.jt.sql.assist.core.data.IBaseScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.IGeneralScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.IMappingScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.IQueryScopeDataKinds;

/**
 * @author Jeff Tang
 *
 */
public interface ScopeDataKinds extends IBaseScopeDataKinds,
		IGeneralScopeDataKinds, IMappingScopeDataKinds, IQueryScopeDataKinds {

	public static final int ANY			=0x7FFFFFFF;
}
