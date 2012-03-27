/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstVisitor;


/**
 * @author Jeff Tang
 * 
 */
public interface IGeneralAstVisitor<TResult,TData> extends IAstVisitor {
	public TResult visitArgumentDeclaration(ArgumentDeclaration ast, TData data) throws Throwable;
	public TResult visitDataTypeReference(DataTypeReference ast, TData data) throws Throwable;
	public TResult visitTableRefReference(TableRefReference ast, TData data) throws Throwable;
	public TResult visitClassReference(ClassReference ast, TData data) throws Throwable;
} 
