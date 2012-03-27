/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public class ColumnDefaultStatement extends Statement implements ITableAstNode {

	public static final String DEFAULT_WORD = "default";
	
	protected TokenNode fWord;
	protected ValueExpression fValue;
	
	/**
	 * @param position
	 */
	public ColumnDefaultStatement(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		fWord = word;
	}
	
	public TokenNode getWord() {
		return fWord;
	}
	
	public ValueExpression getValue() {
		return fValue;
	}
	
	public void setValue(ValueExpression value) {
		this.fValue = value;
		this.updatePosition(value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnDefaultStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.COLUMN_DEFAULT_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return DEFAULT_WORD;
	}

}
