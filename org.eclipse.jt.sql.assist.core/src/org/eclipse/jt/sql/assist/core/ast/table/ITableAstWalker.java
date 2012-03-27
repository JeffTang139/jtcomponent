/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import org.eclipse.jt.script.assist.visit.IAstWalker;

/**
 * @author Jeff Tang
 *
 */
public interface ITableAstWalker extends IAstWalker {

	public boolean enterColumnDeclaration		 		(ColumnDeclaration  	  		ast);
	public boolean enterColumnDefaultStatement   		(ColumnDefaultStatement  		ast);
	public boolean enterColumnRelationStatement  		(ColumnRelationStatement 		ast);
	public boolean enterColumnsStatement         		(ColumnsStatement        		ast);
	public boolean enterHierarchiesStatement     		(HierarchiesStatement    		ast);
	public boolean enterHierarchyDeclaration     		(HierarchyDeclaration    		ast);
	public boolean enterIndexColumnStatement     		(IndexColumnStatement    		ast);
	public boolean enterIndexDeclaration         		(IndexDeclaration        		ast);
	public boolean enterIndexesStatment          		(IndexesStatment         		ast);
	public boolean enterPartitionStatement       		(PartitionStatement      		ast);
	public boolean enterRelationDeclaration      		(RelationDeclaration     		ast);
	public boolean enterRelationsStatement       		(RelationsStatement      		ast);
	public boolean enterTableColumnReference     		(TableColumnReference    		ast);
	public boolean enterAbstractTableDeclaration     	(AbstractTableDeclaration    	ast);
	public boolean enterAbstractTableDefineStatement 	(AbstractTableDefineStatement	ast);
	public boolean enterNormalTableDeclaration     		(NormalTableDeclaration   		ast);
	public boolean enterNormalTableDefineStatement   	(NormalTableDefineStatement 	ast);
	public boolean enterColumnTypeReference			   	(ColumnTypeReference		 	ast);

	public boolean exitColumnDeclaration		 		(ColumnDeclaration  	  		ast);  
	public boolean exitColumnDefaultStatement   		(ColumnDefaultStatement  		ast);  
	public boolean exitColumnRelationStatement  		(ColumnRelationStatement 		ast);  
	public boolean exitColumnsStatement         		(ColumnsStatement        		ast);  
	public boolean exitHierarchiesStatement     		(HierarchiesStatement    		ast);  
	public boolean exitHierarchyDeclaration     		(HierarchyDeclaration    		ast);  
	public boolean exitIndexColumnStatement     		(IndexColumnStatement    		ast);  
	public boolean exitIndexDeclaration         		(IndexDeclaration        		ast);  
	public boolean exitIndexesStatment          		(IndexesStatment         		ast);  
	public boolean exitPartitionStatement       		(PartitionStatement      		ast);  
	public boolean exitRelationDeclaration      		(RelationDeclaration     		ast);  
	public boolean exitRelationsStatement       		(RelationsStatement      		ast);  
	public boolean exitTableColumnReference     		(TableColumnReference    		ast);  
	public boolean exitAbstractTableDeclaration     	(AbstractTableDeclaration    	ast);  
	public boolean exitAbstractTableDefineStatement 	(AbstractTableDefineStatement	ast);  
	public boolean exitNormalTableDeclaration     		(NormalTableDeclaration   		ast);  
	public boolean exitNormalTableDefineStatement   	(NormalTableDefineStatement 	ast);  
	public boolean exitColumnTypeReference			   	(ColumnTypeReference		 	ast);  
	
	
	
}

