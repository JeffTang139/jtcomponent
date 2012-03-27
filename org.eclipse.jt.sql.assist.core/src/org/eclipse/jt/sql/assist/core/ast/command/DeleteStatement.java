/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement;
import org.eclipse.jt.sql.assist.core.ast.query.WhereStatement;


/**
 * @author Jeff Tang
 *
 */
public class DeleteStatement extends Statement implements ICommandAstNode {

	public static final String DELETE_WORD = "delete";
	public static final String FROM_WORD = "from";
	
	protected TokenNode fDelete;
	protected TokenNode fFrom;
	protected TableReferenceStatement fTable;
	protected WhereStatement fWhere;
	
	public DeleteStatement(TokenNode delete, TokenNode from,  ISourcePosition end) {
		super(union(delete.getPosition(), end));
		fDelete = delete;
		fFrom = from;
	}
	
	public TableReferenceStatement getTable() {
		return fTable;
	}

	public void setTable(TableReferenceStatement table) {
		this.fTable = table;
		this.updatePosition(table);
	}

	public WhereStatement getWhere() {
		return fWhere;
	}

	public void setWhere(WhereStatement where) {
		this.fWhere = where;
		this.updatePosition(where);
	}

	public TokenNode getDelete() {
		return fDelete;
	}

	public TokenNode getFrom() {
		return fFrom;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode#accept(org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitDeleteStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return CommandAstKinds.COMMAND_DELETE_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return DELETE_WORD;
	}

}
