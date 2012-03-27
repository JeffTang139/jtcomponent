/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;


/**
 * @author Jeff Tang
 *
 */
public class MappingAccessor<TScope extends AbstractMappingDataScope<TScope>> 
			extends QueryAccessor<TScope> 
			implements IMappingAccessor<TScope> {
	
	public MappingAccessor() {
		super();
	}
	
	public MappingAccessor(IAstAccessor<TScope> baseAccessor) {
		super(baseAccessor);
	}

	
	

	public boolean enterMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterMappingOverride(MappingOverride ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterMappingStatement(MappingStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitMappingOverride(MappingOverride ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitMappingStatement(MappingStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

}
