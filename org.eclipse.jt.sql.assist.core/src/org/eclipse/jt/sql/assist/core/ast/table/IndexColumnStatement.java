/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;

/**
 * @author Jeff Tang
 *
 */
public class IndexColumnStatement extends Statement implements ITableAstNode {

	public static final boolean DEFAULT_ASC = true;
	
	protected TokenNode fName;
	protected TokenNode fOrder;
	protected boolean fAsc;
	
	/**
	 * @param position
	 */
	public IndexColumnStatement(TokenNode name, TokenNode order, boolean isAsc) {
		super(null);
		this.setName(name);
		this.setOrder(order, isAsc);
	}
	
	public TokenNode getName() {
		return fName;
	}
	
	public void setName(TokenNode name) {
		this.fName = name;
		this.updatePosition(name);
	}
	
	public TokenNode getOrder() {
		return fOrder;
	}
	
	public boolean isAsc() {
		return this.fAsc;
	}
	
	public void setOrder(TokenNode order, boolean isAsc) {
		this.fOrder = order; 
		this.fAsc = isAsc;
		this.updatePosition(order);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitIndexColumnStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.INDEX_COLUMN_DECLARATION;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return fName!=null?  fName.getTexture() : null;
	}

}
