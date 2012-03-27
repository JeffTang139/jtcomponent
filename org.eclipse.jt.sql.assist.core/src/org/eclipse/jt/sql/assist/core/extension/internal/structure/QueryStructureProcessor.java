/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.data.AbstractQueryDataScope;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;


/**
 * @author Jeff Tang
 *
 */
public class QueryStructureProcessor<TScope extends AbstractQueryDataScope<TScope>> extends GeneralStructureProcessor<TScope> {

	public static QueryStructureProcessor<?> getInstance() {
		return new QueryStructureProcessor<QueryDataScope>();
	}
	
	protected QueryStructureProcessor() {
	}
	
	@Override
	protected <TSNode extends IStructuredAstNode<TSNode>> IAstAccessor<TScope> createConstructionAccessor(ConstructionData<TSNode> data,
			IStructuredAstNodeProvider<TSNode, TScope> nodeProvider) {
		return new QueryConstructionAccessor<TSNode, TScope>(data, nodeProvider);
	}
	
	@Override
	protected int getKind() {
		return DnaSql.QUERY_DEFINE;
	}

}
