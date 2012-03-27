/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Reference;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;


/**
 * @author Jeff Tang
 *
 */
public class ClassReference extends Reference implements IGeneralAstNode {

	public final static char CLASS_NAME_SEPARETOR='.';
	

	protected List<TokenNode> fSegments;
	
	/**
	 * @param position
	 * @param targetName
	 */
	public ClassReference(ISourcePosition position) {
		super(position, null);
	}
	
	public void add(TokenNode segment) {
		this.updatePosition(segment);
		if(this.fSegments==null) this.fSegments=new ArrayList<TokenNode>();
		fSegments.add(segment);
		this.fTargetName=null;
	}

	/**
	 * @param entityNames the fEntityNames to set
	 */
	public void add(String segment, ISourcePosition pos) {
		this.updatePosition(pos);
		if(this.fSegments==null) this.fSegments=new ArrayList<TokenNode>();
		if(segment!=null||pos!=null)
			fSegments.add(new TokenNode(segment,pos));
		else 
			fSegments.add(null);
		this.fTargetName=null;
	}

	public boolean isValid() {
		if(fSegments==null) return false;
		for(int i=0;i<fSegments.size();i++) {
			if(fSegments.get(i)==null) return false;
		}
		return true;
	}
	
	public List<TokenNode> geSegments() {
		return fSegments;
	}
	
	public synchronized String getTargetName() {
		if(fSegments==null) return null;
		if(fTargetName==null) {
			synchronized (fSegments) {
				StringBuffer buffer=new StringBuffer();
				for(int i=0;i<fSegments.size();i++) {
					if(i!=0) buffer.append(CLASS_NAME_SEPARETOR);
					TokenNode token=fSegments.get(i);
					if(token!=null)
						buffer.append(fSegments.get(i).getTexture());
				}
				fTargetName=buffer.toString();
			}
		}
		return fTargetName;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getNodeKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.CLASS_REFERENCE;
	}

	public <TResult, TData> TResult accept(
			IGeneralAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitClassReference(this, data);
	}

}
