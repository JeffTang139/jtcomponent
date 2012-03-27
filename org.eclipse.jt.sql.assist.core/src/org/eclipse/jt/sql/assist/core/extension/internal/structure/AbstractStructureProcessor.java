/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.extension.IStructureProcessor;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.process.AbstractMessager;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractStructureProcessor<TScope extends IDataScope<TScope>> extends AbstractMessager<IWarnings> implements
		IStructureProcessor<TScope> {
	
	public static boolean DEBUG = Boolean.parseBoolean(System.getProperty("dnasql.assist.structureprocessor.debug"));
	
	protected boolean fDetails;
	protected IPositionManager fPositionManager;
	protected IDataProvider fDataLoader;
	protected int fPolicy;
	
	
	public <TSNode extends IStructuredAstNode<TSNode>> 
			TSNode build(IAstNode ast, IStructuredAstNodeProvider<TSNode, TScope> provider, IDataProvider loader) {
		return build(ast, provider, loader, createWalkProcessor());
	}
	
	public <TSNode extends IStructuredAstNode<TSNode>> 
			TSNode build(IAstNode ast, IStructuredAstNodeProvider<TSNode, TScope> provider, IDataProvider loader, IVisitDriver<TScope> walkProcessor) {
		ConstructionData<TSNode> data=createConstructionData();
		IAstAccessor<TScope> walker=createAccessor(data, provider, loader);
		walkProcessor.initialize(walker, loader);
		try { 
			walkProcessor.process(ast);
		} catch (Throwable e) {
			if(fWarnings!=null) {
				report(e, this);
			} else {
				e.printStackTrace();
			}
		}
		return data.result;
	}
	
	public <TSNode extends IStructuredAstNode<TSNode>> TSNode locate(TSNode root,
			ISourcePosition pos, List<TSNode> pathRequestor) {
		if(pos==null) return null;
		if(fPositionManager!=null) pos=fPositionManager.fix(pos);
		return internalLocate(root, pos, pathRequestor);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IStructureProcessor#setProperty(java.lang.String, java.lang.Object)
	 */
	public void setProperty(String property, Object value) {
		if(PROPERTY_DETAILS.equals(property)) {
			Boolean det=(Boolean)value;
			if(det!=null) fDetails=det.booleanValue();
		} else if(PROPERTY_POLICY.equals(property)) {
			fPolicy=(Integer)value;
		} else if(PROPERTY_WARNINGS.equals(property)) {
			fWarnings=(IWarnings) value;
		} else if(PROPERTY_POSITION_MANAGER.equals(property)) {
			fPositionManager=(IPositionManager)value;
		} else {
			throw new IllegalArgumentException("unknown structure processor's property: " + String.valueOf(property));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected IVisitDriver<TScope> createWalkProcessor() {
		return (IVisitDriver<TScope>) DnaSql.getDefault().createVisitDriver(getKind(),fPolicy);
	}
	
	protected <TSNode extends IStructuredAstNode<TSNode>>  ConstructionData<TSNode> createConstructionData() {
		ConstructionData<TSNode> data=new ConstructionData<TSNode>(fWarnings);
		data.setDataLoader(fDataLoader);
		data.setPositionManager(fPositionManager);
		data.setDetails(fDetails);
		return data;
	}

	protected <TSNode extends IStructuredAstNode<TSNode>> 
			IAstAccessor<TScope> createAccessor(ConstructionData<TSNode> data,
					IStructuredAstNodeProvider<TSNode,TScope> provider,
					IDataProvider loader) {
		IAstAccessor<TScope> accessor=createConstructionAccessor(data, provider);
		provider.initialize(accessor, loader);
		return accessor;
	}
	
	protected <TSNode extends IStructuredAstNode<TSNode>> 
			IAstAccessor<TScope> createConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode,TScope> nodeProvider) {
		return new BaseConstructionAccessor<TSNode, TScope>(data,nodeProvider);
	}
	
	protected <TSNode extends IStructuredAstNode<TSNode>> TSNode internalLocate(TSNode snode, ISourcePosition pos, List<TSNode> pathRequestor) {
		ISourcePosition body=snode.getBodyPosition();
		if(body.contains(pos)) {
			if(pathRequestor!=null) pathRequestor.add(snode);
			TSNode[] children = null ;
			try {
				children = snode.getChildren();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			if(children!=null) {
				for(int i=0;i<children.length;i++) {
					TSNode located=internalLocate(children[i], pos, pathRequestor);
					if(located!=null)
						return located;
				}
			}
			return snode;
		}
		return null;
	}
	
	protected abstract int getKind();


}
