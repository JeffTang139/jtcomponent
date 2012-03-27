/**
 * 
 */
package org.eclipse.jt.sql.assist.core.util;

import java.util.Map;

import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.ast.query.TableReference;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataList;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.define.IEntityDefine;
import org.eclipse.jt.sql.assist.core.data.define.IMappingDefine;
import org.eclipse.jt.sql.assist.core.data.define.IParameterDefine;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;


/**
 * @author Jeff Tang
 *
 */
public final class DataScopeUtils {

	private DataScopeUtils() {}
	
	public static QueryDataScope getQueryDataScope(IQueryDefine query) {
		QueryDataScope queryDataScope=QueryDataScope.getInstance();
		assignQueryScope(queryDataScope, query);
		return queryDataScope;
	}
	
	public static MappingDataScope getMappingDataScope(IMappingDefine orm) {
		MappingDataScope mappingDataScope=MappingDataScope.getInstance();
		assignMappingScope(mappingDataScope, orm);
		return mappingDataScope;
	}
	
	public static void assignMappingScope(AbstractMappingDataScope<?> mappingDataScope, IMappingDefine orm) {
		mappingDataScope.setMapping(getMapping(orm));
		assignQueryScope(mappingDataScope, orm);
	}
	
	public static void assignQueryScope(AbstractQueryDataScope<?> queryDataScope, IQueryDefine query) {
		queryDataScope.setTableReferences(getTableReferences(query));
		queryDataScope.setArguments(getArguments(query));
		queryDataScope.setColumns(getColumns(query));
	}
	
	public static DataReference<MappingStatement, IEntityDefine> getMapping(IMappingDefine orm) {
		IEntityDefine mapping=orm.getMappingTarget();
		if(mapping==null) return null;
		MappingStatement dec= new MappingStatement(SourcePosition.getEmpty());
		DataReference<MappingStatement, IEntityDefine> ref=
			new DataReference<MappingStatement, IEntityDefine>(dec, mapping);
		return ref;
	}

	public static ReferencedDataList<DerivedColumn, ISqlTypeDefine> getColumns(IQueryDefine query) {
		Map<String, ISqlTypeDefine> map = query.getResultsMap();
		if(map==null) return null;
		ReferencedDataList<DerivedColumn, ISqlTypeDefine> names= new ReferencedDataList<DerivedColumn, ISqlTypeDefine>();
		for(String column : map.keySet()) {
			DerivedColumn dc = new DerivedColumn(SourcePosition.getEmpty(), null);
			dc.setAlias(new TokenNode(column, SourcePosition.getEmpty()));
			DataReference<DerivedColumn, ISqlTypeDefine> ref = 
				new DataReference<DerivedColumn, ISqlTypeDefine>(dc,  map.get(column));
			names.put(column, ref);
		}
		return names;
	}

	public static ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> getArguments(IQueryDefine query) {
		IParameterDefine[] arguments=query.getParameters();
		if(arguments==null) return null;
		ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> map =
			new ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine>();
		for(IParameterDefine argu : arguments) {
			ArgumentDeclaration dec=
				new ArgumentDeclaration(SourcePosition.getEmpty(),null, new TokenNode(argu.getName(), SourcePosition.getEmpty()),null);
			DataReference<ArgumentDeclaration, ISqlTypeDefine> ref=
				new DataReference<ArgumentDeclaration, ISqlTypeDefine>(dec, argu.getSqlType());
			map.put(argu.getName(),ref);
		}
		return map;
	}

	public static ReferencedDataMap<IResultSetReference, ITableDefine> getTableReferences(IQueryDefine query) {
		ITableDefineReference[] tables=query.getTableReferences();
		if(tables==null) return null;
		ReferencedDataMap<IResultSetReference, ITableDefine> map =
			new ReferencedDataMap<IResultSetReference, ITableDefine>();
		for(ITableDefineReference table : tables) {
			TokenNode nameToken = new TokenNode(table.getTargetName(), SourcePosition.getEmpty());
			IResultSetReference dec=
				new TableReference(SourcePosition.getEmpty(), nameToken,table.isForUpdate(),null);
			DataReference<IResultSetReference, ITableDefine> ref=
				new DataReference<IResultSetReference, ITableDefine>(dec, table.getTarget());
			map.put(table.getTargetName(),ref);
		}
		return map;
	}
}
