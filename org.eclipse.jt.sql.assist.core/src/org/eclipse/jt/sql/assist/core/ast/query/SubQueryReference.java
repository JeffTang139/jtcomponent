/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;

/**
 * @author Jeff Tang
 *
 */
public class SubQueryReference extends ResultSetReferenceBase implements
		IResultSetReference, IQueryAstNode {

	protected SubQueryStatement fSubQuery;


	/**
	 * @param position
	 * @param primaryTable
	 */
	public SubQueryReference(SubQueryStatement subQuery, boolean forUpdate) {
		super(subQuery.getPosition(), forUpdate, null);
		fSubQuery = subQuery;
	}

	/**
	 * 所引用的子查询
	 * @return
	 */
	public SubQueryStatement getSubquery() {
		return fSubQuery;
	}

	/**
	 * 所引用的子查询
	 * @param subquery
	 */
	public void setSubquery(SubQueryStatement subquery) {
		this.updatePosition(subquery);
		this.fSubQuery = subquery;
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IAliasHolder#getAliasTarget()
	 */
	public TokenNode getAliasTarget() {
		return null;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.SUBQUERY_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitSubQueryReference(this, data);
	}

	public String getTitle() {
		return fSubQuery!=null ? fSubQuery.getTitle() : null;
	}

	public String getTargetName() {
		return fAlias!=null ? fAlias.getTexture() : null;
	}
}
