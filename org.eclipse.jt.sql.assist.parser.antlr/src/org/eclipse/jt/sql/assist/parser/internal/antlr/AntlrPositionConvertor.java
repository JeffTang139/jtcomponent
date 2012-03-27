/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.internal.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarningPosition;
import org.eclipse.jt.sql.assist.core.DnaSql;



/**
 * @author Jeff Tang
 *
 */
public final class AntlrPositionConvertor {
	private IPositionManager fPosMgr;

	public AntlrPositionConvertor(String fileName, String content) {
		fPosMgr=DnaSql.getDefault().createPositionManager(fileName ,content);
	}
	public AntlrPositionConvertor(IPositionManager posMgr) {
		fPosMgr=posMgr;
	}
	
	//public ISourcePosition convert(int tokenStart, int tokenEnd) {
	//	return new SourcePosition(tokenStart,tokenEnd);
	//}
	
	public ISourcePosition getPosition(Token token) {
		if( token == null ) {
			return getEmptySourcePosition();
		}
		int offset=-1;
		int length=-1;
		if(token instanceof CommonToken) {
			offset=((CommonToken)token).getStartIndex();
			length=((CommonToken)token).getStopIndex()-offset+1;
		} else {
			int line = token.getLine()-1;
			if( line < 0 )  line = 0; 
			int column = token.getCharPositionInLine();
			if( column < 0 ) column = 0;
			offset=fPosMgr.getOffset(line, column);
			length = token.getText()!=null ? token.getText().length():0;
		}
		return fPosMgr.getSourcePosition(offset,length);
	}
	
	public ISourcePosition getPosition(int line, int column) {
		return fPosMgr.getSourcePosition(fPosMgr.getOffset(line, column),0);
	}
	
	public ISourcePosition getOffsetPosition(int start, int end) {
		return fPosMgr.getSourcePosition(start,end-start);
	}

	public ISourcePosition getOutWhere() {
		return getEmptySourcePosition();
	}
	
	public IWarningPosition getWarningPosition(ISourcePosition pos) {
		return fPosMgr.getWarningPosition(fPosMgr.fix(pos));
	}
	
	public String toString(ISourcePosition pos) {
		int line=fPosMgr.getLine(pos.getStart());
		return "[line "+line+" column "+fPosMgr.getColumn(line,pos.getStart())+"]";
	}
	
	public ISourcePosition getEmptySourcePosition() {
		return fPosMgr.getSourcePosition(-1, 0);
	}
}
