/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface IFunctionPattern extends IDataDefine {

	public IFunctionDefine getFunctionDefine();
	public ISqlTypeDefine getReturnType();
	public IParameterDefine[] getParameterList();
	public int getParameterCount();
	public boolean isMatch(ISqlTypeDefine[] paraTypes);
}
