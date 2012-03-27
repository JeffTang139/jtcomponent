/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.general;

import org.eclipse.jt.script.assist.visit.IAstWalker;


/**
 * @author Jeff Tang
 *
 */
public interface IGeneralAstWalker extends IAstWalker {
	
	public boolean enterArgumentDeclaration(ArgumentDeclaration ast);
	public boolean enterDataTypeReference(DataTypeReference ast);
	public boolean enterTableRefReference(TableRefReference ast);
	public boolean enterClassReference(ClassReference ast);
	
	public boolean exitArgumentDeclaration(ArgumentDeclaration ast);
	public boolean exitDataTypeReference(DataTypeReference ast);
	public boolean exitTableRefReference(TableRefReference ast);
	public boolean exitClassReference(ClassReference ast);
} 
