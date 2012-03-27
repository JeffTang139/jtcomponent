/**
 * 
 */
package org.eclipse.jt.sql.assist.core.util;

import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.visit.IVisitDriver;
import org.eclipse.jt.sql.assist.core.DnaSql;
import org.eclipse.jt.sql.assist.core.visit.walk.CollectChildrenBaseWalker;


/**
 * @author Jeff Tang
 *
 */
public class AstChildrenProvider  {
	public static IAstNode[] EMPTY_CHILEREN = new IAstNode[] {};
	
	private CollectChildrenBaseWalker fWalker;
	private IVisitDriver<?> fProcessor;
	
	public AstChildrenProvider(int sqlKind, int policy) {
		fProcessor = DnaSql.getDefault().createVisitDriver(sqlKind, policy);
		fWalker = new CollectChildrenBaseWalker();
		fProcessor.initialize(fWalker);
	}

	public synchronized IAstNode[] getChildren(IAstNode ast) {
		if(ast==null) return EMPTY_CHILEREN;
		fWalker.setParent(ast);
		try {
			fProcessor.process(ast);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return fWalker.getChildren();
	}
}
