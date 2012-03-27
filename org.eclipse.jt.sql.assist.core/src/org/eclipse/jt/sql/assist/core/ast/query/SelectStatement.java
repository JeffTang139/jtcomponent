/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;


/**
 * @author Jeff Tang
 *
 */
public class SelectStatement extends Statement implements IQueryAstNode{
	
	public static final String SELECT_WORD = "select";
	
	protected boolean fDistinct;
	protected List<DerivedColumn> fColumns;
	
	public SelectStatement(ISourcePosition position) {
		super(position);
	}


	/**
	 * @return the fDistinct
	 */
	public boolean isDistinct() {
		return fDistinct;
	}

	/**
	 * @param distinct the fDistinct to set
	 */
	public void setDistinct(boolean distinct) {
		fDistinct = distinct;
	}
	
	public List<DerivedColumn> getDerivedColumns() {
		return fColumns;
	}
	
	public void add(DerivedColumn column) {
		if(fColumns==null) fColumns=new ArrayList<DerivedColumn>();
		this.fColumns.add(column);
		this.updatePosition(column);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.SELECT_STATEMENT;
	}


	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitSelectStatement(this, data);
	}

	public String getTitle() {
		return SELECT_WORD;
	}
}
