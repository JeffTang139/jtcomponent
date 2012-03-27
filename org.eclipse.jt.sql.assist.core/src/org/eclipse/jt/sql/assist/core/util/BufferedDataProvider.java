/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jt.script.assist.IDataDefine;
import org.eclipse.jt.script.assist.IDataDescriptor;
import org.eclipse.jt.script.assist.IDataProvider;
import org.eclipse.jt.script.assist.IWarnings;
import org.eclipse.jt.script.assist.backend.IGeneratorDataProvider;
import org.eclipse.jt.sql.assist.core.data.DataKinds;


/**
 * @author Jeff Tang
 *
 */
public class BufferedDataProvider implements IDataProvider, IGeneratorDataProvider {
	
	private IGeneratorDataProvider fLoader;
	private Map<String, IDataDefine>[] fDataBuffer;
	private Map<String, IDataDescriptor[]>[] fDescriptorBuffer;

	@SuppressWarnings("unchecked")
	public BufferedDataProvider(IGeneratorDataProvider loader, int typeCount) {
		this.fLoader=loader;
		this.fDataBuffer=new Map[typeCount];
		this.fDescriptorBuffer=new Map[typeCount];
	}

	@SuppressWarnings("unchecked")
	public BufferedDataProvider(IGeneratorDataProvider loader) {
		this.fLoader=loader;
		this.fDataBuffer=new Map[DataKinds.TYPE_COUNT];
		this.fDescriptorBuffer=new Map[DataKinds.TYPE_COUNT];
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jt.sql.assist.core.IDataProvider#loadData(java.lang.String, int)
	 */
	public IDataDefine loadData(String name, int type, Map<String,String> configs, IWarnings warnings) throws Throwable {
		IDataDefine data=null;
		if(type>=0 && type<fDataBuffer.length && fDataBuffer[type]!=null) {
			data=fDataBuffer[type].get(name);
		}
		if(data==null) {
			data=this.fLoader.loadData(name, type, configs, warnings);
			bufferData(name,type,data);
		}
		return data;
	}
	
	public void bufferData(String name, int type, IDataDefine data) {
		if(data!=null && type>=0 && type<fDataBuffer.length) {
			if(fDataBuffer[type]==null) fDataBuffer[type]=new HashMap<String,IDataDefine>();
			fDataBuffer[type].put(name, data);
		}
	}
	
	public void clearDataBuffer(int type) {
		if(type>=0 && type<fDataBuffer.length && fDataBuffer[type]!=null) {
			fDataBuffer[type].clear();
		}
	}

	public IDataDescriptor[] listDescriptors(String prefix, int type, Map<String,String> configs) {
		IDataDescriptor[] descs=null;
		if(type>=0 && type<fDescriptorBuffer.length && fDescriptorBuffer[type]!=null) {
			descs=fDescriptorBuffer[type].get(prefix==null?"":prefix);
		}
		if(descs==null) {
			descs=this.fLoader.listDescriptors(prefix, type, configs);
			bufferDescriptor(prefix, type, descs);
		}
		return descs;
	}
	
	public void bufferDescriptor(String prefix, int type, IDataDescriptor[] descs) {
		if(descs!=null && type>=0 && type<fDescriptorBuffer.length) {
			if(fDescriptorBuffer[type]==null) fDescriptorBuffer[type]=new HashMap<String,IDataDescriptor[]>();
			fDescriptorBuffer[type].put(prefix==null?"":prefix, descs);
		}
	}
	
	public void clearDescriptorBuffer(int type) {
		if(type>=0 && type<fDescriptorBuffer.length && fDescriptorBuffer[type]!=null) {
			fDescriptorBuffer[type].clear();
		}
	}

	public IDataDescriptor getDescriptor(String id, int kind,
			Map<String, String> configs) throws Throwable {
		return fLoader.getDescriptor(id, kind, configs);
	}

	public InputStream getInputStream(IDataDescriptor dataDes)
			throws Throwable {
		return fLoader.getInputStream(dataDes);
	}

	public String getPackage(IDataDescriptor dataDes) {
		return fLoader.getPackage(dataDes);
	}

	public String getTargetName(IDataDescriptor dataDes) {
		return fLoader.getTargetName(dataDes);
	}

}
