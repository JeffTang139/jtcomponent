/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class TableRelationStatement extends TableJoinStatementBase implements IQueryAstNode{

	public static final String RELATE_WORD="relate";
	
	protected TableRelation fTableRelation;

	public TableRelationStatement(
			ISourcePosition begin, 
			TableReferenceStatement primaryTable, 
			int joinType,
			ISourcePosition joinPosition,
			TableRelation tableRelation, 
			ISourcePosition end) {
		super(begin, primaryTable, joinType, joinPosition, end);
		this.fTableRelation=tableRelation;
	}
	
	/**
	 * @return the fTableRelation
	 */
	public TableRelation getTableRelation() {
		return fTableRelation;
	}

	/**
	 * @param tableRelation the fTableRelation to set
	 */
	public void setTableRelation(TableRelation tableRelation) {
		fTableRelation = tableRelation;
		this.updatePosition(fTableRelation);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.TABLE_RELATION_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableRelationStatement(this, data);
	}
	
	@Override
	public String getTitle() {
		return getJoinTitle(fJoinType,RELATE_WORD);
	}
}
