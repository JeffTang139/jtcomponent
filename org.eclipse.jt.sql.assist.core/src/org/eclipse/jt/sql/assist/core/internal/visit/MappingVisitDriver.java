/**
 * 
 */
package org.eclipse.jt.sql.assist.core.internal.visit;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.sql.assist.core.DataConfigures;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.external.ExternalTableReference;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstNode;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.IMappingScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;
import org.eclipse.jt.sql.assist.core.data.define.IEntityDefine;
import org.eclipse.jt.sql.assist.core.data.define.IMappingDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefineReference;
import org.eclipse.jt.sql.assist.core.visit.access.MappingAccessor;
import org.eclipse.jt.sql.assist.core.visit.access.MappingWalkerAdaptor;


/**
 * @author Jeff Tang
 *
 */
public class MappingVisitDriver<TScope extends AbstractMappingDataScope<TScope>>
		extends QueryVisitDriver<TScope>
		implements IMappingAstVisitor<Object,IVisitControler<TScope>> {
//	
//	public static final class RealMappingWalkProcessor extends MappingWalkProcessor<MappingDataScope> {
//
//		public static RealMappingWalkProcessor getInstance(IAstWalker walker,
//				IWalkControler<TScope> rootControler) {
//			return new RealMappingWalkProcessor(walker, rootControler);
//		}
//		
//		public RealMappingWalkProcessor(IAstWalker walker,
//				IWalkControler<TScope> rootControler) {
//			super(walker, rootControler);
//		}
//
//		@Override
//		protected MappingDataScope createDefaultScope() {
//			return MappingDataScope.getInstance();
//		}
//
//		@Override
//		protected MappingDataScope convertScope(IDataScope dataScope) {
//			if(dataScope==null)
//				throw new NullArgumentException("Argument dataScope cannot be null!");
//			if(dataScope instanceof MappingDataScope) {
//				return (MappingDataScope)dataScope;
//			} else {
//				throw new IllegalArgumentException(
//						"Data scope of class 'MappingDataScope' expected, not '"
//						+dataScope.getClass().getName()+"'!");
//			}
//		}
//		
//	}

	public static MappingVisitDriver<MappingDataScope> getInstance(
			IVisitControler<MappingDataScope> rootControler) {
		MappingVisitDriver<MappingDataScope> driver = 
			new MappingVisitDriver<MappingDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		return driver;
	}
	
	public static MappingVisitDriver<MappingDataScope> getInstance(IAstWalker walker,
			IVisitControler<MappingDataScope> rootControler) {
		MappingVisitDriver<MappingDataScope> driver = 
			new MappingVisitDriver<MappingDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(walker);
		return driver;
	}
	
	public static MappingVisitDriver<MappingDataScope> getInstance(IAstAccessor<MappingDataScope> accessor,
			IDataProvider dataLoader,
			IVisitControler<MappingDataScope> rootControler) {
		MappingVisitDriver<MappingDataScope> driver = 
			new MappingVisitDriver<MappingDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(accessor, dataLoader);
		return driver;
	}

	private IMappingAccessor<TScope> fMappingAccessor;
	
	@Override
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		super.initialize(accessor, dataLoader);
		if(accessor instanceof IMappingAccessor<?>) {
			fMappingAccessor = (IMappingAccessor<TScope>)accessor;
		} else {
			fMappingAccessor = new MappingAccessor<TScope>();
		}
	}
	
	@Override
	public void initialize(IAstWalker walker) {
		super.initialize(walker);
		fMappingAccessor = new MappingWalkerAdaptor<TScope>(walker);
	}
	
	@Override
	public void visitGeneral(IAstNode ast, IVisitControler<TScope> data) throws Throwable {
		if(ast instanceof IMappingAstNode) {
			((IMappingAstNode)ast).accept(this, data);
		} else {
			super.visitGeneral(ast, data);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstVisitor#visitMappingDeclaration(org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration, java.lang.Object)
	 */
	public Object visitMappingDeclaration(MappingDeclaration ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fMappingAccessor.enterMappingDeclaration(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getMapping()!=null) {
					visitMappingStatement(ast.getMapping(),sub);
				} else if(ast.getOverride()!=null) {
					visitMappingOverride(ast.getOverride(), sub);
				}
				walkQueryDeclaration(ast, sub);
			}
			if(visit)
				fMappingAccessor.exitMappingDeclaration(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstVisitor#visitMappingStatement(org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement, java.lang.Object)
	 */
	public Object visitMappingStatement(MappingStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fMappingAccessor.enterMappingStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getClassReference()!=null) {
					visitClassReference(ast.getClassReference(),sub);
				}
				

				if(data.isBuildScopeData(IMappingScopeDataKinds.MAPPING)) {

					IEntityDefine entity=null;
					if(ast.getClassReference()!=null && ast.getClassReference().isValid()) {
						entity=(IEntityDefine) this.getData(ast.getClassReference().getTargetName(), DataKinds.ENTITY_DEFINE, null, ast.getClassReference());
					}

					data.getDataScope().setMapping(new DataReference<MappingStatement, IEntityDefine>(ast,entity));
				}
			}
			if(visit)
				fMappingAccessor.exitMappingStatement(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitMappingOverride(MappingOverride ast,
				IVisitControler<TScope> data) throws Throwable {
		if(data.walkNode(ast) && fMappingAccessor.enterMappingOverride(ast, data.getDataScope())) {

			if(data.isBuildScopeData(IMappingScopeDataKinds.OVERRIDE)) {

				IMappingDefine orm=null;
				if(ast.getSuper()!=null && ast.getSuper().getTexture()!=null) {
					Map<String,String> configs = new HashMap<String,String>();
					configs.put(DataConfigures.CONFIG_KEY_LIMIT, DataConfigures.CONFIG_VALUE_PACKAGE);
					orm=(IMappingDefine) this.getData(ast.getSuper().getTexture(), DataKinds.MAPPING_DEFINE, configs, ast.getSuper());
				}

				data.getDataScope().setOverride(new DataReference<MappingOverride, IMappingDefine>(ast,orm));
				
				if(orm!=null) {
					ITableDefineReference[] tableRefs = orm.getTableReferences();
					if(tableRefs!=null) {
						for(ITableDefineReference ref : tableRefs) {
							if(ref==null) continue;
							IResultSetReference tr=new ExternalTableReference(ref);
							DataReference<IResultSetReference, ITableDefine> dataRef =  new DataReference<IResultSetReference, ITableDefine>(tr, ref.getTarget());
							data.getDataScope().getTableReferences(true).put(ref.getAlias(),dataRef);
							
						}
					}
				}
			}
			
			fMappingAccessor.exitMappingOverride(ast, data.getDataScope());
		}
		return null;
	}
}
