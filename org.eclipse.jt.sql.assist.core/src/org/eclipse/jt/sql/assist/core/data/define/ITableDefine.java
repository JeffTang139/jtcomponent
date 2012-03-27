/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.define;

import org.eclipse.jt.script.assist.IDataDefine;

/**
 * @author Jeff Tang
 *
 */
public interface ITableDefine extends IDataDefine {
	public ISqlFieldDefine[] getFields();
	public ISqlFieldDefine getField(String name);
	public boolean containFields(String name);
	public ITableRelationDefine[] getRelations();
	public ITableRelationDefine getRelation(String name);
	public boolean containRelations(String name);
	public IHierarchyDefine[] getHierarchies();
	public IHierarchyDefine getHierarchy(String name);
	public boolean containHierarchies(String name);
	public boolean isDynamicResult();
}
