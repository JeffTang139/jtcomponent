package org.eclipse.jt.sql.assist.core.extension.internal.structure;

import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.extension.IStructuredAstNode;
import org.eclipse.jt.script.assist.extension.IStructuredAstNodeProvider;
import org.eclipse.jt.sql.assist.core.ast.orm.IMappingAccessor;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingDeclaration;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingOverride;
import org.eclipse.jt.sql.assist.core.ast.orm.MappingStatement;
import org.eclipse.jt.sql.assist.core.data.AbstractMappingDataScope;


public class MappingConstructionAccessor<TSNode extends IStructuredAstNode<TSNode>, TScope extends AbstractMappingDataScope<TScope>>
			extends QueryConstructionAccessor<TSNode, TScope>
			implements IMappingAccessor<TScope> {

	public  MappingConstructionAccessor(ConstructionData<TSNode> data, IStructuredAstNodeProvider<TSNode, TScope> provider) {
		super(data,provider);
	}
	
	public  MappingConstructionAccessor(BaseConstructionAccessor<TSNode, TScope> baseWalker) {
		super(baseWalker);
	}
	
	public boolean enterMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return this.getBaseConstructionWalker().dealNode(ast, scope, null, ast.getName()!=null?ast.getName().getPosition():null);
	}
	
	public boolean enterMappingStatement(MappingStatement ast, TScope scope) {

		if(dealRoot(ast,scope,null,null)) { // 创建根节点的情况
			return false;
		} else if(dealParent(ast)) {			// 获取子节点时，访问到父节点的情况
			return false;
		} else {								// 获取子节点时，访问到子节点的情况
			ISourcePosition entityPosition=null;
			if(ast.getClassReference()!=null) {
				entityPosition=ast.getClassReference().getPosition();
			}
			TSNode node=this.getBaseConstructionWalker().createChildNode(ast, scope,null,entityPosition);
//			if(node instanceof AbstractStaticStructuredAstNode) {
//				((AbstractStaticStructuredAstNode<?>)node).setBodyPosition(entityPosition);
//			}
			addChild(node);
			return false;
		}
	}

	public boolean enterMappingOverride(MappingOverride ast, TScope scope) {
		return super.internalEnterGeneral(ast, scope);
	}

	public boolean exitMappingDeclaration(MappingDeclaration ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitMappingOverride(MappingOverride ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}

	public boolean exitMappingStatement(MappingStatement ast, TScope scope) {
		return super.internalExitGeneral(ast, scope);
	}
}