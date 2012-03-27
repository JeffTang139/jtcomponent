/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeInfo;

/**
 * @author Jeff Tang
 *
 */
public final class StructuredAstNodeInfo<TSNode extends IStructuredAstNode<TSNode>, TScope extends IDataScope<TScope>>
		implements IStructuredAstNodeInfo<TSNode, TScope> {
	
	private final IAstNode fAst;
	private final TScope fScope;
	private final int fLevel;
	private final int fIndex;
	private final TSNode fParent;
	private final String fTitle;
	private final ISourcePosition fTitlePosition;
	
	
	public StructuredAstNodeInfo(IAstNode ast, TScope scope, int level, int index, TSNode parent, String title, ISourcePosition titlePosition) {
		fAst=ast;
		fScope=scope;
		fLevel=level;
		fIndex=index;
		fParent=parent;
		fTitle=title;
		fTitlePosition=titlePosition;
	}

	public IAstNode getAst() {
		return fAst;
	}

	/**
	 * 标记，（保留的属性）
	 */
	@Deprecated
	public int getFlag() {
		return 0;
	}

	public int getIndex() {
		return fIndex;
	}

	public int getLevel() {
		return fLevel;
	}

	public TSNode getParent() {
		return fParent;
	}

	public TScope getScope() {
		return fScope;
	}

	public String getTitle() {
		return fTitle;
	}

	public ISourcePosition getTitlePosition() {
		return fTitlePosition;
	}

}
