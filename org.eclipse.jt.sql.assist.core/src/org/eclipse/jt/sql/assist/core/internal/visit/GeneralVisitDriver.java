/**
 * 
 */
package org.eclipse.jt.sql.assist.core.internal.visit;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IFunctionParameter;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAccessor;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAstNode;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralConditionNode;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralConditionVisitor;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralValueNode;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralValueVisitor;
import org.eclipse.jt.sql.assist.core.ast.general.LogicalPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.NullExpression;
import org.eclipse.jt.sql.assist.core.ast.general.OperatorExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ParenValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.IGeneralScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionDefine;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionPattern;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.internal.util.SemanticUtil;
import org.eclipse.jt.sql.assist.core.kinds.LiteralKinds;
import org.eclipse.jt.sql.assist.core.process.AbstractVisitDriver;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;
import org.eclipse.jt.sql.assist.core.visit.access.GeneralAccessor;
import org.eclipse.jt.sql.assist.core.visit.access.GeneralWalkerAdaptor;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralVisitDriver<TScope extends AbstractGeneralDataScope<TScope>>
		extends AbstractVisitDriver<TScope>
		implements 
			IGeneralAstVisitor<Object, IVisitControler<TScope>>,
			IGeneralConditionVisitor<Object, IVisitControler<TScope>>,
			IGeneralValueVisitor<ISqlTypeDefine, IVisitControler<TScope>> {
	
	private IGeneralAccessor<TScope> fGeneralAccessor;

	@Override
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		super.initialize(accessor, dataLoader);
		if(accessor instanceof IGeneralAccessor<?>) {
			fGeneralAccessor = (IGeneralAccessor<TScope>)accessor;
		} else {
			fGeneralAccessor = new GeneralAccessor<TScope>();
		}
	}
	
	@Override
	public void initialize(IAstWalker walker) {
		super.initialize(walker);
		fGeneralAccessor = new GeneralWalkerAdaptor<TScope>(walker);
	}

	@Override
	public void visitGeneral(IAstNode ast, IVisitControler<TScope> data) throws Throwable {

		if(ast instanceof IGeneralAstNode) {
			 ((IGeneralAstNode)ast).accept(this, data);
		} else if(ast instanceof IGeneralConditionNode) {
			 ((IGeneralConditionNode)ast).accept(this, data);
		} else if(ast instanceof IGeneralValueNode) {
			 ((IGeneralValueNode)ast).accept(this, data);
		} else if(ast!=null){
			throw new UnsupportedOperationException("Unexpected ast node class: "+ ast.getClass().getName());
		} 
	}

	
	protected ISqlTypeDefine walkValueExpression(ValueExpression ast, IVisitControler<TScope> data) throws Throwable {
		if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, data);
		} else if(ast!=null) {
			throw new UnsupportedOperationException("Unexpected value expression class: "+ ast.getClass());
		}
		return null;
	}
	
	protected void walkConditionExpression(ConditionExpression ast, IVisitControler<TScope> data) throws Throwable {
		if (ast instanceof IGeneralConditionNode) {
			((IGeneralConditionNode) ast).accept(this, data);
		} else if(ast!=null) {
			throw new UnsupportedOperationException("Unexpected condition expression class: "+ ast.getClass());
		}
	}

	public Object visitArgumentDeclaration(ArgumentDeclaration ast, IVisitControler<TScope> data)
			throws Throwable {

		ISqlTypeDefine arguType = null;
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterArgumentDeclaration(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getType()!=null) {
					arguType = (ISqlTypeDefine) visitDataTypeReference(ast.getType(),sub);
				}
				if(ast.getDefaultValue()!=null) {
					visitConstantExpression(ast.getDefaultValue(), sub);
				}
				if(data.isBuildScopeData(IGeneralScopeDataKinds.ARGUMENT)) {
					String name= (ast.getName()!=null)? DnaSqlUtils.getArgumentName(ast.getName().getTexture()) : null;
					if(name!=null&&name.length()>0) {
						ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments=data.getDataScope().getArguments(true);
						if(!arguments.containsKey(name)) {
							DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=new DataReference<ArgumentDeclaration, ISqlTypeDefine>(ast);
							refable.data=arguType;
							arguments.put(name, refable);
						}
					} 
				}
			}
			if(visit) fGeneralAccessor.exitArgumentDeclaration(ast,data.getDataScope());
		}
		return null;
	}

	public Object visitDataTypeReference(DataTypeReference ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine arguType = null;
		if(data.walkNode(ast) && fGeneralAccessor.enterDataTypeReference(ast,data.getDataScope())) {
			
			if(ast.getTargetName()!=null && fDataLoader!=null) {
				arguType = (ISqlTypeDefine) getData(ast.getTargetName(), DataKinds.SQL_TYPE_DEFINE, null, ast);
			}
			
			fGeneralAccessor.exitDataTypeReference(ast,data.getDataScope());
		}
		return arguType;
	}

	public Object visitTableRefReference(TableRefReference ast, IVisitControler<TScope> data)
			throws Throwable {
		if(data.walkNode(ast) && fGeneralAccessor.enterTableRefReference(ast,data.getDataScope())) {
			fGeneralAccessor.exitTableRefReference(ast,data.getDataScope());
		}
		return null;
	}
	
	public Object visitClassReference(ClassReference ast,
			IVisitControler<TScope> data) throws Throwable {
		if(data.walkNode(ast) && fGeneralAccessor.enterClassReference(ast,data.getDataScope())) {
			fGeneralAccessor.exitClassReference(ast,data.getDataScope());
		}
		return null;
	}

	public Object visitLogicalPredicate(LogicalPredicate ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterLogicalPredicate(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					walkConditionExpression(ast.getPrimary(),sub);
				}
				if(ast.getConditionExpressions()!=null) {
					for(ConditionExpression exp: ast.getConditionExpressions()) {
						if(exp!=null) {
							walkConditionExpression(exp, sub);
						}
					}
				}
			}
			if(visit) fGeneralAccessor.exitLogicalPredicate(ast,data.getDataScope());
		}
		return null;
	}

	public Object visitParenConditionExpression(ParenConditionExpression ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterParenConditionExpression(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					this.walkConditionExpression(ast.getPrimary(), sub);
				}
			}
			if(visit) fGeneralAccessor.exitParenConditionExpression(ast,data.getDataScope());
		}
		return null;
	}

	public Object visitRelationPredicate(RelationPredicate ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterRelationPredicate(ast,data.getDataScope())) {

			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				String op = ast.getOperator();
				
				if(ast.getValuePrimary()!=null) {
					walkValueExpression(ast.getValuePrimary(), sub);
				}
	
				if (RelationPredicate.OPERATOR_EQUAL.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_NOT_EQUAL.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_GREAT.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_NOT_GREAT.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_LESS.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_NOT_LESS.equals(op)) {
					walkCompare(ast, sub);
				} else if (RelationPredicate.OPERATOR_BETWEEN.equalsIgnoreCase(op)) {
					walkBetween(ast, sub);
				} else if (RelationPredicate.OPERATOR_IN.equalsIgnoreCase(op)) {
					walkIn(ast, sub);
				} else if (RelationPredicate.OPERATOR_LIKE.equalsIgnoreCase(op)) {
					walkLike(ast, sub);
				} else if (RelationPredicate.OPERATOR_STARTS_WITH.equalsIgnoreCase(op)) {
					walkStartsWith(ast, sub);
				} else if (RelationPredicate.OPERATOR_ENDS_WITH.equalsIgnoreCase(op)) {
					walkEndsWith(ast, sub);
				} else if (RelationPredicate.OPERATOR_CONTAINS.equalsIgnoreCase(op)) {
					walkContains(ast, sub);
				} else if (RelationPredicate.OPERATOR_IS.equalsIgnoreCase(op)) {
					walkIs(ast, sub);
				}
			}
			if(visit) fGeneralAccessor.exitRelationPredicate(ast,data.getDataScope());
		}
		return null;
	}

	protected void walkIs(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
	}

	protected void walkContains(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		}
	}

	protected void walkEndsWith(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		}
	}

	protected void walkStartsWith(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		}
	}

	protected void walkLike(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		} else if (ast.getUncertainOperand() instanceof List<?>) {
			for(Object operand: (List<?>)ast.getUncertainOperand()) {
				if(operand instanceof ValueExpression) {
					walkValueExpression((ValueExpression)operand, data);
				}
			}
		}
	}

	protected void walkIn(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		} else if (ast.getUncertainOperand() instanceof List<?>) {
			for(Object operand: (List<?>)ast.getUncertainOperand()) {
				if(operand instanceof ValueExpression) {
					walkValueExpression((ValueExpression)operand, data);
				}
			}
		}
	}

	protected void walkBetween(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof List<?>) {
			for(Object operand: (List<?>)ast.getUncertainOperand()) {
				if(operand instanceof ValueExpression) {
					walkValueExpression((ValueExpression)operand, data);
				}
			}
		}
	}

	protected void walkCompare(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if (ast.getUncertainOperand() instanceof ValueExpression) {
			walkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		}
	}

	public ISqlTypeDefine visitArgumentReference(ArgumentReference ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine type = null;
		if(data.walkNode(ast) && fGeneralAccessor.enterArgumentReference(ast,data.getDataScope())) {
			if(data.getDataScope()!=null) {
				String name=DnaSqlUtils.getArgumentName(ast.getArgumentName());
				ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments=data.getDataScope().getArguments(false);
				if(arguments!=null) {
					DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=arguments.get(name);
					if(refable!=null) type=refable.data;
				}
			}
			
			fGeneralAccessor.exitArgumentReference(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitCaseExpression(CaseExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine type=null;
		ISqlTypeDefine caseType;
		ISqlTypeDefine commonType;
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterCaseExpression(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
//				if(ast.getPrimary()!=null) {
//					walkValueExpression(ast.getPrimary(), sub);
//				}
//				if(ast.getCaseValues()!=null) {
//					for(ValueExpression value : ast.getCaseValues()) {
//						if(value!=null)
//							walkValueExpression(value, sub);
//					}
//				}

				if(CaseExpression.OPERATOR_CASE_NORMAL.equalsIgnoreCase(ast.getOperator())) {
//					ISqlTypeDefine primaryType=null;
					if(ast.getPrimary()!=null) {
//						primaryType=
							walkValueExpression(ast.getPrimary(), sub);
					}
					if(ast.getCaseValues()!=null) {
						int whenLength=(ast.getCaseValues().size()/2)*2;
						for(int i=0; i<whenLength; i++) {
							ValueExpression value = ast.getCaseValues().get(i);
							if(value!=null) {
								caseType=walkValueExpression(value, sub);
								if(i%2!=0) {
									if(type==null) type=caseType;
									else {
										commonType=SemanticUtil.getCommonType(type, caseType);
										if(commonType!=null) type=commonType;
									}
								}
							}
						}
						if(whenLength<ast.getCaseValues().size()) {
							ValueExpression value = ast.getCaseValues().get(whenLength);
							if(value!=null) {
								caseType=walkValueExpression(value, sub);
								if(type==null) type=caseType;
								else {
									commonType=SemanticUtil.getCommonType(type, caseType);
									if(commonType!=null) type=commonType;
								}
							}
						}
					}
				} else if(CaseExpression.OPERATOR_CASE_SEARCH.equalsIgnoreCase(ast.getOperator())) {
					int csize = 0;
					int vsize = 0;
					if(ast.getCaseConditions()!=null) {
						csize = ast.getCaseConditions().size();
					}
					
					if(ast.getCaseValues()!=null) {
						vsize = ast.getCaseValues().size();
					}
					int i=0;
					for(;i<csize && i<vsize;i++) {
						walkConditionExpression(ast.getCaseConditions().get(i), data);
						walkValueExpression(ast.getCaseValues().get(i), data);
					}
					if(i<vsize) {
						walkValueExpression(ast.getCaseValues().get(i), data);
					}
				} else if(CaseExpression.OPERATOR_CASE_COALESCE.equalsIgnoreCase(ast.getOperator())) {

					if(ast.getCaseValues()!=null) {
						for(int i=0; i<ast.getCaseValues().size(); i++) {
							ValueExpression value = ast.getCaseValues().get(i);
							if(value!=null) {
								caseType=walkValueExpression(value, sub);
								if(type==null) type=caseType;
								else if (caseType!=null) {
									commonType=SemanticUtil.getCommonType(type, caseType);
									if(commonType!=null) type=commonType;
								}
								
							}
						}
					}
				}
			}
			if(visit) fGeneralAccessor.exitCaseExpression(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitConstantExpression(ConstantExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(data.walkNode(ast) && fGeneralAccessor.enterConstantExpression(ast,data.getDataScope())) {
			
			String dataId = null;
			switch(ast.getType()) {
			case LiteralKinds.KIND_DATE:
				dataId = ISqlTypeDefine.TYPE_NAME_DATE; break;
			case LiteralKinds.KIND_GUID:
				dataId = ISqlTypeDefine.TYPE_NAME_GUID; break;
			case LiteralKinds.KIND_BYTES:
				dataId = ISqlTypeDefine.TYPE_NAME_BYTES; break;
			case LiteralKinds.KIND_STRING:
				dataId = ISqlTypeDefine.TYPE_NAME_STRING; break;
			case LiteralKinds.KIND_BOOLEAN:
				dataId = ISqlTypeDefine.TYPE_NAME_BOOLEAN; break;
			default:
				try {
					switch(ast.getType()) {
					case LiteralKinds.KIND_FLOAT:
						dataId = ISqlTypeDefine.TYPE_NAME_FLOAT; break;
					case LiteralKinds.KIND_INTEGER:
						long lv=Long.parseLong(ast.getValue());
						if(lv==(int)lv)
							dataId = ISqlTypeDefine.TYPE_NAME_INTEGER;
						else
							dataId = ISqlTypeDefine.TYPE_NAME_LONG;
						break;
					}
				} catch (NumberFormatException e) {
					
				}
				break;
			}
			if(dataId!=null) {
				type = (ISqlTypeDefine) getData(dataId, DataKinds.SQL_TYPE_DEFINE, null, ast);
			}
			
			fGeneralAccessor.exitConstantExpression(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitFunctionCallExpression(FunctionCallExpression ast,
			IVisitControler<TScope> data) throws Throwable {

		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterFunctionCallExpression(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {

				List<ISqlTypeDefine> paraTypes=new ArrayList<ISqlTypeDefine>();
				if(ast.getParameters()!=null) {
					for(IFunctionParameter param : ast.getParameters()) {
						ISqlTypeDefine pt = null;
						if(param instanceof TableRefReference) {
							pt = (ISqlTypeDefine) ((TableRefReference)param).accept(this, sub);
						} else if(param instanceof ValueExpression) {
							pt = (ISqlTypeDefine) walkValueExpression(((ValueExpression)param), sub);
						}
						paraTypes.add(pt);
					}
				}
				if(ast.getFunctionName()==null) return null;
				IFunctionDefine fun=(IFunctionDefine) getData(ast.getFunctionName(), DataKinds.SQL_FUNCTION_DEFINE, null, ast);
				
				if(fun!=null) {
					IFunctionPattern pattern = fun.matchPattern(paraTypes.toArray(new ISqlTypeDefine[paraTypes.size()]));
					if(pattern==null && ast.getParameters()!=null) {
						IFunctionPattern[] ps = fun.matchPattern(ast.getParameters().size());
						if(ps!=null && ps.length>0) pattern = ps[0];
					}
					if(pattern!=null) type = pattern.getReturnType();
				}
			}
			if(visit) fGeneralAccessor.exitFunctionCallExpression(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitNullExpression(NullExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(data.walkNode(ast) && fGeneralAccessor.enterNullExpression(ast,data.getDataScope())) {

			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_NULL, DataKinds.SQL_TYPE_DEFINE, null, ast);
			
			fGeneralAccessor.exitNullExpression(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitOperatorExpression(OperatorExpression ast, IVisitControler<TScope> data)
			throws Throwable {

		ISqlTypeDefine type=null;
		@SuppressWarnings("unused")
		ISqlTypeDefine secondary=null;
		
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterOperatorExpression(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					type=walkValueExpression(ast.getPrimary(), sub);
				}
				if(ast.getValueExpressions()!=null) {
					for(ValueExpression value : ast.getValueExpressions()) {
						if(value!=null) {
							secondary = walkValueExpression(value, sub);
						}
					}
				}
			}
			if(visit) fGeneralAccessor.exitOperatorExpression(ast,data.getDataScope());
		}
		return type;
	}

	public ISqlTypeDefine visitParenValueExpression(ParenValueExpression ast,
			IVisitControler<TScope> data) throws Throwable {
		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fGeneralAccessor.enterParenValueExpression(ast,data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					type = walkValueExpression(ast.getPrimary(), sub);
				}
			}
			if(visit) fGeneralAccessor.exitParenValueExpression(ast,data.getDataScope());
		}
		return type;
	}

}
