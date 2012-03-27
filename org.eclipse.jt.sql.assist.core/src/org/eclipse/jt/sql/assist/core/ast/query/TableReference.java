/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.external.ITableReference;


/**
 * @author Jeff Tang
 *
 */
public class TableReference extends ResultSetReferenceBase
		implements IQueryAstNode, ITableReference {
	
	public static final String AS_WORD = "as";
	
	protected TokenNode fTarget;
	
	public TableReference(ISourcePosition begin,TokenNode tableName, boolean forUpdate, ISourcePosition end) {
		super(begin, forUpdate, end);
		this.fTarget=tableName;
	}


	/**
	 * @return the fTargetName
	 */
	public TokenNode getTarget() {
		return fTarget;
	}

//	/**
//	 * @param tableName the fTargetName to set
//	 */
//	public void setTarget(String targetName, ISourcePosition pos) {
//		this.updatePosition(pos);
//		fTargetName = new TokenNode(DnaSqlUtils.getUnlimitID(targetName),pos);
//	}
	public void setTarget(TokenNode target) {
		this.fTarget = target;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.TABLE_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableReference(this, data);
	}

	@Override
	public String getTitle() {
		StringBuffer buffer=new StringBuffer(30);
		buffer.append(fTarget.getTexture());
		if(fAlias!=null) {
			buffer.append(' ');
			buffer.append(AS_WORD);
			buffer.append(' ');
			buffer.append(fAlias.getTexture());
		}
		return buffer.toString();
	}

	public TokenNode getAliasTarget() {
		return fTarget;
	}

	public String getTargetName() {
		return fTarget!=null? fTarget.getTexture() : null;
	}

}
