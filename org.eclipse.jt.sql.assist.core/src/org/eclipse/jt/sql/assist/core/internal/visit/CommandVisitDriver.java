/**
 * 
 */
package org.eclipse.jt.sql.assist.core.internal.visit;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.visit.IAstAccessor;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAccessor;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;
import org.eclipse.jt.sql.assist.core.data.CommandDataScope;
import org.eclipse.jt.sql.assist.core.visit.access.CommandAccessor;
import org.eclipse.jt.sql.assist.core.visit.access.CommandWalkerAdaptor;


/**
 * @author Jeff Tang
 *
 */
public class CommandVisitDriver<TScope extends AbstractCommandDataScope<TScope>>
	extends QueryVisitDriver<TScope> 
	implements ICommandAstVisitor<Object, IVisitControler<TScope>> {
	

	public static CommandVisitDriver<CommandDataScope> getInstance(
			IVisitControler<CommandDataScope> rootControler) {
		CommandVisitDriver<CommandDataScope> driver = 
			new CommandVisitDriver<CommandDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		return driver;
	}
	
	public static CommandVisitDriver<CommandDataScope> getInstance(IAstWalker walker,
			IVisitControler<CommandDataScope> rootControler) {
		CommandVisitDriver<CommandDataScope> driver = 
			new CommandVisitDriver<CommandDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(walker);
		return driver;
	}
	
	public static CommandVisitDriver<CommandDataScope> getInstance(IAstAccessor<CommandDataScope> accessor,
			IDataProvider dataLoader,
			IVisitControler<CommandDataScope> rootControler) {
		CommandVisitDriver<CommandDataScope> driver = 
			new CommandVisitDriver<CommandDataScope>();
		driver.setPrimaryVisitControler(rootControler);
		driver.initialize(accessor, dataLoader);
		return driver;
	}
	
	private ICommandAccessor<TScope> fCommandAccessor;
	
	@Override
	public void initialize(IAstAccessor<TScope> accessor, IDataProvider dataLoader) {
		super.initialize(accessor, dataLoader);
		if(accessor instanceof ICommandAccessor<?>) {
			fCommandAccessor = (ICommandAccessor<TScope>) accessor;
		} else {
			fCommandAccessor = new CommandAccessor<TScope>();
		}
	}
	
	@Override
	public void initialize(IAstWalker walker) {
		super.initialize(walker);
		fCommandAccessor = new CommandWalkerAdaptor<TScope>(walker);
	}
	
	
	@Override
	public void visitGeneral(IAstNode ast, IVisitControler<TScope> data) throws Throwable {
		if(ast instanceof ICommandAstNode) {
			((ICommandAstNode)ast).accept(this, data);
		} else {
			super.visitGeneral(ast, data);
		}
	}

	public Object visitAssignStatement(AssignStatement ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterAssignStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getValue()!=null) {
					walkValueExpression(ast.getValue(),sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitAssignStatement(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitDeleteDeclaration(DeleteDeclaration ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterDeleteDeclaration(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getArguments()!=null) {
					walkArgumentContainer(ast, sub);
				}
				if(ast.getCommand()!=null) {
					visitDeleteStatement(ast.getCommand(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitDeleteDeclaration(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitDeleteStatement(DeleteStatement ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterDeleteStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getTable()!=null) {
					ast.getTable().accept(this, sub);
				}
				if(ast.getWhere()!=null) {
					visitWhereStatement(ast.getWhere(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitDeleteStatement(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitInsertDeclaration(InsertDeclaration ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterInsertDeclaration(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkArgumentContainer(ast, data);
				if(ast.getCommand()!=null) {
					visitInsertStatement(ast.getCommand(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitInsertDeclaration(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitInsertStatement(InsertStatement ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterInsertStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getValueExpressions()!=null) {
					for(ValueExpression value : ast.getValueExpressions()) {
						if(value!=null) {
							walkValueExpression(value, sub);
						}
					}
				}
				if(ast.getSubquery()!=null) {
					visitSubQueryStatement(ast.getSubquery(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitInsertStatement(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitUpdateDeclaration(UpdateDeclaration ast,
			IVisitControler<TScope> data) throws Throwable {

		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterUpdateDeclaration(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				walkArgumentContainer(ast, data);
				if(ast.getCommand()!=null) {
					visitUpdateStatement(ast.getCommand(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitUpdateDeclaration(ast, data.getDataScope());
		}
		return null;
	}

	public Object visitUpdateStatement(UpdateStatement ast,
			IVisitControler<TScope> data) throws Throwable {
		boolean visit=data.walkNode(ast);
		if(!visit || fCommandAccessor.enterUpdateStatement(ast, data.getDataScope())) {
			IVisitControler<TScope> sub=getSubControler(data,ast);
			if(sub!=null) {
				if(ast.getTable()!=null) {
					ast.getTable().accept(this, sub);
				}
				if(ast.getAssigns()!=null) {
					for(AssignStatement assign : ast.getAssigns()) {
						if(assign!=null) {
							visitAssignStatement(assign, sub);
						}
					}
				}
				if(ast.getWhere()!=null) {
					visitWhereStatement(ast.getWhere(), sub);
				}
			}
			if(visit) 
				fCommandAccessor.exitUpdateStatement(ast, data.getDataScope());
		}
		return null;
	}

}
