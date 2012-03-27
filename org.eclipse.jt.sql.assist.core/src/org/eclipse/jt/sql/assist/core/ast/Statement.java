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
public abstract class Statement extends AbstractAstNode {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.STATEMENT;

	public Statement(ISourcePosition position) {
		super(position);
	}


	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
