/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class IndexesStatment extends Statement implements ITableAstNode {

	public static final String INDEXES_WORD = "indexes";
	
	protected List<IndexDeclaration> fIndexes;
	protected TokenNode fWord;
	
	/**
	 * @param position
	 */
	public IndexesStatment(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		this.fWord = word;
	}
	
	public TokenNode getWord() {
		return fWord;
	}
	
	public List<IndexDeclaration> getIndexes() {
		return fIndexes;
	}
	
	public void add(IndexDeclaration column) {
		if(fIndexes==null) fIndexes=new ArrayList<IndexDeclaration>();
		this.fIndexes.add(column);
		this.updatePosition(column);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitIndexesStatment(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.INDEXES_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return this.fWord!=null? fWord.getTexture() : INDEXES_WORD;
	}

}
