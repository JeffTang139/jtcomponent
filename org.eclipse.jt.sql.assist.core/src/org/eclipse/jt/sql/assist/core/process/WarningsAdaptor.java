/**
 * 
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.IWarningPosition;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.backend.IGeneratorWarnings;
import org.eclipse.jt.script.assist.frontend.ISemanticWarnings;
import org.eclipse.jt.script.assist.frontend.ISourceParseWarnings;
import org.eclipse.jt.sql.assist.core.exception.ErrorWarningException;


/**
 * @author Jeff Tang
 *
 */
public class WarningsAdaptor implements IWarnings, ISourceParseWarnings, IGeneratorWarnings, ISemanticWarnings {

	public static final String TYPE_PARSE="parse";
	public static final String TYPE_GENERATE="generate";
	public static final String TYPE_SEMANTIC="semantic";
	
	
	private IWarnings fWranings;
	private IPositionManager fPosMgr;
	
	public WarningsAdaptor(IWarnings warnings, String content) {
		fWranings=warnings;
		fPosMgr = new PositionManager("", content);
	}
	
	public WarningsAdaptor(IWarnings warnings, IPositionManager posMgr) {
		fWranings=warnings;
		fPosMgr = posMgr;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#debug(java.lang.String)
	 */
	public void debug(String message) {
		if(fWranings!=null) fWranings.debug(message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#fatal(java.lang.String)
	 */
	public void fatal(String message) {
		if(fWranings!=null) fWranings.fatal(message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#info(java.lang.String)
	 */
	public void info(String message) {
		if(fWranings!=null) fWranings.info(message);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IWarnings#report(java.lang.Throwable, java.lang.Object)
	 */
	public void report(Throwable throwable, Object reporter) {
		if(fWranings!=null) fWranings.report(throwable, reporter);
	}
	

	public void error(int kind, String[] contents, IWarningPosition position,
			String message) {
		reportError(position, TYPE_PARSE, message, null);
	}

	public void warn(int kind, String[] contents, IWarningPosition position,
			String message) {
		reportWarn(position, TYPE_PARSE, message, null);
	}

	public void error(String message, IWarningPosition pos) {
		reportError(pos, TYPE_GENERATE, message, null);
	}

	public void warn(String message, IWarningPosition pos) {
		reportWarn(pos, TYPE_GENERATE, message, null);
	}

	public void error(int kind, String[] arguments, String message, IAstNode ast) {
		reportError(ast!=null?fPosMgr.getWarningPosition(ast.getPosition()):null, TYPE_SEMANTIC, message, ast);
	}

	public void warn(int kind, String[] arguments, String message, IAstNode ast) {
		reportWarn(ast!=null?fPosMgr.getWarningPosition(ast.getPosition()):null, TYPE_SEMANTIC, message, ast);
	}
	
	protected void reportError(IWarningPosition position, String type, String message, IAstNode ast) {
		StringBuffer buffer=new StringBuffer(100);
		if (!PositionManager.isEmpty(position)) {
			if(type!=null)
				buffer.append(type).append(' ');
			buffer.append("error[@line:");
			buffer.append(position.getStartLine() + 1);
			buffer.append(",column:");
			buffer.append(position.getStartColumn() + 1);
			buffer.append("]: ");
		} else {
			buffer.append("error: ");
		}
		buffer.append(message);
		report(new ErrorWarningException(buffer.toString(), position, ast), ast!=null? ast : this);
	}

	protected void reportWarn(IWarningPosition position, String type, String message, IAstNode ast) {
		StringBuffer buffer=new StringBuffer(100);
		if (!PositionManager.isEmpty(position)) {
			if(type!=null)
				buffer.append(type).append(' ');
			buffer.append("warn[@line:");
			buffer.append(position.getStartLine() + 1);
			buffer.append(",column:");
			buffer.append(position.getStartColumn() + 1);
			buffer.append("]: ");
		} else {
			buffer.append("warn: ");
		}
		buffer.append(message);
		report(new ErrorWarningException(buffer.toString(), position, ast), ast!=null? ast : this);
	}

}
