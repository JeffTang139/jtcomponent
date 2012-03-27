/**
 * 
 */
package org.eclipse.jt.sql.assist.core.extension;

import org.eclipse.jt.script.assist.extension.IStructureProcessor;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.extension.internal.structure.AbstractStructureProcessor;
import org.eclipse.jt.sql.assist.core.extension.internal.structure.CommandStructureProcessor;
import org.eclipse.jt.sql.assist.core.extension.internal.structure.MappingStructureProcessor;
import org.eclipse.jt.sql.assist.core.extension.internal.structure.QueryStructureProcessor;


/**
 * DNA SQL�ĸ������֣�������Ҫ��Ϊ�๤����Ҳ������ģ��ĵ���״̬
 * @author Jeff Tang
 *
 */
public final class DnaSqlExtension {
	private DnaSqlExtension() {}
	

	public final static int STRUCTURE_PROCESSOR=0x3001;
	

	/**
	 * ָ������ִ���������Ƿ��ڵ���״̬
	 * @param actor ����ִ��������
	 * @return �Ƿ��ڵ���״̬
	 */
	public static boolean isDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: return AbstractStructureProcessor.DEBUG;
		}
		return false;
	}
	
	/**
	 * ����ָ������ִ�������͵ĵ���ģʽ
	 * @param actor ����ִ��������
	 */
	public static void enableDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: AbstractStructureProcessor.DEBUG=true; break;
		}
	}
	
	/**
	 * �ر�ָ������ִ�������͵ĵ���
	 * @param actor ����ִ��������
	 */
	public static void disableDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: AbstractStructureProcessor.DEBUG=false; break;
		}
	}

	/**
	 * �������ж���ִ�������͵ĵ���
	 */
	public static void enableAllActorDebug() {
		AbstractStructureProcessor.DEBUG=true; 
	}
	
	/**
	 * �ر����ж���ִ�������͵ĵ���
	 */
	public static void disableAllActorDebug() {
		AbstractStructureProcessor.DEBUG=false; 
	}
	

	
	public static IStructureProcessor<?> createStructureProcessor(int kind) {
		switch(kind) {
		case DnaSql.QUERY_STATEMENT:
		case DnaSql.SUBQUERY_STATEMENT:
		case DnaSql.CONDITION_EXPRESSION:
		case DnaSql.VALUE_EXPRESSION:
		case DnaSql.QUERY_DEFINE: 
			return QueryStructureProcessor.getInstance();
		case DnaSql.ORM_DEFINE: 
			return MappingStructureProcessor.getInstance();
		case DnaSql.COMMAND_DEFINE:
		case DnaSql.INSERT_DEFINE:
		case DnaSql.UPDATE_DEFINE:
		case DnaSql.DELETE_DEFINE:
			return CommandStructureProcessor.getInstance();
		default: throw new UnsupportedOperationException("unsupported structure processor kind:"+kind);
		}
	}
	
}
