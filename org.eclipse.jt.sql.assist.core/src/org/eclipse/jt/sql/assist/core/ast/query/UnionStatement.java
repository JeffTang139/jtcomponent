package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.sql.assist.core.ast.TokenNode;

public class UnionStatement extends QueryStatementBase implements IQueryAstNode{

	public static final String UNION_WORD="union";

	protected TokenNode fUnion;

	protected TokenNode fAll;
	
	
	public UnionStatement(TokenNode union, TokenNode all) {
		super(union(union.getPosition(),all!=null?all.getPosition():null));
		fUnion = union;
		fAll = all;
	}
	
	public TokenNode getUnion() {
		return fUnion;
	}

	public void setUnion(TokenNode union) {
		this.updatePosition(union);
		this.fUnion = union;
	}

	public TokenNode getAll() {
		return fAll;
	}

	public void setAll(TokenNode all) {
		this.updatePosition(all);
		this.fAll = all;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitUnionStatement(this, data);
	}

	public int getNodeKind() {
		return QueryAstKinds.UNION_STATEMENT;
	}
	
	public String getTitle() {
		return UNION_WORD;
	}
}
