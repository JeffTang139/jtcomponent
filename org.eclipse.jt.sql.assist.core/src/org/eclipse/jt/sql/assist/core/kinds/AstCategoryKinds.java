/**
 * 
 */
package org.eclipse.jt.sql.assist.core.kinds;

/**
 * @author Jeff Tang
 *
 */
public final class AstCategoryKinds {
	private AstCategoryKinds() {}
	public static final long UNDEFINED = 					0x0000000000000000l;
	public static final long TOKEN = 						0x0000000000000008l;
	public static final long STATEMENT = 					0x0000000000008000l;
	public static final long DECLARATION = 					0x0000000008000000l;
	public static final long REFERENCE = 					0x0000000800000000l;
	public static final long EXPRESSION = 					0x0000008000000000l;
	public static final long FUNCTION_PARAMETER = 			0x0000080000000000l;
	public static final long STRUCTURED = 					0xF000000000000000l;
	
	public static final long CONDITION_EXPRESSION = 		0x000000C000000000l;
	private static final long CONDITION_EXPRESSION_MARK = 	0x0000004000000000l;
	
	public static final long VALUE_EXPRESSION = 			0x000008A000000000l;
	private static final long VALUE_EXPRESSION_MARK = 		0x0000002000000000l;
	
	private static final long DEFINED = TOKEN | STATEMENT | DECLARATION | REFERENCE | EXPRESSION | STRUCTURED;
	
	public static boolean isDefined(long catkinds) {
		return (catkinds&DEFINED)>0;
	}
	
	public static boolean isToken(long catkinds) {
		return (catkinds&TOKEN)>0;
	}
	
	public static boolean isStatement(long catkinds) {
		return (catkinds&STATEMENT)>0;
	}
	
	public static boolean isDeclaration(long catkinds) {
		return (catkinds&DECLARATION)>0;
	}
	
	public static boolean isReference(long catkinds) {
		return (catkinds&REFERENCE)>0;
	}
	
	public static boolean isExpression(long catkinds) {
		return (catkinds&EXPRESSION)>0;
	}
	
	public static boolean isFunctionParameter(long catkinds) {
		return (catkinds&FUNCTION_PARAMETER)>0;
	}
	
	public static boolean isStructured(long catkinds) {
		return (catkinds&STRUCTURED)>0;
	}
	
	public static boolean isValueExpression(long catkinds) {
		return (catkinds&VALUE_EXPRESSION_MARK)>0 
			&& (catkinds&FUNCTION_PARAMETER)>0 
			&& (catkinds&EXPRESSION)>0 ;
	}
	
	public static boolean isConditionExpression(long catkinds) {
		return (catkinds&CONDITION_EXPRESSION_MARK)>0 
			&& (catkinds&EXPRESSION)>0 ;
	}
}
