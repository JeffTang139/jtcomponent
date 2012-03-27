package org.eclipse.jt.sql.assist.core.ast.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.IDeclaration;
import org.eclipse.jt.sql.assist.core.ast.Statement;
import org.eclipse.jt.sql.assist.core.ast.TokenNode;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.ast.general.IArgumentContainer;


public abstract class CommandDeclarationBase<TCommand extends Statement> 
		extends Statement implements ICommandAstNode, IArgumentContainer, IDeclaration {

	public static final String DEFINE_WORD = "define";

	protected TokenNode fDefine;
	protected TokenNode fName;

	protected List<ArgumentDeclaration> fArguments;
	
	protected TCommand fCommand;
	/**
	 * @param tInsert
	 * @param tInto
	 */
	public CommandDeclarationBase(TokenNode define, TokenNode name, ISourcePosition end) {
		super(union(define.getPosition(), end));
		fDefine = define;
		fName = name;
	}

	/**
	 * @return the fName
	 */
	public TokenNode getName() {
		return fName;
	}

	/**
	 * @param name the fName to set
	 */
	public void setName(TokenNode name) {
		this.fName=name;
		this.updatePosition(name);
	}
	
	public List<ArgumentDeclaration> getArguments() {
		return this.fArguments;
	}
	
	public void addArgument(ArgumentDeclaration argument) {
		if(this.fArguments==null) this.fArguments=new ArrayList<ArgumentDeclaration>(4);
		this.fArguments.add(argument);
		this.updatePosition(argument);
	}
	


	public TCommand getCommand() {
		return fCommand;
	}

	public void setCommand(TCommand command) {
		this.fCommand = command;
		this.updatePosition(command);
	}

	public String getTitle() {
		return fName!=null?fName.getTexture():null;
	}
}
