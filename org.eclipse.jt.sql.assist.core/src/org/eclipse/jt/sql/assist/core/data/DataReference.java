/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.data;

import org.eclipse.jt.script.assist.IAstNode;


/**
 * @author Jeff Tang
 *
 */
public class DataReference<TAst extends IAstNode, TData> {
	public final TAst ast;
	public String key;
	public int ref;
	public TData data;
	
	public DataReference(TAst astnode) {
		ast=astnode; ref=0;
	}
	
	public DataReference(TAst astnode, TData data) {
		this.ast=astnode; this.ref=0; this.data=data;
	}
	
	public DataReference(String key, TAst astnode) {
		this.key = key; ast=astnode; ref=0;
	}
	
	public DataReference(String key, TAst astnode, TData data) {
		this.key = key; this.ast=astnode; this.ref=0; this.data=data;
	}
}