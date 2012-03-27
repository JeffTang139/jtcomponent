/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.highlight;

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


/**
 * @author Jeff Tang
 *
 */
public class CommandHighLishtDetector extends QueryHighLightDetector
		implements ICommandAstVisitor<Object, Object>  {

	public static CommandHighLishtDetector getInstance() {
		return new CommandHighLishtDetector();
	}
	
	public CommandHighLishtDetector() {
	}
	

	@Override
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {
		if(ast instanceof ICommandAstNode) {
			return ((ICommandAstNode)ast).accept(this, data);
		} else {
			return super.visitGeneral(ast, data);
		}
	}
	

	public Object visitAssignStatement(AssignStatement ast, Object data)
			throws Throwable {
		
		return null;
	}

	public Object visitDeleteDeclaration(DeleteDeclaration ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitDeleteStatement(DeleteStatement ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitInsertDeclaration(InsertDeclaration ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitInsertStatement(InsertStatement ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitUpdateDeclaration(UpdateDeclaration ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitUpdateStatement(UpdateStatement ast, Object data)
			throws Throwable {
		return null;
	}

}
