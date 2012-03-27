/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.table;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;


/**
 * @author Jeff Tang
 *
 */
public abstract class TableDefineStatementBase extends Statement implements
		ITableAstNode {
	
	public static final String TABLE_TITLE = "table";

	protected ColumnsStatement fColumns;
	protected List<ColumnsStatement> fSegments;
	protected IndexesStatment fIndexes;
	protected RelationsStatement fRelations;
	protected HierarchiesStatement fHierarchies;
	protected PartitionStatement fPartition;
	
	/**
	 * @param position
	 */
	public TableDefineStatementBase(ISourcePosition position) {
		super(position);
	}
	

	public ColumnsStatement getColumns() {
		return fColumns;
	}

	public void setColumns(ColumnsStatement columns) {
		this.fColumns = columns;
		this.updatePosition(columns);
	}

	public List<ColumnsStatement> getSegments() {
		return fSegments;
	}
	
	public void addSegment(ColumnsStatement segment) {
		if(fSegments==null) fSegments = new ArrayList<ColumnsStatement>();
		fSegments.add(segment);
		this.updatePosition(segment);
	}

	public IndexesStatment getIndexes() {
		return fIndexes;
	}

	public void setIndexes(IndexesStatment indexes) {
		this.fIndexes = indexes;
		this.updatePosition(indexes);
	}

	public RelationsStatement getRelations() {
		return fRelations;
	}

	public void setRelations(RelationsStatement relations) {
		this.fRelations = relations;
		this.updatePosition(relations);
	}

	public HierarchiesStatement getHierarchies() {
		return fHierarchies;
	}

	public void setHierarchies(HierarchiesStatement hierarchies) {
		this.fHierarchies = hierarchies;
		this.updatePosition(hierarchies);
	}

	public PartitionStatement getPartition() {
		return fPartition;
	}

	public void setPartition(PartitionStatement partition) {
		this.fPartition = partition;
		this.updatePosition(partition);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		return TABLE_TITLE;
	}

}
