package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;



public abstract class ConditionExpression extends Expression {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.CONDITION_EXPRESSION;
	
	protected ConditionExpression fPrimary;
	protected boolean fNot;

	public ConditionExpression(ISourcePosition position) {
		super(position);
		this.fPrimary=null;
	}
	
	public ConditionExpression(ISourcePosition position, ConditionExpression primary) {
		super(position);
		this.fPrimary=primary;
	}

	public ConditionExpression getPrimary() {
		return fPrimary;
	}

	public void setPrimary(ConditionExpression primary, ISourcePosition pos) {
		this.updatePosition(pos);
		this.updatePosition(primary);
		fPrimary = primary;
	}
	
	/**
	 * @return the fNot
	 */
	public boolean isNot() {
		return fNot;
	}

	/**
	 * @param not the fNot to set
	 */
	public void setNot(boolean not, ISourcePosition pos) {
		this.updatePosition(pos);
		fNot = not;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
