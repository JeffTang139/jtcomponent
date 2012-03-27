/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

/**
 * @author Jeff Tang
 *
 */
public class QueryDataScope extends AbstractQueryDataScope<QueryDataScope> {

	public static QueryDataScope getInstance() {
		return new QueryDataScope();
	}
	
	private QueryDataScope() {
		super();
	}
	
	private QueryDataScope(QueryDataScope parent) {
		super(parent);
	}

	@Override
	protected QueryDataScope internalCreateSubScope() {
		return new QueryDataScope(this);
	}

}
