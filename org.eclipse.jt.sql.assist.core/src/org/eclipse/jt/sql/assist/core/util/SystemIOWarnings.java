/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.util;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.IWarningPosition;
import org.eclipse.jt.script.assist.analysis.ICompletionMessager;
import org.eclipse.jt.script.assist.analysis.ICompletionProposal;
import org.eclipse.jt.script.assist.backend.IGeneratorWarnings;
import org.eclipse.jt.script.assist.frontend.ISemanticWarnings;
import org.eclipse.jt.script.assist.frontend.ISourceParseWarnings;
import org.eclipse.jt.sql.assist.core.process.PositionManager;


/**
 * 系统IO输出的消息警示器，通常用于DEBUG，不推荐在正常逻辑中使用该类型的对象
 * @author Jeff Tang
 * 
 */
public class SystemIOWarnings implements ISourceParseWarnings, IGeneratorWarnings, ISemanticWarnings, ICompletionMessager {

	private IPositionManager fPosMgr;
	private int fMsgNumber;

	public SystemIOWarnings(String content) {
		fPosMgr = new PositionManager("", content);
	}

	public SystemIOWarnings(IPositionManager posMgr) {
		fPosMgr = posMgr;
	}

	/**
	 * @return the fMsgNumber
	 */
	public int getMsgNumber() {
		return fMsgNumber;
	}

	/**
	 * @param msgNumber the fMsgNumber to set
	 */
	public void setMsgNumber(int msgNumber) {
		fMsgNumber = msgNumber;
	}

	public IPositionManager getPositionManager() {
		return fPosMgr;
	}

	public void setPositionManager(PositionManager posMgr) {
		fPosMgr = posMgr;
	}

	public void info(String message) {
		StringBuffer buffer=new StringBuffer(80);
		buffer.append(fMsgNumber++).append('\t');
		buffer.append("info : ");
		buffer.append(message);
		System.out.println(buffer);
	}

	public void debug(String message) {
		StringBuffer buffer=new StringBuffer(80);
		buffer.append(fMsgNumber++).append('\t');
		buffer.append("debug : ");
		buffer.append(message);
		System.out.println(buffer);
	}

	public void fatal(String message) {
		StringBuffer buffer=new StringBuffer(100);
		buffer.append(fMsgNumber++).append("  !!").append('\t');
		buffer.append("fatal : ");
		buffer.append(message);
		System.err.println(buffer);
	}

	public void report(Throwable throwable, Object reporter) {
		throwable.printStackTrace();
	}

	public void error(int kind, String[] contents,
			IWarningPosition position, String message) {
		printError(position,"parser",message);
	}

	public void warn(int kind, String[] contents,
			IWarningPosition position, String message) {
		printWarn(position,"parser",message);
	}

	public void error(String message, IWarningPosition pos) {
		printError(pos,"generate",message);
	}

	public void warn(String message, IWarningPosition pos) {
		printWarn(pos,"generate",message);
	}

	public void error(int id, String[] arguments, String message, IAstNode obj) {
		printError(obj!=null?fPosMgr.getWarningPosition(obj.getPosition()):null,"semantic",message);
	}

	public void warn(int id, String[] arguments, String message, IAstNode obj) {
		printWarn(obj!=null?fPosMgr.getWarningPosition(obj.getPosition()):null,"semantic",message);
	}

	protected void printError(IWarningPosition position, String type, String message) {

		StringBuffer buffer=new StringBuffer(100);
		buffer.append(fMsgNumber++).append("  !!").append('\t');
		if (!PositionManager.isEmpty(position)) {
			if(type!=null)
				buffer.append(type).append(' ');
			buffer.append("error at [line ");
			buffer.append(position.getStartLine() + 1);
			buffer.append(" column ");
			buffer.append(position.getStartColumn() + 1);
			buffer.append("] : ");
		} else {
			buffer.append("error : ");
		}
		buffer.append(message);
		System.out.println(buffer);
	}
	
	protected void printWarn(IWarningPosition position, String type, String message) {
		StringBuffer buffer=new StringBuffer(100);
		buffer.append(fMsgNumber++).append("  !!").append('\t');
		if (!PositionManager.isEmpty(position)) {
			if(type!=null)
				buffer.append(type).append(' ');
			buffer.append("warn at [line ");
			buffer.append(position.getStartLine() + 1);
			buffer.append(" column ");
			buffer.append(position.getStartColumn() + 1);
			buffer.append("] : ");
		} else {
			buffer.append("warn : ");
		}
		buffer.append(message);
		System.out.println(buffer);
	}

	public void assit(ICompletionProposal proposal) {
		if(proposal!=null) {
			StringBuffer buffer=new StringBuffer(100);
			buffer.append(fMsgNumber++).append('\t');
			if(fPosMgr!=null) {
				buffer.append("proposal at [line ");
				buffer.append(fPosMgr.getLine(proposal.getPosition()) + 1);
				buffer.append(" column ");
				buffer.append(fPosMgr.getColumn(fPosMgr.getLine(proposal.getPosition()), proposal.getPosition()) + 1);
				buffer.append("] : ");
			} else {
				buffer.append("proposal : ");
			}
			buffer.append("\tname [");
			buffer.append(proposal.getName());
			buffer.append("] \tcompletion [");
			buffer.append(proposal.getCompletion());
			buffer.append("] ");
			System.out.println(buffer);
		}
	}

	public boolean isIgnored(int kind) {
		return false;
	}
}
