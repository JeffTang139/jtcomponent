/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor;
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
public abstract class CommandCompletionDetector<TScope extends AbstractCommandDataScope<TScope>> 
		extends QueryCompletionDetector<TScope>
		implements ICommandAstVisitor<Object, Boolean> {

	public static final class RealCommandCompletionDetector extends CommandCompletionDetector<CommandDataScope> {

		public static RealCommandCompletionDetector getInstance() {
			return new RealCommandCompletionDetector();
		}
		
		private RealCommandCompletionDetector() {}
		
		@Override
		protected CommandDataScope createDefaultScope() {
			return CommandDataScope.getInstance();
		}
		
	}
	
	public static CommandCompletionDetector<?> getInstance() {
		return new RealCommandCompletionDetector();
	}
	
	@Override
	protected void clean() {
		super.clean();
	}
	
	@Override
	public Object visitGeneral(IAstNode ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof ICommandAstNode) {
			return ((ICommandAstNode)ast).accept(this, forceIgnore);
		} else {
			return super.visitGeneral(ast, forceIgnore);
		}
	}

	public Object visitAssignStatement(AssignStatement ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitDeleteDeclaration(DeleteDeclaration ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitDeleteStatement(DeleteStatement ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitInsertDeclaration(InsertDeclaration ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitInsertStatement(InsertStatement ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitUpdateDeclaration(UpdateDeclaration ast, Boolean data)
			throws Throwable {
		return null;
	}

	public Object visitUpdateStatement(UpdateStatement ast, Boolean data)
			throws Throwable {
		return null;
	}

}
