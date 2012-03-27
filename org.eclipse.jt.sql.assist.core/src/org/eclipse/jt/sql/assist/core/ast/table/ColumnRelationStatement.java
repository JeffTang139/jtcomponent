/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class ColumnRelationStatement extends Statement implements ITableAstNode {

	public static final String REALTION_WORD = "relation";
	
	protected TokenNode fWord;
	protected TokenNode fName;
	protected TokenNode fTo;
	protected TableColumnReference fReference;
	
	/**
	 * @param position
	 */
	public ColumnRelationStatement(TokenNode word, TokenNode name, ISourcePosition end) {
		super(union(word.getPosition(), end));
		fWord = word;
		this.setName(name);
	}
	
	public TokenNode getWord() {
		return fWord;
	}
	
	public TokenNode getName() {
		return fName;
	}
	
	public void setName(TokenNode name) {
		this.fName = name;
		this.updatePosition(name);
	}
	
	public TokenNode getTo() {
		return fTo;
	}
	
	public void setTo(TokenNode to)  {
		this.fTo = to;
		this.updatePosition(to);
	}

	public TableColumnReference getReference() {
		return fReference;
	}
	
	public void setReference(TableColumnReference reference) {
		this.fReference = reference;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnRelationStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.COLUMN_RELATION_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return fWord!=null? fWord.getTexture() : REALTION_WORD;
	}

}
