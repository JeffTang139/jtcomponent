/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;


/**
 * 默认的ORM抽象语法树的简单访问器
 * @author Jeff Tang
 *
 */
public class MappingWalker extends QueryWalker implements IMappingWalker {

	public MappingWalker() {
		super(null);
	}
	
	public MappingWalker(IAstWalker baseWalker) {
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
