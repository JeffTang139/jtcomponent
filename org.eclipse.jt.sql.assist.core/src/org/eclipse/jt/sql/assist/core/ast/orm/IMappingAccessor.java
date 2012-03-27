/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;


/**
 * @author Jeff Tang
 *
 */
public interface IMappingAccessor<TScope extends AbstractMappingDataScope<TScope>> extends IAstAccessor<TScope> {

	public boolean enterMappingDeclaration(MappingDeclaration ast, TScope scope);
	public boolean enterMappingStatement(MappingStatement ast, TScope scope);
	public boolean enterMappingOverride(MappingOverride ast, TScope scope);

	public boolean exitMappingDeclaration(MappingDeclaration ast, TScope scope);
	public boolean exitMappingStatement(MappingStatement ast, TScope scope);
	public boolean exitMappingOverride(MappingOverride ast, TScope scope);
} 
