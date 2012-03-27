/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IScopeStatement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class UpdateDeclaration extends CommandDeclarationBase<UpdateStatement> implements IScopeStatement {

	protected UpdateStatement fUpdate;

	public UpdateDeclaration(TokenNode define, TokenNode name, ISourcePosition end) {
		super(define,name,end);
	}

	public int getNodeKind() {
		return CommandAstKinds.COMMAND_UPDATE_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitUpdateDeclaration(this, data);
	}

}
