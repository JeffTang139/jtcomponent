/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.kinds.LiteralKinds;


/**
 * @author Jeff Tang
 *
 */
public class ConstantExpression extends ValueExpression implements IGeneralValueNode, LiteralKinds {
	
	public static final String VALUE_TRUE_LITERAL="true";
	public static final String VALUE_FALSE_LITERAL="false";
	

	public static final String TITLE_SEAPARATOR=" : ";
	
	
	protected String fValue;
	protected int fType;

	public ConstantExpression(ISourcePosition position, String value, int type) {
		super(position);
		this.fType=type;
		this.fValue=value;
	}
	
	public String getValue() {
		return fValue;
	}

	public void setValue(String value, ISourcePosition pos) {
		this.updatePosition(pos);
		fValue = value;
	}


	public int getType() {
		return fType;
	}

	public void setType(int type) {
		fType = type;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.CONSTANT_EXPRESSION;
	}

	public <TResult, TData> TResult accept(
			IGeneralValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitConstantExpression(this, data);
	}
	
	public String getTitle() {
		int tindex=fType;
		if(tindex<0||tindex>=COUNT_KIND) {
			tindex=COUNT_KIND;
		}
		StringBuffer buffer=new StringBuffer(30);
		if(fType==LiteralKinds.KIND_STRING) {
			buffer.append('\'');
			buffer.append(fValue);
			buffer.append('\'');
		} else if(fType==LiteralKinds.KIND_BYTES) {
//			buffer.append("bytes");
			buffer.append('\'');
			buffer.append(fValue);
			buffer.append('\'');
		} else if(fType==LiteralKinds.KIND_GUID) {
//			buffer.append("guid");
			buffer.append('\'');
			buffer.append(fValue);
			buffer.append('\'');
		} else if(fType==LiteralKinds.KIND_DATE) {
//			buffer.append("date");
			buffer.append('\'');
			buffer.append(fValue);
			buffer.append('\'');
		} else {
			buffer.append(fValue);
		}
		buffer.append(TITLE_SEAPARATOR);
		buffer.append(ARRAY_KIND_NAME[tindex]);
		return buffer.toString();
	}
	
	@Override
	public int hashCode() {
		return fType;
	}
	
	@Override
	public boolean structuralEquals(IAstNode other) {
		if(this==other) return true;
		if(other instanceof ConstantExpression) {
			return fType==((ConstantExpression)other).fType;
		}
		return false;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
