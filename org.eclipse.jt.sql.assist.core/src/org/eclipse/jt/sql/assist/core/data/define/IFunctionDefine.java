/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface IFunctionDefine extends IDataDefine {
//	public ISqlTypeDefine getReturnType();
//	public IParameterDefine[][] getParameterLists();
//	public IParameterDefine[] getParameterList(int paramCount);
//	public IParameterDefine[] getClosestParameterList(ISqlTypeDefine[] paraTypes);
//	public boolean isMatch(ISqlTypeDefine[] paraTypes);
	public IFunctionPattern[] getPatterns();
	public IFunctionPattern[] matchPattern(int paramCount);
	public IFunctionPattern matchPattern(ISqlTypeDefine[] paraTypes);
	public IFunctionPattern findClosestPattern(ISqlTypeDefine[] paraTypes);
}
