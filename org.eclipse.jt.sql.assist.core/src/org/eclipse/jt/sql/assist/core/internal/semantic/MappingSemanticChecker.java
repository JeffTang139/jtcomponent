/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.internal.semantic;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.sql.assist.core.DataConfigures;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.external.ExternalTableReference;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstNode;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataList;
import org.eclipse.jt.sql.assist.core.data.define.IEntityDefine;
import org.eclipse.jt.sql.assist.core.data.define.IJavaFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.IMappingDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;
import org.eclipse.jt.sql.assist.core.internal.util.SemanticUtil;


/**
 * @author Jeff Tang
 *
 */
public abstract class MappingSemanticChecker<TScope extends AbstractMappingDataScope<TScope>> extends QuerySemanticChecker<TScope>
		implements IMappingAstVisitor<Object, Object>{
	
	public final static class RealMappingSemanticChecker extends MappingSemanticChecker<MappingDataScope> {

		public static final RealMappingSemanticChecker getInstance() {
			return new RealMappingSemanticChecker();
		}
		
		private RealMappingSemanticChecker() {}
		
		@Override
		protected MappingDataScope convertScope(IDataScope<?> dataScope) {
			if(dataScope==null)
				throw new IllegalArgumentException("Argument dataScope cannot be null!");
			if(dataScope instanceof MappingDataScope) {
				return (MappingDataScope)dataScope;
			} else {
				throw new IllegalArgumentException(
						"Data scope of class 'MappingDataScope' expected, not '"
						+dataScope.getClass().getName()+"'.");
			}
		}

		@Override
		protected MappingDataScope createDefaultScope() {
			return MappingDataScope.getInstance();
		}
		
	}
	
	public static MappingSemanticChecker<?> getInstance() {
		return new RealMappingSemanticChecker();
	}
	
	protected MappingSemanticChecker() {}
	
	
	
	@Override
	protected void clean() {
		super.clean();
	}
	
	protected void checkEntityAllFieldMapped() {
		if(fScope.getMapping()!=null && fScope.getMapping().data!=null) {
			StringBuffer buffer=new StringBuffer();
			ReferencedDataList<DerivedColumn, ISqlTypeDefine> columnSet=fScope.getColumns(false);
			for(IJavaFieldDefine field: fScope.getMapping().data.getFields()) {
				if(columnSet==null || !columnSet.containsKey(field.getName())) {
					if(buffer.length()>0) buffer.append(", ");
					buffer.append(field.getName());
				}
			}
			if(buffer.length()>0) {
				buffer.insert(0, "some fields of this entity are defined without mapping : ");
				warn(KIND_ENTITY_NOT_EXIST,new String[]{},buffer.toString(), fScope.getMapping().ast);
			}
		}
	}
	
	
	@Override
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {
		if(ast instanceof IMappingAstNode) {
			return ((IMappingAstNode)ast).accept(this, data);
		} else {
			return super.visitGeneral(ast, data);
		}
	}

	@Override
	public Object visitDerivedColumn(DerivedColumn ast, Object data)
			throws Throwable {
		if(this.fScope!=this.fScope.getPrimary()) {
			return super.visitDerivedColumn(ast, data);
		}
		ISqlTypeDefine type=null;
		if(DEBUG) enter(DerivedColumn.class);
		if(ast.getPrimary()!=null) {
			type=this.checkValueExpression(ast.getPrimary(), data);
		}
		if(ast.getAlias()!=null && type!=null && fScope.getMapping()!=null) {
			IJavaFieldDefine fieldDefine=fScope.getMapping().data.getField(ast.getAlias().getTexture());
			if(fieldDefine!=null) {
				if(!SemanticUtil.isMapable(fieldDefine.getJavaType().getSqlType(),type)) {
					error(KIND_ENTITY_FEILD_TYPE_MISMATCH,new String[]{ast.getAlias().getTexture(),},
							"column type ["+type.getName()+"] not match the entity field' type ["+fieldDefine.getJavaType().getName()+"]", ast);
				}
			} else {
				error(KIND_ENTITY_FEILD_NAME_MISMATCH,new String[]{ast.getAlias().getTexture(),},
						"there is no field's name is ["+ast.getAlias().getTexture()+"] in entity ["+fScope.getMapping().data.getName()+"]", ast);
			}
		}

		if(ast.getAlias()!=null) {
			ReferencedDataList<DerivedColumn, ISqlTypeDefine> columnSet=fScope.getColumns(true);
			if(columnSet.containsKey(ast.getAlias().getTexture())) {
				error(KIND_COLUMN_ALIAS_ALREADY_EXIST,new String[]{ast.getAlias().getTexture()},
						"column alias name already in use",ast);
			} else {
				DataReference<DerivedColumn, ISqlTypeDefine> ref = new DataReference<DerivedColumn, ISqlTypeDefine>(ast, type);
				columnSet.put(ast.getAlias().getTexture(), ref);
			}
		}
		if(DEBUG) exit(DerivedColumn.class);
		return type;
	}

	public Object visitMappingDeclaration(MappingDeclaration ast, Object data)
			throws Throwable {
		Object columns=null;
		if(DEBUG) enter(MappingDeclaration.class);
		try {
			if(ast.getMapping()!=null) {
				ast.getMapping().accept(this, data);
			} else if(ast.getOverride()!=null) {
				ast.getOverride().accept(this, data);
			}
			columns=this.checkQueryDeclaration(ast, data);
		} catch (Throwable e) {
			report(e,ast);
		} finally {
			this.checkTableReferenceUsed();
			this.checkEntityAllFieldMapped();
		}
		if(DEBUG) exit(MappingDeclaration.class);
		return columns;
	}

	public Object visitMappingStatement(MappingStatement ast, Object data)
			throws Throwable {
		IEntityDefine entity=null;
		if(DEBUG) enter(MappingStatement.class);
		if(ast.getClassReference()!=null) {
			String entityName = (String) ast.getClassReference().accept(this, data);
			if(entityName!=null) {
				entity=(IEntityDefine) this.getData(entityName, DataKinds.ENTITY_DEFINE, null, ast, null);
				if(entity!=null)
					fScope.setMapping(new DataReference<MappingStatement, IEntityDefine>(ast,entity));
			}
		}
		if(DEBUG) exit(MappingStatement.class);
		return entity;
	}

	public Object visitMappingOverride(MappingOverride ast, Object data)
			throws Throwable {
		IMappingDefine superORM=null;
		if(DEBUG) enter(MappingOverride.class);
		if(ast.getSuper()!=null && ast.getSuper().getTexture()!=null) {
			Map<String,String> configs = new HashMap<String,String>();
			configs.put(DataConfigures.CONFIG_KEY_LIMIT, DataConfigures.CONFIG_VALUE_PACKAGE);
			superORM= (IMappingDefine) getData(ast.getSuper().getTexture(),DataKinds.MAPPING_DEFINE,configs, ast.getSuper(),null);
			if(superORM!=null) {
				fScope.setOverride(new DataReference<MappingOverride, IMappingDefine>(ast,superORM));

				for(ITableDefineReference tableRef : superORM.getTableReferences()) {
					IResultSetReference tr=new ExternalTableReference(tableRef);
					fScope.getTableReferences(true).put(tableRef.getAlias(), new DataReference<IResultSetReference, ITableDefine>(tr, tableRef.getTarget()));
				}
			}
		}
		if(DEBUG) exit(MappingOverride.class);
		return superORM;
	}
}
