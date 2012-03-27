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
public class AbstractTableDeclaration extends TableDeclarationBase<AbstractTableDefineStatement> 
		implements ITableAstNode, IScopeStatement {

	public AbstractTableDeclaration(TokenNode define, TokenNode name,
			ISourcePosition end) {
		super(define, name, end);
	}

	public int getNodeKind() {
		return TableAstKinds.ABSTRACT_TABLE_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitAbstractTableDeclaration(this, data);
	}

}
