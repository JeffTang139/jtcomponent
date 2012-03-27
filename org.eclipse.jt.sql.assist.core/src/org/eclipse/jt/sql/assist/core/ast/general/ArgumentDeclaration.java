/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.internal.util.AstUtil;


/**
 * @author Jeff Tang
 * 
 */
public class ArgumentDeclaration extends Declaration implements IGeneralAstNode {

	public final static String DEFAULT_WORD="default";
	
	public final static String ARGUMETN_PREFIX="@";
	public final static char ARGUMETN_PREFIX_CHARACTOR='@';
	
	protected DataTypeReference fType;
	
	protected ConstantExpression fDefaultValue = null;

	protected boolean fNotNull = false; 

	public ArgumentDeclaration(ISourcePosition begin, DataTypeReference type,  TokenNode name, ISourcePosition end) {
		super(union(begin,end), name);
		this.fType=type;
	}

	public ConstantExpression getDefaultValue() {
		return fDefaultValue;
	}

	public void setDefaultValue(ConstantExpression defaultValue) {
		this.updatePosition(defaultValue);
		fDefaultValue = defaultValue;
	}

	public boolean isNotNull() {
		return fNotNull;
	}

	public void setNotNull(boolean notNull, ISourcePosition pos) {
		this.updatePosition(pos);
		fNotNull = notNull;
	}
	
	/**
	 * @return the fType
	 */
	public DataTypeReference getType() {
		return fType;
	}

	/**
	 * @param type the fType to set
	 */
	public void setType(DataTypeReference type) {
		fType = type;
		this.updatePosition(type);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.ARGUMENT_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			IGeneralAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitArgumentDeclaration(this, (TData)data);
	}

	@Override
	public boolean structuralEquals(IAstNode other) {
		return other instanceof ArgumentDeclaration
			&& AstUtil.equals(fName, ((ArgumentDeclaration)other).fName);
	}
}
