/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.IWarnings;


/**
 * @author Jeff Tang
 *
 */
public class AbstractMessager<TWarnings extends IWarnings> {

	public static boolean USING_MESSAGE_INDENT=Boolean.parseBoolean(System.getProperty("dnasql.assist.debug.indent"));
	
	protected TWarnings fWarnings;
	private StringBuffer fIndent;
	
	public AbstractMessager() {
		fWarnings=null;
		this.fIndent=new StringBuffer();
		resetIndent();
	}
	
	public final void resetIndent() {
		this.fIndent.delete(0, this.fIndent.length());
		this.fIndent.append('\t');
	}
	
	public final StringBuffer newMessageBuffer() {
		return new StringBuffer(fIndent);
	}
	
	public final String getIndent() {
		return fIndent.toString();
	}
	
	public void info(String message) {
		if(USING_MESSAGE_INDENT) message=fIndent.toString()+message;
		if(this.fWarnings!=null) {
			this.fWarnings.info(message);
		} else {
			System.out.println(message);
		}
	}
	public void debug(String message) {
		if(USING_MESSAGE_INDENT) message=fIndent.toString()+message;
		if(this.fWarnings!=null) {
			this.fWarnings.debug(message);
		} else {
			System.out.println(message);
		}
	}
	
	public void fatal(String message) {
		if(USING_MESSAGE_INDENT) message=fIndent.toString()+message;
		if(this.fWarnings!=null) {
			this.fWarnings.fatal(message);
		} else {
			System.err.println(message);
		}
	}
	
	public void report(Throwable throwable, Object reporter) {
		if(this.fWarnings!=null) {
			this.fWarnings.report(throwable, reporter);
		} else {
			System.out.print("!error:\t");
			throwable.printStackTrace();
		}
	}

	public final void enter(Class<?> type) {
		StringBuffer buffer=new StringBuffer();
		if(USING_MESSAGE_INDENT) buffer.append(fIndent);
		buffer.append("enter [");
		buffer.append(type.getSimpleName());
		buffer.append("]");
		if(USING_MESSAGE_INDENT) fIndent.append('\t');
		if(this.fWarnings!=null) {
			this.fWarnings.info(buffer.toString());
		} else {
			System.out.println(buffer.toString());
		}
	}
	
	public final void exit(Class<?> type) {
		if(USING_MESSAGE_INDENT && fIndent.length()>0)
			fIndent.deleteCharAt(fIndent.length()-1);
		StringBuffer buffer=new StringBuffer();
		if(USING_MESSAGE_INDENT) buffer.append(fIndent);
		buffer.append("exit  [");
		buffer.append(type.getSimpleName());
		buffer.append("]");
		if(this.fWarnings!=null) {
			this.fWarnings.info(buffer.toString());
		} else {
			System.out.println(buffer.toString());
		}
	}
}
