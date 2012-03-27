/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;


/**
 * @author Jeff Tang
 *
 */
public class HierarchyPredicate extends ConditionExpression implements IQueryConditionNode{
	
	public final static String OPERATOR_PARENT_OF="parentof";
	public final static String OPERATOR_CHILD_OF="childof";
	public final static String OPERATOR_ANCESTOR_OF="ancestorof";
	public final static String OPERATOR_DESCENDANT_OF="descendantof";
	public final static String OPERATOR_IS_LEAF="isleaf";

	public final static String LIMIT_RELATIVE="relative";
	public final static String LIMIT_RANGE="range";
	
	public static final String USING_WORD = "using";

	protected TableRefReference fPrimaryTable;
	protected String fOperator;
	protected TableRefReference fSecondaryTable;
	protected TokenNode fUsing;
	protected TokenNode[] fHierarchys;

	protected ValueExpression fLimit;
	protected boolean fDirect;
	
	public HierarchyPredicate(
			ISourcePosition begin,
			TableRefReference primary,
			String operator,
			TableRefReference secondary,
			boolean direct,
			ISourcePosition end) {
		super(union(begin,end));
		fPrimaryTable=primary;
		fOperator=operator;
		fSecondaryTable=secondary;
		fDirect=direct;
	}

	/**
	 * @return the fDirect
	 */
	public boolean isDirect() {
		return fDirect;
	}
	/**
	 * @param direct the fDirect to set
	 */
	public void setDirect(boolean direct, ISourcePosition pos) {
		this.updatePosition(pos);
		fDirect = direct;
	}
	/**
	 * @return the fOperator
	 */
	public String getOperator() {
		return fOperator;
	}
	/**
	 * @param operator the fOperator to set
	 */
	public void setOperator(String operator) {
		fOperator = operator;
	}
	/**
	 * @return the fPrimaryTable
	 */
	public TableRefReference getPrimaryTable() {
		return fPrimaryTable;
	}

	/**
	 * @param primaryTable the fPrimaryTable to set
	 */
	public void setPrimaryTable(TableRefReference primaryTable) {
		fPrimaryTable = primaryTable;
		this.updatePosition(fPrimaryTable);
	}

	/**
	 * @return the fSecondaryTable
	 */
	public TableRefReference getSecondaryTable() {
		return fSecondaryTable;
	}

	/**
	 * @param secondaryTable the fSecondaryTable to set
	 */
	public void setSecondaryTable(TableRefReference secondaryTable) {
		fSecondaryTable = secondaryTable;
		this.updatePosition(fSecondaryTable);
	}
	/**
	 * @return the fUsing
	 */
	public TokenNode getUsing() {
		return fUsing;
	}
	/**
	 * @param using the fUsing to set
	 */
	public void setUsing(TokenNode using) {
		this.updatePosition(using);
		fUsing = using;
	}
	
	public TokenNode[] getHierarchys() {
		return fHierarchys;
	}

	public void setHierarchys(TokenNode[] hierarchys) {
		if(hierarchys!=null) {
			for(TokenNode node : hierarchys) {
				this.updatePosition(node);
			}
		}
		this.fHierarchys = hierarchys;
	}
	
	/**
	 * @return the fRelative
	 */
	public ValueExpression getLimit() {
		return fLimit;
	}

	/**
	 * @param relative the fRelative to set
	 */
	public void setLimit(TokenNode operator, ValueExpression limit) {
		fLimit = limit;
		if(fLimit!=null) fLimit.setUpperOperator(operator);
		this.updatePosition(operator);
		this.updatePosition(fLimit);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.HIERARCHY_PREDICATE;
	}
	public <TResult, TData> TResult accept(
			IQueryConditionVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitHierarchyPredicate(this, data);
	}

	public String getTitle() {
		return this.fOperator;
	}
}
