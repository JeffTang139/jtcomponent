/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IDeclaration;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.IArgumentContainer;


/**
 * @author Jeff Tang
 *
 */
public abstract class QueryDeclarationBase 
		extends QueryStatementBase 
		implements IArgumentContainer, IDeclaration {
	
	protected TokenNode fName;

	protected List<ArgumentDeclaration> fArguments;

	public QueryDeclarationBase(ISourcePosition position, TokenNode name) {
		super(position);
		this.fName=name;
	}

	/**
	 * @return the fName
	 */
	public TokenNode getName() {
		return fName;
	}

	/**
	 * @param name the fName to set
	 */
	public void setName(TokenNode name) {
		this.fName=name;
		this.updatePosition(name);
	}
	
	public List<ArgumentDeclaration> getArguments() {
		return this.fArguments;
	}
	
	public void addArgument(ArgumentDeclaration argument) {
		if(this.fArguments==null) this.fArguments=new ArrayList<ArgumentDeclaration>(4);
		this.fArguments.add(argument);
		this.updatePosition(argument);
	}

	public String getTitle() {
		return fName!=null?fName.getTexture():null;
	}
}
