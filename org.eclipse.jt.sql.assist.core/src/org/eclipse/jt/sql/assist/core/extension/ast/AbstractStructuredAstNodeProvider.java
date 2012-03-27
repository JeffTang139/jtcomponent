/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.ast;

import java.util.List;

import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.extension.internal.structure.BaseConstructionAccessor;



/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractStructuredAstNodeProvider<TSNode extends IStructuredAstNode<TSNode>, TScope extends IDataScope<TScope>> 
		implements IStructuredAstNodeProvider<TSNode, TScope> {
	
	private BaseConstructionAccessor<TSNode, TScope> fBaseWalker;
	private IAstAccessor<TScope> fAccessor;
	private IVisitDriver<TScope> fProcessor;
	
	@SuppressWarnings("unchecked")
	protected AbstractStructuredAstNodeProvider(int sqlKind, int policy) {
		this((IVisitDriver<TScope>) DnaSql.getDefault().createVisitDriver(sqlKind, policy));
	}
	
	protected AbstractStructuredAstNodeProvider(IVisitDriver<TScope> processor) {
		fProcessor=processor;
	}
	
	public IVisitDriver<?> getProcessor() {
		return fProcessor;
	}
	
	public TSNode[] getChildren(TSNode parent) {
		if(parent==null||parent.getAst()==null) return null;
		fBaseWalker.setCurrentParent(parent);
		try {
			fProcessor.process(parent.getAst());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return castChildren(fBaseWalker.getCurrentChildren());
	}
	
	protected abstract TSNode[] castChildren(List<TSNode> list);

	public IAstAccessor<TScope> getWalker() {
		return fAccessor;
	}

	@SuppressWarnings("unchecked")
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		fAccessor = accessor;
		if(fAccessor!=null) {
			fProcessor.initialize(accessor, dataLoader);
			fBaseWalker = fAccessor.getAdaptor(BaseConstructionAccessor.class);
		}
	}

//	@SuppressWarnings("unchecked")
//	public TSNode getNode(IAstNode ast, int level, String title,
//			ISourcePosition titlePosition) {
//		BufferedStructuredAstNode<?> node=new BufferedStructuredAstNode<BufferedStructuredAstNode<?>>(ast,level,(IStructuredAstNodeProvider<BufferedStructuredAstNode<?>>) this);
//		node.setTitle(title);
//		node.setTitlePosition(titlePosition);
//		return (TSNode) node;
//	}
//
//	@SuppressWarnings("unchecked")
//	public TSNode getNode(IAstNode ast, int level, String title,
//			ISourcePosition titlePosition, int flag) {
//		BufferedStructuredAstNode<?> node=new BufferedStructuredAstNode<BufferedStructuredAstNode<?>>(ast,level,(IStructuredAstNodeProvider<BufferedStructuredAstNode<?>>) this);
//		node.setTitle(title);
//		node.setTitlePosition(titlePosition);
//		return (TSNode) node;
//	}

	public int getChildrenCount(TSNode parent) {
		if(parent==null||parent.getAst()==null) return 0;
		fBaseWalker.setCurrentParent(parent);
		try {
			fProcessor.process(parent.getAst());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return fBaseWalker.getCurrentChildren().size();
	}

}
