/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;


/**
 * @author Jeff Tang
 *
 */
public abstract class ValueExpression
		extends Expression 
		implements IFunctionParameter {

	public static final long CATEGORY_KIND = AstCategoryKinds.VALUE_EXPRESSION;
	

	protected ValueExpression fPrimary;
	
	public ValueExpression(ISourcePosition position) {
		super(position);
		this.fPrimary=null;
	}
	
	public ValueExpression(ISourcePosition position, ValueExpression primary) {
		super(primary!=null ? position.union(primary.getPosition()) : position);
		this.fPrimary=primary;
	}

	public ValueExpression getPrimary() {
		return fPrimary;
	}

	public void setPrimary(ValueExpression primary, ISourcePosition pos) {
		this.updatePosition(pos);
		this.updatePosition(primary);
		fPrimary = primary;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

	/**
	 * 是否是静态常量
	 * @return
	 */
	public abstract boolean isStatic();
}
