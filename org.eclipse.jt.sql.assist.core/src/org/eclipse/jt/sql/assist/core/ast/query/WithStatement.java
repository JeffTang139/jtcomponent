/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class WithStatement extends Statement implements IQueryAstNode {

	public static final String WITH_WORD = "with";
	
	protected TokenNode fWithToken;

	protected List<SubQueryStatement> fSubquerys;
	
	/**
	 * @param position
	 */
	public WithStatement(TokenNode withToken, ISourcePosition end) {
		super(union(withToken.getPosition(), end));
		fWithToken = withToken;
		fSubquerys = new ArrayList<SubQueryStatement>();
	}
	
	public TokenNode getWithToken() {
		return fWithToken;
	}
	
	public List<SubQueryStatement> getSubquerys() {
		return fSubquerys;
	}
	
	public void addSubquery(SubQueryStatement subquery) {
		fSubquerys.add(subquery);
		this.updatePosition(subquery);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.WITH_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return WITH_WORD;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitWithStatement(this, data);
	}

}
