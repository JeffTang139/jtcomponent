/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.IGeneralScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralSelectionDetector<TScope extends AbstractGeneralDataScope<TScope>>
		extends AbstractSelectionDetector<TScope>
		implements IGeneralAccessor<TScope> {
	
	public static boolean ASSIT_ARGUMENT = true;
	public static boolean ASSIT_TABLE_REFERENCE = true;
	public static boolean ASSIT_FUNCTION = true;
	
	@Override
	protected final int getBuildScopeDataKind(IAstNode selection) {
		int kind=judgeBuildScopeDataKind(selection);
		return processBuildScopeDataKind(kind);
	}
	
	protected int judgeBuildScopeDataKind(IAstNode selection) {
		int kind=0;
		if((selection instanceof ArgumentDeclaration)
				|| (selection instanceof ArgumentReference))
			kind |= IGeneralScopeDataKinds.ARGUMENT;

		if(selection instanceof TableRefReference)
			kind |= IGeneralScopeDataKinds.TABLE_REFERENCE;
		return kind;
	}
	
	protected int processBuildScopeDataKind(int kind) {
		return kind;
	}

	public boolean exitArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		if(ASSIT_ARGUMENT && ast.getName()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast) {
//					String name=GrammarUtil.getArgumentName(ast.getName());
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//					DataReference<ArgumentDeclaration, ISqlTypeDefine> ref=scope.getArgument(name);
					fData.target = new SelectionTargetData<TScope>(ast, scope);
				}
			} else {
				if(fData.target!=null && fData.target.ast==ast) {
					fData.assit(ast.getPosition(), fData.target);
				}
			}
		}
		return false;
	}
	
	public boolean exitArgumentReference(ArgumentReference ast, TScope scope) {
		if(ASSIT_ARGUMENT && ast.getArgumentName()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast) {
					String name=DnaSqlUtils.getArgumentName(ast.getArgumentName());
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
					DataReference<ArgumentDeclaration, ISqlTypeDefine> ref=scope.getArgument(name);
					if(ref!=null) {
						fData.target= new SelectionTargetData<TScope>(ref.ast, scope);
					}
				}
			} else {
				if(fData.target!=null&&(fData.target.ast instanceof ArgumentDeclaration)) {
					ArgumentDeclaration arguDec=(ArgumentDeclaration) fData.target.ast;
					if(arguDec.getName()!=null && ast.getArgumentName().equals(arguDec.getName().getTexture())) {
						fData.assit(ast.getPosition(), fData.target);
					}
				}
			}
		}
		return false;
	}
	
	public boolean exitTableRefReference(TableRefReference ast, TScope scope) {
		if(ASSIT_TABLE_REFERENCE && ast.getTargetName()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast) {
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
					DataReference<IResultSetReference, ITableDefine> ref=scope.getTableReference(ast.getTargetName());
					if(ref!=null) {
						if(ref.ast==null || ref.ast.getPosition()==null) {
							fData.target= new SelectionTargetData<TScope>(ast, scope);
						} else {
							fData.target= new SelectionTargetData<TScope>(ref.ast, scope);
						}
					}
				}
			} else if(fData.target!=null) {
				if(fData.target.ast instanceof IResultSetReference) {
					IResultSetReference tableRef=(IResultSetReference) fData.target.ast;
					if(ast.getTargetName().equals(tableRef.getAlias())) {

//						TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
						DataReference<IResultSetReference, ITableDefine> ref=scope.getTableReference(ast.getTargetName());
						//确保该引用处于目标域中
						if(ref!=null && ref.ast==tableRef) {
							fData.assit(ast.getPosition(), fData.target);
						}
//						for(;scope!=null;scope=scope.getParent()) {
//							if(scope==fData.target.scope) {
//								fData.assit(ast.getPosition(), fData.target);
//								break;
//							}
//						}
					}
				}
			}
		}
		return false;
	}
	
	public boolean exitFunctionCallExpression(FunctionCallExpression ast, TScope scope) {
		if(ASSIT_TABLE_REFERENCE && ast.getFunctionName()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast) {
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
					fData.target= new SelectionTargetData<TScope>(ast, scope);
				}
			} else if(fData.target!=null) {
				if(fData.target.ast==ast) {
					fData.assit(ast.getPosition(), fData.target);
				} else if(fData.target.ast instanceof FunctionCallExpression) {
					FunctionCallExpression funCall=(FunctionCallExpression) fData.target.ast;
					if(ast.getFunctionName().equals(funCall.getFunctionName())) {
						fData.assit(ast.getPosition(), fData.target);
					}
				}
			}
		}
		return true;
	}


	public boolean enterCaseExpression(CaseExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterClassReference(ClassReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterConstantExpression(ConstantExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterNullExpression(NullExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterArgumentReference(ArgumentReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitCaseExpression(CaseExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitClassReference(ClassReference ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitConstantExpression(ConstantExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitNullExpression(NullExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterTableRefReference(TableRefReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}
}
