/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;



/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractLayeredGeneralAccessor<TScope extends AbstractGeneralDataScope<TScope>>
		extends AbstractAstAccessor<TScope> 
		implements IGeneralAccessor<TScope> {

	public AbstractLayeredGeneralAccessor(IAstAccessor<TScope> superAccessor) {
		super();
		this.setSuperLayerAccessor(superAccessor);
	}
	
	public AbstractLayeredGeneralAccessor(IAstAccessor<TScope> superAccessor, IAstAccessor<TScope> baseAccessor) {
		super(baseAccessor);
		this.setSuperLayerAccessor(superAccessor);
	}

	protected void setSuperLayerAccessor(IAstAccessor<TScope> superAccessor) {
		// do nothing
	}
}
