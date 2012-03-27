/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.internal.util.AstUtil;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractAstNode implements IAstNode {
	
	protected ISourcePosition fPosition;
	
	public AbstractAstNode(ISourcePosition position) {
		fPosition=position;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getPosition()
	 */
	public final ISourcePosition getPosition() {
		return this.fPosition;
	}
	
	/**
	 * 
	 * @param position the fPosition to set
	 */
	public final void setPosition(ISourcePosition position) {
		this.fPosition = position;
	}
	
	public final void updatePosition(ISourcePosition position) {
		this.fPosition = union(this.fPosition, position);
	}
	
	public final void updatePosition(IAstNode node) {
		if(node!=null) {
			updatePosition(node.getPosition());
		}
	}
	
	public static ISourcePosition union(ISourcePosition one, ISourcePosition other) {
		if(one==null) return other;
		return one.union(other);
	}
	
	@Override
	public int hashCode() {
		String title=this.getTitle();
		return title!=null?title.hashCode():super.hashCode();
	}
	
	@Override
	public final boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof IAstNode) {
			return structuralEquals((IAstNode) obj);
		}
		return false;
	}
	
	public boolean structuralEquals(IAstNode other) {
		if(this==other) return true;
		if(null==other || !this.getClass().equals(other.getClass())) return false;
		String thistitle=this.getTitle();
		String othertitle=other.getTitle();
		return (thistitle==null && othertitle==null)
			||AstUtil.equals(thistitle, othertitle);
	}
	
	public boolean almostEquals(IAstNode other) {
		if(this==other) return true;
		if(null==other) return false;
		if(fPosition!=null) {
			return fPosition.equals(other.getPosition())
				&& this.getClass().equals(other.getClass())
				&& this.hashCode()==other.hashCode();
		}
		return false;
	}
	
	public boolean exactlyEquals(IAstNode other) {
		if(this==other) return true;
		if(null==other) return false;
		return structuralEquals(other) && almostEquals(other);
	}
}
