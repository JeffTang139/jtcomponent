/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarningPosition;


/**
 * @author Jeff Tang
 *
 */
public class WarningPosition extends SourcePosition implements IWarningPosition {

	private IPositionManager fMgr;
	
	public WarningPosition(int start, int end, IPositionManager mgr) {
		super(start, end);
		fMgr=mgr;
	}
	
	public WarningPosition(ISourcePosition sourcePos, IPositionManager mgr) {
		super(sourcePos.getStart(), sourcePos.getEnd());
		fMgr=mgr;
	}

	public int getEndColumn() {
		return fMgr.getColumn(getEndLine(), this.getEnd());
	}

	public int getEndLine() {
		return fMgr.getLine(this.getEnd());
	}

	public int getStartColumn() {
		return fMgr.getColumn(getStartLine(), this.getStart());
	}

	public int getStartLine() {
		return fMgr.getLine(this.getStart());
	}
	
	public IWarningPosition union(ISourcePosition position) {
		ISourcePosition sourcePos=super.union(position);
		return sourcePos==this? this : new WarningPosition(sourcePos,fMgr);
	}
	
	public IWarningPosition clone() {
		return new WarningPosition(this.getStart(),this.getEnd(),fMgr);
	}
	
	public IWarningPosition fix() {
		ISourcePosition sourcePos=fMgr.fix(this);
		if(this!=sourcePos) {
			return new WarningPosition(sourcePos,fMgr);
		} else {
			return this;
		}
	}
}
