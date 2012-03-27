/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.data.AbstractGeneralDataScope;


/**
 * @author Jeff Tang
 *
 */
public abstract class GeneralStructureProcessor<TScope extends AbstractGeneralDataScope<TScope>> 
		extends AbstractStructureProcessor<TScope> {

	@Override
	protected <TSNode extends IStructuredAstNode<TSNode>> IAstAccessor<TScope> createConstructionAccessor(ConstructionData<TSNode> data,
			IStructuredAstNodeProvider<TSNode, TScope> nodeProvider) {
		return new GeneralConstructionAccessor<TSNode, TScope>(data, nodeProvider);
	}

}
