/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.data.define.IEntityDefine;
import org.eclipse.jt.sql.assist.core.data.define.IMappingDefine;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractMappingDataScope <TScope extends AbstractMappingDataScope<TScope>> 
		extends AbstractQueryDataScope<TScope>
		implements IMappingScopeDataKinds {

	
	protected DataReference<MappingStatement, IEntityDefine>  fMapping;
	protected DataReference<MappingOverride, IMappingDefine> fOverride;

	protected AbstractMappingDataScope() {
		super();
	}

	protected AbstractMappingDataScope(TScope parent) {
		super(parent);
	}
	
	@Override
	public void clear() {
		fMapping=null;
		super.clear();
	}

	public DataReference<MappingStatement, IEntityDefine> getMapping() {
		return fMapping;
	}

	public void setMapping(DataReference<MappingStatement, IEntityDefine> mapping) {
		fMapping = mapping;
	}

	
	public DataReference<MappingOverride, IMappingDefine> getOverride() {
		return fOverride;
	}

	public void setOverride(
			DataReference<MappingOverride, IMappingDefine> mappingOverride) {
		this.fOverride = mappingOverride;
	}
	
}
