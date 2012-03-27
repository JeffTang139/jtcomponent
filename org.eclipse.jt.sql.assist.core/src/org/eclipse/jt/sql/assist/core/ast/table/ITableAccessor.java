/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;


/**
 * @author Jeff Tang
 *
 */
public interface ITableAccessor <TScope extends AbstractQueryDataScope<TScope>> extends IAstAccessor<TScope> {

	public boolean enterColumnDeclaration		 		(ColumnDeclaration  	  		ast, TScope scope);
	public boolean enterColumnDefaultStatement   		(ColumnDefaultStatement  		ast, TScope scope);
	public boolean enterColumnRelationStatement  		(ColumnRelationStatement 		ast, TScope scope);
	public boolean enterColumnsStatement         		(ColumnsStatement        		ast, TScope scope);
	public boolean enterHierarchiesStatement     		(HierarchiesStatement    		ast, TScope scope);
	public boolean enterHierarchyDeclaration     		(HierarchyDeclaration    		ast, TScope scope);
	public boolean enterIndexColumnStatement     		(IndexColumnStatement    		ast, TScope scope);
	public boolean enterIndexDeclaration         		(IndexDeclaration        		ast, TScope scope);
	public boolean enterIndexesStatment          		(IndexesStatment         		ast, TScope scope);
	public boolean enterPartitionStatement       		(PartitionStatement      		ast, TScope scope);
	public boolean enterRelationDeclaration      		(RelationDeclaration     		ast, TScope scope);
	public boolean enterRelationsStatement       		(RelationsStatement      		ast, TScope scope);
	public boolean enterTableColumnReference     		(TableColumnReference    		ast, TScope scope);
	public boolean enterAbstractTableDeclaration     	(AbstractTableDeclaration    	ast, TScope scope);
	public boolean enterAbstractTableDefineStatement 	(AbstractTableDefineStatement	ast, TScope scope);
	public boolean enterNormalTableDeclaration     		(NormalTableDeclaration   		ast, TScope scope);
	public boolean enterNormalTableDefineStatement   	(NormalTableDefineStatement 	ast, TScope scope);
	public boolean enterColumnTypeReference			   	(ColumnTypeReference		 	ast, TScope scope);

	public boolean exitColumnDeclaration		 		(ColumnDeclaration  	  		ast, TScope scope);  
	public boolean exitColumnDefaultStatement   		(ColumnDefaultStatement  		ast, TScope scope);  
	public boolean exitColumnRelationStatement  		(ColumnRelationStatement 		ast, TScope scope);  
	public boolean exitColumnsStatement         		(ColumnsStatement        		ast, TScope scope);  
	public boolean exitHierarchiesStatement     		(HierarchiesStatement    		ast, TScope scope);  
	public boolean exitHierarchyDeclaration     		(HierarchyDeclaration    		ast, TScope scope);  
	public boolean exitIndexColumnStatement     		(IndexColumnStatement    		ast, TScope scope);  
	public boolean exitIndexDeclaration         		(IndexDeclaration        		ast, TScope scope);  
	public boolean exitIndexesStatment          		(IndexesStatment         		ast, TScope scope);  
	public boolean exitPartitionStatement       		(PartitionStatement      		ast, TScope scope);  
	public boolean exitRelationDeclaration      		(RelationDeclaration     		ast, TScope scope);  
	public boolean exitRelationsStatement       		(RelationsStatement      		ast, TScope scope);  
	public boolean exitTableColumnReference     		(TableColumnReference    		ast, TScope scope);  
	public boolean exitAbstractTableDeclaration     	(AbstractTableDeclaration    	ast, TScope scope);  
	public boolean exitAbstractTableDefineStatement 	(AbstractTableDefineStatement	ast, TScope scope);  
	public boolean exitNormalTableDeclaration     		(NormalTableDeclaration   		ast, TScope scope);  
	public boolean exitNormalTableDefineStatement   	(NormalTableDefineStatement 	ast, TScope scope);  
	public boolean exitColumnTypeReference			   	(ColumnTypeReference		 	ast, TScope scope);  
	
	
	
}