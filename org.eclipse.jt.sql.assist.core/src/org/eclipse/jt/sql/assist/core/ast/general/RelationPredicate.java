/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class RelationPredicate extends ConditionExpression implements IGeneralConditionNode {
	
	public final static String OPERATOR_EQUAL="=";
	public final static String OPERATOR_NOT_EQUAL="<>";
	public final static String OPERATOR_GREAT=">";
	public final static String OPERATOR_NOT_LESS=">=";
	public final static String OPERATOR_LESS="<";
	public final static String OPERATOR_NOT_GREAT="<=";
	public final static String OPERATOR_BETWEEN="between";
	public final static String OPERATOR_IN="in";
	public final static String OPERATOR_LIKE="like";
	public final static String OPERATOR_STARTS_WITH="starts_with";
	public final static String OPERATOR_ENDS_WITH="ends_with";
	public final static String OPERATOR_CONTAINS="contains";
	public final static String OPERATOR_IS="is";
	
	protected ValueExpression fValuePrimary;
	protected String fOperator;
	protected ISourcePosition fOperatorPosition;
	//null或IAstNode或List<IAstNode>，由操作符决定
	protected Object fUncertainOperand;

	public RelationPredicate(ISourcePosition position, ValueExpression primary) {
		super(position);
		fValuePrimary=primary;
	}

	/**
	 * @return the fValuePrimary
	 */
	public ValueExpression getValuePrimary() {
		return fValuePrimary;
	}

	/**
	 * @param primary the fValuePrimary to set
	 */
	public void setValuePrimary(ValueExpression primary, ISourcePosition pos) {
		this.updatePosition(pos);
		fValuePrimary = primary;
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
	public void setOperator(String operator, ISourcePosition optrPosition) {
		this.updatePosition(optrPosition);
		fOperator = operator;
		fOperatorPosition=optrPosition;
	}
	/**
	 * @return the fOperatorPosition
	 */
	public ISourcePosition getOperatorPosition() {
		return fOperatorPosition;
	}

	/**
	 * <p>获取操作数，IAstNode或List&lt;IAstNode&gt;</p>
	 * 
	 * <p>对于比较操作符，返回ValueExpression作为IAstNode</p>
	 * 
	 * <p>对于in，返回ValueExpression或SubQueryStatement作为IAstNode，
	 * 或者返回List&lt;ValueExpression&gt;作为&lt;IAstNode&gt;</p>
	 * 
	 * <p>对于between，返回size==2的List&lt;ValueExpression&gt;作为&lt;IAstNode&gt;</p>
	 * 
	 * <p>对于字符串比较，返回ValueExpression作为IAstNode，
	 * 或者返回List&lt;ValueExpression&gt;作为&lt;IAstNode&gt;</p>
	 * 
	 * <p>对于is，返回NullExpression作为IAstNode
	 * 
	 * @return 操作数
	 */
	public Object getUncertainOperand() {
		return fUncertainOperand;
	}

	/**
	 * null或IAstNode或List&lt;IAstNode&gt;，由操作符决定
	 * @param uncertainOperand the fUncertainOperand to set
	 */
	public void setUncertainOperand(Object uncertainOperand, ISourcePosition pos) {
		this.updatePosition(pos);
		fUncertainOperand = uncertainOperand;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.RELATION_PREDICATE;
	}

	public <TResult, TData> TResult accept(
			IGeneralConditionVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitRelationPredicate(this, data);
	}
	
	public String getTitle() {
		return fOperator;
	}
}
