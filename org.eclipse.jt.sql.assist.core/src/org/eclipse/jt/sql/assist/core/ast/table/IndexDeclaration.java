/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class IndexDeclaration extends Declaration implements ITableAstNode {

	public static final String UNIQUE_WORD = "unique";
	
	protected TokenNode fUnique;
	protected List<IndexColumnStatement> fList;
	
	/**
	 * @param position
	 * @param name
	 */
	public IndexDeclaration(TokenNode unique, TokenNode name, ISourcePosition end) {
		super(union(unique!=null? unique.getPosition() : null, end), name);
	}
	
	public List<IndexColumnStatement> getColumn() {
		return fList;
	}
	
	public void add(IndexColumnStatement column) {
		if(fList==null) fList = new ArrayList<IndexColumnStatement>();
		fList.add(column);
		this.updatePosition(column);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return TableAstKinds.INDEX_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			ITableAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitIndexDeclaration(this, data);
	}

}
