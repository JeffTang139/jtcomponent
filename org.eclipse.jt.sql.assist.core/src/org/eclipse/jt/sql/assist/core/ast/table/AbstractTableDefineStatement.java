/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class AbstractTableDefineStatement extends TableDefineStatementBase
		implements ITableAstNode {

	/**
	 * @param position
	 */
	public AbstractTableDefineStatement(ISourcePosition position) {
		super(position);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitAbstractTableDefineStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.ABSTRACT_TABLE_DEFINE_STATEMENT;
	}

}
