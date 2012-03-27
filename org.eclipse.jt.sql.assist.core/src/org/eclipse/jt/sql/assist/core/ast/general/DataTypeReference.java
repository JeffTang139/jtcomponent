/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Reference;


/**
 * @author Jeff Tang
 *
 */
public class DataTypeReference extends Reference implements IGeneralAstNode {
	
	public final static String[] DATA_TYPE_NAMES=new String[] {
		"boolean","byte","bytes",
		"date","enum","guid",
		"string",
		"int","short","long","float","double"
	};
	
	protected ClassReference fClassArgument;

	public DataTypeReference(ISourcePosition position, String targetName) {
		super(position, targetName);
	}

	public ClassReference getClassArgument() {
		return fClassArgument;
	}

	public void setClassArgument(ClassReference classArgument) {
		this.fClassArgument = classArgument;
		this.updatePosition(classArgument);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return GeneralAstKinds.DATA_TYPE;
	}

	public <TResult, TData> TResult accept(
			IGeneralAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitDataTypeReference(this, data);
	}

}
