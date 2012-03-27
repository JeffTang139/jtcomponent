grammar DnaSqlQuery;

options {
	language = Java;
	k=*;
}
 
tokens {
  CONCATENATION_OP; 
  APPROXIMATE_NUM_LIT;
  DOUBLE_QUOTE;
  MINUS_SIGN;
  DOUBLE_PERIOD;
  PERIOD;
  UNDERSCORE;
  QUOTE;
  NOT_EQUALS_OP;
  LESS_THAN_OR_EQUALS_OP;
  GREATER_THAN_OR_EQUALS_OP;
}

@header {
package org.eclipse.jt.sql.assist.parser.internal.antlr.parsers;


import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.*;
import org.eclipse.jt.sql.assist.core.ast.general.*;
import org.eclipse.jt.sql.assist.core.ast.query.*;
import org.eclipse.jt.sql.assist.core.ast.orm.*;
import org.eclipse.jt.sql.assist.core.ast.command.*;
import org.eclipse.jt.sql.assist.core.ast.table.*;
import org.eclipse.jt.sql.assist.core.kinds.LiteralKinds;
import org.eclipse.jt.sql.assist.parser.antlr.ParseWarningKinds;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrErrorReporter;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrPositionConvertor;

}

@lexer::header {
package org.eclipse.jt.sql.assist.parser.internal.antlr.parsers;

import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrErrorReporter;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrPositionConvertor;
}
 
@lexer::members {
  private AntlrErrorReporter reporter;
  public void setReporter(AntlrErrorReporter reporter) {
    this.reporter=reporter;
  }
	public void emitErrorMessage(String msg) {
    if( reporter != null ) {
      reporter.reportMsg(null,msg);
    }
	} 
}

@members {
  public static boolean unserved_as_id=true;
	private AntlrPositionConvertor posCvtr;
	private AntlrErrorReporter reporter;
	public void setPositionConvertor(AntlrPositionConvertor posCvtr) {
	  this.posCvtr=posCvtr;
	}
  public void setReporter(AntlrErrorReporter reporter) {
    this.reporter=reporter;
  }
	private ISourcePosition getPos(IAstNode node) {
	  if(node==null) return posCvtr.getEmptySourcePosition();
	  return node.getPosition();
	}
	private ISourcePosition getPos(Token token) {
	  return posCvtr.getPosition(token);
	}
	private ISourcePosition getPos(Token first, Token last) {
	  return getPos(first).union(getPos(last));
	} 
  private ISourcePosition getEmptyPos(int start) {
	  return posCvtr.getOffsetPosition(start,start+1);
  } 
	private ISourcePosition unionPos(ISourcePosition first,ISourcePosition second) {
	  return first!=null? first.union(second): second;
	}
  public void emitErrorMessage(String msg) {
    if( reporter != null ) {
      reporter.reportMsg(null,msg);
    }
  }
  public void reportError(RecognitionException e) {
    if( reporter != null ) {
      reporter.reportError(e); 
    }
  }
  public void reportError(int kind, String message, ISourcePosition pos) {
    if( reporter != null ) {
      reporter.reportError(kind,null,pos,message); 
    }
  }
  private List<IAstNode> getNodeList(IAstNode a) {
    List<IAstNode> list=new ArrayList<IAstNode>();
    list.add(a);
    return list;
  }
  private List<IAstNode> getNodeList(IAstNode a, IAstNode b) {
    List<IAstNode> list=new ArrayList<IAstNode>();
    list.add(a); list.add(b);
    return list;
  }
  private String getText(Token tok) {
    return tok!=null?tok.getText():null;
  }
  private String transferString(String str) {
    return str!=null?str.substring(1,str.length()-1).replace("\'\'","\'"):str;
  }
  private String transferID(String str) {
    return str!=null?str.substring(1,str.length()-1).replace("\"\"","\""):str;
  }
  
  private TokenNode getTokenNode(Token tok) {
    return new TokenNode(getText(tok),getPos(tok));
  }
  private TokenNode getTokenNode(String text, ISourcePosition pos) {
    return new TokenNode(text,pos);
  }
}
 
@rulecatch {
catch (RecognitionException re) {
    if( reporter != null ) {
      reporter.reportError(re);
    }
  recover(input,re);
}
catch (Throwable extre) {
    if( reporter != null ) {
      reporter.reportThrowable(extre);
    }
}
}

argument_declaration returns[ArgumentDeclaration ardec=null]
  : n=ARGUMENT_ID t=data_type
  { $ardec= new ArgumentDeclaration(getPos($n),$t.atype,getTokenNode($n),getPos($n));
    String name=getText($n);
    if(name==null||name.length()<=1)
       reportError(ParseWarningKinds.KIND_EMPTY_ARGUMENT_NAME,"empty argument name",getPos($n)); }
    (argument_modifier[ardec])?
  ;

data_type returns[DataTypeReference atype = null]
  :( (ENUM)=> (t=ENUM) l=LESS_THAN_OP  c = class_reference g=GREATER_THAN_OP
  | t=BOOLEAN 
  | t=BYTES  
  | t=BYTE  
  | t=DATE  
  | t=DOUBLE 
  | t=FLOAT  
  | t=GUID   
  | t=INT    
  | t=LONG     
  | t=SHORT  
  | t=STRING
  | t=REGULAR_ID )
   { $atype=new DataTypeReference(getPos($t),$t.text); 
    String name=$t.text;
    if(name!=null&&!name.equals(name.toLowerCase()))
       reportError(ParseWarningKinds.KIND_BAD_ARGUMENT_TYPE,"argument type name must be in lower case",getPos($t));}
;

class_reference returns[ClassReference cr = null] 
  :
    i=id
    { $cr = new ClassReference(null);
      $cr.add(getTokenNode($i.word));
    }
    (   { e=null; }
      p=PERIOD (e=id)? 
        { 
           if(e!=null)
              $cr.add(getTokenNode($e.word));
           else {
              ISourcePosition pointPos=getPos($p);
              reportError(ParseWarningKinds.KIND_MISS_CLASS_NAME,"class name lost after "+getText($p),pointPos);
              $cr.updatePosition(pointPos);
              $cr.add(null); 
           }
        }
    )*
  ;

argument_modifier[ArgumentDeclaration arg]
  : default_value_spec[arg] (not_null_spec[arg])?
  | not_null_spec[arg] (default_value_spec[arg])?
  ;

default_value_spec[ArgumentDeclaration arg]
  : (DEFAULT)=>(d=DEFAULT) v=constant_exp { $arg.updatePosition(getPos(d)); $arg.setDefaultValue($v.exp); }
  ;
  
not_null_spec[ArgumentDeclaration arg]
  :  (NOT)=>(NOT) u=NULL  { $arg.setNotNull(true,getPos($u)); }
  ;
 
// region value begin

value_exp returns[ValueExpression exp=null]:    
  t=term { $exp=$t.exp;}
  ( 
      (term_op)=>(o=term_op) {t=null;} (t=term)?
       {
        $exp=new OperatorExpression(getPos(exp),exp);
        ((OperatorExpression)$exp).add(getText($o.op),getPos($o.op),$t.exp);
        if(t==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText($o.op),getPos($o.op));
       }
	   ( (term_op)=>(o=term_op) {t=null;} (t=term)?
	     {
	      ((OperatorExpression)$exp).add(getText($o.op),getPos($o.op),$t.exp);
        if(t==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText($o.op),getPos($o.op));
	     }
	   )*
  )? 
; 
 
term_op returns[Token op=null]
  : o=PLUS_SIGN   { $op=$o; }
  | o=MINUS_SIGN  { $op=$o; }
;
 
term returns[ValueExpression exp=null] :  
  f=factor { $exp=$f.exp;}
  (  (factor_op)=>(o=factor_op) {f=null;} (f=factor)?
     {
       $exp=new OperatorExpression(getPos(exp),exp);
       ((OperatorExpression)$exp).add(getText($o.op),getPos($o.op),$f.exp);
        if(f==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText($o.op),getPos($o.op));
     }
   ( (factor_op)=>(o=factor_op) {f=null;} (f=factor)?
     { 
       ((OperatorExpression)$exp).add(getText($o.op),getPos($o.op),$f.exp);
        if(f==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText($o.op),getPos($o.op));
     } 
   )*
  )?
;

factor_op returns[Token op=null]
  : o=ASTERISK    { $op=$o; }
  | o=SOLIDUS     { $op=$o; }
;

factor returns[ValueExpression exp=null]:  
   /* s=sign */ p=value_exp_primary 
   { $exp=$p.exp; /* if(s!=null) $exp.updatePosition(getPos($s.sign));*/ }
     
;
 
sign returns[Token op=null]
  : s=PLUS_SIGN   { $op=$s; }
  | s=MINUS_SIGN  { $op=$s; }
;

value_exp_primary returns[ValueExpression exp=null]
  : e=set_fct_spec    { $exp=$e.exp; }
  | c=case_exp        { $exp=$c.exp; }
  | h=hierarchy_fun_spec  { $exp=$h.exp; }
  | f=function_spec   { $exp=$f.exp; }
  | o=column_ref      { $exp=$o.exp; }
  | u=unsigned_value_spec { $exp=$u.exp; }
/*  | s=subquery { $exp = new ValueQueryExpression(null, $s.sub, null); }*/
  | (LEFT_PAREN)=> (l=LEFT_PAREN) v=value_exp r=RIGHT_PAREN  { $exp=new ParenValueExpression(getPos($l,$r),$v.exp); }
  ; 

set_fct_spec returns[ColumnCallExpression exp=null]:    
   f=COUNT LEFT_PAREN
       ( a=ASTERISK {$exp=new ColumnCallExpression(getPos($f),$f.text,getPos($a));} 
       | (q=set_quantifier)? e=value_exp { $exp=new ColumnCallExpression(getPos($f),$f.text, $q.dist,$e.exp,getPos($e.exp)); }
       ) r=RIGHT_PAREN { $exp.updatePosition(getPos($r)); } 
  | ( f=AVG
    | f=SUM ) LEFT_PAREN (q=set_quantifier)? e=value_exp r=RIGHT_PAREN  
    { $exp=new ColumnCallExpression(getPos($f),$f.text, q,$e.exp,getPos($r));  }
  | ( f=MAX 
    | f=MIN ) LEFT_PAREN  e=value_exp r=RIGHT_PAREN  
    { $exp=new ColumnCallExpression(getPos($f),$f.text, false,$e.exp,getPos($r));  }
;

set_quantifier returns[boolean dist=false]
  : DISTINCT { $dist=true; }
  | ALL  { $dist=false; }
;

hierarchy_fun_spec returns[HierarchyFunCallExpression exp=null]
  :  (H_LV)=> (f=H_LV) LEFT_PAREN
      t=table_ref_ref PERIOD h=id
      { $exp=new HierarchyFunCallExpression(getPos(f),$f.text,$t.ref,getText($h.word),getPos($h.word)); }
      r=RIGHT_PAREN { $exp.updatePosition(getPos(r)); }
  |  (H_AID)=>(f=H_AID)LEFT_PAREN
      t=table_ref_ref PERIOD h=id
      { $exp=new HierarchyFunCallExpression(getPos(f),$f.text,$t.ref,getText($h.word),getPos($h.word)); }
        ((o=REL|o=ABO) v=value_exp 
          { 
            if(v!=null) {
              v.setUpperOperator(getTokenNode($o));
              $exp.setPrimary($v.exp,null);
            } else {
              $exp.updatePosition(getPos($o));
            }
          }
        )?
      r=RIGHT_PAREN { $exp.updatePosition(getPos(r)); }
  ;

function_spec returns[FunctionCallExpression exp=null]
  : f=function_name { $exp=new FunctionCallExpression(getPos($f.name),getText($f.name)); }
   LEFT_PAREN
   (
        p=function_parameter { $exp.add($p.para); }
        (c=COMMA  {p=null;} (p=function_parameter)?
            { if(p!=null) {
                  $exp.add($p.para);
              } else {
                  $exp.add(null);
                  reportError(ParseWarningKinds.KIND_UGLY_PARAMETER_LIST,"unwanted comma here",getPos($c));
              }
            }
        )*
   )?  
   r=RIGHT_PAREN { $exp.updatePosition(getPos(r)); }
  ;
   
function_name returns[Token name=null]
  : t=id { $name = $t.word; }
  ;
  
function_parameter returns[IFunctionParameter para=null]
  : e=value_exp   { $para=$e.exp; }
  | t=table_ref_ref { $para=$t.ref; } 
  ;

case_exp returns[CaseExpression exp=null]    
  : c=case_abbreviation { $exp=$c.exp; }
  | c=case_spec  { $exp=$c.exp; }
;
  
case_abbreviation returns[CaseExpression exp=null]
  : (COALESCE)=>(c=COALESCE) { $exp=new CaseExpression(getPos($c),$c.text); } 
    LEFT_PAREN e=value_exp { $exp.add($e.exp); } (COMMA e=value_exp { $exp.add($e.exp); } )* 
    r=RIGHT_PAREN { $exp.updatePosition(getPos($r)); }
;

case_spec returns[CaseExpression exp=null]
  : (CASE)=>(c=CASE)
  ( (WHEN)=>() { $exp=new CaseExpression(getPos($c),CaseExpression.OPERATOR_CASE_SEARCH); }
    (WHEN ce=condition_exp { $exp.add($ce.ce); }  THEN e=result { $exp.add($e.exp); } )+ 
  |
    e=value_exp { $exp=new CaseExpression(getPos($c),CaseExpression.OPERATOR_CASE_NORMAL,$e.exp); }
    (WHEN e=value_exp { $exp.add($e.exp); }  THEN e=result { $exp.add($e.exp); } )+ 
  )
    (ELSE e=result { $exp.add($e.exp); } )?  
    d=END { $exp.updatePosition(getPos($d)); }
;

result returns[ValueExpression exp=null]:    
    e=row_value_constructor { $exp=$e.exp; }
;

unsigned_value_spec returns[ValueExpression exp=null]
  : e=constant_exp { $exp=$e.exp; }
  | a=argument_spec { $exp=$a.exp; }
  ;
  
constant_exp returns[ConstantExpression exp=null]
  :((TRUE)=>(t=TRUE))
    { $exp=new ConstantExpression(getPos($t),$t.text,LiteralKinds.KIND_BOOLEAN); }
  | ((FALSE)=>(t=FALSE))
    { $exp=new ConstantExpression(getPos($t),$t.text,LiteralKinds.KIND_BOOLEAN); }
  | (DATE)=>(t=DATE) c=CHAR_STRING   
    { $exp=new ConstantExpression(getPos($c),transferString($c.text),LiteralKinds.KIND_DATE);
      $exp.updatePosition(getPos($t));
    }
  | (GUID)=>(t=GUID) c=CHAR_STRING   
    { $exp=new ConstantExpression(getPos($c),transferString($c.text),LiteralKinds.KIND_GUID);
      $exp.updatePosition(getPos($t));
    }
  | (BYTES)=>(t=BYTES) c=CHAR_STRING 
    { $exp=new ConstantExpression(getPos($c),transferString($c.text),LiteralKinds.KIND_BYTES); 
      $exp.updatePosition(getPos($t));
    }
  | ((MINUS_SIGN)=>(s=MINUS_SIGN))?
    ( c=UNSIGNED_INTEGER      { $exp=new ConstantExpression(getPos($c),s==null?$c.text:s.getText()+$c.text,LiteralKinds.KIND_INTEGER); }
    | c=EXACT_NUM_LIT         { $exp=new ConstantExpression(getPos($c),s==null?$c.text:s.getText()+$c.text,LiteralKinds.KIND_FLOAT); }
    | c=APPROXIMATE_NUM_LIT   { $exp=new ConstantExpression(getPos($c),s==null?$c.text:s.getText()+$c.text,LiteralKinds.KIND_FLOAT); }
    )
  | c=CHAR_STRING           { $exp=new ConstantExpression(getPos($c),transferString($c.text),LiteralKinds.KIND_STRING); }
  ;

argument_spec returns[ArgumentReference exp=null]
  : a=ARGUMENT_ID
   { $exp=new ArgumentReference(getPos($a),$a.text);
    String name=$a.text;
    if(name==null||name.length()<=1)
       reportError(ParseWarningKinds.KIND_EMPTY_ARGUMENT_NAME,"empty argument name",getPos($a)); }
  ;
  
// region value end

// region condition begin

condition_exp returns[ConditionExpression ce=null]
  : pc=condition_term { $ce=$pc.ce; }
   (  (OR)=>(o=OR) {c=null;} (c=condition_term)?
      {
        $ce=new LogicalPredicate(getPos($ce),$ce);
        ((LogicalPredicate)$ce).add($o.text,getPos($o),$c.ce);
        if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText($o),getPos($o));
      }
    ( (OR)=>(o=OR) {c=null;} (c=condition_term)?
      {
        ((LogicalPredicate)$ce).add($o.text,getPos($o),$c.ce);
        if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText($o),getPos($o));
      }
    )*
   )?
     { /*if(pc==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary condition operand lost",getPos($pc.ce));*/ }
  ;
 
condition_term returns[ConditionExpression ce=null]
  : pc=condition_factor { $ce=$pc.ce; }
   (  (AND)=>(o=AND) {c=null;} (c=condition_factor)?
      {
        $ce=new LogicalPredicate(getPos($ce),$ce);
        ((LogicalPredicate)$ce).add($o.text,getPos($o),$c.ce);
        if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText($o),getPos($o));
      }
    ( (AND)=>(o=AND) {c=null;} (c=condition_factor)?
      {
        ((LogicalPredicate)$ce).add($o.text,getPos($o),$c.ce);
        if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText($o),getPos($o));
      }
    )*
   )?
     { /*if(pc==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary condition operand lost",getPos($pc.ce));*/ }
  ;
 
condition_factor returns[ConditionExpression ce=null]
  : ((NOT)=>n=NOT)? c=condition_primary 
    { $ce=$c.ce; if($n!=null) $ce.setNot(!$ce.isNot(),getPos($n)); }
  ;

condition_primary  returns[ConditionExpression ce=null]
options {backtrack=true;}
  : ((LEFT_PAREN)=>l=LEFT_PAREN c=condition_exp r=RIGHT_PAREN { $ce=new ParenConditionExpression(getPos($l,$r),$c.ce); })
  | e=exists_predicate { $ce=$e.ep; }
  | h=hierarchy_predicate { $ce=$h.hp; }
  | p=predicate { $ce=$p.rp; }
  ;
  
exists_predicate returns[ExistsPredicate ep=null]
  : (EXISTS)=>(e=EXISTS) 
    s=subquery
    { $ep = new ExistsPredicate(getTokenNode($e), $s.sub, null); }
  ;

predicate returns[RelationPredicate rp=null]:    
    (v=row_value_constructor)? { $rp=new RelationPredicate(getPos($v.exp),$v.exp); }
      ( ((comp_op)=>(comp_predicate[rp]))
      | (n=NOT)? ( between_predicate[rp] 
                 | in_predicate[rp] 
                 | like_predicate[rp]
                 | string_predicate[rp]
                 ) 
         { if($n!=null) $rp.setNot(true, getPos($n)); }
      | null_predicate[rp]
      ) 
     { if(v==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary value operand lost",getPos($rp)); }
;

comp_predicate[RelationPredicate rp] :    
  (comp_op)=>(op=comp_op) (s=subquery | v=row_value_constructor)?
  { 
    $rp.setOperator(getText($op.op),getPos($op.op));
    if(v!=null) $rp.setUncertainOperand($v.exp,getPos($v.exp));
    else if(s!=null) $rp.setUncertainOperand($s.sub,getPos($s.sub));
    else reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after compare operator",getPos($op.op));
  }
;
 
comp_op returns [Token op]:    
  ( o=EQUALS_OP 
  | o=NOT_EQUALS_OP
  | o=LESS_THAN_OP 
  | o=GREATER_THAN_OP 
  | o=LESS_THAN_OR_EQUALS_OP
  | o=GREATER_THAN_OR_EQUALS_OP
  ) { $op=$o; }
;

between_predicate [RelationPredicate rp]:    
  (BETWEEN)=>(op=BETWEEN) r=row_value_constructor AND v=row_value_constructor 
  { $rp.setOperator($op.text,null); $rp.setUncertainOperand(getNodeList($r.exp,$v.exp),getPos($v.exp));  }
;

in_predicate [RelationPredicate rp]:    
  (IN)=>(op=IN) {$rp.setOperator($op.text,null);} in_predicate_value[rp] 
;

in_predicate_value[RelationPredicate rp] :    
   q=subquery { $rp.setUncertainOperand($q.sub,getPos($q.sub)); }
  | LEFT_PAREN l=in_value_list r=RIGHT_PAREN { $rp.setUncertainOperand($l.list,getPos($r));  }
;
 
in_value_list returns[List<IAstNode> list=null] :    
  e=value_exp { $list=getNodeList($e.exp); } (COMMA e=value_exp { $list.add($e.exp); })* 
;
 
like_predicate[RelationPredicate rp] :  
  (LIKE)=>(op=LIKE) pa=pattern (ESCAPE es=escape_char)? 
  { $rp.setOperator($op.text,null);
    if($es.exp!=null) $rp.setUncertainOperand(getNodeList($pa.exp,$es.exp),getPos($es.exp));
    else $rp.setUncertainOperand($pa.exp,getPos($pa.exp)); }
;
string_predicate[RelationPredicate rp]
  : (op=STARTS_WITH|op=ENDS_WITH|op=CONTAINS)  pa=pattern
    { $rp.setOperator($op.text,null); $rp.setUncertainOperand($pa.exp,getPos($pa.exp)); }
  ;
 
pattern  returns [ValueExpression exp=null]:    
  c=value_exp  { $exp=$c.exp; } 
;
 
escape_char returns [ValueExpression exp=null]:    
  c=value_exp  { $exp=$c.exp; } 
;

null_predicate[RelationPredicate rp] :    
  (IS)=>(i=IS) (t=NOT)? n=NULL 
  { $rp.setOperator($i.text,null); ISourcePosition np=getPos($n); $rp.setUncertainOperand(new NullExpression(np),np);
    if($t!=null) $rp.setNot(!$rp.isNot(),null); }
;

row_value_constructor returns[ValueExpression exp=null]:    
    e=value_exp { $exp=$e.exp; }
  | n=NULL    { $exp=new NullExpression(getPos($n));}
;



// region condition end
  
id returns[Token word=null]
  : i=REGULAR_ID    { $word=$i; }
  | i=DELIMITED_ID  { $word=$i; $word.setText(transferID($word.getText())); }
  | {unserved_as_id}? k=non_reserved_word  { $word=$k.word; }
;

eof
  : EOF
  ;

// query specs

query_declare  returns[QueryDeclaration query=null]
  : (DEFINE QUERY)=>(d=DEFINE q=QUERY) n=id { $query=new QueryDeclaration(getPos($d,$q),getTokenNode(getText($n.word),getPos($n.word)));}
    argument_list[query] 
    BEGIN 
      (w=with_statement { $query.setWith($w.with); })?
      query_statement[query]
    (e=END)? 
    { if(e!=null) $query.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($query).getEnd())); 
    }
  ;
   
argument_list[IArgumentContainer argCtnr]
  : l=LEFT_PAREN 
    ( fad=argument_declaration
        { if(fad!=null) $argCtnr.addArgument($fad.ardec);
          else {
            $argCtnr.addArgument(null);
            reportError(ParseWarningKinds.KIND_MISS_ARGUMENT_DECLARATION,"argument declaration lost after "+getText($l),getPos($l));
          }
        }
     (c=COMMA { ad=null; } (ad=argument_declaration)? 
        { if(ad!=null) $argCtnr.addArgument($ad.ardec);
          else {
            $argCtnr.addArgument(null);
            reportError(ParseWarningKinds.KIND_MISS_ARGUMENT_DECLARATION,"argument declaration lost after "+getText($c),getPos($c));
          }
          
        }
     )*
    )?
    RIGHT_PAREN
  ;

query_statement[QueryStatementBase query]
  :
    query_body[query]
    ( u=union_statement { $query.addUnion($u.us); } )*
  ;

query_body[QueryStatementBase query]
  :
    s=select_statement   {$query.setSelect($s.select);}
    f=from_statement     {$query.setFrom($f.from);}
    (w=where_statement   {$query.setWhere($w.where);}    )?
    ( g=group_statement   {$query.setGroup($g.group);}    
     (h=having_statement  {$query.setHaving($h.having);} )?
    )?
    (o=order_statement   {$query.setOrder($o.order);}    )?
  ;

subquery returns[SubQueryStatement sub=null]
  : (LEFT_PAREN SELECT) => ( l=LEFT_PAREN )
    { $sub=new SubQueryStatement(getPos($l)); }
    query_statement[sub]
    r=RIGHT_PAREN
    { $sub.updatePosition(getPos($r)); }
  ;
  
union_statement returns[UnionStatement us = null]
  : (UNION)=>(u=UNION) { $us = new UnionStatement(getTokenNode($u),null);}
    (a=ALL { $us.setAll(getTokenNode($a)); } )?
    query_body[us]
  ;

column_ref returns[ColumnReference exp=null]:    
  r=table_ref_ref p=PERIOD (i=id)?
  { if(i!=null) {
      exp=new ColumnReference(getPos($r.ref),$r.ref,null,null);
      exp.setColumnName(getText($i.word),getPos($i.word));
    } else {
      exp=new ColumnReference(getPos($r.ref),$r.ref,null,getPos($p));
      reportError(ParseWarningKinds.KIND_MISS_COLUMN_NAME,"Unwanted point here",getPos($p));
    }
  }
;  

table_ref_ref returns[TableRefReference ref=null]
  : t=table_name { $ref=new TableRefReference(getPos($t.name),getText($t.name)); } 
  ;
  
with_statement returns[WithStatement with=null]
  : (WITH)=>(w=WITH) { $with = new WithStatement(getTokenNode($w),null); }
    (fq= subquery alias_spec[fq])?
    { if(fq!=null) {
        $with.addSubquery($fq.sub);
      } else {
        $with.addSubquery(null);
        reportError(ParseWarningKinds.KIND_MISS_SUBQUERY,"subquery lost after "+getText($w),getPos($w));
      }
    }
    (c=COMMA {q=null;} (q=subquery alias_spec[q])?
    { if(q!=null) {
        $with.addSubquery($q.sub);
      } else {
        $with.addSubquery(null);
        reportError(ParseWarningKinds.KIND_MISS_SUBQUERY,"subquery lost after "+getText($c),getPos($c));
      }
    }
    )*
  ;
  
select_statement returns[SelectStatement select=null]
  : (SELECT)=>(s=SELECT) { $select=new SelectStatement(getPos($s)); }
    ( d=set_quantifier { $select.setDistinct($d.dist); } )?
    (pc=derived_column { $select.add($pc.column); }
       (c=COMMA { sc=null; } (sc=derived_column)?
		     { if(sc!=null) {
              $select.add($sc.column); 
		       } else {
              $select.add(null); 
              $select.updatePosition(getPos($c)); 
              reportError(ParseWarningKinds.KIND_MISS_COLUMN,"Unwanted comma here",getPos($c));
		       }
		     }
        )*
    )?
   {
      if(pc==null) {
            reportError(ParseWarningKinds.KIND_MISS_COLUMN,"Column(s) required after select",getPos($s));
      }
   }
  ;

derived_column returns[DerivedColumn column=null]
  : e=value_exp 
   { $column=new DerivedColumn(getPos($e.exp),$e.exp); } 
   alias_spec[column]
  ;
  
from_statement returns[FromStatement from=null]
  : (FROM)=>(f=FROM) { $from=new FromStatement(getPos($f)); }
  (
   pt=table_ref_statement { $from.add($pt.trs); }
   (c=COMMA { t=null; } (t=table_ref_statement)?
      { if(t!=null) $from.add($t.trs);
        else {
          $from.add(null);
          $from.updatePosition(getPos($c));
          reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"Unwanted comma here",getPos($c));
        }
      } 
   )*
   )?
   {
      if(pt==null) {
            reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"Table reference(s) required after from",getPos($f));
      }
   }
  ;
 
table_ref_statement returns[TableReferenceStatement trs=null]
  : (table_ref_aux)=> (t=table_ref_aux { $trs=$t.tr;  })
    ( j=table_join[trs] { if($j.trs!=null) $trs=$j.trs; }) *
  ; 

table_join [TableReferenceStatement trp] returns [TableJoinStatementBase trs=null]
  :
  ((table_join_type JOIN)=>(o=table_join_type j=JOIN) t=table_ref_statement s=table_join_spec 
      { $trs=new TableJoinStatement(getPos($trp),$trp,0,getPos($j),$t.trs,$s.ce,getPos($s.ce));
        $trs.setJoinType(TableJoinStatementBase.getJoinType(getText($o.type)),getPos($o.type)); }
  | (table_join_type RELATE)=>(o=table_join_type j=RELATE) r=table_relation 
      { $trs=new TableRelationStatement(getPos($trp),$trp,0,getPos($j),$r.tr,getPos($r.tr));
        $trs.setJoinType(TableJoinStatementBase.getJoinType(getText($o.type)),getPos($o.type)); }
  )
  ;  
 
table_relation returns[TableRelation tr=null]
  : t=table_ref_ref n=relation_spec
   { $tr=new TableRelation(getPos($t.ref), $t.ref, getTokenNode($n.rel),false, getPos($n.rel));
   }
   table_ref_alias_spec[tr]
   table_modifier[tr]
  ;

relation_spec returns[Token rel=null]
  : PERIOD n=id { $rel=$n.word; }
  ;

table_join_type returns[Token type=null]
  :
  ( t=LEFT   { $type= $t; }
  | t=RIGHT  { $type= $t; }
  | t=FULL   { $type= $t; }
  )?
  ;
 
table_join_spec returns[ConditionExpression ce=null]
  : ON c=condition_exp { $ce=$c.ce; }
  ;

table_ref_aux returns[ResultSetReferenceBase tr=null]
  : (trs=table_ref_simple
    { $tr = $trs.tr; }
    |qrs=query_ref_simple
    { $tr = $qrs.sqr; }
    )
   table_modifier[tr]
  ;
  
table_ref_simple returns[TableReference tr=null]
  : n=table_name
   { 
     $tr=new TableReference(getPos($n.name),getTokenNode($n.name),false,null);
   }
   table_ref_alias_spec[tr]
  ;
  
table_ref_alias_spec[TableReference tr]
  : (as=AS (al=id)? )?
    {
     if(al!=null) {
         $tr.setAlias(getText($al.word),getPos($al.word));
     } else {
         reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required after "+ (as==null?tr.getTargetName():getText($as)),as==null?getPos($tr):getPos($as));
     }
    }
  ; 
  
query_ref_simple returns[SubQueryReference sqr]
  : sq=subquery
   { 
     $sqr=new SubQueryReference($sq.sub,false);
   }
   query_ref_alias_spec[sqr]
  ;
  
query_ref_alias_spec[SubQueryReference sqr]
  : (as=AS (al=id)? )?
    {
     if(al!=null) {
         $sqr.setAlias(getText($al.word),getPos($al.word));
     } else if(as!=null) {
         reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required after "+ getText($as), getPos($as));
     } else {
         int pos = $sqr.getSubquery().getPosition().getEnd();
         reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required", getEmptyPos(pos));
     }
    }
  ; 
 
alias_spec[IAliasHolder ah]
  : (as=AS (al=id)? )?
    {
       if(as!=null) {
           $ah.setAs(getTokenNode($as));
       }
	     if(al!=null) {
	         $ah.setAlias(getTokenNode($al.word));
	     } else if(as!=null||ah.getAliasTarget()!=null) {
	         reportError(ParseWarningKinds.KIND_ALIAS_REQUIRED,"alias required after "+ (as!=null?getText($as):$ah.getAliasTarget().getTexture()),as!=null?getPos($as):getPos($ah.getAliasTarget()));
	     } else {
	         reportError(ParseWarningKinds.KIND_ALIAS_REQUIRED,"alias required",getPos($ah));
	     }
    }
  ;

table_modifier[ResultSetReferenceBase tr]
  : FOR u=UPDATE { if($tr!=null) $tr.setForUpdate(true,getPos($u)); }
  |
  ;

table_name returns[Token name=null]
  : t=id { $name = $t.word; }
  ;
  
where_statement returns[WhereStatement where=null]
  : (WHERE)=>(w=WHERE) (c=condition_exp)?
   { $where=new WhereStatement(getPos($w),null);
     if(c!=null) {
        $where.setConditionExpression($c.ce);
     } else {
         reportError(ParseWarningKinds.KIND_MISS_CONDITION,"Condition expression required after where",getPos($w));
     }
   }
  ;
  
hierarchy_predicate returns[HierarchyPredicate hp=null]
  : t=table_ref_ref
  (  
     /*(d=DIRECT)?*/ (hierachy_direct_op)=>(op=hierachy_direct_op) r=table_ref_ref
     { $hp=new HierarchyPredicate(getPos($t.ref),$t.ref,getText($op.op),$r.ref,false,getPos($r.ref)); }
     hierachy_using[hp]
  |
     (hierachy_relative_op)=>(op=hierachy_relative_op) r=table_ref_ref
     { $hp=new HierarchyPredicate(getPos($t.ref),$t.ref,getText($op.op),$r.ref,false,getPos($r.ref)); }
     hierachy_using[hp]
     
     ( ((RELATIVE)=>(l=RELATIVE) v=value_exp )
     | ((RANGE)=>(l=RANGE) v=value_exp )
     )? 
       { 
        if(v!=null) {
           $hp.setLimit(getTokenNode($l),$v.exp);
        } else if(l!=null) {
           $hp.updatePosition(getPos($l));
        }
       }
  |  
     (IS LEAF)=>(i=IS l=LEAF)  
     { $hp=new HierarchyPredicate(getPos($t.ref),$t.ref,HierarchyPredicate.OPERATOR_IS_LEAF,null,false,getPos($h.word)); }
     USING h=id  
    { $hp.setHierarchys(new TokenNode[] { getTokenNode($h.word) }); }
  )
  ;
  
hierachy_using[HierarchyPredicate hp]
  : (USING LEFT_PAREN)=>(u=USING l=LEFT_PAREN)
    { $hp.setUsing(getTokenNode($u)); $hp.updatePosition(getPos($l)); }
    fh=id c=COMMA sh=id
    { $hp.setHierarchys(new TokenNode[] { getTokenNode($fh.word), getTokenNode($sh.word) });
      $hp.updatePosition(getPos($c));
    }
    r=RIGHT_PAREN
    { $hp.updatePosition(getPos($r)); }
  | (USING)=>(u=USING)
    { $hp.setUsing(getTokenNode($u)); }
    h=id
    { $hp.setHierarchys(new TokenNode[] { getTokenNode($h.word) }); }
  ;

hierachy_direct_op returns[Token op=null]
  : ( o=CHILDOF
    | o=PARENTOF) {$op=$o;}
  ;

hierachy_relative_op returns[Token op=null]
  : ( o=DESCENDANTOF
    | o=ANCESTOROF) {$op=$o;}
  ;

group_statement returns[GroupStatement group=null]
  : (GROUP BY)=>(g=GROUP b=BY) { $group=new GroupStatement(getPos($g)); $group.updatePosition(getPos($b));}
     pc=group_column { $group.add($pc.gc); }
    (COMMA { sc=null; } sc=group_column { $group.add($sc.gc); })*
    (group_property[group])?
  ; 
group_column returns[GroupColumn gc=null]
  : v=value_exp { gc=new GroupColumn(getPos($v.exp),$v.exp); }
  ;
  
group_property [GroupStatement group]
  : (WITH)=>(WITH) 
     (  p=ROLLUP { if(group!=null) group.setProperty(GroupStatement.PROPERTY_ROLLUP,getPos($p)); }
     |  p=CUBE   { if(group!=null) group.setProperty(GroupStatement.PROPERTY_CUBE,getPos($p)); }
     )
  ;
  
having_statement returns[HavingStatement having=null]
  : (HAVING)=>(h=HAVING) c=condition_exp 
   { $having=new HavingStatement(getPos($h),null);
     if(c!=null) {
        $having.setConditionExpression($c.ce);
     } else {
        reportError(ParseWarningKinds.KIND_MISS_CONDITION,"Condition expression required after having",getPos($h));
     }
   }
  ;
  
order_statement returns[OrderStatement order=null]
  : (ORDER BY)=>(o=ORDER BY) { $order=new OrderStatement(getPos($o)); }
    e=order_expression { $order.add($e.oe); }
    (COMMA { e=null; } e=order_expression  { $order.add($e.oe); } )*
  ; 

order_expression returns[OrderExpression oe=null]
  : v=value_exp { $oe=new OrderExpression(getPos($v.exp),$v.exp); } (ordering_spec[oe])?
  ;

ordering_spec[OrderExpression oe]
  : d=ASC  { if(oe!=null) $oe.setDescrease(false,getPos($d)); }
  | d=DESC { if(oe!=null) $oe.setDescrease(true,getPos($d)); }
  ;
  
// ORM
mapping_declare  returns[MappingDeclaration orm=null] 
  : (DEFINE ORM)=>(d=DEFINE q=ORM) n=id { $orm=new MappingDeclaration(getPos($d,$q),getTokenNode(getText($n.word),getPos($n.word)));}
    argument_list[orm]
    (
	    m=mapping_statement  {$orm.setMapping($m.map);}
	    
	    BEGIN
      (wis=with_statement { $orm.setWith($wis.with); })?
	    query_statement[orm]
	  |
	    mo=mapping_override   {$orm.setOverride($mo.mo);}
	    
      BEGIN
	    (w=where_statement   {$orm.setWhere($w.where);}    )?
	    (h=having_statement  {$orm.setHaving($h.having);}  )?
	    (o=order_statement   {$orm.setOrder($o.order);}    )?
    )
      (e=END)? 
      { if(e!=null) $orm.updatePosition(getPos($e));
        else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($orm).getEnd())); 
      }
  ;

mapping_statement returns[MappingStatement map=null]
  : (MAPPING)=>(m=MAPPING) { $map=new MappingStatement(getPos($m)); }
    (
	    i=id { $map.add(getText($i.word),getPos($i.word)); }
	    (   { e=null; }
	      p=PERIOD (e=id)? 
	        { 
	           if(e!=null)
	              $map.add(getText($e.word),getPos($e.word)); 
	           else {
	              ISourcePosition pointPos=getPos($p);
	              reportError(ParseWarningKinds.KIND_MISS_ENTITY_NAME,"entity name lost after "+getText($p),pointPos);
	              $map.updatePosition(pointPos);
	              $map.add(null,null); 
	           }
	        }
	    )*
    )?
    {
         if(i==null) {
            ISourcePosition pointPos=getPos($m);
            reportError(ParseWarningKinds.KIND_MISS_ENTITY_NAME,"entity name lost after "+getText($m),pointPos);
            $map.updatePosition(pointPos);
            $map.add(null,null); 
         }
    }
  ;
  
mapping_override returns[MappingOverride mo=null]
  : (OVERRIDE)=>(o=OVERRIDE) (s=id)? 
    { if(s!=null) {
        $mo = new MappingOverride(getTokenNode($o), getTokenNode($s.word));
      } else {
        $mo = new MappingOverride(getTokenNode($o), null);
        reportError(ParseWarningKinds.KIND_MISS_OVERRIDE_NAME,"super name lost after "+getText($o),getPos($o));
      }
    }
  ;
  
// commands

insert_statement returns[InsertStatement ins = null]
  : (INSERT INTO) => (it=INSERT io=INTO)
    { $ins = new InsertStatement(getTokenNode($it),getTokenNode($io)); }
    (tn=table_name)?
    { if(tn!=null) {
        $ins.setTableName(getTokenNode($tn.name));
      } else {
        reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"table name lost after "+getText($io),getPos($io));
      }
    }
    ( insert_columns[ins] insert_values[ins]
    | sq=subquery { $ins.setSubquery($sq.sub); }
    )
  ;
  
insert_columns[InsertStatement ins]
  : (LEFT_PAREN) => (l=LEFT_PAREN)  { $ins.updatePosition(getPos($l)); }
    (fi=id)?
      { if(fi!=null) $ins.addColumn(getTokenNode($fi.word));
        else {
          $ins.addColumn(null);
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"column lost after "+getText($l),getPos($l));
        }
      }
    (c=COMMA { i=null; }  (i=id)?
      { if(i!=null) $ins.addColumn(getTokenNode($i.word));
        else {
          $ins.addColumn(getTokenNode($i.word));
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"column lost after "+getText($c),getPos($c));
        }
      }
    )*
    r=RIGHT_PAREN { $ins.updatePosition(getPos($r)); }
  ;
  
insert_values[InsertStatement ins]
  : (VALUES) => (v = VALUES) { $ins.updatePosition(getPos($v)); }
     l=LEFT_PAREN
    (fv=value_exp)?
      { if(fv!=null) $ins.addValueExpresiion($fv.exp);
        else {
          $ins.addValueExpresiion(null);
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"value expression lost after "+getText($l),getPos($l));
        }
      }
    (c=COMMA {ve=null;} (ve=value_exp)?
      { if(ve!=null) $ins.addValueExpresiion($ve.exp);
        else {
          $ins.addValueExpresiion(null);
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"value expression lost after "+getText($c),getPos($c));
        }
      }
    )*
    r=RIGHT_PAREN { $ins.updatePosition(getPos($r)); }
  ;
  
update_statement returns[UpdateStatement us=null]
  : (UPDATE)=>(u=UPDATE) 
    { $us = new UpdateStatement(getTokenNode($u), null); }
    t=table_ref_statement { $us.setTable($t.trs); }
    set_statement[us]
    (w=where_statement { $us.setWhere($w.where); })?
  ;
  
set_statement[UpdateStatement us]
  : (SET)=>(s=SET) (fas=assign_statement)?
      { if(fas!=null) $us.addAssign($fas.ass);
        else {
          $us.addAssign(null);
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"Assign statement lost after "+getText($s),getPos($s));
        }
      }
    (c=COMMA {ass=null;} (ass=assign_statement)?
      { if(ass!=null) $us.addAssign($ass.ass);
        else {
          $us.addAssign(null);
          reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"assign statement lost after "+getText($c),getPos($c));
        }
      }
    )*
  ;

assign_statement returns[AssignStatement ass = null]
  : c=id a=EQUALS_OP (v=row_value_constructor)?
    { if(v!=null) {
        $ass = new AssignStatement(getPos($id.word), getTokenNode($id.word), $v.exp, getPos($v.exp));
      } else {
        $ass = new AssignStatement(getPos($id.word), getTokenNode($id.word), null, getPos($a));
        reportError(ParseWarningKinds.KIND_MISS_VALUE_EXPRESSION,"value expression lost after "+getText($a),getPos($a));
      }
    }
  ;

delete_statement returns[DeleteStatement des = null]
  : (DELETE FROM) => (d=DELETE f=FROM)
    { $des = new DeleteStatement(getTokenNode($d), getTokenNode($f), null); }
    t=table_ref_statement { $des.setTable($t.trs); }
    (w=where_statement { $des.setWhere($w.where); })?
  ; 
  
  

insert_declare  returns[InsertDeclaration insert=null]
  : (DEFINE INSERT)=>(d=DEFINE q=INSERT) n=id { $insert=new InsertDeclaration(getTokenNode($d),getTokenNode($n.word),getPos($n.word));}
    argument_list[insert] 
    BEGIN ins=insert_statement { $insert.setCommand($ins.ins); }
    (e=END)? 
    { if(e!=null) $insert.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($insert).getEnd())); 
    }
  ;
  
  
update_declare  returns[UpdateDeclaration update=null]
  : (DEFINE UPDATE)=>(d=DEFINE u=UPDATE) n=id { $update=new UpdateDeclaration(getTokenNode($d),getTokenNode($n.word),getPos($n.word));}
    argument_list[update] 
    BEGIN upd=update_statement { $update.setCommand($upd.us); }
    (e=END)? 
    { if(e!=null) $update.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($update).getEnd())); 
    }
  ;
  
delete_declare  returns[DeleteDeclaration delete=null]
  : (DEFINE DELETE)=>(d=DEFINE t=DELETE) n=id { $delete=new DeleteDeclaration(getTokenNode($d),getTokenNode($n.word),getPos($n.word));}
    argument_list[delete] 
    BEGIN del=delete_statement { $delete.setCommand($del.des); }
    (e=END)? 
    { if(e!=null) $delete.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($delete).getEnd())); 
    }
  ;
  
command_declare returns[CommandDeclarationBase<?> cmd=null]
  : i= insert_declare { $cmd=$i.insert; }
  | u= update_declare { $cmd=$u.update; }
  | d= delete_declare { $cmd=$d.delete; }
  ;
  
  
// TABLE

table_abs_declaration returns[AbstractTableDeclaration abstable = null]
  : (DEFINE ABSTABLE) => (d=DEFINE t=ABSTABLE) n=id { $abstable = new AbstractTableDeclaration(getTokenNode($d),getTokenNode($n.word),getPos($n.word)); }
    BEGIN tas=table_abs_statement { $abstable.setStatement($tas.ts); }
    
    (e=END)? 
    { if(e!=null) $abstable.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($abstable).getEnd())); 
    }
  ;
  
table_normal_declaration returns[NormalTableDeclaration table = null]
  : (DEFINE TABLE) => (d=DEFINE t=TABLE) n=id { $table = new NormalTableDeclaration(getTokenNode($d),getTokenNode($n.word),getPos($n.word)); }
    BEGIN tns=table_normal_statement { $table.setStatement($tns.ts); }
    
    (e=END)? 
    { if(e!=null) $table.updatePosition(getPos($e));
      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos($table).getEnd())); 
    }
  ;
  
table_abs_statement returns[AbstractTableDefineStatement ts = null]
  :
  ;
  
table_normal_statement returns[NormalTableDefineStatement ts = null]
  :
  ;
  
columns_statement returns[ColumnsStatement cs = null]
  :
  ;
  
column_declaration returns[ColumnDeclaration cd = null]
  :
  ;
  
column_relation_statement[ColumnDeclaration cd]
  :
  ;
  
column_default_statement[ColumnDeclaration cd]
  :
  ;
  
column_type_reference returns[ColumnTypeReference type = null]
  : ( t=BLOB
    | t=BOOLEAN
    | t=DATE
    | t=DOUBLE
    | t=GUID
    | t=INT
    | t=LONG
    | t=NTEXT
    | t=TEXT
    ) { $type = new ColumnTypeReference(null, getTokenNode($t)); }
  | ( t=BINARY
    | t=CHAR
    | t=NCHAR
    | t=NVARCHAR
    | t=VARBINARY
    | t=VARCHAR
    )
    (l=LEFT_PAREN s=UNSIGNED_INTEGER r=RIGHT_PAREN)?
    {
      if(s!=null) {
        $type = new ColumnTypeReference(null, getTokenNode(getText($t)+'('+getText($s)+')', unionPos(getPos($t),getPos($r))));
      } else {
        reportError(ParseWarningKinds.KIND_SIZE_REQUIRED,"size value is required after "+ getText($t),getEmptyPos(getPos($t).getEnd())); 
      }
    }
  | t=NUMERIC
    (l=LEFT_PAREN s=UNSIGNED_INTEGER (COMMA p=UNSIGNED_INTEGER)? r=RIGHT_PAREN)?
    {
      if(s!=null && p!=null) {
        $type = new ColumnTypeReference(null, getTokenNode(getText($t)+'('+getText($s)+','+getText($p)+')', unionPos(getPos($t),getPos($r))));
      } else if(s!=null) {
        reportError(ParseWarningKinds.KIND_SCALE_REQUIRED,"scale value is required for "+ getText($t),getEmptyPos(getPos($t).getEnd())); 
      } else {
        reportError(ParseWarningKinds.KIND_SIZE_REQUIRED,"size value is required after "+ getText($t),getEmptyPos(getPos($t).getEnd())); 
      }
    }
  ;
  
segments_list[TableDefineStatementBase tds]
  :
  ;

segment_statement returns[ColumnsStatement cs = null]
  :
  ;
  
indexes_statement returns[IndexesStatment ids = null]
  :
  ;
  
relations_statement returns[RelationsStatement rs = null]
  :
  ;
  
hierarchies_statement returns[HierarchiesStatement hs = null]
  :
  ;
  
partition_statement returns[PartitionStatement ps = null]
  :
  ;
  

  
// SQLs
sql_declare returns[Statement st=null]
  : q=query_declare { $st=$q.query; }
  | m=mapping_declare { $st=$m.orm; }
  ; 

fragment A: 'A'|'a';
fragment B: 'B'|'b';
fragment C: 'C'|'c';
fragment D: 'D'|'d';
fragment E: 'E'|'e';
fragment F: 'F'|'f';
fragment G: 'G'|'g';
fragment H: 'H'|'h';
fragment I: 'I'|'i';
fragment J: 'J'|'j';
fragment K: 'K'|'k';
fragment L: 'L'|'l';
fragment M: 'M'|'m';
fragment N: 'N'|'n';
fragment O: 'O'|'o';
fragment P: 'P'|'p';
fragment Q: 'Q'|'q';
fragment R: 'R'|'r';
fragment S: 'S'|'s';
fragment T: 'T'|'t';
fragment U: 'U'|'u';
fragment V: 'V'|'v';
fragment W: 'W'|'w';
fragment X: 'X'|'x';
fragment Y: 'Y'|'y';
fragment Z: 'Z'|'z';

ABO : A B O ; 
ABSTABLE : A B S T A B L E ;
ACTION : A C T I O N ;
ADD : A D D ;
ALL : A L L ;
ALTER : A L T E R ;
AND : A N D ;
ANY : A N Y ;
AS : A S ;
ASC : A S C ;
ASSERTION : A S S E R T I O N ;
AT : A T ;
AUTHORIZATION : A U T H O R I Z A T I O N ;
AVG : A V G ;
BEGIN : B E G I N ;
BETWEEN : B E T W E E N ;
BIT : B I T ;
BOTH : B O T H ;
BY : B Y ;
CASCADE : C A S C A D E ;
CASCADED : C A S C A D E D ;
CASE : C A S E ;
CAST : C A S T ;
CATALOG : C A T A L O G ;
CHAR : C H A R ;
CHARACTER : C H A R A C T E R ;
CHECK : C H E C K ;
CHILDOF : C H I L D O F ;
CLOSE : C L O S E ;
COALESCE : C O A L E S C E ;
COLLATE : C O L L A T E ;
COLLATION : C O L L A T I O N ;
COLUMN : C O L U M N ;
COMMIT : C O M M I T ;
CONNECT : C O N N E C T ;
CONNECTION : C O N N E C T I O N ;
CONTAINS : C O N T A I N S ;
CONSTRAINT : C O N S T R A I N T ;
CONSTRAINTS : C O N S T R A I N T S ;
CONVERT : C O N V E R T ;
CORRESPONDING : C O R R E S P O N D I N G ;
COUNT : C O U N T ;
CREATE : C R E A T E ;
CROSS : C R O S S ;
CUBE : C U B E ;
CURRENT : C U R R E N T ;
CURSOR : C U R S O R ;
DATA : D A T A ;
DAY : D A Y ;
DEALLOCATE : D E A L L O C A T E ;
DEC : D E C ;
DECIMAL : D E C I M A L ;
DECLARE : D E C L A R E ;
DEFAULT : D E F A U L T ;
DEFERRABLE : D E F E R R A B L E ;
DEFERRED : D E F E R R E D ;
DEFINE : D E F I N E ;
DELETE : D E L E T E ;
DESC : D E S C ;
DESCRIBE : D E S C R I B E ;
DESCRIPTOR : D E S C R I P T O R ;
DIAGNOSTICS : D I A G N O S T I C S ;
DIFF : D I F F ;
DIRECT : D I R E C T ;
DISCONNECT : D I S C O N N E C T ;
DISTINCT : D I S T I N C T ;
DOMAIN : D O M A I N ;
DROP : D R O P ;
ELSE : E L S E ;
END : E N D ;
ENDS_WITH : E N D S '_' W I T H ;
ESCAPE : E S C A P E ;
EXCEPT : E X C E P T ;
EXCEPTION : E X C E P T I O N ;
EXECUTE : E X E C U T E ;
EXISTS : E X I S T S ;
EXTERNAL : E X T E R N A L ;
EXTRACT : E X T R A C T ;
FALSE : F A L S E ;
FETCH : F E T C H ;
FIRST : F I R S T ;
FOR : F O R ;
FOREIGN : F O R E I G N ;
FROM : F R O M ;
FULL : F U L L ;
GET : G E T ;
GLOBAL : G L O B A L ;
GRANT : G R A N T ;
GROUP : G R O U P ;
H_LV : H '_' L V ;
H_AID : H '_' A I D ;
HAVING : H A V I N G ; 
HOUR : H O U R ;
IDENTITY : I D E N T I T Y ;
IMMEDIATE : I M M E D I A T E ;
IN : I N ;
INDICATOR : I N D I C A T O R ;
INITIALLY : I N I T I A L L Y ;
INNER : I N N E R ;
INPUT : I N P U T ;
INSENSITIVE : I N S E N S I T I V E ;
INSERT : I N S E R T ;
INTEGER : I N T E G E R ;
INTERSECT : I N T E R S E C T ;
INTERVAL : I N T E R V A L ;
INTO : I N T O ;
IS : I S ;
ISLEAP : I S L E A P ;
ISOLATION : I S O L A T I O N ;
JOIN : J O I N ;
KEY : K E Y ;
LAST : L A S T ;
LEAF : L E A F ;
LEADING : L E A D I N G ;
LEFT : L E F T ;
LENGTH : L E N G T H ;
LEVEL : L E V E L ;
LIKE : L I K E ;
LOCAL : L O C A L ;
MAPPING : M A P P I N G ;
MAX : M A X ;
MIN : M I N ;
MINUTE : M I N U T E ;
MODULE : M O D U L E ;
MONTH : M O N T H ;
MORE : M O R E ;
NAME : N A M E ;
NAMES : N A M E S ;
NATIONAL : N A T I O N A L ;
NATURAL : N A T U R A L ;
NO : N O ;
NOT : N O T ;
NULL : N U L L ;
NULLABLE : N U L L A B L E ;
NULLIF : N U L L I F ;
NUMBER : N U M B E R ;
OF : O F ;
ON : O N ;
ONLY : O N L Y ;
OPTION : O P T I O N ;
OR : O R ;
ORDER : O R D E R ;
ORM : O R M ;
OUTER : O U T E R ;
OUTPUT : O U T P U T ;
OVERLAPS : O V E R L A P S ;
OVERRIDE : O V E R R I D E ;
PARENTOF : P A R E N T O F ;
PARTIAL : P A R T I A L ;
PRIMARY : P R I M A R Y ;
PRIOR : P R I O R ;
PRIVILEGES : P R I V I L E G E S ;
PUBLIC : P U B L I C ;
QUERY : Q U E R Y ;
RANGE : R A N G E ;
READ : R E A D ;
REAL : R E A L ;
REFERENCES : R E F E R E N C E S ;
REL : R E L ;
RELATE : R E L A T E;
RELATIVE : R E L A T I V E ;
REPEATABLE : R E P E A T A B L E ;
RESTRICT : R E S T R I C T ;
REVOKE : R E V O K E ;
RIGHT : R I G H T ;
ROLLBACK : R O L L B A C K ;
ROLLUP : R O L L U P ;
ROWS : R O W S ;
SCALE : S C A L E ;
SCHEMA : S C H E M A ;
SCROLL : S C R O L L ;
SECOND : S E C O N D ;
SELECT : S E L E C T ;
SERIALIZABLE : S E R I A L I Z A B L E ;
SESSION : S E S S I O N ;
SET : S E T ;
SIZE : S I Z E ;
SOME : S O M E ;
SPACE : S P A C E ;
SQL : S Q L ;
STARTS_WITH : S T A R T S '_' W I T H ;
SUM : S U M ;
TABLE : T A B L E ;
TEMPORARY : T E M P O R A R Y ;
THEN : T H E N ;
TIME : T I M E ;
TIMESTAMP : T I M E S T A M P ;
TO : T O ;
TRUE : T R U E ;
TYPE : T Y P E ;
UNCOMMITTED : U N C O M M I T T E D ;
UNION : U N I O N ;
UNIQUE : U N I Q U E ;
UNKNOWN : U N K N O W N ;
UNNAMED : U N N A M E D ;
UPDATE : U P D A T E ;
USAGE : U S A G E ;
USER : U S E R ;
USING : U S I N G ;
VALUE : V A L U E ;
VALUES : V A L U E S ;
VARYING : V A R Y I N G ;
VIEW : V I E W ;
WHEN : W H E N ;
WHERE : W H E R E ;
WITH : W I T H ;
WORK : W O R K ;
WRITE : W R I T E ;
YEAR : Y E A R ;
ZONE : Z O N E ;

DESCENDANTOF : D E S C E N D A N T O F;
ANCESTOROF : A N C E S T O R O F;

INT : I N T ;
FLOAT : F L O A T ;
DOUBLE : D O U B L E ;
DATE : D A T E ;
BOOLEAN : B O O L E A N ;
GUID : G U I D ;
BYTE : B Y T E ;
BYTES : B Y T E S ;
ENUM : E N U M ;
SHORT : S H O R T ;
LONG : L O N G ;
STRING : S T R I N G ;   


BLOB : B L O B ;
NTEXT : N T E X T ;
TEXT : T E X T ;
BINARY : B I N A R Y ;
NCHAR : N C H A R ;
NVARCHAR : N V A R C H A R ;
VARBINARY : V A R B I N A R Y ;
VARCHAR : V A R C H A R ;
NUMERIC : N U M E R I C ;


ARGUMENT_ID
  : '@' REGULAR_ID? 
  ;

REGULAR_ID : 
  (SIMPLE_LETTER) (SIMPLE_LETTER | '_' | '0'..'9')*
;
 
EXACT_NUM_LIT :
    UNSIGNED_INTEGER
    ( '.' (UNSIGNED_INTEGER)?
    | {$type=UNSIGNED_INTEGER;}
    ) ( ('E' | 'e') ('+' | '-')? UNSIGNED_INTEGER { $type=APPROXIMATE_NUM_LIT;} )?
  | '.' UNSIGNED_INTEGER ( ('E' | 'e') ('+' | '-')? UNSIGNED_INTEGER { $type=APPROXIMATE_NUM_LIT;} )?
  | '.'   {$type=PERIOD;}
  | '.' '.' {$type=DOUBLE_PERIOD;}
;

fragment
APPROXIMATE_NUM_LIT : ;

fragment
UNSIGNED_INTEGER : 
  ('0'..'9')+ 
;

CHAR_STRING : 
    '\'' (~('\'' | '\r' | '\n') | '\'' '\'' |  NEWLINE)* '\''
  | QUOTE {$type=QUOTE;} 
;

DELIMITED_ID : 
  '"' (~('"' | '\r' | '\n') | '"' '"' )+ '"' 
;

//  DOUBLE_QUOTE : '"' ; // incorporated in the rule #163 <DELIMITED_ID>
PERCENT : '%' ; // Not used in the parser
AMPERSAND : '&' ; // Not used in the parser
fragment QUOTE : '\'' ; // subtoken typecast within <CHAR_STRING> 
LEFT_PAREN : '(' ; 
RIGHT_PAREN : ')' ; 
ASTERISK : '*' ; 
PLUS_SIGN : '+' ; 
COMMA : ',' ; 
MINUS_SIGN : '-' ; 
fragment PERIOD : '.' ; // subtoken typecast within <EXACT_NUM_LIT>
SOLIDUS : '/' ; 
COLON : ':' ; 
SEMICOLON : ';' ; 
LESS_THAN_OP : '<' ('>' {$type=NOT_EQUALS_OP;} | '=' {$type=LESS_THAN_OR_EQUALS_OP;})?; 
EQUALS_OP : '=' ; 
GREATER_THAN_OP : '>' ('=' {$type=GREATER_THAN_OR_EQUALS_OP;})?; 
QUESTION_MARK : '?' ; 
VERTICAL_BAR : '|' ('|' {$type=CONCATENATION_OP;})?; 

LEFT_BRACKET : '[' ; // Not used in the parser
RIGHT_BRACKET : ']' ; // Not used in the parser 

fragment NOT_EQUALS_OP : '<' '>' ; // subtoken typecast within <LESS_THAN_OP>
fragment LESS_THAN_OR_EQUALS_OP : '<' '=' ; // subtoken typecast within <LESS_THAN_OP>
fragment GREATER_THAN_OR_EQUALS_OP : '>' '=' ; // subtoken typecast within <GREATER_THAN_OP>
fragment CONCATENATION_OP : '|' '|';  // subtoken typecast within <VERTICAL_BAR>
fragment DOUBLE_PERIOD : '.' '.' ; // subtoken typecast within <EXACT_NUM_LIT>

INTRODUCER : UNDERSCORE ; 
fragment UNDERSCORE : '_' ; // subtoken typecast within <INTRODUCER>

fragment
SIMPLE_LETTER : 
  'a'..'z' | 'A'..'Z' | '\u007F'..'\u00FF' 
;

SEPARATOR : 
  (COMMENT | (BLANK | NEWLINE)+ ) { $channel=HIDDEN;}
;

fragment
COMMENT : 
  '-' '-' ( ~('\r' | '\n') )* NEWLINE 
;

fragment
NEWLINE : 
  ( '\r' ('\n')? | '\n' )
;

fragment 
BLANK : 
    ' ' | '\t' 
;
protected
ANY_CHAR : 
  .
;

non_reserved_word returns[Token word=null] :
   (t=DATA | t=LENGTH | t=MORE
  | t=NAME | t=NULLABLE | t=NUMBER 
  | t=REPEATABLE
  | t=SCALE  | t=SERIALIZABLE 
  | t=TYPE 
  | t=UNCOMMITTED | t=UNNAMED ) {word=$t;}
;
