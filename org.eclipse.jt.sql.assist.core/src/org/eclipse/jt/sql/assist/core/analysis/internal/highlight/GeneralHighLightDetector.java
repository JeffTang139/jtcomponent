/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.highlight;

import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.analysis.kinds.HighLightingKinds;
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
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralHighLightDetector extends AbstractHighLightDetector
		implements IGeneralAstVisitor<Object, Object>,
		IGeneralConditionVisitor<Object, Object>,
		IGeneralValueVisitor<ISqlTypeDefine, Object> {

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.internal.highlight.AbstractHighLightDetector#doDetect(org.eclipse.jt.script.assist.IAstNode)
	 */
	@Override
	protected void doDetect(IAstNode node) {
		try {
			this.visitGeneral(node, null);
		} catch (Throwable e) {
			report(e, node);
		}
	}
	
	protected Object detectValueExpression(ValueExpression ast, Object data) throws Throwable {
		if(ast instanceof IGeneralValueNode) {
			return ((IGeneralValueNode)ast).accept(this, data);
		} else if(ast!=null) {
			fatal("unknown value expression class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("value expression is null");
		}
		return null;
	}
	
	protected Object detectConditionExpression(ConditionExpression ast, Object data) throws Throwable {
		if(ast instanceof IGeneralConditionNode) {
			return ((IGeneralConditionNode)ast).accept(this, data);
		} else if(ast!=null) {
			fatal("unknown condition expression class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("condition expression is null");
		}
		return null;
	}
	
	protected Object detectFunctionParameter(IFunctionParameter ast, Object data) throws Throwable {
		if(ast instanceof ValueExpression) {
			return this.detectValueExpression((ValueExpression)ast, data);
		} else if(ast instanceof TableRefReference) {
			return (ISqlTypeDefine)((TableRefReference)ast).accept(this, data);
		} else if(ast!=null){
			fatal("unexpect function parameter class ["+ast.getClass().getSimpleName()+"]");
		} else {
			fatal("function parameter is null");
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
			fatal("unknown ast class ["+ast.getClass().getSimpleName()+"]");
			return null;
		} else {
			fatal("null ast ");
			return null;
		}
	}

	public Object visitArgumentDeclaration(ArgumentDeclaration ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitDataTypeReference(DataTypeReference ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitTableRefReference(TableRefReference ast, Object data)
			throws Throwable {
		return null;
	}
	
	public Object visitClassReference(ClassReference ast, Object data)
			throws Throwable {
		return null;
	}

	public Object visitLogicalPredicate(LogicalPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(LogicalPredicate.class);
		if(ast.getPrimary()!=null) {
			this.detectConditionExpression(ast.getPrimary(), data);
		}
		if(ast.getConditionExpressions()!=null) {
			for(ConditionExpression exp : ast.getConditionExpressions()) {
				if(exp!=null) this.detectConditionExpression(exp, data);
			}
		}
		if(DEBUG) exit(LogicalPredicate.class);
		return null;
	}

	public Object visitParenConditionExpression(ParenConditionExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(ParenConditionExpression.class);
		if(ast.getPrimary()!=null) {
			this.detectConditionExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(ParenConditionExpression.class);
		return null;
	}
	

	public Object visitRelationPredicate(RelationPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(RelationPredicate.class);
		if(ast.getValuePrimary()!=null) {
			this.detectValueExpression(ast.getValuePrimary(), data);
		}
		String op=ast.getOperator();
		if( 	   RelationPredicate.OPERATOR_EQUAL.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_EQUAL.equalsIgnoreCase(op)) {
			this.detectEqualPredicate(ast, data);
		} else if( RelationPredicate.OPERATOR_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_LESS.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_GREAT.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_NOT_GREAT.equalsIgnoreCase(op)) {
			this.detectComparePredicate(ast, data);
		} else if( RelationPredicate.OPERATOR_IN.equalsIgnoreCase(op)) {
			this.detectInPredicate(ast, data);
		} else if( RelationPredicate.OPERATOR_BETWEEN.equalsIgnoreCase(op)) {
			this.detectBetweenPredicate(ast, data);
		} else if( RelationPredicate.OPERATOR_LIKE.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_STARTS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_ENDS_WITH.equalsIgnoreCase(op)
				|| RelationPredicate.OPERATOR_CONTAINS.equalsIgnoreCase(op)) {
			this.detectLikePredicate(ast, data);
		} else if( RelationPredicate.OPERATOR_IS.equalsIgnoreCase(op)) {
			this.detectIsPredicate(ast, data);
		} else if(op!=null) {
			fatal("unknown relation predicate operator ["+op+"]");
		}
		if(DEBUG) exit(RelationPredicate.class);
		return null;
	}
	
	protected void detectIsPredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof NullExpression)
			((NullExpression)ast.getUncertainOperand()).accept(this, data);
	}

	protected void detectLikePredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.detectValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			List<?> likes=(List<?>)ast.getUncertainOperand();
			if(likes.size()==1 || likes.size()==2) {
				Object obj=likes.get(0);
				//Ä£Ê½´®
				if(obj instanceof ValueExpression) {
					this.detectValueExpression((ValueExpression)obj, data);
				}
				if(likes.size()==2) {
					obj=likes.get(1);
					//escape´®
					if(obj instanceof ValueExpression) {
						this.detectValueExpression((ValueExpression)obj, data);
					}
				}
			}
		} 
	}

	protected void detectBetweenPredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					this.detectValueExpression((ValueExpression)obj, data);
				}
			}
		}
	}

	protected void detectInPredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			detectValueExpression((ValueExpression)ast.getUncertainOperand(),data);
		} else if(ast.getUncertainOperand() instanceof List<?>) {
			for(Object obj : (List<?>)ast.getUncertainOperand()) {
				if(obj instanceof ValueExpression) {
					detectValueExpression((ValueExpression)obj,data);
				}
			}
		}
	}

	protected void detectComparePredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.detectValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		} 
	}

	protected void detectEqualPredicate(RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof ValueExpression) {
			this.detectValueExpression((ValueExpression)ast.getUncertainOperand(), data);
		} 
	}

	public ISqlTypeDefine visitArgumentReference(ArgumentReference ast, Object data)
			throws Throwable {
		return null;
	}

	public ISqlTypeDefine visitCaseExpression(CaseExpression ast, Object data)
			throws Throwable {
		if(DEBUG) enter(CaseExpression.class);
		if(ast.getPrimary()!=null)
			this.detectValueExpression(ast.getPrimary(), data);
		if(ast.getCaseValues()!=null) {
			for(int i=0;i<ast.getCaseValues().size();i++) {
				ValueExpression value=ast.getCaseValues().get(i);
				if(value!=null) detectValueExpression(value,data);
			}
		}
		if(DEBUG) exit(CaseExpression.class);
		return null;
	}

	public ISqlTypeDefine visitConstantExpression(ConstantExpression ast, Object data)
			throws Throwable {
		return null;
	}

	public ISqlTypeDefine visitFunctionCallExpression(FunctionCallExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(FunctionCallExpression.class);
		if(ast.getParameters()!=null) {
			for(int i=0;i<ast.getParameters().size();i++) {
				IFunctionParameter param=ast.getParameters().get(i);
				if(param!=null) detectFunctionParameter(param,data);
			}
		}
		if(ast.getPosition()!=null && ast.getFunctionName()!=null) {
			ISourcePosition pos=new SourcePosition(ast.getPosition().getStart(),
					ast.getPosition().getStart()+ast.getFunctionName().length());
			this.light(HighLightingKinds.KIND_FUNCTION_CALL, pos);
		}
		if(DEBUG) exit(FunctionCallExpression.class);
		return null;
	}

	public ISqlTypeDefine visitNullExpression(NullExpression ast, Object data)
			throws Throwable {
		return null;
	}

	public ISqlTypeDefine visitOperatorExpression(OperatorExpression ast, Object data)
			throws Throwable {
		if(DEBUG) enter(OperatorExpression.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(ast.getValueExpressions()!=null) { 
			for(ValueExpression value : ast.getValueExpressions()){
				if(value!=null) {
					this.detectValueExpression(value, data);
				}
			}
		}
		if(DEBUG) exit(OperatorExpression.class);
		return null;
	}

	public ISqlTypeDefine visitParenValueExpression(ParenValueExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(ParenValueExpression.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(ParenValueExpression.class);
		return null;
	}

}
