/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;


/**
 * 默认的ORM未分类节点的简单访问器
 * @author Jeff Tang
 *
 */
public class MappingAstWalker extends AbstractAstWalker implements
		IMappingAstWalker {

	public MappingAstWalker() {
		this(null);
	}
	
	public MappingAstWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker#enterMappingDeclaration(org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration)
	 */
	public boolean enterMappingDeclaration(MappingDeclaration ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker#enterMappingStatement(org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement)
	 */
	public boolean enterMappingStatement(MappingStatement ast) {
		return internalEnterGeneral(ast);
	}

	public boolean enterMappingOverride(MappingOverride ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker#exitMappingDeclaration(org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration)
	 */
	public boolean exitMappingDeclaration(MappingDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker#exitMappingStatement(org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement)
	 */
	public boolean exitMappingStatement(MappingStatement ast) {
		return internalExitGeneral(ast);
	}

	public boolean exitMappingOverride(MappingOverride ast) {
		return internalExitGeneral(ast);
	}

}
