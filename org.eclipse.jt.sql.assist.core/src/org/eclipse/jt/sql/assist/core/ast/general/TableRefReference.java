/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IFunctionParameter;
import org.eclipse.jt.sql.assist.core.ast.Reference;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public class TableRefReference extends Reference implements IFunctionParameter , IGeneralAstNode{

	public static final long CATEGORY_KIND = AstCategoryKinds.FUNCTION_PARAMETER | AstCategoryKinds.REFERENCE;

	public TableRefReference(ISourcePosition position, String targetName) {
		super(position, DnaSqlUtils.getUnlimitID(targetName));
	}
	
	public void setTargetName(String targetName, ISourcePosition pos) {
		super.setTargetName(DnaSqlUtils.getUnlimitID(targetName), pos);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.TABLE_REF_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IGeneralAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitTableRefReference(this, data);
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

}
