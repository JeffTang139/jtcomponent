/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.internal.util.AstUtil;


/**
 * @author Jeff Tang
 *
 */
public class TableReferenceStatement extends Statement implements IQueryAstNode{
	
	protected TableReferenceStatement fPrimaryTable;
	
	public TableReferenceStatement(ISourcePosition position, TableReferenceStatement primaryTable) {
		super(position);
		fPrimaryTable=primaryTable;
	}

	/**
	 * @return the fPrimaryTable
	 */
	public TableReferenceStatement getPrimaryTable() {
		return fPrimaryTable;
	}

	/**
	 * @param primaryTable the fPrimaryTable to set
	 */
	public void setPrimaryTable(TableReferenceStatement primaryTable) {
		fPrimaryTable = primaryTable;
		this.updatePosition(fPrimaryTable);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.TABLE_REFERENCE_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableReferenceStatement(this, data);
	}

	public String getTitle() {
		return fPrimaryTable!=null?fPrimaryTable.getTitle():null;
	}
	
	@Override
	public boolean structuralEquals(IAstNode other) {
		if(this==other) return true;
		if(other!=null&&this.getClass().equals(other.getClass())) {
			return AstUtil.equals(this.fPrimaryTable, ((TableReferenceStatement)other).getPrimaryTable());
		}
		return false;
	}
}
