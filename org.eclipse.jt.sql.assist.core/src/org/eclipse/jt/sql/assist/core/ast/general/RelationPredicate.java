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
	//null��IAstNode��List<IAstNode>���ɲ���������
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
	 * <p>��ȡ��������IAstNode��List&lt;IAstNode&gt;</p>
	 * 
	 * <p>���ڱȽϲ�����������ValueExpression��ΪIAstNode</p>
	 * 
	 * <p>����in������ValueExpression��SubQueryStatement��ΪIAstNode��
	 * ���߷���List&lt;ValueExpression&gt;��Ϊ&lt;IAstNode&gt;</p>
	 * 
	 * <p>����between������size==2��List&lt;ValueExpression&gt;��Ϊ&lt;IAstNode&gt;</p>
	 * 
	 * <p>�����ַ����Ƚϣ�����ValueExpression��ΪIAstNode��
	 * ���߷���List&lt;ValueExpression&gt;��Ϊ&lt;IAstNode&gt;</p>
	 * 
	 * <p>����is������NullExpression��ΪIAstNode
	 * 
	 * @return ������
	 */
	public Object getUncertainOperand() {
		return fUncertainOperand;
	}

	/**
	 * null��IAstNode��List&lt;IAstNode&gt;���ɲ���������
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
