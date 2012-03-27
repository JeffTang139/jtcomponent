/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDescriptor;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.analysis.internal.util.CompletionUtil;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IFunctionParameter;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
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
import org.eclipse.jt.sql.assist.core.ast.query.TableReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionDefine;
import org.eclipse.jt.sql.assist.core.data.define.IFunctionPattern;
import org.eclipse.jt.sql.assist.core.data.define.IParameterDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralCompletionDetector<TScope extends AbstractGeneralDataScope<TScope>> extends AbstractCompletionDetector<TScope>
		implements IGeneralAstVisitor<Object,Boolean>, 
			IGeneralConditionVisitor<Object,Boolean>,
			IGeneralValueVisitor<Object,Boolean> {
	
	
	protected Map<String, DataReference<ArgumentDeclaration, ISqlTypeDefine>> fArguments;
	

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.internal.completion.AbstractCompletionDetector#doDetect(org.eclipse.jt.script.assist.IAstNode)
	 */
	@Override
	protected void doDetect(IAstNode ast) {
		try {
			visitGeneral(ast,null);
			clean();
		} catch (Throwable e) {
			report(e,this);
		}
	}
	
	protected void clean() {
		if(fArguments!=null) fArguments.clear();

		for(IDataScope<?> scope=fScope;scope!=null;scope=scope.getParent()) {
			scope.clear();
		}
		fScope=null;
	}
	
	protected Object completionValueExpression(ValueExpression ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, forceIgnore);
		} else if(ast!=null) {
			fatal("unknown value expression class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("value expression is null");
		}
		return null;
	}
	
	protected Object completionConditionExpression(ConditionExpression ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IGeneralConditionNode) {
			return ((IGeneralConditionNode)ast).accept(this, forceIgnore);
		} else if(ast!=null) {
			fatal("unknown condition expression class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("condition expression is null");
		}
		return null;
	}
	
	protected Object completionFunctionParameter(IFunctionParameter ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof ValueExpression) {
			return this.completionValueExpression((ValueExpression)ast, forceIgnore);
		} else if(ast instanceof TableRefReference) {
			return (ISqlTypeDefine)((TableRefReference)ast).accept(this, forceIgnore);
		} else if(ast!=null){
			fatal("unexpect function parameter class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("function parameter is null");
		}
		return null;
	}
	
	public Object visitGeneral(IAstNode ast, Boolean forceIgnore) throws Throwable {

		if(ast instanceof IGeneralAstNode) {
			return ((IGeneralAstNode)ast).accept(this, null);
		} else if(ast instanceof IGeneralConditionNode) {
			return ((IGeneralConditionNode)ast).accept(this, null);
		} else if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, null);
		} else if(ast!=null){
			fatal("unknown ast class ["+ast.getClass().getSimpleName()+"]");
			return null;
		} else {
			fatal("null ast ");
			return null;
		}
	}

	public Object visitArgumentDeclaration(ArgumentDeclaration ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(ArgumentDeclaration.class);
		
		
		
		if(ast.getType()!=null) ast.getType().accept(this, forceIgnore);
		else if(!isIgnored(KIND_DATA_TYPE,forceIgnore)
				&& ast.getName()!=null
				&& ast.getName().getTexture()!=null
				&& isVan(ast.getPosition().getStart()+ast.getName().getTexture().length())) {
			String[] names=CompletionUtil.getDataTypeNames();
			for(int i=0;i<names.length;i++) {
				this.assitDataType(names[i], null, null, null);
			}
		}
		if(ast.getName()!=null
				&& ast.getName().getTexture()!=null) {

			String name=DnaSqlUtils.getArgumentName(ast.getName().getTexture());
			DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=null;
			if(this.fArguments!=null) {
				refable=this.fArguments.get(name);
				if(refable==null) {
					refable=new DataReference<ArgumentDeclaration, ISqlTypeDefine>(ast);
					fArguments.put(name, refable);
				}
			} else {
				fArguments=new HashMap<String, DataReference<ArgumentDeclaration, ISqlTypeDefine>>();
				refable=new DataReference<ArgumentDeclaration, ISqlTypeDefine>(ast);
				fArguments.put(name, refable);
			}
		}
		
		if(DEBUG) exit(ArgumentDeclaration.class);
		return null;
	}

	public Object visitDataTypeReference(DataTypeReference ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(DataTypeReference.class);
		if(!isIgnored(KIND_DATA_TYPE,forceIgnore) && isSurround(ast)) {
			String prefix=ast.getTargetName().substring(0,fPosition-ast.getPosition().getStart());
			List<String> names=CompletionUtil.getFiledDataTypeNames(prefix);
			for(int i=0;i<names.size();i++) {
				this.assitDataType(names.get(i), null, ast.getPosition(), null);
			}
		}
		if(DEBUG) exit(DataTypeReference.class);
		return null;
	}

	public Object visitTableRefReference(TableRefReference ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(TableRefReference.class);
		if(!isIgnored(KIND_TABLE_REFERENCE,forceIgnore) && isSurround(ast)) {
			int start=ast.getPosition().getStart();
			int length=fPosition-start;
			if(this.fContent.charAt(start)=='\"') {
				length--;
			}
			for(int i=start+1;i+1<fPosition && i+1<fContent.length() ;i++) {
				if(this.fContent.charAt(i)=='\"'
					&& this.fContent.charAt(i+1)=='\"') {
					length--;
					i++;
				}
			}
			if(ast.getPosition().getEnd()<=fPosition
					&& ast.getPosition().getEnd()<fContent.length()
					&& fContent.charAt(ast.getPosition().getEnd()-1)=='\"') {
				length--;
			}
			if(length<=ast.getTargetName().length()) {
				String prefix=ast.getTargetName().substring(0,length);
				assitValues(prefix,null,
						new SourcePosition(start,fPosition));
			}
		}
		if(DEBUG) exit(TableRefReference.class);
		return null;
	}
	
	public Object visitClassReference(ClassReference ast, Boolean data)
			throws Throwable {
		if(DEBUG) enter(ClassReference.class);
		if(DEBUG) exit(ClassReference.class);
		return null;
	}

	public Object visitLogicalPredicate(LogicalPredicate ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(LogicalPredicate.class);
		ConditionExpression last=null;
		if(ast.getPrimary()!=null) {
			last=ast.getPrimary();
			this.completionConditionExpression(ast.getPrimary(), forceIgnore);
		}
		if(ast.getConditionExpressions()!=null) {
			for(ConditionExpression exp : ast.getConditionExpressions()) {
				if(last==null && !isIgnored(KIND_ANY, forceIgnore)
							&& isRear(exp.getUpperOperator())) {
					assitValues(null, null, null);
				}
				if(exp!=null) {
					this.completionConditionExpression(exp, forceIgnore);
				}
				last=exp;
			}
		} else {
			last=null;
		}
		if(last==null&&!isIgnored(KIND_ANY, forceIgnore)
				&&isVan(ast.getPosition())) {
			assitValues(null, null, null);
		}
		if(DEBUG) exit(LogicalPredicate.class);
		return null;
	}

	public Object visitParenConditionExpression(ParenConditionExpression ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(ParenConditionExpression.class);
		if(ast.getPrimary()!=null) {
			this.completionConditionExpression(ast.getPrimary(), forceIgnore);
		}else if(!isIgnored(KIND_ANY, forceIgnore)
				&&fPosition>ast.getPosition().getStart()
				&&fPosition<ast.getPosition().getEnd()) {
			assitValues(null, null, null);
		}
		if(DEBUG) exit(ParenConditionExpression.class);
		return null;
	}

	public Object visitRelationPredicate(RelationPredicate ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(RelationPredicate.class);
		if(ast.getValuePrimary()!=null) {
			this.completionValueExpression(ast.getValuePrimary(), forceIgnore);
		} else if(!isIgnored(KIND_ANY, forceIgnore)
				&& ast.getOperatorPosition()!=null
				&& isRear(ast.getOperatorPosition().getStart())) {
			assitValues(null, null, null);
		}
		String op=ast.getOperator();
		if( 	   RelationPredicate.OPERATOR_EQUAL.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_EQUAL.equalsIgnoreCase(op)) {
			this.completionEqualPredicate(ast, forceIgnore);
		} else if( RelationPredicate.OPERATOR_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_GREAT.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_GREAT.equalsIgnoreCase(op)) {
			this.completionComparePredicate(ast, forceIgnore);
		} else if( RelationPredicate.OPERATOR_IN.equalsIgnoreCase(op)) {
			this.completionInPredicate(ast, forceIgnore);
		} else if( RelationPredicate.OPERATOR_BETWEEN.equalsIgnoreCase(op)) {
			this.completionBetweenPredicate(ast, forceIgnore);
		} else if( RelationPredicate.OPERATOR_LIKE.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_STARTS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_ENDS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_CONTAINS.equalsIgnoreCase(op)) {
			this.completionLikePredicate(ast, forceIgnore);
		} else if( RelationPredicate.OPERATOR_IS.equalsIgnoreCase(op)) {
			this.completionIsPredicate(ast, forceIgnore);
		} else if(op!=null) {
			fatal("unknown relation predicate operator ["+op+"]");
		}
		if(DEBUG) exit(RelationPredicate.class);
		return null;
	}

	protected void completionIsPredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof NullExpression)
			((NullExpression)ast.getUncertainOperand()).accept(this, forceIgnore);
	}

	protected void completionLikePredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.completionValueExpression((ValueExpression)ast.getUncertainOperand(), forceIgnore);
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			List<?> likes=(List<?>)ast.getUncertainOperand();
			if(likes.size()==1 || likes.size()==2) {
				Object obj=likes.get(0);
				//Ä£Ê½´®
				if(obj instanceof ValueExpression) {
					this.completionValueExpression((ValueExpression)obj, forceIgnore);
				}
				if(likes.size()==2) {
					obj=likes.get(1);
					//escape´®
					if(obj instanceof ValueExpression) {
						this.completionValueExpression((ValueExpression)obj, forceIgnore);
					}
				}
			}
		}  else if(!isIgnored(KIND_ANY, forceIgnore)
				&&isVan(ast.getOperatorPosition())) {
			assitValues(null, null, null);
		}
	}

	protected void completionBetweenPredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					this.completionValueExpression((ValueExpression)obj, forceIgnore);
				}
			}
		}
	}

	protected void completionInPredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			completionValueExpression((ValueExpression)ast.getUncertainOperand(),forceIgnore);
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					completionValueExpression((ValueExpression)obj,forceIgnore);
				}
			}
		} else if(!isIgnored(KIND_ANY, forceIgnore)
				&&isVan(ast.getOperatorPosition())) {
			assitValues(null, null, null);
		}
	}

	protected void completionComparePredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.completionValueExpression((ValueExpression)ast.getUncertainOperand(), forceIgnore);
		}  else if(!isIgnored(KIND_ANY, forceIgnore)
				&&isVan(ast.getOperatorPosition())) {
			assitValues(null, null, null);
		}
	}

	protected void completionEqualPredicate(RelationPredicate ast, Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.completionValueExpression((ValueExpression)ast.getUncertainOperand(), forceIgnore);
		}  else if(!isIgnored(KIND_ANY, forceIgnore)
				&&isVan(ast.getOperatorPosition())) {
			assitValues(null, null, null);
		}
	}

	public Object visitArgumentReference(ArgumentReference ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(ArgumentReference.class);

		if(!isIgnored(KIND_ARGUMENT_REFERENCE,forceIgnore) && isSurround(ast) && fArguments!=null) {
			int len = fPosition-ast.getPosition().getStart();
			if(len!=0) {

				String prefix=ast.getArgumentName().substring(0,len);
				prefix=DnaSqlUtils.getArgumentName(prefix);
				assitArgumentReferences(prefix,null,
						new SourcePosition(ast.getPosition().getStart(),
								ast.getPosition().getStart()+(prefix!=null?prefix.length():0)));
			} else {

				this.assitValues(null, null, null);
			}
		} 
		if(DEBUG) exit(ArgumentReference.class);
		return null;
	}

	public Object visitCaseExpression(CaseExpression ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(CaseExpression.class);
		if(ast.getPrimary()!=null)
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		if(ast.getCaseConditions()!=null) {

			for(int i=0;i<ast.getCaseConditions().size();i++) {
				ConditionExpression condition=ast.getCaseConditions().get(i);
				if(condition!=null) completionConditionExpression(condition,forceIgnore);
			}
		}
		if(ast.getCaseValues()!=null) {
			for(int i=0;i<ast.getCaseValues().size();i++) {
				ValueExpression value=ast.getCaseValues().get(i);
				if(value!=null) completionValueExpression(value,forceIgnore);
			}
		}
		if(DEBUG) exit(CaseExpression.class);
		return null;
	}

	public Object visitConstantExpression(ConstantExpression ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(ConstantExpression.class);
		if(DEBUG) exit(ConstantExpression.class);
		return null;
	}

	public Object visitFunctionCallExpression(FunctionCallExpression ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(FunctionCallExpression.class);
		if(!isIgnored(KIND_FUNCTION, forceIgnore) && ast.getPosition()!=null) {
			int start=ast.getPosition().getStart();
			if(ast.getFunctionName()!=null
					&& isSurround(start, 
							start + ast.getFunctionName().length())) {
				String prefix=ast.getFunctionName().substring(0,fPosition-ast.getPosition().getStart());
				this.assitValues(prefix, null,
						new SourcePosition(start,start + ast.getFunctionName().length()));
			} else if(ast.getFunctionName()==null) {
				start--;
				int back=backChar(start, '(', false);
				if(isRear(start+1)
						||(start!=back && (back+1==fPosition || isRear(back))))
					this.assitValues(null, null, null);
			}
		}
		if(ast.getParameters()!=null) {
			for(int i=0;i<ast.getParameters().size();i++) {
				IFunctionParameter param=ast.getParameters().get(i);
				if(param!=null) completionFunctionParameter(param,forceIgnore);
			}
		}
		if(DEBUG) exit(FunctionCallExpression.class);
		return null;
	}

	public Object visitNullExpression(NullExpression ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(NullExpression.class);
		if(DEBUG) exit(NullExpression.class);
		return null;
	}

	public Object visitOperatorExpression(OperatorExpression ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(OperatorExpression.class);
		ValueExpression last=null;
		if(ast.getPrimary()!=null) {
			last=ast.getPrimary();
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(ast.getValueExpressions()!=null) { 
			for(ValueExpression value : ast.getValueExpressions()){
				if(last==null && !isIgnored(KIND_ANY, forceIgnore)
						&&isRear(value.getUpperOperator())) {
					assitValues(null, null, null);
				}
				if(value!=null) {
					this.completionValueExpression(value, forceIgnore);
				}
				last=value;
			}
		}
		if(last==null && !isIgnored(KIND_ANY, forceIgnore)
				&&(isVan(ast.getPosition()))) {
			assitValues(null, null, null);
		}
		if(DEBUG) exit(OperatorExpression.class);
		return null;
	}

	public Object visitParenValueExpression(ParenValueExpression ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(ParenValueExpression.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		} else if(!isIgnored(KIND_ANY, forceIgnore)
				&&fPosition>ast.getPosition().getStart()
				&&fPosition<ast.getPosition().getEnd()) {
			assitValues(null, null, null);
		}
		if(DEBUG) exit(ParenValueExpression.class);
		return null;
	}
	
	protected void assitValues(String prefix, IAstNode node, ISourcePosition replace) {
		if(!isIgnored(KIND_TABLE_REFERENCE, false)) 
			assitTableRefReferences(prefix,node,replace);
		if(!isIgnored(KIND_FUNCTION, false)) 
			assitFunctions(prefix,node,replace);
		if(!isIgnored(KIND_ARGUMENT_REFERENCE, false)) 
			assitArgumentReferences(prefix,node,replace);
	}
	
	protected void assitFunctions(String prefix, IAstNode node, ISourcePosition replace) {
		IDataDescriptor[] funs = fDataLoader.listDescriptors(prefix, DataKinds.SQL_FUNCTION_DEFINE, null);
		if(funs==null) return;
		for(IDataDescriptor funDes : funs) {
			if(funDes.getKind()==DataKinds.SQL_FUNCTION_DEFINE) {
				try {
					if(funDes.getSource() instanceof IFunctionPattern) {
						assitFunction((IFunctionPattern)funDes.getSource(), node, replace);
					} else {
						IFunctionDefine function = (IFunctionDefine) getData(funDes.getID(), DataKinds.SQL_FUNCTION_DEFINE, null, node);
						IFunctionPattern[] patterns = function.getPatterns();
						for(IFunctionPattern pattern : patterns) {
							assitFunction(pattern, node, replace);
						}
					}
				} catch (Throwable e) {
					report(e, node);
				}
				
			}
		}
	}

	protected void assitFunction(IFunctionPattern pattern, IAstNode node, ISourcePosition replace) {
		if(pattern==null) return;
		ISqlTypeDefine returnType = pattern.getReturnType();
		String strReturnType= returnType!=null?returnType.getName() : null;

		IParameterDefine[] paraList = pattern.getParameterList();
		String[] arguments=new String[paraList.length];
		for(int i=0; i<arguments.length; i++) {
			arguments[i]=paraList[i].getName();
		}
		assitFunctionName(pattern.getName(),arguments,strReturnType,null,replace, CompletionUtil.getDescription(pattern));
	}
	
	protected void assitFunctionName(String name, String[] arguments, String returnType,IAstNode node,ISourcePosition replace, String description) {
		assit(new ParameteredCompletionProposal(name,node,fPosition,replace,description,name+"()", arguments, returnType) {

			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_FUNCTION; }
		});
	}
	
	protected void assitDataType(String name,IAstNode node,ISourcePosition replace, String description) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_DATA_TYPE; }
		});
	}
	
	protected void assitTableRefReferences(String prefix, IAstNode node,ISourcePosition replace) {
		if(fScope.getTableReferences(false)==null) return;
		Collection<String> names=new HashSet<String>();
		fScope.getTableReferences(true).collectNames(prefix,names,true);
		for(String name:names) {
			DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(name);
			if(refable!=null) {
				String target=null;
				String description=null;
				if(refable.ast instanceof TableReference) {
					target=((TableReference)refable.ast).getTargetName();
				} else if(refable.data!=null) {
					target= refable.data.getName();
				}
				if(refable.data != null ) {
					description= CompletionUtil.getDescription(refable.data);
				}
				this.assitTableRefReference(name,target, node, replace, description);
			}
		}
	}
	
	protected void assitTableRefReference(String name,String target,IAstNode node,ISourcePosition replace, String description) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name,target) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_TABLE_REFERENCE; }
		});
	}
	
	protected void assitArgumentReferences(String prefix, IAstNode node, ISourcePosition replace) {

		if(fArguments!=null) {
			prefix=prefix!=null?DnaSqlUtils.getArgumentName(prefix):null;
			List<String> names=CompletionUtil.getNames(fArguments.keySet(), prefix);
			for(int i=0;i<names.size();i++) {
				StringBuffer name=new StringBuffer("@");
				name.append(names.get(i));
				DataReference<ArgumentDeclaration, ISqlTypeDefine> refable=this.fArguments.get(names.get(i));
				String type=null;
				if(refable!=null && refable.ast!=null && refable.ast.getType()!=null) {
					type=refable.ast.getType().getTargetName();
				}
				this.assitArgumentReference(name.toString(), type, null, replace, null);
			}
		}
	}
	
	protected void assitArgumentReference(String name, String type,IAstNode node,ISourcePosition replace, String description) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name,type) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_ARGUMENT_REFERENCE; }
		});
	}

}
