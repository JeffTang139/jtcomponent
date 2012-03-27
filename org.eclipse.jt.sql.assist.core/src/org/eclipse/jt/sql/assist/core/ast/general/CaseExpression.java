/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class CaseExpression extends ValueExpression implements IGeneralValueNode{
	
	public final static String OPERATOR_CASE_NORMAL="case";
	public final static String OPERATOR_CASE_SEARCH="case-search";
	public final static String OPERATOR_CASE_COALESCE="coalesce";
	
	protected List<ValueExpression> fValues;
	protected List<ConditionExpression> fConditions;
	protected String fOperator;

	/**
	 * case
	 * @param primary 
	 */
	public CaseExpression(ISourcePosition position, String operator, ValueExpression primary) {
		super(position, primary);
		fOperator=operator;
	}

	/**
	 * coalesce
	 * @param primary 
	 */
	public CaseExpression(ISourcePosition position, String operator) {
		super(position);
		fOperator=operator;
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
	
	public List<ValueExpression> getCaseValues() {
		return this.fValues;
	}
	
	public void add(ValueExpression caseValueExp) {
		if(this.fValues==null) this.fValues=new ArrayList<ValueExpression>();
		this.fValues.add(caseValueExp);
		this.updatePosition(caseValueExp);
	}
	
	public List<ConditionExpression> getCaseConditions() {
		return this.fConditions;
	}
	
	public void add(ConditionExpression caseConditionExp) {
		if(this.fConditions==null) this.fConditions=new ArrayList<ConditionExpression>();
		this.fConditions.add(caseConditionExp);
		this.updatePosition(caseConditionExp);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.CASE_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitCaseExpression(this, data);
	}
	
	public String getTitle() {
		return fOperator;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
