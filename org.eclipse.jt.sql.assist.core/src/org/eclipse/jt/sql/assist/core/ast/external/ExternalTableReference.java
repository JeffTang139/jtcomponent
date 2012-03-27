/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.external;

import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.Reference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class ExternalTableReference extends Reference implements
		IResultSetReference {
	
	protected ITableDefineReference fTableReference;

	/**
	 * @param position
	 * @param targetName
	 */
	public ExternalTableReference(ITableDefineReference tableReference) {
		super(null, tableReference.getTargetName());
		fTableReference=tableReference;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.ITableReference#getAlias()
	 */
	public TokenNode getAlias() {
		return new TokenNode(fTableReference.getAlias(),SourcePosition.getEmpty());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.ITableReference#isForUpdate()
	 */
	public boolean isForUpdate() {
		return fTableReference.isForUpdate();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return ExternalAstKinds.EXTERNAL_TABLE_REFERENCE;
	}

	public void setAlias(TokenNode alias) {
		// do nothing
	}

	public TokenNode getAliasTarget() {
		return new TokenNode(fTableReference.getTargetName(),SourcePosition.getEmpty());
	}

	public TokenNode getAs() {
		return null;
	}

	public void setAs(TokenNode as) {
		// do nothing
	}

}
