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
public class InsertDeclaration extends CommandDeclarationBase<InsertStatement> implements IScopeStatement {


	public InsertDeclaration(TokenNode define, TokenNode name, ISourcePosition end) {
		super(define,name,end);
	}

	public int getNodeKind() {
		return CommandAstKinds.COMMAND_INSERT_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitInsertDeclaration(this, data);
	}

}
