package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.visit.IAstWalker;

public interface IMappingAstWalker extends IAstWalker {
	public boolean enterMappingDeclaration(MappingDeclaration ast);
	public boolean enterMappingStatement(MappingStatement ast);
	public boolean enterMappingOverride(MappingOverride ast);

	public boolean exitMappingDeclaration(MappingDeclaration ast);
	public boolean exitMappingStatement(MappingStatement ast);
	public boolean exitMappingOverride(MappingOverride ast);
}
