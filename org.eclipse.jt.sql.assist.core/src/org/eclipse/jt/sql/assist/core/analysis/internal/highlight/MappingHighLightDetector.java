/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.highlight;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstNode;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;


/**
 * @author Jeff Tang
 *
 */
public class MappingHighLightDetector extends QueryHighLightDetector implements
		IMappingAstVisitor<Object, Object> {
	
	public static MappingHighLightDetector getInstance() {
		return new MappingHighLightDetector();
	}
	
	protected MappingHighLightDetector() {}
	
	@Override
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {
		if(ast instanceof IMappingAstNode) {
			return ((IMappingAstNode)ast).accept(this, data);
		} else {
			return super.visitGeneral(ast, data);
		}
	}

	public Object visitMappingDeclaration(MappingDeclaration ast, Object data)
			throws Throwable {
		Object columns=null;
		if(DEBUG) enter(MappingDeclaration.class);
		try {
			if(ast.getMapping()!=null) {
				ast.getMapping().accept(this, data);
			}
			columns=this.detectQueryDeclaration(ast, data);
		} catch (Throwable e) {
			report(e,ast);
		}
		if(DEBUG) exit(MappingDeclaration.class);
		return columns;
	}

	public Object visitMappingStatement(MappingStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(MappingStatement.class);
		if(DEBUG) exit(MappingStatement.class);
		return null;
	}

	public Object visitMappingOverride(MappingOverride ast, Object data)
			throws Throwable {
		if(DEBUG) enter(MappingOverride.class);
		if(DEBUG) exit(MappingOverride.class);
		return null;
	}
}
