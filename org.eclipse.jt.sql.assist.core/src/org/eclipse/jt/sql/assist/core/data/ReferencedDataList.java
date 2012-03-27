/**
 * 
 */
package org.eclipse.jt.sql.assist.core.data;

import java.util.ArrayList;

import org.eclipse.jt.script.assist.IAstNode;


/**
 * @author Jeff Tang
 *
 */
public class ReferencedDataList<TNode extends IAstNode, TData> extends ArrayList<DataReference<TNode, TData>> {
	
	private static final long serialVersionUID = -5093775118552823132L;
//
//	public class ReferencedDataItem {
//		public String key;
//		public DataReference<TNode, TData> data;
//		
//		public ReferencedDataItem(String key, DataReference<TNode, TData> data) {
//			this.key = key;
//			this.data = data;
//		}
//	}

	private ReferencedDataList<TNode, TData> fParent;
	

	public ReferencedDataList() {
		super();
		fParent=null;
	}
	
	public ReferencedDataList(ReferencedDataList<TNode, TData> parent) {
		super();
		fParent=parent;
	}
	
	public void put(String key, DataReference<TNode, TData> data) {
		data.key = key;
		this.add(data);
	}

	public DataReference<TNode, TData> get(Object key) {
		DataReference<TNode, TData> refable = null;
		for(DataReference<TNode, TData> item: this) {
			if(item!=null && item.key.equals(key)) {
				refable = item;
				break;
			}
		}
		if(refable!=null) {
			return refable;
		} else if(fParent!=null) {
			return fParent.get(key);
		} else {
			return null;
		}
	}
	
	@Override
	public DataReference<TNode, TData> get(int index) {
		return super.get(index);
	}
	
	public boolean containsKey(Object key) {
		return get(key)!=null;
	}
	
	public boolean containsValue(Object value) {
		return fParent!=null && fParent.containsValue(value);
	}
}
