/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.ast;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;

/**
 * @author Jeff Tang
 *
 */
public class BufferedStructuredAstNode extends
		AbstractBufferedStructuredAstNode<BufferedStructuredAstNode> {

	/**
	 * @param ast
	 * @param level
	 * @param nodeProvider
	 */
	public BufferedStructuredAstNode(IAstNode ast, int level, int index, BufferedStructuredAstNode parent,
			IStructuredAstNodeProvider<BufferedStructuredAstNode,?> nodeProvider) {
		super(ast, level, index, parent, nodeProvider);
	}
//	
//	@Override
//	public boolean titllyEquals(IAstNode other) {
//		if(this==other) return true;
//		if(null==other || !(other instanceof BufferedStructuredAstNode)) return false;
//		BufferedStructuredAstNode odsan=(BufferedStructuredAstNode)other;
//		if(this.fLevel!=odsan.fLevel) return false;
//		if(this.fAst!=null && odsan.getAst()!=null
//				&& this.fAst.getNodeKind()!=odsan.getAst().getNodeKind()) {
//			return false;
//		}
//		String thistitle=this.getTitle();
//		String othertitle=other.getTitle();
//		return (thistitle==null && othertitle==null) || AstUtil.equals(thistitle, othertitle);
//	}

	@Override
	public BufferedStructuredAstNode self() {
		return this;
	}
}
