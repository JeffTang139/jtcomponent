/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.completion;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.analysis.ICompletionProposal;
import org.eclipse.jt.sql.assist.core.analysis.kinds.CompletionProposalKinds;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractCompletionProposal implements ICompletionProposal,CompletionProposalKinds {
	
	public final static int FLAG_NONE=0;
	
	private String fName;
	private IAstNode fNode;
	private int fPosition;
	private ISourcePosition fReplace;
	private String fCompletion;
	private String fExtension;
	private String fDescription;
	private Object fSource;
	
	public AbstractCompletionProposal(String name, IAstNode node, int position, ISourcePosition replace, String description, String completion) {
		fName=name;
		fNode=node;
		fPosition=position;
		fReplace=replace;
		fDescription=description;
		fCompletion=completion;
	}
	
	public AbstractCompletionProposal(String name, IAstNode node, int position, ISourcePosition replace, 
			String description, String completion, String extension) {
		fName=name;
		fNode=node;
		fPosition=position;
		fReplace=replace;
		fCompletion=completion;
		fDescription=description;
		fExtension=extension;
	}
	
	public AbstractCompletionProposal(String name, IAstNode node, int position, ISourcePosition replace, 
			String description, String completion, String extension, Object source) {
		fName=name;
		fNode=node;
		fPosition=position;
		fReplace=replace;
		fCompletion=completion;
		fDescription=description;
		fExtension=extension;
		fSource = source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getName()
	 */
	public String getName() {
		return fName;
	}
	
	public void setName(String name) {
		this.fName=name;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getNode()
	 */
	public IAstNode getNode() {
		return fNode;
	}
	
	public void setNode(IAstNode node) {
		this.fNode=node;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getPosition()
	 */
	public int getPosition() {
		return fPosition;
	}
	
	public void setPosition(int pos) {
		this.fPosition=pos;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getReplacePosition()
	 */
	public ISourcePosition getReplacePosition() {
		return fReplace;
	}
	
	public void setReplacePosition(ISourcePosition replace) {
		this.fReplace=replace;
	}

	/**
	 * @return the fCompletion
	 */
	public String getCompletion() {
		return fCompletion;
	}

	/**
	 * @param completion the fCompletion to set
	 */
	public void setCompletion(String completion) {
		fCompletion = completion;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getRelevance()
	 */
	public int getRelevance() {
		return 1;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ICompletionProposal#getParameterNames()
	 */
	public String[] getParameterNames() {
		return null;
	}

	/**
	 * @return the fExtension
	 */
	public String getExtension() {
		return fExtension;
	}

	/**
	 * @param extension the fExtension to set
	 */
	public void setExtension(String extension) {
		fExtension = extension;
	}

	public String getDescription() {
		return fDescription;
	}

	public void setDescription(String description) {
		fDescription = description;
	}
	
	public Object getSource() {
		return fSource;
	}
	
	public void setSource(Object source) {
		fSource = source;
	}
}
