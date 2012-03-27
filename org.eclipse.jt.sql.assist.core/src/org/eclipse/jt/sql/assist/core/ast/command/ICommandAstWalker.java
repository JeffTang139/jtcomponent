/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

/**
 * @author Jeff Tang
 *
 */
public interface ICommandAstWalker {

	public boolean enterInsertStatement(InsertStatement ast		);
	public boolean enterInsertDeclaration(InsertDeclaration ast	);
	public boolean enterAssignStatement(AssignStatement ast		);
	public boolean enterUpdateStatement(UpdateStatement ast		);
	public boolean enterUpdateDeclaration(UpdateDeclaration ast );
	public boolean enterDeleteStatement(DeleteStatement ast 	);
	public boolean enterDeleteDeclaration(DeleteDeclaration ast );
	
    
	public boolean exitInsertStatement(InsertStatement ast		);  
	public boolean exitInsertDeclaration(InsertDeclaration ast	);  
	public boolean exitAssignStatement(AssignStatement ast		);  
	public boolean exitUpdateStatement(UpdateStatement ast		);  
	public boolean exitUpdateDeclaration(UpdateDeclaration ast 	);  
	public boolean exitDeleteStatement(DeleteStatement ast 		);  
	public boolean exitDeleteDeclaration(DeleteDeclaration ast 	);  
}
