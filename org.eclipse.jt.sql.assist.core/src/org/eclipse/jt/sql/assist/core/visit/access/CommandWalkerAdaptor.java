/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstWalker;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;
import org.eclipse.jt.sql.assist.core.visit.walk.CommandAstWalker;


/**
 * @author Jeff Tang
 *
 */
public class CommandWalkerAdaptor<TScope extends AbstractCommandDataScope<TScope>>
	extends QueryWalkerAdaptor<TScope>
	implements ICommandAccessor<TScope>  {

	private ICommandAstWalker fCommandAstWalker;
	
	public CommandWalkerAdaptor(IAstWalker walker) {
		super(walker);
	}

	@Override
	public void setWalker(IAstWalker walker) {
		super.setWalker(walker);
		if(walker instanceof ICommandAstWalker) {
			fCommandAstWalker=(ICommandAstWalker)walker;
		} else {
			fCommandAstWalker =new CommandAstWalker();
		}
	}

	public boolean enterAssignStatement(AssignStatement ast, TScope scope) {
		return fCommandAstWalker.enterAssignStatement(ast);
	}

	public boolean enterDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return fCommandAstWalker.enterDeleteDeclaration(ast);
	}

	public boolean enterDeleteStatement(DeleteStatement ast, TScope scope) {
		return fCommandAstWalker.enterDeleteStatement(ast);
	}

	public boolean enterInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return fCommandAstWalker.enterInsertDeclaration(ast);
	}

	public boolean enterInsertStatement(InsertStatement ast, TScope scope) {
		return fCommandAstWalker.enterInsertStatement(ast);
	}

	public boolean enterUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return fCommandAstWalker.enterUpdateDeclaration(ast);
	}

	public boolean enterUpdateStatement(UpdateStatement ast, TScope scope) {
		return fCommandAstWalker.enterUpdateStatement(ast);
	}

	public boolean exitAssignStatement(AssignStatement ast, TScope scope) {
		return fCommandAstWalker.exitAssignStatement(ast);
	}

	public boolean exitDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return fCommandAstWalker.exitDeleteDeclaration(ast);
	}

	public boolean exitDeleteStatement(DeleteStatement ast, TScope scope) {
		return fCommandAstWalker.exitDeleteStatement(ast);
	}

	public boolean exitInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return fCommandAstWalker.exitInsertDeclaration(ast);
	}

	public boolean exitInsertStatement(InsertStatement ast, TScope scope) {
		return fCommandAstWalker.exitInsertStatement(ast);
	}

	public boolean exitUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return fCommandAstWalker.exitUpdateDeclaration(ast);
	}

	public boolean exitUpdateStatement(UpdateStatement ast, TScope scope) {
		return fCommandAstWalker.exitUpdateStatement(ast);
	}

}
