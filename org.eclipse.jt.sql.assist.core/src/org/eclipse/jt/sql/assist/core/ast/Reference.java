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
public abstract class Reference extends AbstractAstNode {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.REFERENCE;

	protected String fTargetName;
	
	public Reference(ISourcePosition position, String targetName) {
		super(position);
		fTargetName=targetName;
	}

	public String getTargetName() {
		return fTargetName;
	}

	public void setTargetName(String targetName, ISourcePosition pos) {
		this.updatePosition(pos);
		fTargetName = targetName;
	}
	
	public String getTitle() {
		return fTargetName;
	}


	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
