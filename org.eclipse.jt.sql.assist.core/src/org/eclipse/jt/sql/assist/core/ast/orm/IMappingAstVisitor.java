package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

public interface IMappingAstVisitor<TResult,TData> extends IAstVisitor {

	public TResult visitMappingDeclaration(MappingDeclaration ast, TData data) throws Throwable;
	public TResult visitMappingStatement(MappingStatement ast, TData data) throws Throwable;
	public TResult visitMappingOverride(MappingOverride ast, TData data) throws Throwable;
}
