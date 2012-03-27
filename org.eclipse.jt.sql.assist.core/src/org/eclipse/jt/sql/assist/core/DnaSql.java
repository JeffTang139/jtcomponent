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
 * ���л����Ĳ��������Գ�ʼ�����������������״̬��ͬʱҲ��Ϊ��������๤����
 * @author Jeff Tang
 */
public final class DnaSql implements IScriptLanguage {
	
	private DnaSql() {/* do nothing */}
	
	private static boolean s_isInitialized=false;
	
	/**
	 * ��ʼ��DnaSql�Ĵ�����
	 */
	public static void initializeEnvironment() {
		if(!s_isInitialized) {
			s_isInitialized=true;
		}
	}
	
	/**
	 * �Ƿ����õ���״̬��
	 * ��״̬�����ڸ�����ִ�����ĵ���״̬
	 */
	public static boolean DEBUG = Boolean.parseBoolean(System.getProperty("dnasql.assist.debug"));

	/**
	 * �������Ķ���ִ�������ʹ���
	 */
	public final static int SOURCE_PARSER=0x1000;

	/**
	 * �����������Ķ���ִ�������ʹ���
	 */
	public final static int CODE_GENERATOR=0x1001;

	/**
	 * ����������Ķ���ִ�������ʹ���
	 */
	public final static int SEMANTIC_CHECKER=0x1002;
	
	/**
	 * ָ������ִ���������Ƿ��ڵ���״̬
	 * @param actor ����ִ��������
	 * @return �Ƿ��ڵ���״̬
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
	 * ����ָ������ִ�������͵ĵ���ģʽ
	 * @param actor ����ִ��������
	 */
	public static void enableDebug(int actor) {
		switch(actor) {
		case SOURCE_PARSER: AbstractSourceParser.DEBUG=true; break;
		case CODE_GENERATOR: AbstractGenerator.DEBUG=true; break;
		case SEMANTIC_CHECKER: AbstractSemanticChecker.DEBUG=true; break;
		}
	}
	
	/**
	 * �ر�ָ������ִ�������͵ĵ���
	 * @param actor ����ִ��������
	 */
	public static void disableDebug(int actor) {
		switch(actor) {
		case SOURCE_PARSER: AbstractSourceParser.DEBUG=false; break;
		case CODE_GENERATOR: AbstractGenerator.DEBUG=false; break;
		case SEMANTIC_CHECKER: AbstractSemanticChecker.DEBUG=false; break;
		}
	}

	/**
	 * �������ж���ִ�������͵ĵ���
	 */
	public static void enableAllBasicActorDebug() {
		AbstractSourceParser.DEBUG=true;
		AbstractGenerator.DEBUG=true;
		AbstractSemanticChecker.DEBUG=true;
	}
	
	/**
	 * �ر����ж���ִ�������͵ĵ���
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
	 * DNA SQL ��ʵ�嶨�����ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int ENTITY_DEFINE=0x00;
	
	/**
	 * DNA SQL �Ĵ洢�������ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int TABLE_DEFINE=0x01;
	
	/**
	 * DNA SQL �Ĳ�ѯ�������ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int QUERY_DEFINE=0x02;
	
	/**
	 * DNA SQL ��ʵ���ϵӳ�䶨�����ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int ORM_DEFINE=0x03;
	
	/**
	 * DNA SQL �����ݸ��¶������ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int UPDATE_DEFINE=0x04;
	
	/**
	 * DNA SQL �����ݲ��붨�����ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int INSERT_DEFINE=0x05;
	
	/**
	 * DNA SQL ������ɾ���������ͣ�Ҳ��Ϊ�������������������Ͳ���
	 */
	public final static int DELETE_DEFINE=0x06;

	/**
	 * DNA SQL �Ĳ�ѯ��䣬���׼SQL�Ĳ�ѯ���Ľṹ����һ��
	 */
	public final static int QUERY_STATEMENT=0x1010;
	
	/**
	 * DNA SQL ���Ӳ�ѯ��䣬���׼SQL���Ӳ�ѯ�Ľṹ����һ��
	 */
	public final static int SUBQUERY_STATEMENT=0x1011;
	
	/**
	 * DNA SQL ���������ʽ���������ʽ����Ϊֵ����VALUE_EXPRESSION�ϸ�����
	 */
	public final static int CONDITION_EXPRESSION=0x1020;
	
	/**
	 * DNA SQL ��ֵ���ʽ��ֵ���ʽ����Ϊ��������CONDITION_EXPRESSION�ϸ�����
	 */
	public final static int VALUE_EXPRESSION=0x1028;
	
	
	/**
	 * DNA SQL������ͱ�ʶ��������ֵ
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
	 * �����Ѷ���������͵Ľű�������
	 * @param kind �������
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @return �ű�������
	 */
	public ISourceParser createSourceParser(int kind) {
		if(s_SourceParserFactory==null) 
			throw new UnsupportedOperationException("cannot found source parser factory");
		return s_SourceParserFactory.createDefinedSourceParser(kind);
	}

	/**
	 * �����Զ���������͵Ľű�������
	 * @param statementName �������
	 * @return �ű�������
	 */
	public ISourceParser createCustomSourceParser(String statementName) throws SecurityException, NoSuchMethodException {
		if(s_SourceParserFactory==null) 
			throw new UnsupportedOperationException("cannot found source parser factory");
		return s_SourceParserFactory.createCustomSourceParser(statementName);
	}


	/**
	 * ����ָ�����͵�Ŀ�����������
	 * @param kind SQL�������
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
	 * ����ָ�����͵���������
	 * @param kind SQL�������
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
	 * ����ָ�����͵ĳ����﷨��������ִ���������õ���������ȵı����㷨��
	 * @param kind SQL�������
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @param policy ����˳��Ĳ���
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
	 * ����ָ�����͵ĳ����﷨��������ִ���������õ���������ȵı����㷨��
	 * @param kind SQL�������
	 * @see DnaSql#QUERY_STATEMENT
	 * @see DnaSql#SUBQUERY_STATEMENT
	 * @see DnaSql#CONDITION_EXPRESSION
	 * @see DnaSql#VALUE_EXPRESSION
	 * @see DnaSql#QUERY_DEFINE
	 * @see DnaSql#ORM_DEFINE
	 * @param walker �����﷨���ķ�������������Processor��Ϊ����񡣸ò�������Ϊnull
	 * @param controler �ڵ���ʵĿ�����������Ϊnull
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
	 * ����ָ��Դ���λ�ù����������ڴ�����ת��λ��
	 * @param content the source code to manager
	 * @return position manager
	 */
	public IPositionManager createPositionManager(String id, String content) {
		return new PositionManager(id, content);
	}

	/**
	 * ����ָ�����͵�������
	 * @param kind SQL�������
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
