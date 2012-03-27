/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.ast;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.sql.assist.core.ast.AbstractAstNode;
import org.eclipse.jt.sql.assist.core.ast.BaseAstKinds;
import org.eclipse.jt.sql.assist.core.kinds.AstCategoryKinds;



/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractStaticStructuredAstNode<TSNode extends AbstractStaticStructuredAstNode<TSNode>> extends AbstractAstNode 
			implements IStructuredAstNode<TSNode> {
	
	public static final long CATEGORY_KIND = AstCategoryKinds.STRUCTURED;

	protected final IAstNode fAst;
	protected final int fLevel;
	protected final int fIndex;
	protected final TSNode fParent;
	protected TSNode[] fChildren;
	protected String fTitle;
	protected ISourcePosition fTitlePosition;
	protected ISourcePosition fBodyPosition;
	
	/**
	 * @param position
	 */
	protected AbstractStaticStructuredAstNode(IAstNode ast, int level, int index, TSNode parent) {
		super(ast!=null?ast.getPosition():null);
		fParent=parent;
		fAst=ast;
		fLevel=level;
		fIndex=index;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return BaseAstKinds.STRUCTURED;
	}

	public IAstNode getAst() {
		return fAst;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getTitle()
	 */
	public String getTitle() {
		if(fTitle==null && fAst!=null) {
			fTitle = fAst.getTitle();
		}
		return fTitle;
	}
	
	public void setTitle(String title) {
		this.fTitle = title;
	}

	public ISourcePosition getTitlePosition() {
		return fTitlePosition;
	}

	public void setTitlePosition(ISourcePosition titlePosition) {
		fTitlePosition = titlePosition;
	}

	public ISourcePosition getBodyPosition() {
		return fBodyPosition;
	}
	
	public void setBodyPosition(ISourcePosition bodyPosition) {
		this.fBodyPosition=bodyPosition;
	}
	
	public TSNode getParent() throws Throwable {
		return fParent;
	}

	public TSNode[] getChildren() throws Throwable {
		return fChildren;
	}

	public void setChildren(TSNode[] children) {
		fChildren = children;
	}

	public int getFlags() {
		return 0;
	}

	public long getCategoryKind() {
		return CATEGORY_KIND;
	}

	public int getLevel() {
		return fLevel;
	}
	public int getIndex() {
		return fIndex;
	}

	public boolean hasChildren() throws Throwable {
		return fChildren!=null && fChildren.length>0;
	}

	public int getChildrenCount() throws Throwable {
		return fChildren!=null?fChildren.length:0;
	}

	
	@Override
	public boolean structuralEquals(IAstNode other) {
		if(this==other) return true;
		if(null==other || !(other instanceof AbstractStaticStructuredAstNode<?>)) return false;
		AbstractStaticStructuredAstNode<?> odsan=(AbstractStaticStructuredAstNode<?>)other;
		if(this.fLevel!=odsan.fLevel
				|| this.fIndex!=odsan.fIndex) return false;
//		if(this.fAst!=null && odsan.getAst()!=null
//				&& this.fAst.getNodeKind()!=odsan.getAst().getNodeKind()) {
//			return false;
//		}
//		String thistitle=this.getTitle();
//		String othertitle=other.getTitle();
//		return (thistitle==null && othertitle==null) || AstUtil.equals(thistitle, othertitle);
		return true;
	}
}
