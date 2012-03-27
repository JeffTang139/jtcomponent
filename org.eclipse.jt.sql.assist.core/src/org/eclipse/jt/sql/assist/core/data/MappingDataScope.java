/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public class MappingDataScope extends AbstractMappingDataScope<MappingDataScope> {

	public static MappingDataScope  getInstance() {
		return new MappingDataScope();
	}
	
	private MappingDataScope() {
		super();
	}
	
	private MappingDataScope(MappingDataScope parent) {
		super(parent);
	}

	@Override
	protected MappingDataScope internalCreateSubScope() {
		return new MappingDataScope(this);
	}

}
