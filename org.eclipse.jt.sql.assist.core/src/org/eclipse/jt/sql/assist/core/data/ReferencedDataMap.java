/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.jt.script.assist.IAstNode;



/**
 * 
 * @author Jeff Tang
 *
 * @param <TData> 数据类型
 */
public class ReferencedDataMap<TNode extends IAstNode, TData> extends HashMap<String, DataReference<TNode, TData>> {

	private static final long serialVersionUID = -985541219785656436L;
	
	private ReferencedDataMap<TNode, TData> fParent;

	public ReferencedDataMap() {
		super();
		fParent=null;
	}
	
	public ReferencedDataMap(ReferencedDataMap<TNode, TData> parent) {
		super();
		fParent=parent;
	}
	
	@Override
	public DataReference<TNode, TData> get(Object key) {
		DataReference<TNode, TData> refable = super.get(key);
		if(refable!=null) {
			return refable;
		} else if(fParent!=null) {
			return fParent.get(key);
		} else {
			return null;
		}
	}
	
	@Override
	public boolean containsKey(Object key) {
		return super.containsKey(key) || (fParent!=null && fParent.containsKey(key));
	}
	
	@Override
	public boolean containsValue(Object value) {
		return super.containsValue(value) || (fParent!=null && fParent.containsValue(value));
	}

	public DataReference<TNode, TData> getLocal(Object key) {
		return super.get(key);
	}

	public boolean containsLocalKey(Object key) {
		return super.containsKey(key);
	}
	
	public boolean containsLocalValue(Object value) {
		return super.containsValue(value);
	}

	public ReferencedDataMap<TNode, TData> createSubMap() {
		return new ReferencedDataMap<TNode, TData>(this);
	}
	

	public void collectNames(String prefix,Collection<String> names, boolean ignoreCase) {
		if(prefix!=null&&ignoreCase) prefix=prefix.toLowerCase();
		if(prefix==null || prefix.length()==0) {
			names.addAll(this.keySet());
		} else {
			for(String name: this.keySet()) {
				if(ignoreCase) {
					if(name.toLowerCase().startsWith(prefix)) {
						names.add(name);
					}
				} else {
					if(name.startsWith(prefix)) {
						names.add(name);
					}
				}
			}
		}
		if(fParent!=null) 
			fParent.collectNames(prefix,names,ignoreCase);
	}
}
