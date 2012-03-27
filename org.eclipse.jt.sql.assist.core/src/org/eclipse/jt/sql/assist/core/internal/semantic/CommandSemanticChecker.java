/**
 * 
 */
package org.eclipse.jt.sql.assist.core.internal.semantic;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.sql.assist.core.ast.IResultSetReference;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;
import org.eclipse.jt.sql.assist.core.ast.command.AssignStatement;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.DeleteStatement;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstNode;
import org.eclipse.jt.sql.assist.core.ast.command.ICommandAstVisitor;
import org.eclipse.jt.sql.assist.core.ast.command.InsertDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.InsertStatement;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateDeclaration;
import org.eclipse.jt.sql.assist.core.ast.command.UpdateStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractCommandDataScope;
import org.eclipse.jt.sql.assist.core.data.CommandDataScope;
import org.eclipse.jt.sql.assist.core.data.DataReference;
import org.eclipse.jt.sql.assist.core.data.ReferencedDataMap;
import org.eclipse.jt.sql.assist.core.data.define.ISqlFieldDefine;
import org.eclipse.jt.sql.assist.core.data.define.ISqlTypeDefine;
import org.eclipse.jt.sql.assist.core.data.define.ITableDefine;
import org.eclipse.jt.sql.assist.core.internal.util.SemanticUtil;


/**
 * @author Jeff Tang
 *
 */
public abstract class CommandSemanticChecker<TScope extends AbstractCommandDataScope<TScope>> 
		extends QuerySemanticChecker<TScope>
		implements ICommandAstVisitor<Object, Object>{

	public static final class RealCommandSemanticChecker extends CommandSemanticChecker<CommandDataScope> {

		public static final RealCommandSemanticChecker getInstance() {
			return new RealCommandSemanticChecker();
		}
		
		private RealCommandSemanticChecker() {}
		
		@Override
		protected final CommandDataScope createDefaultScope() {
			return CommandDataScope.getInstance();
		}

		protected final CommandDataScope convertScope(IDataScope<?> dataScope) {
			if(dataScope==null)
				throw new IllegalArgumentException("Argument 'dataScope' cannot be null!");
			if(dataScope instanceof CommandDataScope) {
				return (CommandDataScope)dataScope;
			} else {
				throw new IllegalArgumentException(
						"Data scope of class 'CommandDataScope' expected, not '"
						+dataScope.getClass().getName()+"'.");
			}
		}
	}
	
	public static CommandSemanticChecker<?> getInstance() {
		return new RealCommandSemanticChecker();
	}
	
	@Override
	public Object visitGeneral(IAstNode ast, Object data) throws Throwable {
		if(ast instanceof ICommandAstNode) {
			return ((ICommandAstNode)ast).accept(this, data);
		} else {
			return super.visitGeneral(ast, data);
		}
	}
	

	public Object visitAssignStatement(AssignStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(AssignStatement.class);
		String columnName = null;
		ISqlTypeDefine columnType = null;
		if(ast.getColumn()!=null) {
			columnName = ast.getColumn().getTexture();
		}
		if(columnName!=null) {
			ITableDefine table=null;
			ReferencedDataMap<IResultSetReference, ITableDefine> tableMap = fScope.getTableReferences(false);
			for(DataReference<IResultSetReference, ITableDefine> ref :tableMap.values()) {
				if(ref!=null) {

					if(ref.data!=null) {
						table = ref.data;
					} else if(ref.ast!=null) {
//						table=getTableDefine(ref.ast.getTargetName(),ref.ast, data);
						
						table = (ITableDefine) visitGeneral(ref.ast, data);
					}
					if(table!=null) {
						ISqlFieldDefine field=table.getField(columnName);
						if(field!=null) {
							columnType=field.getSqlType();
							if(columnType!=null) break;
						}
					}
				}
			}
			if(table!=null && columnType==null) {
					error(KIND_FIELD_NOT_EXIST,new String[]{columnName,table.getName()},
							"column ["+columnName+"] does not exist in table ["+table.getName()+"]", ast.getColumn());
			}
		}
		if(ast.getValue()!=null) {
			ISqlTypeDefine valueType = checkValueExpression(ast.getValue(), data);
			if(valueType!=null && columnType!=null) {
				if(!SemanticUtil.isAssignable(columnType, valueType)) {
					error(KIND_TYPE_MISS_MATCH,new String[]{columnType.toString(),valueType.toString()},
							"value type ["+columnType.toString()+"] not match the column type ["+valueType.toString()+"]",
							ast.getValue());
				}
			}
		}
		if(DEBUG) exit(AssignStatement.class);
		return null;
	}

	public Object visitDeleteDeclaration(DeleteDeclaration ast, Object data)
			throws Throwable {
		if(DEBUG) enter(DeleteDeclaration.class);
		checkArguments(ast, data);
		if(ast.getCommand()!=null) {
			visitDeleteStatement(ast.getCommand(), data);
		}
		if(DEBUG) exit(DeleteDeclaration.class);
		return null;
	}

	public Object visitDeleteStatement(DeleteStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(DeleteStatement.class);
		if(ast.getTable()!=null) {
			ast.getTable().accept(this, data);
		}
		if(ast.getWhere()!=null) {
			ast.getWhere().accept(this, data);
		}
		if(DEBUG) exit(DeleteStatement.class);
		return null;
	}

	public Object visitInsertDeclaration(InsertDeclaration ast, Object data)
			throws Throwable {
		if(DEBUG) enter(InsertDeclaration.class);
		checkArguments(ast, data);
		if(ast.getCommand()!=null) {
			visitInsertStatement(ast.getCommand(), data);
		}
		if(DEBUG) exit(InsertDeclaration.class);
		return null;
	}

	public Object visitInsertStatement(InsertStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(InsertStatement.class);
		if(ast.getValueExpressions()!=null) {
			for(ValueExpression ve : ast.getValueExpressions()) {
				if(ve!=null) {
					checkValueExpression(ve, data);
				}
			}
		} else if(ast.getSubquery()!=null) {
			visitSubQueryStatement(ast.getSubquery(), data);
		}
		
		if(DEBUG) exit(InsertStatement.class);
		return null;
	}

	public Object visitUpdateDeclaration(UpdateDeclaration ast, Object data)
			throws Throwable {

		if(DEBUG) enter(UpdateDeclaration.class);
		checkArguments(ast, data);
		if(ast.getCommand()!=null) {
			visitUpdateStatement(ast.getCommand(), data);
		}
		if(DEBUG) exit(UpdateDeclaration.class);
		return null;
	}

	public Object visitUpdateStatement(UpdateStatement ast, Object data)
			throws Throwable {
		if(DEBUG) enter(UpdateStatement.class);
		if(ast.getTable()!=null) {
			ast.getTable().accept(this, data);
		}
		if(ast.getAssigns()!=null) {
			for(AssignStatement assign : ast.getAssigns()) {
				if(assign!=null) {
					try {
						assign.accept(this, data);
					} catch (Throwable e) {
						report(e, ast);
					}
				}
			}
		}
		if(ast.getWhere()!=null) {
			ast.getWhere().accept(this, data);
		}
		if(DEBUG) exit(UpdateStatement.class);
		return null;
	}

}
