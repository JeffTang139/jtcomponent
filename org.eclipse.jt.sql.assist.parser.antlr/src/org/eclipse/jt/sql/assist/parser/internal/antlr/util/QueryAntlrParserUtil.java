/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.internal.antlr.util;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.frontend.ISourceParseWarnings;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.util.SystemIOWarnings;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrErrorReporter;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrPositionConvertor;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryLexer;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryParser;



/**
 * @author Jeff Tang
 *
 */
public class QueryAntlrParserUtil {
	private QueryAntlrParserUtil() {}
	
	public static DnaSqlQueryParser createAntlrParserWithDefaultWarnings(String fileName, String content) {
		IPositionManager posMgr=DnaSql.getDefault().createPositionManager(fileName, content);
		AntlrPositionConvertor convertor=new AntlrPositionConvertor(posMgr);
		AntlrErrorReporter reporter=new AntlrErrorReporter(convertor,new SystemIOWarnings(posMgr));
		return createAntlrParser(content,reporter,convertor);
	}
	
	public static DnaSqlQueryParser createAntlrParser(String fileName, String content, ISourceParseWarnings sourceWarnings) {
		AntlrPositionConvertor convertor=new AntlrPositionConvertor(fileName,content);
		AntlrErrorReporter reporter=new AntlrErrorReporter(convertor,sourceWarnings);
		return createAntlrParser(content,reporter,convertor);
	}
	
	public static DnaSqlQueryParser createAntlrParser(String content, AntlrErrorReporter reporter, AntlrPositionConvertor convertor) {
		CharStream input=new ANTLRStringStream(content);
		DnaSqlQueryLexer lex = new DnaSqlQueryLexer(input);
		lex.setReporter(reporter);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DnaSqlQueryParser parser = new DnaSqlQueryParser(tokens);
		parser.setPositionConvertor(convertor);
		parser.setReporter(reporter);
		return parser;
	}
}
