package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
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
import org.eclipse.jt.sql.assist.core.ast.query.TableReference;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;


public class GeneralConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends AbstractGeneralDataScope<TScope>>
		extends AbstractConstructionAccessor<TSNode, TScope>
		implements IGeneralAccessor<TScope> {
	
	protected Map<String, ArgumentDeclaration> fArgumentMap;
	protected Map<String, TableReference> fTableMap;
	
	protected Map<String, ArgumentDeclaration> getArgumentMap() {
		if(fArgumentMap==null) {
			fArgumentMap=new HashMap<String, ArgumentDeclaration>();
		}
		return fArgumentMap;
	}
	
	protected Map<String, TableReference> getTableMap() {
		if(fTableMap==null) {
			fTableMap=new HashMap<String, TableReference>();
		}
		return fTableMap;
	}
	
	public  GeneralConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode, TScope> provider) {
		super(data,provider);
	}
	
	public  GeneralConstructionAccessor(BaseConstructionAccessor<TSNode, TScope> baseWalker) {
		super(baseWalker);
	}
	
	public boolean enterArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		if(ast.getName()!=null) {
			getArgumentMap().put(ast.getName().getTexture(), ast);
		}
		StringBuffer buffer=new StringBuffer(30);
		//buffer.append(ArgumentDeclaration.ARGUMETN_PREFIX_CHARACTOR);
		buffer.append(ast.getName().getTexture());
		if(ast.getType()!=null) {
			buffer.append(" : ").append(ast.getType().getTitle());
		}
		if(!ast.isNotNull()) {
			buffer.append(", nullable");
		}
		if(ast.getDefaultValue()!=null) {
			buffer.append(", ").append(ArgumentDeclaration.DEFAULT_WORD)
				.append('(').append(ast.getDefaultValue().getTitle()).append(')');
		}
		ISourcePosition titlePosition= null;
		if(ast.getName()!=null && ast.getName().getTexture()!=null) {
			titlePosition = createPosition(ast.getPosition().getStart(), ast.getName().getTexture().length());
		}
		this.getBaseConstructionWalker().dealNode(ast, scope, buffer.toString(), titlePosition);
		return false;
	}
	
	public boolean enterArgumentReference(ArgumentReference ast, TScope scope) {
		StringBuffer buffer=new StringBuffer(30);
		//buffer.append(ArgumentDeclaration.ARGUMETN_PREFIX_CHARACTOR);
		buffer.append(ast.getArgumentName());
		if(fArgumentMap!=null) {
			ArgumentDeclaration ard=fArgumentMap.get(ast.getArgumentName());
			if(ard!=null && ard.getType()!=null) {
				buffer.append(" : ");
				buffer.append(ard.getType().getTargetName());
			}
		}

		this.getBaseConstructionWalker().dealNode(ast, scope, buffer.toString(), ast.getPosition());
		return false;
	}
	
	public boolean enterTableRefReference(TableRefReference ast, TScope scope) {
		StringBuffer buffer=new StringBuffer(30);
		buffer.append(ast.getTargetName());
		if(fTableMap!=null) {
			TableReference tr=fTableMap.get(ast.getTargetName());
			if(tr!=null && tr.getTargetName()!=null) {
				buffer.append(" : ");
				buffer.append(tr.getTargetName());
			}
		}

		this.getBaseConstructionWalker().dealNode(ast, scope, buffer.toString(), ast.getPosition());
		return false;
	}

	public boolean enterCaseExpression(CaseExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterClassReference(ClassReference ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterConstantExpression(ConstantExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterDataTypeReference(DataTypeReference ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterNullExpression(NullExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterOperatorExpression(OperatorExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterRelationPredicate(RelationPredicate ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitCaseExpression(CaseExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitClassReference(ClassReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitConstantExpression(ConstantExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitDataTypeReference(DataTypeReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitFunctionCallExpression(FunctionCallExpression ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitLogicalPredicate(LogicalPredicate ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitNullExpression(NullExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitOperatorExpression(OperatorExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitParenConditionExpression(ParenConditionExpression ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitParenValueExpression(ParenValueExpression ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitRelationPredicate(RelationPredicate ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitArgumentDeclaration(ArgumentDeclaration ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitArgumentReference(ArgumentReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableRefReference(TableRefReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	
}
