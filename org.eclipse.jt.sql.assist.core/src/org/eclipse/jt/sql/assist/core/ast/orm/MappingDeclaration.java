/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IScopeStatement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.query.QueryDeclarationBase;


/**
 * @author Jeff Tang
 *
 */
public class MappingDeclaration extends QueryDeclarationBase implements IMappingAstNode, IScopeStatement {
	
	protected MappingStatement fMapping;
	protected MappingOverride fOverride;

	public MappingDeclaration(ISourcePosition position, TokenNode name) {
		super(position, name);
	}

	/**
	 * @return the fMapping
	 */
	public MappingStatement getMapping() {
		return fMapping;
	}

	/**
	 * @param mapping the fMapping to set
	 */
	public void setMapping(MappingStatement mapping) {
		fMapping = mapping;
		this.updatePosition(mapping);
	}

	public MappingOverride getOverride() {
		return fOverride;
	}

	public void setOverride(MappingOverride override) {
		this.fOverride = override;
		this.updatePosition(override);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IAstNode#getKind()
	 */
	public int getNodeKind() {
		return MappingAstKinds.MAPPING_DECLARATION;
	}

	public <TResult, TData> TResult accept(
			IMappingAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitMappingDeclaration(this, data);
	}

}
