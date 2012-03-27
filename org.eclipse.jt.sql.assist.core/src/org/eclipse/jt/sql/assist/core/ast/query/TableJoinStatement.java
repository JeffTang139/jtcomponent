/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;


/**
 * @author Jeff Tang
 *
 */
public class TableJoinStatement extends TableJoinStatementBase implements IQueryAstNode{
	
	public static final String JOIN_WORD="join";
	
	protected TableReferenceStatement fSecondaryTable;
	protected ConditionExpression fCondition;


	public TableJoinStatement(
			ISourcePosition begin,
			TableReferenceStatement primaryTable,
			int joinType,
			ISourcePosition joinPosition,
			TableReferenceStatement secondaryTable,
			ConditionExpression condition,
			ISourcePosition end) {
		super(begin, primaryTable, joinType, joinPosition, end);
		fSecondaryTable=secondaryTable;
		fCondition=condition;
	}
	/**
	 * @return the fJoinType
	 */
	public int getJoinType() {
		return fJoinType;
	}

	/**
	 * @param joinType the fJoinType to set
	 */
	public void setJoinType(int joinType, ISourcePosition pos) {
		this.updatePosition(pos);
		fJoinType = joinType;
	}

	/**
	 * @return the fCondition
	 */
	public ConditionExpression getCondition() {
		return fCondition;
	}

	/**
	 * @param condition the fCondition to set
	 */
	public void setCondition(ConditionExpression condition) {
		fCondition = condition;
		this.updatePosition(fCondition);
	}

	/**
	 * @return the fSecondaryTable
	 */
	public TableReferenceStatement getSecondaryTable() {
		return fSecondaryTable;
	}

	/**
	 * @param secondaryTable the fSecondaryTable to set
	 */
	public void setSecondaryTable(TableReferenceStatement secondaryTable) {
		fSecondaryTable = secondaryTable;
		this.updatePosition(fSecondaryTable);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.TABLE_JOIN_STATEMENT;
	}
	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableJoinStatement(this, data);
	}

	@Override
	public String getTitle() {
		return getJoinTitle(fJoinType,JOIN_WORD);
	}
}
