/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import java.util.Map;

import org.eclipse.jt.script.assist.IDataDefine;


/**
 * @author Jeff Tang
 *
 */
public interface IQueryDefine extends IDataDefine {
	public Map<String, ISqlTypeDefine> getResultsMap();
	public String[] getResultNames();
	public ISqlTypeDefine[] getResultTypes();
	
	public ITableDefineReference[] getTableReferences();
	public IParameterDefine[] getParameters();
	
}
