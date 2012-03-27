/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;


/**
 * @author Jeff Tang
 *
 */
public class HierarchyFunCallExpression extends ValueExpression implements IQueryValueNode {
	
	public static final String HFC_NAME_H_LV="h_lv";
	public static final String HFC_NAME_H_AID="h_aid";
	
	public static final String HFC_RELATIVE_REL="rel";
	public static final String HFC_RELATIVE_ABO="abo";
	
	
	protected String fFunctionName;
	protected TableRefReference fTableRefRef;
	protected String fHierarchyName;

	protected ISourcePosition fHierarchyPosition;

	public HierarchyFunCallExpression(ISourcePosition begin, String funName, TableRefReference tableRefRef, String hierarchyName, ISourcePosition end) {
		super(union(begin,end));
		fFunctionName=funName;
		fTableRefRef=tableRefRef;
		fHierarchyName=hierarchyName;
	}
	
	public String getFunctionName() {
		return this.fFunctionName;
	}

	/**
	 * @return the fTableRefRef
	 */
	public TableRefReference getTableRefReference() {
		return fTableRefRef;
	}

	/**
	 * @param tableRefRef the fTableRefRef to set
	 */
	public void setTableRefReference(TableRefReference tableRefRef) {
		fTableRefRef = tableRefRef;
		this.updatePosition(tableRefRef);
	}
	
	/**
	 * @return the fHierarchyName
	 */
	public String getHierarchyName() {
		return fHierarchyName;
	}
	
	public ISourcePosition getHierarchyPosition() {
		return fHierarchyPosition;
	}

	/**
	 * @param hierarchyName the fHierarchyName to set
	 */
	public void setHierarchyName(String hierarchyName, ISourcePosition pos) {
		fHierarchyName = hierarchyName;
		fHierarchyPosition=pos;
		this.updatePosition(pos);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.HIERARCHY_FUNCTION_CALL_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IQueryValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitHierarchyFunCallExpression(this, data);
	}

	public String getTitle() {
		return fFunctionName;
	}


	@Override
	public boolean isStatic() {
		return false;
	}
}
