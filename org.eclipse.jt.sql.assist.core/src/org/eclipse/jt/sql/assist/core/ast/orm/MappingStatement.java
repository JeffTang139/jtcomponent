/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;


/**
 * @author Jeff Tang
 *
 */
public class MappingStatement extends Statement implements IMappingAstNode {
	
	public final static String MAPPING_WORD = "mapping";
	
	public final static char ENTITY_NAME_SEPARETOR='.';
	
	
	protected ClassReference fClassReference;

	public MappingStatement(ISourcePosition position) {
		super(position);
		fClassReference=new ClassReference(null);
	}

	/**
	 * @param entityNames the fEntityNames to set
	 */
	public void add(String entityName, ISourcePosition pos) {
		this.fClassReference.add(entityName, pos);
		this.updatePosition(pos);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return MappingAstKinds.MAPPING_STATEMENT;
	}

	public <TResult, TData> TResult accept(
			IMappingAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitMappingStatement(this, data);
	}

	public String getTitle() {
		return fClassReference!=null?fClassReference.getTargetName():MAPPING_WORD;
	}

	public ClassReference getClassReference() {
		return fClassReference;
	}

	public void setClassReference(ClassReference classReference) {
		fClassReference = classReference;
		this.updatePosition(classReference);
	}
}
