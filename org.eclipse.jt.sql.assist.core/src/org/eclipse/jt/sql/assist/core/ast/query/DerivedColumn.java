/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IAliasHolder;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class DerivedColumn extends ValueExpression 
		implements IQueryAstNode, IAliasHolder{

	public static final String DERIVED_COLUMN_WORD = "?column?";
	public static final String AS_WORD = "as";

	protected TokenNode fAs;
	protected TokenNode fAlias;

	public DerivedColumn(ISourcePosition position, ValueExpression primary) {
		super(position, primary);
	}

	/**
	 * @return the fAlias
	 */
	public TokenNode getAlias() {
		return fAlias;
	}

	/**
	 * @param alias the fAlias to set
	 */
	public void setAlias(TokenNode alias) {
		this.updatePosition(alias);
		fAlias = alias;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.DERIVED_COLUMN;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitDerivedColumn(this, data);
	}
	
	public String getTitle() {
		if(fAlias!=null && fAlias.getTexture()!=null) {
			return fAlias.getTexture()/* + " : " + DERIVED_COLUMN_WORD*/;
		}
		return DERIVED_COLUMN_WORD;
	}

	@Override
	public boolean isStatic() {
		return fPrimary!=null?fPrimary.isStatic():false;
	}

	public TokenNode getAliasTarget() {
		return null;
	}

	public TokenNode getAs() {
		return fAs;
	}

	public void setAs(TokenNode as) {
		fAs= as;
	}
}
