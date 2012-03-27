/**
 * 
 */
package org.eclipse.jt.sql.assist.core.analysis;

import org.eclipse.jt.script.assist.analysis.ICompletionDetector;
import org.eclipse.jt.script.assist.analysis.IHighLightDetector;
import org.eclipse.jt.script.assist.analysis.ISelectionDetector;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.analysis.internal.completion.AbstractCompletionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.completion.CommandCompletionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.completion.MappingCompletionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.completion.QueryCompletionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.highlight.AbstractHighLightDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.highlight.CommandHighLishtDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.highlight.MappingHighLightDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.highlight.QueryHighLightDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.selection.CommandSelectionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.selection.MappingSelectionDetector;
import org.eclipse.jt.sql.assist.core.analysis.internal.selection.QuerySelectionDetector;


/**
 * DNA SQL�ĸ������֣�������Ҫ��Ϊ�๤����Ҳ������ģ��ĵ���״̬
 * @author Jeff Tang
 *
 */
public final class DnaSqlAnalysis {
	private DnaSqlAnalysis() {}
	

	public final static int COMPLETION_DETECTOR=0x1003;
	public final static int HIGHLIGHT_DETECTOR=0x1004;
	

	/**
	 * ָ������ִ���������Ƿ��ڵ���״̬
	 * @param actor ����ִ��������
	 * @return �Ƿ��ڵ���״̬
	 */
	public static boolean isDebug(int actor) {
		switch(actor) {
		case COMPLETION_DETECTOR: return AbstractCompletionDetector.DEBUG;
		case HIGHLIGHT_DETECTOR: return AbstractHighLightDetector.DEBUG;
		}
		return false;
	}
	
	/**
	 * ����ָ������ִ�������͵ĵ���ģʽ
	 * @param actor ����ִ��������
	 */
	public static void enableDebug(int actor) {
		switch(actor) {
		case COMPLETION_DETECTOR: AbstractCompletionDetector.DEBUG=true; break;
		case HIGHLIGHT_DETECTOR: AbstractHighLightDetector.DEBUG=true; break;
		}
	}
	
	/**
	 * �ر�ָ������ִ�������͵ĵ���
	 * @param actor ����ִ��������
	 */
	public static void disableDebug(int actor) {
		switch(actor) {
		case COMPLETION_DETECTOR: AbstractCompletionDetector.DEBUG=false; break;
		case HIGHLIGHT_DETECTOR: AbstractHighLightDetector.DEBUG=false; break;
		}
	}

	/**
	 * �������ж���ִ�������͵ĵ���
	 */
	public static void enableAllActorDebug() {
		AbstractCompletionDetector.DEBUG=true; 
		AbstractHighLightDetector.DEBUG=true;
	}
	
	/**
	 * �ر����ж���ִ�������͵ĵ���
	 */
	public static void disableAllActorDebug() {
		AbstractCompletionDetector.DEBUG=false; 
		AbstractHighLightDetector.DEBUG=false;
	}
	

	/**
	 * ����ָ�����͵Ĵ��벹ȫ��ʾ�����
	 * @param kind SQL�������
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return the completion detector created, or null if creation failed
	 */
	public static ICompletionDetector createCompletionDetector(int kind) {
		switch(kind) {
		case DnaSql.QUERY_STATEMENT:
		case DnaSql.SUBQUERY_STATEMENT:
		case DnaSql.CONDITION_EXPRESSION:
		case DnaSql.VALUE_EXPRESSION:
		case DnaSql.QUERY_DEFINE: 
			return QueryCompletionDetector.getInstance();
		case DnaSql.ORM_DEFINE: 
			return MappingCompletionDetector.getInstance();

		case DnaSql.COMMAND_DEFINE:
		case DnaSql.INSERT_DEFINE:
		case DnaSql.UPDATE_DEFINE:
		case DnaSql.DELETE_DEFINE:
			return CommandCompletionDetector.getInstance();
		default: throw new UnsupportedOperationException("unsupported completion detector kind:"+kind);
		}
	}
	
	public static ISelectionDetector<?> createSelectionDetector(int kind) {
		switch(kind) {
		case DnaSql.QUERY_STATEMENT:
		case DnaSql.SUBQUERY_STATEMENT:
		case DnaSql.CONDITION_EXPRESSION:
		case DnaSql.VALUE_EXPRESSION:
		case DnaSql.QUERY_DEFINE: 
			return QuerySelectionDetector.getInstance();
		case DnaSql.ORM_DEFINE: 
			return MappingSelectionDetector.getInstance();
		case DnaSql.COMMAND_DEFINE:
		case DnaSql.INSERT_DEFINE:
		case DnaSql.UPDATE_DEFINE:
		case DnaSql.DELETE_DEFINE:
			return CommandSelectionDetector.getInstance();
		default: throw new UnsupportedOperationException("unsupported completion detector kind:"+kind);
		}
	}
	

	/**
	 * ����ָ�����͵Ĵ�����������
	 * @param kind SQL�������
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return the completion detector created, or null if creation failed
	 */
	public static IHighLightDetector createHighLightDetector(int kind) {
		switch(kind) {
		case DnaSql.QUERY_STATEMENT:
		case DnaSql.SUBQUERY_STATEMENT:
		case DnaSql.CONDITION_EXPRESSION:
		case DnaSql.VALUE_EXPRESSION:
		case DnaSql.QUERY_DEFINE: 
			return QueryHighLightDetector.getInstance();
		case DnaSql.ORM_DEFINE: 
			return MappingHighLightDetector.getInstance();
		case DnaSql.COMMAND_DEFINE:
		case DnaSql.INSERT_DEFINE:
		case DnaSql.UPDATE_DEFINE:
		case DnaSql.DELETE_DEFINE:
			return CommandHighLishtDetector.getInstance();
		default: throw new UnsupportedOperationException("unsupported highlight detector kind:"+kind);
		}
	}
	
}
