/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;
import org.eclipse.jt.sql.assist.core.data.CommandDataScope;

/**
 * @author Jeff Tang
 *
 */
public abstract class CommandSelectionDetector<TScope extends AbstractCommandDataScope<TScope>> 
		extends QuerySelectionDetector<TScope>
		implements ICommandAccessor<TScope> {


	public static final class RealCommandSelectionDetector extends CommandSelectionDetector<CommandDataScope> {

		public static RealCommandSelectionDetector getInstance() {
			return new RealCommandSelectionDetector();
		}
		
		@Override
		protected CommandDataScope createScope() {
			return CommandDataScope.getInstance();
		}

		@Override
		public int getSqlKind() {
			return DnaSql.COMMAND_DEFINE;
		}
		
	}
	
	public static CommandSelectionDetector<?> getInstance() {
		return new RealCommandSelectionDetector();
	}
	

	public boolean enterAssignStatement(AssignStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterDeleteDeclaration(DeleteDeclaration ast, TScope scope) {

		return enterGeneral(ast, scope);
	}

	public boolean enterDeleteStatement(DeleteStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterInsertStatement(InsertStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterUpdateStatement(UpdateStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitAssignStatement(AssignStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitDeleteStatement(DeleteStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitInsertStatement(InsertStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitUpdateStatement(UpdateStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

}
