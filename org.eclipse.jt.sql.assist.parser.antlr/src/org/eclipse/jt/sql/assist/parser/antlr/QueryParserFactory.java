/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.antlr;

import java.lang.reflect.Method;

import org.antlr.runtime.RecognitionException;
import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.frontend.ISourceParser;
import org.eclipse.jt.script.assist.frontend.ISourceParserFactory;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatement;
import org.eclipse.jt.sql.assist.core.ast.query.QueryStatementBase;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AbstractQueryParser;
import org.eclipse.jt.sql.assist.parser.internal.antlr.CustomQueryParser;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryParser;



/**
 * @author Jeff Tang
 *
 */
public class QueryParserFactory implements ISourceParserFactory {
	
	private QueryParserFactory() {}
	
	private static QueryParserFactory s_default;
	
	public static ISourceParserFactory getDefault() {
		if(s_default==null) {
			s_default=new QueryParserFactory();
		}
		return s_default;
	}
	
	/**
	 * 将该类工厂的实例作为DnaSql的默认解析器类工厂
	 */
	public static void using() {
		DnaSql.setSourceParserFactory(getDefault());
	}

	public final static int PARSER_QUERY_DEFINE=DnaSql.QUERY_DEFINE;
	public final static int PARSER_ORM_DEFINE=DnaSql.ORM_DEFINE;
	public final static int PARSER_INSERT_DEFINE=DnaSql.INSERT_DEFINE;
	public final static int PARSER_UPDATE_DEFINE=DnaSql.UPDATE_DEFINE;
	public final static int PARSER_DELETE_DEFINE=DnaSql.DELETE_DEFINE;
	
	public final static int PARSER_COMMAND_DEFINE=0xF1;
	
	public final static int PARSER_CONDITION_EXPRESSION=DnaSql.CONDITION_EXPRESSION;
	public final static int PARSER_VALUE_EXPRESSION=DnaSql.VALUE_EXPRESSION;
	public final static int PARSER_SUBQUERY_STATAMENT=DnaSql.SUBQUERY_STATEMENT;
	public final static int PARSER_QUERY_STATAMENT=DnaSql.QUERY_STATEMENT;
	
	/**
	 * 创建查询或ORM的代码解析器
	 * @param kind {@link #PARSER_QUERY}
	 * 				或 {@link #PARSER_ORM}
	 * 				或 {@link #PARSER_CONDITION_EXPRESSION}
	 * 				或 {@link #PARSER_VALUE_EXPRESSION}
	 * 				或 {@link #PARSER_SUBQUERY_STATAMENT}
	 * 				或 {@link #PARSER_QUERY_STATAMENT}
	 * @return 指定类型的解析器
	 */
	public static ISourceParser create(int kind) {
		if(kind==PARSER_QUERY_DEFINE) 
			return new QueryDefineParser();
		if(kind==PARSER_ORM_DEFINE) 
			return new MappingDefineParser();
		if(kind==PARSER_INSERT_DEFINE) 
			return new InsertDefineParser();
		if(kind==PARSER_UPDATE_DEFINE) 
			return new UpdateDefineParser();
		if(kind==PARSER_DELETE_DEFINE) 
			return new DeleteDefineParser();
		if(kind==PARSER_CONDITION_EXPRESSION) 
			return new ConditionExpressionParser();
		if(kind==PARSER_VALUE_EXPRESSION) 
			return new ValueExpressionParser();
		if(kind==PARSER_SUBQUERY_STATAMENT) 
			return new SubqueryParser();
		if(kind==PARSER_QUERY_STATAMENT)
			return new QueryBodyParser();
		if(kind==PARSER_COMMAND_DEFINE)
			return new CommandParser();
		throw new UnsupportedOperationException("unknown source parser kind "+kind);
	}
	
	public static ISourceParser createCustom(String ruleName) throws SecurityException, NoSuchMethodException {
		Method method=DnaSqlQueryParser.class.getMethod(ruleName);
		if(IAstNode.class.isAssignableFrom(method.getReturnType())) {
			return new CustomQueryParser(method);
		}
		throw new UnsupportedOperationException("rule ["+ruleName+"] do not return a IAstNote type value");
		
	}

	public ISourceParser createCustomSourceParser(String statementName) throws SecurityException, NoSuchMethodException {
		return createCustom(statementName);
	}

	public ISourceParser createDefinedSourceParser(int kind) {
		return create(kind);
	}
}

final class QueryDefineParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.query_declare();
	}
}

final class MappingDefineParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.mapping_declare();
	}
}

final class InsertDefineParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.insert_declare();
	}
}

final class UpdateDefineParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.update_declare();
	}
}

final class DeleteDefineParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.delete_declare();
	}
}

final class ConditionExpressionParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.condition_exp();
	}
}

final class ValueExpressionParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.value_exp();
	}
}

final class SubqueryParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.subquery();
	}
}

final class QueryBodyParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		QueryStatementBase qu=new QueryStatement(null);
		parser.query_body(qu);
		return qu;
	}
}

final class CommandParser extends AbstractQueryParser {
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		return parser.command_declare();
	}
}

