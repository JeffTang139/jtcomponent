/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;


/**
 * @author Jeff Tang
 *
 */
public class CommandAstWalker extends AbstractAstWalker implements ICommandAstWalker {

	public CommandAstWalker() {
		this(null);
	}
	
	public CommandAstWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterAssignStatement(org.eclipse.jt.sql.assist.core.ast.command.AssignStatement)
	 */
	public boolean enterAssignStatement(AssignStatement ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterDeleteDeclaration(org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration)
	 */
	public boolean enterDeleteDeclaration(DeleteDeclaration ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterDeleteStatement(org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement)
	 */
	public boolean enterDeleteStatement(DeleteStatement ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterInsertDeclaration(org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration)
	 */
	public boolean enterInsertDeclaration(InsertDeclaration ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterInsertStatement(org.eclipse.jt.sql.assist.core.ast.command.InsertStatement)
	 */
	public boolean enterInsertStatement(InsertStatement ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterUpdateDeclaration(org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration)
	 */
	public boolean enterUpdateDeclaration(UpdateDeclaration ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#enterUpdateStatement(org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement)
	 */
	public boolean enterUpdateStatement(UpdateStatement ast) {

		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitAssignStatement(org.eclipse.jt.sql.assist.core.ast.command.AssignStatement)
	 */
	public boolean exitAssignStatement(AssignStatement ast) {

		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitDeleteDeclaration(org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration)
	 */
	public boolean exitDeleteDeclaration(DeleteDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitDeleteStatement(org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement)
	 */
	public boolean exitDeleteStatement(DeleteStatement ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitInsertDeclaration(org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration)
	 */
	public boolean exitInsertDeclaration(InsertDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitInsertStatement(org.eclipse.jt.sql.assist.core.ast.command.InsertStatement)
	 */
	public boolean exitInsertStatement(InsertStatement ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitUpdateDeclaration(org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration)
	 */
	public boolean exitUpdateDeclaration(UpdateDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker#exitUpdateStatement(org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement)
	 */
	public boolean exitUpdateStatement(UpdateStatement ast) {
		return internalExitGeneral(ast);
	}

}
