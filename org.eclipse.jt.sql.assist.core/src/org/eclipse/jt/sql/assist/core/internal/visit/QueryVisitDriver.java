/**
 * 
 */
package org.eclipse.jt.sql.assist.core.internal.visit;


import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.ConditionExpression;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
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
import org.eclipse.jt.sql.assist.core.ast.query.IQueryAccessor;
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
import org.eclipse.jt.sql.assist.core.data.IQueryScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataList;
import org.eclipse.jt.sql.assist.core.data.adaptor.QueryAsTableAdaptor;
import org.eclipse.jt.sql.assist.core.data.adaptor.SubQueryAsQueryDefineAdaptor;
import org.eclipse.jt.sql.assist.core.data.define.IQueryDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableRelationDefine;
import org.eclipse.jt.sql.assist.core.visit.access.QueryAccessor;
import org.eclipse.jt.sql.assist.core.visit.access.QueryWalkerAdaptor;


/**
 * @author Jeff Tang
 *
 */
public class QueryVisitDriver<TScope extends AbstractQueryDataScope<TScope>>
		extends GeneralVisitDriver<TScope> 
		implements 
			IQueryAstVisitor<Object, IVisitControler<TScope>>,
			IQueryConditionVisitor<Object, IVisitControler<TScope>>, 
			IQueryValueVisitor<ISqlTypeDefine, IVisitControler<TScope>> {
//	
//	public static final class RealQueryWalkProcessor extends QueryWalkProcessor<QueryDataScope> {
//		
//		public static RealQueryWalkProcessor getInstance(IAstWalker walker,
//				IWalkControler<TScope> rootControler) {
//			return new RealQueryWalkProcessor(walker, rootControler);
//		}
//
//		public RealQueryWalkProcessor(IAstWalker walker,
//				IWalkControler<TScope> rootControler) {
//			super(walker, rootControler);
//		}
//		
//		@Override
//		protected final QueryDataScope createDefaultScope() {
//			return QueryDataScope.getInstance();
//		}
//
//		protected final QueryDataScope convertScope(IDataScope dataScope) {
//			if(dataScope==null)
//				throw new NullArgumentException("Argument dataScope cannot be null!");
//			if(dataScope instanceof QueryDataScope) {
//				return (QueryDataScope)dataScope;
//			} else {
//				throw new IllegalArgumentException(
//						"Data scope of class 'QueryDataScope' expected, not '"
//						+dataScope.getClass().getName()+"'!");
//			}
//		}
//		
//	}
	
	public static QueryVisitDriver<QueryDataScope> getInstance(
			IVisitControler<QueryDataScope> rootControler) {
		QueryVisitDriver<QueryDataScope> driver = 
			new QueryVisitDriver<QueryDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		return driver;
	}
	
	public static QueryVisitDriver<QueryDataScope> getInstance(IAstWalker walker,
			IVisitControler<QueryDataScope> rootControler) {
		QueryVisitDriver<QueryDataScope> driver = 
			new QueryVisitDriver<QueryDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(walker);
		return driver;
	}
	
	public static QueryVisitDriver<QueryDataScope> getInstance(IAstAccessor<QueryDataScope> accessor,
			IDataProvider dataLoader,
			IVisitControler<QueryDataScope> rootControler) {
		QueryVisitDriver<QueryDataScope> driver = 
			new QueryVisitDriver<QueryDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(accessor, dataLoader);
		return driver;
	}
	
	private IQueryAccessor<TScope> fQueryAccessor;
	
	@Override
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		super.initialize(accessor, dataLoader);
		if(accessor instanceof IQueryAccessor<?>) {
			fQueryAccessor = (IQueryAccessor<TScope>) accessor;
		} else {
			fQueryAccessor = new QueryAccessor<TScope>();
		}
	}
	
	@Override
	public void initialize(IAstWalker walker) {
		super.initialize(walker);
		fQueryAccessor = new QueryWalkerAdaptor<TScope>(walker);
	}
	
	
	protected ITableRelationDefine getRelationDefine(String tableAlias, String relation, IAstNode node, IVisitControler<TScope> data) throws Throwable {
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
	
	protected ITableDefine getTableDefine(String alias, IAstNode node, IVisitControler<TScope> data) throws Throwable {
		ITableDefine table=null;
		DataReference<IResultSetReference, ITableDefine> tableRefable=data.getDataScope().getTableReference(alias);
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
					ITableRelationDefine trd=getRelationDefine(target,relation.getTargetName(),relation,data);
					if(trd!=null) table=trd.getTarget();
					tableRefable.data=table;
				}
			}
		}
		return table;
	}
	
	@Override
	public void visitGeneral(IAstNode ast, IVisitControler<TScope> data) throws Throwable {
		if(ast instanceof IQueryAstNode) {
			((IQueryAstNode)ast).accept(this, data);
		} else if(ast instanceof IQueryConditionNode) {
			((IQueryConditionNode)ast).accept(this, data);
		} else if(ast instanceof IQueryValueNode) {
			((IQueryValueNode)ast).accept(this, data);
		} else {
			super.visitGeneral(ast, data);
		}
	}

	@Override
	protected ISqlTypeDefine walkValueExpression(ValueExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		if(ast instanceof IQueryValueNode) {
			return ((IQueryValueNode)ast).accept(this, data);
		} else {
			return super.walkValueExpression(ast, data);
		}
	}
	
	@Override
	protected void walkConditionExpression(ConditionExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		if(ast instanceof IQueryConditionNode) {
			((IQueryConditionNode)ast).accept(this, data);
		} else {
			super.walkConditionExpression(ast, data);
		}
	}
	
	@Override
	protected void walkIn(RelationPredicate ast, IVisitControler<TScope> data) throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			this.visitSubQueryStatement((SubQueryStatement)ast.getUncertainOperand(), data);
		} else {
			super.walkIn(ast, data);
		}
	}
	
	@Override
	protected void walkCompare(RelationPredicate ast, IVisitControler<TScope> data)
			throws Throwable {
		if(ast.getUncertainOperand() instanceof SubQueryStatement) {
			this.visitSubQueryStatement((SubQueryStatement)ast.getUncertainOperand(), data);
		} else {
			super.walkCompare(ast, data);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitDerivedColumn(org.eclipse.jt.sql.assist.core.ast.query.DerivedColumn, java.lang.Object)
	 */
	public Object visitDerivedColumn(DerivedColumn ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterDerivedColumn(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					walkValueExpression(ast.getPrimary(), sub);
				}
				if(data.isBuildScopeData(IQueryScopeDataKinds.COLUMN)) {
					if(ast.getAlias()!=null) {
						ReferencedDataList<DerivedColumn, ISqlTypeDefine> columnSet=data.getDataScope().getColumns(true);
						if(columnSet.containsKey(ast.getAlias().getTexture())) {
						} else {
							DataReference<DerivedColumn, ISqlTypeDefine> ref = new DataReference<DerivedColumn, ISqlTypeDefine>(ast, null);
							columnSet.put(ast.getAlias().getTexture(), ref);
						}
					}
				}
			}
			if(visit) fQueryAccessor.exitDerivedColumn(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitFromStatement(org.eclipse.jt.sql.assist.core.ast.query.FromStatement, java.lang.Object)
	 */
	public Object visitFromStatement(FromStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterFromStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getTableReferences()!=null) {
					for(TableReferenceStatement ref : ast.getTableReferences()) {
						if(ref!=null) {
							ref.accept(this, sub);
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitFromStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitGroupColumn(org.eclipse.jt.sql.assist.core.ast.query.GroupColumn, java.lang.Object)
	 */
	public Object visitGroupColumn(GroupColumn ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterGroupColumn(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {

				if(ast.getPrimary()!=null) {
					walkValueExpression(ast.getPrimary(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitGroupColumn(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitGroupStatement(org.eclipse.jt.sql.assist.core.ast.query.GroupStatement, java.lang.Object)
	 */
	public Object visitGroupStatement(GroupStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterGroupStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getGroupColumns()!=null) {
					for(GroupColumn ref : ast.getGroupColumns()) {
						if(ref!=null) {
							visitGroupColumn(ref, sub);
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitGroupStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitHavingStatement(org.eclipse.jt.sql.assist.core.ast.query.HavingStatement, java.lang.Object)
	 */
	public Object visitHavingStatement(HavingStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterHavingStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getConditionExpression()!=null) {
					walkConditionExpression(ast.getConditionExpression(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitHavingStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitOrderExpression(org.eclipse.jt.sql.assist.core.ast.query.OrderExpression, java.lang.Object)
	 */
	public Object visitOrderExpression(OrderExpression ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterOrderExpression(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					walkValueExpression(ast.getPrimary(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitOrderExpression(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitOrderStatement(org.eclipse.jt.sql.assist.core.ast.query.OrderStatement, java.lang.Object)
	 */
	public Object visitOrderStatement(OrderStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterOrderStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getOrders()!=null) {
					for(OrderExpression ref : ast.getOrders()) {
						if(ref!=null) {
							visitOrderExpression(ref, sub);
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitOrderStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitQueryDeclaration(org.eclipse.jt.sql.assist.core.ast.query.QueryDeclaration, java.lang.Object)
	 */
	public Object visitQueryDeclaration(QueryDeclaration ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterQueryDeclaration(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkQueryDeclaration(ast, sub);
			}
			if(visit) 
				fQueryAccessor.exitQueryDeclaration(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.QueryStatement, java.lang.Object)
	 */
	public Object visitQueryStatement(QueryStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterQueryStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkQueryStatement(ast, sub);
			}
			if(visit) 
				fQueryAccessor.exitQueryStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitUnionStatement(org.eclipse.jt.sql.assist.core.ast.query.UnionStatement, java.lang.Object)
	 */
	public Object visitUnionStatement(UnionStatement ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterUnionStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkQueryStatement(ast, sub);
			}
			if(visit) 
				fQueryAccessor.exitUnionStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitSelectStatement(org.eclipse.jt.sql.assist.core.ast.query.SelectStatement, java.lang.Object)
	 */
	public Object visitSelectStatement(SelectStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterSelectStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getDerivedColumns()!=null) {
					for(DerivedColumn ref : ast.getDerivedColumns()) {
						if(ref!=null) {
							visitDerivedColumn(ref, sub);
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitSelectStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitSubQueryStatement(org.eclipse.jt.sql.assist.core.ast.query.SubQueryStatement, java.lang.Object)
	 */
	public Object visitSubQueryStatement(SubQueryStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		Object result = null;
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterSubQueryStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkQueryStatement(ast, sub);
				result = sub.getDataScope();
			}
			if(visit) 
				fQueryAccessor.exitSubQueryStatement(ast, data.getDataScope());
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitTableJoinStatement(org.eclipse.jt.sql.assist.core.ast.query.TableJoinStatement, java.lang.Object)
	 */
	public Object visitTableJoinStatement(TableJoinStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterTableJoinStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null) {
					ast.getPrimaryTable().accept(this, sub);
				}
				if(ast.getSecondaryTable()!=null) {
					ast.getSecondaryTable().accept(this, sub);
				}
				if(ast.getCondition()!=null) {
					walkConditionExpression(ast.getCondition(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitTableJoinStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitTableReference(org.eclipse.jt.sql.assist.core.ast.query.TableReference, java.lang.Object)
	 */
	public Object visitTableReference(TableReference ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterTableReference(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null)
					ast.getPrimaryTable().accept(this, sub);
				

				if(data.isBuildScopeData(IQueryScopeDataKinds.TABLE_REFERENCE)) {
					
					ITableDefine table=null;
					if(ast.getTargetName()!=null) {
						DataReference<SubQueryStatement, IQueryDefine> ref = data.getDataScope().getWith(ast.getTargetName());
						if(ref!=null && ref.data!=null) {
							table = new QueryAsTableAdaptor(ref.data);
						}
						if(table == null) {
							table=(ITableDefine) getData(ast.getTargetName(), DataKinds.TABLE_DEFINE, null, ast);
						}
					}
					if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
						DataReference<IResultSetReference, ITableDefine> ref= new DataReference<IResultSetReference, ITableDefine>(ast,table);
						data.getDataScope().getTableReferences(true).put(ast.getAlias().getTexture(), ref);
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitTableReference(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitTableReferenceStatement(org.eclipse.jt.sql.assist.core.ast.query.TableReferenceStatement, java.lang.Object)
	 */
	public Object visitTableReferenceStatement(TableReferenceStatement ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterTableReferenceStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null)
					ast.getPrimaryTable().accept(this, sub);
			}
			if(visit) 
				fQueryAccessor.exitTableReferenceStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitTableRelation(org.eclipse.jt.sql.assist.core.ast.query.TableRelation, java.lang.Object)
	 */
	public Object visitTableRelation(TableRelation ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterTableRelation(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getTableRefReference()!=null)
					ast.getTableRefReference().accept(this, sub);

				if(data.isBuildScopeData(IQueryScopeDataKinds.TABLE_REFERENCE)) {

					ITableRelationDefine relation=null;
					if(ast.getTableRefReference()!=null && ast.getTargetName()!=null) {
						relation=getRelationDefine(ast.getTableRefReference().getTargetName(), ast.getTargetName(), ast, data);
					}
					if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
						DataReference<IResultSetReference, ITableDefine> ref=new DataReference<IResultSetReference, ITableDefine>(ast,relation.getTarget());
						data.getDataScope().getTableReferences(true).put(ast.getAlias().getTexture(), ref);
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitTableRelation(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitTableRelationStatement(org.eclipse.jt.sql.assist.core.ast.query.TableRelationStatement, java.lang.Object)
	 */
	public Object visitTableRelationStatement(TableRelationStatement ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterTableRelationStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null)
					ast.getPrimaryTable().accept(this, sub);
				if(ast.getTableRelation()!=null) {
					visitTableRelation(ast.getTableRelation(),sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitTableRelationStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryAstVisitor#visitWhereStatement(org.eclipse.jt.sql.assist.core.ast.query.WhereStatement, java.lang.Object)
	 */
	public Object visitWhereStatement(WhereStatement ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterWhereStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getConditionExpression()!=null) {
					walkConditionExpression(ast.getConditionExpression(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitWhereStatement(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryConditionVisitor#visitHierarchyPredicate(org.eclipse.jt.sql.assist.core.ast.query.HierarchyPredicate, java.lang.Object)
	 */
	public Object visitHierarchyPredicate(HierarchyPredicate ast, IVisitControler<TScope> data)
			throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterHierarchyPredicate(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null) {
					visitTableRefReference(ast.getPrimaryTable(), sub);
				}
				if(ast.getSecondaryTable()!=null) {
					visitTableRefReference(ast.getSecondaryTable(), sub);
				}
				if(ast.getLimit()!=null) {
					walkValueExpression(ast.getLimit(), sub);
				}
			}
			if(visit) 
				fQueryAccessor.exitHierarchyPredicate(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitExistsPredicate(ExistsPredicate ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterExistsPredicate(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getSubquery()!=null) {
					ast.getSubquery().accept(this, data);
				}
			}
			if(visit) 
				fQueryAccessor.exitExistsPredicate(ast, data.getDataScope());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueVisitor#visitColumnCallExpression(org.eclipse.jt.sql.assist.core.ast.query.ColumnCallExpression, java.lang.Object)
	 */
	public ISqlTypeDefine visitColumnCallExpression(ColumnCallExpression ast,
			IVisitControler<TScope> data) throws Throwable {
		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterColumnCallExpression(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimary()!=null) {
					type=walkValueExpression(ast.getPrimary(), sub);
				}
				if (ColumnCallExpression.FUNCTION_COUNT.equalsIgnoreCase(ast.getFunctionName())) {
					type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast);
				} 
				
			}
			if(visit) 
				fQueryAccessor.exitColumnCallExpression(ast, data.getDataScope());
		}
		return type;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueVisitor#visitColumnReference(org.eclipse.jt.sql.assist.core.ast.query.ColumnReference, java.lang.Object)
	 */
	public ISqlTypeDefine visitColumnReference(ColumnReference ast, IVisitControler<TScope> data)
			throws Throwable {
		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterColumnReference(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {

				ITableDefine table=null;
				if(ast.getTableRefReference()!=null) {
					visitTableRefReference(ast.getTableRefReference(), sub);
					if(data.getDataScope()!=null) {
						table=getTableDefine(ast.getTableRefReference().getTargetName(),ast.getTableRefReference(), sub);
					}
				}
				if(table!=null && ast.getColumnName()!=null) {
					ISqlFieldDefine field=table.getField(ast.getColumnName());
					if(field!=null) {
						type=field.getSqlType();
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitColumnReference(ast, data.getDataScope());
		}
		return type;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.query.IQueryValueVisitor#visitHierarchyFunCallExpression(org.eclipse.jt.sql.assist.core.ast.query.HierarchyFunCallExpression, java.lang.Object)
	 */
	public ISqlTypeDefine visitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, IVisitControler<TScope> data) throws Throwable {
		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterHierarchyFunCallExpression(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getTableRefReference()!=null) {
					visitTableRefReference(ast.getTableRefReference(), sub);
				}
				if(ast.getPrimary()!=null) {
					walkValueExpression(ast.getPrimary(), sub);
				}
				
				if(HierarchyFunCallExpression.HFC_NAME_H_LV.equalsIgnoreCase(ast.getFunctionName())) {
					type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_INTEGER, DataKinds.SQL_TYPE_DEFINE, null, ast);
				} else if(HierarchyFunCallExpression.HFC_NAME_H_AID.equalsIgnoreCase(ast.getFunctionName())) {
					type = (ISqlTypeDefine) getData(ISqlTypeDefine.TYPE_NAME_GUID, DataKinds.SQL_TYPE_DEFINE, null, ast);
				} 
			}
			if(visit) 
				fQueryAccessor.exitHierarchyFunCallExpression(ast, data.getDataScope());
		}
		return type;
	}

	public Object visitWithStatement(WithStatement ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean buildWiths = data.isBuildScopeData(IQueryScopeDataKinds.WITHS);
		
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterWithStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getSubquerys()!=null) {
					for(SubQueryStatement subQuery : ast.getSubquerys()) {
						if(subQuery!=null) {
							try {
								AbstractQueryDataScope<?> scope = (AbstractQueryDataScope<?>) visitSubQueryStatement(subQuery, sub);
								if(buildWiths) {
									if(subQuery.getAlias()!=null && subQuery.getAlias().getTexture()!=null) {
										ISqlTypeDefine[] types = null;
										if(scope!=null) {
											ReferencedDataList<DerivedColumn, ISqlTypeDefine> map = scope.getColumns(false);
											if(map!=null) {
												types = new ISqlTypeDefine[map.size()];
												int index=0;
												for(DataReference<DerivedColumn, ISqlTypeDefine> ref : map) {
													if(ref!=null) {
														types[index] = ref.data;
													}
													index++;
												}
											}
											
										}
										IQueryDefine define = new SubQueryAsQueryDefineAdaptor(subQuery.getAlias().getTexture(), subQuery, types);
										DataReference<SubQueryStatement, IQueryDefine> ref = 
											new DataReference<SubQueryStatement, IQueryDefine>(subQuery, define);
										sub.getDataScope().getWiths(true).put(subQuery.getAlias().getTexture(), ref);
									}
								}
							} catch (Throwable e) {
								report(e, subQuery);
							}
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitWithStatement(ast, data.getDataScope());
		}
		return null;
	}
	
	public Object visitSubQueryReference(SubQueryReference ast,
				IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterSubQueryReference(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getPrimaryTable()!=null)
					ast.getPrimaryTable().accept(this, sub);

				SubQueryStatement subquery = ast.getSubquery();
				

				AbstractQueryDataScope<?> scope = (AbstractQueryDataScope<?>) visitSubQueryStatement(subquery, sub);

				if(data.isBuildScopeData(IQueryScopeDataKinds.TABLE_REFERENCE)) {
					
					ITableDefine table=null;
					if(ast.getTargetName()!=null) {

						IQueryDefine queryDefine = null;
						

						ISqlTypeDefine[] types = null;
						if(scope!=null) {
							ReferencedDataList<DerivedColumn, ISqlTypeDefine> map = scope.getColumns(false);
							if(map!=null) {
								types = new ISqlTypeDefine[map.size()];
								int index=0;
								for(DataReference<DerivedColumn, ISqlTypeDefine> ref : map) {
									if(ref!=null) {
										types[index] = ref.data;
									}
									index++;
								}
							}
							
						}
//						List<ISqlTypeDefine> columnTypes = (List<ISqlTypeDefine>) subquery.accept(this, data);
//						
//
//						
//						ISqlTypeDefine[] stds = null;
//						if(columnTypes!=null) {
//							stds = columnTypes.toArray(new ISqlTypeDefine[columnTypes.size()]);
//						}
						String name = ast.getAlias().getTexture();
						queryDefine = new SubQueryAsQueryDefineAdaptor(name, subquery, types);

						table = new QueryAsTableAdaptor(queryDefine);
						
					}
					if(ast.getAlias()!=null && ast.getAlias().getTexture()!=null) {
						DataReference<IResultSetReference, ITableDefine> ref= new DataReference<IResultSetReference, ITableDefine>(ast,table);
						data.getDataScope().getTableReferences(true).put(ast.getAlias().getTexture(), ref);
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitSubQueryReference(ast, data.getDataScope());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ISqlTypeDefine visitValueQueryExpression(ValueQueryExpression ast,
			IVisitControler<TScope> data) throws Throwable {

		ISqlTypeDefine type=null;
		boolean visit=data.walkNode(ast);
		if(!visit || fQueryAccessor.enterValueQueryExpression(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getSubquery()!=null) {
					TScope scope = (TScope) visitSubQueryStatement(ast.getSubquery(), data);
					if(scope!=null) {
						ReferencedDataList<DerivedColumn, ISqlTypeDefine> map = scope.getColumns(false);
						if(map != null) {
							for(DataReference<DerivedColumn, ISqlTypeDefine> std : map) {
								if(std.data!=null) {
									type = std.data;
									break;
								}
							}
						}
					}
				}
			}
			if(visit) 
				fQueryAccessor.exitValueQueryExpression(ast, data.getDataScope());
		}
		return type;
	}

	protected void walkQueryDeclaration(QueryDeclarationBase ast, IVisitControler<TScope> data) throws Throwable {

		walkArgumentContainer(ast, data);
		if(ast.getWith()!=null) visitWithStatement(ast.getWith(), data);
		walkQueryStatement(ast,data);
	}
	
	protected void walkArgumentContainer(IArgumentContainer ast, IVisitControler<TScope> data) throws Throwable {

		if(ast.getArguments()!=null) {
			for(ArgumentDeclaration argu : ast.getArguments()) {
				if(argu!=null)
					visitArgumentDeclaration(argu, data);
			}
		}
	}
	
	protected void walkQueryStatement(QueryStatementBase ast, IVisitControler<TScope> data) throws Throwable {

		if(data.getPolicy(ast)==DnaSql.POLICY_PROCESS) {
			if(ast.getFrom()!=null) visitFromStatement(ast.getFrom(), data);
			if(ast.getWhere()!=null) visitWhereStatement(ast.getWhere(), data); 
			if(ast.getGroup()!=null) visitGroupStatement(ast.getGroup(), data);
			if(ast.getHaving()!=null) visitHavingStatement(ast.getHaving(), data);
			if(ast.getOrder()!=null) visitOrderStatement(ast.getOrder(), data);
			if(ast.getSelect()!=null) visitSelectStatement(ast.getSelect(), data);
			
			walkUnions(ast.getUnions(), data);
		} else {
			if(ast.getSelect()!=null) visitSelectStatement(ast.getSelect(), data);
			if(ast.getFrom()!=null) visitFromStatement(ast.getFrom(), data);
			if(ast.getWhere()!=null) visitWhereStatement(ast.getWhere(), data); 
			if(ast.getGroup()!=null) visitGroupStatement(ast.getGroup(), data);
			if(ast.getHaving()!=null) visitHavingStatement(ast.getHaving(), data);
			if(ast.getOrder()!=null) visitOrderStatement(ast.getOrder(), data);

			walkUnions(ast.getUnions(), data);
		}
		
	}
	
	protected void walkUnions(List<UnionStatement> unions, IVisitControler<TScope> data) throws Throwable {
		if(unions==null) return;
 		
		for(UnionStatement union : unions) {
			if(union!=null) {
				visitUnionStatement(union, data);
			}
		}
	}
}