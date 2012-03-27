/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.sql.assist.core.visit.access.AbstractAstAccessor;


/**
 * @author Jeff Tang
 *
 */
public class AbstractConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends IDataScope<TScope>> 
		extends AbstractAstAccessor<TScope> {
	
	private BaseConstructionAccessor<TSNode, TScope> fBaseConstructionWalker;
	private ConstructionData<TSNode> fConstructionData;
	
	public AbstractConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode, TScope> provider) {
		this(new BaseConstructionAccessor<TSNode, TScope>(data, provider));
	}
	
	public AbstractConstructionAccessor(BaseConstructionAccessor<TSNode, TScope> baseWalker) {
		super(baseWalker);
		fBaseConstructionWalker=baseWalker;
		fConstructionData=fBaseConstructionWalker.getConstructionData();
	}
	
	public BaseConstructionAccessor<TSNode, TScope> getBaseConstructionWalker() {
		return fBaseConstructionWalker;
	}

	public void setBaseConstructionWalker(
			BaseConstructionAccessor<TSNode, TScope> baseConstructionWalker) {
		super.setBaseAccessor(baseConstructionWalker);
		fBaseConstructionWalker = baseConstructionWalker;
		fConstructionData=fBaseConstructionWalker.getConstructionData();
	}

	@Override
	public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
		return this.fBaseConstructionWalker.getAdaptor(clazz);
	}
	
	protected IPositionManager getPositionManager() {
		return this.fConstructionData.getPositionManager();
	}
	
	protected ConstructionData<TSNode> getConstructionData() {
		return this.fConstructionData;
	}
	
	protected boolean dealRoot(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		return this.fBaseConstructionWalker.dealRoot(ast, scope, title, titlePosition);
	}
	
	protected boolean isRootCase() {
		return this.fBaseConstructionWalker.isRootCase();
	}
	
	protected boolean dealParent(IAstNode ast) {
		return this.fBaseConstructionWalker.dealParent(ast);
	}
	
	protected void dealChild(IAstNode ast, TScope scope, String title, ISourcePosition titlePosition) {
		this.fBaseConstructionWalker.dealChild(ast, scope, title, titlePosition);
	}
	
	protected void addChild(TSNode child) {
		this.fBaseConstructionWalker.addChild(child);
	}
	
	protected ISourcePosition createPosition(int offset, int length) {
		return this.fBaseConstructionWalker.createPosition(offset, length);
	}
	
	protected void report(Throwable throwable, Object reporter) {
		this.fConstructionData.report(throwable, reporter);
	}
	
	protected void debug(String message) {
		this.fConstructionData.debug(message);
	}
	
	protected void fatal(String message) {
		this.fConstructionData.fatal(message);
	}
	
	protected void info(String message) {
		this.fConstructionData.info(message);
	}
	
	protected void enter(Class<?> type) {
		this.fConstructionData.enter(type);
	}
	
	protected void exit(Class<?> type) {
		this.fConstructionData.exit(type);
	}
}
