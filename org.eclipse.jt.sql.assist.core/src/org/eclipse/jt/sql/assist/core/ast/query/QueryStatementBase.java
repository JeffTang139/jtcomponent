/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;


/**
 * @author Jeff Tang
 *
 */
public abstract class QueryStatementBase extends Statement {

	protected WithStatement fWith;
	protected SelectStatement fSelect;
	protected FromStatement fFrom;
	protected WhereStatement fWhere;
	protected GroupStatement fGroup;
	protected HavingStatement fHaving;
	protected OrderStatement fOrder;
	
	protected List<UnionStatement> fUnions;
	

	public QueryStatementBase(ISourcePosition position) {
		super(position);
	}
	
	public WithStatement getWith() {
		return fWith;
	}

	public void setWith(WithStatement with) {
		this.fWith = with;
		this.updatePosition(with);
	}

	/**
	 * @return the fSelect
	 */
	public SelectStatement getSelect() {
		return fSelect;
	}

	/**
	 * @param select the fSelect to set
	 */
	public void setSelect(SelectStatement select) {
		fSelect = select;
		this.updatePosition(fSelect);
	}

	/**
	 * @return the fFrom
	 */
	public FromStatement getFrom() {
		return fFrom;
	}

	/**
	 * @param from the fFrom to set
	 */
	public void setFrom(FromStatement from) {
		fFrom = from;
		this.updatePosition(fFrom);
	}

	/**
	 * @return the fWhere
	 */
	public WhereStatement getWhere() {
		return fWhere;
	}

	/**
	 * @param where the fWhere to set
	 */
	public void setWhere(WhereStatement where) {
		fWhere = where;
		this.updatePosition(fWhere);
	}

	/**
	 * @return the fGroup
	 */
	public GroupStatement getGroup() {
		return fGroup;
	}

	/**
	 * @param group the fGroup to set
	 */
	public void setGroup(GroupStatement group) {
		fGroup = group;
		this.updatePosition(fGroup);
	}

	/**
	 * @return the fHaving
	 */
	public HavingStatement getHaving() {
		return fHaving;
	}

	/**
	 * @param having the fHaving to set
	 */
	public void setHaving(HavingStatement having) {
		fHaving = having;
		this.updatePosition(fHaving);
	}

	/**
	 * @return the fOrder
	 */
	public OrderStatement getOrder() {
		return fOrder;
	}

	/**
	 * @param order the fOrder to set
	 */
	public void setOrder(OrderStatement order) {
		fOrder = order;
		this.updatePosition(fOrder);
	}
	

	public List<UnionStatement> getUnions() {
		return fUnions;
	}
	
	public void addUnion(UnionStatement union) {
		if(fUnions==null) fUnions=new ArrayList<UnionStatement>();
		this.fUnions.add(union);
		this.updatePosition(union);
	}
}
