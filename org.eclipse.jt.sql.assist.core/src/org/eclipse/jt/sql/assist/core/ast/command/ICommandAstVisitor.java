package org.eclipse.jt.sql.assist.core.ast.command;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

public interface ICommandAstVisitor<TResult,TData> extends IAstVisitor {

	public TResult visitInsertStatement(InsertStatement ast, TData data) throws Throwable;
	public TResult visitInsertDeclaration(InsertDeclaration ast, TData data) throws Throwable;
	public TResult visitAssignStatement(AssignStatement ast, TData data) throws Throwable;
	public TResult visitUpdateStatement(UpdateStatement ast, TData data) throws Throwable;
	public TResult visitUpdateDeclaration(UpdateDeclaration ast, TData data) throws Throwable;
	public TResult visitDeleteStatement(DeleteStatement ast, TData data) throws Throwable;
	public TResult visitDeleteDeclaration(DeleteDeclaration ast, TData data) throws Throwable;
}
