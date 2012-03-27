/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;


/**
 * @author Jeff Tang
 * 
 */
public class TableRelation extends TableReference 
		implements IQueryAstNode {
	
	public final static String SEPARATOR=".";

	protected TableRefReference fTableRefRef;

	public TableRelation(ISourcePosition begin, TableRefReference tableRefRef, TokenNode relationName, boolean forUpdate, ISourcePosition end) {
		super(begin, relationName, forUpdate, end);
		this.fTableRefRef = tableRefRef;
	}

	/**
	 * @return the fTableRefRef
	 */
	public TableRefReference getTableRefReference() {
		return fTableRefRef;
	}

	/**
	 * @param tableRefRef
	 *            the fTableRefRef to set
	 */
	public void setTableRefReference(TableRefReference tableRefRef) {
		fTableRefRef = tableRefRef;
		this.updatePosition(fTableRefRef);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.TABLE_RELATION;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableRelation(this, data);
	}

	@Override
	public String getTitle() {
		if(fAlias!=null) return fAlias.getTexture();
		return fTableRefRef!=null?fTableRefRef.getTargetName()+SEPARATOR+fTarget.getTexture():fTarget.getTexture();
	}
}
