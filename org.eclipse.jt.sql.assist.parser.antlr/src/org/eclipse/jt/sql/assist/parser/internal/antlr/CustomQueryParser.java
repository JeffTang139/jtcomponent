/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.internal.antlr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.antlr.runtime.RecognitionException;
import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryParser;



/**
 * @author Jeff Tang
 *
 */
public class CustomQueryParser extends AbstractQueryParser {
	
	private Method fMethod;
	
	public CustomQueryParser(Method method) {
		fMethod=method;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.query.internal.parser.AbstractQueryParser#doParse(org.eclipse.jt.script.assist.query.internal.parser.antlr.DnaSqlQueryParser)
	 */
	@Override
	protected IAstNode doParse(DnaSqlQueryParser parser)
			throws RecognitionException {
		try {
			return (IAstNode) fMethod.invoke(parser);
		} catch (InvocationTargetException e) {
			if(e.getCause() instanceof RecognitionException) {
				throw (RecognitionException)e.getCause();
			}
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		return null;
	}

}
