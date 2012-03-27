/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement;
import org.eclipse.jt.sql.assist.core.ast.query.WhereStatement;


/**
 * @author Jeff Tang
 *
 */
public class UpdateStatement extends Statement implements ICommandAstNode {

	public static final String UDDATE_WORD = "update";
	
	protected TokenNode fUpdate;
	protected TableReferenceStatement fTable;
	protected List<AssignStatement> fAssigns;
	protected WhereStatement fWhere;
	
	public UpdateStatement(TokenNode update, ISourcePosition end) {
		super(union(update.getPosition(), end));
		fUpdate = update;
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

	public TokenNode getUpdate() {
		return fUpdate;
	}

	public List<AssignStatement> getAssigns() {
		return fAssigns;
	}

	public void addAssign(AssignStatement assign) {
		if(fAssigns==null) {
			fAssigns = new ArrayList<AssignStatement>();
		}
		fAssigns.add(assign);
		this.updatePosition(assign);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode#accept(org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitUpdateStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return CommandAstKinds.COMMAND_UPDATE_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return UDDATE_WORD;
	}

}
