/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.parser.internal.antlr;

import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarningPosition;
import org.eclipse.jt.script.assist.frontend.ISourceParseWarnings;
import org.eclipse.jt.sql.assist.parser.antlr.ParseWarningKinds;
import org.eclipse.jt.sql.assist.parser.internal.antlr.parsers.DnaSqlQueryParser;



/**
 * @author Jeff Tang
 *
 */
public class AntlrErrorReporter implements ParseWarningKinds {
	
	public static final String[] EMPTY_CONTENTS=new String[] {};
	
	private ISourceParseWarnings fWarnings;
	private AntlrPositionConvertor fConvertor;
	
	public AntlrErrorReporter(AntlrPositionConvertor convertor, ISourceParseWarnings warnings) {
		this.fConvertor=convertor;
		this.fWarnings=warnings;
	}
	
	public void reportMsg(ISourcePosition pos, String msg) {
		if(fWarnings!=null) {
			if(pos!=null) msg=fConvertor.toString(pos)+msg;
			fWarnings.info(msg);
		}
	}
	
	public void reportWarn(int kind, String[] contents ,ISourcePosition pos, String msg) {
		if(fWarnings!=null) {
			fWarnings.warn(kind, contents, this.fConvertor.getWarningPosition(pos), msg);
		}
	}
	
	public void reportError(int kind, String[] contents ,ISourcePosition pos, String msg) {
		if(fWarnings!=null) {
			fWarnings.error(kind, contents,this.fConvertor.getWarningPosition(pos), msg);
		}
	}
	
	public void reportError(RecognitionException exc) {
		if(fWarnings==null) return;
		int kind=ParseWarningKinds.KIND_UNKNOWN;
		String[] contents=null;
		IWarningPosition pos= this.fConvertor.getWarningPosition(this.fConvertor.getPosition(exc.line-1, exc.charPositionInLine));
		String message=exc.toString();
		try {
			if(exc instanceof NoViableAltException) {
				kind=KIND_NO_VIABLE_ALT;
				message="Unexpected token:"+exc.token.getText();
				contents=new String[] { exc.getMessage(), exc.token.getText(),};
			} else if(exc instanceof MissingTokenException) {
				kind=KIND_MISSING_TOKEN;
				MissingTokenException mtexc=(MissingTokenException)exc;
				message="Token of type "+getTokenName(mtexc.getMissingType())+" expected";
				contents=new String[] { exc.getMessage(), exc.token.getText(),};
			} else if(exc instanceof UnwantedTokenException) {
				kind=KIND_UNWANTED_TOKEN;
				message="Unexpected token:"+exc.token.getText();
				contents=new String[] { exc.getMessage(), exc.token.getText(),};
			} else if(exc instanceof MismatchedTokenException) {
				kind=KIND_MISMATCHED_TOKEN;
				message="Unexpected token:"+exc.token.getText();
				contents=new String[] { exc.getMessage(), exc.token.getText(), };
			} else if(exc instanceof EarlyExitException) {
				kind=KIND_EARLY_EXIT;
				//EarlyExitException eeexc=(EarlyExitException)exc;
				//eeexc.
				message="Unexpected token:"+exc.token.getText();
				contents=new String[] { exc.getMessage(),};
			} else if(exc instanceof FailedPredicateException) {
				kind=KIND_FAILED_PREDICATE;
				contents=new String[] { exc.getMessage(),};
			} else if(exc instanceof MismatchedRangeException) {
				kind=KIND_MISMATCHED_RANGE;
				contents=new String[] { exc.getMessage(),};
			} else if(exc instanceof MismatchedNotSetException) {
				kind=KIND_MISMATCHED_NOT_SET;
				contents=new String[] { exc.getMessage(),};
			} else if(exc instanceof MismatchedSetException) {
				kind=KIND_MISMATCHED_SET;
				contents=new String[] { exc.getMessage(),};
			} else if(exc instanceof MismatchedTreeNodeException) {
				kind=KIND_MISMATCHED_TREE_NODE;
				contents=new String[] { exc.getMessage(),};
			} else {
				contents=new String[] { exc.getMessage(),};
			}
		} catch (Throwable e) {
			fWarnings.report(e, this);
		}
		if(contents==null) contents=EMPTY_CONTENTS;
		fWarnings.error(kind, contents, pos, message);
	}
	
	protected String getTokenName(int type) {
		if(type>=0&&type<DnaSqlQueryParser.tokenNames.length) {
			return DnaSqlQueryParser.tokenNames[type];
		}
		if(type==-1) {
			return "EOF";
		}
		throw new UnsupportedOperationException("bad token type: "+type);
	}
	
	public void reportThrowable(Throwable t) {
		//t.printStackTrace();
		if(fWarnings!=null)
			fWarnings.report(t, this);
	}
}
