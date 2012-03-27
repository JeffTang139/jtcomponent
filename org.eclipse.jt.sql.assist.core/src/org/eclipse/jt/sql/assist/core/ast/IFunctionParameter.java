/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;


/**
 * @author Jeff Tang
 *
 */
public interface IFunctionParameter extends IAstNode {

	public static final long CATEGORY_KIND = AstCategoryKinds.FUNCTION_PARAMETER;

}
