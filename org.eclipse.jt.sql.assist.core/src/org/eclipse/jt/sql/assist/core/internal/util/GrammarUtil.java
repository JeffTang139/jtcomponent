/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.internal.util;

/**
 * @author Jeff Tang
 *
 */
public class GrammarUtil {
	
	public static String getPackageName(String fullName, char separator, boolean withSeparator) {
		if(fullName==null) return null;
		int index=fullName.lastIndexOf(separator);
		if(index>=0) {
			if(withSeparator) return fullName.substring(0, index+1);
			else return fullName.substring(0, index);
		}
		return null;
	}
	
	public static int getLastLength(String name, char separator) {
		if(name==null) return 0;
		int index=name.lastIndexOf(separator);
		if(index>=0) return name.length()-index-1;
		else return name.length();
	}
}
