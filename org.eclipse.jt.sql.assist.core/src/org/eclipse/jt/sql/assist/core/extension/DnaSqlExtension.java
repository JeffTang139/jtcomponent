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
 * DNA SQL的辅助部分，该类主要作为类工厂，也管理辅助模块的调试状态
 * @author Jeff Tang
 *
 */
public final class DnaSqlExtension {
	private DnaSqlExtension() {}
	

	public final static int STRUCTURE_PROCESSOR=0x3001;
	

	/**
	 * 指定动作执行器类型是否处于调试状态
	 * @param actor 动作执行器类型
	 * @return 是否处于调试状态
	 */
	public static boolean isDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: return AbstractStructureProcessor.DEBUG;
		}
		return false;
	}
	
	/**
	 * 启用指定动作执行器类型的调试模式
	 * @param actor 动作执行器类型
	 */
	public static void enableDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: AbstractStructureProcessor.DEBUG=true; break;
		}
	}
	
	/**
	 * 关闭指定动作执行器类型的调试
	 * @param actor 动作执行器类型
	 */
	public static void disableDebug(int actor) {
		switch(actor) {
		case STRUCTURE_PROCESSOR: AbstractStructureProcessor.DEBUG=false; break;
		}
	}

	/**
	 * 启用所有动作执行器类型的调试
	 */
	public static void enableAllActorDebug() {
		AbstractStructureProcessor.DEBUG=true; 
	}
	
	/**
	 * 关闭所有动作执行器类型的调试
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
