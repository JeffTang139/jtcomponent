/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDescriptor;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.DataConfigures;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
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
import org.eclipse.jt.sql.assist.core.data.define.IEntityDefine;
import org.eclipse.jt.sql.assist.core.data.define.IJavaFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.IMappingDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;
import org.eclipse.jt.sql.assist.core.internal.util.GrammarUtil;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;


/**
 * @author Jeff Tang
 *
 */
public abstract class MappingCompletionDetector<TScope extends AbstractMappingDataScope<TScope>> extends QueryCompletionDetector<TScope>
		implements IMappingAstVisitor<Object, Boolean> {


	public static final class RealMappingCompletionDetector extends MappingCompletionDetector<MappingDataScope> {

		public static RealMappingCompletionDetector getInstance() {
			return new RealMappingCompletionDetector();
		}
		
		private RealMappingCompletionDetector() {}
		
		@Override
		protected MappingDataScope createDefaultScope() {
			return MappingDataScope.getInstance();
		}
		
	}
	
	public static MappingCompletionDetector<?> getInstance() {
		return new RealMappingCompletionDetector();
	}
	
	protected MappingCompletionDetector() {}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	protected TScope createDefaultScope() {
//		return (TScope) MappingDataScope.getInstance(MappingDataScope.class);
//	}
	
	@Override
	protected void clean() {
		super.clean();
	}
	
	@Override
	public Object visitGeneral(IAstNode ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IMappingAstNode) {
			return ((IMappingAstNode)ast).accept(this, forceIgnore);
		} else {
			return super.visitGeneral(ast, forceIgnore);
		}
	}

	public Object visitDerivedColumn(DerivedColumn ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(DerivedColumn.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		TokenNode alias=ast.getAlias();
		if(ast.getAs()!=null
				&& ast.getAs().getPosition()!=null
				&& fScope.getMapping()!=null
				&& !isIgnored(KIND_ENTITY_FIELD_REFERENCE, forceIgnore)
				&& (isVan(ast.getAs().getPosition())
						||(alias!=null && isSurround(alias))
					)
				) {
			String prefix=null;
			ISourcePosition replace=null;
			if(alias!=null && isSurround(alias)) {
				prefix=fContent.substring(ast.getAlias().getPosition().getStart(), fPosition);
				if(prefix.startsWith("\"")) prefix=prefix.substring(1);
				replace=new SourcePosition(fPosition-prefix.length(),fPosition);
			}
			assitEntityFields(prefix,ast,replace);
		}
		if(DEBUG) exit(DerivedColumn.class);
		return null;
	}

	public Object visitMappingDeclaration(MappingDeclaration ast, Boolean forceIgnore)
			throws Throwable {
		Object columns=null;
		if(DEBUG) enter(MappingDeclaration.class);
		try {
			if(ast.getMapping()!=null) {
				IEntityDefine entity=(IEntityDefine) ast.getMapping().accept(this, forceIgnore);
				if(entity!=null)
					fScope.setMapping(new DataReference<MappingStatement, IEntityDefine>(ast.getMapping(),entity));
			} else if(ast.getOverride()!=null) {
				ast.getOverride().accept(this, forceIgnore);
			}
			columns=this.completionQueryDeclaration(ast, forceIgnore);
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(MappingDeclaration.class);
		return columns;
	}

	public Object visitMappingStatement(MappingStatement ast, Boolean forceIgnore)
			throws Throwable {
		IEntityDefine entity=null;
		if(DEBUG) enter(MappingStatement.class);
		if(ast.getClassReference()!=null && ast.getClassReference().isValid()) {
			entity=(IEntityDefine)getData(ast.getClassReference().getTargetName(), DataKinds.ENTITY_DEFINE, null, ast);
		}
		boolean ignoreEntity=isIgnored(KIND_ENTITY_REFERENCE, forceIgnore);
		boolean ignorePackage=isIgnored(KIND_PACKAGE_REFERENCE, forceIgnore);
		if((!ignoreEntity || !ignorePackage) 
				&& ast.getClassReference()!=null && isSurround(ast.getClassReference())) {
			String prefix=null;
			int lastLength=0;
			if(ast.getClassReference()!=null && ast.getClassReference().isValid()) {

				StringBuffer buffer=new StringBuffer();
				List<TokenNode> segments=ast.getClassReference().geSegments();
				for(int i=0;i<segments.size();i++) {
					TokenNode token=segments.get(i);
					if(buffer.length()!=0) buffer.append(MappingStatement.ENTITY_NAME_SEPARETOR);
					if(token==null) {
						break;
					} else if(isSurround(token)) {
						String pre=fContent.substring(token.getPosition().getStart(), fPosition);
						if(pre.startsWith("\"")) pre=pre.substring(1);
						lastLength=GrammarUtil.getLastLength(pre, MappingStatement.ENTITY_NAME_SEPARETOR);
						buffer.append(pre);
						break;
					} else {
						buffer.append(token.getTexture());
					}
				}
				prefix=buffer.toString();
			}
			assitMappingEntitys(prefix,ast,new SourcePosition(fPosition-lastLength,fPosition),
					ignoreEntity,ignorePackage);
		}
		if(DEBUG) exit(MappingStatement.class);
		return entity;
	}
	
	public Object visitMappingOverride(MappingOverride ast, Boolean forceIgnore)
			throws Throwable {
		IMappingDefine superORM=null;
		if(DEBUG) enter(MappingOverride.class);
		if(ast.getSuper()!=null && ast.getSuper().getTexture()!=null) {
			Map<String,String> configs = new HashMap<String,String>();
			configs.put(DataConfigures.CONFIG_KEY_LIMIT, DataConfigures.CONFIG_VALUE_PACKAGE);
			superORM= (IMappingDefine) getData(ast.getSuper().getTexture(), DataKinds.MAPPING_DEFINE, null, ast);
			if(superORM!=null) {
				for(ITableDefineReference tableRef : superORM.getTableReferences()) {
					IResultSetReference tr=new ExternalTableReference(tableRef);
					fScope.getTableReferences(true).put(tableRef.getAlias(), new DataReference<IResultSetReference, ITableDefine>(tr, tableRef.getTarget()));
				}
			}
			if(!isIgnored(KIND_ORM_REFERENCE, forceIgnore) 
				&& isSurround(ast.getSuper().getPosition())) {
				String prefix=null;

				if(ast.getSuper().getTexture()!=null && fPosition > ast.getSuper().getPosition().getStart()) {
					prefix=ast.getSuper().getTexture().substring(0,fPosition-ast.getSuper().getPosition().getStart());
					//prefix=prefix.toUpperCase();
				}
				assitORMs(prefix,ast,ast.getSuper().getPosition());
			}
		} else if(!isIgnored(KIND_ORM_REFERENCE, forceIgnore) 
				&& isVan(ast.getOverride())) {
			assitORMs(null,ast,null);
		}
		if(DEBUG) exit(MappingOverride.class);
		return superORM;
	}
	
	protected void assitMappingEntitys(String prefix, IAstNode node, ISourcePosition replace, boolean ignoreEntity, boolean ignorePackage) {
		if(fDataLoader!=null) {
			IDataDescriptor[] descs = fDataLoader.listDescriptors(prefix, DnaSql.ENTITY_DEFINE, null);
			if(descs!=null) {
				String prefixPackageName=GrammarUtil.getPackageName(prefix, MappingStatement.ENTITY_NAME_SEPARETOR, true);
				for(int i=0;i<descs.length;i++) {
					IDataDescriptor dd=descs[i];
					if(dd==null) continue;
					String name=dd.getID();
					switch(dd.getKind()) {
					case DataKinds.ENTITY_DEFINE:
						if(!ignoreEntity) {
							assitEntity(name,node, replace, dd.getDescription(),
									(prefixPackageName!=null&&name.startsWith(prefixPackageName))?name.substring(prefixPackageName.length()):name);
							if(DEBUG) debug("assit entity ["+name+"]");
						}
						break;
					case DataKinds.PACKAGE:
						if(!ignorePackage) {
							assitPackage(name,node, replace, dd.getDescription(),
									(prefixPackageName!=null&&name.startsWith(prefixPackageName))?name.substring(prefixPackageName.length()):name);
							if(DEBUG) debug("assit package ["+name+"]");
						}
						break;
					default:
						if(DEBUG) debug("unknown data kind "+dd.getKind()+" of ["+name+"]");
						break;
					}
				}
			}
		} else {
			if(DEBUG) debug("data loader is null!");
		}
	}
	
	protected void assitORMs(String prefix, IAstNode node, ISourcePosition replace) {
		if(fDataLoader==null) return;

		IDataDescriptor[] descs = fDataLoader.listDescriptors(prefix, DnaSql.ORM_DEFINE, null);
		if(descs==null) return;
		
		for(int i=0; i<descs.length; i++) {
			IDataDescriptor dd=descs[i];
			if(dd==null) continue;
			assitORM(dd.getID(), node, replace, dd.getDescription());
			
		}
	}
	
	protected void assitORM(String name, IAstNode node, ISourcePosition replace, String description) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_ORM_REFERENCE; }
		});
	}
	
	protected void assitEntity(String name, IAstNode node,ISourcePosition replace, String description, String completion) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,completion) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_ENTITY_REFERENCE; }
		});
	}
	
	protected void assitPackage(String name, IAstNode node,ISourcePosition replace, String description, String completion) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,completion) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_PACKAGE_REFERENCE; }
		});
	}

	
	protected void assitEntityFields(String prefix, IAstNode node, ISourcePosition replace) {
		if(fScope.getMapping()==null) return;
		IJavaFieldDefine[] fields = fScope.getMapping().data.getFields();
		if(fields==null) return;
		for(int i=0;i<fields.length;i++) {
			IJavaFieldDefine field = fields[i];
			if(prefix==null 
					|| (field.getName().length()>prefix.length()
							&& field.getName().substring(0, prefix.length()).equalsIgnoreCase(prefix))) {
				assitEntityField(field.getName(),field.getJavaType().getName(),node,replace,field.getDescription(),field.getName());
			}
		}
			
	}
	
	protected void assitEntityField(String name, String type, IAstNode node,ISourcePosition replace, String description, String completion) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,completion,type) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_ENTITY_FIELD_REFERENCE; }
		});
	}
}
