/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import org.eclipse.jt.script.assist.frontend.ISourceParser;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractSourceParser implements ISourceParser {

	public static boolean DEBUG=Boolean.parseBoolean(System.getProperty("dnasql.assist.parser.debug"));

}
