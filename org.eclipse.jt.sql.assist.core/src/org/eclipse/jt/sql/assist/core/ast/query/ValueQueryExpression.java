/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class ValueQueryExpression 
		extends ValueExpression 
		implements IQueryValueNode {

	protected SubQueryStatement fSubquery;
	
	/**
	 * @param position
	 */
	public ValueQueryExpression(ISourcePosition begin, SubQueryStatement subquery, ISourcePosition end) {
		super(union(union(begin, subquery.getPosition()), end));
		fSubquery = subquery;
	}
	
	public SubQueryStatement getSubquery() {
		return fSubquery;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.ValueExpression#isStatic()
	 */
	@Override
	public boolean isStatic() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.VALUE_QUERY_EXPRESSION;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return SubQueryStatement.SUBQUERY_WORD;
	}

	public <TResult, TData> TResult accept(
			IQueryValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitValueQueryExpression(this, data);
	}

}
