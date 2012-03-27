/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeInfo;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.util.DnaSqlUtils;


/**
 * @author Jeff Tang
 *
 */
public class BaseConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends IDataScope<TScope>> 
		implements IAstAccessor<TScope> {
	
	private TSNode parent=null;
	private List<TSNode> children=new ArrayList<TSNode>();
	private TSNode last;
	private IStructuredAstNodeProvider<TSNode,TScope> provider;
	private ConstructionData<TSNode> data;
	
	public BaseConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode,TScope> provider) {
		this.data=data;
		this.provider=provider;
	}

	public boolean enterGeneral(IAstNode ast, TScope scope) {
		return dealNode(ast,scope,null,ast.getPosition());
	}
	
	public boolean dealNode(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		if(dealRoot(ast, scope, title, titlePosition)) { // 创建根节点的情况
			return false;
		} else if(dealParent(ast)) {			// 获取子节点时，访问到父节点的情况
			return true;
		} else {								// 获取子节点时，访问到子节点的情况
			dealChild(ast, scope, title, titlePosition);
			return false;
		}
	}
	
	public boolean isRootCase() {
		return parent==null;
	}

	public boolean exitGeneral(IAstNode ast, TScope scope) {
		if(parent!=null && parent.getAst()==ast) {
			parent=null;
		}
		return false;
	}
	
	public boolean dealRoot(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		if(isRootCase()) {
			data.result = createRootNode(ast, scope, title, titlePosition);
			return true;
		}
		return false;
	}
	
	public boolean dealParent(IAstNode ast) {
		if(parent.getAst()==ast) { // 调用此方法的前提是parent存在，即不为null
			children.clear();
			last=null;
			return true;
		} 
		return false;
	}
	
	public void dealChild(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		addChild(createChildNode(ast, scope, title, titlePosition));
	}
	
	public void addChild(TSNode child) {
		children.add(child);
		last=child;
	}
	
	public TSNode createNode(IAstNode ast, TScope scope, int level, String title, ISourcePosition titlePosition) {
		return provider.getNode(createNodeInfo(ast, scope, level, title, titlePosition));
	}
	
	public TSNode createRootNode(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		return provider.getNode(createNodeInfo(ast, scope, 0, title, titlePosition));
	}
	
	public TSNode createChildNode(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		return provider.getNode(createNodeInfo(ast, scope, parent.getLevel()+1, title, titlePosition));
	}
	
	public IStructuredAstNodeInfo<TSNode, TScope> createNodeInfo(IAstNode ast, TScope scope, int level, String title, ISourcePosition titlePosition) {
		return new StructuredAstNodeInfo<TSNode, TScope>(ast, scope, level, children.size(), parent, title, titlePosition);
	} 
	
	public ISourcePosition createPosition(int offset, int length) {
		IPositionManager posMgr=data.getPositionManager();
		if(posMgr!=null) {
			return posMgr.getSourcePosition(offset, length);
		} else {
			return DnaSqlUtils.getSourcePosition(offset, length);
		}
	}


	@SuppressWarnings("unchecked")
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		if(BaseConstructionAccessor.class.equals(clazz)) {
			return (TAdaptor) this;
		}
		return null;
	}
	
	public void setCurrentParent(TSNode parent) {
		this.parent=parent;
	}
	
	public TSNode getCurrentParent() {
		return this.parent;
	}
	
	public List<TSNode> getCurrentChildren() {
		return children;
	}
	
	public TSNode getLast() {
		return last;
	}

	public IStructuredAstNodeProvider<TSNode, TScope> getNodeProvider() {
		return provider;
	}

	public void setNodeProvider(IStructuredAstNodeProvider<TSNode, TScope> provider) {
		this.provider = provider;
	}

	public ConstructionData<TSNode> getConstructionData() {
		return data;
	}

	public void setConstructionData(ConstructionData<TSNode> data) {
		this.data = data;
	}
	
}