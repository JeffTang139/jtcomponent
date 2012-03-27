package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.ColumnReference;
import org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn;
import org.eclipse.jt.sql.assist.core.ast.query.ExistsPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.FromStatement;
import org.eclipse.jt.sql.assist.core.ast.query.GroupColumn;
import org.eclipse.jt.sql.assist.core.ast.query.GroupStatement;
import org.eclipse.jt.sql.assist.core.ast.query.HavingStatement;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression;
import org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAccessor;
import org.eclipse.jt.sql.assist.core.ast.query.OrderExpression;
import org.eclipse.jt.sql.assist.core.ast.query.OrderStatement;
import org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.SelectStatement;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryReference;
import org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableJoinStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableReference;
import org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement;
import org.eclipse.jt.sql.assist.core.ast.query.TableRelation;
import org.eclipse.jt.sql.assist.core.ast.query.TableRelationStatement;
import org.eclipse.jt.sql.assist.core.ast.query.UnionStatement;
import org.eclipse.jt.sql.assist.core.ast.query.ValueQueryExpression;
import org.eclipse.jt.sql.assist.core.ast.query.WhereStatement;
import org.eclipse.jt.sql.assist.core.ast.query.WithStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;



public class QueryConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends AbstractQueryDataScope<TScope>> 
		extends GeneralConstructionAccessor<TSNode, TScope>
		implements IQueryAccessor<TScope> {

	public  QueryConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode, TScope> provider) {
		super(data,provider);
	}
	
	public  QueryConstructionAccessor(BaseConstructionAccessor<TSNode, TScope> baseWalker) {
		super(baseWalker);
	}
	
	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		StringBuffer buffer=new StringBuffer(30);
		buffer.append(ast.getOperator());
//		buffer.append('(');
//		if(ast.getPrimaryTable()!=null) {
//			buffer.append(ast.getPrimaryTable().getTargetName());
//			if(ast.getSecondaryTable()!=null) {
//				buffer.append(',');
//				buffer.append(ast.getSecondaryTable().getTargetName());
//			}
//		}
//		buffer.append(')');
		buffer.append(" ");
		buffer.append(HierarchyPredicate.USING_WORD);
		buffer.append('(');
		TokenNode[] hs = ast.getHierarchys();
		if(hs!=null && hs.length>0) {
			buffer.append(hs[0].getTexture());
			for(int i=1; i<hs.length; i++) {
				buffer.append(',');
				buffer.append(hs[1].getTexture());
			}
		}
		buffer.append(')');
		

		return this.getBaseConstructionWalker().dealNode(ast, scope, buffer.toString(), ast.getPosition());
	}
	
	public boolean enterTableReference(TableReference ast, TScope scope) {
		if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
			getTableMap().put(ast.getAlias().getTexture(), ast);
		}
//		return super.enterGeneral(ast, scope);
		return internalEnterGeneral(ast, scope);
	}
	
	public boolean enterTableRelation(TableRelation ast, TScope scope) {
		if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
			getTableMap().put(ast.getAlias().getTexture(), ast);
		}
//		return super.enterGeneral(ast, scope);
		return internalEnterGeneral(ast, scope);
	}
	
	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, ast.getName()!=null?ast.getName().getPosition():null);
	}
	
	public boolean enterSelectStatement(SelectStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), SelectStatement.SELECT_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterFromStatement(FromStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), FromStatement.FROM_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterWhereStatement(WhereStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), WhereStatement.WHERE_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterGroupStatement(GroupStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), GroupStatement.GROUP_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterHavingStatement(HavingStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), HavingStatement.HAVING_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterOrderStatement(OrderStatement ast, TScope scope) {
		ISourcePosition pos=createPosition(ast.getPosition().getStart(), OrderStatement.ORDER_WORD.length());
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, pos);
	}
	
	public boolean enterColumnReference(ColumnReference ast, TScope scope) {
		
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterGroupColumn(GroupColumn ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterOrderExpression(OrderExpression ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterQueryStatement(QueryStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}
	
	public boolean exitColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitGroupColumn(GroupColumn ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitOrderExpression(OrderExpression ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitQueryStatement(QueryStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitColumnReference(ColumnReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitFromStatement(FromStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitGroupStatement(GroupStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitHavingStatement(HavingStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitOrderStatement(OrderStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitSelectStatement(SelectStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableReference(TableReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitTableRelation(TableRelation ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitWhereStatement(WhereStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean enterValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterWithStatement(WithStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitWithStatement(WithStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean enterUnionStatement(UnionStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitUnionStatement(UnionStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

}
