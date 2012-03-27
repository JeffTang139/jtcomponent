/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IScopeStatement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class NormalTableDeclaration extends TableDeclarationBase<NormalTableDefineStatement>
		implements ITableAstNode, IScopeStatement {

	public NormalTableDeclaration(TokenNode define, TokenNode name,
			ISourcePosition end) {
		super(define, name, end);
	}

	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitNormalTableDeclaration(this, data);
	}

	public int getNodeKind() {
		return TableAstKinds.NORMAL_TABLE_DECLARATION;
	}
}
