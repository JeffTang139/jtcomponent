/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.Statement;


/**
 * @author Jeff Tang
 *
 */
public class WhereStatement extends Statement implements IQueryAstNode{
	
	public static final String WHERE_WORD = "where";
	

	protected ConditionExpression fConditionExp;

	public WhereStatement(ISourcePosition position, ConditionExpression conditionExp) {
		super(position);
		this.fConditionExp=conditionExp;
	}
	
	/**
	 * @return the fConditionExp
	 */
	public ConditionExpression getConditionExpression() {
		return fConditionExp;
	}

	/**
	 * @param conditionExp the fConditionExp to set
	 */
	public void setConditionExpression(ConditionExpression conditionExp) {
		fConditionExp = conditionExp;
		this.updatePosition(fConditionExp);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.WHERE_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitWhereStatement(this, data);
	}

	public String getTitle() {
		return WHERE_WORD;
	}
}
