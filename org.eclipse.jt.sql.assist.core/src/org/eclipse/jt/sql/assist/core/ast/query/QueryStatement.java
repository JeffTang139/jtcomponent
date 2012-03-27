package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;

public class QueryStatement extends QueryStatementBase implements IQueryAstNode{

	public static final String QUERY_WORD="query";

	public QueryStatement(ISourcePosition position) {
		super(position);
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitQueryStatement(this, data);
	}

	public int getNodeKind() {
		return QueryAstKinds.QUERY_STATEMENT;
	}
	
	public String getTitle() {
		return QUERY_WORD;
	}
}
