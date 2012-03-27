/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;


import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDescriptor;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.analysis.internal.util.CompletionUtil;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
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
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;
import org.eclipse.jt.sql.assist.core.data.DataKinds;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.adaptor.QueryAsTableAdaptor;
import org.eclipse.jt.sql.assist.core.data.adaptor.SubQueryAsQueryDefineAdaptor;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableRelationDefine;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;


/**
 * @author Jeff Tang
 *
 */
public abstract class QueryCompletionDetector<TScope extends AbstractQueryDataScope<TScope>> extends GeneralCompletionDetector<TScope>
		implements IQueryAstVisitor<Object, Boolean>,
			IQueryConditionVisitor<Object, Boolean>,
			IQueryValueVisitor<Object, Boolean> {

	public static final class RealQueryCompletionDetector extends QueryCompletionDetector<QueryDataScope> {

		public static RealQueryCompletionDetector getInstance() {
			return new RealQueryCompletionDetector();
		}
		
		private RealQueryCompletionDetector() {}
		
		@Override
		protected QueryDataScope createDefaultScope() {
			return QueryDataScope.getInstance();
		}
		
	}
	
	public static QueryCompletionDetector<?> getInstance() {
		return new RealQueryCompletionDetector();
	}

	
	protected QueryCompletionDetector() {}
	
//	/**
//	 * 如果TScope不是QueryDataScope，必需重写该方法
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	protected TScope createDefaultScope() {
//		return (TScope) (QueryDataScope) QueryDataScope.getInstance(QueryDataScope.class);
//	}
//	
//	protected TableDefine getTableDefine(String alias,IAstNode node,Boolean forceIgnore) throws Throwable {
//		TableDefine table=null;
//		DataReference<ITableReference, TableDefine> tableRefable=fScope.getTableReference(alias);
//			if(tableRefable!=null) {
//				String target=null;
//				if(tableRefable.data!=null) {
//					table=tableRefable.data;
//				} else if(tableRefable.ast instanceof TableReference) {
//					target=((TableReference)tableRefable.ast).getTargetName();
//					table=loadTable(target, tableRefable.ast, null, forceIgnore);
//					tableRefable.data=table;
//				} else if(tableRefable.ast instanceof TableRelation) {
//					TableRelation relation=(TableRelation)tableRefable.ast;
//					if(relation.getTableRefReference()!=null) {
//						target=relation.getTableRefReference().getTargetName();
//						TableRelationDefine trd=loadRelation(target,relation.getTargetName(),relation,forceIgnore);
//						if(trd!=null) table=trd.getTarget();
//						tableRefable.data=table;
//					}
//				}
//			}
//		return table;
//	}
//	
//	protected TableRelationDefine loadRelation(String tableAlias, String relation, IAstNode node, Boolean forceIgnore) throws Throwable {
//		TableRelationDefine trd=null;
//		try {
//			TableDefine pri=getTableDefine(tableAlias, node, forceIgnore);
//			if(pri!=null) {
//				trd=pri.getRelations().find(relation);
//			}
//		} catch (Throwable e) {
//			report(e, node);
//		}
//		return trd;
//	}
//	
//	protected TableDefine loadTable(String name, IAstNode node, Map<String, String> configs, Boolean forceIgnore) throws Throwable {
//		Object obj=null;
//		try {
//			WarningsCollector<IWarnings> wCollector=new WarningsCollector<IWarnings>(fWarnings);
//			obj=fDataLoader.loadData(name, DnaSql.TABLE_DEFINE, configs, wCollector);
//			processDataLoaderReports(wCollector.getReports(), node, name, DnaSql.TABLE_DEFINE);
//		} catch (MissingObjectException e) {
//		} catch (LoadDataFailedException e) {
//		} catch (Throwable e) {
//			report(e, node);
//		}
//		if(obj instanceof TableDefine) {
//			return (TableDefine) obj;
//		} else {
//			return null;
//		}
//	}


	protected ITableRelationDefine getRelationDefine(String tableAlias, String relation, IAstNode node, Boolean forceIgnore) throws Throwable {
		ITableRelationDefine trd=null;
		try {
			ITableDefine pri=getTableDefine(tableAlias, node, forceIgnore);
			if(pri!=null) {
				trd=pri.getRelation(relation);
			}
		} catch (Throwable e) {
			return null;
		}
		return trd;
	}
	
	protected ITableDefine getTableDefine(String alias, IAstNode node, Boolean forceIgnore) throws Throwable {
		ITableDefine table=null;
		DataReference<IResultSetReference, ITableDefine> tableRefable=fScope.getTableReference(alias);
		if(tableRefable!=null) {
			String target=null;
			if(tableRefable.data!=null) {
				table=tableRefable.data;
			} else if(tableRefable.ast instanceof TableReference) {
				target=((TableReference)tableRefable.ast).getTargetName();
				if(target!=null) {
					table=(ITableDefine) getData(target, DataKinds.TABLE_DEFINE, null, tableRefable.ast);
					tableRefable.data=table;
				}
			} else if(tableRefable.ast instanceof TableRelation) {
				TableRelation relation=(TableRelation)tableRefable.ast;
				if(relation.getTableRefReference()!=null) {
					target=relation.getTableRefReference().getTargetName();
					ITableRelationDefine trd=getRelationDefine(target,relation.getTargetName(),relation,forceIgnore);
					if(trd!=null) table=trd.getTarget();
					tableRefable.data=table;
				}
			}
		}
		return table;
	}
//	
//	protected String getTableTargetName(String alias) {
//		if(alias!=null) {
//			DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(alias);
//			if(refable!=null && refable.ast !=null)
//				return refable.ast.getTargetName();
//		}
//		return null;
//	}
	
	@Override
	protected Object completionValueExpression(ValueExpression ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, forceIgnore);
		} else {
			return super.completionValueExpression(ast, forceIgnore);
		}
	}

	@Override
	protected Object completionConditionExpression(ConditionExpression ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IQueryConditionNode) {
			return ((IQueryConditionNode)ast).accept(this, forceIgnore);
		} else {
			return super.completionConditionExpression(ast, forceIgnore);
		}
	}
	
	@Override
	protected void completionInPredicate(RelationPredicate ast, Boolean forceIgnore)
			throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, forceIgnore);
		} else {
			super.completionInPredicate(ast, forceIgnore);
		}
	}
	
	@Override
	protected void completionComparePredicate(RelationPredicate ast,
			Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, forceIgnore);
		} else {
			super.completionComparePredicate(ast, forceIgnore);
		}
	}
	
	@Override
	protected void completionEqualPredicate(RelationPredicate ast,
			Boolean forceIgnore) throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			((SubQueryStatement)ast.getUncertainOperand()).accept(this, forceIgnore);
		} else {
			super.completionEqualPredicate(ast, forceIgnore);
		}
	}

	@Override
	public Object visitGeneral(IAstNode ast, Boolean forceIgnore) throws Throwable {
		if(ast instanceof IQueryAstNode) {
			return ((IQueryAstNode)ast).accept(this, forceIgnore);
		} else if(ast instanceof IQueryConditionNode) {
			return ((IQueryConditionNode)ast).accept(this, forceIgnore);
		} else if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, forceIgnore);
		} else {
			return super.visitGeneral(ast, forceIgnore);
		}
	}

	public Object visitDerivedColumn(DerivedColumn ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(DerivedColumn.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(DEBUG) exit(DerivedColumn.class);
		return null;
	}

	public Object visitSelectStatement(SelectStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(SelectStatement.class);
		List<DerivedColumn> list=ast.getDerivedColumns();
		if(list!=null && list.size()!=0) {
			int rear=ast.getPosition().getStart()+SelectStatement.SELECT_WORD.length();
			int last=rear+1;
			for(DerivedColumn column:list) {
				try {
					if(column!=null) {
						column.accept(this, forceIgnore);
						rear=column.getPosition().getEnd();
						last=passChar(rear,',', false);
					} else if(!isIgnored(KIND_ANY, forceIgnore)&& rear!=last && isVan(last)) {
						this.assitValues(null, column, null);
					}
				} catch (Throwable e) {
					report(e,column);
				}
			}
		} else if(!isIgnored(KIND_ANY, forceIgnore) && isVan(ast)) {
			assitValues(null, ast, null);
		}
		if(DEBUG) exit(SelectStatement.class);
		return null;
	}

	public Object visitFromStatement(FromStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(FromStatement.class);
		List<TableReferenceStatement> list = ast.getTableReferences();
		if(list!=null && list.size()!=0) {
			int rear=ast.getPosition().getStart()+FromStatement.FROM_WORD.length();
			int last=rear+1;
			for(TableReferenceStatement table:list) {
				try {
					if(table!=null) { 
						table.accept(this, forceIgnore);
						rear=table.getPosition().getEnd();
						last=passChar(rear,',', false);
					} else if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore)&& rear!=last && isVan(last)) {
						this.assitTableDefines(null, table, null);
					}
				} catch (Throwable e) {
					report(e,table);
				}
			}
		} else if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore) && isVan(ast)) {
			assitTableDefines(null, ast, null);
		}
		if(DEBUG) exit(FromStatement.class);
		return null;
	}

	public Object visitGroupColumn(GroupColumn ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(GroupColumn.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(DEBUG) exit(GroupColumn.class);
		return null;
	}

	public Object visitGroupStatement(GroupStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(GroupStatement.class);
		if(ast.getGroupColumns()!=null) {
			for(GroupColumn column:ast.getGroupColumns()) {
				try {
					if(column!=null) column.accept(this, forceIgnore);
				} catch (Throwable e) {
					report(e,column);
				}
			}
		}
		if(DEBUG) exit(GroupStatement.class);
		return null;
	}

	public Object visitHavingStatement(HavingStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(HavingStatement.class);
		if(ast.getConditionExpression()!=null) {
			this.completionConditionExpression(ast.getConditionExpression(),forceIgnore);
		} else if(!isIgnored(KIND_ANY, forceIgnore) && isVan(ast)){
			this.assitValues(null, ast, null);
		}
		if(DEBUG) exit(HavingStatement.class);
		return null;
	}

	public Object visitOrderExpression(OrderExpression ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(OrderExpression.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(DEBUG) exit(OrderExpression.class);
		return null;
	}

	public Object visitOrderStatement(OrderStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(OrderStatement.class);
		if(ast.getOrders()!=null) {
			for(OrderExpression order:ast.getOrders()) {
				try {
					if(order!=null) order.accept(this, forceIgnore);
				} catch (Throwable e) {
					report(e,order);
				}
			}
		}
		if(DEBUG) exit(OrderStatement.class);
		return null;
	}

	public Object visitQueryDeclaration(QueryDeclaration ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(QueryDeclaration.class);
		try {
			this.completionQueryDeclaration(ast, forceIgnore);
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(QueryDeclaration.class);
		return null;
	}

	public Object visitSubQueryStatement(SubQueryStatement ast, Boolean forceIgnore)
			throws Throwable {
		Object obj= null;
		if(DEBUG) enter(SubQueryStatement.class);
		TScope parent=fScope;
		fScope=(TScope) fScope.createSubScope();
		try {
			obj = this.completionQueryStatement(ast,forceIgnore);
		} finally {
			fScope=(TScope) parent;
		}
		if(DEBUG) exit(SubQueryStatement.class);
		return obj;
	}

	public Object visitQueryStatement(QueryStatement ast, Boolean forceIgnore)
			throws Throwable {
		Object obj;
		if(DEBUG) enter(QueryStatement.class);
		obj=completionQueryStatement(ast, forceIgnore);
		if(DEBUG) exit(QueryStatement.class);
		return obj;
	}
	
	public Object visitUnionStatement(UnionStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(UnionStatement.class);
		TScope parent=fScope;
		fScope=(TScope) fScope.createSubScope();
		try {
			this.completionQueryStatement(ast,forceIgnore);
		} finally {
			fScope=(TScope) parent;
		}
		if(DEBUG) exit(UnionStatement.class);
		return null;
	}

	public Object visitTableJoinStatement(TableJoinStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(TableJoinStatement.class);
		if(ast.getPrimaryTable()!=null)
			ast.getPrimaryTable().accept(this, forceIgnore);
		else if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore) && isRear(ast)) {
			// 正常情况下，此处无法到达。因为当前语法不会出现join语句的主表引用为null的情况（ by Jeff.Tang，2009-05-05）
			// 若脚本中join语句的主表引用解析失败，则整个join语句为null
			this.assitTableDefines(null, null, null);
		}
		if(ast.getSecondaryTable()!=null)
			ast.getSecondaryTable().accept(this, forceIgnore);
		else if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore) 
				&& ast.getJoinPosition()!=null && isVan(ast.getJoinPosition().getEnd()+1)) {
			this.assitTableDefines(null, null, null);
		}
		if(ast.getCondition()!=null)
			this.completionConditionExpression(ast.getCondition(), forceIgnore);
		if(DEBUG) exit(TableJoinStatement.class);
		return null;
	}

	public Object visitTableReference(TableReference ast, Boolean forceIgnore)
			throws Throwable {
		ITableDefine table=null;
		if(DEBUG) enter(TableReference.class);
		if(ast.getTargetName()!=null && ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
			try {
				DataReference<SubQueryStatement, IQueryDefine> ref = fScope.getWith(ast.getTargetName());
				if(ref!=null && ref.data!=null) {
					table = new QueryAsTableAdaptor(ref.data);
				}
				if(table == null) {
					table=(ITableDefine) getData(ast.getTargetName(), DataKinds.TABLE_DEFINE, null, ast);
				}
				fScope.getTableReferences(true).put(ast.getAlias().getTexture(), new DataReference<IResultSetReference, ITableDefine>(ast,table));
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore)) {
			if(ast.getTargetName()!=null 
					&& isSurround(ast.getPosition().getStart(),
							ast.getPosition().getStart()+ast.getTargetName().length())) {
				String prefix=null;
				if(ast.getTargetName()!=null && fPosition > ast.getPosition().getStart()) {
					prefix=ast.getTargetName().substring(0,fPosition-ast.getPosition().getStart());
					prefix=prefix.toUpperCase();
				}
				this.assitTableDefines(prefix, null, 
						new SourcePosition(ast.getPosition().getStart(),
								ast.getPosition().getStart()+ast.getTargetName().length()));
			} else if(ast.getTargetName()==null 
					&& isNewStart(fPosition)) {
				int here=ast.getPosition().getStart()-1;
				int back=backString(here, "as", true);
				if(here!=back && (back+1==fPosition || isRear(back)))
					this.assitTableDefines(null, null, null);
			}
		}
		if(DEBUG) exit(TableReference.class);
		return table;
	}

	public Object visitTableReferenceStatement(TableReferenceStatement ast,
			Boolean forceIgnore) throws Throwable {
		Object table=null;
		if(DEBUG) enter(TableReferenceStatement.class);
		if(ast.getPrimaryTable()!=null) {
			table=ast.getPrimaryTable().accept(this, forceIgnore);
		}
		if(DEBUG) exit(TableReferenceStatement.class);
		return table;
	}

	public Object visitTableRelation(TableRelation ast, Boolean forceIgnore)
			throws Throwable {
		ITableRelationDefine relation=null;
		if(DEBUG) enter(TableRelation.class);
		try {
			if(ast.getTableRefReference()!=null&&ast.getTargetName()!=null) {
				relation=getRelationDefine(ast.getTableRefReference().getTargetName(),  ast.getTargetName(), ast, forceIgnore);
			}
			if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
				fScope.getTableReferences(true).put(ast.getAlias().getTexture(), new DataReference<IResultSetReference, ITableDefine>(ast,relation!=null?relation.getTarget():null));
			}
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(TableRelation.class);
		return relation;
	}

	public Object visitTableRelationStatement(TableRelationStatement ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(TableRelationStatement.class);
		if(ast.getPrimaryTable()!=null)
			ast.getPrimaryTable().accept(this, forceIgnore);
		else if(!isIgnored(KIND_TABLE_DEFINE, forceIgnore) && isRear(ast)) {
			this.assitTableDefines(null, null, null);
		}
		if(ast.getTableRelation()!=null)
			ast.getTableRelation().accept(this, forceIgnore);
		if(DEBUG) exit(TableRelationStatement.class);
		return null;
	}

	public Object visitWhereStatement(WhereStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(WhereStatement.class);
		if(ast.getConditionExpression()!=null) {
			this.completionConditionExpression(ast.getConditionExpression(), forceIgnore);
		} else if(!isIgnored(KIND_ANY, forceIgnore) && isVan(ast)){
			this.assitValues(null, ast, null);
		}
		if(DEBUG) exit(WhereStatement.class);
		return null;
	}

	public Object visitHierarchyPredicate(HierarchyPredicate ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(HierarchyPredicate.class);
		if(ast.getPrimaryTable()!=null) {
			try {
				ast.getPrimaryTable().accept(this, forceIgnore);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(ast.getSecondaryTable()!=null) {
			try {
				ast.getSecondaryTable().accept(this, forceIgnore);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(DEBUG) exit(HierarchyPredicate.class);
		return null;
	}
	
	public Object visitExistsPredicate(ExistsPredicate ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(ExistsPredicate.class);
		if(ast.getSubquery()!=null) {
			try {
				ast.getSubquery().accept(this, forceIgnore);
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(DEBUG) exit(ExistsPredicate.class);
		return null;
	}

	public Object visitColumnCallExpression(ColumnCallExpression ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(ColumnCallExpression.class);
		if(ast.getPrimary()!=null) {
			this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(DEBUG) exit(ColumnCallExpression.class);
		return null;
	}

	public Object visitColumnReference(ColumnReference ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(ColumnReference.class);
		if(ast.getTableRefReference()!=null) {
			ast.getTableRefReference().accept(this, forceIgnore);
		}
		if(!isIgnored(KIND_COLUMN_REFERENCE, forceIgnore) && isSurround(ast) 
				&& ast.getTableRefReference()!=null && !isSurround(ast.getTableRefReference()) ) {
			try {
				String prefix=null;
				if(ast.getColumnName()!=null && fPosition > ast.getColumnPosition().getStart()) {
					prefix=ast.getColumnName().substring(0,fPosition-ast.getColumnPosition().getStart());
					prefix=prefix.toUpperCase();
				}
				ITableDefine table=getTableDefine(ast.getTableRefReference().getTargetName(),ast, forceIgnore);
				if(table!=null) {
					ISqlFieldDefine[] fields = table.getFields();
					if(fields!=null) {
						for(ISqlFieldDefine field : fields) {
							if(field!=null && (prefix==null || field.getName().toUpperCase().startsWith(prefix) )) {
								String type = field.getSqlType()!=null? field.getSqlType().getName() : null;
								assitColumnReference(field.getName(), type, null,ast.getColumnPosition(), CompletionUtil.getDescription(field));
							}
						}
					}
				}
			} catch (Throwable e) {
				report(e, ast);
			}
		}
		if(DEBUG) exit(ColumnReference.class);
		return null;
	}


	public ISqlTypeDefine visitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, Boolean forceIgnore) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(HierarchyFunCallExpression.class);
		//String tableName=null;
		if(ast.getTableRefReference()!=null) {
			try {
				ast.getTableRefReference().accept(this, forceIgnore);
				//tableName=getTableTargetName(ast.getTableRefReference().getTargetName());
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(/*tableName!=null &&*/ast.getHierarchyName()!=null) {
			//TableDefine table=loadTable(tableName,ast,data);
			//if(table!=null && table.getHierarchies().find(ast.getHierarchyName())==null) {
			//	error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{tableName},
			//			"the using hierachy ["+ast.getHierarchyName()+"] is not exist in target table ["+tableName+"].", ast);
			//}
		}
		if(ast.getPrimary()!=null) {
			/*Object relType=*/this.completionValueExpression(ast.getPrimary(), forceIgnore);
		}
		if(HierarchyFunCallExpression.HFC_NAME_H_LV.equalsIgnoreCase(ast.getFunctionName())) {
			type=(ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast);
		} else if(HierarchyFunCallExpression.HFC_NAME_H_AID.equalsIgnoreCase(ast.getFunctionName())) {
			type=(ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_GUID, DataKinds.SQL_TYPE_DEFINE, null, ast);
		} else {
			type=null;
			//fatal("unknown hierarchy function name ["+ast.getFunctionName()+"]");
		}
		if(DEBUG) exit(HierarchyFunCallExpression.class);
		return type;
	}

	@SuppressWarnings("unchecked")
	public Object visitWithStatement(WithStatement ast, Boolean forceIgnore)
			throws Throwable {
		if(DEBUG) enter(WithStatement.class);
		if(ast.getSubquerys()!=null) {
			for(SubQueryStatement subQuery : ast.getSubquerys()) {
				if(subQuery==null) continue;
				try {

					List<ISqlTypeDefine> columnTypes = (List<ISqlTypeDefine>) subQuery.accept(this, forceIgnore);
					if(subQuery.getAlias()!=null && subQuery.getAlias().getTexture()!=null) {
						String name = subQuery.getAlias().getTexture();
						ReferencedDataMap<SubQueryStatement, IQueryDefine> subMap = fScope.getWiths(true);
						
						ISqlTypeDefine[] stds = null;
						if(columnTypes!=null) {
							stds = columnTypes.toArray(new ISqlTypeDefine[columnTypes.size()]);
						}
						SubQueryAsQueryDefineAdaptor adaptor = new SubQueryAsQueryDefineAdaptor(name, subQuery, stds);
						DataReference<SubQueryStatement, IQueryDefine> ref = 
							new DataReference<SubQueryStatement, IQueryDefine>(subQuery, adaptor);
						subMap.put(name, ref);
					}
					
//					
//					subQuery.accept(this, forceIgnore);
//					if(subQuery.getAlias()!=null && subQuery.getAlias().getTexture()!=null) {
//
//						DataReference<SubQueryStatement, IQueryDefine> ref = 
//							new DataReference<SubQueryStatement, IQueryDefine>(subQuery);
//						fScope.getWiths(true).put(subQuery.getAlias().getTexture(), ref);
//					}
				} catch (Throwable e) {
					report(e, subQuery);
				}
			}
		}
		if(DEBUG) exit(WithStatement.class);
		return null;
	}

	public Object visitValueQueryExpression(ValueQueryExpression ast,
			Boolean forceIgnore) throws Throwable {
		if(DEBUG) enter(ValueQueryExpression.class);
		if(ast.getSubquery()!=null) {
			ast.getSubquery().accept(this, forceIgnore);
		}
		if(DEBUG) exit(ValueQueryExpression.class);
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public Object visitSubQueryReference(SubQueryReference ast, Boolean forceIgnore)
			throws Throwable {

		ITableDefine table=null;
		if(DEBUG) enter(SubQueryReference.class);
		try {
			if(ast.getSubquery()!=null) {
				
				IQueryDefine queryDefine = null;
				
				SubQueryStatement sub = ast.getSubquery();
				List<ISqlTypeDefine> columnTypes = (List<ISqlTypeDefine>) sub.accept(this, forceIgnore);
				

				String name = ast.getAlias().getTexture();
				
				ISqlTypeDefine[] stds = null;
				if(columnTypes!=null) {
					stds = columnTypes.toArray(new ISqlTypeDefine[columnTypes.size()]);
				}
				queryDefine = new SubQueryAsQueryDefineAdaptor(name, sub, stds);

				table = new QueryAsTableAdaptor(queryDefine);
				
//				if(table==null) {
//					error(KIND_TABLE_REFERENCE_NOT_EXIST, new String [] {}, "Cannot find table ["+ast.getTargetName()+"]", ast);
//				}
			}
			if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
				fScope.getTableReferences(true).put(ast.getAlias().getTexture(), new DataReference<IResultSetReference, ITableDefine>(ast,table));
			}
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(SubQueryReference.class);
		return table;
	}

	protected Object completionQueryDeclaration(QueryDeclarationBase ast, Boolean forceIgnore)
			throws Throwable {
		if(ast.getArguments()!=null) {
			for(ArgumentDeclaration argu : ast.getArguments()) {
				try {
					if (argu!=null)
						argu.accept(this, forceIgnore);
				} catch (Throwable e) {
					report(e, ast);
				}
			}
		}
		if(ast.getWith()!=null) {
			ast.getWith().accept(this, forceIgnore);
		}
		return completionQueryStatement(ast,forceIgnore);
	}
	
	protected Object completionQueryStatement(QueryStatementBase ast,  Boolean forceIgnore) 
			throws Throwable {
		Object obj = null;
		
		try {
			if(ast.getFrom()!=null) ast.getFrom().accept(this, !isSurround(ast.getFrom())&&!isVan(ast.getFrom()));
		} catch (Throwable e) { report(e, ast); }
		try { if(ast.getWhere()!=null) ast.getWhere().accept(this, !isSurround(ast.getWhere())&&!isVan(ast.getWhere())); }
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getGroup()!=null) ast.getGroup().accept(this, !isSurround(ast.getGroup())&&!isVan(ast.getGroup())); } 
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getHaving()!=null) ast.getHaving().accept(this, !isSurround(ast.getHaving())&&!isVan(ast.getHaving())); } 
		catch (Throwable e) { report(e, ast); }
		try { if(ast.getOrder()!=null) ast.getOrder().accept(this, !isSurround(ast.getOrder())&&!isVan(ast.getOrder())); } 
		catch (Throwable e) { report(e, ast); }
		try {
			if(ast.getSelect()!=null) 
				obj = ast.getSelect().accept(this, !isSurround(ast.getSelect())&&!isVan(ast.getSelect()));
		}  catch (Throwable e) { report(e, ast); }

		if(ast.getUnions()!=null) {
			for(UnionStatement union : ast.getUnions()) {
				if(union!=null) {
					try { union.accept(this, forceIgnore); } 
					catch (Throwable e) { report(e, ast); }
				}
			}
		}
		return obj;
	}
	
	@Override
	protected void assitValues(String prefix, IAstNode node,
			ISourcePosition replace) {
		super.assitValues(prefix, node, replace);
	}

	protected void assitTableDefines(String prefix, IAstNode node, ISourcePosition replace) {
		if(fDataLoader!=null) {
			IDataDescriptor[] descs = fDataLoader.listDescriptors(prefix, DnaSql.TABLE_DEFINE, null);
			if(descs!=null) {
				for(int i=0;i<descs.length;i++) {
					assitTableDefine(descs[i].getID(),node, replace, descs[i].getDescription(),descs[i].getSource());
					if(DEBUG) debug("assit table define ["+descs[i].getID()+"]");
				}
			}
		} else {
			if(DEBUG) debug("data loader is null!");
		}
	}
	
	protected void assitTableDefine(String name, IAstNode node,ISourcePosition replace, String description, Object source) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name,null,source) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_TABLE_DEFINE; }
		});
	}
	
	protected void assitColumnReference(String name, String type, IAstNode node,ISourcePosition replace, String description) {
		assit(new AbstractCompletionProposal(name,node,fPosition,replace,description,name,type) {
			public int getFlags() { return FLAG_NONE; }
			public int getKind() { return KIND_COLUMN_REFERENCE; }
		});
	}
}
