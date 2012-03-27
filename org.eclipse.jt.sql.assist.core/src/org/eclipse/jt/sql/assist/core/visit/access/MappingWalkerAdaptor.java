/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.access;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAstWalker;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;
import org.eclipse.jt.sql.assist.core.visit.walk.MappingAstWalker;


/**
 * @author Jeff Tang
 *
 */
public class MappingWalkerAdaptor<TScope extends AbstractMappingDataScope<TScope>>
		extends QueryWalkerAdaptor<TScope> 
		implements IMappingAccessor<TScope> {
	
	private IMappingAstWalker fMappingAstWalker;

	public MappingWalkerAdaptor(IAstWalker walker) {
		super(walker);
	}
	
	@Override
	public void setWalker(IAstWalker walker) {
		super.setWalker(walker);
		if(walker instanceof IMappingAstWalker) {
			fMappingAstWalker = (IMappingAstWalker) walker;
		} else {
			fMappingAstWalker = new MappingAstWalker(walker);
		}
	}

	public boolean enterMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return fMappingAstWalker.enterMappingDeclaration(ast);
	}

	public boolean enterMappingOverride(MappingOverride ast, TScope scope) {
		return fMappingAstWalker.enterMappingOverride(ast);
	}

	public boolean enterMappingStatement(MappingStatement ast, TScope scope) {
		return fMappingAstWalker.enterMappingStatement(ast);
	}

	public boolean exitMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return fMappingAstWalker.exitMappingDeclaration(ast);
	}

	public boolean exitMappingOverride(MappingOverride ast, TScope scope) {
		return fMappingAstWalker.exitMappingOverride(ast);
	}

	public boolean exitMappingStatement(MappingStatement ast, TScope scope) {
		return fMappingAstWalker.exitMappingStatement(ast);
	}

}
