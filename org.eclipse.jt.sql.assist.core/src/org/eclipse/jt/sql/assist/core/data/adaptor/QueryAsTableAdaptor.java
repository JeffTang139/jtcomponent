/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.adaptor;

import java.util.Map;

import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.define.IHierarchyDefine;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableRelationDefine;


/**
 * @author Jeff Tang
 *
 */
public class QueryAsTableAdaptor implements ITableDefine {

	private IQueryDefine fQuery;
	
	public QueryAsTableAdaptor(IQueryDefine query) {
		fQuery = query;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#containFields(java.lang.String)
	 */
	public boolean containFields(String name) {
		Map<String, ISqlTypeDefine> map = fQuery.getResultsMap();
		return map!=null && map.containsKey(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#containHierarchies(java.lang.String)
	 */
	public boolean containHierarchies(String name) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#containRelations(java.lang.String)
	 */
	public boolean containRelations(String name) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getField(java.lang.String)
	 */
	public ISqlFieldDefine getField(String name) {
		Map<String, ISqlTypeDefine> map = fQuery.getResultsMap();
		if(map==null) return null;
		ISqlTypeDefine type = map.get(name);
		if(type!=null) {
			return new SqlFieldAdaptor(name, type, fQuery);
		} else if(map.containsKey(name)) {
			return new SqlFieldAdaptor(name, type, fQuery);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getFields()
	 */
	public ISqlFieldDefine[] getFields() {
		Map<String, ISqlTypeDefine> map = fQuery.getResultsMap();
		if(map==null) return null;
		String[] names = fQuery.getResultNames();
		ISqlFieldDefine[] fields = new ISqlFieldDefine[names.length];
		for(int i=0; i<names.length; i++) {
//			if(names[i]==null) throw new NullPointerException("ill ");
			// 如果名字为空，可能是脚本不完整的情况，则该字段忽略
			if(names[i]==null) continue;
			ISqlTypeDefine type = map.get(names[i]);
			// 如果类型为空，可能是脚本不完整的情况，但该字段不忽略，用于代码提示
//			if(type==null) continue;
			fields[i] = new SqlFieldAdaptor(names[i], type, fQuery);
		}
		return fields;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getHierarchies()
	 */
	public IHierarchyDefine[] getHierarchies() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getHierarchy(java.lang.String)
	 */
	public IHierarchyDefine getHierarchy(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getRelation(java.lang.String)
	 */
	public ITableRelationDefine getRelation(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.data.define.ITableDefine#getRelations()
	 */
	public ITableRelationDefine[] getRelations() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDefine#getName()
	 */
	public String getName() {
		return fQuery.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getDescription()
	 */
	public String getDescription() {
		return fQuery.getDescription();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getID()
	 */
	public String getID() {
		return fQuery.getID();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IDataDescriptor#getKind()
	 */
	public int getKind() {
		return DataKinds.TABLE_DEFINE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAdaptable#getAdaptor(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		if(IQueryDefine.class.equals(clazz)) {
			return (TAdaptor)fQuery;
		}
		return null;
	}

	public Object getSource() {
		return fQuery;
	}

	public boolean isDynamicResult() {
		return true;
	}

}
