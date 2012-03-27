/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.internal.antlr;

import org.antlr.runtime.RecognitionException;
import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.frontend.ISourceParseWarnings;
import org.eclipse.jt.sql.assist.core.process.AbstractSourceParser;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryParser;
import org.eclipse.jt.sql.assist.parser.internal.antlr.util.QueryAntlrParserUtil;



/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractQueryParser extends AbstractSourceParser {

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.ISourceParser#parse(java.lang.String, java.lang.String, org.eclipse.jt.script.assist.ISourceWarnings)
	 */
	public IAstNode parse(String filename, String content,
			ISourceParseWarnings sourceWarnings) throws Throwable {
		IAstNode ast=null;
		AntlrErrorReporter reporter=null;
		AntlrPositionConvertor convertor=null;
		try {
			convertor=new AntlrPositionConvertor(filename, content);
			reporter=new AntlrErrorReporter(convertor,sourceWarnings);
			DnaSqlQueryParser parser = QueryAntlrParserUtil.createAntlrParser(content, reporter, convertor);
			ast = doParse(parser);
			parser.eof();
		} catch (RecognitionException e) {
			if(reporter!=null) reporter.reportError(e);
			else throw e;
		}
		return ast;
	}
	
	protected abstract IAstNode doParse(DnaSqlQueryParser parser) throws RecognitionException;

}