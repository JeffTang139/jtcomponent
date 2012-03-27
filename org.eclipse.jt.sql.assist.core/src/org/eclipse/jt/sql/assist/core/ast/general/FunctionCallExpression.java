/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IFunctionParameter;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class FunctionCallExpression extends ValueExpression implements IGeneralValueNode{

	public static final char PARAMETER_LIST_BEGIN_CHAR = '(';
	public static final char PARAMETER_LIST_END_CHAR = ')';
	public static final String PARAMETER_LIST_EMPTY_TITLE = "()";
	
	protected String fFunctionName;
	protected List<IFunctionParameter> fParameters;
	
	public FunctionCallExpression(ISourcePosition position, String funName) {
		super(position);
		fFunctionName=funName;
	}
	/**
	 * 
	 * @return
	 */
	public String getFunctionName() {
		return fFunctionName;
	}
	
	public List<IFunctionParameter> getParameters() {
		return this.fParameters;
	}
	
	public void add(IFunctionParameter valueExp) {
		if(this.fParameters==null) this.fParameters=new ArrayList<IFunctionParameter>(4);
		this.fParameters.add(valueExp);
		this.updatePosition(valueExp);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.FUNCTION_CALL_EXPRESSION;
	}
	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitFunctionCallExpression(this, data);
	}
	
	public String getTitle() {
		return fFunctionName+PARAMETER_LIST_EMPTY_TITLE;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
