/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;

/**
 * @author Jeff Tang
 *
 */
public abstract class ParameteredCompletionProposal extends AbstractCompletionProposal {
	
	protected String[] fParameterNames;


	public ParameteredCompletionProposal(String name, IAstNode node,
			int position, ISourcePosition replace, String description, String completion, String[] parameterNames) {
		super(name, node, position, replace, description, completion);
		this.fParameterNames=parameterNames;
	}
	public ParameteredCompletionProposal(String name, IAstNode node,
			int position, ISourcePosition replace, String description, String completion, String[] parameterNames, String extension) {
		super(name, node, position, replace, description, completion, extension);
		this.fParameterNames=parameterNames;
	}
	@Override
	public String[] getParameterNames() {
		return fParameterNames;
	}
	
	public void setParameterNames(String[] parameterNames) {
		this.fParameterNames=parameterNames;
	}

}
