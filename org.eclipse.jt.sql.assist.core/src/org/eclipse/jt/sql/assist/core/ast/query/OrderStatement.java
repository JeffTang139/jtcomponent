/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;


/**
 * @author Jeff Tang
 *
 */
public class OrderStatement extends Statement implements IQueryAstNode{
	
	public static final String ORDER_WORD="order";
	
	public OrderStatement(ISourcePosition position) {
		super(position);
	}

	protected List<OrderExpression> fOrder;
	
	public List<OrderExpression> getOrders() {
		return fOrder;
	}
	
	public void add(OrderExpression column) {
		if(fOrder==null) fOrder=new ArrayList<OrderExpression>();
		this.fOrder.add(column);
		this.updatePosition(column);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.ORDER_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitOrderStatement(this, data);
	}

	public String getTitle() {
		return ORDER_WORD;
	}
}
