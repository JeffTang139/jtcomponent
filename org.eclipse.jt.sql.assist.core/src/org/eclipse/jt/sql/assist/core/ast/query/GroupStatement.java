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
public class GroupStatement extends Statement implements IQueryAstNode{
	
	public static final String GROUP_WORD="group";

	public static final int PROPERTY_DEFAULT=0;
	public static final int PROPERTY_ROLLUP=1;
	public static final int PROPERTY_CUBE=2;
	
	protected int fProperty;

	public GroupStatement(ISourcePosition position) {
		super(position);
		fProperty=PROPERTY_DEFAULT;
	}

	protected List<GroupColumn> fColumns;
	
	public List<GroupColumn> getGroupColumns() {
		return fColumns;
	}
	
	public void add(GroupColumn column) {
		if(fColumns==null) fColumns=new ArrayList<GroupColumn>();
		this.fColumns.add(column);
		this.updatePosition(column);
	}
	
	/**
	 * @return the fProperty
	 */
	public int getProperty() {
		return fProperty;
	}
	
	/**
	 * @param property the fProperty to set
	 */
	public void setProperty(int property, ISourcePosition pos) {
		this.updatePosition(pos);
		fProperty = property;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.GROUP_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IQueryAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitGroupStatement(this, data);
	}
 
	public String getTitle() {
		return GROUP_WORD;
	}
}
