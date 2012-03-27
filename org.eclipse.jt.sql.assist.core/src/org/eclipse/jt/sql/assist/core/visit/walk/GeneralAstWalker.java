/**
 * 
 */
package org.eclipse.jt.sql.assist.core.visit.walk;

import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.ClassReference;
import org.eclipse.jt.sql.assist.core.ast.general.DataTypeReference;
import org.eclipse.jt.sql.assist.core.ast.general.IGeneralAstWalker;
import org.eclipse.jt.sql.assist.core.ast.general.TableRefReference;


/**
 * 默认的普通未分类节点的简单访问器
 * @author Jeff Tang
 *
 */
public class GeneralAstWalker extends AbstractAstWalker implements IGeneralAstWalker {

	
	public GeneralAstWalker() {
		this(null);
	}
	
	public GeneralAstWalker(IAstWalker baseWalker) {
		super(baseWalker);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterArgumentDeclaration(org.eclipse.jt.sql.assist.core.ast.ArgumentDeclaration)
	 */
	public boolean enterArgumentDeclaration(ArgumentDeclaration ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterDataTypeReference(org.eclipse.jt.sql.assist.core.ast.DataTypeReference)
	 */
	public boolean enterDataTypeReference(DataTypeReference ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#enterTableRefReference(org.eclipse.jt.sql.assist.core.ast.TableRefReference)
	 */
	public boolean enterTableRefReference(TableRefReference ast) {
		return internalEnterGeneral(ast);
	}

	public boolean enterClassReference(ClassReference ast) {
		return internalEnterGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitArgumentDeclaration(org.eclipse.jt.sql.assist.core.ast.ArgumentDeclaration)
	 */
	public boolean exitArgumentDeclaration(ArgumentDeclaration ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitDataTypeReference(org.eclipse.jt.sql.assist.core.ast.DataTypeReference)
	 */
	public boolean exitDataTypeReference(DataTypeReference ast) {
		return internalExitGeneral(ast);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.ast.IGeneralAstWalker#exitTableRefReference(org.eclipse.jt.sql.assist.core.ast.TableRefReference)
	 */
	public boolean exitTableRefReference(TableRefReference ast) {
		return internalExitGeneral(ast);
	}

	public boolean exitClassReference(ClassReference ast) {
		return internalExitGeneral(ast);
	}
}
