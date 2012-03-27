/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class ExistsPredicate extends ConditionExpression implements IQueryConditionNode {
	
	public final static String WORD_EXISTS="exists";
	
	protected TokenNode fExists;

	protected SubQueryStatement fSubquery;

	public ExistsPredicate(TokenNode exists, SubQueryStatement subquery, ISourcePosition end) {
		super(union(exists.getPosition(),end));
		this.updatePosition(subquery);
		fExists = exists;
		fSubquery = subquery;
	}
	
	public TokenNode getExists() {
		return fExists;
	}

	public void setExists(TokenNode exists) {
		this.fExists = exists;
	}

	public SubQueryStatement getSubquery() {
		return fSubquery;
	}

	public void setSubquery(SubQueryStatement subquery) {
		this.updatePosition(subquery);
		this.fSubquery = subquery;
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.EXISTS_PREDICATE;
	}

	public <TResult, TData> TResult accept(
			IQueryConditionVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitExistsPredicate(this, data);
	}
	
	public String getTitle() {
		return WORD_EXISTS;
	}
}
