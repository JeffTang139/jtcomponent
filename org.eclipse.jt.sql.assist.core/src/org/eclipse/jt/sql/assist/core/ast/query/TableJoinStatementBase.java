/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public abstract class TableJoinStatementBase extends TableReferenceStatement{
	
	public final static int TYPE_INNER=0;
	public final static int TYPE_LEFT_OUTER=1;
	public final static int TYPE_RIGHT_OUTER=2;
	public final static int TYPE_FULL_OUTER=3;
	
	public static int getJoinType(String joinType) {
		if("right".equalsIgnoreCase(joinType)) return TYPE_RIGHT_OUTER;
		if("left".equalsIgnoreCase(joinType)) return TYPE_LEFT_OUTER;
		if("full".equalsIgnoreCase(joinType)) return TYPE_FULL_OUTER;
		return TYPE_INNER;
	}
	
	public static String getJoinTitle(int joinType, String joinName) {
		switch(joinType) {
		case TYPE_INNER: return joinName;
		case TYPE_LEFT_OUTER: return "left "+joinName;
		case TYPE_RIGHT_OUTER: return "right "+joinName;
		case TYPE_FULL_OUTER: return "full "+joinName;
		default: return joinName;
		}
	}
	
	protected int fJoinType;
	protected ISourcePosition fJoinPosition;

	
	public TableJoinStatementBase(
			ISourcePosition begin,
			TableReferenceStatement primaryTable,
			int joinType,
			ISourcePosition joinPosition,
			ISourcePosition end) {
		super(union(begin,end), primaryTable);
		fJoinType=joinType;
		fJoinPosition=joinPosition;
		this.updatePosition(fJoinPosition);
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
	 * @return the fJoinPosition
	 */
	public ISourcePosition getJoinPosition() {
		return fJoinPosition;
	}
	
	/**
	 * @param joinPosition the fJoinPosition to set
	 */
	public void setJoinPosition(ISourcePosition joinPosition) {
		fJoinPosition = joinPosition;
		this.updatePosition(fJoinPosition);
	}

}
