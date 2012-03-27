/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;


/**
 * @author Jeff Tang
 *
 */
public abstract class Declaration extends AbstractAstNode {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.DECLARATION;

	protected TokenNode fName;
	
	public Declaration(ISourcePosition position, TokenNode name) {
		super(position);
		setName(name);
	}

	public TokenNode getName() {
		return fName;
	}

	public void setName(TokenNode name) {
		fName = name;
		this.updatePosition(name);
	}
	
	public String getTitle() {
		return fName!=null? fName.getTexture() : null;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
