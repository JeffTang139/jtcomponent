/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IDataDefine;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;


/**
 * @author Jeff Tang
 *
 */
public class CompletionUtil {
	public static String[] getDataTypeNames() {
		return DataTypeReference.DATA_TYPE_NAMES;
	}
	
	public static List<String> getFiledDataTypeNames(String prefix) {
		List<String> names=new ArrayList<String>();
		String[] array=getDataTypeNames();
		for(int i=0;i<array.length;i++)
			if(array[i].startsWith(prefix))
				names.add(array[i]);
		return names;
	}
	
	public static List<String> getNames(Iterable<String> names, String prefix) {
		List<String> nameList=new ArrayList<String>();
		for(String n : names) {
			if(n!=null && (prefix==null || n.startsWith(prefix)))
				nameList.add(n);
		}
		return nameList;
	}
	
	public static boolean isStartWithIgnoreCase(String str, String sub, int offset) {
		for(int i=0;i<sub.length();i++) {
			if(offset+i>str.length()) return false;
			if(Character.toUpperCase(str.charAt(offset+i))!=Character.toUpperCase(sub.charAt(i))) return false;
		}
		return true;
	}
	
	public static String getDescription(IDataDefine nd) {
		String des=nd.getDescription();
//		if(des==null||des.length()==0)
//			des=nd.getName();
		return des;
	}
}
