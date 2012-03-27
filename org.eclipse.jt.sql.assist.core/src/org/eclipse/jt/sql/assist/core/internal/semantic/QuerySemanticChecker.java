/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.internal.semantic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.external.ITableReference;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.IArgumentContainer;
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
import org.eclipse.jt.sql.assist.core.data.ReferencedDataList;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.adaptor.QueryAsTableAdaptor;
import org.eclipse.jt.sql.assist.core.data.adaptor.SubQueryAsQueryDefineAdaptor;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableRelationDefine;
import org.eclipse.jt.sql.assist.core.internal.util.SemanticUtil;


/**
 * @author Jeff Tang
 *
 */
public abstract class QuerySemanticChecker<TScope extends AbstractQueryDataScope<TScope>> extends GeneralSemanticChecker<TScope>
		implements IQueryAstVisitor<Object, Object>,
				   IQueryConditionVisitor<Object, Object>,
				   IQueryValueVisitor<ISqlTypeDefine, Object> {
	
	public static final class RealQuerySemanticChecker extends QuerySemanticChecker<QueryDataScope> {

		public static final RealQuerySemanticChecker getInstance() {
			return new RealQuerySemanticChecker();
		}
		
		private RealQuerySemanticChecker() {}
		
		@Override
		protected final QueryDataScope createDefaultScope() {
			return QueryDataScope.getInstance();
		}

		protected final QueryDataScope convertScope(IDataScope<?> dataScope) {
			if(dataScope==null)
				throw new IllegalArgumentException("Argument dataScope cannot be null!");
			if(dataScope instanceof QueryDataScope) {
				return (QueryDataScope)dataScope;
			} else {
				throw new IllegalArgumentException(
						"Data scope of class 'QueryDataScope' expected, not '"
						+dataScope.getClass().getName()+"'.");
			}
		}
	}
	
	public static QuerySemanticChecker<?> getInstance() {
		return new RealQuerySemanticChecker();
	}
	
	protected QuerySemanticChecker() {}
	
	
	@Override
	protected void clean() {
		super.clean();
	}

	
	protected ITableRelationDefine getRelationDefine(String tableAlias, String relation, IAstNode node, Object data) throws Throwable {
		ITableRelationDefine trd=null;
		try {
			ITableDefine pri=getTableDefine(tableAlias, node, data);
			if(pri!=null) {
				trd=pri.getRelation(relation);
			}
		} catch (Throwable e) {
			return null;
		}
		return trd;
	}
	
	protected ITableDefine getTableDefine(String alias, IAstNode node, Object data) throws Throwable {
		ITableDefine table=null;
		DataReference<IResultSetReference, ITableDefine> tableRefable=fScope.getTableReference(alias);
		if(tableRefable!=null) {
			String target=null;
			if(tableRefable.data!=null) {
				table=tableRefable.data;
			} else if(tableRefable.ast instanceof TableReference) {
				target=((TableReference)tableRefable.ast).getTargetName();
				if(target!=null) {
					table=(ITableDefine) getData(target, DataKinds.TABLE_DEFINE, null, tableRefable.ast, null);
					tableRefable.data=table;
				}
			} else if(tableRefable.ast instanceof TableRelation) {
				TableRelation relation=(TableRelation)tableRefable.ast;
				if(relation.getTableRefReference()!=null) {
					target=relation.getTableRefReference().getTargetName();
					ITableRelationDefine trd=getRelationDefine(target,relation.getTargetName(),relation,data);
					if(trd!=null) table=trd.getTarget();
					tableRefable.data=table;
				}
			}
		}
		return table;
	}
	
	protected String getTableTargetName(String alias) {
		if(alias!=null) {
			DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(alias);
			if(refable!=null && (refable.ast instanceof ITableReference))
				return ((ITableReference)refable.ast).getTargetName();
		}
		return null;
	}
	
	protected String checkHierarchyTableReference(String alias, IAstNode ast) {

		if(alias!=null) {
			DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(alias);
			if(refable!=null) {
				if((refable.ast instanceof ITableReference) && !refable.data.isDynamicResult()) {
					return ((ITableReference)refable.ast).getTargetName();
				} else {
					error(KIND_BAD_HIERARCHY_PREDICATE, new String[] {alias}, 
							"table reference for hierarchy predicate must directly reference to table define",
							ast);
				}
			}
		}
		return null;
	}
	
	protected void markReferenceToTable(String alias) {
		if(alias!=null) {
			DataReference<IResultSetReference, ITableDefine> refable=fScope.getTableReference(alias);
			if(refable!=null) refable.ref++;
		}
	}
	
	@Override
	protected Object checkConditionExpression(ConditionExpression ast,
			Object data) throws Throwable {
		if(ast instanceof IQueryConditionNode) {
			return ((IQueryConditionNode)ast).accept(this, data);
		} else {
			return super.checkConditionExpression(ast, data);
		}
	}
	
	@Override
	protected ISqlTypeDefine checkValueExpression(ValueExpression ast, Object data)
			throws Throwable {
		if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, data);
		} else {
			return super.checkValueExpression(ast, data);
		}
	}
	
	@Override
	protected Object checkInPredicate(ISqlTypeDefine primaryType,
			RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			List<?> resultTypes=(List<?>) ((SubQueryStatement)ast.getUncertainOperand()).accept(this, data);
			if(resultTypes!=null && primaryType!=null) {
				if(resultTypes.size()>1) {
					error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
							"too many sub query result for in predicate",ast.getValuePrimary());
				} else if(resultTypes.size()==1 
						&& !SemanticUtil.isAssignable(primaryType, (ISqlTypeDefine)resultTypes.get(0))) {
					warn(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
							"primary value type ["+primaryType.getName()+"] not match the sub query result",ast.getValuePrimary());
				}
			}
			return null;
		} else {
			return super.checkInPredicate(primaryType, ast, data);
		}
	}
	
	@Override
	protected Object checkComparePredicate(ISqlTypeDefine primaryType,
			RelationPredicate ast, Object data) throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			List<?> resultTypes=(List<?>) ((SubQueryStatement)ast.getUncertainOperand()).accept(this, data);
			if(resultTypes!=null && primaryType!=null) {
				if(resultTypes.size()>1) {
					error(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
							"too many sub query result for compare predicate",ast.getValuePrimary());
				} else if(resultTypes.size()==1 
						&& !SemanticUtil.isAssignable(primaryType, (ISqlTypeDefine)resultTypes.get(0))) {
					warn(KIND_TYPE_MISS_MATCH,new String[]{primaryType.toString()},
							"primary value type ["+primaryType.getName()+"] not match the sub query result",ast.getValuePrimary());
				}
			}
			return null;
		} else {
			return super.checkComparePredicate(primaryType, ast, data);
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
		ISqlTypeDefine type=null;
		if(DEBUG) enter(DerivedColumn.class);
		if(ast.getPrimary()!=null) {
			type=this.checkValueExpression(ast.getPrimary(), data);
		}
		if(ast.getAlias()!=null) {
			ReferencedDataList<DerivedColumn, ISqlTypeDefine> columnSet=fScope.getColumns(true);
			if(columnSet.containsKey(ast.getAlias().getTexture())) {
				error(KIND_COLUMN_ALIAS_ALREADY_EXIST,new String[]{ast.getAlias().getTexture()},
						"column alias name already in use",ast);
			} else {
				DataReference<DerivedColumn, ISqlTypeDefine> ref = new DataReference<DerivedColumn, ISqlTypeDefine>(ast, type);
				columnSet.put(ast.getAlias().getTexture(), ref);
			}
		}
		if(DEBUG) exit(DerivedColumn.class);
		return type;
	}

	public Object visitFromStatement(FromStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(FromStatement.class);
		if(ast.getTableReferences()!=null) {
			for(TableReferenceStatement table:ast.getTableReferences()) {
				try {
					if(table!=null) table.accept(this, data);
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
			checkValueExpression(ast.getPrimary(),data);
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
			checkConditionExpression(ast.getConditionExpression(),data);
		}
		if(DEBUG) exit(HavingStatement.class);
		return null;
	}

	public Object visitOrderExpression(OrderExpression ast, Object data)
			throws Throwable {
		if(DEBUG) enter(OrderExpression.class);
		if(ast.getPrimary()!=null) {
			checkValueExpression(ast.getPrimary(),data);
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
		Object columns=null;
		if(DEBUG) enter(QueryDeclaration.class);
		try {
			columns=this.checkQueryDeclaration(ast, data);
		} catch (Throwable e) {
			report(e,ast);
		} finally {
			this.checkTableReferenceUsed();
		}
		if(DEBUG) exit(QueryDeclaration.class);
		return columns;
	}

	public Object visitQueryStatement(QueryStatement ast, Object data)
			throws Throwable {
		Object obj;
		if(DEBUG) enter(QueryStatement.class);
		obj=checkQueryStatement(ast,data);
		if(DEBUG) exit(QueryStatement.class);
		return obj;
	}

	public Object visitUnionStatement(UnionStatement ast, Object data)
			throws Throwable {
		Object columns;
		if(DEBUG) enter(UnionStatement.class);
		TScope parent=fScope;
		TScope subScope = (TScope) fScope.createSubScope();
		fScope = subScope;
		try {
			columns=this.checkQueryStatement(ast,data);
			checkUnion(ast, parent, subScope, columns, data);
		} finally {
			try {
				this.checkTableReferenceUsed();
			} finally {
				fScope=(TScope) parent;
			}
		}
		if(DEBUG) exit(UnionStatement.class);
		return columns;
	}

	public Object visitSelectStatement(SelectStatement ast, Object data)
			throws Throwable {
		List<ISqlTypeDefine> resultTypes=new ArrayList<ISqlTypeDefine>();
		if(DEBUG) enter(SelectStatement.class);
		if(ast.getDerivedColumns()!=null) {
			for(DerivedColumn column:ast.getDerivedColumns()) {
				ISqlTypeDefine type=null;
				if(column!=null)
					type=(ISqlTypeDefine) column.accept(this, data);
				resultTypes.add(type);
			}
		}
		if(DEBUG) exit(SelectStatement.class);
		return resultTypes;
	}

	public Object visitSubQueryStatement(SubQueryStatement ast, Object data)
			throws Throwable {
		Object columns=null;
		if(DEBUG) enter(SubQueryStatement.class);
		TScope parent=fScope;
		fScope=(TScope) fScope.createSubScope();
		try {
			columns=this.checkQueryStatement(ast,data);
		} finally {
			try {
				this.checkTableReferenceUsed();
			} finally {
				fScope=(TScope) parent;
			}
		}
		if(DEBUG) exit(SubQueryStatement.class);
		return columns;
	}

	public Object visitTableJoinStatement(TableJoinStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(TableJoinStatement.class);
		if(ast.getPrimaryTable()!=null)
			ast.getPrimaryTable().accept(this, data);
		if(ast.getSecondaryTable()!=null)
			ast.getSecondaryTable().accept(this, data);
		if(ast.getCondition()!=null)
			this.checkConditionExpression(ast.getCondition(), data);
		if(DEBUG) exit(TableJoinStatement.class);
		return null;
	}

	public Object visitTableReference(TableReference ast, Object data)
			throws Throwable {
		ITableDefine table=null;
		if(DEBUG) enter(TableReference.class);
		try {
			if(ast.getTargetName()!=null) {
				DataReference<SubQueryStatement, IQueryDefine> ref = fScope.getWith(ast.getTargetName());
				if(ref!=null && ref.data!=null) {
					table = new QueryAsTableAdaptor(ref.data);
				}
				if(table == null) {
					table=(ITableDefine) getData(ast.getTargetName(), DataKinds.TABLE_DEFINE, null, ast, null);
				}
				if(table==null) {
					error(KIND_TABLE_REFERENCE_NOT_EXIST, new String [] {}, "Cannot find table ["+ast.getTargetName()+"]", ast);
				}
			}
			if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
				fScope.getTableReferences(true).put(ast.getAlias().getTexture(), new DataReference<IResultSetReference, ITableDefine>(ast,table));
			}
		} catch (Throwable e) {
			report(e,ast);
		}
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
		ITableRelationDefine relation=null;
		if(DEBUG) enter(TableRelation.class);
		try {
			if(ast.getTableRefReference()!=null && ast.getTargetName()!=null) {
				ast.getTableRefReference().accept(this, data);
				relation=getRelationDefine(ast.getTableRefReference().getTargetName(), ast.getTargetName(), ast, data);

				if(relation==null) {
					error(KIND_TABLE_REFERENCE_NOT_EXIST, new String [] {}, "Cannot find relation ["+ast.getTargetName()+"] from table " + ast.getTableRefReference().getTargetName(), ast);
				}
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
			this.checkConditionExpression(ast.getConditionExpression(), data);
		}
		if(DEBUG) exit(WhereStatement.class);
		return null;
	}

	public Object visitHierarchyPredicate(HierarchyPredicate ast, Object data)
			throws Throwable {
		if(DEBUG) enter(HierarchyPredicate.class);
		String primaryTarget=null;
		String secondaryTarget=null;
		if(ast.getPrimaryTable()!=null) {
			try {
				ast.getPrimaryTable().accept(this, data);
				primaryTarget=checkHierarchyTableReference(ast.getPrimaryTable().getTargetName(), ast.getPrimaryTable());
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(ast.getSecondaryTable()!=null) {
			try {
				ast.getSecondaryTable().accept(this, data);
				secondaryTarget=checkHierarchyTableReference(ast.getSecondaryTable().getTargetName(), ast.getSecondaryTable());
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(primaryTarget!=null&&secondaryTarget!=null) {
			if(!primaryTarget.equalsIgnoreCase(secondaryTarget)) {
				error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{primaryTarget,secondaryTarget},
						"operands in hierarchy predicate must reference to the same target table", ast);
			} else if(ast.getHierarchys()!=null) {
				ITableDefine table=(ITableDefine) getData(primaryTarget, DataKinds.TABLE_DEFINE, null, ast, null);
				if(table!=null) {
					TokenNode[] hs = ast.getHierarchys();
					if(hs.length==1) {
						if(table.getHierarchy(hs[0].getTexture())==null) {
							error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{primaryTarget},
									"the using hierachy ["+hs[0].getTexture()+"] is not exist in target table ["+primaryTarget+"].", hs[0]);
						}
					} else if(hs.length==2) {

						if(table.getField(hs[0].getTexture())==null) {
							error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{primaryTarget},
									"the using hierachy path ["+hs[0].getTexture()+"] is not exist in target table ["+primaryTarget+"].", hs[0]);
						}
						if(table.getField(hs[1].getTexture())==null) {
							error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{primaryTarget},
									"the using hierachy path ["+hs[1].getTexture()+"] is not exist in target table ["+primaryTarget+"].", hs[1]);
						}
					} else if(hs.length>2) {
						error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{primaryTarget,secondaryTarget},
								"too many hierarchy parameters for hierarchy predicate", ast);
					}
				}
			}
		}
		if(ast.getLimit()!=null) {
			if(!HierarchyPredicate.OPERATOR_DESCENDANT_OF.equalsIgnoreCase(ast.getOperator())) {
				error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{},
						"hierarchy ["+ast.getOperator()+"] is not supported with the ["+ast.getLimit().getUpperOperator()+"] operation",ast);
			} else {
				ISqlTypeDefine type=this.checkValueExpression(ast.getLimit(), data);
				if(type!=null&&!SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_INTEGER, type)) {
					error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
							"relative value must be a int number",ast.getLimit());
				}
			}
		}
		if(DEBUG) exit(HierarchyPredicate.class);
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

	public ISqlTypeDefine visitColumnCallExpression(ColumnCallExpression ast,
			Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ColumnCallExpression.class);
		if(ast.getPrimary()!=null) {
			type=this.checkValueExpression(ast.getPrimary(), data);
		} 
		if (ColumnCallExpression.FUNCTION_COUNT.equalsIgnoreCase(ast.getFunctionName())) {
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
			if(ast.getPrimary()==null) {
				ReferencedDataMap<IResultSetReference, ITableDefine> tableRefs = this.fScope.getTableReferences(false);
				if(tableRefs!=null) {
					for(String key : tableRefs.keySet()) {
						DataReference<IResultSetReference, ITableDefine> dataRef = tableRefs.get(key);
						
						dataRef.ref++;
					}
				}
			}
		} else if (ColumnCallExpression.FUNCTION_AVG.equalsIgnoreCase(ast.getFunctionName())
				|| ColumnCallExpression.FUNCTION_SUM.equalsIgnoreCase(ast.getFunctionName())
				|| ColumnCallExpression.FUNCTION_MAX.equalsIgnoreCase(ast.getFunctionName())
				|| ColumnCallExpression.FUNCTION_MIN.equalsIgnoreCase(ast.getFunctionName())) {
			if(type!=null && !type.isNumberic()) {
				error(KIND_TYPE_MISS_MATCH,new String[]{type.toString()},
						"parameter of column function '"+ast.getFunctionName()+"' must be a number value.",ast.getPrimary());
			}
		}
		if(DEBUG) exit(ColumnCallExpression.class);
		return type;
	}

	public ISqlTypeDefine visitColumnReference(ColumnReference ast, Object data)
			throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ColumnReference.class);
		try {
			ITableDefine table=null;
			if(ast.getTableRefReference()!=null) {
				ast.getTableRefReference().accept(this, data);
				table=getTableDefine(ast.getTableRefReference().getTargetName(),ast.getTableRefReference(), data);
			}
			if(table!=null && ast.getColumnName()!=null) {
				ISqlFieldDefine field=table.getField(ast.getColumnName());
				if(field!=null) {
					type=field.getSqlType();
					//if(type!=null) type=type.getRootType(); 
				} else {
					error(KIND_FIELD_NOT_EXIST,new String[]{ast.getColumnName()},
							"column ["+ast.getColumnName()+"] does not exist in table ["+table.getName()+"]", ast);
				}
			}
		} catch (Throwable e) {
			report(e, ast);
		}
		if(DEBUG) exit(ColumnReference.class);
		return type;
	}

	public ISqlTypeDefine visitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(HierarchyFunCallExpression.class);
		String tableName=null;
		if(ast.getTableRefReference()!=null) {
			try {
				ast.getTableRefReference().accept(this, data);
				tableName=getTableTargetName(ast.getTableRefReference().getTargetName());
			} catch (Throwable e) {
				report(e,ast);
			}
		}
		if(tableName!=null&ast.getHierarchyName()!=null) {
			ITableDefine table=null;
			if(ast.getTableRefReference()!=null) {
				table=getTableDefine(ast.getTableRefReference().getTargetName(),ast.getTableRefReference(), data);
			}
			if(table!=null 
					&& (table.getHierarchy(ast.getHierarchyName())==null 	// 表级次作为参数
					|| table.getField(ast.getHierarchyName())==null 		// 级次路径作为参数
					)) {
				error(KIND_BAD_HIERARCHY_PREDICATE,new String[]{tableName},
						"the using hierachy ["+ast.getHierarchyName()+"] is not exist in target table ["+tableName+"].", ast);
			}
		}
		if(ast.getPrimary()!=null) {
			ISqlTypeDefine relType=this.checkValueExpression(ast.getPrimary(), data);

			if(relType!=null&&!SemanticUtil.isAssignable(ISqlTypeDefine.TYPE_NAME_INTEGER, relType)) {
				warn(KIND_TYPE_MISS_MATCH,new String[]{ISqlTypeDefine.TYPE_NAME_INTEGER,relType.getName()},
						"value must be a int number",ast.getPrimary());
			}
		}
		if(HierarchyFunCallExpression.HFC_NAME_H_LV.equalsIgnoreCase(ast.getFunctionName())) {
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
		} else if(HierarchyFunCallExpression.HFC_NAME_H_AID.equalsIgnoreCase(ast.getFunctionName())) {
			type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_GUID, DataKinds.SQL_TYPE_DEFINE, null, ast, TYPE_NOT_FOUND_PREFIX);
		} else {
			type=null;
			fatal("unknown hierarchy function name ["+ast.getFunctionName()+"]",ast);
		}
		if(DEBUG) exit(HierarchyFunCallExpression.class);
		return type;
	}

	@SuppressWarnings("unchecked")
	public Object visitWithStatement(WithStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(WithStatement.class);
		if(ast.getSubquerys()!=null) {
			for(SubQueryStatement sub : ast.getSubquerys()) {
				if(sub==null) continue;
				try {
					List<ISqlTypeDefine> columnTypes = (List<ISqlTypeDefine>) sub.accept(this, data);
					if(sub.getAlias()!=null && sub.getAlias().getTexture()!=null) {
						String name = sub.getAlias().getTexture();
						ReferencedDataMap<SubQueryStatement, IQueryDefine> subMap = fScope.getWiths(true);
						
						if(!subMap.containsLocalKey(name)) {
							ISqlTypeDefine[] stds = null;
							if(columnTypes!=null) {
								stds = columnTypes.toArray(new ISqlTypeDefine[columnTypes.size()]);
							}
							SubQueryAsQueryDefineAdaptor adaptor = new SubQueryAsQueryDefineAdaptor(name, sub, stds);
							DataReference<SubQueryStatement, IQueryDefine> ref = 
								new DataReference<SubQueryStatement, IQueryDefine>(sub, adaptor);
							subMap.put(name, ref);
						} else {
							error(KIND_WITH_ALIAS_ALREADY_EXIST,new String[]{name},
									"query alias name already in use", sub.getAlias());
						}
					}
				} catch (Throwable e) {
					report(e, sub);
				}
			}
		}
		if(DEBUG) exit(WithStatement.class);
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public Object visitSubQueryReference(SubQueryReference ast, Object data)
			throws Throwable {

		ITableDefine table=null;
		if(DEBUG) enter(SubQueryReference.class);
		try {
			if(ast.getSubquery()!=null) {
				
				IQueryDefine queryDefine = null;
				
				SubQueryStatement sub = ast.getSubquery();
				List<ISqlTypeDefine> columnTypes = (List<ISqlTypeDefine>) sub.accept(this, data);
				

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

	public ISqlTypeDefine visitValueQueryExpression(ValueQueryExpression ast,
			Object data) throws Throwable {
		ISqlTypeDefine type=null;
		if(DEBUG) enter(ValueQueryExpression.class);
		if(ast.getSubquery()!=null) {
			List<?> types=(List<?>) ast.getSubquery().accept(this, data);
			if(types!=null) {
				if(types.size()>1) {
					error(KIND_TYPE_MISS_MATCH,new String[]{},
							"result of this query is too many, as a value expression",ast.getSubquery());
				} else if(types.size()==1) {
					type = (ISqlTypeDefine) types.get(0);
				}
			}
		}
		if(DEBUG) exit(ValueQueryExpression.class);
		return type;
	}
	
	protected Object checkQueryDeclaration(QueryDeclarationBase ast, Object data)
			throws Throwable {
		checkArguments(ast, data);

		try { if(ast.getWith()!=null) ast.getWith().accept(this, data); }
		catch (Throwable e) { report(e, ast); }
		return checkQueryStatement(ast,data);
	}
	
	protected Object checkArguments(IArgumentContainer ast, Object data) 
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
		return null;
	}
	
	protected Object checkQueryStatement(QueryStatementBase ast,  Object data) 
			throws Throwable {
		Object columns = null;
		
		try { if(ast.getFrom()!=null) ast.getFrom().accept(this, data); }
		catch (Throwable e) { report(e, ast); }
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
				columns = ast.getSelect().accept(this, data);
		}  catch (Throwable e) { report(e, ast); }
		
		if(ast.getUnions()!=null) {
			for(UnionStatement union : ast.getUnions()) {
				if(union!=null) {
					try { union.accept(this, data); } 
					catch (Throwable e) { report(e, ast); }
				}
			}
		}
		return columns;
	}
	
	protected Object checkUnion(UnionStatement ast, TScope priScope, TScope subScope, Object columns, Object data) {
		Object obj = null;
		ReferencedDataList<DerivedColumn, ISqlTypeDefine> primaryColumns = priScope.getColumns(false);
		if(primaryColumns!=null && subScope!=null && subScope.getColumns(false)!=null) {
			ReferencedDataList<DerivedColumn, ISqlTypeDefine> subColumns = subScope.getColumns(false);
			int size = primaryColumns.size();
			if(subColumns.size() < size) {
				error(KIND_UNION_LIST_MISS_MATCH, new String[] {}, "too less column to match the primary query's", ast);
			} else if(subColumns.size() > size) {
				error(KIND_UNION_LIST_MISS_MATCH, new String[] {}, "too many column to match the primary query's", ast);
			} else {
				for(int i=0; i<size; i++) {
					DataReference<DerivedColumn, ISqlTypeDefine> pitem = primaryColumns.get(i);
					DataReference<DerivedColumn, ISqlTypeDefine> sitem = subColumns.get(i);
					
					if(pitem!=null && pitem.data!=null 
							&& sitem!=null && sitem.data!=null) {
						if(!pitem.key.equals(sitem.key)) {
							error(KIND_UNION_LIST_MISS_MATCH, new String[] {}, "column name do not match the primary query's", sitem.ast);
						} else if(SemanticUtil.getCommonType(pitem.data,sitem.data)==null) {
							error(KIND_UNION_LIST_MISS_MATCH, new String[] {}, "column type do not match the primary query's", sitem.ast);
						}
					}
				}
			}
		}
		
		return obj;
	}
}
