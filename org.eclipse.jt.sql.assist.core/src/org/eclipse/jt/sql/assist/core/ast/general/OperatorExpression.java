/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class OperatorExpression extends ValueExpression implements IGeneralValueNode {
	
	public final static String OPERATOR_ADD="+";
	public final static String OPERATOR_SUB="-";
	public final static String OPERATOR_MUL="*";
	public final static String OPERATOR_DIV="/";
	
	
	protected List<ValueExpression> fValues;
	
	public OperatorExpression(ISourcePosition position, ValueExpression primary) {
		super(position, primary);
	}
	
	public List<ValueExpression> getValueExpressions() {
		return this.fValues;
	}
	
	public void add(String operator, ISourcePosition optrPos, ValueExpression operand) {
		add(new TokenNode(operator,optrPos), operand);
	}
	
	public void add(TokenNode operator, ValueExpression operand) {
		if(this.fValues==null) this.fValues=new ArrayList<ValueExpression>(4);
		if(operand!=null) operand.setUpperOperator(operator);
		this.fValues.add(operand);
		this.updatePosition(operator);
		this.updatePosition(operand);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.OPERATOR_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitOperatorExpression(this, data);
	}

	public String getTitle() {
		return "Operation";
	}	

	@Override
	public boolean isStatic() {
		return false;
	}
}
