/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;


/**
 * @author Jeff Tang
 *
 */
public interface ICommandAccessor<TScope extends AbstractCommandDataScope<TScope>> extends IAstAccessor<TScope> {

	public boolean enterInsertStatement(InsertStatement ast		, TScope scope);
	public boolean enterInsertDeclaration(InsertDeclaration ast	, TScope scope);
	public boolean enterAssignStatement(AssignStatement ast		, TScope scope);
	public boolean enterUpdateStatement(UpdateStatement ast		, TScope scope);
	public boolean enterUpdateDeclaration(UpdateDeclaration ast , TScope scope);
	public boolean enterDeleteStatement(DeleteStatement ast 	, TScope scope);
	public boolean enterDeleteDeclaration(DeleteDeclaration ast , TScope scope);
	
	
	public boolean exitInsertStatement(InsertStatement ast		, TScope scope);  
	public boolean exitInsertDeclaration(InsertDeclaration ast	, TScope scope);  
	public boolean exitAssignStatement(AssignStatement ast		, TScope scope);  
	public boolean exitUpdateStatement(UpdateStatement ast		, TScope scope);  
	public boolean exitUpdateDeclaration(UpdateDeclaration ast 	, TScope scope);  
	public boolean exitDeleteStatement(DeleteStatement ast 		, TScope scope);  
	public boolean exitDeleteDeclaration(DeleteDeclaration ast 	, TScope scope);  
}
