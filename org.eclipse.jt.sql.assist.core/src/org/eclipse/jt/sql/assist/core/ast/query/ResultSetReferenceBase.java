/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IAliasHolder;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public abstract class ResultSetReferenceBase extends TableReferenceStatement
		implements IAliasHolder{
	
	public static final String AS_WORD = "as";
	
	protected TokenNode fAs;
	protected TokenNode fAlias;
	protected boolean fForUpdate;
	
	public ResultSetReferenceBase(ISourcePosition begin, boolean forUpdate, ISourcePosition end) {
		super(union(begin,end), null);
		this.fForUpdate=forUpdate;
	}

	/**
	 * @return the fForUpdate
	 */
	public boolean isForUpdate() {
		return fForUpdate;
	}

	/**
	 * @param forUpdate the fForUpdate to set
	 */
	public void setForUpdate(boolean forUpdate, ISourcePosition pos) {
		this.updatePosition(pos);
		fForUpdate = forUpdate;
	}
	/**
	 * @return the fAlias
	 */
	public TokenNode getAlias() {
		return fAlias;
	}

	/**
	 * @param alias the fAlias to set
	 */
	public void setAlias(String alias, ISourcePosition pos) {
		this.updatePosition(pos);
		fAlias = new TokenNode (DnaSqlUtils.getUnlimitID(alias), pos);
	}

	public void setAlias(TokenNode alias) {
		fAlias = alias;
		this.updatePosition(alias);
	}



	public TokenNode getAs() {
		return fAs;
	}

	public void setAs(TokenNode as) {
		fAs = as;
	}
}
