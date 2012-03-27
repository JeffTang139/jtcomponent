/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.visit.IAstWalker;


/**
 * @author Jeff Tang
 *
 */
public class CollectChildrenBaseWalker implements IAstWalker {
	
	private IAstNode parent=null;
	private List<IAstNode> children=new ArrayList<IAstNode>();

	public boolean enterGeneral(IAstNode ast) {
		if(parent==null || parent==ast) {
			parent=ast;
			children.clear();
			return true;
		} else {
			children.add(ast);
			return false;
		}
	}

	public boolean exitGeneral(IAstNode ast) {
		if(ast==parent) {
			parent=null;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		if(List.class.equals(clazz)) {
			return (TAdaptor) children;
		} else if(IAstNode.class.equals(clazz)) {
			return (TAdaptor) parent;
		}
		return null;
	}
	
	public void setParent(IAstNode parent) {
		this.parent=parent;
	}
	
	public IAstNode[] getChildren() {
		return children.toArray(new IAstNode[children.size()]);
	}
	
}