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
public class HierarchiesStatement extends Statement implements ITableAstNode {

	public static final String HIERARCHIES_WORD = "hierarchies";
	
	protected TokenNode fWord;
	protected List<HierarchyDeclaration> fList;
	
	/**
	 * @param position
	 */
	public HierarchiesStatement(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		this.fWord = word;
	}
	
	public List<HierarchyDeclaration> getHierarchies() {
		return fList;
	}
	
	public void add(HierarchyDeclaration hier) {
		if(fList==null) fList=new ArrayList<HierarchyDeclaration>();
		this.fList.add(hier);
		this.updatePosition(hier);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitHierarchiesStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.HIERARCHIES_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return fWord!=null? fWord.getTexture() : HIERARCHIES_WORD;
	}

}
