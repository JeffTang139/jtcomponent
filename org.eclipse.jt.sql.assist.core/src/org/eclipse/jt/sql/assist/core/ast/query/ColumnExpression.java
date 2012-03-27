/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.ast.query;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.ValueExpression;


/**
 * @author Jeff Tang
 *
 */
public abstract class ColumnExpression extends ValueExpression {

	public ColumnExpression(ISourcePosition position, ValueExpression primary) {
		super(position, primary);
	}

}
