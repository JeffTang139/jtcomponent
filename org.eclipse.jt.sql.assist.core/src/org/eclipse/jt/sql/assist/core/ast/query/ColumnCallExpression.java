/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class ColumnCallExpression extends ColumnExpression implements IQueryValueNode {
	
	public final static String FUNCTION_COUNT="count";
	public final static String FUNCTION_MAX="max";
	public final static String FUNCTION_MIN="min";
	public final static String FUNCTION_SUM="sum";
	public final static String FUNCTION_AVG="avg";
	
	protected String fFunctionName;
	protected boolean fDistinct;

	//对于count函数，表达式可以为null
	public ColumnCallExpression(ISourcePosition begin, String funName, boolean distinct, ValueExpression parameter, ISourcePosition end) {
		super(union(begin,end), parameter);
		this.fFunctionName=funName;
		this.fDistinct=distinct;
	}
	//count(*)，可直接使用该构造函数
	public ColumnCallExpression(ISourcePosition begin, String funName, ISourcePosition end) {
		super(union(begin,end), null);
		this.fFunctionName=funName;
		this.fDistinct=false;
	}
	
	/**
	 * @return the fFunctionName
	 */
	public String getFunctionName() {
		return fFunctionName;
	}

	/**
	 * @param functionName the fFunctionName to set
	 */
	public void setFunctionName(String functionName, ISourcePosition pos) {
		this.updatePosition(pos);
		fFunctionName = functionName;
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
	public void setDistinct(boolean distinct, ISourcePosition pos) {
		this.updatePosition(pos);
		fDistinct = distinct;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.WHERE_STATEMENT;
	}
	public <TResult, TData> TResult accept(
			IQueryValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnCallExpression(this, data);
	}

	public String getTitle() {
		return fFunctionName;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
