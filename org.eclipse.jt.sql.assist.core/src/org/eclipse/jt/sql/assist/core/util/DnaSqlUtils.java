/**
 * 
 */
package org.eclipse.jt.sql.assist.core.util;

import java.util.List;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.IDataDescriptor;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.visit.IAstWalker;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.ast.general.ArgumentDeclaration;
import org.eclipse.jt.sql.assist.core.data.define.DataDescriptor;
import org.eclipse.jt.sql.assist.core.process.AbstractMessager;
import org.eclipse.jt.sql.assist.core.process.SourcePosition;


/**
 * @author Jeff Tang
 *
 */
public final class DnaSqlUtils {
	
	private DnaSqlUtils() { }
	
	public static boolean isUsingMessageIndent() {return AbstractMessager.USING_MESSAGE_INDENT; }
	public static void setUsingMessageIndent(boolean usingIndent) { AbstractMessager.USING_MESSAGE_INDENT=usingIndent; }

	public static ISourcePosition getSourcePosition(int offset, int length) {
		if(offset<0) offset=-1;
		if(length<0) 
			throw new IllegalArgumentException("Length of source cannot be less than 0.");
		return new SourcePosition(offset,offset+length);
	}
	
	public static boolean isEmptyPosition(ISourcePosition pos) {
		return pos==null || pos.getEnd()<0 || pos.getStart()<0;
	}

	
	public static IDataDescriptor createDataDescriptor(int type, String name, String description) {
		return new DataDescriptor(type,name, description);
	}
	
	public static IDataDescriptor createDataDescriptor(int type, String name, String description, Object source) {
		return new DataDescriptor(type,name, description, source);
	}
//
//	private static Map<String,DataType> s_typeMap;
//	
//	private synchronized static Map<String,DataType> getDataTypeMap() {
//		if(s_typeMap==null) {
//			s_typeMap=new HashMap<String,DataType>();
//			
//
//			/* 需要添加更多类型支持时，在这里添加关联项
//			 * 格式为：（java类型名称，类型定义  ）
//			 */
//			
//			s_typeMap.put("boolean", TypeFactory.BOOLEAN);
//			s_typeMap.put("byte", TypeFactory.BYTE);
//			s_typeMap.put("double", TypeFactory.DOUBLE);
//			s_typeMap.put("float", TypeFactory.FLOAT);
//			s_typeMap.put("int", TypeFactory.INT);
//			s_typeMap.put("long", TypeFactory.LONG);
//			s_typeMap.put("short", TypeFactory.SHORT);
//			
//			s_typeMap.put("byte[]", TypeFactory.BYTES);
////			s_typeMap.put("boolean[]", TypeFactory.BOOLEAN_ARRAY);
////			s_typeMap.put("double[]", TypeFactory.DOUBLE_ARRAY);
////			s_typeMap.put("float[]", TypeFactory.FLOAT_ARRAY);
////			s_typeMap.put("int[]", TypeFactory.INT_ARRAY);
////			s_typeMap.put("long[]", TypeFactory.LONG_ARRAY);
////			s_typeMap.put("short[]", TypeFactory.SHORT_ARRAY);
//			
//			//s_typeMap.put("Boolean", TypeFactory.BOOLEAN);
//			//s_typeMap.put("Byte", TypeFactory.BYTE);
//			//s_typeMap.put("Double", TypeFactory.DOUBLE);
//			//s_typeMap.put("Float", TypeFactory.FLOAT);
//			//s_typeMap.put("Integer", TypeFactory.INT);
//			//s_typeMap.put("Long", TypeFactory.LONG);
//			//s_typeMap.put("Short", TypeFactory.SHORT);
//			s_typeMap.put("String", TypeFactory.STRING);
//			//s_typeMap.put("Date", TypeFactory.DATE);
//			s_typeMap.put("GUID", TypeFactory.GUID);
//			
//			//s_typeMap.put("java.lang.Boolean", TypeFactory.BOOLEAN);
//			//s_typeMap.put("java.lang.Byte", TypeFactory.BYTE);
//			//s_typeMap.put("java.lang.Double", TypeFactory.DOUBLE);
//			//s_typeMap.put("java.lang.Float", TypeFactory.FLOAT);
//			//s_typeMap.put("java.lang.Integer", TypeFactory.INT);
//			//s_typeMap.put("java.lang.Long", TypeFactory.LONG);
//			//s_typeMap.put("java.lang.Short", TypeFactory.SHORT);
//			s_typeMap.put("java.lang.String", TypeFactory.STRING);
////			s_typeMap.put("java.lang.Date", TypeFactory.DATE);
//			s_typeMap.put("org.eclipse.jt.core.type.GUID", TypeFactory.GUID);
//			
//			//s_typeMap.put("Byte[]", TypeFactory.BYTES);
//			//s_typeMap.put("Boolean[]", TypeFactory.BOOLEAN_ARRAY);
//			//s_typeMap.put("Double[]", TypeFactory.DOUBLE_ARRAY);
//			//s_typeMap.put("Float[]", TypeFactory.FLOAT_ARRAY);
//			//s_typeMap.put("Integer[]", TypeFactory.INT_ARRAY);
//			//s_typeMap.put("Long[]", TypeFactory.LONG_ARRAY);
//			//s_typeMap.put("Short[]", TypeFactory.SHORT_ARRAY);
//			//s_typeMap.put("String[]", TypeFactory.STRING_ARRAY);
//			//s_typeMap.put("GUID[]", TypeFactory.GUID_ARRAY);
//
//			//s_typeMap.put("java.lang.Byte[]", TypeFactory.BYTES);
//			//s_typeMap.put("java.lang.Boolean[]", TypeFactory.BOOLEAN_ARRAY);
//			//s_typeMap.put("java.lang.Double[]", TypeFactory.DOUBLE_ARRAY);
//			//s_typeMap.put("java.lang.Float[]", TypeFactory.FLOAT_ARRAY);
//			//s_typeMap.put("java.lang.Integer[]", TypeFactory.INT_ARRAY);
//			//s_typeMap.put("java.lang.Long[]", TypeFactory.LONG_ARRAY);
//			//s_typeMap.put("java.lang.Short[]", TypeFactory.SHORT_ARRAY);
//			//s_typeMap.put("java.lang.String[]", TypeFactory.STRING_ARRAY);
//			//s_typeMap.put("org.eclipse.jt.core.type.GUID[]", TypeFactory.GUID_ARRAY);
//		}
//		return s_typeMap;
//	}
//	
//	public static DataType typeOfJavaType(String javaTypeName) {
//		return javaTypeName==null?null:getDataTypeMap().get(javaTypeName);
//	}
	
	public static String getExceptionMessage(Throwable e) {
		String msg=e.getMessage();
		if(msg==null) msg=e.getLocalizedMessage();
		if(msg==null&&e.getCause()!=null) msg=getExceptionMessage(e.getCause());
		if(msg==null) msg=e.toString();
		return msg;
	}
	
	public static IAstNode locateAstNode(IAstNode astRoot, int sqlKind, final ISourcePosition pos, final List<IAstNode> pathRequestor) {
		final IAstNode[] located=new IAstNode[1];
		IVisitDriver<?> processor=DnaSql.getDefault().createVisitDriver(sqlKind, DnaSql.POLICY_DEFAULT);
		IAstWalker walker = new IAstWalker() {

			public boolean enterGeneral(IAstNode ast) {
				if(ast.getPosition().contains(pos)) {
					if(pathRequestor!=null) pathRequestor.add(ast);
					located[0]=ast;
					return true;
				}
				return false;
			}

			public boolean exitGeneral(IAstNode ast) {
				return false;
			}

			public <TAdaptor> TAdaptor getAdaptor(Class<TAdaptor> clazz) {
				return null;
			}
			
		};
		processor.initialize(walker);
		try {
			processor.process(astRoot);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return located[0];
	}
	

	
	public static String getArgumentName(String argu) {
		if(ArgumentDeclaration.ARGUMETN_PREFIX!=null&&argu.startsWith(ArgumentDeclaration.ARGUMETN_PREFIX))
			argu=argu.substring(ArgumentDeclaration.ARGUMETN_PREFIX.length());
		return argu;
	}
	
	public static String getUnlimitID(String id) {
		if(id!=null && id.length()>=2 && id.charAt(0)=='\"' && id.charAt(id.length()-1)=='\"') {
			id=id.substring(1, id.length()-1);
		}
		return id;
	}
}
