/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core;
//
//import org.eclipse.jt.core.def.obja.MappingQueryDeclare;
//import org.eclipse.jt.core.def.query.QueryDeclare;
//import org.eclipse.jt.core.spi.application.AppUtil;
import org.eclipse.jt.script.assist.IDataScope;
import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.IScriptLanguage;
import org.eclipse.jt.script.assist.backend.IGenerator;
import org.eclipse.jt.script.assist.backend.IGeneratorFactory;
import org.eclipse.jt.script.assist.frontend.ISemanticChecker;
import org.eclipse.jt.script.assist.frontend.ISourceParser;
import org.eclipse.jt.script.assist.frontend.ISourceParserFactory;
import org.eclipse.jt.script.assist.visit.IVisitControler;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.data.CommandDataScope;
import org.eclipse.jt.sql.assist.core.data.IBaseScopeDataKinds;
import org.eclipse.jt.sql.assist.core.data.MappingDataScope;
import org.eclipse.jt.sql.assist.core.data.QueryDataScope;
import org.eclipse.jt.sql.assist.core.internal.semantic.CommandSemanticChecker;
import org.eclipse.jt.sql.assist.core.internal.semantic.MappingSemanticChecker;
import org.eclipse.jt.sql.assist.core.internal.semantic.QuerySemanticChecker;
import org.eclipse.jt.sql.assist.core.internal.visit.CommandVisitDriver;
import org.eclipse.jt.sql.assist.core.internal.visit.MappingVisitDriver;
import org.eclipse.jt.sql.assist.core.internal.visit.QueryVisitDriver;
import org.eclipse.jt.sql.assist.core.kinds.ScopeDataKinds;
import org.eclipse.jt.sql.assist.core.process.AbstractGenerator;
import org.eclipse.jt.sql.assist.core.process.AbstractSemanticChecker;
import org.eclipse.jt.sql.assist.core.process.AbstractSourceParser;
import org.eclipse.jt.sql.assist.core.process.DefaultVisitControler;
import org.eclipse.jt.sql.assist.core.process.PositionManager;



/**
 * 具有基本的操作，可以初始化环境，并管理调试状态。同时也作为各组件的类工厂。
 * @author Jeff Tang
 */
public final class DnaSql implements IScriptLanguage {
	
	private DnaSql() {/* do nothing */}
	
	private static boolean s_isInitialized=false;
	
	/**
	 * 初始化DnaSql的处理环境
	 */
	public static void initializeEnvironment() {
		if(!s_isInitialized) {
			s_isInitialized=true;
		}
	}
	
	/**
	 * 是否启用调试状态。
	 * 该状态独立于各动作执行器的调试状态
	 */
	public static boolean DEBUG = Boolean.parseBoolean(System.getProperty("dnasql.assist.debug"));

	/**
	 * 解析器的动作执行器类型代号
	 */
	public final static int SOURCE_PARSER=0x1000;

	/**
	 * 代码生成器的动作执行器类型代号
	 */
	public final static int CODE_GENERATOR=0x1001;

	/**
	 * 语义分析器的动作执行器类型代号
	 */
	public final static int SEMANTIC_CHECKER=0x1002;
	
	/**
	 * 指定动作执行器类型是否处于调试状态
	 * @param actor 动作执行器类型
	 * @return 是否处于调试状态
	 */
	public static boolean isDebug(int actor) {
		switch(actor) {
		case SOURCE_PARSER: return AbstractSourceParser.DEBUG;
		case CODE_GENERATOR: return AbstractGenerator.DEBUG;
		case SEMANTIC_CHECKER: return AbstractSemanticChecker.DEBUG;
		}
		return false;
	}
	
	/**
	 * 启用指定动作执行器类型的调试模式
	 * @param actor 动作执行器类型
	 */
	public static void enableDebug(int actor) {
		switch(actor) {
		case SOURCE_PARSER: AbstractSourceParser.DEBUG=true; break;
		case CODE_GENERATOR: AbstractGenerator.DEBUG=true; break;
		case SEMANTIC_CHECKER: AbstractSemanticChecker.DEBUG=true; break;
		}
	}
	
	/**
	 * 关闭指定动作执行器类型的调试
	 * @param actor 动作执行器类型
	 */
	public static void disableDebug(int actor) {
		switch(actor) {
		case SOURCE_PARSER: AbstractSourceParser.DEBUG=false; break;
		case CODE_GENERATOR: AbstractGenerator.DEBUG=false; break;
		case SEMANTIC_CHECKER: AbstractSemanticChecker.DEBUG=false; break;
		}
	}

	/**
	 * 启用所有动作执行器类型的调试
	 */
	public static void enableAllBasicActorDebug() {
		AbstractSourceParser.DEBUG=true;
		AbstractGenerator.DEBUG=true;
		AbstractSemanticChecker.DEBUG=true;
	}
	
	/**
	 * 关闭所有动作执行器类型的调试
	 */
	public static void disableAllBasicActorDebug() {
		AbstractSourceParser.DEBUG=false;
		AbstractGenerator.DEBUG=false;
		AbstractSemanticChecker.DEBUG=false;
	}
	
	private static DnaSql s_default = new DnaSql();
	
	public static DnaSql getDefault() {
		return s_default;
	}
	
	/**
	 * DNA SQL 的实体定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int ENTITY_DEFINE=0x00;
	
	/**
	 * DNA SQL 的存储表定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int TABLE_DEFINE=0x01;
	
	/**
	 * DNA SQL 的查询定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int QUERY_DEFINE=0x02;
	
	/**
	 * DNA SQL 的实体关系映射定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int ORM_DEFINE=0x03;
	
	/**
	 * DNA SQL 的数据更新定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int UPDATE_DEFINE=0x04;
	
	/**
	 * DNA SQL 的数据插入定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int INSERT_DEFINE=0x05;
	
	/**
	 * DNA SQL 的数据删除定义类型，也作为数据载入器的数据类型参数
	 */
	public final static int DELETE_DEFINE=0x06;

	/**
	 * DNA SQL 的查询语句，与标准SQL的查询语句的结构几乎一样
	 */
	public final static int QUERY_STATEMENT=0x1010;
	
	/**
	 * DNA SQL 的子查询语句，与标准SQL的子查询的结构几乎一样
	 */
	public final static int SUBQUERY_STATEMENT=0x1011;
	
	/**
	 * DNA SQL 的条件表达式，条件表达式不作为值，与VALUE_EXPRESSION严格区分
	 */
	public final static int CONDITION_EXPRESSION=0x1020;
	
	/**
	 * DNA SQL 的值表达式，值表达式不作为条件，与CONDITION_EXPRESSION严格区分
	 */
	public final static int VALUE_EXPRESSION=0x1028;
	
	
	/**
	 * DNA SQL语句类型标识允许的最大值
	 */
	public final static int DNA_SQL_IDENTIFY_MAX=0xFFFF;
	
	
	/**
	 * @see #INSERT_DEFINE
	 * @see #UPDATE_DEFINE
	 * @see #DELETE_DEFINE
	 */
	public final static int COMMAND_DEFINE=0xF1;
	
	private static ISourceParserFactory s_SourceParserFactory;
	private static IGeneratorFactory s_GeneratorFactory;

	public static ISourceParserFactory getSourceParserFactory() {
		return s_SourceParserFactory;
	}
	
	public static void setSourceParserFactory(ISourceParserFactory sourceParserFactory) {
		s_SourceParserFactory=sourceParserFactory;
	}
	
	public static IGeneratorFactory getGeneratorFactory() {
		return s_GeneratorFactory;
	}

	public static void setGeneratorFactory(IGeneratorFactory generatorFactory) {
		s_GeneratorFactory = generatorFactory;
	}

	public void initialize() {
		initializeEnvironment();
	}

	/**
	 * 创建已定义语句类型的脚本解析器
	 * @param kind 语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return 脚本解析器
	 */
	public ISourceParser createSourceParser(int kind) {
		if(s_SourceParserFactory==null) 
			throw new UnsupportedOperationException("cannot found source parser factory");
		return s_SourceParserFactory.createDefinedSourceParser(kind);
	}

	/**
	 * 创建自定义语句类型的脚本解析器
	 * @param statementName 语句名称
	 * @return 脚本解析器
	 */
	public ISourceParser createCustomSourceParser(String statementName) throws SecurityException, NoSuchMethodException {
		if(s_SourceParserFactory==null) 
			throw new UnsupportedOperationException("cannot found source parser factory");
		return s_SourceParserFactory.createCustomSourceParser(statementName);
	}


	/**
	 * 创建指定类型的目标代码生成器
	 * @param kind SQL语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return the generator created, or null if creation failed
	 */
	public IGenerator<?> createGenerator(int kind) {
		if(s_GeneratorFactory==null) 
			throw new UnsupportedOperationException("cannot found generator factory");
		return s_GeneratorFactory.createGenerator(kind);
	}

	/**
	 * 创建指定类型的语义检查器
	 * @param kind SQL语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return the semantic checker created, or null if creation failed
	 */
	public ISemanticChecker createSemanticChecker(int kind) {
		switch(kind) {
		case QUERY_STATEMENT:
		case SUBQUERY_STATEMENT:
		case CONDITION_EXPRESSION:
		case VALUE_EXPRESSION:
		case QUERY_DEFINE: 
			return QuerySemanticChecker.getInstance();
		case ORM_DEFINE: 
			return MappingSemanticChecker.getInstance();
		case COMMAND_DEFINE:
		case INSERT_DEFINE:
		case UPDATE_DEFINE:
		case DELETE_DEFINE:
			return CommandSemanticChecker.getInstance();
		default: throw new UnsupportedOperationException("unsupported semantic checker kind:"+kind);
		}
	}



	public static final int POLICY_PROCESS = 0;
	public static final int POLICY_SOURCE = 1;
	public static final int POLICY_DEFAULT = POLICY_PROCESS;
	
	/**
	 * 创建指定类型的抽象语法树遍历的执行器，采用的是深度优先的遍历算法。
	 * @param kind SQL语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @param policy 遍历顺序的策略
	 * @see DnaSql#POLICY_DEFAULT
	 * @see DnaSql#POLICY_PROCESS
	 * @see DnaSql#POLICY_SOURCE
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public IVisitDriver<?> createVisitDriver(int kind, int policy) {
		return createVisitDriver(kind, new DefaultVisitControler(policy,IBaseScopeDataKinds.NONE,null));
	}
	
	/**
	 * 创建指定类型的抽象语法树遍历的执行器，采用的是深度优先的遍历算法。
	 * @param kind SQL语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @param walker 抽象语法树的访问器，创建的Processor将为其服务。该参数可以为null
	 * @param controler 节点访问的控制器，不能为null
	 * @see DefaultVisitControler
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <TScope extends IDataScope<TScope>> IVisitDriver<TScope> createVisitDriver(int kind, IVisitControler<TScope> controler) {
		switch(kind) {
		case QUERY_STATEMENT:
		case SUBQUERY_STATEMENT:
		case CONDITION_EXPRESSION:
		case VALUE_EXPRESSION:
		case QUERY_DEFINE: 
			return (IVisitDriver<TScope>) QueryVisitDriver.getInstance((IVisitControler<QueryDataScope>) controler);
		case ORM_DEFINE: 
			return (IVisitDriver<TScope>) MappingVisitDriver.getInstance((IVisitControler<MappingDataScope>) controler);

		case COMMAND_DEFINE:
		case INSERT_DEFINE:
		case UPDATE_DEFINE:
		case DELETE_DEFINE:
			return (IVisitDriver<TScope>) CommandVisitDriver.getInstance((IVisitControler<CommandDataScope>) controler);
		default: throw new UnsupportedOperationException("unsupported walk processor kind:"+kind);
		}
	}

	
	public <TScope extends IDataScope<TScope>> IVisitControler<TScope> 
			createDefaultVisitControler(int policy, int buildScopeDataKind, TScope dataScope) {
		return new DefaultVisitControler<TScope>(policy, buildScopeDataKind, dataScope);
	}
	
	@SuppressWarnings("unchecked")
	public IVisitControler<?> createDefaultVisitControler(int policy) {
		return new DefaultVisitControler(policy, ScopeDataKinds.NONE, null);
	}
	
	/**
	 * 创建指定源码的位置管理器，用于创建和转换位置
	 * @param content the source code to manager
	 * @return position manager
	 */
	public IPositionManager createPositionManager(String id, String content) {
		return new PositionManager(id, content);
	}

	/**
	 * 创建指定类型的数据域。
	 * @param kind SQL语句类型
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return
	 */
	public IDataScope<?> createDataScope(int kind) {
		switch(kind) {
		case QUERY_STATEMENT:
		case SUBQUERY_STATEMENT:
		case CONDITION_EXPRESSION:
		case VALUE_EXPRESSION:
		case QUERY_DEFINE: 
			return QueryDataScope.getInstance();
		case ORM_DEFINE: 
			return MappingDataScope.getInstance();

		case COMMAND_DEFINE:
		case INSERT_DEFINE:
		case UPDATE_DEFINE:
		case DELETE_DEFINE:
			return CommandDataScope.getInstance();
		default: throw new UnsupportedOperationException("unsupported data scope kind:"+kind);
		}
	}
}
