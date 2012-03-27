/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Declaration;
import org.eclipse.jt.sql.assist.core.ast.IDeclaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public abstract class TableDeclarationBase<TStatement extends TableDefineStatementBase> extends Declaration implements
		IDeclaration, ITableAstNode {

	protected TokenNode fDefine;
	protected TokenNode fName;
	protected TStatement fStatement;

	/**
	 * @param position
	 */
	public TableDeclarationBase(TokenNode define, TokenNode name, ISourcePosition end) {
		super(union(define.getPosition(), end), name);
		fDefine = define;
		fName = name;
	}
	
	public TStatement getStatement() {
		return fStatement;
	}

	public void setStatement(TStatement statement) {
		this.fStatement = statement;
		updatePosition(statement);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return fName!=null?fName.getTexture():null;
	}

}
