/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.internal.util;

import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;

/**
 * @author Jeff Tang
 *
 */
public class SemanticUtil {
	public static boolean isAssignable(ISqlTypeDefine target, ISqlTypeDefine from) {
		if(target==null||from==null) return false;
		int cap=target.isAssignableFrom(from);
		return cap==ISqlTypeDefine.ASSIGN_CASE_SAME || cap==ISqlTypeDefine.ASSIGN_CASE_IMPLICIT;
	}
	public static boolean isAssignable(String target, ISqlTypeDefine from) {
		if(target==null||from==null) return false;
		int cap=from.isAssignableTo(target);
		return cap==ISqlTypeDefine.ASSIGN_CASE_SAME || cap==ISqlTypeDefine.ASSIGN_CASE_IMPLICIT;
	}
	
	public static boolean isMapable(ISqlTypeDefine target, ISqlTypeDefine from) {
		if(target==null||from==null) return false;
		int cap=target.isAssignableFrom(from);
		return cap!=ISqlTypeDefine.ASSIGN_CASE_NO;
	}
	
	public static boolean isComparable(ISqlTypeDefine one, ISqlTypeDefine other) {
		return isAssignable(one, other) || isAssignable(other, one);
	}
	
	public static ISqlTypeDefine getCommonType(ISqlTypeDefine one, ISqlTypeDefine other) {
		if(isAssignable(one,other)) return one;
		if(isAssignable(other,one)) return other;
		else return null;
	}
}
