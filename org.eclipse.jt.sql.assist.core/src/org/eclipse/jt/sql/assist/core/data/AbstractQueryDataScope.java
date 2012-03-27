/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.data;

import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;

/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractQueryDataScope<TScope extends AbstractQueryDataScope<TScope>>
		extends AbstractGeneralDataScope<TScope>
		implements IQueryScopeDataKinds {
	

	protected ReferencedDataMap<SubQueryStatement, IQueryDefine> fWiths;
	protected ReferencedDataList<DerivedColumn, ISqlTypeDefine> fColumns;
	
	protected AbstractQueryDataScope() {
		super();
	}
	
	protected AbstractQueryDataScope(TScope parent) {
		super(parent);
	}
	
	@Override
	public void clear() {
		if(fColumns!=null) fColumns.clear();
		if(fWiths!=null) fWiths.clear();
		super.clear();
	}

	public ReferencedDataList<DerivedColumn, ISqlTypeDefine> getColumns(boolean newIfNull) {
		if(fColumns==null && newIfNull) {
			fColumns = new ReferencedDataList<DerivedColumn, ISqlTypeDefine>();
		}
		return fColumns;
	}

	public void setColumns(ReferencedDataList<DerivedColumn, ISqlTypeDefine> columns) {
		fColumns = columns;
	}

	public ReferencedDataMap<SubQueryStatement, IQueryDefine> getWiths(boolean newIfNull) {
		if(fWiths==null) {
			if(fParent!=null) {
				fWiths = fParent.getWiths(newIfNull); // 这里是直接使用父域的相应对象，所有不算作是new操作，无论newIfNull是否为true
			} else if(newIfNull) {
				fWiths = new ReferencedDataMap<SubQueryStatement, IQueryDefine>();
			}
		}
		return fWiths;
	}

	public void setWiths(
			ReferencedDataMap<SubQueryStatement, IQueryDefine> arguments) {
		fWiths = arguments;
	}
	
	public DataReference<SubQueryStatement, IQueryDefine> getWith(String queryName) {
		return fWiths!=null ? fWiths.get(queryName) : (fParent!=null? fParent.getWith(queryName): null);
	}
}
