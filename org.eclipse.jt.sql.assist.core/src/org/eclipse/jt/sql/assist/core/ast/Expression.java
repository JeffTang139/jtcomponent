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
public abstract class Expression extends AbstractAstNode {

	public static final long CATEGORY_KIND = AstCategoryKinds.EXPRESSION;
	
	public Expression(ISourcePosition position) {
		super(position);
	}

	protected TokenNode fUpperOperator;
	
	/**
	 * @return the fUpperOperator
	 */
	public TokenNode getUpperOperator() {
		return fUpperOperator;
	}

	/**
	 * @param upperOperator the fUpperOperator to set
	 */
	public void setUpperOperator(TokenNode upperOperator) {
		fUpperOperator = upperOperator;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
