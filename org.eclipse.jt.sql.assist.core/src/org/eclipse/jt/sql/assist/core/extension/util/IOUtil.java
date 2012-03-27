/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.extension.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author Jeff Tang
 *
 */
public class IOUtil {
	public static String loadFile(File file) {
		try {
			FileInputStream stream=new FileInputStream(file);
			return loadStream(stream);
		} catch (FileNotFoundException e1) {
			return null;
		}
	}
	
	public static String loadStream(InputStream stream) {
		BufferedReader  reader = new BufferedReader(new InputStreamReader(stream));
		
		StringBuffer buffer=new StringBuffer();
		try {
			String content=null;
			String lineSep=System.getProperty("line.separator");
			while((content=reader.readLine())!=null) {
				buffer.append(content).append(lineSep);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
	public static File findFile(File root, final String fileName, final String ext, int maxLevel) {
		if(maxLevel<=0) return null;
		
		File file=null;
		
		File[] childs=root.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if(!pathname.isFile()) return false;
				if(ext!=null) {
					return pathname.getName().equalsIgnoreCase(fileName);
				} else {
					return pathname.getName().startsWith(fileName);
				}
			}
		});
		if(childs!=null&&childs.length>0) {
			file=childs[0];
			for(int i=1;i<childs.length;i++) {
				if(file.getName().length()>childs[i].getName().length())
					file=childs[i];
			}
			return file;
		}

		if(maxLevel>1) {
			childs=root.listFiles(new FileFilter() {
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			});
			if(childs!=null&&childs.length>0) {
				for(int i=0;i<childs.length;i++) {
					file=findFile(childs[i],fileName,ext,maxLevel-1);
					if(file!=null) return file;
				}
			}
		}
		return file;
	}
	
	public static void listFiles(File root, final String prefix, final String subffix, int maxLevel, List<File> files) {
		if(maxLevel<=0) return;
		
		File[] childs=root.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if(!pathname.isFile()) return false;
				return (subffix==null||pathname.getName().toUpperCase().endsWith(subffix.toUpperCase()))
				&&(prefix==null||pathname.getName().toUpperCase().startsWith(prefix.toUpperCase()));
			}
		});
		if(childs!=null&&childs.length>0) {
			for(int i=0;i<childs.length;i++) {
				files.add(childs[i]);
			}
		}

		if(maxLevel>1) {
			childs=root.listFiles(new FileFilter() {
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			});
			if(childs!=null&&childs.length>0) {
				for(int i=0;i<childs.length;i++) {
					listFiles(childs[i], prefix, subffix, maxLevel-1, files);
				}
			}
		}
	}
	
	public static String getNameWithoutExt(String filename, final String ext) {
		if(ext==null) return filename;
		int index=filename.length()-ext.length();
		if(index-1>=0&&filename.charAt(index-1)=='.') {
			filename = filename.substring(0,index-1);
		} else if(index>=0) {
			filename = filename.substring(0,index);
		}
		return filename;
	}
	
	public static String getOppositePath(File root, File file) {
		String rn=root.getAbsolutePath();
		String fn=file.getAbsolutePath();
		String path=null;
		if(fn.startsWith(rn)) path=fn.substring(rn.length());
		else path=fn;
		if(path!=null) {
			path=path.replace('\\', '.');
			path=path.replace('/', '.');
			if(path.startsWith("."))
				path=path.substring(1);
		}
		return path;
	}
}
