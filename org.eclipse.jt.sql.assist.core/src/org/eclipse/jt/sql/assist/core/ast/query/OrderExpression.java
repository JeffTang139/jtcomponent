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
public class OrderExpression extends ValueExpression implements IQueryAstNode{
	
	public static final String DESC_WORD="desc";
	public static final String ASC_WORD="asc";
	
	protected boolean fDescrease;

	public OrderExpression(ISourcePosition position, ValueExpression primary) {
		super(position, primary);
	}

	/**
	 * @return the fIsDescrease
	 */
	public boolean isDescrease() {
		return fDescrease;
	}

	/**
	 * @param isDescrease the fIsDescrease to set
	 */
	public void setDescrease(boolean isDescrease, ISourcePosition pos) {
		this.updatePosition(pos);
		fDescrease = isDescrease;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.ORDER_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitOrderExpression(this, data);
	}

	public String getTitle() {
		return fDescrease?DESC_WORD:ASC_WORD;
	}

	@Override
	public boolean isStatic() {
		return fPrimary!=null?fPrimary.isStatic():false;
	}
}
