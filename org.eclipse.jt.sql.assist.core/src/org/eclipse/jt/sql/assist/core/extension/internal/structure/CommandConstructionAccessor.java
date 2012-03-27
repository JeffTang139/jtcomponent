/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;


/**
 * @author Jeff Tang
 *
 */
public class CommandConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends AbstractCommandDataScope<TScope>> 
		extends QueryConstructionAccessor<TSNode, TScope> 
		implements ICommandAccessor<TScope> {

	public CommandConstructionAccessor(ConstructionData<TSNode> data,
			IStructuredAstNodeProvider<TSNode, TScope> provider) {
		super(data, provider);
	}
	
	public  CommandConstructionAccessor(BaseConstructionAccessor<TSNode, TScope> baseWalker) {
		super(baseWalker);
	}

	public boolean enterAssignStatement(AssignStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterDeleteDeclaration(DeleteDeclaration ast, TScope scope) {

		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterDeleteStatement(DeleteStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterInsertStatement(InsertStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean enterUpdateStatement(UpdateStatement ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitAssignStatement(AssignStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitDeleteDeclaration(DeleteDeclaration ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitDeleteStatement(DeleteStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitInsertDeclaration(InsertDeclaration ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitInsertStatement(InsertStatement ast, TScope scope) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exitUpdateDeclaration(UpdateDeclaration ast, TScope scope) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exitUpdateStatement(UpdateStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

}
