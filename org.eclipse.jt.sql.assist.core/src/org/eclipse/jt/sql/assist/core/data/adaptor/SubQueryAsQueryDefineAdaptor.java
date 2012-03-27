/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data.adaptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.define.IParameterDefine;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;


/**
 * @author Jeff Tang
 *
 */
public class SubQueryAsQueryDefineAdaptor implements IQueryDefine {
	
	private String fName;
	private SubQueryStatement fSubQuery;
	private ISqlTypeDefine[] fResultTypes;
	private String fDescription;
	private ITableDefineReference[] fTableDefRefs;
	
	public SubQueryAsQueryDefineAdaptor(String name, SubQueryStatement subQuery, ISqlTypeDefine[] resultTypes) {
		fName = name;
		fSubQuery = subQuery;
		fResultTypes = resultTypes;
	}

	public IParameterDefine[] getParameters() {
		return null;
	}

	public String[] getResultNames() {
		if(fSubQuery.getSelect()==null) return null;
		List<DerivedColumn> columns = fSubQuery.getSelect().getDerivedColumns();
		if(columns==null || columns.size()==0) return null;
		String[] names = new String[columns.size()];
		for(int i=0; i<names.length; i++) {
			DerivedColumn column = columns.get(i);
			if(column!=null && column.getAlias()!=null) {
				names[i] = column.getAlias().getTexture();
			}
		}
		return names;
	}

	public ISqlTypeDefine[] getResultTypes() {
		return fResultTypes;
	}

	public Map<String, ISqlTypeDefine> getResultsMap() {
//		if(fResultTypes==null) return null;

		if(fSubQuery.getSelect()==null) return null;
		List<DerivedColumn> columns = fSubQuery.getSelect().getDerivedColumns();
		if(columns==null || columns.size()==0) return null;
		Map<String, ISqlTypeDefine> map = new HashMap<String, ISqlTypeDefine>();
		for(int i=0; i<columns.size(); i++) {
			DerivedColumn column = columns.get(i);
			if(column!=null && column.getAlias()!=null) {
				ISqlTypeDefine type = null;
				if(fResultTypes!=null && i< fResultTypes.length) {
					type = fResultTypes[i];
				}
				map.put(column.getAlias().getTexture(), type);
			}
		}
		
		return map;
	}

	public ITableDefineReference[] getTableReferences() {
		return fTableDefRefs;
	}
	
	public void setTableReferences(ITableDefineReference[] tableDefRefs) {
		this.fTableDefRefs = tableDefRefs;
	}

	public String getName() {
		return fName;
	}

	public String getID() {
		return fName;
	}

	public String getDescription() {
		return fDescription;
	}
	
	public void setDescription(String description) {
		fDescription = description;
	}

	public int getKind() {
		return DataKinds.QUERY_DEFINE;
	}

	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		return null;
	}

	public Object getSource() {
		return fSubQuery;
	}

}
