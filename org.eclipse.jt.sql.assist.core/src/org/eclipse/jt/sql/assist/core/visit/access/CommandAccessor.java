/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;


/**
 * @author Jeff Tang
 *
 */
public class CommandAccessor<TScope extends AbstractCommandDataScope<TScope>>
		extends QueryAccessor<TScope> implements
		ICommandAccessor<TScope> {
	

	public CommandAccessor() {
		super();
	}

	public CommandAccessor(IAstAccessor<TScope> baseAccessor) {
		super(baseAccessor);
	}

	public boolean enterAssignStatement(AssignStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterDeleteStatement(DeleteStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterInsertStatement(InsertStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean enterUpdateStatement(UpdateStatement ast, TScope scope) {
		return internalEnterGeneral(ast, scope);
	}

	public boolean exitAssignStatement(AssignStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitDeleteStatement(DeleteStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitInsertStatement(InsertStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

	public boolean exitUpdateStatement(UpdateStatement ast, TScope scope) {
		return internalExitGeneral(ast, scope);
	}

}
