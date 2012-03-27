/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.selection;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
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
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.IQueryScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;


/**
 * @author Jeff Tang
 *
 */
public abstract class QuerySelectionDetector<TScope extends AbstractQueryDataScope<TScope>> 
			extends GeneralSelectionDetector<TScope> 
			implements IQueryAccessor<TScope> {

	public static boolean ASSIT_COLUMN_REFERENCE = true;
	
	public static final class RealQuerySelectionDetector extends QuerySelectionDetector<QueryDataScope> {

		public static RealQuerySelectionDetector getInstance() {
			return new RealQuerySelectionDetector();
		}
		
		@Override
		protected QueryDataScope createScope() {
			return QueryDataScope.getInstance();
		}

		@Override
		public int getSqlKind() {
			return DnaSql.QUERY_DEFINE;
		}
		
	}
	
	public static QuerySelectionDetector<?> getInstance() {
		return new RealQuerySelectionDetector();
	}
	
	
	@Override
	protected int judgeBuildScopeDataKind(IAstNode selection) {
		int kind=super.judgeBuildScopeDataKind(selection);

		if(selection instanceof DerivedColumn)
			kind |= IQueryScopeDataKinds.COLUMN;
		
		if(selection instanceof IResultSetReference
				|| selection instanceof ColumnReference)
			kind |= IQueryScopeDataKinds.TABLE_REFERENCE;
		
		return kind;
	}
	
	@Override
	protected int processBuildScopeDataKind(int kind) {
		kind = super.processBuildScopeDataKind(kind);
		if(kind!=0) {
			kind |= IQueryScopeDataKinds.WITHS;
		}
		return kind;
	}
	
	
	public boolean exitColumnReference(ColumnReference ast, TScope scope) {
		if(ASSIT_COLUMN_REFERENCE && ast.getTableRefReference()!=null && ast.getColumnName()!=null) {
			if(fData.pretreatment) {
				if(fData.selection==ast) {
//					String name=ast.getTableRefReference().getTargetName();
//					TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//					DataReference<ITableReference, TableDefine> ref=scope.getTableReference(name);
//					if(ref!=null) {
						fData.target=new SelectionTargetData<TScope>(ast,scope);
//					}
					return false;
				}
			} else if(fData.target!=null) {
				if(fData.target.ast==ast) {
					fData.assit(ast.getPosition(), fData.target);
					return false;
				} else if((fData.target.ast instanceof ColumnReference) && fData.target.scope!=null) {

					
					String tarName=ast.getTableRefReference().getTargetName();
					ColumnReference cr=(ColumnReference)fData.target.ast;
					if(tarName!=null && cr.getTableRefReference()!=null 
							&& tarName.equals(cr.getTableRefReference().getTargetName())
							&& ast.getColumnName().equals(cr.getColumnName())) {
//						TScope currentScope=fData.processor.getCurrentWalkControler().getDataScope();
						DataReference<IResultSetReference, ITableDefine> currentRef=scope.getTableReference(ast.getTableRefReference().getTargetName());

						DataReference<IResultSetReference, ITableDefine> targetRef=fData.target.scope.getTableReference(cr.getTableRefReference().getTargetName());
						
						//确保两个字段引用所对应的表引用相同
						if(currentRef!=null && targetRef!=null && 
								((targetRef.ast!=null && targetRef.ast==currentRef.ast) 
								|| (targetRef.data!=null && targetRef.data==currentRef.data))) {
							fData.assit(ast.getPosition(), fData.target);
						}
//						else {
//							System.out.println(currentRef);
//							System.out.println(targetRef);
//						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean exitTableReference(TableReference ast, TScope scope) {
		if(ASSIT_TABLE_REFERENCE && ast.getTargetName()!=null) {
			assitTableReference(ast, scope);
		}
		return false;
	}

	public boolean exitTableRelation(TableRelation ast, TScope scope) {
		if(ASSIT_TABLE_REFERENCE && ast.getTargetName()!=null) {
			if(assitTableReference(ast, scope))
				return false;
		}
		return true;
	}
	
	protected boolean assitTableReference(IResultSetReference ast, TScope scope) {
		if(fData.pretreatment) {
			if(fData.selection==ast) {

//				String name=ast.getAlias();
//				TScope scope=fData.processor.getCurrentWalkControler().getDataScope();
//				DataReference<ITableReference, TableDefine> ref=scope.getTableReference(name);
//				if(ref!=null)
				fData.target= new SelectionTargetData<TScope>(ast, scope);
				return true;
			}
		} else if(fData.target!=null && ast.getAlias()!=null) {
//			if(fData.target.ast instanceof ITableReference) {
//				ITableReference tableRef=(ITableReference) fData.target.ast;
//				if(ast.getAlias().equals(tableRef.getAlias())) {
//					fData.assit(ast.getPosition(), fData.target);
//					return true;
//				}
//			}
			if(fData.target.ast == ast) {
				fData.assit(ast.getPosition(), fData.target);
				return true;
			}
		}
		return false;
	}


	public boolean enterColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterDerivedColumn(DerivedColumn ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterFromStatement(FromStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterGroupColumn(GroupColumn ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterGroupStatement(GroupStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterHavingStatement(HavingStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterOrderExpression(OrderExpression ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterOrderStatement(OrderStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterQueryStatement(QueryStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterSelectStatement(SelectStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterWhereStatement(WhereStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitColumnCallExpression(ColumnCallExpression ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterColumnReference(ColumnReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitDerivedColumn(DerivedColumn ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitFromStatement(FromStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitGroupColumn(GroupColumn ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitGroupStatement(GroupStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitHavingStatement(HavingStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitHierarchyFunCallExpression(
			HierarchyFunCallExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitHierarchyPredicate(HierarchyPredicate ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitOrderExpression(OrderExpression ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitOrderStatement(OrderStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitQueryDeclaration(QueryDeclaration ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitQueryStatement(QueryStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitSelectStatement(SelectStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitSubQueryStatement(SubQueryStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitTableJoinStatement(TableJoinStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterTableReference(TableReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitTableReferenceStatement(TableReferenceStatement ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean enterTableRelation(TableRelation ast, TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitTableRelationStatement(TableRelationStatement ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitWhereStatement(WhereStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}
	
	


	public boolean enterValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean enterWithStatement(WithStatement ast,
			TScope scope) {
		return enterGeneral(ast, scope);
	}

	public boolean exitValueQueryExpression(ValueQueryExpression ast,
			TScope scope) {
		return exitGeneral(ast, scope);
	}

	public boolean exitWithStatement(WithStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}
	
	
	public boolean enterSubQueryReference(SubQueryReference ast, TScope scope) {
		return enterGeneral(ast, scope);
	}
	
	public boolean exitSubQueryReference(SubQueryReference ast, TScope scope) {
		return exitGeneral(ast, scope);
	}
	
	public boolean enterExistsPredicate(ExistsPredicate ast, TScope scope) {
		return enterGeneral(ast, scope);
	}
	
	public boolean exitExistsPredicate(ExistsPredicate ast, TScope scope) {
		return exitGeneral(ast, scope);
	}
	
	public boolean enterUnionStatement(UnionStatement ast, TScope scope) {
		return enterGeneral(ast, scope);
	}
	
	public boolean exitUnionStatement(UnionStatement ast, TScope scope) {
		return exitGeneral(ast, scope);
	}
}
