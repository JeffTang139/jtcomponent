/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IDataSet;
import org.eclipse.jt.sql.assist.core.ast.IScopeStatement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class SubQueryStatement extends QueryStatementBase 
		implements IQueryAstNode, IScopeStatement, IDataSet {

	public static final String SUBQUERY_WORD="subquery";

	protected TokenNode fAs;
	protected TokenNode fAlias;
	protected boolean fForUpdate;

	public SubQueryStatement(ISourcePosition position) {
		super(position);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.SUB_QUERY;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitSubQueryStatement(this, data);
	}

	public String getTitle() {
		return SUBQUERY_WORD;
	}

	public TokenNode getAliasTarget() {
		return null;
	}

	public TokenNode getAlias() {
		return fAlias;
	}

	public void setAlias(TokenNode alias) {
		fAlias= alias;
		this.updatePosition(alias);
		
	}

	public TokenNode getAs() {
		return fAs;
	}

	public void setAs(TokenNode as) {
		fAs = as;
	}

	public boolean isForUpdate() {
		return fForUpdate;
	}
	
	public void setForUpdate(boolean forUpdate, ISourcePosition pos) {
		this.fForUpdate = forUpdate;
		this.updatePosition(pos);
	}
}
