/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Reference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class ColumnTypeReference extends Reference implements ITableAstNode {

	protected TokenNode fName;
	
	/**
	 * @param position
	 * @param targetName
	 */
	public ColumnTypeReference(ISourcePosition position, TokenNode name) {
		super(position, name!=null? name.getTexture(): null);
		fName = name;
		this.updatePosition(name);
	}
	
	public TokenNode getName() {
		return fName;
	}
	
	@Override
	public String getTargetName() {
		return fName!=null? fName.getTexture(): null;
	}
	
	@Override
	public void setTargetName(String targetName, ISourcePosition pos) {
		if(targetName!=null) {
			fName = new TokenNode(targetName, pos);
		} else {
			super.setTargetName(targetName, pos);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnTypeReference(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		// TODO Auto-generated method stub
		return TableAstKinds.COLUMN_TYPE_REFERENCE;
	}

}
