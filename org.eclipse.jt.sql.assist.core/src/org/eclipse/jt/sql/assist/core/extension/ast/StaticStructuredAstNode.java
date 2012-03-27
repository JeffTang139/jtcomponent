/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.ast;

import org.eclipse.jt.script.assist.IAstNode;

/**
 * @author Jeff Tang
 * 
 */
public class StaticStructuredAstNode extends AbstractStaticStructuredAstNode<StaticStructuredAstNode> {

	/**
	 * @param ast
	 * @param level
	 */
	public StaticStructuredAstNode(IAstNode ast, int level, int index, StaticStructuredAstNode parent) {
		super(ast, level, index, parent);
	}
//
//	@Override
//	public boolean titllyEquals(IAstNode other) {
//		if(this==other) return true;
//		if(null==other || !(other instanceof StaticStructuredAstNode)) return false;
//		StaticStructuredAstNode odsan=(StaticStructuredAstNode)other;
//
//		if(this.fLevel!=odsan.fLevel) return false;
//		if(this.fAst!=null && odsan.getAst()!=null
//				&& this.fAst.getNodeKind()!=odsan.getAst().getNodeKind()) {
//			return false;
//		}
//		String thistitle=this.getTitle();
//		String othertitle=other.getTitle();
//		return (thistitle==null && othertitle==null) || AstUtil.equals(thistitle, othertitle);
//	}
}
