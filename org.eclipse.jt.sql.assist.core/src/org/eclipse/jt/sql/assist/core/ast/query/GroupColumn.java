/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class GroupColumn extends ValueExpression implements IQueryAstNode{
	
	public static final String GROUP_COLUMN_WORD = "column";

//	protected String fAlias;

	public GroupColumn(ISourcePosition position, ValueExpression primary) {
		super(position, primary);
	}
//
//	/**
//	 * @return the fAlias
//	 */
//	public String getAlias() {
//		return fAlias;
//	}
//
//	/**
//	 * @param alias the fAlias to set
//	 */
//	public void setAlias(String alias, ISourcePosition pos) {
//		this.updatePosition(pos);
//		fAlias = alias;
//	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.GROUP_COLUMN;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitGroupColumn(this, data);
	}
	
	public String getTitle() {
		return GROUP_COLUMN_WORD;
	}

	@Override
	public boolean isStatic() {
		return fPrimary!=null?fPrimary.isStatic():false;
	}
}
