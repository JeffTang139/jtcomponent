/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.ast;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractBufferedStructuredAstNode<TSNode extends AbstractBufferedStructuredAstNode<TSNode>> extends AbstractStaticStructuredAstNode<TSNode> {
	
	protected IStructuredAstNodeProvider<TSNode,?> fNodeProvider; 
	
	/**
	 * @param position
	 */
	protected AbstractBufferedStructuredAstNode(IAstNode ast, int level, int index, TSNode parent, IStructuredAstNodeProvider<TSNode,?> nodeProvider) {
		super(ast, level, index, parent);
		fNodeProvider=nodeProvider;
	}
	
	@Override
	public ISourcePosition getBodyPosition() {
		if(fBodyPosition==null && fAst!=null) {
			fBodyPosition=fAst.getPosition();
		}
		return fBodyPosition;
	}


	public IStructuredAstNodeProvider<TSNode,?> getNodeProvider() {
		return fNodeProvider;
	}

	public void setNodeProvider(IStructuredAstNodeProvider<TSNode,?> nodeProvider) {
		fNodeProvider = nodeProvider;
	}

	public boolean hasChildren() throws Throwable {
		this.getChildren();
		return super.hasChildren();
	}


	public TSNode[] getChildren() {
		if(fChildren==null) {
			fChildren=fNodeProvider.getChildren(self());
		}
		return fChildren;
	}
	
	public abstract TSNode self();

}
