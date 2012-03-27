/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement;


/**
 * @author Jeff Tang
 *
 */
public class InsertStatement extends Statement implements ICommandAstNode {
	
	public static final String INSERT_WORD = "insert";
	public static final String INTO_WORD = "into";
	
	protected TokenNode fInsert;
	protected TokenNode fInto;
	protected TokenNode fTableName;
	protected TokenNode fDefaultValues;
	protected List<TokenNode> fColumns;
	protected SubQueryStatement fSubquery;
	protected List<ValueExpression> fValueExpressions;

	public InsertStatement(TokenNode tInsert, TokenNode tInto) {
		super(union(tInsert.getPosition(), tInto.getPosition()));
//		fColumns = new ArrayList<TokenNode>();
		fInsert = tInsert;
		fInto = tInto;
	}
	
	public TokenNode getTableName() {
		return fTableName;
	}

	public void setTableName(TokenNode tokenTableName) {
		this.fTableName = tokenTableName;
		this.updatePosition(tokenTableName);
	}
	
	public void addColumn(TokenNode column) {
		if(fColumns==null) {
			fColumns = new ArrayList<TokenNode>();
		}
		fColumns.add(column);
		this.updatePosition(column);
	}
	
	public void addValueExpresiion(ValueExpression value) {
		if(fValueExpressions==null) {
			fValueExpressions = new ArrayList<ValueExpression>();
		}
		fValueExpressions.add(value);
		this.updatePosition(value);
	}

	public TokenNode getInsert() {
		return fInsert;
	}

	public TokenNode getInto() {
		return fInto;
	}
	
	public SubQueryStatement getSubquery() {
		return fSubquery;
	}

	public void setSubquery(SubQueryStatement subquery) {
		this.fSubquery = subquery;
		this.updatePosition(subquery);
	}

	public List<TokenNode> getColumns() {
		return fColumns;
	}
	
	public List<ValueExpression> getValueExpressions() {
		return fValueExpressions;
	}
	
	public TokenNode getDefaultValues() {
		return fDefaultValues;
	}

	public void setDefaultValues(TokenNode defaultValues) {
		this.fDefaultValues = defaultValues;
		this.updatePosition(defaultValues);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return CommandAstKinds.COMMAND_INSERT_STATEMENT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return INSERT_WORD;
	}

	public <TResult, TData> TResult accept(
			ICommandAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitInsertStatement(this, data);
	}

}
