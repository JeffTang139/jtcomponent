/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.kinds;

/**
 * @author Jeff Tang
 *
 */
public interface LiteralKinds {
	public final static int KIND_INTEGER=0;
	public final static int KIND_FLOAT=1;
	public final static int KIND_STRING=2;
	public final static int KIND_DATE=3;
	public final static int KIND_GUID=4;
	public final static int KIND_BYTES=5;
	public final static int KIND_BOOLEAN=6;
	public final static int COUNT_KIND=7;
	
	public final static String[] ARRAY_KIND_NAME=new String[] {
		"int",
		"float",
		"string",
		"date",
		"guid",
		"bytes",
		"boolean",
		"unknown",
	};
}
