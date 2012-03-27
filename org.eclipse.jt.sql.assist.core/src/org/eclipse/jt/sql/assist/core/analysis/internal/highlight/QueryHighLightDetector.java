/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.highlight;


import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.RelationPredicate;
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
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAstNode;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionNode;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionVisitor;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryValueNode;
import org.eclipse.jt.sql.assist.core.ast.query.IQueryValueVisitor;
import org.eclipse.jt.sql.assist.core.ast.query.OrderExpression;
import org.eclipse.jt.sql.assist.core.ast.query.OrderStatement;
import org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration;
import org.eclipse.jt.sql.assist.core.ast.query.QueryDeclarationBase;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatementBase;
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
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;


/**
 * @author Jeff Tang
 *
 */
public class QueryHighLightDetector extends GeneralHighLightDetector
			implements IQueryAstVisitor<Object, Object>,
			IQueryConditionVisitor<Object, Object>,
			IQueryValueVisitor<ISqlTypeDefine, Object> {

	public static QueryHighLightDetector getInstance() {
		return new QueryHighLightDetector();
	}
	
	protected QueryHighLightDetector() {}

	@Override
	protected Object detectValueExpression(ValueExpression ast, Object data) throws Throwable {
		if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, data);
		} else {
			return super.detectValueExpression(ast, data);
		}
	}

	@Override
	protected Object detectConditionExpression(ConditionExpression ast, Object data) throws Throwable {
		if(ast instanceof IQueryConditionNode) {
			return ((IQueryConditionNode)ast).accept(this, data);
		} else {
			return super.detectConditionExpression(ast, data);
		}
	}
	
	@Override
	protected void detectInPredicate(RelationPredicate ast, Object data)
			throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, data);
		} else {
			super.detectInPredicate(ast, data);
		}
	}
	
	@Override
	protected void detectComparePredicate(RelationPredicate ast, Object data)
			throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, data);
		} else {
			super.detectComparePredicate(ast, data);
		}
	}
	
	@Override
	protected void detectEqualPredicate(RelationPredicate ast, Object data)
			throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, data);
		} else {
			super.detectEqualPredicate(ast, data);
		}
	}

	@Override
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {
		if(ast instanceof IQueryAstNode) {
			return ((IQueryAstNode)ast).accept(this, data);
		} else if(ast instanceof IQueryConditionNode) {
			return ((IQueryConditionNode)ast).accept(this, data);
		} else if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, data);
		} else {
			return super.visitGeneral(ast, data);
		}
	}

	public Object visitDerivedColumn(DerivedColumn ast, Object data)
			throws Throwable {
		if(DEBUG) enter(DerivedColumn.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(DerivedColumn.class);
		return null;
	}

	public Object visitFromStatement(FromStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(FromStatement.class);
		if(ast.getTableReferences()!=null) {
			for(TableReferenceStatement table:ast.getTableReferences()) {
				try {
					if(table!=null) { 
						table.accept(this, data);
					}
				} catch (Throwable e) {
					report(e,table);
				}
			}
		}
		if(DEBUG) exit(FromStatement.class);
		return null;
	}

	public Object visitGroupColumn(GroupColumn ast, Object data)
			throws Throwable {
		if(DEBUG) enter(GroupColumn.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(GroupColumn.class);
		return null;
	}

	public Object visitGroupStatement(GroupStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(GroupStatement.class);
		if(ast.getGroupColumns()!=null) {
			for(GroupColumn column:ast.getGroupColumns()) {
				try {
					if(column!=null) column.accept(this, data);
				} catch (Throwable e) {
					report(e,column);
				}
			}
		}
		if(DEBUG) exit(GroupStatement.class);
		return null;
	}

	public Object visitHavingStatement(HavingStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(HavingStatement.class);
		if(ast.getConditionExpression()!=null) {
			this.detectConditionExpression(ast.getConditionExpression(),data);
		}
		if(DEBUG) exit(HavingStatement.class);
		return null;
	}

	public Object visitOrderExpression(OrderExpression ast, Object data)
			throws Throwable {
		if(DEBUG) enter(OrderExpression.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(OrderExpression.class);
		return null;
	}

	public Object visitOrderStatement(OrderStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(OrderStatement.class);
		if(ast.getOrders()!=null) {
			for(OrderExpression order:ast.getOrders()) {
				try {
					if(order!=null) order.accept(this, data);
				} catch (Throwable e) {
					report(e,order);
				}
			}
		}
		if(DEBUG) exit(OrderStatement.class);
		return null;
	}

	public Object visitQueryDeclaration(QueryDeclaration ast, Object data)
			throws Throwable {
		if(DEBUG) enter(QueryDeclaration.class);
		try {
			this.detectQueryDeclaration(ast, data);
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(QueryDeclaration.class);
		return null;
	}

	public Object visitSelectStatement(SelectStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(SelectStatement.class);
		if(ast.getDerivedColumns()!=null) {
			for(DerivedColumn column:ast.getDerivedColumns()) {
				if(column!=null)
					column.accept(this, data);
			}
		}
		if(DEBUG) exit(SelectStatement.class);
		return null;
	}

	public Object visitSubQueryStatement(SubQueryStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(SubQueryStatement.class);
		this.detectQueryStatement(ast,data);
		if(DEBUG) exit(SubQueryStatement.class);
		return null;
	}

	public Object visitTableJoinStatement(TableJoinStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(TableJoinStatement.class);
		if(ast.getPrimaryTable()!=null)
			ast.getPrimaryTable().accept(this, data);
		if(ast.getSecondaryTable()!=null)
			ast.getSecondaryTable().accept(this, data);
		if(ast.getCondition()!=null)
			this.detectConditionExpression(ast.getCondition(), data);
		if(DEBUG) exit(TableJoinStatement.class);
		return null;
	}

	public Object visitTableReference(TableReference ast, Object data)
			throws Throwable {
		ITableDefine table=null;
		if(DEBUG) enter(TableReference.class);
		if(DEBUG) exit(TableReference.class);
		return table;
	}

	public Object visitTableReferenceStatement(TableReferenceStatement ast,
			Object data) throws Throwable {
		Object table=null;
		if(DEBUG) enter(TableReferenceStatement.class);
		if(ast.getPrimaryTable()!=null) {
			table=ast.getPrimaryTable().accept(this, data);
		}
		if(DEBUG) exit(TableReferenceStatement.class);
		return table;
	}

	public Object visitTableRelation(TableRelation ast, Object data)
			throws Throwable {
		if(DEBUG) enter(TableRelation.class);
		if(DEBUG) exit(TableRelation.class);
		return null;
	}

	public Object visitTableRelationStatement(TableRelationStatement ast,
			Object data) throws Throwable {
		if(DEBUG) enter(TableRelationStatement.class);
		if(ast.getPrimaryTable()!=null)
			ast.getPrimaryTable().accept(this, data);
		if(ast.getTableRelation()!=null)
			ast.getTableRelation().accept(this, data);
		if(DEBUG) exit(TableRelationStatement.class);
		return null;
	}

	public Object visitWhereStatement(WhereStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(WhereStatement.class);
		if(ast.getConditionExpression()!=null) {
			this.detectConditionExpression(ast.getConditionExpression(), data);
		}
		if(DEBUG) exit(WhereStatement.class);
		return null;
	}

	public Object visitHierarchyPredicate(HierarchyPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(HierarchyPredicate.class);
		if(ast.getPrimaryTable()!=null) {
			try {
				ast.getPrimaryTable().accept(this, data);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(ast.getSecondaryTable()!=null) {
			try {
				ast.getSecondaryTable().accept(this, data);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(DEBUG) exit(HierarchyPredicate.class);
		return null;
	}

	public ISqlTypeDefine visitColumnCallExpression(ColumnCallExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(ColumnCallExpression.class);
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
		if(DEBUG) exit(ColumnCallExpression.class);
		return null;
	}

	public ISqlTypeDefine visitColumnReference(ColumnReference ast, Object data)
			throws Throwable {
		if(DEBUG) enter(ColumnReference.class);
		if(DEBUG) exit(ColumnReference.class);
		return null;
	}
	
	public ISqlTypeDefine visitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(HierarchyFunCallExpression.class);
		if(ast.getTableRefReference()!=null) {
			try {
				ast.getTableRefReference().accept(this, data);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(ast.getPrimary()!=null) {
			this.detectValueExpression(ast.getPrimary(), data);
		}
//		if(HierarchyFunCallExpression.HFC_NAME_H_LV.equalsIgnoreCase(ast.getFunctionName())) {
//			type=(ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast);
//		} else if(HierarchyFunCallExpression.HFC_NAME_H_AID.equalsIgnoreCase(ast.getFunctionName())) {
//			type=(ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_GUID, DataKinds.SQL_TYPE_DEFINE, null, ast);
//		}
		if(DEBUG) exit(HierarchyFunCallExpression.class);
		return type;
	}

	protected Object detectQueryDeclaration(QueryDeclarationBase ast, Object data)
			throws Throwable {
		if(ast.getArguments()!=null) {
			for(ArgumentDeclaration argu : ast.getArguments()) {
				try {
					if(argu!=null)
						argu.accept(this, data);
				} catch (Throwable e) {
					report(e, ast);
				}
			}
		}
		return detectQueryStatement(ast,data);
	}
	
	protected Object detectQueryStatement(QueryStatementBase ast,  Object data) 
			throws Throwable {
		Object obj= null;
		try {
			if(ast.getFrom()!=null) ast.getFrom().accept(this, data);
		} catch (Throwable e) { report(e, ast); }
		try { if(ast.getWhere()!=null) ast.getWhere().accept(this, data); }
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getGroup()!=null) ast.getGroup().accept(this, data); } 
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getHaving()!=null) ast.getHaving().accept(this, data); } 
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getOrder()!=null) ast.getOrder().accept(this, data); } 
		catch (Throwable e) { report(e, ast); }
		try {
			if(ast.getSelect()!=null) 
				obj = ast.getSelect().accept(this, data);
		}  catch (Throwable e) { report(e, ast); }
		return obj;
	}

	public Object visitQueryStatement(QueryStatement ast, Object data)
			throws Throwable {
		Object obj;
		if(DEBUG) enter(QueryStatement.class);
		obj=detectQueryStatement(ast,data);
		if(DEBUG) exit(QueryStatement.class);
		return obj;
	}

	public Object visitUnionStatement(UnionStatement ast, Object data)
			throws Throwable {
		Object obj;
		if(DEBUG) enter(UnionStatement.class);
		obj=detectQueryStatement(ast,data);
		if(DEBUG) exit(UnionStatement.class);
		return obj;
	}

	public Object visitWithStatement(WithStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(WithStatement.class);
		if(ast.getSubquerys()!=null) {
			for(SubQueryStatement sub : ast.getSubquerys()) {
				if(sub!=null) {
					sub.accept(this, data);
				}
			}
		}
		if(DEBUG) exit(WithStatement.class);
		return null;
	}

	public ISqlTypeDefine visitValueQueryExpression(ValueQueryExpression ast,
			Object data) throws Throwable {
		if(DEBUG) enter(WithStatement.class);
		if(ast.getSubquery()!=null) {
			ast.getSubquery().accept(this, data);
		}
		if(DEBUG) exit(WithStatement.class);
		return null;
	}

	public Object visitSubQueryReference(SubQueryReference ast, Object data)
			throws Throwable {
		if(DEBUG) enter(SubQueryReference.class);
		if(ast.getSubquery()!=null) {
			ast.getSubquery().accept(this, data);
		}
		if(DEBUG) exit(SubQueryReference.class);
		return null;
	}

	public Object visitExistsPredicate(ExistsPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(ExistsPredicate.class);
		if(ast.getSubquery()!=null) {
			ast.getSubquery().accept(this, data);
		}
		if(DEBUG) exit(ExistsPredicate.class);
		return null;
	}

}
