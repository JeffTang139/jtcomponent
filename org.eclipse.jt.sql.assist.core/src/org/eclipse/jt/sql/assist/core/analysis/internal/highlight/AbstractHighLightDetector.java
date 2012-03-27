/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.internal.highlight;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.analysis.IHighLightDetector;
import org.eclipse.jt.script.assist.analysis.IHighLightMessager;
import org.eclipse.jt.sql.assist.core.process.AbstractMessager;


/**
 * @author Jeff Tang
 *
 */
public abstract class AbstractHighLightDetector extends AbstractMessager<IHighLightMessager>
		implements IHighLightDetector {
	
	public static boolean DEBUG=Boolean.parseBoolean(System.getProperty("dnasql.assist.highlightdetector.debug"));

	protected IDataProvider fDataLoader;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IHighLightDetector#detectHighLight(org.eclipse.jt.script.assist.IAstNode, org.eclipse.jt.sql.assist.core.IHighLightMessager, org.eclipse.jt.sql.assist.core.IDataProvider)
	 */
	public final void detectHighLight(IAstNode node, IHighLightMessager messager,
			IDataProvider dataLoader) {
		this.fWarnings=messager;
		this.fDataLoader=dataLoader;
		doDetect(node);
	}
	
	protected void light(int kind, ISourcePosition position) {
		if(this.fWarnings!=null) 
			fWarnings.light(kind, position);
	}
	
	protected abstract void doDetect(IAstNode node);

}
