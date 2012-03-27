/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class NormalTableDefineStatement extends TableDefineStatementBase
		implements ITableAstNode {

	/**
	 * @param position
	 */
	public NormalTableDefineStatement(ISourcePosition position) {
		super(position);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitNormalTableDefineStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.NORMAL_TABLE_DEFINE_STATEMENT;
	}

}
