/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;


/**
 * @author Jeff Tang
 *
 */
public class HierarchyDeclaration extends Declaration implements
		ITableAstNode {

	public static final String MAXLEVEL_WORD = "maxlevel";
	
	protected TokenNode fMaxLevelWord;
	protected ConstantExpression fMaxLevel;

	/**
	 * @param position
	 * @param name
	 */
	public HierarchyDeclaration(ISourcePosition position, TokenNode name) {
		super(position, name);
	}
	
	public TokenNode getMaxLevelWord() {
		return fMaxLevelWord;
	}

	public void setMaxLevelWord(TokenNode maxLevelWord) {
		this.fMaxLevelWord = maxLevelWord;
	}

	public ConstantExpression getMaxLevel() {
		return fMaxLevel;
	}

	public void setMaxLevel(ConstantExpression maxLevel) {
		this.fMaxLevel = maxLevel;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitHierarchyDeclaration(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.HIERARCHY_DECLARATION;
	}

}
