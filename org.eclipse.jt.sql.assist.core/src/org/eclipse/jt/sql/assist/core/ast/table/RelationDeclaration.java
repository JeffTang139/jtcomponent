/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;

/**
 * @author Jeff Tang
 *
 */
public class RelationDeclaration extends Declaration implements ITableAstNode {

	protected TokenNode fTo;
	protected TokenNode fTable;
	protected TokenNode fOn;
	protected ConditionExpression fCondition;
	
	/**
	 * @param position
	 * @param name
	 */
	public RelationDeclaration(TokenNode name) {
		super(null, name);
	}
	
	public TokenNode getTo() {
		return fTo;
	}

	public void setTo(TokenNode to) {
		this.fTo = to;
		this.updatePosition(to);
	}

	public TokenNode getTable() {
		return fTable;
	}

	public void setTable(TokenNode table) {
		this.fTable = table;
		this.updatePosition(table);
	}

	public TokenNode getOn() {
		return fOn;
	}

	public void setOn(TokenNode on) {
		this.fOn = on;
		this.updatePosition(on);
	}

	public ConditionExpression getCondition() {
		return fCondition;
	}

	public void setCondition(ConditionExpression condition) {
		this.fCondition = condition;
		this.updatePosition(condition);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitRelationDeclaration(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.RELATION_DECLARATION;
	}

}
