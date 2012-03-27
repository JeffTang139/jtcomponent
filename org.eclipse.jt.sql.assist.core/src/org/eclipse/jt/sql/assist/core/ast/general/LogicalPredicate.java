/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class LogicalPredicate extends ConditionExpression implements IGeneralConditionNode {
	
	public final static String OPERATOR_AND="and";
	public final static String OPERATOR_OR="or";
	

	protected List<ConditionExpression> fConditions;


	public LogicalPredicate(ISourcePosition position, ConditionExpression primary) {
		super(position, primary);
	}
	
	public List<ConditionExpression> getConditionExpressions() {
		return this.fConditions;
	}
	
	public void add(String operator, ISourcePosition optrPosition, ConditionExpression operand) {
		add(new TokenNode(operator,optrPosition), operand);
	}
	
	public void add(TokenNode operator, ConditionExpression operand) {
		if(this.fConditions==null) this.fConditions=new ArrayList<ConditionExpression>(6);
		if(operand!=null) operand.setUpperOperator(operator);
		this.fConditions.add(operand);
		this.updatePosition(operator);
		this.updatePosition(operand);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.LOGICAL_PREDICATE;
	}
	
	public <TResult, TData> TResult accept(
			IGeneralConditionVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitLogicalPredicate(this, data);
	}
	
	public String getTitle() {
		if(fConditions!=null) {
			for(int i=0;i<fConditions.size();i++) {
				ConditionExpression sec=fConditions.get(i);
				if(sec!=null && sec.getUpperOperator()!=null 
						&& sec.getUpperOperator().getTexture()!=null) {
					return sec.getUpperOperator().getTexture();
				}
			}
		}
		return "Logical";
	}
}
