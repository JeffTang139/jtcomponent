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
public class RelationsStatement extends Statement implements ITableAstNode {

	public static final String RELATIONS_WORD = "relations";
	
	protected List<RelationDeclaration> fRelations;
	protected TokenNode fWord;
	
	/**
	 * @param position
	 */
	public RelationsStatement(TokenNode word, ISourcePosition end) {
		super(union(word.getPosition(), end));
		this.fWord = word;
	}
	
	public TokenNode getWord() {
		return fWord;
	}
	
	public List<RelationDeclaration> getRelations() {
		return fRelations;
	}
	
	public void add(RelationDeclaration column) {
		if(fRelations==null) fRelations=new ArrayList<RelationDeclaration>();
		this.fRelations.add(column);
		this.updatePosition(column);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.table.ITableAstNode#accept(org.eclipse.jt.sql.assist.core.ast.table.ITableAstVisitor, java.lang.Object)
	 */
	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitRelationsStatement(this, data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.RELATIONS_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return this.fWord!=null? fWord.getTexture() : RELATIONS_WORD;
	}

}
