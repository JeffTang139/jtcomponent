/**
 * 
 */
package org.eclipse.jt.sql.assist.core.process;

import java.io.OutputStream;

import org.eclipse.jt.script.assist.backend.IGenerator;
import org.eclipse.jt.script.assist.backend.IGeneratorDataProvider;
import org.eclipse.jt.script.assist.backend.IGeneratorWarnings;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractGenerator<TScope> implements IGenerator<TScope> {
	
	public static boolean DEBUG = Boolean.parseBoolean(System.getProperty("dnasql.assist.generator.debug"));

	protected StringBuffer buffer;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.script.assist.IGenerator#build(java.lang.String, org.eclipse.jt.script.assist.IDataProvider, org.eclipse.jt.script.assist.IGeneratorWarnings)
	 */
	public boolean build(String name, String packageName, int kind, String script, IGeneratorDataProvider loader,
			IGeneratorWarnings warnings) throws Throwable {
		return build(name, packageName, kind, script, null, loader, warnings);
	}

	public void output(OutputStream out) throws Throwable {
		out.write(buffer.toString().getBytes());
	}
	
	public StringBuffer getBuffer() {
		return buffer;
	}

}
