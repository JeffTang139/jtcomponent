/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;


/**
 * @author Jeff Tang
 *
 */
public class PartitionStatement extends Statement implements ITableAstNode {

	public static final String PARTITION_WORD = "partition";
	public static final String VAVLE_WORD = "vavle";
	public static final String MAXCOUNT_WORD = "maxcount";
	
	
	protected List<TokenNode> fColumns;
	protected TokenNode fWord;
	protected TokenNode fVavleWord;
	protected TokenNode fMaxCountWord;
	protected ConstantExpression fVavleValue;
	protected ConstantExpression fMaxCountValue;
	
	/**
	 * @param position
	 */
	public PartitionStatement(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		this.fWord = word;
	}
	

	public TokenNode getWord() {
		return fWord;
	}

	public TokenNode getVavleWord() {
		return fVavleWord;
	}

	public void setVavleWord(TokenNode vavleWord) {
		this.fVavleWord = vavleWord;
		this.updatePosition(vavleWord);
	}

	public TokenNode getMaxCountWord() {
		return fMaxCountWord;
	}

	public void setMaxCountWord(TokenNode maxCountWord) {
		this.fMaxCountWord = maxCountWord;
		this.updatePosition(maxCountWord);
	}

	public ConstantExpression getVavleValue() {
		return fVavleValue;
	}

	public void setVavleValue(ConstantExpression vavleValue) {
		this.fVavleValue = vavleValue;
		this.updatePosition(vavleValue);
	}

	public ConstantExpression getMaxCountValue() {
		return fMaxCountValue;
	}

	public void setMaxCountValue(ConstantExpression maxCountValue) {
		this.fMaxCountValue = maxCountValue;
		this.updatePosition(maxCountValue);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitPartitionStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.PARTITION_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return this.fWord!=null? fWord.getTexture() : PARTITION_WORD;
	}

}
