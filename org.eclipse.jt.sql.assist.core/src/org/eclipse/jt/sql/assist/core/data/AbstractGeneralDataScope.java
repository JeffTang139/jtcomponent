/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractGeneralDataScope<TScope extends AbstractGeneralDataScope<TScope>> 
		extends AbstractDataScope<TScope>
		implements IGeneralScopeDataKinds {

	
	protected ReferencedDataMap<IResultSetReference, ITableDefine> fTableReferences;
	protected ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> fArguments;
	
	protected AbstractGeneralDataScope() {
		super();
	}
	
	protected AbstractGeneralDataScope(TScope parent) {
		super(parent);
	}
	
	@Override
	public void clear() {
		if(fTableReferences!=null) fTableReferences.clear();
		if(fArguments!=null) fArguments.clear();
		super.clear();
	}

	public ReferencedDataMap<IResultSetReference, ITableDefine> getTableReferences(boolean newIfNull) {
		if(fTableReferences==null && newIfNull) {
			if(fParent!=null) {
				fTableReferences = fParent.getTableReferences(true).createSubMap();
			} else {
				fTableReferences = new ReferencedDataMap<IResultSetReference, ITableDefine>();
			}
		}
		return fTableReferences;
	}

	public void setTableReferences(ReferencedDataMap<IResultSetReference, ITableDefine> tableReferences) {
		fTableReferences = tableReferences;
	}
	
	public DataReference<IResultSetReference, ITableDefine> getTableReference(String alias) {
		return fTableReferences!=null ? fTableReferences.get(alias) : (fParent!=null? fParent.getTableReference(alias): null);
	}

	public ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> getArguments(boolean newIfNull) {
		if(fArguments==null) {
			if(fParent!=null) {
				fArguments = fParent.getArguments(newIfNull); // 这里是直接使用父域的相应对象，所有不算作是new操作，无论newIfNull是否为true
			} else if(newIfNull) {
				fArguments = new ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine>();
			}
		}
		return fArguments;
	}

	public void setArguments(
			ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments) {
		fArguments = arguments;
	}
	
	public DataReference<ArgumentDeclaration, ISqlTypeDefine> getArgument(String argumentName) {
		return fArguments!=null ? fArguments.get(argumentName) : (fParent!=null? fParent.getArgument(argumentName): null);
	}

}
