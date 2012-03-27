/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;


/**
 * @author Jeff Tang
 *
 */
public class TokenNode extends AbstractAstNode {

	public static final long CATEGORY_KIND = AstCategoryKinds.TOKEN;
	
	private String fTexture;

	public TokenNode(String texture, ISourcePosition position) {
		super(position);
		this.fTexture = texture;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return BaseAstKinds.TOKEN;
	}

	public String getTexture() {
		return fTexture;
	}

	public void setTexture(String texture, ISourcePosition position) {
		this.fTexture = texture;
		this.fPosition=position;
	}

	public String getTitle() {
		return fTexture;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

	@Override
	public String toString() {
		return fTexture;
	}
}
