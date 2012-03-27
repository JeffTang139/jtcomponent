/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.internal.semantic;

import java.util.List;
import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IFunctionParameter;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentReference;
import org.eclipse.jt.sql.assist.core.ast.general.CaseExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.ConstantExpression;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.FunctionCallExpression;
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
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionDefine;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionPattern;
import org.eclipse.jt.sql.assist.core.data.define.IParameterDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.internal.util.SemanticUtil;
import org.eclipse.jt.sql.assist.core.kinds.LiteralKinds;
import org.eclipse.jt.sql.assist.core.process.AbstractSemanticChecker;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralSemanticChecker<TScope extends AbstractGeneralDataScope<TScope>> extends AbstractSemanticChecker<TScope>
		implements IGeneralAstVisitor<Object, Object>,
				   IGeneralConditionVisitor<Object, Object>,
				   IGeneralValueVisitor<ISqlTypeDefine, Object> {
	protected final static String TYPE_NOT_FOUND_PREFIX = "unknown data type: ";
	
	private final static ISqlTypeDefine[] EMPTY_TYPE_ARRAY=new ISqlTypeDefine[] {};
	
//
//	/**
//	 * 子类必需重写该方法
//	 */
//	@SuppressWarnings("unchecked")
//	protected TScope convertScope(IDataScope dataScope) {
//		fClean=false;
//		if(dataScope instanceof GeneralDataScope) {
//			return (TScope)dataScope;
//		} else {
//			throw new IllegalArgumentException(
//					"Data scope of class 'GeneralDataScope' expected, not '"
//					+dataScope.getClass().getName()+"'.");
//		}
//	}
	
	protected void doCheck(IAstNode ast) throws Throwable {
		visitGeneral(ast,null);
		finishCheck();
	}
	
	protected void finishCheck() {
		ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments=fScope.getArguments(false);
		if(arguments!=null) {
			for(String name : arguments.keySet()) {
				DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=arguments.get(name);
				if(refable!=null&&refable.ast!=null&&refable.ref==0) {
					warn(KIND_ARGUMENT_NONE_REFERENCED,new String[]{name},"argument ["+name+"] never used",refable.ast);
				}
			}
		}
	}
	
	protected void checkTableReferenceUsed() {
		//if(fCurrentScope==null) return;
		Map<String, DataReference<IResultSetReference, ITableDefine>> tableReferences=fScope.getTableReferences(false);
		if(tableReferences!=null) {
			for(String name:tableReferences.keySet()) {
				DataReference<IResultSetReference, ITableDefine> refable=tableReferences.get(name);
				if(refable!=null&&refable.ast!=null && refable.ast.getPosition()!=null &&refable.ref==0) {
					warn(KIND_TABLE_NONE_REFERENCED,new String[]{name},"table reference ["+name+"] never used",refable.ast);
				}
			}
		}
	}
	
	protected void clean() {
		
		for(IDataScope<?> scope=fScope;scope!=null;scope=scope.getParent()) {
			scope.clear();
		}
		fScope=null;
	}
	
	protected ISqlTypeDefine checkValueExpression(ValueExpression ast, Object data) throws Throwable {
		if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, data);
		} else if(ast!=null) {
			fatal("unknown value expression class ["+ast.getClass().getSimpleName()+"]",ast);
		} else {
			fatal("value expression is null",ast);
		}
		return null;
	}
	
	protected Object checkConditionExpression(ConditionExpression ast, Object data) throws Throwable {
		if(ast instanceof IGeneralConditionNode) {
			return ((IGeneralConditionNode)ast).accept(this, data);
		} else if(ast!=null) {
			fatal("unknown condition expression class ["+ast.getClass().getSimpleName()+"]",ast);
		} else {
			fatal("condition expression is null",ast);
		}
		return null;
	}
	
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {

		if(ast instanceof IGeneralAstNode) {
			return ((IGeneralAstNode)ast).accept(this, data);
		} else if(ast instanceof IGeneralConditionNode) {
			return ((IGeneralConditionNode)ast).accept(this, data);
		} else if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, data);
		} else if(ast!=null){
			fatal("unknown ast class ["+ast.getClass().getSimpleName()+"]",ast);
			return null;
		} else {
			fatal("null ast ",ast);
			return null;
		}
	}

	public Object visitArgumentDeclaration(ArgumentDeclaration ast, Object data)
			throws Throwable {
		if(DEBUG) enter(ArgumentDeclaration.class);
		
		ISqlTypeDefine arguType = null;
		if(ast.getType()!=null) arguType=(ISqlTypeDefine) ast.getType().accept(this, data);
		if(ast.getDefaultValue()!=null) {
			ISqlTypeDefine defaultValueType=ast.getDefaultValue().accept(this, data);
			if(defaultValueType!=null && arguType!=null) {
				if(!SemanticUtil.isAssignable(arguType, defaultValueType)) {
					error(KIND_TYPE_MISS_MATCH,
							new String[]{arguType.toString(),defaultValueType.toString()},
							"can not assign ["+defaultValueType.toString()+"] to ["+arguType.toString()+"]",
							ast.getDefaultValue());
				}
			}
			warn(KIND_NON_SUPPORTED,
					new String[]{},
					"default value for argument is not supported currently. Code about this part would not be generated.",
					ast.getDefaultValue());
		}
		
		String name = (ast.getName()!=null)? DnaSqlUtils.getArgumentName(ast.getName().getTexture()) : null;
		
		if(name!=null && name.length()>0) {
			ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments=fScope.getArguments(true);
			if(!arguments.containsKey(name)) {
				DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=new DataReference<ArgumentDeclaration, ISqlTypeDefine>(ast);
				refable.data=arguType;
				arguments.put(name, refable);
			} else {
				error(KIND_ARGUMENT_ALREADY_EXIST,new String[]{ name },
						"argument ["+name+"] already exist",ast);
			}
		} else {
			error(KIND_ILL_ARGUMENT_NAME,new String[]{ name },
					"argument name cannot be empty",ast);
		}
		if(DEBUG) exit(ArgumentDeclaration.class);
		return null;
	}

	public Object visitDataTypeReference(DataTypeReference ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(DataTypeReference.class);
		try {
			type = (ISqlTypeDefine) getData(ast.getTargetName(), DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
//			if(type==null||type==TypeFactory.UNKNOWN) {
//				error(KIND_TYPE_NOT_EXIST,new String[]{ast.getTargetName()},"unknown data type ["+ast.getTargetName()+"]", ast);
//				type=null;
//			}
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(DataTypeReference.class);
		return type;
	}

	public Object visitTableRefReference(TableRefReference ast, Object data)
			throws Throwable {
		if(DEBUG) enter(TableRefReference.class);
		String name=ast.getTargetName();
		DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(name);
		if(refable!=null) {
			refable.ref++;
		} else {
			error(KIND_TABLE_REFERENCE_NOT_EXIST, new String[] { name }, "table reference ["+name+"] not exist", ast );
		}
		if(DEBUG) exit(TableRefReference.class);
		return getData(ISqlTypeDefine.TYPE_NAME_TABLE_REFERENCE, DataKinds.SQL_TYPE_DEFINE, null, ast, null);
	}
	
	public Object visitClassReference(ClassReference ast, Object data)
			throws Throwable {
		String className=null;
		if(DEBUG) enter(ClassReference.class);
		if(ast.isValid()) {
			className=ast.getTargetName();
		}
		if(DEBUG) exit(ClassReference.class);
		return className;
	}

	public Object visitLogicalPredicate(LogicalPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(LogicalPredicate.class);
		if(ast.getPrimary()!=null) {
			this.checkConditionExpression(ast.getPrimary(), data);
		}
		if(ast.getConditionExpressions()!=null) {
			for(ConditionExpression exp : ast.getConditionExpressions()) {
				if(exp!=null) this.checkConditionExpression(exp, data);
			}
		}
		if(DEBUG) exit(LogicalPredicate.class);
		return null;
	}

	public Object visitParenConditionExpression(ParenConditionExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(ParenConditionExpression.class);
		if(ast.getPrimary()!=null) {
			this.checkConditionExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(ParenConditionExpression.class);
		return null;
	}

	public Object visitRelationPredicate(RelationPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(RelationPredicate.class);
		ISqlTypeDefine primaryType=null;
		if(ast.getValuePrimary()!=null) {
			primaryType=this.checkValueExpression(ast.getValuePrimary(), data);
		}
		String op=ast.getOperator();
		if( 	   RelationPredicate.OPERATOR_EQUAL.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_EQUAL.equalsIgnoreCase(op)) {
			this.checkEqualPredicate(primaryType, ast, data);
		} else if( RelationPredicate.OPERATOR_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_GREAT.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_GREAT.equalsIgnoreCase(op)) {
			this.checkComparePredicate(primaryType, ast, data);
		} else if( RelationPredicate.OPERATOR_IN.equalsIgnoreCase(op)) {
			this.checkInPredicate(primaryType, ast, data);
		} else if( RelationPredicate.OPERATOR_BETWEEN.equalsIgnoreCase(op)) {
			this.checkBetweenPredicate(primaryType, ast, data);
		} else if( RelationPredicate.OPERATOR_LIKE.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_STARTS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_ENDS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_CONTAINS.equalsIgnoreCase(op)) {
			this.checkLikePredicate(primaryType, ast, data);
		} else if( RelationPredicate.OPERATOR_IS.equalsIgnoreCase(op)) {
			this.checkIsPredicate(primaryType, ast, data);
		} else if(op!=null) {
			fatal("unknown relation predicate operator ["+op+"]",ast);
		}
		if(DEBUG) exit(RelationPredicate.class);
		return null;
	}

	public ISqlTypeDefine visitArgumentReference(ArgumentReference ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ArgumentReference.class);
		String name=DnaSqlUtils.getArgumentName(ast.getArgumentName());
		ReferencedDataMap<ArgumentDeclaration, ISqlTypeDefine> arguments=fScope.getArguments(false);
		if(arguments!=null && arguments.containsKey(name)) {
			DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=arguments.get(name);
			type=refable.data;
			refable.ref++;
		} else {
			error(KIND_ARGUMENT_NOT_EXIST, new String[] { name }, "argument ["+name+"] not exist", ast );
		}
		if(DEBUG) exit(ArgumentReference.class);
		return type;
	}

	public ISqlTypeDefine visitCaseExpression(CaseExpression ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		ISqlTypeDefine caseType;
		ISqlTypeDefine commonType;
		if(DEBUG) enter(CaseExpression.class);
		if(CaseExpression.OPERATOR_CASE_NORMAL.equalsIgnoreCase(ast.getOperator())) {
			ISqlTypeDefine primaryType=null;
			if(ast.getPrimary()!=null) {
				primaryType=checkValueExpression(ast.getPrimary(), data);
			}
			if(ast.getCaseValues()!=null) {
				int whenLength=(ast.getCaseValues().size()/2)*2;
				for(int i=0; i<whenLength; i++) {
					ValueExpression value = ast.getCaseValues().get(i);
					if(value!=null) {
						caseType=this.checkValueExpression(value, data);
						if(i%2==0) {
							if(primaryType!=null && !SemanticUtil.isAssignable(caseType, primaryType)) {
								error(KIND_TYPE_MISS_MATCH, 
										new String[] { primaryType.toString(), caseType.toString(), },
										"can not assign ["+primaryType.toString()+"] to ["+caseType.toString()+"]",
										ast);
							}
						} else {
							if(type==null) type=caseType;
							else {
								commonType=SemanticUtil.getCommonType(type, caseType);
								if(commonType!=null) type=commonType;
								else error(KIND_TYPE_MISS_MATCH, 
										new String[] { type.toString(), caseType.toString(),},
										"value type ["+caseType.toString()+"] conflict with other case options",
										ast);
							}
						}
					}
				}
				if(whenLength<ast.getCaseValues().size()) {
					ValueExpression value = ast.getCaseValues().get(whenLength);
					if(value!=null) {
						caseType=this.checkValueExpression(value, data);
						if(type==null) type=caseType;
						else {
							commonType=SemanticUtil.getCommonType(type, caseType);
							if(commonType!=null) type=commonType;
							else error(KIND_TYPE_MISS_MATCH, 
									new String[] { type.toString(), caseType.toString(),},
									"value type ["+caseType.toString()+"] conflict with other case options",
									ast);
						}
					}
				}
			}
		} else if(CaseExpression.OPERATOR_CASE_SEARCH.equalsIgnoreCase(ast.getOperator())) {
			if(ast.getCaseConditions()!=null) {
				for(ConditionExpression ce : ast.getCaseConditions()) {
					this.checkConditionExpression(ce, data);
				}
			}
			if(ast.getCaseValues()!=null) {
				int whenLength=ast.getCaseValues().size();
				for(int i=0; i<whenLength; i++) {
					ValueExpression value = ast.getCaseValues().get(i);
					if(value!=null) {
						caseType=this.checkValueExpression(value, data);
						if(type==null) type=caseType;
						else {
							commonType=SemanticUtil.getCommonType(type, caseType);
							if(commonType!=null) type=commonType;
							else error(KIND_TYPE_MISS_MATCH, 
									new String[] { type.toString(), caseType.toString(),},
									"value type ["+caseType.toString()+"] conflict with other case options",
									ast);
						}
					}
				}
			}
		} else if(CaseExpression.OPERATOR_CASE_COALESCE.equalsIgnoreCase(ast.getOperator())) {

			if(ast.getCaseValues()!=null) {
				for(int i=0; i<ast.getCaseValues().size(); i++) {
					ValueExpression value = ast.getCaseValues().get(i);
					if(value!=null) {
						caseType=this.checkValueExpression(value, data);
						if(type==null) type=caseType;
						else if (caseType!=null) {
							commonType=SemanticUtil.getCommonType(type, caseType);
							if(commonType!=null) type=commonType;
							else error(KIND_TYPE_MISS_MATCH, 
									new String[] { type.toString(), caseType.toString(),},
									"value type ["+caseType.toString()+"] conflict with other coalesce options",
									ast);
						}
						
					}
				}
			}
		} else {
			fatal("unknown case operator ["+ast.getOperator()+"]",ast);
		}
		if(DEBUG) exit(CaseExpression.class);
		return type;
	}

	public ISqlTypeDefine visitConstantExpression(ConstantExpression ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ConstantExpression.class);
		switch(ast.getType()) {
		case LiteralKinds.KIND_DATE:
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_DATE, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			if(ast.getValue()!=null) {
				if(!type.isValid(ast.getValue())) {
					error(KIND_ILL_DATE_FORMAT,new String[]{ast.getValue()},
							"literal ["+ast.getValue()+"] is not a correct DATE",ast);
				}
			}
			break;
		case LiteralKinds.KIND_GUID:
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_GUID, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			if(ast.getValue()!=null) {
				if(!type.isValid(ast.getValue())) {
					error(KIND_ILL_GUID_FORMAT,new String[]{ast.getValue()},
							"literal ["+ast.getValue()+"] is not a correct GUID",ast);
				}
			}
			break;
		case LiteralKinds.KIND_BYTES:
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_BYTES, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			if(ast.getValue()!=null) {
				if(!type.isValid(ast.getValue())) {
					error(KIND_ILL_BYTES_FORMAT,new String[]{ast.getValue()},
							"literal ["+ast.getValue()+"] is not a correct BYTES",ast);
				}
			}
			break;
		case LiteralKinds.KIND_STRING:
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_STRING, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			break;
		case LiteralKinds.KIND_BOOLEAN:
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_BOOLEAN, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			if(ast.getValue()!=null) {
				if (!ConstantExpression.VALUE_TRUE_LITERAL.equalsIgnoreCase(ast.getValue())
				 && !ConstantExpression.VALUE_FALSE_LITERAL.equalsIgnoreCase(ast.getValue())) {
					error(KIND_ILL_BOOLEAN_FORMAT,new String[]{ast.getValue()},
							"literal ["+ast.getValue()+"] is not a correct BOOLEAN",ast);
				}
			}
			break;
		default:
			try {
				switch(ast.getType()) {
				case LiteralKinds.KIND_FLOAT:
					type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_FLOAT, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
					Double.parseDouble(ast.getValue());
					break;
				case LiteralKinds.KIND_INTEGER:
					long lv=Long.parseLong(ast.getValue());
					if(lv==(int)lv)
						type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
					else
						type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_LONG, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
					break;
				default:
					fatal("unknown literal type kind ["+ast.getType()+"]",ast);
					break;
				}
			} catch (NumberFormatException e) {
				error(KIND_ILL_NUMBER_FORMAT,new String[]{ast.getValue()},
						"literal ["+ast.getValue()+"] is not correct number",ast);
			}
			break;
		}
		if(DEBUG) exit(ConstantExpression.class);
		return type;
	}

	public ISqlTypeDefine visitFunctionCallExpression(FunctionCallExpression ast,
			Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(FunctionCallExpression.class);

		boolean hasTypeMiss=false;
		ISqlTypeDefine[] paraTypes=null;
		if(ast.getParameters()!=null) {
			paraTypes=new ISqlTypeDefine[ast.getParameters().size()];
			for(int i=0;i<ast.getParameters().size();i++) {
				try {
					IFunctionParameter param=ast.getParameters().get(i);
					if(param!=null) paraTypes[i]=checkFunctionParameter(param,data);
					hasTypeMiss=hasTypeMiss||param==null||paraTypes[i]==null;
				} catch (Throwable e) {
					report(e, ast);
				}
			}
		} else {
			paraTypes=EMPTY_TYPE_ARRAY;
		}
		
		if(ast.getFunctionName()!=null&&!hasTypeMiss) {
			type=checkFunction(ast,paraTypes,data);
		}
		if(DEBUG) exit(FunctionCallExpression.class);
		return type;
	}

	public ISqlTypeDefine visitNullExpression(NullExpression ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(NullExpression.class);
		type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_NULL, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
		if(DEBUG) exit(NullExpression.class);
		return type;
	}

	public ISqlTypeDefine visitOperatorExpression(OperatorExpression ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		ISqlTypeDefine secondary=null;
		ValueExpression prev=null;
		if(DEBUG) enter(OperatorExpression.class);
		if(ast.getPrimary()!=null) {
			type=this.checkValueExpression(ast.getPrimary(), data);
			prev=ast.getPrimary();
		}
		if(ast.getValueExpressions()!=null) { 
			for(ValueExpression value : ast.getValueExpressions()){
				if(value!=null) {
					secondary=this.checkValueExpression(value, data);
					type=checkOperation(type,secondary,prev,value,data);
					prev=value;
				}
			}
		}
		if(DEBUG) exit(OperatorExpression.class);
		return type;
	}

	public ISqlTypeDefine visitParenValueExpression(ParenValueExpression ast,
			Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ParenValueExpression.class);
		if(ast.getPrimary()!=null) {
			type=this.checkValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(ParenValueExpression.class);
		return type;
	}
	
	
	protected Object checkInPredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			checkDataType(primaryType,(ValueExpression)ast.getUncertainOperand(),data);
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					checkDataType(primaryType,(ValueExpression)obj,data);
				} else if(obj!=null) {
					fatal("unexpect operand ast class ["+obj.getClass().getSimpleName()+"]",
							(obj instanceof IAstNode)? (IAstNode)obj : ast);
				}
			}
		} else if(ast.getUncertainOperand()!=null) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate [in]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected Object checkBetweenPredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {

		/*
		if(primaryType!=null && !SemanticUtil.isNumberic(primaryType.getRootType()))
			error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
					"primary operand must be a number",ast.getValuePrimary());
		 */
		if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					ISqlTypeDefine type=this.checkValueExpression((ValueExpression)obj, data);
					if(type!=null&&primaryType!=null&&!SemanticUtil.isAssignable(primaryType.getRootType(),type)) {
						error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
								"operand must be the same as primary operand type ["+primaryType+"], not ["+type+"].",(ValueExpression)obj);
					}
				} else if(obj!=null) {
					fatal("unexpect operand ast class ["+obj.getClass().getSimpleName()+"]",
							(obj instanceof IAstNode)? (IAstNode)obj : ast);
				}
			}
		} else if(ast.getUncertainOperand()!=null) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate [between]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected Object checkLikePredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {

		ISqlTypeDefine type=null;
		if(primaryType!=null && !ISqlTypeDefine.TYPE_NAME_STRING.equals(primaryType.getRootType().getID()))
			error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
					"primary operand must be a string",ast.getValuePrimary());
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			type=this.checkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
			if(type!=null && !ISqlTypeDefine.TYPE_NAME_STRING.equals(type.getRootType().getID()))
				error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
						"FORMAT of [like] must be a string",(ValueExpression)ast.getUncertainOperand());
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			List<?> likes=(List<?>)ast.getUncertainOperand();
			if(likes.size()==1 || likes.size()==2) {
				Object obj=likes.get(0);
				//检查模式串的格式
				if(obj instanceof ValueExpression) {
					type=this.checkValueExpression((ValueExpression)obj, data);
					if(type!=null && !ISqlTypeDefine.TYPE_NAME_STRING.equals(type.getRootType().getID()))
						error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
								"FORMAT of [like] must be a string",(ValueExpression)obj);
				} else if(obj!=null) {
					fatal("unexpect FORMAT ast class ["+obj.getClass().getSimpleName()+"]",
							(obj instanceof IAstNode)? (IAstNode)obj : ast);
				}
				if(likes.size()==2) {
					obj=likes.get(1);
					//检查escape串的格式
					if(obj instanceof ValueExpression) {
						type=this.checkValueExpression((ValueExpression)obj, data);
						if(type!=null && !ISqlTypeDefine.TYPE_NAME_STRING.equals(type.getRootType().getID()))
							error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
									"ESCAPE of [like] must be a string",(ValueExpression)obj);
					} else if(obj!=null) {
						fatal("unexpect ESCAPE ast class ["+obj.getClass().getSimpleName()+"]",
								(obj instanceof IAstNode)? (IAstNode)obj : ast);
					}
				}
			} else {
				fatal("unexpect number of operands from [like] pridicate", ast);
			}
		} else if(ast.getUncertainOperand()!=null) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate ["+ast.getOperator()+"]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected Object checkEqualPredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			ISqlTypeDefine type=this.checkValueExpression((ValueExpression)ast.getUncertainOperand(), data);
			if(primaryType!=null&&type!=null&&!SemanticUtil.isAssignable(primaryType, type)) {
				warn(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString(),type.toString()},
						"worthless compare between value with type ["+primaryType.toString()+"] and value with type ["+type.toString()+"]",ast);
			}
		} else if(ast.getUncertainOperand()!=null) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate ["+ast.getOperator()+"]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected Object checkComparePredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {
		ISqlTypeDefine type=null;
		if(primaryType!=null && primaryType.getRootType().isLOB())
			error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
					"primary operand may not be in a LOB type",ast.getValuePrimary());
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			type=this.checkValueExpression((ValueExpression)ast.getUncertainOperand(), data);

			if(type!=null && type.getRootType().isLOB())
				error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
						"operand may not be in a LOB type",(ValueExpression)ast.getUncertainOperand());
			else if(type!=null && primaryType!=null && !SemanticUtil.isComparable(primaryType, type))
				error(KIND_TYPE_MISS_MATCH,new String[] { String.valueOf(type) },
						"value of type ["+primaryType+"] cannot compare with value of type ["+type+"]",ast);
		} else if(ast.getUncertainOperand()!=null) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate ["+ast.getOperator()+"]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected Object checkIsPredicate(ISqlTypeDefine primaryType, RelationPredicate ast, Object data)  throws Throwable {

		if(ast.getUncertainOperand()!=null && !(ast.getUncertainOperand() instanceof NullExpression)) {
			fatal("unexpect operand class ["+ast.getUncertainOperand().getClass().getSimpleName()+"] in predicate [is null]",
					(ast.getUncertainOperand() instanceof IAstNode) ? (IAstNode)ast.getUncertainOperand() : ast);
		}
		return null;
	}
	
	protected ISqlTypeDefine checkFunction(FunctionCallExpression ast, ISqlTypeDefine[] paraTypes, Object data) throws Throwable {
		
		if(ast.getFunctionName()==null) return null;
		IFunctionDefine fun=(IFunctionDefine) getData(ast.getFunctionName(), DataKinds.SQL_FUNCTION_DEFINE, null, ast, null);
		
		if(fun==null) {
			error(KIND_FUNCTION_NOT_EXIST,
					new String[] { ast.getFunctionName() },
					"undefined function ["+ast.getFunctionName()+"]",ast);
			return null;
		} 
		
		IFunctionPattern pattern = fun.matchPattern(paraTypes);
		if(pattern!=null) {
			return pattern.getReturnType();
		}
		pattern = fun.findClosestPattern(paraTypes); 
		if(pattern!=null) {
			IParameterDefine[] paramList = pattern.getParameterList();
			if(paraTypes.length==paramList.length) {

				for(int i=0; i<paraTypes.length; i++) {
					IParameterDefine argu = paramList[i];
					if(!SemanticUtil.isAssignable(argu.getSqlType(), paraTypes[i])) {
						error(KIND_PARAMETER_LIST_MISS_MATCH,
								new String[] { ast.getFunctionName(), String.valueOf(paraTypes[i]) },
								"parameter of type ["+argu.getSqlType().getName()+"] expert",ast.getParameters().get(i));
					}
				}
			} else if(paraTypes.length>paramList.length) {
				error(KIND_PARAMETER_LIST_MISS_MATCH,
						new String[] { ast.getFunctionName() },
						"too many parameters for function ["+ast.getFunctionName()+"]",ast);
			} else {
				error(KIND_PARAMETER_LIST_MISS_MATCH,
						new String[] { ast.getFunctionName() },
						"not enough parameters for function ["+ast.getFunctionName()+"]",ast);
			}
			
		} else {
				error(KIND_PARAMETER_LIST_MISS_MATCH,
						new String[] { ast.getFunctionName(), },
						"function parameter list cannot match any overload of ["+ast.getFunctionName()+"]",ast);
		}
		return null;
	}
	
	protected ISqlTypeDefine checkFunctionParameter(IFunctionParameter param, Object data) throws Throwable {
		if(param instanceof ValueExpression) {
			return this.checkValueExpression((ValueExpression)param, data);
		} else if(param instanceof TableRefReference) {
			return (ISqlTypeDefine)((TableRefReference)param).accept(this, data);
		} else if(param!=null){
			fatal("unexpect function parameter class ["+param.getClass().getSimpleName()+"]", param);
		} else {
			fatal("function parameter is null",param);
		}
		return null;
	}
	
	protected Object checkDataType(ISqlTypeDefine primaryType,
			ValueExpression secondary, Object data) throws Throwable {

		ISqlTypeDefine type=this.checkValueExpression(secondary, data);
		if(primaryType!=null && type!=null && !SemanticUtil.isAssignable(primaryType, type)) {
			error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString(),type.toString()},
					"value type ["+primaryType.toString()+"] not match the primary type ["+type.toString()+"]",
					secondary);
		}
		return null;
	}
	
	protected ISqlTypeDefine checkOperation(ISqlTypeDefine pritype, ISqlTypeDefine sectype,ValueExpression primary, ValueExpression operand, Object data ) {
		ISqlTypeDefine type=pritype;
		if(pritype!=null && sectype!=null) {
			String operator=null;
			TokenNode opToken=operand.getUpperOperator();
			if(opToken!=null) {
				operator=opToken.getTexture();
			}
			if(OperatorExpression.OPERATOR_ADD.equalsIgnoreCase(operator)) {
				if(SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_STRING,pritype)) {
					if(!SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_STRING,sectype)) {
						error(KIND_TYPE_MISS_MATCH,new String[]{sectype.toString()},
								"operand must be a 'string' type as the primary is",operand);
					}
				} else if(SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_BYTES,pritype)) {
					if(!SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_BYTES,sectype)) {
						error(KIND_TYPE_MISS_MATCH,new String[]{sectype.toString()},
								"operand must be a 'bytes' type as the primary is",operand);
					}
				} else if(pritype.isNumberic()) {
					if(!sectype.isNumberic())
						error(KIND_TYPE_MISS_MATCH,new String[]{sectype.toString()},
								"operand must be a number",operand);
				} else {
					error(KIND_TYPE_MISS_MATCH,new String[]{pritype.toString()},
							"primary operand must be a number or string or bytes",primary);
				}
			} else if(OperatorExpression.OPERATOR_SUB.equalsIgnoreCase(operator)
					|| OperatorExpression.OPERATOR_MUL.equalsIgnoreCase(operator)
					|| OperatorExpression.OPERATOR_DIV.equalsIgnoreCase(operator)) {
				if(!pritype.isNumberic())
					error(KIND_TYPE_MISS_MATCH,new String[]{pritype.toString()},
							"primary operand must be a number",primary);
				if(!sectype.isNumberic())
					error(KIND_TYPE_MISS_MATCH,new String[]{pritype.toString()},
							"operand must be a number",operand);
			} else {
				fatal("unknown operator ["+operator+"]",operand);
			}
		}
		return type;
	}
}
