package org.eclipse.jt.sql.assist.core.ast.command;

public interface ICommandAstNode {
	public <TResult, TData> TResult accept(ICommandAstVisitor<TResult, TData> visitor, TData data) throws Throwable;
}
