/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class ColumnDeclaration extends Declaration implements ITableAstNode {

	protected TokenNode fPrimaryKey;
	protected TokenNode fNotNull;
	protected boolean fIsNotNull;
	protected ColumnDefaultStatement fDefault;
	protected ColumnRelationStatement fRelation;

	public ColumnDeclaration(TokenNode name, ISourcePosition end) {
		super(union(name.getPosition(), end), name);
		updatePosition(name);
	}
	
	public TokenNode getPrimaryKey() {
		return fPrimaryKey;
	}

	public void setPrimaryKey(TokenNode primaryKey) {
		this.fPrimaryKey = primaryKey;
		this.updatePosition(primaryKey);
	}

	public TokenNode getNotNull() {
		return fNotNull;
	}
	
	public boolean isNotNull() {
		return fIsNotNull;
	}

	public void setNotNull(TokenNode notNull, boolean isNotNull) {
		this.fNotNull = notNull;
		this.fIsNotNull = isNotNull;
		this.updatePosition(notNull);
	}

	public ColumnDefaultStatement getDefault() {
		return fDefault;
	}

	public void setDefault(ColumnDefaultStatement columnDefault) {
		this.fDefault = columnDefault;
		this.updatePosition(columnDefault);
	}

	public ColumnRelationStatement getRelation() {
		return fRelation;
	}

	public void setRelation(ColumnRelationStatement relation) {
		this.fRelation = relation;
		this.updatePosition(relation);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.COLUMN_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnDeclaration(this, data);
	}

}
