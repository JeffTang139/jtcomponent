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
public class FromStatement extends Statement implements IQueryAstNode{
	
	public static final String FROM_WORD="from";

	public FromStatement(ISourcePosition position) {
		super(position);
	}

	protected List<TableReferenceStatement> fTables;
	
	public List<TableReferenceStatement> getTableReferences() {
		return fTables;
	}
	
	public void add(TableReferenceStatement column) {
		if(fTables==null) fTables=new ArrayList<TableReferenceStatement>();
		this.fTables.add(column);
		this.updatePosition(column);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.FROM_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitFromStatement(this, data);
	}
	
	public String getTitle() {
		return FROM_WORD;
	}
}
