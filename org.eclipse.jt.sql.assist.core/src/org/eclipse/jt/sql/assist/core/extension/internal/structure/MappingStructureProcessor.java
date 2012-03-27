/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;


/**
 * @author Jeff Tang
 *
 */
public class MappingStructureProcessor<TScope extends AbstractMappingDataScope<TScope>> 
		extends QueryStructureProcessor<TScope> {
	
	public static MappingStructureProcessor<?> getInstance() {
		return new MappingStructureProcessor<MappingDataScope>();
	}

	protected MappingStructureProcessor() {
		
	}
	
	@Override
	protected <TSNode extends IStructuredAstNode<TSNode>> IAstAccessor<TScope> createConstructionAccessor(ConstructionData<TSNode> data,
			IStructuredAstNodeProvider<TSNode, TScope> nodeProvider) {
		return new MappingConstructionAccessor<TSNode, TScope>(data, nodeProvider);
	}
	
	@Override
	protected int getKind() {
		return DnaSql.ORM_DEFINE;
	}

}
