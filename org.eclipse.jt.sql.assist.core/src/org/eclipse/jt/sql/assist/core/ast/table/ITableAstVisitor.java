/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.visit.IAstVisitor;

/**
 * @author Jeff Tang
 *
 */
public interface ITableAstVisitor<TResult,TData> extends IAstVisitor {
	public TResult visitColumnDeclaration		 		(ColumnDeclaration  	  		ast, TData data);
	public TResult visitColumnDefaultStatement   		(ColumnDefaultStatement  		ast, TData data);
	public TResult visitColumnRelationStatement  		(ColumnRelationStatement 		ast, TData data);
	public TResult visitColumnsStatement         		(ColumnsStatement        		ast, TData data);
	public TResult visitHierarchiesStatement     		(HierarchiesStatement    		ast, TData data);
	public TResult visitHierarchyDeclaration     		(HierarchyDeclaration    		ast, TData data);
	public TResult visitIndexColumnStatement     		(IndexColumnStatement    		ast, TData data);
	public TResult visitIndexDeclaration         		(IndexDeclaration        		ast, TData data);
	public TResult visitIndexesStatment          		(IndexesStatment         		ast, TData data);
	public TResult visitPartitionStatement       		(PartitionStatement      		ast, TData data);
	public TResult visitRelationDeclaration      		(RelationDeclaration     		ast, TData data);
	public TResult visitRelationsStatement       		(RelationsStatement      		ast, TData data);
	public TResult visitTableColumnReference     		(TableColumnReference    		ast, TData data);
	public TResult visitAbstractTableDeclaration     	(AbstractTableDeclaration    	ast, TData data);
	public TResult visitAbstractTableDefineStatement 	(AbstractTableDefineStatement	ast, TData data);
	public TResult visitNormalTableDeclaration     		(NormalTableDeclaration   		ast, TData data);
	public TResult visitNormalTableDefineStatement   	(NormalTableDefineStatement 	ast, TData data);
	public TResult visitColumnTypeReference			   	(ColumnTypeReference		 	ast, TData data);
	
}
