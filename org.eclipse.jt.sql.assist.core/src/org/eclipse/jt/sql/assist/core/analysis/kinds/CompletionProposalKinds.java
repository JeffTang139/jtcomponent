/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.analysis.kinds;

/**
 * @author Jeff Tang
 *
 */
public interface CompletionProposalKinds {
	public final static int KIND_KEYWORD=2;
	public final static int KIND_DATA_TYPE=7;
	public final static int KIND_ARGUMENT_REFERENCE=3;
	public final static int KIND_FUNCTION=5;
	public final static int KIND_TABLE_DEFINE=16;
	public final static int KIND_TABLE_REFERENCE=17;
	public final static int KIND_COLUMN_REFERENCE=18;
	public final static int KIND_PACKAGE_REFERENCE=11;
	public final static int KIND_ENTITY_REFERENCE=10;
	public final static int KIND_ENTITY_FIELD_REFERENCE=1;
	public final static int KIND_ORM_REFERENCE=19;
	
	public final static int KIND_ANY=0xFFFF;
}
