/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.sql.assist.core.ast.Reference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;

/**
 * @author Jeff Tang
 *
 */
public class TableColumnReference extends Reference implements ITableAstNode {

	protected TokenNode fTable;
	protected TokenNode fColumn;

	/**
	 * @param position
	 * @param targetName
	 */
	public TableColumnReference(TokenNode table, TokenNode column) {
		super(union(table.getPosition(), column!=null? column.getPosition() : null),
				column!=null? column.getTexture():null);
	}
	
	public TokenNode getTable() {
		return fTable;
	}

	public TokenNode getColumn() {
		return fColumn;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableColumnReference(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.TABLE_COLUMN_REFERENCE;
	}

}
