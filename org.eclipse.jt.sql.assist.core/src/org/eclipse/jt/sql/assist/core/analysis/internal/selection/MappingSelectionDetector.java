/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnReference;
import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.data.IMappingScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;


/**
 * @author Jeff Tang
 *
 */
public abstract class MappingSelectionDetector<TScope extends AbstractMappingDataScope<TScope>> 
			extends QuerySelectionDetector<TScope> 
			implements IMappingAccessor<TScope> {

	public static boolean ASSIT_MAPPING = true;
	public static boolean ASSIT_OVERRIDE = true;

	public static final class RealMappingSelectionDetector extends MappingSelectionDetector<MappingDataScope> {

		public static RealMappingSelectionDetector getInstance() {
			return new RealMappingSelectionDetector();
		}
		
		@Override
		protected MappingDataScope createScope() {
			return MappingDataScope.getInstance();
		}

		@Override
		public int getSqlKind() {
			return DnaSql.ORM_DEFINE;
		}
		
	}
	
	public static MappingSelectionDetector<?> getInstance() {
		return new RealMappingSelectionDetector();
	}
	
	@Override
	protected int judgeBuildScopeDataKind(IAstNode selection) {
		int kind=super.judgeBuildScopeDataKind(selection);
		
		if((selection instanceof MappingStatement) || (selection instanceof ClassReference) )
			kind |= IMappingScopeDataKinds.COLUMN | IMappingScopeDataKinds.MAPPING;

		if((selection instanceof TableRefReference) || (selection instanceof ColumnReference) || (selection instanceof MappingOverride)) 
			kind |= IMappingScopeDataKinds.OVERRIDE;

		if(selection instanceof DerivedColumn)
			kind |= IMappingScopeDataKinds.COLUMN | IMappingScopeDataKinds.MAPPING;
		return kind;
	}

	public boolean exitMappingStatement(MappingStatement ast, TScope scope) {
		if(ASSIT_MAPPING && ast.getClassReference()!=null 
				&& ast.getClassReference().getPosition()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast.getClassReference() 
						&& ast.getClassReference().getPosition().contains(fData.position)) {
//					String des=null;
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//					DataReference<MappingStatement, StructDefine> ref=scope.getMapping();
//					if(ref!=null && ref.data!=null) {
//						des=ref.data.getDescription();
//					}
					fData.target= new SelectionTargetData<TScope>(ast, scope, ast.getClassReference().getPosition());
				}
			} else if(fData.target!=null) {
				if(fData.target.ast==ast 
						&& ast.getClassReference().getPosition().contains(fData.position)) {
					fData.assit(ast.getClassReference().getPosition(), fData.target);
				}
			}
		}
		return false;
	}
	
	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		if(ASSIT_MAPPING && scope.getMapping()!=null && ast.getAlias()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast && ast.getAlias().getPosition().contains(fData.position)) {
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//					DataReference<MappingStatement, StructDefine> ref=scope.getMapping();
//					if(ref!=null) {
						fData.target=new SelectionTargetData<TScope>(ast, scope, ast.getAlias().getPosition());
//					}
				}
			} else if(fData.target!=null) {
				if(fData.target.ast==ast) {
					fData.assit(ast.getAlias().getPosition(), fData.target);
				} else if(fData.target.ast instanceof MappingStatement) {
//
//					MappingStatement mapping=(MappingStatement) fData.target.ast;
//
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//					DataReference<MappingStatement, StructDefine> ref=scope.getMapping();
//					if(ref!=null && ref.ast==mapping) {
//						if(ref.data!=null) {
//							if(ref.data.getFields().find(ast.getAlias().getTexture())!=null) {
								fData.assit(ast.getAlias().getPosition(), fData.target);
//							}
//						} else {
//							// TO DO 决定在数据没有载入情况下，如何进行提示
//						}
//					}
				}
			}
		}
		return super.enterDerivedColumn(ast, scope);
	}

	public boolean exitMappingOverride(MappingOverride ast, TScope scope) {
		if(ASSIT_OVERRIDE && ast.getSuper()!=null && ast.getSuper().getTexture()!=null && ast.getSuper().getPosition()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast
						&& ast.getSuper().getPosition().contains(fData.position)) {
					fData.target= new SelectionTargetData<TScope>(ast, scope, ast.getSuper().getPosition());
				}
			} else if(fData.target!=null) {
				if(fData.target.ast==ast 
						&& ast.getSuper().getPosition().contains(fData.position)) {
					fData.assit(ast.getSuper().getPosition(), fData.target);
				}
			}
		}
		return false;
	}

	public boolean enterMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterMappingOverride(MappingOverride ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterMappingStatement(MappingStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}
}
