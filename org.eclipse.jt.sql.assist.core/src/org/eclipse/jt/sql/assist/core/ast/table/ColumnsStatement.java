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
public class ColumnsStatement extends Statement implements ITableAstNode {
	
	public static final String COLUMNS_WORD = "fields";

	protected List<ColumnDeclaration> fColumns;
	protected TokenNode fWord;
	protected TokenNode fSegment;
	
	/**
	 * @param position
	 */
	public ColumnsStatement(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		fWord = word;
	}
	public List<ColumnDeclaration> getColumnDeclarations() {
		return fColumns;
	}
	
	public void add(ColumnDeclaration column) {
		if(fColumns==null) fColumns=new ArrayList<ColumnDeclaration>();
		this.fColumns.add(column);
		this.updatePosition(column);
	}
	
	public TokenNode getSegment() {
		return this.fSegment;
	}
	
	public void setSegment(TokenNode segment) {
		this.fSegment = segment;
		this.updatePosition(segment);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		String title = fWord!=null? fWord.getTexture() : COLUMNS_WORD;
		return fSegment!=null? title + fSegment.getTexture() : title;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.COLUMNS_STATEMENT;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnsStatement(this, data);
	}
}
