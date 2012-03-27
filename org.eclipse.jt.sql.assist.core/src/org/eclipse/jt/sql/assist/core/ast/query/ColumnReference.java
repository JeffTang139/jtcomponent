/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.internal.util.AstUtil;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public class ColumnReference extends ValueExpression implements IQueryValueNode{
	
	public static final String SEPARATOR=".";
	
	protected TableRefReference fTableRefRef;
	protected String fColumnName;
	protected ISourcePosition fColumnPosition;

	public ColumnReference(ISourcePosition begin, TableRefReference tableRefRef, String columnName, ISourcePosition end) {
		super(union(begin,end));
		this.fTableRefRef=tableRefRef;
		this.fColumnName=DnaSqlUtils.getUnlimitID(columnName);
	}

	/**
	 * @return the fColumnPosition
	 */
	public ISourcePosition getColumnPosition() {
		return fColumnPosition;
	}

	/**
	 * @return the fColumnName
	 */
	public String getColumnName() {
		return fColumnName;
	}

	/**
	 * @param columnName the fColumnName to set
	 */
	public void setColumnName(String columnName, ISourcePosition columnPosition) {
		this.updatePosition(columnPosition);
		fColumnName = DnaSqlUtils.getUnlimitID(columnName);
		fColumnPosition=columnPosition;
	}

	/**
	 * @return the fTableRefRef
	 */
	public TableRefReference getTableRefReference() {
		return fTableRefRef;
	}

	/**
	 * @param tableRefRef the fTableRefRef to set
	 */
	public void setTableRefReference(TableRefReference tableRefRef, ISourcePosition pos) {
		this.updatePosition(pos);
		fTableRefRef = tableRefRef;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return QueryAstKinds.COLUMN_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IQueryValueVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitColumnReference(this, data);
	}

	public String getTitle() {
		if(this.fTableRefRef!=null && this.fTableRefRef.getTargetName()!=null) {
			return this.fTableRefRef.getTargetName()+SEPARATOR+fColumnName;
		}
		return fColumnName;
	}
	
	@Override
	public int hashCode() {
		int hash=0;
		if(this.fTableRefRef!=null) {
			hash = this.fTableRefRef.hashCode();
		}
		if(this.fColumnName!=null) {
			hash += this.fColumnName.hashCode();
		}
		return hash;
	}
	
	@Override
	public boolean structuralEquals(IAstNode other) {
		if(this==other) return true;
		if(other instanceof ColumnReference) {
			return AstUtil.equals(this.fTableRefRef, ((ColumnReference)other).fTableRefRef)
				&& AstUtil.equals(this.fColumnName, ((ColumnReference)other).fColumnName);
		}
		return false;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
}
