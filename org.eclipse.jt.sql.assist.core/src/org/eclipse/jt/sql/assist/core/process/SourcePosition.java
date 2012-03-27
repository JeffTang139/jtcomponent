/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public class SourcePosition implements ISourcePosition {
	
	public static ISourcePosition getEmpty() {
		return new SourcePosition(-1,-1);
	}
	
	protected final int fStart;
	protected final int fEnd;
	
	public SourcePosition(int start, int end) {
		this.fStart=start;
		this.fEnd=end;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.ISourcePosition#getEndOffset()
	 */
	public int getEnd() {
		return fEnd;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.ISourcePosition#getStartOffset()
	 */
	public int getStart() {
		return fStart;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.ISourcePosition#union(org.eclipse.jt.script.assist.ISourcePosition)
	 */
	public ISourcePosition union(ISourcePosition position) {
		if(position==null || position==this) return this;
		SourcePosition pos=this;
		if(this.fStart<0 || position.getStart()<this.fStart|| position.getEnd()>this.fEnd) {
			int start=this.fStart;
			int end=this.fEnd;
			if(start<0|| (position.getStart()>=0 && position.getStart()<start)) {
				start=position.getStart();
			}
			if(end<position.getEnd()) {
				end=position.getEnd();
			}
			pos=new SourcePosition(start,end);
		}
		return pos;
	}
	
	public ISourcePosition clone() {
		return new SourcePosition(this.fStart,this.fEnd);
	}
	
	@Override
	public int hashCode() {
		return (this.fStart<<16)+this.fEnd;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof ISourcePosition) {
			return ((ISourcePosition)obj).getStart()==this.fStart
				&& ((ISourcePosition)obj).getEnd()==this.fEnd;
		}
		return false;
	}

	public boolean contains(ISourcePosition position) {
		if(position==null) return false;
		if(position==this) return true;
		if(this.fStart>=0 && position.getStart()<0
			|| this.fEnd>=0 && position.getEnd()<0) return false;
		if(this.fStart<=position.getStart()
			&& (this.fEnd<=0 || this.fEnd>=position.getEnd()))
			return true;
		return false;
	}
}
