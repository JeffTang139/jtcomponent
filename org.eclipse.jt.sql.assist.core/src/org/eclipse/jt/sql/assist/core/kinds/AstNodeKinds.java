/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.kinds;

import org.eclipse.jt.sql.assist.core.ast.BaseAstKinds;
import org.eclipse.jt.sql.assist.core.ast.general.GeneralAstKinds;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingAstKinds;
import org.eclipse.jt.sql.assist.core.ast.query.QueryAstKinds;

/**
 * 所有抽象语法树节点的类型，用16位整型表示。
 * @author Jeff Tang
 *
 */
public interface AstNodeKinds extends  BaseAstKinds, GeneralAstKinds, QueryAstKinds,
		MappingAstKinds {

}
