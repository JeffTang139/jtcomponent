/**
 * 
 */
package org.eclipse.jt.sql.assist.core.ast.orm;

import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;

/**
 * @author Jeff Tang
 *
 */
public class MappingOverride extends Statement implements IMappingAstNode {

	public final static String OVERRIDE_WORD = "override";
	
	protected TokenNode fSuper;
	protected TokenNode fOverride;
	
	public TokenNode getOverride() {
		return fOverride;
	}

	public void setOverride(TokenNode override) {
		this.fOverride = override;
		this.updatePosition(override);
	}

	public TokenNode getSuper() {
		return fSuper;
	}

	public void setSuper(TokenNode superMapping) {
		this.fSuper = superMapping;
		this.updatePosition(superMapping);
	}

	public MappingOverride(TokenNode override, TokenNode superMapping) {
		super(union(override!=null?override.getPosition():null,
				superMapping!=null?superMapping.getPosition():null));
		fSuper=superMapping;
		fOverride=override;
	}

	public <TResult, TData> TResult accept(
			IMappingAstVisitor<TResult, TData> visitor, TData data)
			throws Throwable {
		return visitor.visitMappingOverride(this, data);
	}

	public int getNodeKind() {
		return MappingAstKinds.MAPPING_OVERRIDE;
	}

	public String getTitle() {
		return fSuper!=null?fSuper.getTexture():null;
	}

}
