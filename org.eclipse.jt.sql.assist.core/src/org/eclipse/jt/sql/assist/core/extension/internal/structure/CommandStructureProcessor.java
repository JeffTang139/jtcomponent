/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;
import org.eclipse.jt.sql.assist.core.data.CommandDataScope;


/**
 * @author Jeff Tang
 *
 */
public class CommandStructureProcessor<TScope extends AbstractCommandDataScope<TScope>> 
	extends QueryStructureProcessor<TScope> {

	public static CommandStructureProcessor<?> getInstance() {
		return new CommandStructureProcessor<CommandDataScope>();
	}

	protected CommandStructureProcessor() {
		
	}
	
	@Override
	protected <TSNode extends IStructuredAstNode<TSNode>> IAstAccessor<TScope> createConstructionAccessor(ConstructionData<TSNode> data,
			IStructuredAstNodeProvider<TSNode, TScope> nodeProvider) {
		return new CommandConstructionAccessor<TSNode, TScope>(data, nodeProvider);
	}
	
	@Override
	protected int getKind() {
		return DnaSql.COMMAND_DEFINE;
	}
}
