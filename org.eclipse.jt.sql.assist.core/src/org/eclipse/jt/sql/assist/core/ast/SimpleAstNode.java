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
public class SimpleAstNode extends AbstractAstNode {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.UNDEFINED;

	public SimpleAstNode(ISourcePosition position) {
		super(position);
	}

	public int getNodeKind() {
		return BaseAstKinds.UNKNOWN;
	}
	

	public String getTitle() {
		return null;
	}


	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
