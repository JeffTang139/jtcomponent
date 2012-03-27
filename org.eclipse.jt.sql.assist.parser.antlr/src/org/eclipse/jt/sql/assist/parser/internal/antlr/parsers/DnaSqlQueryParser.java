// $ANTLR 3.1.2 E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g 2010-05-28 10:30:24

package org.eclipse.jt.sql.assist.parser.internal.antlr.parsers;





import org.antlr.runtime.*;
import org.eclipse.jt.script.assist.IAstNode;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.sql.assist.core.ast.*;
import org.eclipse.jt.sql.assist.core.ast.command.*;
import org.eclipse.jt.sql.assist.core.ast.general.*;
import org.eclipse.jt.sql.assist.core.ast.orm.*;
import org.eclipse.jt.sql.assist.core.ast.query.*;
import org.eclipse.jt.sql.assist.core.ast.table.*;
import org.eclipse.jt.sql.assist.core.kinds.LiteralKinds;
import org.eclipse.jt.sql.assist.parser.antlr.ParseWarningKinds;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrErrorReporter;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrPositionConvertor;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DnaSqlQueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONCATENATION_OP", "APPROXIMATE_NUM_LIT", "DOUBLE_QUOTE", "MINUS_SIGN", "DOUBLE_PERIOD", "PERIOD", "UNDERSCORE", "QUOTE", "NOT_EQUALS_OP", "LESS_THAN_OR_EQUALS_OP", "GREATER_THAN_OR_EQUALS_OP", "ARGUMENT_ID", "ENUM", "LESS_THAN_OP", "GREATER_THAN_OP", "BOOLEAN", "BYTES", "BYTE", "DATE", "DOUBLE", "FLOAT", "GUID", "INT", "LONG", "SHORT", "STRING", "REGULAR_ID", "DEFAULT", "NOT", "NULL", "PLUS_SIGN", "ASTERISK", "SOLIDUS", "LEFT_PAREN", "RIGHT_PAREN", "COUNT", "AVG", "SUM", "MAX", "MIN", "DISTINCT", "ALL", "H_LV", "H_AID", "REL", "ABO", "COMMA", "COALESCE", "CASE", "WHEN", "THEN", "ELSE", "END", "TRUE", "FALSE", "CHAR_STRING", "UNSIGNED_INTEGER", "EXACT_NUM_LIT", "OR", "AND", "EXISTS", "EQUALS_OP", "BETWEEN", "IN", "LIKE", "ESCAPE", "STARTS_WITH", "ENDS_WITH", "CONTAINS", "IS", "DELIMITED_ID", "DEFINE", "QUERY", "BEGIN", "UNION", "WITH", "SELECT", "FROM", "JOIN", "RELATE", "LEFT", "RIGHT", "FULL", "ON", "AS", "FOR", "UPDATE", "WHERE", "RELATIVE", "RANGE", "LEAF", "USING", "CHILDOF", "PARENTOF", "DESCENDANTOF", "ANCESTOROF", "GROUP", "BY", "ROLLUP", "CUBE", "HAVING", "ORDER", "ASC", "DESC", "ORM", "MAPPING", "OVERRIDE", "INSERT", "INTO", "VALUES", "SET", "DELETE", "ABSTABLE", "TABLE", "BLOB", "NTEXT", "TEXT", "BINARY", "CHAR", "NCHAR", "NVARCHAR", "VARBINARY", "VARCHAR", "NUMERIC", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ACTION", "ADD", "ALTER", "ANY", "ASSERTION", "AT", "AUTHORIZATION", "BIT", "BOTH", "CASCADE", "CASCADED", "CAST", "CATALOG", "CHARACTER", "CHECK", "CLOSE", "COLLATE", "COLLATION", "COLUMN", "COMMIT", "CONNECT", "CONNECTION", "CONSTRAINT", "CONSTRAINTS", "CONVERT", "CORRESPONDING", "CREATE", "CROSS", "CURRENT", "CURSOR", "DATA", "DAY", "DEALLOCATE", "DEC", "DECIMAL", "DECLARE", "DEFERRABLE", "DEFERRED", "DESCRIBE", "DESCRIPTOR", "DIAGNOSTICS", "DIFF", "DIRECT", "DISCONNECT", "DOMAIN", "DROP", "EXCEPT", "EXCEPTION", "EXECUTE", "EXTERNAL", "EXTRACT", "FETCH", "FIRST", "FOREIGN", "GET", "GLOBAL", "GRANT", "HOUR", "IDENTITY", "IMMEDIATE", "INDICATOR", "INITIALLY", "INNER", "INPUT", "INSENSITIVE", "INTEGER", "INTERSECT", "INTERVAL", "ISLEAP", "ISOLATION", "KEY", "LAST", "LEADING", "LENGTH", "LEVEL", "LOCAL", "MINUTE", "MODULE", "MONTH", "MORE", "NAME", "NAMES", "NATIONAL", "NATURAL", "NO", "NULLABLE", "NULLIF", "NUMBER", "OF", "ONLY", "OPTION", "OUTER", "OUTPUT", "OVERLAPS", "PARTIAL", "PRIMARY", "PRIOR", "PRIVILEGES", "PUBLIC", "READ", "REAL", "REFERENCES", "REPEATABLE", "RESTRICT", "REVOKE", "ROLLBACK", "ROWS", "SCALE", "SCHEMA", "SCROLL", "SECOND", "SERIALIZABLE", "SESSION", "SIZE", "SOME", "SPACE", "SQL", "TEMPORARY", "TIME", "TIMESTAMP", "TO", "TYPE", "UNCOMMITTED", "UNIQUE", "UNKNOWN", "UNNAMED", "USAGE", "USER", "VALUE", "VARYING", "VIEW", "WORK", "WRITE", "YEAR", "ZONE", "SIMPLE_LETTER", "NEWLINE", "PERCENT", "AMPERSAND", "COLON", "SEMICOLON", "QUESTION_MARK", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "INTRODUCER", "COMMENT", "BLANK", "SEPARATOR", "ANY_CHAR"
    };
    public static final int EXISTS=64;
    public static final int FETCH=205;
    public static final int END=56;
    public static final int NOT_EQUALS_OP=12;
    public static final int INTO=112;
    public static final int NUMBER=241;
    public static final int WORK=285;
    public static final int V=149;
    public static final int NATURAL=237;
    public static final int GUID=25;
    public static final int VIEW=284;
    public static final int U=148;
    public static final int UNCOMMITTED=276;
    public static final int CONNECT=174;
    public static final int BINARY=121;
    public static final int ON=87;
    public static final int NEWLINE=290;
    public static final int CONSTRAINT=176;
    public static final int RELATIVE=92;
    public static final int QUESTION_MARK=295;
    public static final int SIMPLE_LETTER=289;
    public static final int ORDER=105;
    public static final int ABSTABLE=116;
    public static final int COLLATE=170;
    public static final int R=145;
    public static final int GET=208;
    public static final int SELECT=80;
    public static final int Q=144;
    public static final int MODULE=231;
    public static final int MONTH=232;
    public static final int CONNECTION=175;
    public static final int DESC=107;
    public static final int DECLARE=189;
    public static final int NUMERIC=127;
    public static final int SESSION=266;
    public static final int UNION=78;
    public static final int ASSERTION=158;
    public static final int LEFT_PAREN=37;
    public static final int PRIMARY=249;
    public static final int RANGE=93;
    public static final int W=150;
    public static final int WHEN=53;
    public static final int STRING=29;
    public static final int YEAR=287;
    public static final int BYTES=20;
    public static final int ZONE=288;
    public static final int UPDATE=90;
    public static final int CATALOG=166;
    public static final int SCALE=261;
    public static final int EQUALS_OP=65;
    public static final int X=151;
    public static final int ANY=157;
    public static final int TIME=272;
    public static final int BOOLEAN=19;
    public static final int ALTER=156;
    public static final int ELSE=55;
    public static final int GREATER_THAN_OR_EQUALS_OP=14;
    public static final int COUNT=39;
    public static final int DIAGNOSTICS=194;
    public static final int NULL=33;
    public static final int TEXT=120;
    public static final int ASTERISK=35;
    public static final int COLON=293;
    public static final int HAVING=104;
    public static final int SET=114;
    public static final int INDICATOR=214;
    public static final int J=137;
    public static final int TRUE=57;
    public static final int ADD=155;
    public static final int DAY=185;
    public static final int UNIQUE=277;
    public static final int UNDERSCORE=10;
    public static final int SHORT=28;
    public static final int UNKNOWN=278;
    public static final int TYPE=275;
    public static final int MINUTE=230;
    public static final int GRANT=210;
    public static final int PUBLIC=252;
    public static final int OUTPUT=246;
    public static final int O=142;
    public static final int NULLABLE=239;
    public static final int LONG=27;
    public static final int INPUT=217;
    public static final int PERCENT=291;
    public static final int H_LV=46;
    public static final int EXTERNAL=203;
    public static final int LAST=225;
    public static final int P=143;
    public static final int PERIOD=9;
    public static final int FLOAT=24;
    public static final int ANY_CHAR=303;
    public static final int RESTRICT=257;
    public static final int CUBE=103;
    public static final int VALUES=113;
    public static final int CAST=165;
    public static final int BLANK=301;
    public static final int EXECUTE=202;
    public static final int EXCEPT=200;
    public static final int COALESCE=51;
    public static final int OR=62;
    public static final int S=146;
    public static final int FULL=86;
    public static final int PRIVILEGES=251;
    public static final int INTEGER=219;
    public static final int ENDS_WITH=71;
    public static final int CORRESPONDING=179;
    public static final int TIMESTAMP=273;
    public static final int BY=101;
    public static final int SECOND=264;
    public static final int INT=26;
    public static final int DESCRIBE=192;
    public static final int UNNAMED=279;
    public static final int ESCAPE=69;
    public static final int M=140;
    public static final int CHARACTER=167;
    public static final int JOIN=82;
    public static final int T=147;
    public static final int REAL=254;
    public static final int SUM=41;
    public static final int FROM=81;
    public static final int DELETE=115;
    public static final int NULLIF=240;
    public static final int MAX=42;
    public static final int STARTS_WITH=70;
    public static final int DESCRIPTOR=193;
    public static final int ONLY=243;
    public static final int DEFERRABLE=190;
    public static final int APPROXIMATE_NUM_LIT=5;
    public static final int COMMENT=300;
    public static final int PLUS_SIGN=34;
    public static final int OVERRIDE=110;
    public static final int GREATER_THAN_OP=18;
    public static final int MAPPING=109;
    public static final int LIKE=68;
    public static final int COMMIT=173;
    public static final int N=141;
    public static final int DIFF=195;
    public static final int VERTICAL_BAR=296;
    public static final int WITH=79;
    public static final int NATIONAL=236;
    public static final int IN=67;
    public static final int LEAF=94;
    public static final int SOME=268;
    public static final int DROP=199;
    public static final int DEC=187;
    public static final int PARTIAL=248;
    public static final int BYTE=21;
    public static final int DISCONNECT=197;
    public static final int FOR=89;
    public static final int DEFAULT=31;
    public static final int AVG=40;
    public static final int CURSOR=183;
    public static final int REPEATABLE=256;
    public static final int NOT=32;
    public static final int OPTION=244;
    public static final int READ=253;
    public static final int EXCEPTION=201;
    public static final int ISLEAP=222;
    public static final int COMMA=50;
    public static final int CONCATENATION_OP=4;
    public static final int INTERVAL=221;
    public static final int REGULAR_ID=30;
    public static final int INSENSITIVE=218;
    public static final int AS=88;
    public static final int MORE=233;
    public static final int DOUBLE=23;
    public static final int FALSE=58;
    public static final int THEN=54;
    public static final int USAGE=280;
    public static final int FOREIGN=207;
    public static final int AUTHORIZATION=160;
    public static final int D=131;
    public static final int TO=274;
    public static final int SERIALIZABLE=265;
    public static final int AND=63;
    public static final int CHAR_STRING=59;
    public static final int LESS_THAN_OR_EQUALS_OP=13;
    public static final int CASCADED=164;
    public static final int LOCAL=229;
    public static final int GLOBAL=209;
    public static final int RIGHT=85;
    public static final int LESS_THAN_OP=17;
    public static final int ROLLBACK=259;
    public static final int CONSTRAINTS=177;
    public static final int DATE=22;
    public static final int LEVEL=228;
    public static final int BETWEEN=66;
    public static final int SCHEMA=262;
    public static final int BOTH=162;
    public static final int AMPERSAND=292;
    public static final int DESCENDANTOF=98;
    public static final int INTERSECT=220;
    public static final int AT=159;
    public static final int DISTINCT=44;
    public static final int SPACE=269;
    public static final int DELIMITED_ID=74;
    public static final int CASCADE=163;
    public static final int PRIOR=250;
    public static final int CHAR=122;
    public static final int NCHAR=123;
    public static final int WRITE=286;
    public static final int OF=242;
    public static final int DOUBLE_QUOTE=6;
    public static final int ORM=108;
    public static final int DATA=184;
    public static final int A=128;
    public static final int VARCHAR=126;
    public static final int RELATE=83;
    public static final int NTEXT=119;
    public static final int SCROLL=263;
    public static final int CASE=52;
    public static final int INTRODUCER=299;
    public static final int DEFERRED=191;
    public static final int TABLE=117;
    public static final int DEALLOCATE=186;
    public static final int SEMICOLON=294;
    public static final int C=130;
    public static final int REFERENCES=255;
    public static final int KEY=224;
    public static final int CHECK=168;
    public static final int FIRST=206;
    public static final int L=139;
    public static final int DOMAIN=198;
    public static final int CHILDOF=96;
    public static final int ALL=45;
    public static final int COLUMN=172;
    public static final int NAME=234;
    public static final int PARENTOF=97;
    public static final int INSERT=111;
    public static final int VARYING=283;
    public static final int WHERE=91;
    public static final int CREATE=180;
    public static final int DIRECT=196;
    public static final int USING=95;
    public static final int LEADING=226;
    public static final int INITIALLY=215;
    public static final int CURRENT=182;
    public static final int I=136;
    public static final int INNER=216;
    public static final int QUERY=76;
    public static final int ROWS=260;
    public static final int ABO=49;
    public static final int F=133;
    public static final int BIT=161;
    public static final int VALUE=282;
    public static final int DECIMAL=188;
    public static final int RIGHT_BRACKET=298;
    public static final int ARGUMENT_ID=15;
    public static final int K=138;
    public static final int DOUBLE_PERIOD=8;
    public static final int VARBINARY=125;
    public static final int LEFT_BRACKET=297;
    public static final int ANCESTOROF=99;
    public static final int B=129;
    public static final int IDENTITY=212;
    public static final int GROUP=100;
    public static final int CONTAINS=72;
    public static final int MINUS_SIGN=7;
    public static final int LEFT=84;
    public static final int TEMPORARY=271;
    public static final int OUTER=245;
    public static final int ENUM=16;
    public static final int NVARCHAR=124;
    public static final int SQL=270;
    public static final int OVERLAPS=247;
    public static final int ROLLUP=102;
    public static final int H=135;
    public static final int BLOB=118;
    public static final int ISOLATION=223;
    public static final int LENGTH=227;
    public static final int IMMEDIATE=213;
    public static final int IS=73;
    public static final int EXACT_NUM_LIT=61;
    public static final int G=134;
    public static final int USER=281;
    public static final int NO=238;
    public static final int MIN=43;
    public static final int ACTION=154;
    public static final int ASC=106;
    public static final int QUOTE=11;
    public static final int BEGIN=77;
    public static final int HOUR=211;
    public static final int Z=153;
    public static final int SEPARATOR=302;
    public static final int DEFINE=75;
    public static final int COLLATION=171;
    public static final int CONVERT=178;
    public static final int EXTRACT=204;
    public static final int EOF=-1;
    public static final int CROSS=181;
    public static final int NAMES=235;
    public static final int CLOSE=169;
    public static final int SIZE=267;
    public static final int REL=48;
    public static final int SOLIDUS=36;
    public static final int REVOKE=258;
    public static final int Y=152;
    public static final int H_AID=47;
    public static final int RIGHT_PAREN=38;
    public static final int UNSIGNED_INTEGER=60;
    public static final int E=132;

    // delegates
    // delegators


        public DnaSqlQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DnaSqlQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DnaSqlQueryParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g"; }


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



    // $ANTLR start "argument_declaration"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:143:1: argument_declaration returns [ArgumentDeclaration ardec=null] : n= ARGUMENT_ID t= data_type ( argument_modifier[ardec] )? ;
    public final ArgumentDeclaration argument_declaration() throws RecognitionException {
        ArgumentDeclaration ardec = null;

        Token n=null;
        DataTypeReference t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:144:3: (n= ARGUMENT_ID t= data_type ( argument_modifier[ardec] )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:144:5: n= ARGUMENT_ID t= data_type ( argument_modifier[ardec] )?
            {
            n=(Token)match(input,ARGUMENT_ID,FOLLOW_ARGUMENT_ID_in_argument_declaration136); if (state.failed) return ardec;
            pushFollow(FOLLOW_data_type_in_argument_declaration140);
            t=data_type();

            state._fsp--;
            if (state.failed) return ardec;
            if ( state.backtracking==0 ) {
               ardec = new ArgumentDeclaration(getPos(n),t,getTokenNode(n),getPos(n));
                  String name=getText(n);
                  if(name==null||name.length()<=1)
                     reportError(ParseWarningKinds.KIND_EMPTY_ARGUMENT_NAME,"empty argument name",getPos(n)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:149:5: ( argument_modifier[ardec] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=DEFAULT && LA1_0<=NOT)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:149:6: argument_modifier[ardec]
                    {
                    pushFollow(FOLLOW_argument_modifier_in_argument_declaration151);
                    argument_modifier(ardec);

                    state._fsp--;
                    if (state.failed) return ardec;

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return ardec;
    }
    // $ANTLR end "argument_declaration"


    // $ANTLR start "data_type"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:152:1: data_type returns [DataTypeReference atype = null] : ( ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP | t= BOOLEAN | t= BYTES | t= BYTE | t= DATE | t= DOUBLE | t= FLOAT | t= GUID | t= INT | t= LONG | t= SHORT | t= STRING | t= REGULAR_ID ) ;
    public final DataTypeReference data_type() throws RecognitionException {
        DataTypeReference atype =  null;

        Token t=null;
        Token l=null;
        Token g=null;
        ClassReference c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:3: ( ( ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP | t= BOOLEAN | t= BYTES | t= BYTE | t= DATE | t= DOUBLE | t= FLOAT | t= GUID | t= INT | t= LONG | t= SHORT | t= STRING | t= REGULAR_ID ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:4: ( ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP | t= BOOLEAN | t= BYTES | t= BYTE | t= DATE | t= DOUBLE | t= FLOAT | t= GUID | t= INT | t= LONG | t= SHORT | t= STRING | t= REGULAR_ID )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:4: ( ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP | t= BOOLEAN | t= BYTES | t= BYTE | t= DATE | t= DOUBLE | t= FLOAT | t= GUID | t= INT | t= LONG | t= SHORT | t= STRING | t= REGULAR_ID )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:6: ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:15: (t= ENUM )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:16: t= ENUM
                    {
                    t=(Token)match(input,ENUM,FOLLOW_ENUM_in_data_type179); if (state.failed) return atype;

                    }

                    l=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_data_type184); if (state.failed) return atype;
                    pushFollow(FOLLOW_class_reference_in_data_type191);
                    c=class_reference();

                    state._fsp--;
                    if (state.failed) return atype;
                    g=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_data_type195); if (state.failed) return atype;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:154:5: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_data_type203); if (state.failed) return atype;

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:155:5: t= BYTES
                    {
                    t=(Token)match(input,BYTES,FOLLOW_BYTES_in_data_type212); if (state.failed) return atype;

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:156:5: t= BYTE
                    {
                    t=(Token)match(input,BYTE,FOLLOW_BYTE_in_data_type222); if (state.failed) return atype;

                    }
                    break;
                case 5 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:157:5: t= DATE
                    {
                    t=(Token)match(input,DATE,FOLLOW_DATE_in_data_type232); if (state.failed) return atype;

                    }
                    break;
                case 6 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:158:5: t= DOUBLE
                    {
                    t=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_data_type242); if (state.failed) return atype;

                    }
                    break;
                case 7 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:159:5: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_data_type251); if (state.failed) return atype;

                    }
                    break;
                case 8 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:160:5: t= GUID
                    {
                    t=(Token)match(input,GUID,FOLLOW_GUID_in_data_type261); if (state.failed) return atype;

                    }
                    break;
                case 9 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:161:5: t= INT
                    {
                    t=(Token)match(input,INT,FOLLOW_INT_in_data_type272); if (state.failed) return atype;

                    }
                    break;
                case 10 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:162:5: t= LONG
                    {
                    t=(Token)match(input,LONG,FOLLOW_LONG_in_data_type284); if (state.failed) return atype;

                    }
                    break;
                case 11 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:163:5: t= SHORT
                    {
                    t=(Token)match(input,SHORT,FOLLOW_SHORT_in_data_type297); if (state.failed) return atype;

                    }
                    break;
                case 12 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:164:5: t= STRING
                    {
                    t=(Token)match(input,STRING,FOLLOW_STRING_in_data_type307); if (state.failed) return atype;

                    }
                    break;
                case 13 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:165:5: t= REGULAR_ID
                    {
                    t=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_data_type315); if (state.failed) return atype;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               atype =new DataTypeReference(getPos(t),(t!=null?t.getText():null)); 
                  String name=(t!=null?t.getText():null);
                  if(name!=null&&!name.equals(name.toLowerCase()))
                     reportError(ParseWarningKinds.KIND_BAD_ARGUMENT_TYPE,"argument type name must be in lower case",getPos(t));
            }

            }

        }

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
        finally {
        }
        return atype;
    }
    // $ANTLR end "data_type"


    // $ANTLR start "class_reference"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:172:1: class_reference returns [ClassReference cr = null] : i= id (p= PERIOD (e= id )? )* ;
    public final ClassReference class_reference() throws RecognitionException {
        ClassReference cr =  null;

        Token p=null;
        Token i = null;

        Token e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:173:3: (i= id (p= PERIOD (e= id )? )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:174:5: i= id (p= PERIOD (e= id )? )*
            {
            pushFollow(FOLLOW_id_in_class_reference343);
            i=id();

            state._fsp--;
            if (state.failed) return cr;
            if ( state.backtracking==0 ) {
               cr = new ClassReference(null);
                    cr.add(getTokenNode(i));
                  
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:178:5: (p= PERIOD (e= id )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PERIOD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:178:9: p= PERIOD (e= id )?
            	    {
            	    if ( state.backtracking==0 ) {
            	       e=null; 
            	    }
            	    p=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_class_reference369); if (state.failed) return cr;
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:179:16: (e= id )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==REGULAR_ID||LA3_0==DELIMITED_ID||LA3_0==DATA||LA3_0==LENGTH||(LA3_0>=MORE && LA3_0<=NAME)||LA3_0==NULLABLE||LA3_0==NUMBER||LA3_0==REPEATABLE||LA3_0==SCALE||LA3_0==SERIALIZABLE||(LA3_0>=TYPE && LA3_0<=UNCOMMITTED)||LA3_0==UNNAMED) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:179:17: e= id
            	            {
            	            pushFollow(FOLLOW_id_in_class_reference374);
            	            e=id();

            	            state._fsp--;
            	            if (state.failed) return cr;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	                 if(e!=null)
            	                    cr.add(getTokenNode(e));
            	                 else {
            	                    ISourcePosition pointPos=getPos(p);
            	                    reportError(ParseWarningKinds.KIND_MISS_CLASS_NAME,"class name lost after "+getText(p),pointPos);
            	                    cr.updatePosition(pointPos);
            	                    cr.add(null); 
            	                 }
            	              
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return cr;
    }
    // $ANTLR end "class_reference"


    // $ANTLR start "argument_modifier"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:193:1: argument_modifier[ArgumentDeclaration arg] : ( default_value_spec[arg] ( not_null_spec[arg] )? | not_null_spec[arg] ( default_value_spec[arg] )? );
    public final void argument_modifier(ArgumentDeclaration arg) throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:194:3: ( default_value_spec[arg] ( not_null_spec[arg] )? | not_null_spec[arg] ( default_value_spec[arg] )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DEFAULT) ) {
                alt7=1;
            }
            else if ( (LA7_0==NOT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:194:5: default_value_spec[arg] ( not_null_spec[arg] )?
                    {
                    pushFollow(FOLLOW_default_value_spec_in_argument_modifier408);
                    default_value_spec(arg);

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:194:29: ( not_null_spec[arg] )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==NOT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:194:30: not_null_spec[arg]
                            {
                            pushFollow(FOLLOW_not_null_spec_in_argument_modifier412);
                            not_null_spec(arg);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:195:5: not_null_spec[arg] ( default_value_spec[arg] )?
                    {
                    pushFollow(FOLLOW_not_null_spec_in_argument_modifier421);
                    not_null_spec(arg);

                    state._fsp--;
                    if (state.failed) return ;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:195:24: ( default_value_spec[arg] )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==DEFAULT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:195:25: default_value_spec[arg]
                            {
                            pushFollow(FOLLOW_default_value_spec_in_argument_modifier425);
                            default_value_spec(arg);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "argument_modifier"


    // $ANTLR start "default_value_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:198:1: default_value_spec[ArgumentDeclaration arg] : ( DEFAULT )=> (d= DEFAULT ) v= constant_exp ;
    public final void default_value_spec(ArgumentDeclaration arg) throws RecognitionException {
        Token d=null;
        ConstantExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:199:3: ( ( DEFAULT )=> (d= DEFAULT ) v= constant_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:199:5: ( DEFAULT )=> (d= DEFAULT ) v= constant_exp
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:199:16: (d= DEFAULT )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:199:17: d= DEFAULT
            {
            d=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_value_spec449); if (state.failed) return ;

            }

            pushFollow(FOLLOW_constant_exp_in_default_value_spec454);
            v=constant_exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               arg.updatePosition(getPos(d)); arg.setDefaultValue(v); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "default_value_spec"


    // $ANTLR start "not_null_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:202:1: not_null_spec[ArgumentDeclaration arg] : ( NOT )=> ( NOT ) u= NULL ;
    public final void not_null_spec(ArgumentDeclaration arg) throws RecognitionException {
        Token u=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:203:3: ( ( NOT )=> ( NOT ) u= NULL )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:203:6: ( NOT )=> ( NOT ) u= NULL
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:203:13: ( NOT )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:203:14: NOT
            {
            match(input,NOT,FOLLOW_NOT_in_not_null_spec478); if (state.failed) return ;

            }

            u=(Token)match(input,NULL,FOLLOW_NULL_in_not_null_spec483); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               arg.setNotNull(true,getPos(u)); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "not_null_spec"


    // $ANTLR start "value_exp"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:208:1: value_exp returns [ValueExpression exp=null] : t= term ( ( term_op )=> (o= term_op ) (t= term )? ( ( term_op )=> (o= term_op ) (t= term )? )* )? ;
    public final ValueExpression value_exp() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression t = null;

        Token o = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:208:44: (t= term ( ( term_op )=> (o= term_op ) (t= term )? ( ( term_op )=> (o= term_op ) (t= term )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:209:3: t= term ( ( term_op )=> (o= term_op ) (t= term )? ( ( term_op )=> (o= term_op ) (t= term )? )* )?
            {
            pushFollow(FOLLOW_term_in_value_exp510);
            t=term();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =t;
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:210:3: ( ( term_op )=> (o= term_op ) (t= term )? ( ( term_op )=> (o= term_op ) (t= term )? )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PLUS_SIGN) && (synpred4_DnaSqlQuery())) {
                alt11=1;
            }
            else if ( (LA11_0==MINUS_SIGN) && (synpred4_DnaSqlQuery())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:7: ( term_op )=> (o= term_op ) (t= term )? ( ( term_op )=> (o= term_op ) (t= term )? )*
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:18: (o= term_op )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:19: o= term_op
                    {
                    pushFollow(FOLLOW_term_op_in_value_exp532);
                    o=term_op();

                    state._fsp--;
                    if (state.failed) return exp;

                    }

                    if ( state.backtracking==0 ) {
                      t=null;
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:40: (t= term )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==APPROXIMATE_NUM_LIT||LA8_0==ARGUMENT_ID||LA8_0==BYTES||LA8_0==DATE||LA8_0==GUID||LA8_0==REGULAR_ID||LA8_0==LEFT_PAREN||(LA8_0>=COUNT && LA8_0<=MIN)||(LA8_0>=H_LV && LA8_0<=H_AID)||(LA8_0>=COALESCE && LA8_0<=CASE)||(LA8_0>=TRUE && LA8_0<=EXACT_NUM_LIT)||LA8_0==DELIMITED_ID||LA8_0==DATA||LA8_0==LENGTH||(LA8_0>=MORE && LA8_0<=NAME)||LA8_0==NULLABLE||LA8_0==NUMBER||LA8_0==REPEATABLE||LA8_0==SCALE||LA8_0==SERIALIZABLE||(LA8_0>=TYPE && LA8_0<=UNCOMMITTED)||LA8_0==UNNAMED) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==MINUS_SIGN) ) {
                        switch ( input.LA(2) ) {
                            case UNSIGNED_INTEGER:
                                {
                                alt8=1;
                                }
                                break;
                            case EXACT_NUM_LIT:
                                {
                                alt8=1;
                                }
                                break;
                            case APPROXIMATE_NUM_LIT:
                                {
                                alt8=1;
                                }
                                break;
                        }

                    }
                    switch (alt8) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:41: t= term
                            {
                            pushFollow(FOLLOW_term_in_value_exp540);
                            t=term();

                            state._fsp--;
                            if (state.failed) return exp;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              exp =new OperatorExpression(getPos(exp),exp);
                              ((OperatorExpression)exp).add(getText(o),getPos(o),t);
                              if(t==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText(o),getPos(o));
                             
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:5: ( ( term_op )=> (o= term_op ) (t= term )? )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==PLUS_SIGN) && (synpred5_DnaSqlQuery())) {
                            alt10=1;
                        }
                        else if ( (LA10_0==MINUS_SIGN) && (synpred5_DnaSqlQuery())) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:7: ( term_op )=> (o= term_op ) (t= term )?
                    	    {
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:18: (o= term_op )
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:19: o= term_op
                    	    {
                    	    pushFollow(FOLLOW_term_op_in_value_exp566);
                    	    o=term_op();

                    	    state._fsp--;
                    	    if (state.failed) return exp;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      t=null;
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:40: (t= term )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==BYTES||LA9_0==DATE||LA9_0==GUID||LA9_0==REGULAR_ID||(LA9_0>=COUNT && LA9_0<=MIN)||(LA9_0>=H_LV && LA9_0<=H_AID)||(LA9_0>=COALESCE && LA9_0<=CASE)||(LA9_0>=TRUE && LA9_0<=FALSE)||LA9_0==DELIMITED_ID||LA9_0==DATA||LA9_0==LENGTH||(LA9_0>=MORE && LA9_0<=NAME)||LA9_0==NULLABLE||LA9_0==NUMBER||LA9_0==REPEATABLE||LA9_0==SCALE||LA9_0==SERIALIZABLE||(LA9_0>=TYPE && LA9_0<=UNCOMMITTED)||LA9_0==UNNAMED) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==APPROXIMATE_NUM_LIT||LA9_0==MINUS_SIGN||LA9_0==ARGUMENT_ID||LA9_0==LEFT_PAREN||(LA9_0>=CHAR_STRING && LA9_0<=EXACT_NUM_LIT)) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:41: t= term
                    	            {
                    	            pushFollow(FOLLOW_term_in_value_exp574);
                    	            t=term();

                    	            state._fsp--;
                    	            if (state.failed) return exp;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      	      ((OperatorExpression)exp).add(getText(o),getPos(o),t);
                    	              if(t==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText(o),getPos(o));
                    	      	     
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "value_exp"


    // $ANTLR start "term_op"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:226:1: term_op returns [Token op=null] : (o= PLUS_SIGN | o= MINUS_SIGN );
    public final Token term_op() throws RecognitionException {
        Token op = null;

        Token o=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:227:3: (o= PLUS_SIGN | o= MINUS_SIGN )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PLUS_SIGN) ) {
                alt12=1;
            }
            else if ( (LA12_0==MINUS_SIGN) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:227:5: o= PLUS_SIGN
                    {
                    o=(Token)match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_term_op615); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =o; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:228:5: o= MINUS_SIGN
                    {
                    o=(Token)match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_term_op627); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =o; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "term_op"


    // $ANTLR start "term"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:231:1: term returns [ValueExpression exp=null] : f= factor ( ( factor_op )=> (o= factor_op ) (f= factor )? ( ( factor_op )=> (o= factor_op ) (f= factor )? )* )? ;
    public final ValueExpression term() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression f = null;

        Token o = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:231:40: (f= factor ( ( factor_op )=> (o= factor_op ) (f= factor )? ( ( factor_op )=> (o= factor_op ) (f= factor )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:232:3: f= factor ( ( factor_op )=> (o= factor_op ) (f= factor )? ( ( factor_op )=> (o= factor_op ) (f= factor )? )* )?
            {
            pushFollow(FOLLOW_factor_in_term649);
            f=factor();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =f;
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:3: ( ( factor_op )=> (o= factor_op ) (f= factor )? ( ( factor_op )=> (o= factor_op ) (f= factor )? )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ASTERISK) && (synpred6_DnaSqlQuery())) {
                alt16=1;
            }
            else if ( (LA16_0==SOLIDUS) && (synpred6_DnaSqlQuery())) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:6: ( factor_op )=> (o= factor_op ) (f= factor )? ( ( factor_op )=> (o= factor_op ) (f= factor )? )*
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:19: (o= factor_op )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:20: o= factor_op
                    {
                    pushFollow(FOLLOW_factor_op_in_term665);
                    o=factor_op();

                    state._fsp--;
                    if (state.failed) return exp;

                    }

                    if ( state.backtracking==0 ) {
                      f=null;
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:43: (f= factor )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==APPROXIMATE_NUM_LIT||LA13_0==ARGUMENT_ID||LA13_0==BYTES||LA13_0==DATE||LA13_0==GUID||LA13_0==REGULAR_ID||LA13_0==LEFT_PAREN||(LA13_0>=COUNT && LA13_0<=MIN)||(LA13_0>=H_LV && LA13_0<=H_AID)||(LA13_0>=COALESCE && LA13_0<=CASE)||(LA13_0>=TRUE && LA13_0<=EXACT_NUM_LIT)||LA13_0==DELIMITED_ID||LA13_0==DATA||LA13_0==LENGTH||(LA13_0>=MORE && LA13_0<=NAME)||LA13_0==NULLABLE||LA13_0==NUMBER||LA13_0==REPEATABLE||LA13_0==SCALE||LA13_0==SERIALIZABLE||(LA13_0>=TYPE && LA13_0<=UNCOMMITTED)||LA13_0==UNNAMED) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==MINUS_SIGN) ) {
                        switch ( input.LA(2) ) {
                            case UNSIGNED_INTEGER:
                                {
                                alt13=1;
                                }
                                break;
                            case EXACT_NUM_LIT:
                                {
                                alt13=1;
                                }
                                break;
                            case APPROXIMATE_NUM_LIT:
                                {
                                alt13=1;
                                }
                                break;
                        }

                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:44: f= factor
                            {
                            pushFollow(FOLLOW_factor_in_term673);
                            f=factor();

                            state._fsp--;
                            if (state.failed) return exp;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                             exp =new OperatorExpression(getPos(exp),exp);
                             ((OperatorExpression)exp).add(getText(o),getPos(o),f);
                              if(f==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText(o),getPos(o));
                           
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:4: ( ( factor_op )=> (o= factor_op ) (f= factor )? )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ASTERISK) && (synpred7_DnaSqlQuery())) {
                            alt15=1;
                        }
                        else if ( (LA15_0==SOLIDUS) && (synpred7_DnaSqlQuery())) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:6: ( factor_op )=> (o= factor_op ) (f= factor )?
                    	    {
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:19: (o= factor_op )
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:20: o= factor_op
                    	    {
                    	    pushFollow(FOLLOW_factor_op_in_term696);
                    	    o=factor_op();

                    	    state._fsp--;
                    	    if (state.failed) return exp;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      f=null;
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:43: (f= factor )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==APPROXIMATE_NUM_LIT||LA14_0==ARGUMENT_ID||LA14_0==BYTES||LA14_0==DATE||LA14_0==GUID||LA14_0==REGULAR_ID||LA14_0==LEFT_PAREN||(LA14_0>=COUNT && LA14_0<=MIN)||(LA14_0>=H_LV && LA14_0<=H_AID)||(LA14_0>=COALESCE && LA14_0<=CASE)||(LA14_0>=TRUE && LA14_0<=EXACT_NUM_LIT)||LA14_0==DELIMITED_ID||LA14_0==DATA||LA14_0==LENGTH||(LA14_0>=MORE && LA14_0<=NAME)||LA14_0==NULLABLE||LA14_0==NUMBER||LA14_0==REPEATABLE||LA14_0==SCALE||LA14_0==SERIALIZABLE||(LA14_0>=TYPE && LA14_0<=UNCOMMITTED)||LA14_0==UNNAMED) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==MINUS_SIGN) ) {
                    	        switch ( input.LA(2) ) {
                    	            case UNSIGNED_INTEGER:
                    	                {
                    	                alt14=1;
                    	                }
                    	                break;
                    	            case EXACT_NUM_LIT:
                    	                {
                    	                alt14=1;
                    	                }
                    	                break;
                    	            case APPROXIMATE_NUM_LIT:
                    	                {
                    	                alt14=1;
                    	                }
                    	                break;
                    	        }

                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:44: f= factor
                    	            {
                    	            pushFollow(FOLLOW_factor_in_term704);
                    	            f=factor();

                    	            state._fsp--;
                    	            if (state.failed) return exp;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	             ((OperatorExpression)exp).add(getText(o),getPos(o),f);
                    	              if(f==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after "+getText(o),getPos(o));
                    	           
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor_op"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:248:1: factor_op returns [Token op=null] : (o= ASTERISK | o= SOLIDUS );
    public final Token factor_op() throws RecognitionException {
        Token op = null;

        Token o=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:249:3: (o= ASTERISK | o= SOLIDUS )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASTERISK) ) {
                alt17=1;
            }
            else if ( (LA17_0==SOLIDUS) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:249:5: o= ASTERISK
                    {
                    o=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_factor_op741); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =o; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:250:5: o= SOLIDUS
                    {
                    o=(Token)match(input,SOLIDUS,FOLLOW_SOLIDUS_in_factor_op754); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =o; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "factor_op"


    // $ANTLR start "factor"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:253:1: factor returns [ValueExpression exp=null] : p= value_exp_primary ;
    public final ValueExpression factor() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression p = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:253:41: (p= value_exp_primary )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:254:17: p= value_exp_primary
            {
            pushFollow(FOLLOW_value_exp_primary_in_factor780);
            p=value_exp_primary();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =p; /* if(s!=null) exp.updatePosition(getPos($s.sign));*/ 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "factor"


    // $ANTLR start "sign"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:259:1: sign returns [Token op=null] : (s= PLUS_SIGN | s= MINUS_SIGN );
    public final Token sign() throws RecognitionException {
        Token op = null;

        Token s=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:260:3: (s= PLUS_SIGN | s= MINUS_SIGN )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PLUS_SIGN) ) {
                alt18=1;
            }
            else if ( (LA18_0==MINUS_SIGN) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:260:5: s= PLUS_SIGN
                    {
                    s=(Token)match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_sign809); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =s; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:261:5: s= MINUS_SIGN
                    {
                    s=(Token)match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_sign821); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                       op =s; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "sign"


    // $ANTLR start "value_exp_primary"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:264:1: value_exp_primary returns [ValueExpression exp=null] : (e= set_fct_spec | c= case_exp | h= hierarchy_fun_spec | f= function_spec | o= column_ref | u= unsigned_value_spec | ( LEFT_PAREN )=> (l= LEFT_PAREN ) v= value_exp r= RIGHT_PAREN );
    public final ValueExpression value_exp_primary() throws RecognitionException {
        ValueExpression exp = null;

        Token l=null;
        Token r=null;
        ColumnCallExpression e = null;

        CaseExpression c = null;

        HierarchyFunCallExpression h = null;

        FunctionCallExpression f = null;

        ColumnReference o = null;

        ValueExpression u = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:265:3: (e= set_fct_spec | c= case_exp | h= hierarchy_fun_spec | f= function_spec | o= column_ref | u= unsigned_value_spec | ( LEFT_PAREN )=> (l= LEFT_PAREN ) v= value_exp r= RIGHT_PAREN )
            int alt19=7;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:265:5: e= set_fct_spec
                    {
                    pushFollow(FOLLOW_set_fct_spec_in_value_exp_primary840);
                    e=set_fct_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =e; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:266:5: c= case_exp
                    {
                    pushFollow(FOLLOW_case_exp_in_value_exp_primary853);
                    c=case_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =c; 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:267:5: h= hierarchy_fun_spec
                    {
                    pushFollow(FOLLOW_hierarchy_fun_spec_in_value_exp_primary870);
                    h=hierarchy_fun_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =h; 
                    }

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:268:5: f= function_spec
                    {
                    pushFollow(FOLLOW_function_spec_in_value_exp_primary881);
                    f=function_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =f; 
                    }

                    }
                    break;
                case 5 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:269:5: o= column_ref
                    {
                    pushFollow(FOLLOW_column_ref_in_value_exp_primary893);
                    o=column_ref();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =o; 
                    }

                    }
                    break;
                case 6 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:270:5: u= unsigned_value_spec
                    {
                    pushFollow(FOLLOW_unsigned_value_spec_in_value_exp_primary908);
                    u=unsigned_value_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =u; 
                    }

                    }
                    break;
                case 7 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:272:5: ( LEFT_PAREN )=> (l= LEFT_PAREN ) v= value_exp r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:272:20: (l= LEFT_PAREN )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:272:21: l= LEFT_PAREN
                    {
                    l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_value_exp_primary926); if (state.failed) return exp;

                    }

                    pushFollow(FOLLOW_value_exp_in_value_exp_primary931);
                    v=value_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_value_exp_primary935); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ParenValueExpression(getPos(l,r),v); 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "value_exp_primary"


    // $ANTLR start "set_fct_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:275:1: set_fct_spec returns [ColumnCallExpression exp=null] : (f= COUNT LEFT_PAREN (a= ASTERISK | (q= set_quantifier )? e= value_exp ) r= RIGHT_PAREN | (f= AVG | f= SUM ) LEFT_PAREN (q= set_quantifier )? e= value_exp r= RIGHT_PAREN | (f= MAX | f= MIN ) LEFT_PAREN e= value_exp r= RIGHT_PAREN );
    public final ColumnCallExpression set_fct_spec() throws RecognitionException {
        ColumnCallExpression exp = null;

        Token f=null;
        Token a=null;
        Token r=null;
        boolean q = false;

        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:275:52: (f= COUNT LEFT_PAREN (a= ASTERISK | (q= set_quantifier )? e= value_exp ) r= RIGHT_PAREN | (f= AVG | f= SUM ) LEFT_PAREN (q= set_quantifier )? e= value_exp r= RIGHT_PAREN | (f= MAX | f= MIN ) LEFT_PAREN e= value_exp r= RIGHT_PAREN )
            int alt25=3;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt25=1;
                }
                break;
            case AVG:
            case SUM:
                {
                alt25=2;
                }
                break;
            case MAX:
            case MIN:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:276:4: f= COUNT LEFT_PAREN (a= ASTERISK | (q= set_quantifier )? e= value_exp ) r= RIGHT_PAREN
                    {
                    f=(Token)match(input,COUNT,FOLLOW_COUNT_in_set_fct_spec961); if (state.failed) return exp;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_set_fct_spec963); if (state.failed) return exp;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:277:8: (a= ASTERISK | (q= set_quantifier )? e= value_exp )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ASTERISK) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==APPROXIMATE_NUM_LIT||LA21_0==MINUS_SIGN||LA21_0==ARGUMENT_ID||LA21_0==BYTES||LA21_0==DATE||LA21_0==GUID||LA21_0==REGULAR_ID||LA21_0==LEFT_PAREN||(LA21_0>=COUNT && LA21_0<=H_AID)||(LA21_0>=COALESCE && LA21_0<=CASE)||(LA21_0>=TRUE && LA21_0<=EXACT_NUM_LIT)||LA21_0==DELIMITED_ID||LA21_0==DATA||LA21_0==LENGTH||(LA21_0>=MORE && LA21_0<=NAME)||LA21_0==NULLABLE||LA21_0==NUMBER||LA21_0==REPEATABLE||LA21_0==SCALE||LA21_0==SERIALIZABLE||(LA21_0>=TYPE && LA21_0<=UNCOMMITTED)||LA21_0==UNNAMED) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return exp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:277:10: a= ASTERISK
                            {
                            a=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_set_fct_spec976); if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                              exp =new ColumnCallExpression(getPos(f),(f!=null?f.getText():null),getPos(a));
                            }

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:278:10: (q= set_quantifier )? e= value_exp
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:278:10: (q= set_quantifier )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=DISTINCT && LA20_0<=ALL)) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:278:11: q= set_quantifier
                                    {
                                    pushFollow(FOLLOW_set_quantifier_in_set_fct_spec993);
                                    q=set_quantifier();

                                    state._fsp--;
                                    if (state.failed) return exp;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_value_exp_in_set_fct_spec999);
                            e=value_exp();

                            state._fsp--;
                            if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                               exp =new ColumnCallExpression(getPos(f),(f!=null?f.getText():null), q,e,getPos(e)); 
                            }

                            }
                            break;

                    }

                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_set_fct_spec1014); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp.updatePosition(getPos(r)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:280:5: (f= AVG | f= SUM ) LEFT_PAREN (q= set_quantifier )? e= value_exp r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:280:5: (f= AVG | f= SUM )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AVG) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==SUM) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return exp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:280:7: f= AVG
                            {
                            f=(Token)match(input,AVG,FOLLOW_AVG_in_set_fct_spec1027); if (state.failed) return exp;

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:281:7: f= SUM
                            {
                            f=(Token)match(input,SUM,FOLLOW_SUM_in_set_fct_spec1037); if (state.failed) return exp;

                            }
                            break;

                    }

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_set_fct_spec1041); if (state.failed) return exp;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:281:26: (q= set_quantifier )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=DISTINCT && LA23_0<=ALL)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:281:27: q= set_quantifier
                            {
                            pushFollow(FOLLOW_set_quantifier_in_set_fct_spec1046);
                            q=set_quantifier();

                            state._fsp--;
                            if (state.failed) return exp;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_value_exp_in_set_fct_spec1052);
                    e=value_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_set_fct_spec1056); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ColumnCallExpression(getPos(f),(f!=null?f.getText():null), q,e,getPos(r));  
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:283:5: (f= MAX | f= MIN ) LEFT_PAREN e= value_exp r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:283:5: (f= MAX | f= MIN )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==MAX) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==MIN) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return exp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:283:7: f= MAX
                            {
                            f=(Token)match(input,MAX,FOLLOW_MAX_in_set_fct_spec1074); if (state.failed) return exp;

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:284:7: f= MIN
                            {
                            f=(Token)match(input,MIN,FOLLOW_MIN_in_set_fct_spec1085); if (state.failed) return exp;

                            }
                            break;

                    }

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_set_fct_spec1089); if (state.failed) return exp;
                    pushFollow(FOLLOW_value_exp_in_set_fct_spec1094);
                    e=value_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_set_fct_spec1098); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ColumnCallExpression(getPos(f),(f!=null?f.getText():null), false,e,getPos(r));  
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "set_fct_spec"


    // $ANTLR start "set_quantifier"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:288:1: set_quantifier returns [boolean dist=false] : ( DISTINCT | ALL );
    public final boolean set_quantifier() throws RecognitionException {
        boolean dist = false;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:289:3: ( DISTINCT | ALL )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DISTINCT) ) {
                alt26=1;
            }
            else if ( (LA26_0==ALL) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dist;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:289:5: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_set_quantifier1120); if (state.failed) return dist;
                    if ( state.backtracking==0 ) {
                       dist =true; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:290:5: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_set_quantifier1128); if (state.failed) return dist;
                    if ( state.backtracking==0 ) {
                       dist =false; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return dist;
    }
    // $ANTLR end "set_quantifier"


    // $ANTLR start "hierarchy_fun_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:293:1: hierarchy_fun_spec returns [HierarchyFunCallExpression exp=null] : ( ( H_LV )=> (f= H_LV ) LEFT_PAREN t= table_ref_ref PERIOD h= id r= RIGHT_PAREN | ( H_AID )=> (f= H_AID ) LEFT_PAREN t= table_ref_ref PERIOD h= id ( (o= REL | o= ABO ) v= value_exp )? r= RIGHT_PAREN );
    public final HierarchyFunCallExpression hierarchy_fun_spec() throws RecognitionException {
        HierarchyFunCallExpression exp = null;

        Token f=null;
        Token r=null;
        Token o=null;
        TableRefReference t = null;

        Token h = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:3: ( ( H_LV )=> (f= H_LV ) LEFT_PAREN t= table_ref_ref PERIOD h= id r= RIGHT_PAREN | ( H_AID )=> (f= H_AID ) LEFT_PAREN t= table_ref_ref PERIOD h= id ( (o= REL | o= ABO ) v= value_exp )? r= RIGHT_PAREN )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==H_LV) && (synpred9_DnaSqlQuery())) {
                alt29=1;
            }
            else if ( (LA29_0==H_AID) && (synpred10_DnaSqlQuery())) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:6: ( H_LV )=> (f= H_LV ) LEFT_PAREN t= table_ref_ref PERIOD h= id r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:15: (f= H_LV )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:16: f= H_LV
                    {
                    f=(Token)match(input,H_LV,FOLLOW_H_LV_in_hierarchy_fun_spec1154); if (state.failed) return exp;

                    }

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_hierarchy_fun_spec1157); if (state.failed) return exp;
                    pushFollow(FOLLOW_table_ref_ref_in_hierarchy_fun_spec1167);
                    t=table_ref_ref();

                    state._fsp--;
                    if (state.failed) return exp;
                    match(input,PERIOD,FOLLOW_PERIOD_in_hierarchy_fun_spec1169); if (state.failed) return exp;
                    pushFollow(FOLLOW_id_in_hierarchy_fun_spec1173);
                    h=id();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new HierarchyFunCallExpression(getPos(f),(f!=null?f.getText():null),t,getText(h),getPos(h)); 
                    }
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_hierarchy_fun_spec1191); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp.updatePosition(getPos(r)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:298:6: ( H_AID )=> (f= H_AID ) LEFT_PAREN t= table_ref_ref PERIOD h= id ( (o= REL | o= ABO ) v= value_exp )? r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:298:15: (f= H_AID )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:298:16: f= H_AID
                    {
                    f=(Token)match(input,H_AID,FOLLOW_H_AID_in_hierarchy_fun_spec1207); if (state.failed) return exp;

                    }

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_hierarchy_fun_spec1209); if (state.failed) return exp;
                    pushFollow(FOLLOW_table_ref_ref_in_hierarchy_fun_spec1219);
                    t=table_ref_ref();

                    state._fsp--;
                    if (state.failed) return exp;
                    match(input,PERIOD,FOLLOW_PERIOD_in_hierarchy_fun_spec1221); if (state.failed) return exp;
                    pushFollow(FOLLOW_id_in_hierarchy_fun_spec1225);
                    h=id();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new HierarchyFunCallExpression(getPos(f),(f!=null?f.getText():null),t,getText(h),getPos(h)); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:301:9: ( (o= REL | o= ABO ) v= value_exp )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=REL && LA28_0<=ABO)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:301:10: (o= REL | o= ABO ) v= value_exp
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:301:10: (o= REL | o= ABO )
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==REL) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==ABO) ) {
                                alt27=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return exp;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 0, input);

                                throw nvae;
                            }
                            switch (alt27) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:301:11: o= REL
                                    {
                                    o=(Token)match(input,REL,FOLLOW_REL_in_hierarchy_fun_spec1247); if (state.failed) return exp;

                                    }
                                    break;
                                case 2 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:301:17: o= ABO
                                    {
                                    o=(Token)match(input,ABO,FOLLOW_ABO_in_hierarchy_fun_spec1251); if (state.failed) return exp;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_value_exp_in_hierarchy_fun_spec1256);
                            v=value_exp();

                            state._fsp--;
                            if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                               
                                          if(v!=null) {
                                            v.setUpperOperator(getTokenNode(o));
                                            exp.setPrimary(v,null);
                                          } else {
                                            exp.updatePosition(getPos(o));
                                          }
                                        
                            }

                            }
                            break;

                    }

                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_hierarchy_fun_spec1290); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp.updatePosition(getPos(r)); 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "hierarchy_fun_spec"


    // $ANTLR start "function_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:314:1: function_spec returns [FunctionCallExpression exp=null] : f= function_name LEFT_PAREN (p= function_parameter (c= COMMA (p= function_parameter )? )* )? r= RIGHT_PAREN ;
    public final FunctionCallExpression function_spec() throws RecognitionException {
        FunctionCallExpression exp = null;

        Token c=null;
        Token r=null;
        Token f = null;

        IFunctionParameter p = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:315:3: (f= function_name LEFT_PAREN (p= function_parameter (c= COMMA (p= function_parameter )? )* )? r= RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:315:5: f= function_name LEFT_PAREN (p= function_parameter (c= COMMA (p= function_parameter )? )* )? r= RIGHT_PAREN
            {
            pushFollow(FOLLOW_function_name_in_function_spec1310);
            f=function_name();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =new FunctionCallExpression(getPos(f),getText(f)); 
            }
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_spec1317); if (state.failed) return exp;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:317:4: (p= function_parameter (c= COMMA (p= function_parameter )? )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==APPROXIMATE_NUM_LIT||LA32_0==MINUS_SIGN||LA32_0==ARGUMENT_ID||LA32_0==BYTES||LA32_0==DATE||LA32_0==GUID||LA32_0==REGULAR_ID||LA32_0==LEFT_PAREN||(LA32_0>=COUNT && LA32_0<=MIN)||(LA32_0>=H_LV && LA32_0<=H_AID)||(LA32_0>=COALESCE && LA32_0<=CASE)||(LA32_0>=TRUE && LA32_0<=EXACT_NUM_LIT)||LA32_0==DELIMITED_ID||LA32_0==DATA||LA32_0==LENGTH||(LA32_0>=MORE && LA32_0<=NAME)||LA32_0==NULLABLE||LA32_0==NUMBER||LA32_0==REPEATABLE||LA32_0==SCALE||LA32_0==SERIALIZABLE||(LA32_0>=TYPE && LA32_0<=UNCOMMITTED)||LA32_0==UNNAMED) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:318:9: p= function_parameter (c= COMMA (p= function_parameter )? )*
                    {
                    pushFollow(FOLLOW_function_parameter_in_function_spec1334);
                    p=function_parameter();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp.add(p); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:319:9: (c= COMMA (p= function_parameter )? )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==COMMA) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:319:10: c= COMMA (p= function_parameter )?
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_spec1349); if (state.failed) return exp;
                    	    if ( state.backtracking==0 ) {
                    	      p=null;
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:319:29: (p= function_parameter )?
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( (LA30_0==APPROXIMATE_NUM_LIT||LA30_0==MINUS_SIGN||LA30_0==ARGUMENT_ID||LA30_0==BYTES||LA30_0==DATE||LA30_0==GUID||LA30_0==REGULAR_ID||LA30_0==LEFT_PAREN||(LA30_0>=COUNT && LA30_0<=MIN)||(LA30_0>=H_LV && LA30_0<=H_AID)||(LA30_0>=COALESCE && LA30_0<=CASE)||(LA30_0>=TRUE && LA30_0<=EXACT_NUM_LIT)||LA30_0==DELIMITED_ID||LA30_0==DATA||LA30_0==LENGTH||(LA30_0>=MORE && LA30_0<=NAME)||LA30_0==NULLABLE||LA30_0==NUMBER||LA30_0==REPEATABLE||LA30_0==SCALE||LA30_0==SERIALIZABLE||(LA30_0>=TYPE && LA30_0<=UNCOMMITTED)||LA30_0==UNNAMED) ) {
                    	        alt30=1;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:319:30: p= function_parameter
                    	            {
                    	            pushFollow(FOLLOW_function_parameter_in_function_spec1357);
                    	            p=function_parameter();

                    	            state._fsp--;
                    	            if (state.failed) return exp;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       if(p!=null) {
                    	                        exp.add(p);
                    	                    } else {
                    	                        exp.add(null);
                    	                        reportError(ParseWarningKinds.KIND_UGLY_PARAMETER_LIST,"unwanted comma here",getPos(c));
                    	                    }
                    	                  
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_spec1399); if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp.updatePosition(getPos(r)); 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "function_spec"


    // $ANTLR start "function_name"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:332:1: function_name returns [Token name=null] : t= id ;
    public final Token function_name() throws RecognitionException {
        Token name = null;

        Token t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:333:3: (t= id )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:333:5: t= id
            {
            pushFollow(FOLLOW_id_in_function_name1422);
            t=id();

            state._fsp--;
            if (state.failed) return name;
            if ( state.backtracking==0 ) {
               name = t; 
            }

            }

        }

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
        finally {
        }
        return name;
    }
    // $ANTLR end "function_name"


    // $ANTLR start "function_parameter"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:336:1: function_parameter returns [IFunctionParameter para=null] : (e= value_exp | t= table_ref_ref );
    public final IFunctionParameter function_parameter() throws RecognitionException {
        IFunctionParameter para = null;

        ValueExpression e = null;

        TableRefReference t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:337:3: (e= value_exp | t= table_ref_ref )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:337:5: e= value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_function_parameter1444);
                    e=value_exp();

                    state._fsp--;
                    if (state.failed) return para;
                    if ( state.backtracking==0 ) {
                       para =e; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:338:5: t= table_ref_ref
                    {
                    pushFollow(FOLLOW_table_ref_ref_in_function_parameter1456);
                    t=table_ref_ref();

                    state._fsp--;
                    if (state.failed) return para;
                    if ( state.backtracking==0 ) {
                       para =t; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return para;
    }
    // $ANTLR end "function_parameter"


    // $ANTLR start "case_exp"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:341:1: case_exp returns [CaseExpression exp=null] : (c= case_abbreviation | c= case_spec );
    public final CaseExpression case_exp() throws RecognitionException {
        CaseExpression exp = null;

        CaseExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:342:3: (c= case_abbreviation | c= case_spec )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COALESCE) ) {
                alt34=1;
            }
            else if ( (LA34_0==CASE) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:342:5: c= case_abbreviation
                    {
                    pushFollow(FOLLOW_case_abbreviation_in_case_exp1481);
                    c=case_abbreviation();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =c; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:343:5: c= case_spec
                    {
                    pushFollow(FOLLOW_case_spec_in_case_exp1491);
                    c=case_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =c; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "case_exp"


    // $ANTLR start "case_abbreviation"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:346:1: case_abbreviation returns [CaseExpression exp=null] : ( COALESCE )=> (c= COALESCE ) LEFT_PAREN e= value_exp ( COMMA e= value_exp )* r= RIGHT_PAREN ;
    public final CaseExpression case_abbreviation() throws RecognitionException {
        CaseExpression exp = null;

        Token c=null;
        Token r=null;
        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:347:3: ( ( COALESCE )=> (c= COALESCE ) LEFT_PAREN e= value_exp ( COMMA e= value_exp )* r= RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:347:5: ( COALESCE )=> (c= COALESCE ) LEFT_PAREN e= value_exp ( COMMA e= value_exp )* r= RIGHT_PAREN
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:347:17: (c= COALESCE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:347:18: c= COALESCE
            {
            c=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_case_abbreviation1517); if (state.failed) return exp;

            }

            if ( state.backtracking==0 ) {
               exp =new CaseExpression(getPos(c),(c!=null?c.getText():null)); 
            }
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_case_abbreviation1527); if (state.failed) return exp;
            pushFollow(FOLLOW_value_exp_in_case_abbreviation1531);
            e=value_exp();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp.add(e); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:348:50: ( COMMA e= value_exp )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:348:51: COMMA e= value_exp
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_case_abbreviation1536); if (state.failed) return exp;
            	    pushFollow(FOLLOW_value_exp_in_case_abbreviation1540);
            	    e=value_exp();

            	    state._fsp--;
            	    if (state.failed) return exp;
            	    if ( state.backtracking==0 ) {
            	       exp.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_case_abbreviation1554); if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp.updatePosition(getPos(r)); 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "case_abbreviation"


    // $ANTLR start "case_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:352:1: case_spec returns [CaseExpression exp=null] : ( CASE )=> (c= CASE ) ( ( WHEN )=> () ( WHEN ce= condition_exp THEN e= result )+ | e= value_exp ( WHEN e= value_exp THEN e= result )+ ) ( ELSE e= result )? d= END ;
    public final CaseExpression case_spec() throws RecognitionException {
        CaseExpression exp = null;

        Token c=null;
        Token d=null;
        ConditionExpression ce = null;

        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:353:3: ( ( CASE )=> (c= CASE ) ( ( WHEN )=> () ( WHEN ce= condition_exp THEN e= result )+ | e= value_exp ( WHEN e= value_exp THEN e= result )+ ) ( ELSE e= result )? d= END )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:353:5: ( CASE )=> (c= CASE ) ( ( WHEN )=> () ( WHEN ce= condition_exp THEN e= result )+ | e= value_exp ( WHEN e= value_exp THEN e= result )+ ) ( ELSE e= result )? d= END
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:353:13: (c= CASE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:353:14: c= CASE
            {
            c=(Token)match(input,CASE,FOLLOW_CASE_in_case_spec1577); if (state.failed) return exp;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:3: ( ( WHEN )=> () ( WHEN ce= condition_exp THEN e= result )+ | e= value_exp ( WHEN e= value_exp THEN e= result )+ )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WHEN) && (synpred13_DnaSqlQuery())) {
                alt38=1;
            }
            else if ( (LA38_0==APPROXIMATE_NUM_LIT||LA38_0==MINUS_SIGN||LA38_0==ARGUMENT_ID||LA38_0==BYTES||LA38_0==DATE||LA38_0==GUID||LA38_0==REGULAR_ID||LA38_0==LEFT_PAREN||(LA38_0>=COUNT && LA38_0<=MIN)||(LA38_0>=H_LV && LA38_0<=H_AID)||(LA38_0>=COALESCE && LA38_0<=CASE)||(LA38_0>=TRUE && LA38_0<=EXACT_NUM_LIT)||LA38_0==DELIMITED_ID||LA38_0==DATA||LA38_0==LENGTH||(LA38_0>=MORE && LA38_0<=NAME)||LA38_0==NULLABLE||LA38_0==NUMBER||LA38_0==REPEATABLE||LA38_0==SCALE||LA38_0==SERIALIZABLE||(LA38_0>=TYPE && LA38_0<=UNCOMMITTED)||LA38_0==UNNAMED) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:5: ( WHEN )=> () ( WHEN ce= condition_exp THEN e= result )+
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:13: ()
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:14: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                       exp =new CaseExpression(getPos(c),CaseExpression.OPERATOR_CASE_SEARCH); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:355:5: ( WHEN ce= condition_exp THEN e= result )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==WHEN) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:355:6: WHEN ce= condition_exp THEN e= result
                    	    {
                    	    match(input,WHEN,FOLLOW_WHEN_in_case_spec1598); if (state.failed) return exp;
                    	    pushFollow(FOLLOW_condition_exp_in_case_spec1602);
                    	    ce=condition_exp();

                    	    state._fsp--;
                    	    if (state.failed) return exp;
                    	    if ( state.backtracking==0 ) {
                    	       exp.add(ce); 
                    	    }
                    	    match(input,THEN,FOLLOW_THEN_in_case_spec1607); if (state.failed) return exp;
                    	    pushFollow(FOLLOW_result_in_case_spec1611);
                    	    e=result();

                    	    state._fsp--;
                    	    if (state.failed) return exp;
                    	    if ( state.backtracking==0 ) {
                    	       exp.add(e); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return exp;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:357:5: e= value_exp ( WHEN e= value_exp THEN e= result )+
                    {
                    pushFollow(FOLLOW_value_exp_in_case_spec1629);
                    e=value_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new CaseExpression(getPos(c),CaseExpression.OPERATOR_CASE_NORMAL,e); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:358:5: ( WHEN e= value_exp THEN e= result )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==WHEN) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:358:6: WHEN e= value_exp THEN e= result
                    	    {
                    	    match(input,WHEN,FOLLOW_WHEN_in_case_spec1638); if (state.failed) return exp;
                    	    pushFollow(FOLLOW_value_exp_in_case_spec1642);
                    	    e=value_exp();

                    	    state._fsp--;
                    	    if (state.failed) return exp;
                    	    if ( state.backtracking==0 ) {
                    	       exp.add(e); 
                    	    }
                    	    match(input,THEN,FOLLOW_THEN_in_case_spec1647); if (state.failed) return exp;
                    	    pushFollow(FOLLOW_result_in_case_spec1651);
                    	    e=result();

                    	    state._fsp--;
                    	    if (state.failed) return exp;
                    	    if ( state.backtracking==0 ) {
                    	       exp.add(e); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return exp;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:360:5: ( ELSE e= result )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ELSE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:360:6: ELSE e= result
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_case_spec1668); if (state.failed) return exp;
                    pushFollow(FOLLOW_result_in_case_spec1672);
                    e=result();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp.add(e); 
                    }

                    }
                    break;

            }

            d=(Token)match(input,END,FOLLOW_END_in_case_spec1687); if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp.updatePosition(getPos(d)); 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "case_spec"


    // $ANTLR start "result"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:364:1: result returns [ValueExpression exp=null] : e= row_value_constructor ;
    public final ValueExpression result() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:364:41: (e= row_value_constructor )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:365:5: e= row_value_constructor
            {
            pushFollow(FOLLOW_row_value_constructor_in_result1710);
            e=row_value_constructor();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =e; 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "result"


    // $ANTLR start "unsigned_value_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:368:1: unsigned_value_spec returns [ValueExpression exp=null] : (e= constant_exp | a= argument_spec );
    public final ValueExpression unsigned_value_spec() throws RecognitionException {
        ValueExpression exp = null;

        ConstantExpression e = null;

        ArgumentReference a = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:369:3: (e= constant_exp | a= argument_spec )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==APPROXIMATE_NUM_LIT||LA40_0==MINUS_SIGN||LA40_0==BYTES||LA40_0==DATE||LA40_0==GUID||(LA40_0>=TRUE && LA40_0<=EXACT_NUM_LIT)) ) {
                alt40=1;
            }
            else if ( (LA40_0==ARGUMENT_ID) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:369:5: e= constant_exp
                    {
                    pushFollow(FOLLOW_constant_exp_in_unsigned_value_spec1728);
                    e=constant_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =e; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:370:5: a= argument_spec
                    {
                    pushFollow(FOLLOW_argument_spec_in_unsigned_value_spec1738);
                    a=argument_spec();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =a; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "unsigned_value_spec"


    // $ANTLR start "constant_exp"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:373:1: constant_exp returns [ConstantExpression exp=null] : ( ( ( TRUE )=> (t= TRUE ) ) | ( ( FALSE )=> (t= FALSE ) ) | ( DATE )=> (t= DATE ) c= CHAR_STRING | ( GUID )=> (t= GUID ) c= CHAR_STRING | ( BYTES )=> (t= BYTES ) c= CHAR_STRING | ( ( MINUS_SIGN )=> (s= MINUS_SIGN ) )? (c= UNSIGNED_INTEGER | c= EXACT_NUM_LIT | c= APPROXIMATE_NUM_LIT ) | c= CHAR_STRING );
    public final ConstantExpression constant_exp() throws RecognitionException {
        ConstantExpression exp = null;

        Token t=null;
        Token c=null;
        Token s=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:3: ( ( ( TRUE )=> (t= TRUE ) ) | ( ( FALSE )=> (t= FALSE ) ) | ( DATE )=> (t= DATE ) c= CHAR_STRING | ( GUID )=> (t= GUID ) c= CHAR_STRING | ( BYTES )=> (t= BYTES ) c= CHAR_STRING | ( ( MINUS_SIGN )=> (s= MINUS_SIGN ) )? (c= UNSIGNED_INTEGER | c= EXACT_NUM_LIT | c= APPROXIMATE_NUM_LIT ) | c= CHAR_STRING )
            int alt43=7;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==TRUE) && (synpred14_DnaSqlQuery())) {
                alt43=1;
            }
            else if ( (LA43_0==FALSE) && (synpred15_DnaSqlQuery())) {
                alt43=2;
            }
            else if ( (LA43_0==DATE) && (synpred16_DnaSqlQuery())) {
                alt43=3;
            }
            else if ( (LA43_0==GUID) && (synpred17_DnaSqlQuery())) {
                alt43=4;
            }
            else if ( (LA43_0==BYTES) && (synpred18_DnaSqlQuery())) {
                alt43=5;
            }
            else if ( (LA43_0==APPROXIMATE_NUM_LIT||LA43_0==MINUS_SIGN||(LA43_0>=UNSIGNED_INTEGER && LA43_0<=EXACT_NUM_LIT)) ) {
                alt43=6;
            }
            else if ( (LA43_0==CHAR_STRING) ) {
                alt43=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:4: ( ( TRUE )=> (t= TRUE ) )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:4: ( ( TRUE )=> (t= TRUE ) )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:5: ( TRUE )=> (t= TRUE )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:13: (t= TRUE )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:14: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_constant_exp1765); if (state.failed) return exp;

                    }


                    }

                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(t),(t!=null?t.getText():null),LiteralKinds.KIND_BOOLEAN); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:5: ( ( FALSE )=> (t= FALSE ) )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:5: ( ( FALSE )=> (t= FALSE ) )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:6: ( FALSE )=> (t= FALSE )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:15: (t= FALSE )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:16: t= FALSE
                    {
                    t=(Token)match(input,FALSE,FOLLOW_FALSE_in_constant_exp1787); if (state.failed) return exp;

                    }


                    }

                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(t),(t!=null?t.getText():null),LiteralKinds.KIND_BOOLEAN); 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:378:5: ( DATE )=> (t= DATE ) c= CHAR_STRING
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:378:13: (t= DATE )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:378:14: t= DATE
                    {
                    t=(Token)match(input,DATE,FOLLOW_DATE_in_constant_exp1808); if (state.failed) return exp;

                    }

                    c=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_constant_exp1813); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(c),transferString((c!=null?c.getText():null)),LiteralKinds.KIND_DATE);
                            exp.updatePosition(getPos(t));
                          
                    }

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:382:5: ( GUID )=> (t= GUID ) c= CHAR_STRING
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:382:13: (t= GUID )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:382:14: t= GUID
                    {
                    t=(Token)match(input,GUID,FOLLOW_GUID_in_constant_exp1835); if (state.failed) return exp;

                    }

                    c=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_constant_exp1840); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(c),transferString((c!=null?c.getText():null)),LiteralKinds.KIND_GUID);
                            exp.updatePosition(getPos(t));
                          
                    }

                    }
                    break;
                case 5 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:386:5: ( BYTES )=> (t= BYTES ) c= CHAR_STRING
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:386:14: (t= BYTES )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:386:15: t= BYTES
                    {
                    t=(Token)match(input,BYTES,FOLLOW_BYTES_in_constant_exp1862); if (state.failed) return exp;

                    }

                    c=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_constant_exp1867); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(c),transferString((c!=null?c.getText():null)),LiteralKinds.KIND_BYTES); 
                            exp.updatePosition(getPos(t));
                          
                    }

                    }
                    break;
                case 6 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:5: ( ( MINUS_SIGN )=> (s= MINUS_SIGN ) )? (c= UNSIGNED_INTEGER | c= EXACT_NUM_LIT | c= APPROXIMATE_NUM_LIT )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:5: ( ( MINUS_SIGN )=> (s= MINUS_SIGN ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==MINUS_SIGN) && (synpred19_DnaSqlQuery())) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:6: ( MINUS_SIGN )=> (s= MINUS_SIGN )
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:20: (s= MINUS_SIGN )
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:21: s= MINUS_SIGN
                            {
                            s=(Token)match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_constant_exp1888); if (state.failed) return exp;

                            }


                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:391:5: (c= UNSIGNED_INTEGER | c= EXACT_NUM_LIT | c= APPROXIMATE_NUM_LIT )
                    int alt42=3;
                    switch ( input.LA(1) ) {
                    case UNSIGNED_INTEGER:
                        {
                        alt42=1;
                        }
                        break;
                    case EXACT_NUM_LIT:
                        {
                        alt42=2;
                        }
                        break;
                    case APPROXIMATE_NUM_LIT:
                        {
                        alt42=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return exp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:391:7: c= UNSIGNED_INTEGER
                            {
                            c=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant_exp1901); if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                               exp =new ConstantExpression(getPos(c),s==null?(c!=null?c.getText():null):s.getText()+(c!=null?c.getText():null),LiteralKinds.KIND_INTEGER); 
                            }

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:392:7: c= EXACT_NUM_LIT
                            {
                            c=(Token)match(input,EXACT_NUM_LIT,FOLLOW_EXACT_NUM_LIT_in_constant_exp1918); if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                               exp =new ConstantExpression(getPos(c),s==null?(c!=null?c.getText():null):s.getText()+(c!=null?c.getText():null),LiteralKinds.KIND_FLOAT); 
                            }

                            }
                            break;
                        case 3 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:393:7: c= APPROXIMATE_NUM_LIT
                            {
                            c=(Token)match(input,APPROXIMATE_NUM_LIT,FOLLOW_APPROXIMATE_NUM_LIT_in_constant_exp1938); if (state.failed) return exp;
                            if ( state.backtracking==0 ) {
                               exp =new ConstantExpression(getPos(c),s==null?(c!=null?c.getText():null):s.getText()+(c!=null?c.getText():null),LiteralKinds.KIND_FLOAT); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:395:5: c= CHAR_STRING
                    {
                    c=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_constant_exp1956); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new ConstantExpression(getPos(c),transferString((c!=null?c.getText():null)),LiteralKinds.KIND_STRING); 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "constant_exp"


    // $ANTLR start "argument_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:398:1: argument_spec returns [ArgumentReference exp=null] : a= ARGUMENT_ID ;
    public final ArgumentReference argument_spec() throws RecognitionException {
        ArgumentReference exp = null;

        Token a=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:399:3: (a= ARGUMENT_ID )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:399:5: a= ARGUMENT_ID
            {
            a=(Token)match(input,ARGUMENT_ID,FOLLOW_ARGUMENT_ID_in_argument_spec1986); if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =new ArgumentReference(getPos(a),(a!=null?a.getText():null));
                  String name=(a!=null?a.getText():null);
                  if(name==null||name.length()<=1)
                     reportError(ParseWarningKinds.KIND_EMPTY_ARGUMENT_NAME,"empty argument name",getPos(a)); 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "argument_spec"


    // $ANTLR start "condition_exp"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:410:1: condition_exp returns [ConditionExpression ce=null] : pc= condition_term ( ( OR )=> (o= OR ) (c= condition_term )? ( ( OR )=> (o= OR ) (c= condition_term )? )* )? ;
    public final ConditionExpression condition_exp() throws RecognitionException {
        ConditionExpression ce = null;

        Token o=null;
        ConditionExpression pc = null;

        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:411:3: (pc= condition_term ( ( OR )=> (o= OR ) (c= condition_term )? ( ( OR )=> (o= OR ) (c= condition_term )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:411:5: pc= condition_term ( ( OR )=> (o= OR ) (c= condition_term )? ( ( OR )=> (o= OR ) (c= condition_term )? )* )?
            {
            pushFollow(FOLLOW_condition_term_in_condition_exp2015);
            pc=condition_term();

            state._fsp--;
            if (state.failed) return ce;
            if ( state.backtracking==0 ) {
               ce =pc; 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:4: ( ( OR )=> (o= OR ) (c= condition_term )? ( ( OR )=> (o= OR ) (c= condition_term )? )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==OR) && (synpred20_DnaSqlQuery())) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:7: ( OR )=> (o= OR ) (c= condition_term )? ( ( OR )=> (o= OR ) (c= condition_term )? )*
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:13: (o= OR )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:14: o= OR
                    {
                    o=(Token)match(input,OR,FOLLOW_OR_in_condition_exp2032); if (state.failed) return ce;

                    }

                    if ( state.backtracking==0 ) {
                      c=null;
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:30: (c= condition_term )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==APPROXIMATE_NUM_LIT||LA44_0==MINUS_SIGN||(LA44_0>=NOT_EQUALS_OP && LA44_0<=ARGUMENT_ID)||(LA44_0>=LESS_THAN_OP && LA44_0<=GREATER_THAN_OP)||LA44_0==BYTES||LA44_0==DATE||LA44_0==GUID||LA44_0==REGULAR_ID||(LA44_0>=NOT && LA44_0<=NULL)||LA44_0==LEFT_PAREN||(LA44_0>=COUNT && LA44_0<=MIN)||(LA44_0>=H_LV && LA44_0<=H_AID)||(LA44_0>=COALESCE && LA44_0<=CASE)||(LA44_0>=TRUE && LA44_0<=EXACT_NUM_LIT)||(LA44_0>=EXISTS && LA44_0<=LIKE)||(LA44_0>=STARTS_WITH && LA44_0<=DELIMITED_ID)||LA44_0==DATA||LA44_0==LENGTH||(LA44_0>=MORE && LA44_0<=NAME)||LA44_0==NULLABLE||LA44_0==NUMBER||LA44_0==REPEATABLE||LA44_0==SCALE||LA44_0==SERIALIZABLE||(LA44_0>=TYPE && LA44_0<=UNCOMMITTED)||LA44_0==UNNAMED) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:31: c= condition_term
                            {
                            pushFollow(FOLLOW_condition_term_in_condition_exp2040);
                            c=condition_term();

                            state._fsp--;
                            if (state.failed) return ce;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              ce =new LogicalPredicate(getPos(ce),ce);
                              ((LogicalPredicate)ce).add((o!=null?o.getText():null),getPos(o),c);
                              if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText(o),getPos(o));
                            
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:5: ( ( OR )=> (o= OR ) (c= condition_term )? )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==OR) && (synpred21_DnaSqlQuery())) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:7: ( OR )=> (o= OR ) (c= condition_term )?
                    	    {
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:13: (o= OR )
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:14: o= OR
                    	    {
                    	    o=(Token)match(input,OR,FOLLOW_OR_in_condition_exp2065); if (state.failed) return ce;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      c=null;
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:30: (c= condition_term )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==APPROXIMATE_NUM_LIT||LA45_0==MINUS_SIGN||(LA45_0>=NOT_EQUALS_OP && LA45_0<=ARGUMENT_ID)||(LA45_0>=LESS_THAN_OP && LA45_0<=GREATER_THAN_OP)||LA45_0==BYTES||LA45_0==DATE||LA45_0==GUID||LA45_0==REGULAR_ID||(LA45_0>=NOT && LA45_0<=NULL)||LA45_0==LEFT_PAREN||(LA45_0>=COUNT && LA45_0<=MIN)||(LA45_0>=H_LV && LA45_0<=H_AID)||(LA45_0>=COALESCE && LA45_0<=CASE)||(LA45_0>=TRUE && LA45_0<=EXACT_NUM_LIT)||(LA45_0>=EXISTS && LA45_0<=LIKE)||(LA45_0>=STARTS_WITH && LA45_0<=DELIMITED_ID)||LA45_0==DATA||LA45_0==LENGTH||(LA45_0>=MORE && LA45_0<=NAME)||LA45_0==NULLABLE||LA45_0==NUMBER||LA45_0==REPEATABLE||LA45_0==SCALE||LA45_0==SERIALIZABLE||(LA45_0>=TYPE && LA45_0<=UNCOMMITTED)||LA45_0==UNNAMED) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:31: c= condition_term
                    	            {
                    	            pushFollow(FOLLOW_condition_term_in_condition_exp2073);
                    	            c=condition_term();

                    	            state._fsp--;
                    	            if (state.failed) return ce;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	              ((LogicalPredicate)ce).add((o!=null?o.getText():null),getPos(o),c);
                    	              if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText(o),getPos(o));
                    	            
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               /*if(pc==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary condition operand lost",getPos(pc));*/ 
            }

            }

        }

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
        finally {
        }
        return ce;
    }
    // $ANTLR end "condition_exp"


    // $ANTLR start "condition_term"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:428:1: condition_term returns [ConditionExpression ce=null] : pc= condition_factor ( ( AND )=> (o= AND ) (c= condition_factor )? ( ( AND )=> (o= AND ) (c= condition_factor )? )* )? ;
    public final ConditionExpression condition_term() throws RecognitionException {
        ConditionExpression ce = null;

        Token o=null;
        ConditionExpression pc = null;

        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:429:3: (pc= condition_factor ( ( AND )=> (o= AND ) (c= condition_factor )? ( ( AND )=> (o= AND ) (c= condition_factor )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:429:5: pc= condition_factor ( ( AND )=> (o= AND ) (c= condition_factor )? ( ( AND )=> (o= AND ) (c= condition_factor )? )* )?
            {
            pushFollow(FOLLOW_condition_factor_in_condition_term2122);
            pc=condition_factor();

            state._fsp--;
            if (state.failed) return ce;
            if ( state.backtracking==0 ) {
               ce =pc; 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:4: ( ( AND )=> (o= AND ) (c= condition_factor )? ( ( AND )=> (o= AND ) (c= condition_factor )? )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==AND) && (synpred22_DnaSqlQuery())) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:7: ( AND )=> (o= AND ) (c= condition_factor )? ( ( AND )=> (o= AND ) (c= condition_factor )? )*
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:14: (o= AND )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:15: o= AND
                    {
                    o=(Token)match(input,AND,FOLLOW_AND_in_condition_term2139); if (state.failed) return ce;

                    }

                    if ( state.backtracking==0 ) {
                      c=null;
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:32: (c= condition_factor )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==APPROXIMATE_NUM_LIT||LA48_0==MINUS_SIGN||(LA48_0>=NOT_EQUALS_OP && LA48_0<=ARGUMENT_ID)||(LA48_0>=LESS_THAN_OP && LA48_0<=GREATER_THAN_OP)||LA48_0==BYTES||LA48_0==DATE||LA48_0==GUID||LA48_0==REGULAR_ID||(LA48_0>=NOT && LA48_0<=NULL)||LA48_0==LEFT_PAREN||(LA48_0>=COUNT && LA48_0<=MIN)||(LA48_0>=H_LV && LA48_0<=H_AID)||(LA48_0>=COALESCE && LA48_0<=CASE)||(LA48_0>=TRUE && LA48_0<=EXACT_NUM_LIT)||(LA48_0>=EXISTS && LA48_0<=LIKE)||(LA48_0>=STARTS_WITH && LA48_0<=DELIMITED_ID)||LA48_0==DATA||LA48_0==LENGTH||(LA48_0>=MORE && LA48_0<=NAME)||LA48_0==NULLABLE||LA48_0==NUMBER||LA48_0==REPEATABLE||LA48_0==SCALE||LA48_0==SERIALIZABLE||(LA48_0>=TYPE && LA48_0<=UNCOMMITTED)||LA48_0==UNNAMED) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:33: c= condition_factor
                            {
                            pushFollow(FOLLOW_condition_factor_in_condition_term2147);
                            c=condition_factor();

                            state._fsp--;
                            if (state.failed) return ce;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              ce =new LogicalPredicate(getPos(ce),ce);
                              ((LogicalPredicate)ce).add((o!=null?o.getText():null),getPos(o),c);
                              if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText(o),getPos(o));
                            
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:5: ( ( AND )=> (o= AND ) (c= condition_factor )? )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==AND) && (synpred23_DnaSqlQuery())) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:7: ( AND )=> (o= AND ) (c= condition_factor )?
                    	    {
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:14: (o= AND )
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:15: o= AND
                    	    {
                    	    o=(Token)match(input,AND,FOLLOW_AND_in_condition_term2172); if (state.failed) return ce;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      c=null;
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:32: (c= condition_factor )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==APPROXIMATE_NUM_LIT||LA49_0==MINUS_SIGN||(LA49_0>=NOT_EQUALS_OP && LA49_0<=ARGUMENT_ID)||(LA49_0>=LESS_THAN_OP && LA49_0<=GREATER_THAN_OP)||LA49_0==BYTES||LA49_0==DATE||LA49_0==GUID||LA49_0==REGULAR_ID||(LA49_0>=NOT && LA49_0<=NULL)||LA49_0==LEFT_PAREN||(LA49_0>=COUNT && LA49_0<=MIN)||(LA49_0>=H_LV && LA49_0<=H_AID)||(LA49_0>=COALESCE && LA49_0<=CASE)||(LA49_0>=TRUE && LA49_0<=EXACT_NUM_LIT)||(LA49_0>=EXISTS && LA49_0<=LIKE)||(LA49_0>=STARTS_WITH && LA49_0<=DELIMITED_ID)||LA49_0==DATA||LA49_0==LENGTH||(LA49_0>=MORE && LA49_0<=NAME)||LA49_0==NULLABLE||LA49_0==NUMBER||LA49_0==REPEATABLE||LA49_0==SCALE||LA49_0==SERIALIZABLE||(LA49_0>=TYPE && LA49_0<=UNCOMMITTED)||LA49_0==UNNAMED) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:33: c= condition_factor
                    	            {
                    	            pushFollow(FOLLOW_condition_factor_in_condition_term2180);
                    	            c=condition_factor();

                    	            state._fsp--;
                    	            if (state.failed) return ce;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	              ((LogicalPredicate)ce).add((o!=null?o.getText():null),getPos(o),c);
                    	              if(c==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"condition operand lost after "+getText(o),getPos(o));
                    	            
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               /*if(pc==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary condition operand lost",getPos(pc));*/ 
            }

            }

        }

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
        finally {
        }
        return ce;
    }
    // $ANTLR end "condition_term"


    // $ANTLR start "condition_factor"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:446:1: condition_factor returns [ConditionExpression ce=null] : ( ( NOT )=>n= NOT )? c= condition_primary ;
    public final ConditionExpression condition_factor() throws RecognitionException {
        ConditionExpression ce = null;

        Token n=null;
        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:3: ( ( ( NOT )=>n= NOT )? c= condition_primary )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:5: ( ( NOT )=>n= NOT )? c= condition_primary
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:5: ( ( NOT )=>n= NOT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==NOT) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred24_DnaSqlQuery()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:6: ( NOT )=>n= NOT
                    {
                    n=(Token)match(input,NOT,FOLLOW_NOT_in_condition_factor2234); if (state.failed) return ce;

                    }
                    break;

            }

            pushFollow(FOLLOW_condition_primary_in_condition_factor2240);
            c=condition_primary();

            state._fsp--;
            if (state.failed) return ce;
            if ( state.backtracking==0 ) {
               ce =c; if(n!=null) ce.setNot(!ce.isNot(),getPos(n)); 
            }

            }

        }

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
        finally {
        }
        return ce;
    }
    // $ANTLR end "condition_factor"


    // $ANTLR start "condition_primary"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:451:1: condition_primary returns [ConditionExpression ce=null] options {backtrack=true; } : ( ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN ) | e= exists_predicate | h= hierarchy_predicate | p= predicate );
    public final ConditionExpression condition_primary() throws RecognitionException {
        ConditionExpression ce = null;

        Token l=null;
        Token r=null;
        ConditionExpression c = null;

        ExistsPredicate e = null;

        HierarchyPredicate h = null;

        RelationPredicate p = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:3: ( ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN ) | e= exists_predicate | h= hierarchy_predicate | p= predicate )
            int alt53=4;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:5: ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:5: ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:6: ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN
                    {
                    l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_condition_primary2278); if (state.failed) return ce;
                    pushFollow(FOLLOW_condition_exp_in_condition_primary2282);
                    c=condition_exp();

                    state._fsp--;
                    if (state.failed) return ce;
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_condition_primary2286); if (state.failed) return ce;
                    if ( state.backtracking==0 ) {
                       ce =new ParenConditionExpression(getPos(l,r),c); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:454:5: e= exists_predicate
                    {
                    pushFollow(FOLLOW_exists_predicate_in_condition_primary2297);
                    e=exists_predicate();

                    state._fsp--;
                    if (state.failed) return ce;
                    if ( state.backtracking==0 ) {
                       ce =e; 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:455:5: h= hierarchy_predicate
                    {
                    pushFollow(FOLLOW_hierarchy_predicate_in_condition_primary2307);
                    h=hierarchy_predicate();

                    state._fsp--;
                    if (state.failed) return ce;
                    if ( state.backtracking==0 ) {
                       ce =h; 
                    }

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:456:5: p= predicate
                    {
                    pushFollow(FOLLOW_predicate_in_condition_primary2317);
                    p=predicate();

                    state._fsp--;
                    if (state.failed) return ce;
                    if ( state.backtracking==0 ) {
                       ce =p; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return ce;
    }
    // $ANTLR end "condition_primary"


    // $ANTLR start "exists_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:459:1: exists_predicate returns [ExistsPredicate ep=null] : ( EXISTS )=> (e= EXISTS ) s= subquery ;
    public final ExistsPredicate exists_predicate() throws RecognitionException {
        ExistsPredicate ep = null;

        Token e=null;
        SubQueryStatement s = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:460:3: ( ( EXISTS )=> (e= EXISTS ) s= subquery )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:460:5: ( EXISTS )=> (e= EXISTS ) s= subquery
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:460:15: (e= EXISTS )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:460:16: e= EXISTS
            {
            e=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_exists_predicate2344); if (state.failed) return ep;

            }

            pushFollow(FOLLOW_subquery_in_exists_predicate2354);
            s=subquery();

            state._fsp--;
            if (state.failed) return ep;
            if ( state.backtracking==0 ) {
               ep = new ExistsPredicate(getTokenNode(e), s, null); 
            }

            }

        }

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
        finally {
        }
        return ep;
    }
    // $ANTLR end "exists_predicate"


    // $ANTLR start "predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:465:1: predicate returns [RelationPredicate rp=null] : (v= row_value_constructor )? ( ( ( comp_op )=> ( comp_predicate[rp] ) ) | (n= NOT )? ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] ) | null_predicate[rp] ) ;
    public final RelationPredicate predicate() throws RecognitionException {
        RelationPredicate rp = null;

        Token n=null;
        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:465:45: ( (v= row_value_constructor )? ( ( ( comp_op )=> ( comp_predicate[rp] ) ) | (n= NOT )? ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] ) | null_predicate[rp] ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:466:5: (v= row_value_constructor )? ( ( ( comp_op )=> ( comp_predicate[rp] ) ) | (n= NOT )? ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] ) | null_predicate[rp] )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:466:5: (v= row_value_constructor )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==APPROXIMATE_NUM_LIT||LA54_0==MINUS_SIGN||LA54_0==ARGUMENT_ID||LA54_0==BYTES||LA54_0==DATE||LA54_0==GUID||LA54_0==REGULAR_ID||LA54_0==NULL||LA54_0==LEFT_PAREN||(LA54_0>=COUNT && LA54_0<=MIN)||(LA54_0>=H_LV && LA54_0<=H_AID)||(LA54_0>=COALESCE && LA54_0<=CASE)||(LA54_0>=TRUE && LA54_0<=EXACT_NUM_LIT)||LA54_0==DELIMITED_ID||LA54_0==DATA||LA54_0==LENGTH||(LA54_0>=MORE && LA54_0<=NAME)||LA54_0==NULLABLE||LA54_0==NUMBER||LA54_0==REPEATABLE||LA54_0==SCALE||LA54_0==SERIALIZABLE||(LA54_0>=TYPE && LA54_0<=UNCOMMITTED)||LA54_0==UNNAMED) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:466:6: v= row_value_constructor
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_predicate2384);
                    v=row_value_constructor();

                    state._fsp--;
                    if (state.failed) return rp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               rp =new RelationPredicate(getPos(v),v); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:7: ( ( ( comp_op )=> ( comp_predicate[rp] ) ) | (n= NOT )? ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] ) | null_predicate[rp] )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EQUALS_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==NOT_EQUALS_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==LESS_THAN_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==GREATER_THAN_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==LESS_THAN_OR_EQUALS_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==GREATER_THAN_OR_EQUALS_OP) && (synpred30_DnaSqlQuery())) {
                alt57=1;
            }
            else if ( (LA57_0==NOT||(LA57_0>=BETWEEN && LA57_0<=LIKE)||(LA57_0>=STARTS_WITH && LA57_0<=CONTAINS)) ) {
                alt57=2;
            }
            else if ( (LA57_0==IS) ) {
                alt57=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return rp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:9: ( ( comp_op )=> ( comp_predicate[rp] ) )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:9: ( ( comp_op )=> ( comp_predicate[rp] ) )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:10: ( comp_op )=> ( comp_predicate[rp] )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:21: ( comp_predicate[rp] )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:22: comp_predicate[rp]
                    {
                    pushFollow(FOLLOW_comp_predicate_in_predicate2404);
                    comp_predicate(rp);

                    state._fsp--;
                    if (state.failed) return rp;

                    }


                    }


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:468:9: (n= NOT )? ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:468:9: (n= NOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:468:10: n= NOT
                            {
                            n=(Token)match(input,NOT,FOLLOW_NOT_in_predicate2420); if (state.failed) return rp;

                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:468:18: ( between_predicate[rp] | in_predicate[rp] | like_predicate[rp] | string_predicate[rp] )
                    int alt56=4;
                    switch ( input.LA(1) ) {
                    case BETWEEN:
                        {
                        alt56=1;
                        }
                        break;
                    case IN:
                        {
                        alt56=2;
                        }
                        break;
                    case LIKE:
                        {
                        alt56=3;
                        }
                        break;
                    case STARTS_WITH:
                    case ENDS_WITH:
                    case CONTAINS:
                        {
                        alt56=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return rp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:468:20: between_predicate[rp]
                            {
                            pushFollow(FOLLOW_between_predicate_in_predicate2426);
                            between_predicate(rp);

                            state._fsp--;
                            if (state.failed) return rp;

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:469:20: in_predicate[rp]
                            {
                            pushFollow(FOLLOW_in_predicate_in_predicate2449);
                            in_predicate(rp);

                            state._fsp--;
                            if (state.failed) return rp;

                            }
                            break;
                        case 3 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:470:20: like_predicate[rp]
                            {
                            pushFollow(FOLLOW_like_predicate_in_predicate2472);
                            like_predicate(rp);

                            state._fsp--;
                            if (state.failed) return rp;

                            }
                            break;
                        case 4 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:471:20: string_predicate[rp]
                            {
                            pushFollow(FOLLOW_string_predicate_in_predicate2494);
                            string_predicate(rp);

                            state._fsp--;
                            if (state.failed) return rp;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       if(n!=null) rp.setNot(true, getPos(n)); 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:474:9: null_predicate[rp]
                    {
                    pushFollow(FOLLOW_null_predicate_in_predicate2536);
                    null_predicate(rp);

                    state._fsp--;
                    if (state.failed) return rp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(v==null) reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"primary value operand lost",getPos(rp)); 
            }

            }

        }

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
        finally {
        }
        return rp;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "comp_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:479:1: comp_predicate[RelationPredicate rp] : ( comp_op )=> (op= comp_op ) (s= subquery | v= row_value_constructor )? ;
    public final void comp_predicate(RelationPredicate rp) throws RecognitionException {
        Token op = null;

        SubQueryStatement s = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:479:38: ( ( comp_op )=> (op= comp_op ) (s= subquery | v= row_value_constructor )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:3: ( comp_op )=> (op= comp_op ) (s= subquery | v= row_value_constructor )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:14: (op= comp_op )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:15: op= comp_op
            {
            pushFollow(FOLLOW_comp_op_in_comp_predicate2576);
            op=comp_op();

            state._fsp--;
            if (state.failed) return ;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:27: (s= subquery | v= row_value_constructor )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LEFT_PAREN) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==APPROXIMATE_NUM_LIT||LA58_1==MINUS_SIGN||LA58_1==ARGUMENT_ID||LA58_1==BYTES||LA58_1==DATE||LA58_1==GUID||LA58_1==REGULAR_ID||LA58_1==LEFT_PAREN||(LA58_1>=COUNT && LA58_1<=MIN)||(LA58_1>=H_LV && LA58_1<=H_AID)||(LA58_1>=COALESCE && LA58_1<=CASE)||(LA58_1>=TRUE && LA58_1<=EXACT_NUM_LIT)||LA58_1==DELIMITED_ID||LA58_1==DATA||LA58_1==LENGTH||(LA58_1>=MORE && LA58_1<=NAME)||LA58_1==NULLABLE||LA58_1==NUMBER||LA58_1==REPEATABLE||LA58_1==SCALE||LA58_1==SERIALIZABLE||(LA58_1>=TYPE && LA58_1<=UNCOMMITTED)||LA58_1==UNNAMED) ) {
                    alt58=2;
                }
                else if ( (LA58_1==SELECT) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==APPROXIMATE_NUM_LIT||LA58_0==MINUS_SIGN||LA58_0==ARGUMENT_ID||LA58_0==BYTES||LA58_0==DATE||LA58_0==GUID||LA58_0==REGULAR_ID||LA58_0==NULL||(LA58_0>=COUNT && LA58_0<=MIN)||(LA58_0>=H_LV && LA58_0<=H_AID)||(LA58_0>=COALESCE && LA58_0<=CASE)||(LA58_0>=TRUE && LA58_0<=EXACT_NUM_LIT)||LA58_0==DELIMITED_ID||LA58_0==DATA||LA58_0==LENGTH||(LA58_0>=MORE && LA58_0<=NAME)||LA58_0==NULLABLE||LA58_0==NUMBER||LA58_0==REPEATABLE||LA58_0==SCALE||LA58_0==SERIALIZABLE||(LA58_0>=TYPE && LA58_0<=UNCOMMITTED)||LA58_0==UNNAMED) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:28: s= subquery
                    {
                    pushFollow(FOLLOW_subquery_in_comp_predicate2582);
                    s=subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:480:41: v= row_value_constructor
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_comp_predicate2588);
                    v=row_value_constructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                  rp.setOperator(getText(op),getPos(op));
                  if(v!=null) rp.setUncertainOperand(v,getPos(v));
                  else if(s!=null) rp.setUncertainOperand(s,getPos(s));
                  else reportError(ParseWarningKinds.KIND_UGLY_EXPRESSION,"value operand lost after compare operator",getPos(op));
                
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "comp_predicate"


    // $ANTLR start "comp_op"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:489:1: comp_op returns [Token op] : (o= EQUALS_OP | o= NOT_EQUALS_OP | o= LESS_THAN_OP | o= GREATER_THAN_OP | o= LESS_THAN_OR_EQUALS_OP | o= GREATER_THAN_OR_EQUALS_OP ) ;
    public final Token comp_op() throws RecognitionException {
        Token op = null;

        Token o=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:489:27: ( (o= EQUALS_OP | o= NOT_EQUALS_OP | o= LESS_THAN_OP | o= GREATER_THAN_OP | o= LESS_THAN_OR_EQUALS_OP | o= GREATER_THAN_OR_EQUALS_OP ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:490:3: (o= EQUALS_OP | o= NOT_EQUALS_OP | o= LESS_THAN_OP | o= GREATER_THAN_OP | o= LESS_THAN_OR_EQUALS_OP | o= GREATER_THAN_OR_EQUALS_OP )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:490:3: (o= EQUALS_OP | o= NOT_EQUALS_OP | o= LESS_THAN_OP | o= GREATER_THAN_OP | o= LESS_THAN_OR_EQUALS_OP | o= GREATER_THAN_OR_EQUALS_OP )
            int alt59=6;
            switch ( input.LA(1) ) {
            case EQUALS_OP:
                {
                alt59=1;
                }
                break;
            case NOT_EQUALS_OP:
                {
                alt59=2;
                }
                break;
            case LESS_THAN_OP:
                {
                alt59=3;
                }
                break;
            case GREATER_THAN_OP:
                {
                alt59=4;
                }
                break;
            case LESS_THAN_OR_EQUALS_OP:
                {
                alt59=5;
                }
                break;
            case GREATER_THAN_OR_EQUALS_OP:
                {
                alt59=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:490:5: o= EQUALS_OP
                    {
                    o=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_comp_op2617); if (state.failed) return op;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:491:5: o= NOT_EQUALS_OP
                    {
                    o=(Token)match(input,NOT_EQUALS_OP,FOLLOW_NOT_EQUALS_OP_in_comp_op2626); if (state.failed) return op;

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:492:5: o= LESS_THAN_OP
                    {
                    o=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_comp_op2634); if (state.failed) return op;

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:493:5: o= GREATER_THAN_OP
                    {
                    o=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_comp_op2643); if (state.failed) return op;

                    }
                    break;
                case 5 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:494:5: o= LESS_THAN_OR_EQUALS_OP
                    {
                    o=(Token)match(input,LESS_THAN_OR_EQUALS_OP,FOLLOW_LESS_THAN_OR_EQUALS_OP_in_comp_op2652); if (state.failed) return op;

                    }
                    break;
                case 6 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:495:5: o= GREATER_THAN_OR_EQUALS_OP
                    {
                    o=(Token)match(input,GREATER_THAN_OR_EQUALS_OP,FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_comp_op2660); if (state.failed) return op;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               op =o; 
            }

            }

        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "comp_op"


    // $ANTLR start "between_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:499:1: between_predicate[RelationPredicate rp] : ( BETWEEN )=> (op= BETWEEN ) r= row_value_constructor AND v= row_value_constructor ;
    public final void between_predicate(RelationPredicate rp) throws RecognitionException {
        Token op=null;
        ValueExpression r = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:499:41: ( ( BETWEEN )=> (op= BETWEEN ) r= row_value_constructor AND v= row_value_constructor )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:500:3: ( BETWEEN )=> (op= BETWEEN ) r= row_value_constructor AND v= row_value_constructor
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:500:14: (op= BETWEEN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:500:15: op= BETWEEN
            {
            op=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between_predicate2689); if (state.failed) return ;

            }

            pushFollow(FOLLOW_row_value_constructor_in_between_predicate2694);
            r=row_value_constructor();

            state._fsp--;
            if (state.failed) return ;
            match(input,AND,FOLLOW_AND_in_between_predicate2696); if (state.failed) return ;
            pushFollow(FOLLOW_row_value_constructor_in_between_predicate2700);
            v=row_value_constructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               rp.setOperator((op!=null?op.getText():null),null); rp.setUncertainOperand(getNodeList(r,v),getPos(v));  
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "between_predicate"


    // $ANTLR start "in_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:504:1: in_predicate[RelationPredicate rp] : ( IN )=> (op= IN ) in_predicate_value[rp] ;
    public final void in_predicate(RelationPredicate rp) throws RecognitionException {
        Token op=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:504:36: ( ( IN )=> (op= IN ) in_predicate_value[rp] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:505:3: ( IN )=> (op= IN ) in_predicate_value[rp]
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:505:9: (op= IN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:505:10: op= IN
            {
            op=(Token)match(input,IN,FOLLOW_IN_in_in_predicate2728); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              rp.setOperator((op!=null?op.getText():null),null);
            }
            pushFollow(FOLLOW_in_predicate_value_in_in_predicate2733);
            in_predicate_value(rp);

            state._fsp--;
            if (state.failed) return ;

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "in_predicate"


    // $ANTLR start "in_predicate_value"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:508:1: in_predicate_value[RelationPredicate rp] : (q= subquery | LEFT_PAREN l= in_value_list r= RIGHT_PAREN );
    public final void in_predicate_value(RelationPredicate rp) throws RecognitionException {
        Token r=null;
        SubQueryStatement q = null;

        List<IAstNode> l = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:508:42: (q= subquery | LEFT_PAREN l= in_value_list r= RIGHT_PAREN )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LEFT_PAREN) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==SELECT) ) {
                    alt60=1;
                }
                else if ( (LA60_1==APPROXIMATE_NUM_LIT||LA60_1==MINUS_SIGN||LA60_1==ARGUMENT_ID||LA60_1==BYTES||LA60_1==DATE||LA60_1==GUID||LA60_1==REGULAR_ID||LA60_1==LEFT_PAREN||(LA60_1>=COUNT && LA60_1<=MIN)||(LA60_1>=H_LV && LA60_1<=H_AID)||(LA60_1>=COALESCE && LA60_1<=CASE)||(LA60_1>=TRUE && LA60_1<=EXACT_NUM_LIT)||LA60_1==DELIMITED_ID||LA60_1==DATA||LA60_1==LENGTH||(LA60_1>=MORE && LA60_1<=NAME)||LA60_1==NULLABLE||LA60_1==NUMBER||LA60_1==REPEATABLE||LA60_1==SCALE||LA60_1==SERIALIZABLE||(LA60_1>=TYPE && LA60_1<=UNCOMMITTED)||LA60_1==UNNAMED) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:509:4: q= subquery
                    {
                    pushFollow(FOLLOW_subquery_in_in_predicate_value2754);
                    q=subquery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       rp.setUncertainOperand(q,getPos(q)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:510:5: LEFT_PAREN l= in_value_list r= RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_in_predicate_value2762); if (state.failed) return ;
                    pushFollow(FOLLOW_in_value_list_in_in_predicate_value2766);
                    l=in_value_list();

                    state._fsp--;
                    if (state.failed) return ;
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_in_predicate_value2770); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       rp.setUncertainOperand(l,getPos(r));  
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "in_predicate_value"


    // $ANTLR start "in_value_list"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:513:1: in_value_list returns [List<IAstNode> list=null] : e= value_exp ( COMMA e= value_exp )* ;
    public final List<IAstNode> in_value_list() throws RecognitionException {
        List<IAstNode> list = null;

        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:513:49: (e= value_exp ( COMMA e= value_exp )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:514:3: e= value_exp ( COMMA e= value_exp )*
            {
            pushFollow(FOLLOW_value_exp_in_in_value_list2793);
            e=value_exp();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
               list =getNodeList(e); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:514:46: ( COMMA e= value_exp )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:514:47: COMMA e= value_exp
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_in_value_list2798); if (state.failed) return list;
            	    pushFollow(FOLLOW_value_exp_in_in_value_list2802);
            	    e=value_exp();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	       list.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return list;
    }
    // $ANTLR end "in_value_list"


    // $ANTLR start "like_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:517:1: like_predicate[RelationPredicate rp] : ( LIKE )=> (op= LIKE ) pa= pattern ( ESCAPE es= escape_char )? ;
    public final void like_predicate(RelationPredicate rp) throws RecognitionException {
        Token op=null;
        ValueExpression pa = null;

        ValueExpression es = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:517:38: ( ( LIKE )=> (op= LIKE ) pa= pattern ( ESCAPE es= escape_char )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:518:3: ( LIKE )=> (op= LIKE ) pa= pattern ( ESCAPE es= escape_char )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:518:11: (op= LIKE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:518:12: op= LIKE
            {
            op=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate2829); if (state.failed) return ;

            }

            pushFollow(FOLLOW_pattern_in_like_predicate2834);
            pa=pattern();

            state._fsp--;
            if (state.failed) return ;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:518:32: ( ESCAPE es= escape_char )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ESCAPE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:518:33: ESCAPE es= escape_char
                    {
                    match(input,ESCAPE,FOLLOW_ESCAPE_in_like_predicate2837); if (state.failed) return ;
                    pushFollow(FOLLOW_escape_char_in_like_predicate2841);
                    es=escape_char();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               rp.setOperator((op!=null?op.getText():null),null);
                  if(es!=null) rp.setUncertainOperand(getNodeList(pa,es),getPos(es));
                  else rp.setUncertainOperand(pa,getPos(pa)); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "like_predicate"


    // $ANTLR start "string_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:523:1: string_predicate[RelationPredicate rp] : (op= STARTS_WITH | op= ENDS_WITH | op= CONTAINS ) pa= pattern ;
    public final void string_predicate(RelationPredicate rp) throws RecognitionException {
        Token op=null;
        ValueExpression pa = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:3: ( (op= STARTS_WITH | op= ENDS_WITH | op= CONTAINS ) pa= pattern )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:5: (op= STARTS_WITH | op= ENDS_WITH | op= CONTAINS ) pa= pattern
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:5: (op= STARTS_WITH | op= ENDS_WITH | op= CONTAINS )
            int alt63=3;
            switch ( input.LA(1) ) {
            case STARTS_WITH:
                {
                alt63=1;
                }
                break;
            case ENDS_WITH:
                {
                alt63=2;
                }
                break;
            case CONTAINS:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:6: op= STARTS_WITH
                    {
                    op=(Token)match(input,STARTS_WITH,FOLLOW_STARTS_WITH_in_string_predicate2862); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:21: op= ENDS_WITH
                    {
                    op=(Token)match(input,ENDS_WITH,FOLLOW_ENDS_WITH_in_string_predicate2866); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:524:34: op= CONTAINS
                    {
                    op=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_string_predicate2870); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_string_predicate2876);
            pa=pattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               rp.setOperator((op!=null?op.getText():null),null); rp.setUncertainOperand(pa,getPos(pa)); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "string_predicate"


    // $ANTLR start "pattern"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:528:1: pattern returns [ValueExpression exp=null] : c= value_exp ;
    public final ValueExpression pattern() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:528:44: (c= value_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:529:3: c= value_exp
            {
            pushFollow(FOLLOW_value_exp_in_pattern2906);
            c=value_exp();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =c; 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "pattern"


    // $ANTLR start "escape_char"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:532:1: escape_char returns [ValueExpression exp=null] : c= value_exp ;
    public final ValueExpression escape_char() throws RecognitionException {
        ValueExpression exp = null;

        ValueExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:532:47: (c= value_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:533:3: c= value_exp
            {
            pushFollow(FOLLOW_value_exp_in_escape_char2931);
            c=value_exp();

            state._fsp--;
            if (state.failed) return exp;
            if ( state.backtracking==0 ) {
               exp =c; 
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "escape_char"


    // $ANTLR start "null_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:536:1: null_predicate[RelationPredicate rp] : ( IS )=> (i= IS ) (t= NOT )? n= NULL ;
    public final void null_predicate(RelationPredicate rp) throws RecognitionException {
        Token i=null;
        Token t=null;
        Token n=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:536:38: ( ( IS )=> (i= IS ) (t= NOT )? n= NULL )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:537:3: ( IS )=> (i= IS ) (t= NOT )? n= NULL
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:537:9: (i= IS )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:537:10: i= IS
            {
            i=(Token)match(input,IS,FOLLOW_IS_in_null_predicate2958); if (state.failed) return ;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:537:16: (t= NOT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==NOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:537:17: t= NOT
                    {
                    t=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate2964); if (state.failed) return ;

                    }
                    break;

            }

            n=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate2970); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               rp.setOperator((i!=null?i.getText():null),null); ISourcePosition np=getPos(n); rp.setUncertainOperand(new NullExpression(np),np);
                  if(t!=null) rp.setNot(!rp.isNot(),null); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "null_predicate"


    // $ANTLR start "row_value_constructor"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:542:1: row_value_constructor returns [ValueExpression exp=null] : (e= value_exp | n= NULL );
    public final ValueExpression row_value_constructor() throws RecognitionException {
        ValueExpression exp = null;

        Token n=null;
        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:542:56: (e= value_exp | n= NULL )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==APPROXIMATE_NUM_LIT||LA65_0==MINUS_SIGN||LA65_0==ARGUMENT_ID||LA65_0==BYTES||LA65_0==DATE||LA65_0==GUID||LA65_0==REGULAR_ID||LA65_0==LEFT_PAREN||(LA65_0>=COUNT && LA65_0<=MIN)||(LA65_0>=H_LV && LA65_0<=H_AID)||(LA65_0>=COALESCE && LA65_0<=CASE)||(LA65_0>=TRUE && LA65_0<=EXACT_NUM_LIT)||LA65_0==DELIMITED_ID||LA65_0==DATA||LA65_0==LENGTH||(LA65_0>=MORE && LA65_0<=NAME)||LA65_0==NULLABLE||LA65_0==NUMBER||LA65_0==REPEATABLE||LA65_0==SCALE||LA65_0==SERIALIZABLE||(LA65_0>=TYPE && LA65_0<=UNCOMMITTED)||LA65_0==UNNAMED) ) {
                alt65=1;
            }
            else if ( (LA65_0==NULL) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:543:5: e= value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_row_value_constructor2996);
                    e=value_exp();

                    state._fsp--;
                    if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =e; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:544:5: n= NULL
                    {
                    n=(Token)match(input,NULL,FOLLOW_NULL_in_row_value_constructor3006); if (state.failed) return exp;
                    if ( state.backtracking==0 ) {
                       exp =new NullExpression(getPos(n));
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "row_value_constructor"


    // $ANTLR start "id"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:551:1: id returns [Token word=null] : (i= REGULAR_ID | i= DELIMITED_ID | {...}?k= non_reserved_word );
    public final Token id() throws RecognitionException {
        Token word = null;

        Token i=null;
        Token k = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:552:3: (i= REGULAR_ID | i= DELIMITED_ID | {...}?k= non_reserved_word )
            int alt66=3;
            switch ( input.LA(1) ) {
            case REGULAR_ID:
                {
                alt66=1;
                }
                break;
            case DELIMITED_ID:
                {
                alt66=2;
                }
                break;
            case DATA:
            case LENGTH:
            case MORE:
            case NAME:
            case NULLABLE:
            case NUMBER:
            case REPEATABLE:
            case SCALE:
            case SERIALIZABLE:
            case TYPE:
            case UNCOMMITTED:
            case UNNAMED:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return word;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:552:5: i= REGULAR_ID
                    {
                    i=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_id3033); if (state.failed) return word;
                    if ( state.backtracking==0 ) {
                       word =i; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:553:5: i= DELIMITED_ID
                    {
                    i=(Token)match(input,DELIMITED_ID,FOLLOW_DELIMITED_ID_in_id3046); if (state.failed) return word;
                    if ( state.backtracking==0 ) {
                       word =i; word.setText(transferID(word.getText())); 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:554:5: {...}?k= non_reserved_word
                    {
                    if ( !((unserved_as_id)) ) {
                        if (state.backtracking>0) {state.failed=true; return word;}
                        throw new FailedPredicateException(input, "id", "unserved_as_id");
                    }
                    pushFollow(FOLLOW_non_reserved_word_in_id3059);
                    k=non_reserved_word();

                    state._fsp--;
                    if (state.failed) return word;
                    if ( state.backtracking==0 ) {
                       word =k; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return word;
    }
    // $ANTLR end "id"


    // $ANTLR start "eof"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:557:1: eof : EOF ;
    public final void eof() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:558:3: ( EOF )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:558:5: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_eof3073); if (state.failed) return ;

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "eof"


    // $ANTLR start "query_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:563:1: query_declare returns [QueryDeclaration query=null] : ( DEFINE QUERY )=> (d= DEFINE q= QUERY ) n= id argument_list[query] BEGIN (w= with_statement )? query_statement[query] (e= END )? ;
    public final QueryDeclaration query_declare() throws RecognitionException {
        QueryDeclaration query = null;

        Token d=null;
        Token q=null;
        Token e=null;
        Token n = null;

        WithStatement w = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:564:3: ( ( DEFINE QUERY )=> (d= DEFINE q= QUERY ) n= id argument_list[query] BEGIN (w= with_statement )? query_statement[query] (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:564:5: ( DEFINE QUERY )=> (d= DEFINE q= QUERY ) n= id argument_list[query] BEGIN (w= with_statement )? query_statement[query] (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:564:21: (d= DEFINE q= QUERY )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:564:22: d= DEFINE q= QUERY
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_query_declare3101); if (state.failed) return query;
            q=(Token)match(input,QUERY,FOLLOW_QUERY_in_query_declare3105); if (state.failed) return query;

            }

            pushFollow(FOLLOW_id_in_query_declare3110);
            n=id();

            state._fsp--;
            if (state.failed) return query;
            if ( state.backtracking==0 ) {
               query =new QueryDeclaration(getPos(d,q),getTokenNode(getText(n),getPos(n)));
            }
            pushFollow(FOLLOW_argument_list_in_query_declare3118);
            argument_list(query);

            state._fsp--;
            if (state.failed) return query;
            match(input,BEGIN,FOLLOW_BEGIN_in_query_declare3126); if (state.failed) return query;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:567:7: (w= with_statement )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==WITH) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:567:8: w= with_statement
                    {
                    pushFollow(FOLLOW_with_statement_in_query_declare3138);
                    w=with_statement();

                    state._fsp--;
                    if (state.failed) return query;
                    if ( state.backtracking==0 ) {
                       query.setWith(w); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_query_statement_in_query_declare3150);
            query_statement(query);

            state._fsp--;
            if (state.failed) return query;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:569:5: (e= END )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==END) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:569:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_query_declare3160); if (state.failed) return query;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) query.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(query).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return query;
    }
    // $ANTLR end "query_declare"


    // $ANTLR start "argument_list"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:575:1: argument_list[IArgumentContainer argCtnr] : l= LEFT_PAREN (fad= argument_declaration (c= COMMA (ad= argument_declaration )? )* )? RIGHT_PAREN ;
    public final void argument_list(IArgumentContainer argCtnr) throws RecognitionException {
        Token l=null;
        Token c=null;
        ArgumentDeclaration fad = null;

        ArgumentDeclaration ad = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:576:3: (l= LEFT_PAREN (fad= argument_declaration (c= COMMA (ad= argument_declaration )? )* )? RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:576:5: l= LEFT_PAREN (fad= argument_declaration (c= COMMA (ad= argument_declaration )? )* )? RIGHT_PAREN
            {
            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_argument_list3188); if (state.failed) return ;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:577:5: (fad= argument_declaration (c= COMMA (ad= argument_declaration )? )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ARGUMENT_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:577:7: fad= argument_declaration (c= COMMA (ad= argument_declaration )? )*
                    {
                    pushFollow(FOLLOW_argument_declaration_in_argument_list3199);
                    fad=argument_declaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(fad!=null) argCtnr.addArgument(fad);
                                else {
                                  argCtnr.addArgument(null);
                                  reportError(ParseWarningKinds.KIND_MISS_ARGUMENT_DECLARATION,"argument declaration lost after "+getText(l),getPos(l));
                                }
                              
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:584:6: (c= COMMA (ad= argument_declaration )? )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:584:7: c= COMMA (ad= argument_declaration )?
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_list3219); if (state.failed) return ;
                    	    if ( state.backtracking==0 ) {
                    	       ad=null; 
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:584:28: (ad= argument_declaration )?
                    	    int alt69=2;
                    	    int LA69_0 = input.LA(1);

                    	    if ( (LA69_0==ARGUMENT_ID) ) {
                    	        alt69=1;
                    	    }
                    	    switch (alt69) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:584:29: ad= argument_declaration
                    	            {
                    	            pushFollow(FOLLOW_argument_declaration_in_argument_list3226);
                    	            ad=argument_declaration();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       if(ad!=null) argCtnr.addArgument(ad);
                    	                else {
                    	                  argCtnr.addArgument(null);
                    	                  reportError(ParseWarningKinds.KIND_MISS_ARGUMENT_DECLARATION,"argument declaration lost after "+getText(c),getPos(c));
                    	                }
                    	                
                    	              
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_argument_list3260); if (state.failed) return ;

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "argument_list"


    // $ANTLR start "query_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:597:1: query_statement[QueryStatementBase query] : query_body[query] (u= union_statement )* ;
    public final void query_statement(QueryStatementBase query) throws RecognitionException {
        UnionStatement u = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:598:3: ( query_body[query] (u= union_statement )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:599:5: query_body[query] (u= union_statement )*
            {
            pushFollow(FOLLOW_query_body_in_query_statement3278);
            query_body(query);

            state._fsp--;
            if (state.failed) return ;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:600:5: (u= union_statement )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==UNION) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:600:7: u= union_statement
            	    {
            	    pushFollow(FOLLOW_union_statement_in_query_statement3289);
            	    u=union_statement();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       query.addUnion(u); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "query_statement"


    // $ANTLR start "query_body"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:603:1: query_body[QueryStatementBase query] : s= select_statement f= from_statement (w= where_statement )? (g= group_statement (h= having_statement )? )? (o= order_statement )? ;
    public final void query_body(QueryStatementBase query) throws RecognitionException {
        SelectStatement s = null;

        FromStatement f = null;

        WhereStatement w = null;

        GroupStatement g = null;

        HavingStatement h = null;

        OrderStatement o = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:604:3: (s= select_statement f= from_statement (w= where_statement )? (g= group_statement (h= having_statement )? )? (o= order_statement )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:605:5: s= select_statement f= from_statement (w= where_statement )? (g= group_statement (h= having_statement )? )? (o= order_statement )?
            {
            pushFollow(FOLLOW_select_statement_in_query_body3314);
            s=select_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              query.setSelect(s);
            }
            pushFollow(FOLLOW_from_statement_in_query_body3326);
            f=from_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              query.setFrom(f);
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:607:5: (w= where_statement )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==WHERE) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:607:6: w= where_statement
                    {
                    pushFollow(FOLLOW_where_statement_in_query_body3341);
                    w=where_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      query.setWhere(w);
                    }

                    }
                    break;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:608:5: (g= group_statement (h= having_statement )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==GROUP) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:608:7: g= group_statement (h= having_statement )?
                    {
                    pushFollow(FOLLOW_group_statement_in_query_body3361);
                    g=group_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      query.setGroup(g);
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:609:6: (h= having_statement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==HAVING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:609:7: h= having_statement
                            {
                            pushFollow(FOLLOW_having_statement_in_query_body3379);
                            h=having_statement();

                            state._fsp--;
                            if (state.failed) return ;
                            if ( state.backtracking==0 ) {
                              query.setHaving(h);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:611:5: (o= order_statement )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==ORDER) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:611:6: o= order_statement
                    {
                    pushFollow(FOLLOW_order_statement_in_query_body3401);
                    o=order_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      query.setOrder(o);
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "query_body"


    // $ANTLR start "subquery"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:614:1: subquery returns [SubQueryStatement sub=null] : ( LEFT_PAREN SELECT )=> (l= LEFT_PAREN ) query_statement[sub] r= RIGHT_PAREN ;
    public final SubQueryStatement subquery() throws RecognitionException {
        SubQueryStatement sub = null;

        Token l=null;
        Token r=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:615:3: ( ( LEFT_PAREN SELECT )=> (l= LEFT_PAREN ) query_statement[sub] r= RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:615:5: ( LEFT_PAREN SELECT )=> (l= LEFT_PAREN ) query_statement[sub] r= RIGHT_PAREN
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:615:28: (l= LEFT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:615:30: l= LEFT_PAREN
            {
            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_subquery3439); if (state.failed) return sub;

            }

            if ( state.backtracking==0 ) {
               sub =new SubQueryStatement(getPos(l)); 
            }
            pushFollow(FOLLOW_query_statement_in_subquery3453);
            query_statement(sub);

            state._fsp--;
            if (state.failed) return sub;
            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_subquery3462); if (state.failed) return sub;
            if ( state.backtracking==0 ) {
               sub.updatePosition(getPos(r)); 
            }

            }

        }

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
        finally {
        }
        return sub;
    }
    // $ANTLR end "subquery"


    // $ANTLR start "union_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:622:1: union_statement returns [UnionStatement us = null] : ( UNION )=> (u= UNION ) (a= ALL )? query_body[us] ;
    public final UnionStatement union_statement() throws RecognitionException {
        UnionStatement us =  null;

        Token u=null;
        Token a=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:623:3: ( ( UNION )=> (u= UNION ) (a= ALL )? query_body[us] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:623:5: ( UNION )=> (u= UNION ) (a= ALL )? query_body[us]
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:623:14: (u= UNION )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:623:15: u= UNION
            {
            u=(Token)match(input,UNION,FOLLOW_UNION_in_union_statement3493); if (state.failed) return us;

            }

            if ( state.backtracking==0 ) {
               us = new UnionStatement(getTokenNode(u),null);
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:624:5: (a= ALL )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==ALL) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:624:6: a= ALL
                    {
                    a=(Token)match(input,ALL,FOLLOW_ALL_in_union_statement3505); if (state.failed) return us;
                    if ( state.backtracking==0 ) {
                       us.setAll(getTokenNode(a)); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_query_body_in_union_statement3516);
            query_body(us);

            state._fsp--;
            if (state.failed) return us;

            }

        }

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
        finally {
        }
        return us;
    }
    // $ANTLR end "union_statement"


    // $ANTLR start "column_ref"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:628:1: column_ref returns [ColumnReference exp=null] : r= table_ref_ref p= PERIOD (i= id )? ;
    public final ColumnReference column_ref() throws RecognitionException {
        ColumnReference exp = null;

        Token p=null;
        TableRefReference r = null;

        Token i = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:628:45: (r= table_ref_ref p= PERIOD (i= id )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:629:3: r= table_ref_ref p= PERIOD (i= id )?
            {
            pushFollow(FOLLOW_table_ref_ref_in_column_ref3538);
            r=table_ref_ref();

            state._fsp--;
            if (state.failed) return exp;
            p=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_column_ref3542); if (state.failed) return exp;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:629:28: (i= id )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==REGULAR_ID||LA78_0==DELIMITED_ID||LA78_0==DATA||LA78_0==LENGTH||(LA78_0>=MORE && LA78_0<=NAME)||LA78_0==NULLABLE||LA78_0==NUMBER||LA78_0==REPEATABLE||LA78_0==SCALE||LA78_0==SERIALIZABLE||(LA78_0>=TYPE && LA78_0<=UNCOMMITTED)||LA78_0==UNNAMED) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:629:29: i= id
                    {
                    pushFollow(FOLLOW_id_in_column_ref3547);
                    i=id();

                    state._fsp--;
                    if (state.failed) return exp;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(i!=null) {
                    exp=new ColumnReference(getPos(r),r,null,null);
                    exp.setColumnName(getText(i),getPos(i));
                  } else {
                    exp=new ColumnReference(getPos(r),r,null,getPos(p));
                    reportError(ParseWarningKinds.KIND_MISS_COLUMN_NAME,"Unwanted point here",getPos(p));
                  }
                
            }

            }

        }

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
        finally {
        }
        return exp;
    }
    // $ANTLR end "column_ref"


    // $ANTLR start "table_ref_ref"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:640:1: table_ref_ref returns [TableRefReference ref=null] : t= table_name ;
    public final TableRefReference table_ref_ref() throws RecognitionException {
        TableRefReference ref = null;

        Token t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:641:3: (t= table_name )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:641:5: t= table_name
            {
            pushFollow(FOLLOW_table_name_in_table_ref_ref3571);
            t=table_name();

            state._fsp--;
            if (state.failed) return ref;
            if ( state.backtracking==0 ) {
               ref =new TableRefReference(getPos(t),getText(t)); 
            }

            }

        }

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
        finally {
        }
        return ref;
    }
    // $ANTLR end "table_ref_ref"


    // $ANTLR start "with_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:644:1: with_statement returns [WithStatement with=null] : ( WITH )=> (w= WITH ) (fq= subquery alias_spec[fq] )? (c= COMMA (q= subquery alias_spec[q] )? )* ;
    public final WithStatement with_statement() throws RecognitionException {
        WithStatement with = null;

        Token w=null;
        Token c=null;
        SubQueryStatement fq = null;

        SubQueryStatement q = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:645:3: ( ( WITH )=> (w= WITH ) (fq= subquery alias_spec[fq] )? (c= COMMA (q= subquery alias_spec[q] )? )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:645:5: ( WITH )=> (w= WITH ) (fq= subquery alias_spec[fq] )? (c= COMMA (q= subquery alias_spec[q] )? )*
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:645:13: (w= WITH )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:645:14: w= WITH
            {
            w=(Token)match(input,WITH,FOLLOW_WITH_in_with_statement3599); if (state.failed) return with;

            }

            if ( state.backtracking==0 ) {
               with = new WithStatement(getTokenNode(w),null); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:646:5: (fq= subquery alias_spec[fq] )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==LEFT_PAREN) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:646:6: fq= subquery alias_spec[fq]
                    {
                    pushFollow(FOLLOW_subquery_in_with_statement3612);
                    fq=subquery();

                    state._fsp--;
                    if (state.failed) return with;
                    pushFollow(FOLLOW_alias_spec_in_with_statement3614);
                    alias_spec(fq);

                    state._fsp--;
                    if (state.failed) return with;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(fq!=null) {
                      with.addSubquery(fq);
                    } else {
                      with.addSubquery(null);
                      reportError(ParseWarningKinds.KIND_MISS_SUBQUERY,"subquery lost after "+getText(w),getPos(w));
                    }
                  
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:654:5: (c= COMMA (q= subquery alias_spec[q] )? )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:654:6: c= COMMA (q= subquery alias_spec[q] )?
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_with_statement3632); if (state.failed) return with;
            	    if ( state.backtracking==0 ) {
            	      q=null;
            	    }
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:654:24: (q= subquery alias_spec[q] )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==LEFT_PAREN) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:654:25: q= subquery alias_spec[q]
            	            {
            	            pushFollow(FOLLOW_subquery_in_with_statement3639);
            	            q=subquery();

            	            state._fsp--;
            	            if (state.failed) return with;
            	            pushFollow(FOLLOW_alias_spec_in_with_statement3641);
            	            alias_spec(q);

            	            state._fsp--;
            	            if (state.failed) return with;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       if(q!=null) {
            	              with.addSubquery(q);
            	            } else {
            	              with.addSubquery(null);
            	              reportError(ParseWarningKinds.KIND_MISS_SUBQUERY,"subquery lost after "+getText(c),getPos(c));
            	            }
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return with;
    }
    // $ANTLR end "with_statement"


    // $ANTLR start "select_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:665:1: select_statement returns [SelectStatement select=null] : ( SELECT )=> (s= SELECT ) (d= set_quantifier )? (pc= derived_column (c= COMMA (sc= derived_column )? )* )? ;
    public final SelectStatement select_statement() throws RecognitionException {
        SelectStatement select = null;

        Token s=null;
        Token c=null;
        boolean d = false;

        DerivedColumn pc = null;

        DerivedColumn sc = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:666:3: ( ( SELECT )=> (s= SELECT ) (d= set_quantifier )? (pc= derived_column (c= COMMA (sc= derived_column )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:666:5: ( SELECT )=> (s= SELECT ) (d= set_quantifier )? (pc= derived_column (c= COMMA (sc= derived_column )? )* )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:666:15: (s= SELECT )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:666:16: s= SELECT
            {
            s=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement3682); if (state.failed) return select;

            }

            if ( state.backtracking==0 ) {
               select =new SelectStatement(getPos(s)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:667:5: (d= set_quantifier )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=DISTINCT && LA82_0<=ALL)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:667:7: d= set_quantifier
                    {
                    pushFollow(FOLLOW_set_quantifier_in_select_statement3695);
                    d=set_quantifier();

                    state._fsp--;
                    if (state.failed) return select;
                    if ( state.backtracking==0 ) {
                       select.setDistinct(d); 
                    }

                    }
                    break;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:668:5: (pc= derived_column (c= COMMA (sc= derived_column )? )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==APPROXIMATE_NUM_LIT||LA85_0==MINUS_SIGN||LA85_0==ARGUMENT_ID||LA85_0==BYTES||LA85_0==DATE||LA85_0==GUID||LA85_0==REGULAR_ID||LA85_0==LEFT_PAREN||(LA85_0>=COUNT && LA85_0<=MIN)||(LA85_0>=H_LV && LA85_0<=H_AID)||(LA85_0>=COALESCE && LA85_0<=CASE)||(LA85_0>=TRUE && LA85_0<=EXACT_NUM_LIT)||LA85_0==DELIMITED_ID||LA85_0==DATA||LA85_0==LENGTH||(LA85_0>=MORE && LA85_0<=NAME)||LA85_0==NULLABLE||LA85_0==NUMBER||LA85_0==REPEATABLE||LA85_0==SCALE||LA85_0==SERIALIZABLE||(LA85_0>=TYPE && LA85_0<=UNCOMMITTED)||LA85_0==UNNAMED) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:668:6: pc= derived_column (c= COMMA (sc= derived_column )? )*
                    {
                    pushFollow(FOLLOW_derived_column_in_select_statement3709);
                    pc=derived_column();

                    state._fsp--;
                    if (state.failed) return select;
                    if ( state.backtracking==0 ) {
                       select.add(pc); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:669:8: (c= COMMA (sc= derived_column )? )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:669:9: c= COMMA (sc= derived_column )?
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_statement3723); if (state.failed) return select;
                    	    if ( state.backtracking==0 ) {
                    	       sc=null; 
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:669:30: (sc= derived_column )?
                    	    int alt83=2;
                    	    int LA83_0 = input.LA(1);

                    	    if ( (LA83_0==APPROXIMATE_NUM_LIT||LA83_0==MINUS_SIGN||LA83_0==ARGUMENT_ID||LA83_0==BYTES||LA83_0==DATE||LA83_0==GUID||LA83_0==REGULAR_ID||LA83_0==LEFT_PAREN||(LA83_0>=COUNT && LA83_0<=MIN)||(LA83_0>=H_LV && LA83_0<=H_AID)||(LA83_0>=COALESCE && LA83_0<=CASE)||(LA83_0>=TRUE && LA83_0<=EXACT_NUM_LIT)||LA83_0==DELIMITED_ID||LA83_0==DATA||LA83_0==LENGTH||(LA83_0>=MORE && LA83_0<=NAME)||LA83_0==NULLABLE||LA83_0==NUMBER||LA83_0==REPEATABLE||LA83_0==SCALE||LA83_0==SERIALIZABLE||(LA83_0>=TYPE && LA83_0<=UNCOMMITTED)||LA83_0==UNNAMED) ) {
                    	        alt83=1;
                    	    }
                    	    switch (alt83) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:669:31: sc= derived_column
                    	            {
                    	            pushFollow(FOLLOW_derived_column_in_select_statement3730);
                    	            sc=derived_column();

                    	            state._fsp--;
                    	            if (state.failed) return select;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       if(sc!=null) {
                    	                    select.add(sc); 
                    	      		       } else {
                    	                    select.add(null); 
                    	                    select.updatePosition(getPos(c)); 
                    	                    reportError(ParseWarningKinds.KIND_MISS_COLUMN,"Unwanted comma here",getPos(c));
                    	      		       }
                    	      		     
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                    if(pc==null) {
                          reportError(ParseWarningKinds.KIND_MISS_COLUMN,"Column(s) required after select",getPos(s));
                    }
                 
            }

            }

        }

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
        finally {
        }
        return select;
    }
    // $ANTLR end "select_statement"


    // $ANTLR start "derived_column"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:687:1: derived_column returns [DerivedColumn column=null] : e= value_exp alias_spec[column] ;
    public final DerivedColumn derived_column() throws RecognitionException {
        DerivedColumn column = null;

        ValueExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:688:3: (e= value_exp alias_spec[column] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:688:5: e= value_exp alias_spec[column]
            {
            pushFollow(FOLLOW_value_exp_in_derived_column3782);
            e=value_exp();

            state._fsp--;
            if (state.failed) return column;
            if ( state.backtracking==0 ) {
               column =new DerivedColumn(getPos(e),e); 
            }
            pushFollow(FOLLOW_alias_spec_in_derived_column3794);
            alias_spec(column);

            state._fsp--;
            if (state.failed) return column;

            }

        }

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
        finally {
        }
        return column;
    }
    // $ANTLR end "derived_column"


    // $ANTLR start "from_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:693:1: from_statement returns [FromStatement from=null] : ( FROM )=> (f= FROM ) (pt= table_ref_statement (c= COMMA (t= table_ref_statement )? )* )? ;
    public final FromStatement from_statement() throws RecognitionException {
        FromStatement from = null;

        Token f=null;
        Token c=null;
        TableReferenceStatement pt = null;

        TableReferenceStatement t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:694:3: ( ( FROM )=> (f= FROM ) (pt= table_ref_statement (c= COMMA (t= table_ref_statement )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:694:5: ( FROM )=> (f= FROM ) (pt= table_ref_statement (c= COMMA (t= table_ref_statement )? )* )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:694:13: (f= FROM )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:694:14: f= FROM
            {
            f=(Token)match(input,FROM,FOLLOW_FROM_in_from_statement3820); if (state.failed) return from;

            }

            if ( state.backtracking==0 ) {
               from =new FromStatement(getPos(f)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:695:3: (pt= table_ref_statement (c= COMMA (t= table_ref_statement )? )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==REGULAR_ID||LA88_0==LEFT_PAREN||LA88_0==DELIMITED_ID||LA88_0==DATA||LA88_0==LENGTH||(LA88_0>=MORE && LA88_0<=NAME)||LA88_0==NULLABLE||LA88_0==NUMBER||LA88_0==REPEATABLE||LA88_0==SCALE||LA88_0==SERIALIZABLE||(LA88_0>=TYPE && LA88_0<=UNCOMMITTED)||LA88_0==UNNAMED) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:696:4: pt= table_ref_statement (c= COMMA (t= table_ref_statement )? )*
                    {
                    pushFollow(FOLLOW_table_ref_statement_in_from_statement3834);
                    pt=table_ref_statement();

                    state._fsp--;
                    if (state.failed) return from;
                    if ( state.backtracking==0 ) {
                       from.add(pt); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:697:4: (c= COMMA (t= table_ref_statement )? )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:697:5: c= COMMA (t= table_ref_statement )?
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_from_statement3844); if (state.failed) return from;
                    	    if ( state.backtracking==0 ) {
                    	       t=null; 
                    	    }
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:697:25: (t= table_ref_statement )?
                    	    int alt86=2;
                    	    int LA86_0 = input.LA(1);

                    	    if ( (LA86_0==REGULAR_ID||LA86_0==LEFT_PAREN||LA86_0==DELIMITED_ID||LA86_0==DATA||LA86_0==LENGTH||(LA86_0>=MORE && LA86_0<=NAME)||LA86_0==NULLABLE||LA86_0==NUMBER||LA86_0==REPEATABLE||LA86_0==SCALE||LA86_0==SERIALIZABLE||(LA86_0>=TYPE && LA86_0<=UNCOMMITTED)||LA86_0==UNNAMED) ) {
                    	        alt86=1;
                    	    }
                    	    switch (alt86) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:697:26: t= table_ref_statement
                    	            {
                    	            pushFollow(FOLLOW_table_ref_statement_in_from_statement3851);
                    	            t=table_ref_statement();

                    	            state._fsp--;
                    	            if (state.failed) return from;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       if(t!=null) from.add(t);
                    	              else {
                    	                from.add(null);
                    	                from.updatePosition(getPos(c));
                    	                reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"Unwanted comma here",getPos(c));
                    	              }
                    	            
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                    if(pt==null) {
                          reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"Table reference(s) required after from",getPos(f));
                    }
                 
            }

            }

        }

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
        finally {
        }
        return from;
    }
    // $ANTLR end "from_statement"


    // $ANTLR start "table_ref_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:714:1: table_ref_statement returns [TableReferenceStatement trs=null] : ( table_ref_aux )=> (t= table_ref_aux ) (j= table_join[trs] )* ;
    public final TableReferenceStatement table_ref_statement() throws RecognitionException {
        TableReferenceStatement trs = null;

        ResultSetReferenceBase t = null;

        TableJoinStatementBase j = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:715:3: ( ( table_ref_aux )=> (t= table_ref_aux ) (j= table_join[trs] )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:715:5: ( table_ref_aux )=> (t= table_ref_aux ) (j= table_join[trs] )*
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:715:23: (t= table_ref_aux )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:715:24: t= table_ref_aux
            {
            pushFollow(FOLLOW_table_ref_aux_in_table_ref_statement3904);
            t=table_ref_aux();

            state._fsp--;
            if (state.failed) return trs;
            if ( state.backtracking==0 ) {
               trs =t;  
            }

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:716:5: (j= table_join[trs] )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=JOIN && LA89_0<=FULL)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:716:7: j= table_join[trs]
            	    {
            	    pushFollow(FOLLOW_table_join_in_table_ref_statement3917);
            	    j=table_join(trs);

            	    state._fsp--;
            	    if (state.failed) return trs;
            	    if ( state.backtracking==0 ) {
            	       if(j!=null) trs =j; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return trs;
    }
    // $ANTLR end "table_ref_statement"


    // $ANTLR start "table_join"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:719:1: table_join[TableReferenceStatement trp] returns [TableJoinStatementBase trs=null] : ( ( table_join_type JOIN )=> (o= table_join_type j= JOIN ) t= table_ref_statement s= table_join_spec | ( table_join_type RELATE )=> (o= table_join_type j= RELATE ) r= table_relation ) ;
    public final TableJoinStatementBase table_join(TableReferenceStatement trp) throws RecognitionException {
        TableJoinStatementBase trs = null;

        Token j=null;
        Token o = null;

        TableReferenceStatement t = null;

        ConditionExpression s = null;

        TableRelation r = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:720:3: ( ( ( table_join_type JOIN )=> (o= table_join_type j= JOIN ) t= table_ref_statement s= table_join_spec | ( table_join_type RELATE )=> (o= table_join_type j= RELATE ) r= table_relation ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:3: ( ( table_join_type JOIN )=> (o= table_join_type j= JOIN ) t= table_ref_statement s= table_join_spec | ( table_join_type RELATE )=> (o= table_join_type j= RELATE ) r= table_relation )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:3: ( ( table_join_type JOIN )=> (o= table_join_type j= JOIN ) t= table_ref_statement s= table_join_spec | ( table_join_type RELATE )=> (o= table_join_type j= RELATE ) r= table_relation )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LEFT) ) {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==JOIN) && (synpred43_DnaSqlQuery())) {
                    alt90=1;
                }
                else if ( (LA90_1==RELATE) && (synpred44_DnaSqlQuery())) {
                    alt90=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return trs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA90_0==RIGHT) ) {
                int LA90_2 = input.LA(2);

                if ( (LA90_2==JOIN) && (synpred43_DnaSqlQuery())) {
                    alt90=1;
                }
                else if ( (LA90_2==RELATE) && (synpred44_DnaSqlQuery())) {
                    alt90=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return trs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA90_0==FULL) ) {
                int LA90_3 = input.LA(2);

                if ( (LA90_3==RELATE) && (synpred44_DnaSqlQuery())) {
                    alt90=2;
                }
                else if ( (LA90_3==JOIN) && (synpred43_DnaSqlQuery())) {
                    alt90=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return trs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA90_0==JOIN) && (synpred43_DnaSqlQuery())) {
                alt90=1;
            }
            else if ( (LA90_0==RELATE) && (synpred44_DnaSqlQuery())) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return trs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:4: ( table_join_type JOIN )=> (o= table_join_type j= JOIN ) t= table_ref_statement s= table_join_spec
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:28: (o= table_join_type j= JOIN )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:29: o= table_join_type j= JOIN
                    {
                    pushFollow(FOLLOW_table_join_type_in_table_join3955);
                    o=table_join_type();

                    state._fsp--;
                    if (state.failed) return trs;
                    j=(Token)match(input,JOIN,FOLLOW_JOIN_in_table_join3959); if (state.failed) return trs;

                    }

                    pushFollow(FOLLOW_table_ref_statement_in_table_join3964);
                    t=table_ref_statement();

                    state._fsp--;
                    if (state.failed) return trs;
                    pushFollow(FOLLOW_table_join_spec_in_table_join3968);
                    s=table_join_spec();

                    state._fsp--;
                    if (state.failed) return trs;
                    if ( state.backtracking==0 ) {
                       trs =new TableJoinStatement(getPos(trp),trp,0,getPos(j),t,s,getPos(s));
                              trs.setJoinType(TableJoinStatementBase.getJoinType(getText(o)),getPos(o)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:724:5: ( table_join_type RELATE )=> (o= table_join_type j= RELATE ) r= table_relation
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:724:31: (o= table_join_type j= RELATE )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:724:32: o= table_join_type j= RELATE
                    {
                    pushFollow(FOLLOW_table_join_type_in_table_join3992);
                    o=table_join_type();

                    state._fsp--;
                    if (state.failed) return trs;
                    j=(Token)match(input,RELATE,FOLLOW_RELATE_in_table_join3996); if (state.failed) return trs;

                    }

                    pushFollow(FOLLOW_table_relation_in_table_join4001);
                    r=table_relation();

                    state._fsp--;
                    if (state.failed) return trs;
                    if ( state.backtracking==0 ) {
                       trs =new TableRelationStatement(getPos(trp),trp,0,getPos(j),r,getPos(r));
                              trs.setJoinType(TableJoinStatementBase.getJoinType(getText(o)),getPos(o)); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return trs;
    }
    // $ANTLR end "table_join"


    // $ANTLR start "table_relation"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:730:1: table_relation returns [TableRelation tr=null] : t= table_ref_ref n= relation_spec table_ref_alias_spec[tr] table_modifier[tr] ;
    public final TableRelation table_relation() throws RecognitionException {
        TableRelation tr = null;

        TableRefReference t = null;

        Token n = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:731:3: (t= table_ref_ref n= relation_spec table_ref_alias_spec[tr] table_modifier[tr] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:731:5: t= table_ref_ref n= relation_spec table_ref_alias_spec[tr] table_modifier[tr]
            {
            pushFollow(FOLLOW_table_ref_ref_in_table_relation4035);
            t=table_ref_ref();

            state._fsp--;
            if (state.failed) return tr;
            pushFollow(FOLLOW_relation_spec_in_table_relation4039);
            n=relation_spec();

            state._fsp--;
            if (state.failed) return tr;
            if ( state.backtracking==0 ) {
               tr =new TableRelation(getPos(t), t, getTokenNode(n),false, getPos(n));
                 
            }
            pushFollow(FOLLOW_table_ref_alias_spec_in_table_relation4049);
            table_ref_alias_spec(tr);

            state._fsp--;
            if (state.failed) return tr;
            pushFollow(FOLLOW_table_modifier_in_table_relation4055);
            table_modifier(tr);

            state._fsp--;
            if (state.failed) return tr;

            }

        }

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
        finally {
        }
        return tr;
    }
    // $ANTLR end "table_relation"


    // $ANTLR start "relation_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:738:1: relation_spec returns [Token rel=null] : PERIOD n= id ;
    public final Token relation_spec() throws RecognitionException {
        Token rel = null;

        Token n = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:739:3: ( PERIOD n= id )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:739:5: PERIOD n= id
            {
            match(input,PERIOD,FOLLOW_PERIOD_in_relation_spec4072); if (state.failed) return rel;
            pushFollow(FOLLOW_id_in_relation_spec4076);
            n=id();

            state._fsp--;
            if (state.failed) return rel;
            if ( state.backtracking==0 ) {
               rel =n; 
            }

            }

        }

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
        finally {
        }
        return rel;
    }
    // $ANTLR end "relation_spec"


    // $ANTLR start "table_join_type"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:742:1: table_join_type returns [Token type=null] : (t= LEFT | t= RIGHT | t= FULL )? ;
    public final Token table_join_type() throws RecognitionException {
        Token type = null;

        Token t=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:743:3: ( (t= LEFT | t= RIGHT | t= FULL )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:744:3: (t= LEFT | t= RIGHT | t= FULL )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:744:3: (t= LEFT | t= RIGHT | t= FULL )?
            int alt91=4;
            switch ( input.LA(1) ) {
                case LEFT:
                    {
                    alt91=1;
                    }
                    break;
                case RIGHT:
                    {
                    alt91=2;
                    }
                    break;
                case FULL:
                    {
                    alt91=3;
                    }
                    break;
            }

            switch (alt91) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:744:5: t= LEFT
                    {
                    t=(Token)match(input,LEFT,FOLLOW_LEFT_in_table_join_type4100); if (state.failed) return type;
                    if ( state.backtracking==0 ) {
                       type = t; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:745:5: t= RIGHT
                    {
                    t=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_table_join_type4112); if (state.failed) return type;
                    if ( state.backtracking==0 ) {
                       type = t; 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:746:5: t= FULL
                    {
                    t=(Token)match(input,FULL,FOLLOW_FULL_in_table_join_type4123); if (state.failed) return type;
                    if ( state.backtracking==0 ) {
                       type = t; 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return type;
    }
    // $ANTLR end "table_join_type"


    // $ANTLR start "table_join_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:750:1: table_join_spec returns [ConditionExpression ce=null] : ON c= condition_exp ;
    public final ConditionExpression table_join_spec() throws RecognitionException {
        ConditionExpression ce = null;

        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:751:3: ( ON c= condition_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:751:5: ON c= condition_exp
            {
            match(input,ON,FOLLOW_ON_in_table_join_spec4149); if (state.failed) return ce;
            pushFollow(FOLLOW_condition_exp_in_table_join_spec4153);
            c=condition_exp();

            state._fsp--;
            if (state.failed) return ce;
            if ( state.backtracking==0 ) {
               ce =c; 
            }

            }

        }

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
        finally {
        }
        return ce;
    }
    // $ANTLR end "table_join_spec"


    // $ANTLR start "table_ref_aux"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:754:1: table_ref_aux returns [ResultSetReferenceBase tr=null] : (trs= table_ref_simple | qrs= query_ref_simple ) table_modifier[tr] ;
    public final ResultSetReferenceBase table_ref_aux() throws RecognitionException {
        ResultSetReferenceBase tr = null;

        TableReference trs = null;

        SubQueryReference qrs = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:755:3: ( (trs= table_ref_simple | qrs= query_ref_simple ) table_modifier[tr] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:755:5: (trs= table_ref_simple | qrs= query_ref_simple ) table_modifier[tr]
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:755:5: (trs= table_ref_simple | qrs= query_ref_simple )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==REGULAR_ID||LA92_0==DELIMITED_ID||LA92_0==DATA||LA92_0==LENGTH||(LA92_0>=MORE && LA92_0<=NAME)||LA92_0==NULLABLE||LA92_0==NUMBER||LA92_0==REPEATABLE||LA92_0==SCALE||LA92_0==SERIALIZABLE||(LA92_0>=TYPE && LA92_0<=UNCOMMITTED)||LA92_0==UNNAMED) ) {
                alt92=1;
            }
            else if ( (LA92_0==LEFT_PAREN) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:755:6: trs= table_ref_simple
                    {
                    pushFollow(FOLLOW_table_ref_simple_in_table_ref_aux4174);
                    trs=table_ref_simple();

                    state._fsp--;
                    if (state.failed) return tr;
                    if ( state.backtracking==0 ) {
                       tr = trs; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:757:6: qrs= query_ref_simple
                    {
                    pushFollow(FOLLOW_query_ref_simple_in_table_ref_aux4189);
                    qrs=query_ref_simple();

                    state._fsp--;
                    if (state.failed) return tr;
                    if ( state.backtracking==0 ) {
                       tr = qrs; 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_table_modifier_in_table_ref_aux4206);
            table_modifier(tr);

            state._fsp--;
            if (state.failed) return tr;

            }

        }

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
        finally {
        }
        return tr;
    }
    // $ANTLR end "table_ref_aux"


    // $ANTLR start "table_ref_simple"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:763:1: table_ref_simple returns [TableReference tr=null] : n= table_name table_ref_alias_spec[tr] ;
    public final TableReference table_ref_simple() throws RecognitionException {
        TableReference tr = null;

        Token n = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:764:3: (n= table_name table_ref_alias_spec[tr] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:764:5: n= table_name table_ref_alias_spec[tr]
            {
            pushFollow(FOLLOW_table_name_in_table_ref_simple4227);
            n=table_name();

            state._fsp--;
            if (state.failed) return tr;
            if ( state.backtracking==0 ) {
               
                   tr =new TableReference(getPos(n),getTokenNode(n),false,null);
                 
            }
            pushFollow(FOLLOW_table_ref_alias_spec_in_table_ref_simple4237);
            table_ref_alias_spec(tr);

            state._fsp--;
            if (state.failed) return tr;

            }

        }

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
        finally {
        }
        return tr;
    }
    // $ANTLR end "table_ref_simple"


    // $ANTLR start "table_ref_alias_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:771:1: table_ref_alias_spec[TableReference tr] : (as= AS (al= id )? )? ;
    public final void table_ref_alias_spec(TableReference tr) throws RecognitionException {
        Token as=null;
        Token al = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:3: ( (as= AS (al= id )? )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:5: (as= AS (al= id )? )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:5: (as= AS (al= id )? )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==AS) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:6: as= AS (al= id )?
                    {
                    as=(Token)match(input,AS,FOLLOW_AS_in_table_ref_alias_spec4257); if (state.failed) return ;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:12: (al= id )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==REGULAR_ID||LA93_0==DELIMITED_ID||LA93_0==DATA||LA93_0==LENGTH||(LA93_0>=MORE && LA93_0<=NAME)||LA93_0==NULLABLE||LA93_0==NUMBER||LA93_0==REPEATABLE||LA93_0==SCALE||LA93_0==SERIALIZABLE||(LA93_0>=TYPE && LA93_0<=UNCOMMITTED)||LA93_0==UNNAMED) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:772:13: al= id
                            {
                            pushFollow(FOLLOW_id_in_table_ref_alias_spec4262);
                            al=id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                   if(al!=null) {
                       tr.setAlias(getText(al),getPos(al));
                   } else {
                       reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required after "+ (as==null?tr.getTargetName():getText(as)),as==null?getPos(tr):getPos(as));
                   }
                  
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "table_ref_alias_spec"


    // $ANTLR start "query_ref_simple"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:782:1: query_ref_simple returns [SubQueryReference sqr] : sq= subquery query_ref_alias_spec[sqr] ;
    public final SubQueryReference query_ref_simple() throws RecognitionException {
        SubQueryReference sqr = null;

        SubQueryStatement sq = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:783:3: (sq= subquery query_ref_alias_spec[sqr] )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:783:5: sq= subquery query_ref_alias_spec[sqr]
            {
            pushFollow(FOLLOW_subquery_in_query_ref_simple4294);
            sq=subquery();

            state._fsp--;
            if (state.failed) return sqr;
            if ( state.backtracking==0 ) {
               
                   sqr =new SubQueryReference(sq,false);
                 
            }
            pushFollow(FOLLOW_query_ref_alias_spec_in_query_ref_simple4304);
            query_ref_alias_spec(sqr);

            state._fsp--;
            if (state.failed) return sqr;

            }

        }

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
        finally {
        }
        return sqr;
    }
    // $ANTLR end "query_ref_simple"


    // $ANTLR start "query_ref_alias_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:790:1: query_ref_alias_spec[SubQueryReference sqr] : (as= AS (al= id )? )? ;
    public final void query_ref_alias_spec(SubQueryReference sqr) throws RecognitionException {
        Token as=null;
        Token al = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:3: ( (as= AS (al= id )? )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:5: (as= AS (al= id )? )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:5: (as= AS (al= id )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==AS) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:6: as= AS (al= id )?
                    {
                    as=(Token)match(input,AS,FOLLOW_AS_in_query_ref_alias_spec4324); if (state.failed) return ;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:12: (al= id )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==REGULAR_ID||LA95_0==DELIMITED_ID||LA95_0==DATA||LA95_0==LENGTH||(LA95_0>=MORE && LA95_0<=NAME)||LA95_0==NULLABLE||LA95_0==NUMBER||LA95_0==REPEATABLE||LA95_0==SCALE||LA95_0==SERIALIZABLE||(LA95_0>=TYPE && LA95_0<=UNCOMMITTED)||LA95_0==UNNAMED) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:791:13: al= id
                            {
                            pushFollow(FOLLOW_id_in_query_ref_alias_spec4329);
                            al=id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                   if(al!=null) {
                       sqr.setAlias(getText(al),getPos(al));
                   } else if(as!=null) {
                       reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required after "+ getText(as), getPos(as));
                   } else {
                       int pos = sqr.getSubquery().getPosition().getEnd();
                       reportError(ParseWarningKinds.KIND_TABLE_ALIAS_REQUIRED,"alias required", getEmptyPos(pos));
                   }
                  
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "query_ref_alias_spec"


    // $ANTLR start "alias_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:804:1: alias_spec[IAliasHolder ah] : (as= AS (al= id )? )? ;
    public final void alias_spec(IAliasHolder ah) throws RecognitionException {
        Token as=null;
        Token al = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:3: ( (as= AS (al= id )? )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:5: (as= AS (al= id )? )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:5: (as= AS (al= id )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==AS) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:6: as= AS (al= id )?
                    {
                    as=(Token)match(input,AS,FOLLOW_AS_in_alias_spec4359); if (state.failed) return ;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:12: (al= id )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==REGULAR_ID||LA97_0==DELIMITED_ID||LA97_0==DATA||LA97_0==LENGTH||(LA97_0>=MORE && LA97_0<=NAME)||LA97_0==NULLABLE||LA97_0==NUMBER||LA97_0==REPEATABLE||LA97_0==SCALE||LA97_0==SERIALIZABLE||(LA97_0>=TYPE && LA97_0<=UNCOMMITTED)||LA97_0==UNNAMED) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:805:13: al= id
                            {
                            pushFollow(FOLLOW_id_in_alias_spec4364);
                            al=id();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                     if(as!=null) {
                         ah.setAs(getTokenNode(as));
                     }
              	     if(al!=null) {
              	         ah.setAlias(getTokenNode(al));
              	     } else if(as!=null||ah.getAliasTarget()!=null) {
              	         reportError(ParseWarningKinds.KIND_ALIAS_REQUIRED,"alias required after "+ (as!=null?getText(as):ah.getAliasTarget().getTexture()),as!=null?getPos(as):getPos(ah.getAliasTarget()));
              	     } else {
              	         reportError(ParseWarningKinds.KIND_ALIAS_REQUIRED,"alias required",getPos(ah));
              	     }
                  
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "alias_spec"


    // $ANTLR start "table_modifier"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:820:1: table_modifier[ResultSetReferenceBase tr] : ( FOR u= UPDATE | );
    public final void table_modifier(ResultSetReferenceBase tr) throws RecognitionException {
        Token u=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:821:3: ( FOR u= UPDATE | )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==FOR) ) {
                alt99=1;
            }
            else if ( (LA99_0==EOF||LA99_0==RIGHT_PAREN||LA99_0==COMMA||LA99_0==END||LA99_0==UNION||(LA99_0>=JOIN && LA99_0<=ON)||LA99_0==WHERE||LA99_0==GROUP||LA99_0==ORDER||LA99_0==SET) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:821:5: FOR u= UPDATE
                    {
                    match(input,FOR,FOLLOW_FOR_in_table_modifier4389); if (state.failed) return ;
                    u=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_table_modifier4393); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(tr!=null) tr.setForUpdate(true,getPos(u)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:823:3: 
                    {
                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "table_modifier"


    // $ANTLR start "table_name"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:825:1: table_name returns [Token name=null] : t= id ;
    public final Token table_name() throws RecognitionException {
        Token name = null;

        Token t = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:826:3: (t= id )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:826:5: t= id
            {
            pushFollow(FOLLOW_id_in_table_name4417);
            t=id();

            state._fsp--;
            if (state.failed) return name;
            if ( state.backtracking==0 ) {
               name = t; 
            }

            }

        }

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
        finally {
        }
        return name;
    }
    // $ANTLR end "table_name"


    // $ANTLR start "where_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:829:1: where_statement returns [WhereStatement where=null] : ( WHERE )=> (w= WHERE ) (c= condition_exp )? ;
    public final WhereStatement where_statement() throws RecognitionException {
        WhereStatement where = null;

        Token w=null;
        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:3: ( ( WHERE )=> (w= WHERE ) (c= condition_exp )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:5: ( WHERE )=> (w= WHERE ) (c= condition_exp )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:14: (w= WHERE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:15: w= WHERE
            {
            w=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_statement4444); if (state.failed) return where;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:24: (c= condition_exp )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==APPROXIMATE_NUM_LIT||LA100_0==MINUS_SIGN||(LA100_0>=NOT_EQUALS_OP && LA100_0<=ARGUMENT_ID)||(LA100_0>=LESS_THAN_OP && LA100_0<=GREATER_THAN_OP)||LA100_0==BYTES||LA100_0==DATE||LA100_0==GUID||LA100_0==REGULAR_ID||(LA100_0>=NOT && LA100_0<=NULL)||LA100_0==LEFT_PAREN||(LA100_0>=COUNT && LA100_0<=MIN)||(LA100_0>=H_LV && LA100_0<=H_AID)||(LA100_0>=COALESCE && LA100_0<=CASE)||(LA100_0>=TRUE && LA100_0<=EXACT_NUM_LIT)||(LA100_0>=EXISTS && LA100_0<=LIKE)||(LA100_0>=STARTS_WITH && LA100_0<=DELIMITED_ID)||LA100_0==DATA||LA100_0==LENGTH||(LA100_0>=MORE && LA100_0<=NAME)||LA100_0==NULLABLE||LA100_0==NUMBER||LA100_0==REPEATABLE||LA100_0==SCALE||LA100_0==SERIALIZABLE||(LA100_0>=TYPE && LA100_0<=UNCOMMITTED)||LA100_0==UNNAMED) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:830:25: c= condition_exp
                    {
                    pushFollow(FOLLOW_condition_exp_in_where_statement4450);
                    c=condition_exp();

                    state._fsp--;
                    if (state.failed) return where;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               where =new WhereStatement(getPos(w),null);
                   if(c!=null) {
                      where.setConditionExpression(c);
                   } else {
                       reportError(ParseWarningKinds.KIND_MISS_CONDITION,"Condition expression required after where",getPos(w));
                   }
                 
            }

            }

        }

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
        finally {
        }
        return where;
    }
    // $ANTLR end "where_statement"


    // $ANTLR start "hierarchy_predicate"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:840:1: hierarchy_predicate returns [HierarchyPredicate hp=null] : t= table_ref_ref ( ( hierachy_direct_op )=> (op= hierachy_direct_op ) r= table_ref_ref hierachy_using[hp] | ( hierachy_relative_op )=> (op= hierachy_relative_op ) r= table_ref_ref hierachy_using[hp] ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )? | ( IS LEAF )=> (i= IS l= LEAF ) USING h= id ) ;
    public final HierarchyPredicate hierarchy_predicate() throws RecognitionException {
        HierarchyPredicate hp = null;

        Token l=null;
        Token i=null;
        TableRefReference t = null;

        Token op = null;

        TableRefReference r = null;

        ValueExpression v = null;

        Token h = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:841:3: (t= table_ref_ref ( ( hierachy_direct_op )=> (op= hierachy_direct_op ) r= table_ref_ref hierachy_using[hp] | ( hierachy_relative_op )=> (op= hierachy_relative_op ) r= table_ref_ref hierachy_using[hp] ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )? | ( IS LEAF )=> (i= IS l= LEAF ) USING h= id ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:841:5: t= table_ref_ref ( ( hierachy_direct_op )=> (op= hierachy_direct_op ) r= table_ref_ref hierachy_using[hp] | ( hierachy_relative_op )=> (op= hierachy_relative_op ) r= table_ref_ref hierachy_using[hp] ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )? | ( IS LEAF )=> (i= IS l= LEAF ) USING h= id )
            {
            pushFollow(FOLLOW_table_ref_ref_in_hierarchy_predicate4477);
            t=table_ref_ref();

            state._fsp--;
            if (state.failed) return hp;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:842:3: ( ( hierachy_direct_op )=> (op= hierachy_direct_op ) r= table_ref_ref hierachy_using[hp] | ( hierachy_relative_op )=> (op= hierachy_relative_op ) r= table_ref_ref hierachy_using[hp] ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )? | ( IS LEAF )=> (i= IS l= LEAF ) USING h= id )
            int alt102=3;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==CHILDOF) && (synpred46_DnaSqlQuery())) {
                alt102=1;
            }
            else if ( (LA102_0==PARENTOF) && (synpred46_DnaSqlQuery())) {
                alt102=1;
            }
            else if ( (LA102_0==DESCENDANTOF) && (synpred47_DnaSqlQuery())) {
                alt102=2;
            }
            else if ( (LA102_0==ANCESTOROF) && (synpred47_DnaSqlQuery())) {
                alt102=2;
            }
            else if ( (LA102_0==IS) && (synpred50_DnaSqlQuery())) {
                alt102=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return hp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:843:22: ( hierachy_direct_op )=> (op= hierachy_direct_op ) r= table_ref_ref hierachy_using[hp]
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:843:44: (op= hierachy_direct_op )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:843:45: op= hierachy_direct_op
                    {
                    pushFollow(FOLLOW_hierachy_direct_op_in_hierarchy_predicate4499);
                    op=hierachy_direct_op();

                    state._fsp--;
                    if (state.failed) return hp;

                    }

                    pushFollow(FOLLOW_table_ref_ref_in_hierarchy_predicate4504);
                    r=table_ref_ref();

                    state._fsp--;
                    if (state.failed) return hp;
                    if ( state.backtracking==0 ) {
                       hp =new HierarchyPredicate(getPos(t),t,getText(op),r,false,getPos(r)); 
                    }
                    pushFollow(FOLLOW_hierachy_using_in_hierarchy_predicate4518);
                    hierachy_using(hp);

                    state._fsp--;
                    if (state.failed) return hp;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:847:6: ( hierachy_relative_op )=> (op= hierachy_relative_op ) r= table_ref_ref hierachy_using[hp] ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )?
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:847:30: (op= hierachy_relative_op )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:847:31: op= hierachy_relative_op
                    {
                    pushFollow(FOLLOW_hierachy_relative_op_in_hierarchy_predicate4537);
                    op=hierachy_relative_op();

                    state._fsp--;
                    if (state.failed) return hp;

                    }

                    pushFollow(FOLLOW_table_ref_ref_in_hierarchy_predicate4542);
                    r=table_ref_ref();

                    state._fsp--;
                    if (state.failed) return hp;
                    if ( state.backtracking==0 ) {
                       hp =new HierarchyPredicate(getPos(t),t,getText(op),r,false,getPos(r)); 
                    }
                    pushFollow(FOLLOW_hierachy_using_in_hierarchy_predicate4556);
                    hierachy_using(hp);

                    state._fsp--;
                    if (state.failed) return hp;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:6: ( ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp ) | ( ( RANGE )=> (l= RANGE ) v= value_exp ) )?
                    int alt101=3;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==RELATIVE) && (synpred48_DnaSqlQuery())) {
                        alt101=1;
                    }
                    else if ( (LA101_0==RANGE) && (synpred49_DnaSqlQuery())) {
                        alt101=2;
                    }
                    switch (alt101) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:8: ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp )
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:8: ( ( RELATIVE )=> (l= RELATIVE ) v= value_exp )
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:9: ( RELATIVE )=> (l= RELATIVE ) v= value_exp
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:21: (l= RELATIVE )
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:22: l= RELATIVE
                            {
                            l=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_hierarchy_predicate4580); if (state.failed) return hp;

                            }

                            pushFollow(FOLLOW_value_exp_in_hierarchy_predicate4585);
                            v=value_exp();

                            state._fsp--;
                            if (state.failed) return hp;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:8: ( ( RANGE )=> (l= RANGE ) v= value_exp )
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:8: ( ( RANGE )=> (l= RANGE ) v= value_exp )
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:9: ( RANGE )=> (l= RANGE ) v= value_exp
                            {
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:18: (l= RANGE )
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:19: l= RANGE
                            {
                            l=(Token)match(input,RANGE,FOLLOW_RANGE_in_hierarchy_predicate4604); if (state.failed) return hp;

                            }

                            pushFollow(FOLLOW_value_exp_in_hierarchy_predicate4609);
                            v=value_exp();

                            state._fsp--;
                            if (state.failed) return hp;

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              if(v!=null) {
                                 hp.setLimit(getTokenNode(l),v);
                              } else if(l!=null) {
                                 hp.updatePosition(getPos(l));
                              }
                             
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:862:6: ( IS LEAF )=> (i= IS l= LEAF ) USING h= id
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:862:17: (i= IS l= LEAF )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:862:18: i= IS l= LEAF
                    {
                    i=(Token)match(input,IS,FOLLOW_IS_in_hierarchy_predicate4651); if (state.failed) return hp;
                    l=(Token)match(input,LEAF,FOLLOW_LEAF_in_hierarchy_predicate4655); if (state.failed) return hp;

                    }

                    if ( state.backtracking==0 ) {
                       hp =new HierarchyPredicate(getPos(t),t,HierarchyPredicate.OPERATOR_IS_LEAF,null,false,getPos(h)); 
                    }
                    match(input,USING,FOLLOW_USING_in_hierarchy_predicate4672); if (state.failed) return hp;
                    pushFollow(FOLLOW_id_in_hierarchy_predicate4676);
                    h=id();

                    state._fsp--;
                    if (state.failed) return hp;
                    if ( state.backtracking==0 ) {
                       hp.setHierarchys(new TokenNode[] { getTokenNode(h) }); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return hp;
    }
    // $ANTLR end "hierarchy_predicate"


    // $ANTLR start "hierachy_using"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:869:1: hierachy_using[HierarchyPredicate hp] : ( ( USING LEFT_PAREN )=> (u= USING l= LEFT_PAREN ) fh= id c= COMMA sh= id r= RIGHT_PAREN | ( USING )=> (u= USING ) h= id );
    public final void hierachy_using(HierarchyPredicate hp) throws RecognitionException {
        Token u=null;
        Token l=null;
        Token c=null;
        Token r=null;
        Token fh = null;

        Token sh = null;

        Token h = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:3: ( ( USING LEFT_PAREN )=> (u= USING l= LEFT_PAREN ) fh= id c= COMMA sh= id r= RIGHT_PAREN | ( USING )=> (u= USING ) h= id )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:5: ( USING LEFT_PAREN )=> (u= USING l= LEFT_PAREN ) fh= id c= COMMA sh= id r= RIGHT_PAREN
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:25: (u= USING l= LEFT_PAREN )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:26: u= USING l= LEFT_PAREN
                    {
                    u=(Token)match(input,USING,FOLLOW_USING_in_hierachy_using4713); if (state.failed) return ;
                    l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_hierachy_using4717); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       hp.setUsing(getTokenNode(u)); hp.updatePosition(getPos(l)); 
                    }
                    pushFollow(FOLLOW_id_in_hierachy_using4732);
                    fh=id();

                    state._fsp--;
                    if (state.failed) return ;
                    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_hierachy_using4736); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_hierachy_using4740);
                    sh=id();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       hp.setHierarchys(new TokenNode[] { getTokenNode(fh), getTokenNode(sh) });
                            hp.updatePosition(getPos(c));
                          
                    }
                    r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_hierachy_using4754); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       hp.updatePosition(getPos(r)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:878:5: ( USING )=> (u= USING ) h= id
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:878:14: (u= USING )
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:878:15: u= USING
                    {
                    u=(Token)match(input,USING,FOLLOW_USING_in_hierachy_using4773); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       hp.setUsing(getTokenNode(u)); 
                    }
                    pushFollow(FOLLOW_id_in_hierachy_using4788);
                    h=id();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       hp.setHierarchys(new TokenNode[] { getTokenNode(h) }); 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "hierachy_using"


    // $ANTLR start "hierachy_direct_op"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:884:1: hierachy_direct_op returns [Token op=null] : (o= CHILDOF | o= PARENTOF ) ;
    public final Token hierachy_direct_op() throws RecognitionException {
        Token op = null;

        Token o=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:885:3: ( (o= CHILDOF | o= PARENTOF ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:885:5: (o= CHILDOF | o= PARENTOF )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:885:5: (o= CHILDOF | o= PARENTOF )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==CHILDOF) ) {
                alt104=1;
            }
            else if ( (LA104_0==PARENTOF) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:885:7: o= CHILDOF
                    {
                    o=(Token)match(input,CHILDOF,FOLLOW_CHILDOF_in_hierachy_direct_op4814); if (state.failed) return op;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:886:7: o= PARENTOF
                    {
                    o=(Token)match(input,PARENTOF,FOLLOW_PARENTOF_in_hierachy_direct_op4824); if (state.failed) return op;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              op =o;
            }

            }

        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "hierachy_direct_op"


    // $ANTLR start "hierachy_relative_op"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:889:1: hierachy_relative_op returns [Token op=null] : (o= DESCENDANTOF | o= ANCESTOROF ) ;
    public final Token hierachy_relative_op() throws RecognitionException {
        Token op = null;

        Token o=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:890:3: ( (o= DESCENDANTOF | o= ANCESTOROF ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:890:5: (o= DESCENDANTOF | o= ANCESTOROF )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:890:5: (o= DESCENDANTOF | o= ANCESTOROF )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==DESCENDANTOF) ) {
                alt105=1;
            }
            else if ( (LA105_0==ANCESTOROF) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:890:7: o= DESCENDANTOF
                    {
                    o=(Token)match(input,DESCENDANTOF,FOLLOW_DESCENDANTOF_in_hierachy_relative_op4847); if (state.failed) return op;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:891:7: o= ANCESTOROF
                    {
                    o=(Token)match(input,ANCESTOROF,FOLLOW_ANCESTOROF_in_hierachy_relative_op4857); if (state.failed) return op;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              op =o;
            }

            }

        }

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
        finally {
        }
        return op;
    }
    // $ANTLR end "hierachy_relative_op"


    // $ANTLR start "group_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:894:1: group_statement returns [GroupStatement group=null] : ( GROUP BY )=> (g= GROUP b= BY ) pc= group_column ( COMMA sc= group_column )* ( group_property[group] )? ;
    public final GroupStatement group_statement() throws RecognitionException {
        GroupStatement group = null;

        Token g=null;
        Token b=null;
        GroupColumn pc = null;

        GroupColumn sc = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:895:3: ( ( GROUP BY )=> (g= GROUP b= BY ) pc= group_column ( COMMA sc= group_column )* ( group_property[group] )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:895:5: ( GROUP BY )=> (g= GROUP b= BY ) pc= group_column ( COMMA sc= group_column )* ( group_property[group] )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:895:17: (g= GROUP b= BY )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:895:18: g= GROUP b= BY
            {
            g=(Token)match(input,GROUP,FOLLOW_GROUP_in_group_statement4885); if (state.failed) return group;
            b=(Token)match(input,BY,FOLLOW_BY_in_group_statement4889); if (state.failed) return group;

            }

            if ( state.backtracking==0 ) {
               group =new GroupStatement(getPos(g)); group.updatePosition(getPos(b));
            }
            pushFollow(FOLLOW_group_column_in_group_statement4901);
            pc=group_column();

            state._fsp--;
            if (state.failed) return group;
            if ( state.backtracking==0 ) {
               group.add(pc); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:897:5: ( COMMA sc= group_column )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:897:6: COMMA sc= group_column
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_group_statement4910); if (state.failed) return group;
            	    if ( state.backtracking==0 ) {
            	       sc=null; 
            	    }
            	    pushFollow(FOLLOW_group_column_in_group_statement4916);
            	    sc=group_column();

            	    state._fsp--;
            	    if (state.failed) return group;
            	    if ( state.backtracking==0 ) {
            	       group.add(sc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:898:5: ( group_property[group] )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WITH) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:898:6: group_property[group]
                    {
                    pushFollow(FOLLOW_group_property_in_group_statement4927);
                    group_property(group);

                    state._fsp--;
                    if (state.failed) return group;

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return group;
    }
    // $ANTLR end "group_statement"


    // $ANTLR start "group_column"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:900:1: group_column returns [GroupColumn gc=null] : v= value_exp ;
    public final GroupColumn group_column() throws RecognitionException {
        GroupColumn gc = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:901:3: (v= value_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:901:5: v= value_exp
            {
            pushFollow(FOLLOW_value_exp_in_group_column4948);
            v=value_exp();

            state._fsp--;
            if (state.failed) return gc;
            if ( state.backtracking==0 ) {
               gc=new GroupColumn(getPos(v),v); 
            }

            }

        }

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
        finally {
        }
        return gc;
    }
    // $ANTLR end "group_column"


    // $ANTLR start "group_property"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:904:1: group_property[GroupStatement group] : ( WITH )=> ( WITH ) (p= ROLLUP | p= CUBE ) ;
    public final void group_property(GroupStatement group) throws RecognitionException {
        Token p=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:905:3: ( ( WITH )=> ( WITH ) (p= ROLLUP | p= CUBE ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:905:5: ( WITH )=> ( WITH ) (p= ROLLUP | p= CUBE )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:905:13: ( WITH )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:905:14: WITH
            {
            match(input,WITH,FOLLOW_WITH_in_group_property4972); if (state.failed) return ;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:906:6: (p= ROLLUP | p= CUBE )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ROLLUP) ) {
                alt108=1;
            }
            else if ( (LA108_0==CUBE) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:906:9: p= ROLLUP
                    {
                    p=(Token)match(input,ROLLUP,FOLLOW_ROLLUP_in_group_property4986); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(group!=null) group.setProperty(GroupStatement.PROPERTY_ROLLUP,getPos(p)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:907:9: p= CUBE
                    {
                    p=(Token)match(input,CUBE,FOLLOW_CUBE_in_group_property5000); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(group!=null) group.setProperty(GroupStatement.PROPERTY_CUBE,getPos(p)); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "group_property"


    // $ANTLR start "having_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:911:1: having_statement returns [HavingStatement having=null] : ( HAVING )=> (h= HAVING ) c= condition_exp ;
    public final HavingStatement having_statement() throws RecognitionException {
        HavingStatement having = null;

        Token h=null;
        ConditionExpression c = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:912:3: ( ( HAVING )=> (h= HAVING ) c= condition_exp )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:912:5: ( HAVING )=> (h= HAVING ) c= condition_exp
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:912:15: (h= HAVING )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:912:16: h= HAVING
            {
            h=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_statement5036); if (state.failed) return having;

            }

            pushFollow(FOLLOW_condition_exp_in_having_statement5041);
            c=condition_exp();

            state._fsp--;
            if (state.failed) return having;
            if ( state.backtracking==0 ) {
               having =new HavingStatement(getPos(h),null);
                   if(c!=null) {
                      having.setConditionExpression(c);
                   } else {
                      reportError(ParseWarningKinds.KIND_MISS_CONDITION,"Condition expression required after having",getPos(h));
                   }
                 
            }

            }

        }

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
        finally {
        }
        return having;
    }
    // $ANTLR end "having_statement"


    // $ANTLR start "order_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:922:1: order_statement returns [OrderStatement order=null] : ( ORDER BY )=> (o= ORDER BY ) e= order_expression ( COMMA e= order_expression )* ;
    public final OrderStatement order_statement() throws RecognitionException {
        OrderStatement order = null;

        Token o=null;
        OrderExpression e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:923:3: ( ( ORDER BY )=> (o= ORDER BY ) e= order_expression ( COMMA e= order_expression )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:923:5: ( ORDER BY )=> (o= ORDER BY ) e= order_expression ( COMMA e= order_expression )*
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:923:17: (o= ORDER BY )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:923:18: o= ORDER BY
            {
            o=(Token)match(input,ORDER,FOLLOW_ORDER_in_order_statement5074); if (state.failed) return order;
            match(input,BY,FOLLOW_BY_in_order_statement5076); if (state.failed) return order;

            }

            if ( state.backtracking==0 ) {
               order =new OrderStatement(getPos(o)); 
            }
            pushFollow(FOLLOW_order_expression_in_order_statement5087);
            e=order_expression();

            state._fsp--;
            if (state.failed) return order;
            if ( state.backtracking==0 ) {
               order.add(e); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:925:5: ( COMMA e= order_expression )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==COMMA) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:925:6: COMMA e= order_expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_order_statement5096); if (state.failed) return order;
            	    if ( state.backtracking==0 ) {
            	       e=null; 
            	    }
            	    pushFollow(FOLLOW_order_expression_in_order_statement5102);
            	    e=order_expression();

            	    state._fsp--;
            	    if (state.failed) return order;
            	    if ( state.backtracking==0 ) {
            	       order.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return order;
    }
    // $ANTLR end "order_statement"


    // $ANTLR start "order_expression"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:928:1: order_expression returns [OrderExpression oe=null] : v= value_exp ( ordering_spec[oe] )? ;
    public final OrderExpression order_expression() throws RecognitionException {
        OrderExpression oe = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:929:3: (v= value_exp ( ordering_spec[oe] )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:929:5: v= value_exp ( ordering_spec[oe] )?
            {
            pushFollow(FOLLOW_value_exp_in_order_expression5127);
            v=value_exp();

            state._fsp--;
            if (state.failed) return oe;
            if ( state.backtracking==0 ) {
               oe =new OrderExpression(getPos(v),v); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:929:69: ( ordering_spec[oe] )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=ASC && LA110_0<=DESC)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:929:70: ordering_spec[oe]
                    {
                    pushFollow(FOLLOW_ordering_spec_in_order_expression5132);
                    ordering_spec(oe);

                    state._fsp--;
                    if (state.failed) return oe;

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return oe;
    }
    // $ANTLR end "order_expression"


    // $ANTLR start "ordering_spec"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:932:1: ordering_spec[OrderExpression oe] : (d= ASC | d= DESC );
    public final void ordering_spec(OrderExpression oe) throws RecognitionException {
        Token d=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:933:3: (d= ASC | d= DESC )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ASC) ) {
                alt111=1;
            }
            else if ( (LA111_0==DESC) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:933:5: d= ASC
                    {
                    d=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_spec5151); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(oe!=null) oe.setDescrease(false,getPos(d)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:934:5: d= DESC
                    {
                    d=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_spec5162); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       if(oe!=null) oe.setDescrease(true,getPos(d)); 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "ordering_spec"


    // $ANTLR start "mapping_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:938:1: mapping_declare returns [MappingDeclaration orm=null] : ( DEFINE ORM )=> (d= DEFINE q= ORM ) n= id argument_list[orm] (m= mapping_statement BEGIN (wis= with_statement )? query_statement[orm] | mo= mapping_override BEGIN (w= where_statement )? (h= having_statement )? (o= order_statement )? ) (e= END )? ;
    public final MappingDeclaration mapping_declare() throws RecognitionException {
        MappingDeclaration orm = null;

        Token d=null;
        Token q=null;
        Token e=null;
        Token n = null;

        MappingStatement m = null;

        WithStatement wis = null;

        MappingOverride mo = null;

        WhereStatement w = null;

        HavingStatement h = null;

        OrderStatement o = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:939:3: ( ( DEFINE ORM )=> (d= DEFINE q= ORM ) n= id argument_list[orm] (m= mapping_statement BEGIN (wis= with_statement )? query_statement[orm] | mo= mapping_override BEGIN (w= where_statement )? (h= having_statement )? (o= order_statement )? ) (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:939:5: ( DEFINE ORM )=> (d= DEFINE q= ORM ) n= id argument_list[orm] (m= mapping_statement BEGIN (wis= with_statement )? query_statement[orm] | mo= mapping_override BEGIN (w= where_statement )? (h= having_statement )? (o= order_statement )? ) (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:939:19: (d= DEFINE q= ORM )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:939:20: d= DEFINE q= ORM
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_mapping_declare5194); if (state.failed) return orm;
            q=(Token)match(input,ORM,FOLLOW_ORM_in_mapping_declare5198); if (state.failed) return orm;

            }

            pushFollow(FOLLOW_id_in_mapping_declare5203);
            n=id();

            state._fsp--;
            if (state.failed) return orm;
            if ( state.backtracking==0 ) {
               orm =new MappingDeclaration(getPos(d,q),getTokenNode(getText(n),getPos(n)));
            }
            pushFollow(FOLLOW_argument_list_in_mapping_declare5211);
            argument_list(orm);

            state._fsp--;
            if (state.failed) return orm;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:941:5: (m= mapping_statement BEGIN (wis= with_statement )? query_statement[orm] | mo= mapping_override BEGIN (w= where_statement )? (h= having_statement )? (o= order_statement )? )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==MAPPING) ) {
                alt116=1;
            }
            else if ( (LA116_0==OVERRIDE) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return orm;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:942:6: m= mapping_statement BEGIN (wis= with_statement )? query_statement[orm]
                    {
                    pushFollow(FOLLOW_mapping_statement_in_mapping_declare5227);
                    m=mapping_statement();

                    state._fsp--;
                    if (state.failed) return orm;
                    if ( state.backtracking==0 ) {
                      orm.setMapping(m);
                    }
                    match(input,BEGIN,FOLLOW_BEGIN_in_mapping_declare5243); if (state.failed) return orm;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:945:7: (wis= with_statement )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==WITH) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:945:8: wis= with_statement
                            {
                            pushFollow(FOLLOW_with_statement_in_mapping_declare5254);
                            wis=with_statement();

                            state._fsp--;
                            if (state.failed) return orm;
                            if ( state.backtracking==0 ) {
                               orm.setWith(wis); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_query_statement_in_mapping_declare5265);
                    query_statement(orm);

                    state._fsp--;
                    if (state.failed) return orm;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:948:6: mo= mapping_override BEGIN (w= where_statement )? (h= having_statement )? (o= order_statement )?
                    {
                    pushFollow(FOLLOW_mapping_override_in_mapping_declare5280);
                    mo=mapping_override();

                    state._fsp--;
                    if (state.failed) return orm;
                    if ( state.backtracking==0 ) {
                      orm.setOverride(mo);
                    }
                    match(input,BEGIN,FOLLOW_BEGIN_in_mapping_declare5298); if (state.failed) return orm;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:951:6: (w= where_statement )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==WHERE) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:951:7: w= where_statement
                            {
                            pushFollow(FOLLOW_where_statement_in_mapping_declare5308);
                            w=where_statement();

                            state._fsp--;
                            if (state.failed) return orm;
                            if ( state.backtracking==0 ) {
                              orm.setWhere(w);
                            }

                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:952:6: (h= having_statement )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==HAVING) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:952:7: h= having_statement
                            {
                            pushFollow(FOLLOW_having_statement_in_mapping_declare5328);
                            h=having_statement();

                            state._fsp--;
                            if (state.failed) return orm;
                            if ( state.backtracking==0 ) {
                              orm.setHaving(h);
                            }

                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:953:6: (o= order_statement )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==ORDER) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:953:7: o= order_statement
                            {
                            pushFollow(FOLLOW_order_statement_in_mapping_declare5345);
                            o=order_statement();

                            state._fsp--;
                            if (state.failed) return orm;
                            if ( state.backtracking==0 ) {
                              orm.setOrder(o);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:955:7: (e= END )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==END) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:955:8: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_mapping_declare5372); if (state.failed) return orm;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) orm.updatePosition(getPos(e));
                      else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(orm).getEnd())); 
                    
            }

            }

        }

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
        finally {
        }
        return orm;
    }
    // $ANTLR end "mapping_declare"


    // $ANTLR start "mapping_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:961:1: mapping_statement returns [MappingStatement map=null] : ( MAPPING )=> (m= MAPPING ) (i= id (p= PERIOD (e= id )? )* )? ;
    public final MappingStatement mapping_statement() throws RecognitionException {
        MappingStatement map = null;

        Token m=null;
        Token p=null;
        Token i = null;

        Token e = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:962:3: ( ( MAPPING )=> (m= MAPPING ) (i= id (p= PERIOD (e= id )? )* )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:962:5: ( MAPPING )=> (m= MAPPING ) (i= id (p= PERIOD (e= id )? )* )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:962:16: (m= MAPPING )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:962:17: m= MAPPING
            {
            m=(Token)match(input,MAPPING,FOLLOW_MAPPING_in_mapping_statement5406); if (state.failed) return map;

            }

            if ( state.backtracking==0 ) {
               map =new MappingStatement(getPos(m)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:963:5: (i= id (p= PERIOD (e= id )? )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==REGULAR_ID||LA120_0==DELIMITED_ID||LA120_0==DATA||LA120_0==LENGTH||(LA120_0>=MORE && LA120_0<=NAME)||LA120_0==NULLABLE||LA120_0==NUMBER||LA120_0==REPEATABLE||LA120_0==SCALE||LA120_0==SERIALIZABLE||(LA120_0>=TYPE && LA120_0<=UNCOMMITTED)||LA120_0==UNNAMED) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:964:6: i= id (p= PERIOD (e= id )? )*
                    {
                    pushFollow(FOLLOW_id_in_mapping_statement5424);
                    i=id();

                    state._fsp--;
                    if (state.failed) return map;
                    if ( state.backtracking==0 ) {
                       map.add(getText(i),getPos(i)); 
                    }
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:965:6: (p= PERIOD (e= id )? )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==PERIOD) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:965:10: p= PERIOD (e= id )?
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       e=null; 
                    	    }
                    	    p=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_mapping_statement5448); if (state.failed) return map;
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:966:17: (e= id )?
                    	    int alt118=2;
                    	    int LA118_0 = input.LA(1);

                    	    if ( (LA118_0==REGULAR_ID||LA118_0==DELIMITED_ID||LA118_0==DATA||LA118_0==LENGTH||(LA118_0>=MORE && LA118_0<=NAME)||LA118_0==NULLABLE||LA118_0==NUMBER||LA118_0==REPEATABLE||LA118_0==SCALE||LA118_0==SERIALIZABLE||(LA118_0>=TYPE && LA118_0<=UNCOMMITTED)||LA118_0==UNNAMED) ) {
                    	        alt118=1;
                    	    }
                    	    switch (alt118) {
                    	        case 1 :
                    	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:966:18: e= id
                    	            {
                    	            pushFollow(FOLLOW_id_in_mapping_statement5453);
                    	            e=id();

                    	            state._fsp--;
                    	            if (state.failed) return map;

                    	            }
                    	            break;

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	           if(e!=null)
                    	      	              map.add(getText(e),getPos(e)); 
                    	      	           else {
                    	      	              ISourcePosition pointPos=getPos(p);
                    	      	              reportError(ParseWarningKinds.KIND_MISS_ENTITY_NAME,"entity name lost after "+getText(p),pointPos);
                    	      	              map.updatePosition(pointPos);
                    	      	              map.add(null,null); 
                    	      	           }
                    	      	        
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                       if(i==null) {
                          ISourcePosition pointPos=getPos(m);
                          reportError(ParseWarningKinds.KIND_MISS_ENTITY_NAME,"entity name lost after "+getText(m),pointPos);
                          map.updatePosition(pointPos);
                          map.add(null,null); 
                       }
                  
            }

            }

        }

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
        finally {
        }
        return map;
    }
    // $ANTLR end "mapping_statement"


    // $ANTLR start "mapping_override"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:989:1: mapping_override returns [MappingOverride mo=null] : ( OVERRIDE )=> (o= OVERRIDE ) (s= id )? ;
    public final MappingOverride mapping_override() throws RecognitionException {
        MappingOverride mo = null;

        Token o=null;
        Token s = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:3: ( ( OVERRIDE )=> (o= OVERRIDE ) (s= id )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:5: ( OVERRIDE )=> (o= OVERRIDE ) (s= id )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:17: (o= OVERRIDE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:18: o= OVERRIDE
            {
            o=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_mapping_override5513); if (state.failed) return mo;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:30: (s= id )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==REGULAR_ID||LA121_0==DELIMITED_ID||LA121_0==DATA||LA121_0==LENGTH||(LA121_0>=MORE && LA121_0<=NAME)||LA121_0==NULLABLE||LA121_0==NUMBER||LA121_0==REPEATABLE||LA121_0==SCALE||LA121_0==SERIALIZABLE||(LA121_0>=TYPE && LA121_0<=UNCOMMITTED)||LA121_0==UNNAMED) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:990:31: s= id
                    {
                    pushFollow(FOLLOW_id_in_mapping_override5519);
                    s=id();

                    state._fsp--;
                    if (state.failed) return mo;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(s!=null) {
                      mo = new MappingOverride(getTokenNode(o), getTokenNode(s));
                    } else {
                      mo = new MappingOverride(getTokenNode(o), null);
                      reportError(ParseWarningKinds.KIND_MISS_OVERRIDE_NAME,"super name lost after "+getText(o),getPos(o));
                    }
                  
            }

            }

        }

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
        finally {
        }
        return mo;
    }
    // $ANTLR end "mapping_override"


    // $ANTLR start "insert_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1002:1: insert_statement returns [InsertStatement ins = null] : ( INSERT INTO )=> (it= INSERT io= INTO ) (tn= table_name )? ( insert_columns[ins] insert_values[ins] | sq= subquery ) ;
    public final InsertStatement insert_statement() throws RecognitionException {
        InsertStatement ins =  null;

        Token it=null;
        Token io=null;
        Token tn = null;

        SubQueryStatement sq = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1003:3: ( ( INSERT INTO )=> (it= INSERT io= INTO ) (tn= table_name )? ( insert_columns[ins] insert_values[ins] | sq= subquery ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1003:5: ( INSERT INTO )=> (it= INSERT io= INTO ) (tn= table_name )? ( insert_columns[ins] insert_values[ins] | sq= subquery )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1003:22: (it= INSERT io= INTO )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1003:23: it= INSERT io= INTO
            {
            it=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement5559); if (state.failed) return ins;
            io=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement5563); if (state.failed) return ins;

            }

            if ( state.backtracking==0 ) {
               ins = new InsertStatement(getTokenNode(it),getTokenNode(io)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1005:5: (tn= table_name )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==REGULAR_ID||LA122_0==DELIMITED_ID||LA122_0==DATA||LA122_0==LENGTH||(LA122_0>=MORE && LA122_0<=NAME)||LA122_0==NULLABLE||LA122_0==NUMBER||LA122_0==REPEATABLE||LA122_0==SCALE||LA122_0==SERIALIZABLE||(LA122_0>=TYPE && LA122_0<=UNCOMMITTED)||LA122_0==UNNAMED) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1005:6: tn= table_name
                    {
                    pushFollow(FOLLOW_table_name_in_insert_statement5579);
                    tn=table_name();

                    state._fsp--;
                    if (state.failed) return ins;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(tn!=null) {
                      ins.setTableName(getTokenNode(tn));
                    } else {
                      reportError(ParseWarningKinds.KIND_MISS_TABLE_REFERENCE,"table name lost after "+getText(io),getPos(io));
                    }
                  
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1012:5: ( insert_columns[ins] insert_values[ins] | sq= subquery )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==LEFT_PAREN) ) {
                int LA123_1 = input.LA(2);

                if ( (LA123_1==SELECT) ) {
                    alt123=2;
                }
                else if ( (LA123_1==REGULAR_ID||LA123_1==RIGHT_PAREN||LA123_1==COMMA||LA123_1==DELIMITED_ID||LA123_1==DATA||LA123_1==LENGTH||(LA123_1>=MORE && LA123_1<=NAME)||LA123_1==NULLABLE||LA123_1==NUMBER||LA123_1==REPEATABLE||LA123_1==SCALE||LA123_1==SERIALIZABLE||(LA123_1>=TYPE && LA123_1<=UNCOMMITTED)||LA123_1==UNNAMED) ) {
                    alt123=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ins;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ins;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1012:7: insert_columns[ins] insert_values[ins]
                    {
                    pushFollow(FOLLOW_insert_columns_in_insert_statement5595);
                    insert_columns(ins);

                    state._fsp--;
                    if (state.failed) return ins;
                    pushFollow(FOLLOW_insert_values_in_insert_statement5598);
                    insert_values(ins);

                    state._fsp--;
                    if (state.failed) return ins;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1013:7: sq= subquery
                    {
                    pushFollow(FOLLOW_subquery_in_insert_statement5609);
                    sq=subquery();

                    state._fsp--;
                    if (state.failed) return ins;
                    if ( state.backtracking==0 ) {
                       ins.setSubquery(sq); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return ins;
    }
    // $ANTLR end "insert_statement"


    // $ANTLR start "insert_columns"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1017:1: insert_columns[InsertStatement ins] : ( LEFT_PAREN )=> (l= LEFT_PAREN ) (fi= id )? (c= COMMA (i= id )? )* r= RIGHT_PAREN ;
    public final void insert_columns(InsertStatement ins) throws RecognitionException {
        Token l=null;
        Token c=null;
        Token r=null;
        Token fi = null;

        Token i = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1018:3: ( ( LEFT_PAREN )=> (l= LEFT_PAREN ) (fi= id )? (c= COMMA (i= id )? )* r= RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1018:5: ( LEFT_PAREN )=> (l= LEFT_PAREN ) (fi= id )? (c= COMMA (i= id )? )* r= RIGHT_PAREN
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1018:21: (l= LEFT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1018:22: l= LEFT_PAREN
            {
            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_columns5642); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               ins.updatePosition(getPos(l)); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1019:5: (fi= id )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==REGULAR_ID||LA124_0==DELIMITED_ID||LA124_0==DATA||LA124_0==LENGTH||(LA124_0>=MORE && LA124_0<=NAME)||LA124_0==NULLABLE||LA124_0==NUMBER||LA124_0==REPEATABLE||LA124_0==SCALE||LA124_0==SERIALIZABLE||(LA124_0>=TYPE && LA124_0<=UNCOMMITTED)||LA124_0==UNNAMED) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1019:6: fi= id
                    {
                    pushFollow(FOLLOW_id_in_insert_columns5655);
                    fi=id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(fi!=null) ins.addColumn(getTokenNode(fi));
                      else {
                        ins.addColumn(null);
                        reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"column lost after "+getText(l),getPos(l));
                      }
                    
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1026:5: (c= COMMA (i= id )? )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==COMMA) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1026:6: c= COMMA (i= id )?
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_columns5674); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	       i=null; 
            	    }
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1026:27: (i= id )?
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==REGULAR_ID||LA125_0==DELIMITED_ID||LA125_0==DATA||LA125_0==LENGTH||(LA125_0>=MORE && LA125_0<=NAME)||LA125_0==NULLABLE||LA125_0==NUMBER||LA125_0==REPEATABLE||LA125_0==SCALE||LA125_0==SERIALIZABLE||(LA125_0>=TYPE && LA125_0<=UNCOMMITTED)||LA125_0==UNNAMED) ) {
            	        alt125=1;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1026:28: i= id
            	            {
            	            pushFollow(FOLLOW_id_in_insert_columns5682);
            	            i=id();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       if(i!=null) ins.addColumn(getTokenNode(i));
            	              else {
            	                ins.addColumn(getTokenNode(i));
            	                reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"column lost after "+getText(c),getPos(c));
            	              }
            	            
            	    }

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_columns5707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               ins.updatePosition(getPos(r)); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "insert_columns"


    // $ANTLR start "insert_values"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1037:1: insert_values[InsertStatement ins] : ( VALUES )=> (v= VALUES ) l= LEFT_PAREN (fv= value_exp )? (c= COMMA (ve= value_exp )? )* r= RIGHT_PAREN ;
    public final void insert_values(InsertStatement ins) throws RecognitionException {
        Token v=null;
        Token l=null;
        Token c=null;
        Token r=null;
        ValueExpression fv = null;

        ValueExpression ve = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1038:3: ( ( VALUES )=> (v= VALUES ) l= LEFT_PAREN (fv= value_exp )? (c= COMMA (ve= value_exp )? )* r= RIGHT_PAREN )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1038:5: ( VALUES )=> (v= VALUES ) l= LEFT_PAREN (fv= value_exp )? (c= COMMA (ve= value_exp )? )* r= RIGHT_PAREN
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1038:17: (v= VALUES )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1038:18: v= VALUES
            {
            v=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_values5736); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               ins.updatePosition(getPos(v)); 
            }
            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_values5748); if (state.failed) return ;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1040:5: (fv= value_exp )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==APPROXIMATE_NUM_LIT||LA127_0==MINUS_SIGN||LA127_0==ARGUMENT_ID||LA127_0==BYTES||LA127_0==DATE||LA127_0==GUID||LA127_0==REGULAR_ID||LA127_0==LEFT_PAREN||(LA127_0>=COUNT && LA127_0<=MIN)||(LA127_0>=H_LV && LA127_0<=H_AID)||(LA127_0>=COALESCE && LA127_0<=CASE)||(LA127_0>=TRUE && LA127_0<=EXACT_NUM_LIT)||LA127_0==DELIMITED_ID||LA127_0==DATA||LA127_0==LENGTH||(LA127_0>=MORE && LA127_0<=NAME)||LA127_0==NULLABLE||LA127_0==NUMBER||LA127_0==REPEATABLE||LA127_0==SCALE||LA127_0==SERIALIZABLE||(LA127_0>=TYPE && LA127_0<=UNCOMMITTED)||LA127_0==UNNAMED) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1040:6: fv= value_exp
                    {
                    pushFollow(FOLLOW_value_exp_in_insert_values5757);
                    fv=value_exp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(fv!=null) ins.addValueExpresiion(fv);
                      else {
                        ins.addValueExpresiion(null);
                        reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"value expression lost after "+getText(l),getPos(l));
                      }
                    
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1047:5: (c= COMMA (ve= value_exp )? )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==COMMA) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1047:6: c= COMMA (ve= value_exp )?
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_values5776); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	      ve=null;
            	    }
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1047:25: (ve= value_exp )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==APPROXIMATE_NUM_LIT||LA128_0==MINUS_SIGN||LA128_0==ARGUMENT_ID||LA128_0==BYTES||LA128_0==DATE||LA128_0==GUID||LA128_0==REGULAR_ID||LA128_0==LEFT_PAREN||(LA128_0>=COUNT && LA128_0<=MIN)||(LA128_0>=H_LV && LA128_0<=H_AID)||(LA128_0>=COALESCE && LA128_0<=CASE)||(LA128_0>=TRUE && LA128_0<=EXACT_NUM_LIT)||LA128_0==DELIMITED_ID||LA128_0==DATA||LA128_0==LENGTH||(LA128_0>=MORE && LA128_0<=NAME)||LA128_0==NULLABLE||LA128_0==NUMBER||LA128_0==REPEATABLE||LA128_0==SCALE||LA128_0==SERIALIZABLE||(LA128_0>=TYPE && LA128_0<=UNCOMMITTED)||LA128_0==UNNAMED) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1047:26: ve= value_exp
            	            {
            	            pushFollow(FOLLOW_value_exp_in_insert_values5783);
            	            ve=value_exp();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       if(ve!=null) ins.addValueExpresiion(ve);
            	              else {
            	                ins.addValueExpresiion(null);
            	                reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"value expression lost after "+getText(c),getPos(c));
            	              }
            	            
            	    }

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_values5808); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               ins.updatePosition(getPos(r)); 
            }

            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "insert_values"


    // $ANTLR start "update_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1058:1: update_statement returns [UpdateStatement us=null] : ( UPDATE )=> (u= UPDATE ) t= table_ref_statement set_statement[us] (w= where_statement )? ;
    public final UpdateStatement update_statement() throws RecognitionException {
        UpdateStatement us = null;

        Token u=null;
        TableReferenceStatement t = null;

        WhereStatement w = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1059:3: ( ( UPDATE )=> (u= UPDATE ) t= table_ref_statement set_statement[us] (w= where_statement )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1059:5: ( UPDATE )=> (u= UPDATE ) t= table_ref_statement set_statement[us] (w= where_statement )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1059:15: (u= UPDATE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1059:16: u= UPDATE
            {
            u=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement5835); if (state.failed) return us;

            }

            if ( state.backtracking==0 ) {
               us = new UpdateStatement(getTokenNode(u), null); 
            }
            pushFollow(FOLLOW_table_ref_statement_in_update_statement5851);
            t=table_ref_statement();

            state._fsp--;
            if (state.failed) return us;
            if ( state.backtracking==0 ) {
               us.setTable(t); 
            }
            pushFollow(FOLLOW_set_statement_in_update_statement5859);
            set_statement(us);

            state._fsp--;
            if (state.failed) return us;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1063:5: (w= where_statement )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==WHERE) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1063:6: w= where_statement
                    {
                    pushFollow(FOLLOW_where_statement_in_update_statement5869);
                    w=where_statement();

                    state._fsp--;
                    if (state.failed) return us;
                    if ( state.backtracking==0 ) {
                       us.setWhere(w); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return us;
    }
    // $ANTLR end "update_statement"


    // $ANTLR start "set_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1066:1: set_statement[UpdateStatement us] : ( SET )=> (s= SET ) (fas= assign_statement )? (c= COMMA (ass= assign_statement )? )* ;
    public final void set_statement(UpdateStatement us) throws RecognitionException {
        Token s=null;
        Token c=null;
        AssignStatement fas = null;

        AssignStatement ass = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:3: ( ( SET )=> (s= SET ) (fas= assign_statement )? (c= COMMA (ass= assign_statement )? )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:5: ( SET )=> (s= SET ) (fas= assign_statement )? (c= COMMA (ass= assign_statement )? )*
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:12: (s= SET )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:13: s= SET
            {
            s=(Token)match(input,SET,FOLLOW_SET_in_set_statement5896); if (state.failed) return ;

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:20: (fas= assign_statement )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==REGULAR_ID||LA131_0==DELIMITED_ID||LA131_0==DATA||LA131_0==LENGTH||(LA131_0>=MORE && LA131_0<=NAME)||LA131_0==NULLABLE||LA131_0==NUMBER||LA131_0==REPEATABLE||LA131_0==SCALE||LA131_0==SERIALIZABLE||(LA131_0>=TYPE && LA131_0<=UNCOMMITTED)||LA131_0==UNNAMED) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1067:21: fas= assign_statement
                    {
                    pushFollow(FOLLOW_assign_statement_in_set_statement5902);
                    fas=assign_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(fas!=null) us.addAssign(fas);
                      else {
                        us.addAssign(null);
                        reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"Assign statement lost after "+getText(s),getPos(s));
                      }
                    
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1074:5: (c= COMMA (ass= assign_statement )? )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1074:6: c= COMMA (ass= assign_statement )?
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_set_statement5921); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {
            	      ass=null;
            	    }
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1074:26: (ass= assign_statement )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==REGULAR_ID||LA132_0==DELIMITED_ID||LA132_0==DATA||LA132_0==LENGTH||(LA132_0>=MORE && LA132_0<=NAME)||LA132_0==NULLABLE||LA132_0==NUMBER||LA132_0==REPEATABLE||LA132_0==SCALE||LA132_0==SERIALIZABLE||(LA132_0>=TYPE && LA132_0<=UNCOMMITTED)||LA132_0==UNNAMED) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1074:27: ass= assign_statement
            	            {
            	            pushFollow(FOLLOW_assign_statement_in_set_statement5928);
            	            ass=assign_statement();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       if(ass!=null) us.addAssign(ass);
            	              else {
            	                us.addAssign(null);
            	                reportError(ParseWarningKinds.KIND_MISS_ASSIGN_STATEMENT,"assign statement lost after "+getText(c),getPos(c));
            	              }
            	            
            	    }

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            }

        }

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
        finally {
        }
        return ;
    }
    // $ANTLR end "set_statement"


    // $ANTLR start "assign_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1084:1: assign_statement returns [AssignStatement ass = null] : c= id a= EQUALS_OP (v= row_value_constructor )? ;
    public final AssignStatement assign_statement() throws RecognitionException {
        AssignStatement ass =  null;

        Token a=null;
        Token c = null;

        ValueExpression v = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1085:3: (c= id a= EQUALS_OP (v= row_value_constructor )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1085:5: c= id a= EQUALS_OP (v= row_value_constructor )?
            {
            pushFollow(FOLLOW_id_in_assign_statement5963);
            c=id();

            state._fsp--;
            if (state.failed) return ass;
            a=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_assign_statement5967); if (state.failed) return ass;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1085:22: (v= row_value_constructor )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==APPROXIMATE_NUM_LIT||LA134_0==MINUS_SIGN||LA134_0==ARGUMENT_ID||LA134_0==BYTES||LA134_0==DATE||LA134_0==GUID||LA134_0==REGULAR_ID||LA134_0==NULL||LA134_0==LEFT_PAREN||(LA134_0>=COUNT && LA134_0<=MIN)||(LA134_0>=H_LV && LA134_0<=H_AID)||(LA134_0>=COALESCE && LA134_0<=CASE)||(LA134_0>=TRUE && LA134_0<=EXACT_NUM_LIT)||LA134_0==DELIMITED_ID||LA134_0==DATA||LA134_0==LENGTH||(LA134_0>=MORE && LA134_0<=NAME)||LA134_0==NULLABLE||LA134_0==NUMBER||LA134_0==REPEATABLE||LA134_0==SCALE||LA134_0==SERIALIZABLE||(LA134_0>=TYPE && LA134_0<=UNCOMMITTED)||LA134_0==UNNAMED) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1085:23: v= row_value_constructor
                    {
                    pushFollow(FOLLOW_row_value_constructor_in_assign_statement5972);
                    v=row_value_constructor();

                    state._fsp--;
                    if (state.failed) return ass;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(v!=null) {
                      ass = new AssignStatement(getPos(c), getTokenNode(c), v, getPos(v));
                    } else {
                      ass = new AssignStatement(getPos(c), getTokenNode(c), null, getPos(a));
                      reportError(ParseWarningKinds.KIND_MISS_VALUE_EXPRESSION,"value expression lost after "+getText(a),getPos(a));
                    }
                  
            }

            }

        }

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
        finally {
        }
        return ass;
    }
    // $ANTLR end "assign_statement"


    // $ANTLR start "delete_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1095:1: delete_statement returns [DeleteStatement des = null] : ( DELETE FROM )=> (d= DELETE f= FROM ) t= table_ref_statement (w= where_statement )? ;
    public final DeleteStatement delete_statement() throws RecognitionException {
        DeleteStatement des =  null;

        Token d=null;
        Token f=null;
        TableReferenceStatement t = null;

        WhereStatement w = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1096:3: ( ( DELETE FROM )=> (d= DELETE f= FROM ) t= table_ref_statement (w= where_statement )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1096:5: ( DELETE FROM )=> (d= DELETE f= FROM ) t= table_ref_statement (w= where_statement )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1096:22: (d= DELETE f= FROM )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1096:23: d= DELETE f= FROM
            {
            d=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement6007); if (state.failed) return des;
            f=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement6011); if (state.failed) return des;

            }

            if ( state.backtracking==0 ) {
               des = new DeleteStatement(getTokenNode(d), getTokenNode(f), null); 
            }
            pushFollow(FOLLOW_table_ref_statement_in_delete_statement6026);
            t=table_ref_statement();

            state._fsp--;
            if (state.failed) return des;
            if ( state.backtracking==0 ) {
               des.setTable(t); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1099:5: (w= where_statement )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==WHERE) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1099:6: w= where_statement
                    {
                    pushFollow(FOLLOW_where_statement_in_delete_statement6037);
                    w=where_statement();

                    state._fsp--;
                    if (state.failed) return des;
                    if ( state.backtracking==0 ) {
                       des.setWhere(w); 
                    }

                    }
                    break;

            }


            }

        }

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
        finally {
        }
        return des;
    }
    // $ANTLR end "delete_statement"


    // $ANTLR start "insert_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1104:1: insert_declare returns [InsertDeclaration insert=null] : ( DEFINE INSERT )=> (d= DEFINE q= INSERT ) n= id argument_list[insert] BEGIN ins= insert_statement (e= END )? ;
    public final InsertDeclaration insert_declare() throws RecognitionException {
        InsertDeclaration insert = null;

        Token d=null;
        Token q=null;
        Token e=null;
        Token n = null;

        InsertStatement ins = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1105:3: ( ( DEFINE INSERT )=> (d= DEFINE q= INSERT ) n= id argument_list[insert] BEGIN ins= insert_statement (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1105:5: ( DEFINE INSERT )=> (d= DEFINE q= INSERT ) n= id argument_list[insert] BEGIN ins= insert_statement (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1105:22: (d= DEFINE q= INSERT )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1105:23: d= DEFINE q= INSERT
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_insert_declare6074); if (state.failed) return insert;
            q=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_declare6078); if (state.failed) return insert;

            }

            pushFollow(FOLLOW_id_in_insert_declare6083);
            n=id();

            state._fsp--;
            if (state.failed) return insert;
            if ( state.backtracking==0 ) {
               insert =new InsertDeclaration(getTokenNode(d),getTokenNode(n),getPos(n));
            }
            pushFollow(FOLLOW_argument_list_in_insert_declare6091);
            argument_list(insert);

            state._fsp--;
            if (state.failed) return insert;
            match(input,BEGIN,FOLLOW_BEGIN_in_insert_declare6099); if (state.failed) return insert;
            pushFollow(FOLLOW_insert_statement_in_insert_declare6103);
            ins=insert_statement();

            state._fsp--;
            if (state.failed) return insert;
            if ( state.backtracking==0 ) {
               insert.setCommand(ins); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1108:5: (e= END )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==END) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1108:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_insert_declare6114); if (state.failed) return insert;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) insert.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(insert).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return insert;
    }
    // $ANTLR end "insert_declare"


    // $ANTLR start "update_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1115:1: update_declare returns [UpdateDeclaration update=null] : ( DEFINE UPDATE )=> (d= DEFINE u= UPDATE ) n= id argument_list[update] BEGIN upd= update_statement (e= END )? ;
    public final UpdateDeclaration update_declare() throws RecognitionException {
        UpdateDeclaration update = null;

        Token d=null;
        Token u=null;
        Token e=null;
        Token n = null;

        UpdateStatement upd = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1116:3: ( ( DEFINE UPDATE )=> (d= DEFINE u= UPDATE ) n= id argument_list[update] BEGIN upd= update_statement (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1116:5: ( DEFINE UPDATE )=> (d= DEFINE u= UPDATE ) n= id argument_list[update] BEGIN upd= update_statement (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1116:22: (d= DEFINE u= UPDATE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1116:23: d= DEFINE u= UPDATE
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_update_declare6154); if (state.failed) return update;
            u=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_declare6158); if (state.failed) return update;

            }

            pushFollow(FOLLOW_id_in_update_declare6163);
            n=id();

            state._fsp--;
            if (state.failed) return update;
            if ( state.backtracking==0 ) {
               update =new UpdateDeclaration(getTokenNode(d),getTokenNode(n),getPos(n));
            }
            pushFollow(FOLLOW_argument_list_in_update_declare6171);
            argument_list(update);

            state._fsp--;
            if (state.failed) return update;
            match(input,BEGIN,FOLLOW_BEGIN_in_update_declare6179); if (state.failed) return update;
            pushFollow(FOLLOW_update_statement_in_update_declare6183);
            upd=update_statement();

            state._fsp--;
            if (state.failed) return update;
            if ( state.backtracking==0 ) {
               update.setCommand(upd); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1119:5: (e= END )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==END) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1119:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_update_declare6194); if (state.failed) return update;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) update.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(update).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return update;
    }
    // $ANTLR end "update_declare"


    // $ANTLR start "delete_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1125:1: delete_declare returns [DeleteDeclaration delete=null] : ( DEFINE DELETE )=> (d= DEFINE t= DELETE ) n= id argument_list[delete] BEGIN del= delete_statement (e= END )? ;
    public final DeleteDeclaration delete_declare() throws RecognitionException {
        DeleteDeclaration delete = null;

        Token d=null;
        Token t=null;
        Token e=null;
        Token n = null;

        DeleteStatement del = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1126:3: ( ( DEFINE DELETE )=> (d= DEFINE t= DELETE ) n= id argument_list[delete] BEGIN del= delete_statement (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1126:5: ( DEFINE DELETE )=> (d= DEFINE t= DELETE ) n= id argument_list[delete] BEGIN del= delete_statement (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1126:22: (d= DEFINE t= DELETE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1126:23: d= DEFINE t= DELETE
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_delete_declare6231); if (state.failed) return delete;
            t=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_declare6235); if (state.failed) return delete;

            }

            pushFollow(FOLLOW_id_in_delete_declare6240);
            n=id();

            state._fsp--;
            if (state.failed) return delete;
            if ( state.backtracking==0 ) {
               delete =new DeleteDeclaration(getTokenNode(d),getTokenNode(n),getPos(n));
            }
            pushFollow(FOLLOW_argument_list_in_delete_declare6248);
            argument_list(delete);

            state._fsp--;
            if (state.failed) return delete;
            match(input,BEGIN,FOLLOW_BEGIN_in_delete_declare6256); if (state.failed) return delete;
            pushFollow(FOLLOW_delete_statement_in_delete_declare6260);
            del=delete_statement();

            state._fsp--;
            if (state.failed) return delete;
            if ( state.backtracking==0 ) {
               delete.setCommand(del); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1129:5: (e= END )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==END) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1129:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_delete_declare6271); if (state.failed) return delete;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) delete.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(delete).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return delete;
    }
    // $ANTLR end "delete_declare"


    // $ANTLR start "command_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1135:1: command_declare returns [CommandDeclarationBase<?> cmd=null] : (i= insert_declare | u= update_declare | d= delete_declare );
    public final CommandDeclarationBase<?> command_declare() throws RecognitionException {
        CommandDeclarationBase<?> cmd = null;

        InsertDeclaration i = null;

        UpdateDeclaration u = null;

        DeleteDeclaration d = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1136:3: (i= insert_declare | u= update_declare | d= delete_declare )
            int alt139=3;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==DEFINE) ) {
                switch ( input.LA(2) ) {
                case INSERT:
                    {
                    alt139=1;
                    }
                    break;
                case UPDATE:
                    {
                    alt139=2;
                    }
                    break;
                case DELETE:
                    {
                    alt139=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return cmd;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return cmd;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1136:5: i= insert_declare
                    {
                    pushFollow(FOLLOW_insert_declare_in_command_declare6301);
                    i=insert_declare();

                    state._fsp--;
                    if (state.failed) return cmd;
                    if ( state.backtracking==0 ) {
                       cmd =i; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1137:5: u= update_declare
                    {
                    pushFollow(FOLLOW_update_declare_in_command_declare6312);
                    u=update_declare();

                    state._fsp--;
                    if (state.failed) return cmd;
                    if ( state.backtracking==0 ) {
                       cmd =u; 
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1138:5: d= delete_declare
                    {
                    pushFollow(FOLLOW_delete_declare_in_command_declare6323);
                    d=delete_declare();

                    state._fsp--;
                    if (state.failed) return cmd;
                    if ( state.backtracking==0 ) {
                       cmd =d; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return cmd;
    }
    // $ANTLR end "command_declare"


    // $ANTLR start "table_abs_declaration"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1144:1: table_abs_declaration returns [AbstractTableDeclaration abstable = null] : ( DEFINE ABSTABLE )=> (d= DEFINE t= ABSTABLE ) n= id BEGIN tas= table_abs_statement (e= END )? ;
    public final AbstractTableDeclaration table_abs_declaration() throws RecognitionException {
        AbstractTableDeclaration abstable =  null;

        Token d=null;
        Token t=null;
        Token e=null;
        Token n = null;

        AbstractTableDefineStatement tas = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1145:3: ( ( DEFINE ABSTABLE )=> (d= DEFINE t= ABSTABLE ) n= id BEGIN tas= table_abs_statement (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1145:5: ( DEFINE ABSTABLE )=> (d= DEFINE t= ABSTABLE ) n= id BEGIN tas= table_abs_statement (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1145:26: (d= DEFINE t= ABSTABLE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1145:27: d= DEFINE t= ABSTABLE
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_table_abs_declaration6359); if (state.failed) return abstable;
            t=(Token)match(input,ABSTABLE,FOLLOW_ABSTABLE_in_table_abs_declaration6363); if (state.failed) return abstable;

            }

            pushFollow(FOLLOW_id_in_table_abs_declaration6368);
            n=id();

            state._fsp--;
            if (state.failed) return abstable;
            if ( state.backtracking==0 ) {
               abstable = new AbstractTableDeclaration(getTokenNode(d),getTokenNode(n),getPos(n)); 
            }
            match(input,BEGIN,FOLLOW_BEGIN_in_table_abs_declaration6376); if (state.failed) return abstable;
            pushFollow(FOLLOW_table_abs_statement_in_table_abs_declaration6380);
            tas=table_abs_statement();

            state._fsp--;
            if (state.failed) return abstable;
            if ( state.backtracking==0 ) {
               abstable.setStatement(tas); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1148:5: (e= END )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==END) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1148:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_table_abs_declaration6396); if (state.failed) return abstable;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) abstable.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(abstable).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return abstable;
    }
    // $ANTLR end "table_abs_declaration"


    // $ANTLR start "table_normal_declaration"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1154:1: table_normal_declaration returns [NormalTableDeclaration table = null] : ( DEFINE TABLE )=> (d= DEFINE t= TABLE ) n= id BEGIN tns= table_normal_statement (e= END )? ;
    public final NormalTableDeclaration table_normal_declaration() throws RecognitionException {
        NormalTableDeclaration table =  null;

        Token d=null;
        Token t=null;
        Token e=null;
        Token n = null;

        NormalTableDefineStatement tns = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1155:3: ( ( DEFINE TABLE )=> (d= DEFINE t= TABLE ) n= id BEGIN tns= table_normal_statement (e= END )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1155:5: ( DEFINE TABLE )=> (d= DEFINE t= TABLE ) n= id BEGIN tns= table_normal_statement (e= END )?
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1155:23: (d= DEFINE t= TABLE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1155:24: d= DEFINE t= TABLE
            {
            d=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_table_normal_declaration6434); if (state.failed) return table;
            t=(Token)match(input,TABLE,FOLLOW_TABLE_in_table_normal_declaration6438); if (state.failed) return table;

            }

            pushFollow(FOLLOW_id_in_table_normal_declaration6443);
            n=id();

            state._fsp--;
            if (state.failed) return table;
            if ( state.backtracking==0 ) {
               table = new NormalTableDeclaration(getTokenNode(d),getTokenNode(n),getPos(n)); 
            }
            match(input,BEGIN,FOLLOW_BEGIN_in_table_normal_declaration6451); if (state.failed) return table;
            pushFollow(FOLLOW_table_normal_statement_in_table_normal_declaration6455);
            tns=table_normal_statement();

            state._fsp--;
            if (state.failed) return table;
            if ( state.backtracking==0 ) {
               table.setStatement(tns); 
            }
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1158:5: (e= END )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==END) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1158:6: e= END
                    {
                    e=(Token)match(input,END,FOLLOW_END_in_table_normal_declaration6471); if (state.failed) return table;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               if(e!=null) table.updatePosition(getPos(e));
                    else reportError(ParseWarningKinds.KIND_DEFINE_END_REQUIRED,"'end' is required to close define",getEmptyPos(getPos(table).getEnd())); 
                  
            }

            }

        }

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
        finally {
        }
        return table;
    }
    // $ANTLR end "table_normal_declaration"


    // $ANTLR start "table_abs_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1164:1: table_abs_statement returns [AbstractTableDefineStatement ts = null] : ;
    public final AbstractTableDefineStatement table_abs_statement() throws RecognitionException {
        AbstractTableDefineStatement ts =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1165:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1166:3: 
            {
            }

        }
        finally {
        }
        return ts;
    }
    // $ANTLR end "table_abs_statement"


    // $ANTLR start "table_normal_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1168:1: table_normal_statement returns [NormalTableDefineStatement ts = null] : ;
    public final NormalTableDefineStatement table_normal_statement() throws RecognitionException {
        NormalTableDefineStatement ts =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1169:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1170:3: 
            {
            }

        }
        finally {
        }
        return ts;
    }
    // $ANTLR end "table_normal_statement"


    // $ANTLR start "columns_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1172:1: columns_statement returns [ColumnsStatement cs = null] : ;
    public final ColumnsStatement columns_statement() throws RecognitionException {
        ColumnsStatement cs =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1173:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1174:3: 
            {
            }

        }
        finally {
        }
        return cs;
    }
    // $ANTLR end "columns_statement"


    // $ANTLR start "column_declaration"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1176:1: column_declaration returns [ColumnDeclaration cd = null] : ;
    public final ColumnDeclaration column_declaration() throws RecognitionException {
        ColumnDeclaration cd =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1177:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1178:3: 
            {
            }

        }
        finally {
        }
        return cd;
    }
    // $ANTLR end "column_declaration"


    // $ANTLR start "column_relation_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1180:1: column_relation_statement[ColumnDeclaration cd] : ;
    public final void column_relation_statement(ColumnDeclaration cd) throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1181:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1182:3: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "column_relation_statement"


    // $ANTLR start "column_default_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1184:1: column_default_statement[ColumnDeclaration cd] : ;
    public final void column_default_statement(ColumnDeclaration cd) throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1185:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1186:3: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "column_default_statement"


    // $ANTLR start "column_type_reference"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1188:1: column_type_reference returns [ColumnTypeReference type = null] : ( (t= BLOB | t= BOOLEAN | t= DATE | t= DOUBLE | t= GUID | t= INT | t= LONG | t= NTEXT | t= TEXT ) | (t= BINARY | t= CHAR | t= NCHAR | t= NVARCHAR | t= VARBINARY | t= VARCHAR ) (l= LEFT_PAREN s= UNSIGNED_INTEGER r= RIGHT_PAREN )? | t= NUMERIC (l= LEFT_PAREN s= UNSIGNED_INTEGER ( COMMA p= UNSIGNED_INTEGER )? r= RIGHT_PAREN )? );
    public final ColumnTypeReference column_type_reference() throws RecognitionException {
        ColumnTypeReference type =  null;

        Token t=null;
        Token l=null;
        Token s=null;
        Token r=null;
        Token p=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1189:3: ( (t= BLOB | t= BOOLEAN | t= DATE | t= DOUBLE | t= GUID | t= INT | t= LONG | t= NTEXT | t= TEXT ) | (t= BINARY | t= CHAR | t= NCHAR | t= NVARCHAR | t= VARBINARY | t= VARCHAR ) (l= LEFT_PAREN s= UNSIGNED_INTEGER r= RIGHT_PAREN )? | t= NUMERIC (l= LEFT_PAREN s= UNSIGNED_INTEGER ( COMMA p= UNSIGNED_INTEGER )? r= RIGHT_PAREN )? )
            int alt147=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case DATE:
            case DOUBLE:
            case GUID:
            case INT:
            case LONG:
            case BLOB:
            case NTEXT:
            case TEXT:
                {
                alt147=1;
                }
                break;
            case BINARY:
            case CHAR:
            case NCHAR:
            case NVARCHAR:
            case VARBINARY:
            case VARCHAR:
                {
                alt147=2;
                }
                break;
            case NUMERIC:
                {
                alt147=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1189:5: (t= BLOB | t= BOOLEAN | t= DATE | t= DOUBLE | t= GUID | t= INT | t= LONG | t= NTEXT | t= TEXT )
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1189:5: (t= BLOB | t= BOOLEAN | t= DATE | t= DOUBLE | t= GUID | t= INT | t= LONG | t= NTEXT | t= TEXT )
                    int alt142=9;
                    switch ( input.LA(1) ) {
                    case BLOB:
                        {
                        alt142=1;
                        }
                        break;
                    case BOOLEAN:
                        {
                        alt142=2;
                        }
                        break;
                    case DATE:
                        {
                        alt142=3;
                        }
                        break;
                    case DOUBLE:
                        {
                        alt142=4;
                        }
                        break;
                    case GUID:
                        {
                        alt142=5;
                        }
                        break;
                    case INT:
                        {
                        alt142=6;
                        }
                        break;
                    case LONG:
                        {
                        alt142=7;
                        }
                        break;
                    case NTEXT:
                        {
                        alt142=8;
                        }
                        break;
                    case TEXT:
                        {
                        alt142=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return type;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }

                    switch (alt142) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1189:7: t= BLOB
                            {
                            t=(Token)match(input,BLOB,FOLLOW_BLOB_in_column_type_reference6594); if (state.failed) return type;

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1190:7: t= BOOLEAN
                            {
                            t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_column_type_reference6604); if (state.failed) return type;

                            }
                            break;
                        case 3 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1191:7: t= DATE
                            {
                            t=(Token)match(input,DATE,FOLLOW_DATE_in_column_type_reference6614); if (state.failed) return type;

                            }
                            break;
                        case 4 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1192:7: t= DOUBLE
                            {
                            t=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_column_type_reference6624); if (state.failed) return type;

                            }
                            break;
                        case 5 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1193:7: t= GUID
                            {
                            t=(Token)match(input,GUID,FOLLOW_GUID_in_column_type_reference6634); if (state.failed) return type;

                            }
                            break;
                        case 6 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1194:7: t= INT
                            {
                            t=(Token)match(input,INT,FOLLOW_INT_in_column_type_reference6644); if (state.failed) return type;

                            }
                            break;
                        case 7 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1195:7: t= LONG
                            {
                            t=(Token)match(input,LONG,FOLLOW_LONG_in_column_type_reference6654); if (state.failed) return type;

                            }
                            break;
                        case 8 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1196:7: t= NTEXT
                            {
                            t=(Token)match(input,NTEXT,FOLLOW_NTEXT_in_column_type_reference6664); if (state.failed) return type;

                            }
                            break;
                        case 9 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1197:7: t= TEXT
                            {
                            t=(Token)match(input,TEXT,FOLLOW_TEXT_in_column_type_reference6674); if (state.failed) return type;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       type = new ColumnTypeReference(null, getTokenNode(t)); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1199:5: (t= BINARY | t= CHAR | t= NCHAR | t= NVARCHAR | t= VARBINARY | t= VARCHAR ) (l= LEFT_PAREN s= UNSIGNED_INTEGER r= RIGHT_PAREN )?
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1199:5: (t= BINARY | t= CHAR | t= NCHAR | t= NVARCHAR | t= VARBINARY | t= VARCHAR )
                    int alt143=6;
                    switch ( input.LA(1) ) {
                    case BINARY:
                        {
                        alt143=1;
                        }
                        break;
                    case CHAR:
                        {
                        alt143=2;
                        }
                        break;
                    case NCHAR:
                        {
                        alt143=3;
                        }
                        break;
                    case NVARCHAR:
                        {
                        alt143=4;
                        }
                        break;
                    case VARBINARY:
                        {
                        alt143=5;
                        }
                        break;
                    case VARCHAR:
                        {
                        alt143=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return type;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 0, input);

                        throw nvae;
                    }

                    switch (alt143) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1199:7: t= BINARY
                            {
                            t=(Token)match(input,BINARY,FOLLOW_BINARY_in_column_type_reference6692); if (state.failed) return type;

                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1200:7: t= CHAR
                            {
                            t=(Token)match(input,CHAR,FOLLOW_CHAR_in_column_type_reference6702); if (state.failed) return type;

                            }
                            break;
                        case 3 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1201:7: t= NCHAR
                            {
                            t=(Token)match(input,NCHAR,FOLLOW_NCHAR_in_column_type_reference6712); if (state.failed) return type;

                            }
                            break;
                        case 4 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1202:7: t= NVARCHAR
                            {
                            t=(Token)match(input,NVARCHAR,FOLLOW_NVARCHAR_in_column_type_reference6722); if (state.failed) return type;

                            }
                            break;
                        case 5 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1203:7: t= VARBINARY
                            {
                            t=(Token)match(input,VARBINARY,FOLLOW_VARBINARY_in_column_type_reference6732); if (state.failed) return type;

                            }
                            break;
                        case 6 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1204:7: t= VARCHAR
                            {
                            t=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_column_type_reference6742); if (state.failed) return type;

                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1206:5: (l= LEFT_PAREN s= UNSIGNED_INTEGER r= RIGHT_PAREN )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LEFT_PAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1206:6: l= LEFT_PAREN s= UNSIGNED_INTEGER r= RIGHT_PAREN
                            {
                            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_column_type_reference6757); if (state.failed) return type;
                            s=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6761); if (state.failed) return type;
                            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_column_type_reference6765); if (state.failed) return type;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                            if(s!=null) {
                              type = new ColumnTypeReference(null, getTokenNode(getText(t)+'('+getText(s)+')', unionPos(getPos(t),getPos(r))));
                            } else {
                              reportError(ParseWarningKinds.KIND_SIZE_REQUIRED,"size value is required after "+ getText(t),getEmptyPos(getPos(t).getEnd())); 
                            }
                          
                    }

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1214:5: t= NUMERIC (l= LEFT_PAREN s= UNSIGNED_INTEGER ( COMMA p= UNSIGNED_INTEGER )? r= RIGHT_PAREN )?
                    {
                    t=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_column_type_reference6781); if (state.failed) return type;
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1215:5: (l= LEFT_PAREN s= UNSIGNED_INTEGER ( COMMA p= UNSIGNED_INTEGER )? r= RIGHT_PAREN )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==LEFT_PAREN) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1215:6: l= LEFT_PAREN s= UNSIGNED_INTEGER ( COMMA p= UNSIGNED_INTEGER )? r= RIGHT_PAREN
                            {
                            l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_column_type_reference6790); if (state.failed) return type;
                            s=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6794); if (state.failed) return type;
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1215:38: ( COMMA p= UNSIGNED_INTEGER )?
                            int alt145=2;
                            int LA145_0 = input.LA(1);

                            if ( (LA145_0==COMMA) ) {
                                alt145=1;
                            }
                            switch (alt145) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1215:39: COMMA p= UNSIGNED_INTEGER
                                    {
                                    match(input,COMMA,FOLLOW_COMMA_in_column_type_reference6797); if (state.failed) return type;
                                    p=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6801); if (state.failed) return type;

                                    }
                                    break;

                            }

                            r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_column_type_reference6807); if (state.failed) return type;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                            if(s!=null && p!=null) {
                              type = new ColumnTypeReference(null, getTokenNode(getText(t)+'('+getText(s)+','+getText(p)+')', unionPos(getPos(t),getPos(r))));
                            } else if(s!=null) {
                              reportError(ParseWarningKinds.KIND_SCALE_REQUIRED,"scale value is required for "+ getText(t),getEmptyPos(getPos(t).getEnd())); 
                            } else {
                              reportError(ParseWarningKinds.KIND_SIZE_REQUIRED,"size value is required after "+ getText(t),getEmptyPos(getPos(t).getEnd())); 
                            }
                          
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return type;
    }
    // $ANTLR end "column_type_reference"


    // $ANTLR start "segments_list"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1227:1: segments_list[TableDefineStatementBase tds] : ;
    public final void segments_list(TableDefineStatementBase tds) throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1228:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1229:3: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "segments_list"


    // $ANTLR start "segment_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1231:1: segment_statement returns [ColumnsStatement cs = null] : ;
    public final ColumnsStatement segment_statement() throws RecognitionException {
        ColumnsStatement cs =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1232:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1233:3: 
            {
            }

        }
        finally {
        }
        return cs;
    }
    // $ANTLR end "segment_statement"


    // $ANTLR start "indexes_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1235:1: indexes_statement returns [IndexesStatment ids = null] : ;
    public final IndexesStatment indexes_statement() throws RecognitionException {
        IndexesStatment ids =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1236:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1237:3: 
            {
            }

        }
        finally {
        }
        return ids;
    }
    // $ANTLR end "indexes_statement"


    // $ANTLR start "relations_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1239:1: relations_statement returns [RelationsStatement rs = null] : ;
    public final RelationsStatement relations_statement() throws RecognitionException {
        RelationsStatement rs =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1240:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1241:3: 
            {
            }

        }
        finally {
        }
        return rs;
    }
    // $ANTLR end "relations_statement"


    // $ANTLR start "hierarchies_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1243:1: hierarchies_statement returns [HierarchiesStatement hs = null] : ;
    public final HierarchiesStatement hierarchies_statement() throws RecognitionException {
        HierarchiesStatement hs =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1244:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1245:3: 
            {
            }

        }
        finally {
        }
        return hs;
    }
    // $ANTLR end "hierarchies_statement"


    // $ANTLR start "partition_statement"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1247:1: partition_statement returns [PartitionStatement ps = null] : ;
    public final PartitionStatement partition_statement() throws RecognitionException {
        PartitionStatement ps =  null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1248:3: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1249:3: 
            {
            }

        }
        finally {
        }
        return ps;
    }
    // $ANTLR end "partition_statement"


    // $ANTLR start "sql_declare"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1254:1: sql_declare returns [Statement st=null] : (q= query_declare | m= mapping_declare );
    public final Statement sql_declare() throws RecognitionException {
        Statement st = null;

        QueryDeclaration q = null;

        MappingDeclaration m = null;


        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1255:3: (q= query_declare | m= mapping_declare )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==DEFINE) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==QUERY) ) {
                    alt148=1;
                }
                else if ( (LA148_1==ORM) ) {
                    alt148=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return st;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return st;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1255:5: q= query_declare
                    {
                    pushFollow(FOLLOW_query_declare_in_sql_declare6932);
                    q=query_declare();

                    state._fsp--;
                    if (state.failed) return st;
                    if ( state.backtracking==0 ) {
                       st =q; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1256:5: m= mapping_declare
                    {
                    pushFollow(FOLLOW_mapping_declare_in_sql_declare6942);
                    m=mapping_declare();

                    state._fsp--;
                    if (state.failed) return st;
                    if ( state.backtracking==0 ) {
                       st =m; 
                    }

                    }
                    break;

            }
        }

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
        finally {
        }
        return st;
    }
    // $ANTLR end "sql_declare"


    // $ANTLR start "non_reserved_word"
    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1620:1: non_reserved_word returns [Token word=null] : (t= DATA | t= LENGTH | t= MORE | t= NAME | t= NULLABLE | t= NUMBER | t= REPEATABLE | t= SCALE | t= SERIALIZABLE | t= TYPE | t= UNCOMMITTED | t= UNNAMED ) ;
    public final Token non_reserved_word() throws RecognitionException {
        Token word = null;

        Token t=null;

        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1620:44: ( (t= DATA | t= LENGTH | t= MORE | t= NAME | t= NULLABLE | t= NUMBER | t= REPEATABLE | t= SCALE | t= SERIALIZABLE | t= TYPE | t= UNCOMMITTED | t= UNNAMED ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1621:4: (t= DATA | t= LENGTH | t= MORE | t= NAME | t= NULLABLE | t= NUMBER | t= REPEATABLE | t= SCALE | t= SERIALIZABLE | t= TYPE | t= UNCOMMITTED | t= UNNAMED )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1621:4: (t= DATA | t= LENGTH | t= MORE | t= NAME | t= NULLABLE | t= NUMBER | t= REPEATABLE | t= SCALE | t= SERIALIZABLE | t= TYPE | t= UNCOMMITTED | t= UNNAMED )
            int alt149=12;
            switch ( input.LA(1) ) {
            case DATA:
                {
                alt149=1;
                }
                break;
            case LENGTH:
                {
                alt149=2;
                }
                break;
            case MORE:
                {
                alt149=3;
                }
                break;
            case NAME:
                {
                alt149=4;
                }
                break;
            case NULLABLE:
                {
                alt149=5;
                }
                break;
            case NUMBER:
                {
                alt149=6;
                }
                break;
            case REPEATABLE:
                {
                alt149=7;
                }
                break;
            case SCALE:
                {
                alt149=8;
                }
                break;
            case SERIALIZABLE:
                {
                alt149=9;
                }
                break;
            case TYPE:
                {
                alt149=10;
                }
                break;
            case UNCOMMITTED:
                {
                alt149=11;
                }
                break;
            case UNNAMED:
                {
                alt149=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return word;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1621:5: t= DATA
                    {
                    t=(Token)match(input,DATA,FOLLOW_DATA_in_non_reserved_word12072); if (state.failed) return word;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1621:14: t= LENGTH
                    {
                    t=(Token)match(input,LENGTH,FOLLOW_LENGTH_in_non_reserved_word12078); if (state.failed) return word;

                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1621:25: t= MORE
                    {
                    t=(Token)match(input,MORE,FOLLOW_MORE_in_non_reserved_word12084); if (state.failed) return word;

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1622:5: t= NAME
                    {
                    t=(Token)match(input,NAME,FOLLOW_NAME_in_non_reserved_word12092); if (state.failed) return word;

                    }
                    break;
                case 5 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1622:14: t= NULLABLE
                    {
                    t=(Token)match(input,NULLABLE,FOLLOW_NULLABLE_in_non_reserved_word12098); if (state.failed) return word;

                    }
                    break;
                case 6 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1622:27: t= NUMBER
                    {
                    t=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_non_reserved_word12104); if (state.failed) return word;

                    }
                    break;
                case 7 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1623:5: t= REPEATABLE
                    {
                    t=(Token)match(input,REPEATABLE,FOLLOW_REPEATABLE_in_non_reserved_word12113); if (state.failed) return word;

                    }
                    break;
                case 8 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1624:5: t= SCALE
                    {
                    t=(Token)match(input,SCALE,FOLLOW_SCALE_in_non_reserved_word12121); if (state.failed) return word;

                    }
                    break;
                case 9 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1624:16: t= SERIALIZABLE
                    {
                    t=(Token)match(input,SERIALIZABLE,FOLLOW_SERIALIZABLE_in_non_reserved_word12128); if (state.failed) return word;

                    }
                    break;
                case 10 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1625:5: t= TYPE
                    {
                    t=(Token)match(input,TYPE,FOLLOW_TYPE_in_non_reserved_word12137); if (state.failed) return word;

                    }
                    break;
                case 11 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1626:5: t= UNCOMMITTED
                    {
                    t=(Token)match(input,UNCOMMITTED,FOLLOW_UNCOMMITTED_in_non_reserved_word12146); if (state.failed) return word;

                    }
                    break;
                case 12 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1626:21: t= UNNAMED
                    {
                    t=(Token)match(input,UNNAMED,FOLLOW_UNNAMED_in_non_reserved_word12152); if (state.failed) return word;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              word=t;
            }

            }

        }

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
        finally {
        }
        return word;
    }
    // $ANTLR end "non_reserved_word"

    // $ANTLR start synpred1_DnaSqlQuery
    public final void synpred1_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:6: ( ENUM )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:153:7: ENUM
        {
        match(input,ENUM,FOLLOW_ENUM_in_synpred1_DnaSqlQuery172); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_DnaSqlQuery

    // $ANTLR start synpred4_DnaSqlQuery
    public final void synpred4_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:7: ( term_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:211:8: term_op
        {
        pushFollow(FOLLOW_term_op_in_synpred4_DnaSqlQuery526);
        term_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_DnaSqlQuery

    // $ANTLR start synpred5_DnaSqlQuery
    public final void synpred5_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:7: ( term_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:217:8: term_op
        {
        pushFollow(FOLLOW_term_op_in_synpred5_DnaSqlQuery560);
        term_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_DnaSqlQuery

    // $ANTLR start synpred6_DnaSqlQuery
    public final void synpred6_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:6: ( factor_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:233:7: factor_op
        {
        pushFollow(FOLLOW_factor_op_in_synpred6_DnaSqlQuery659);
        factor_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_DnaSqlQuery

    // $ANTLR start synpred7_DnaSqlQuery
    public final void synpred7_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:6: ( factor_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:239:7: factor_op
        {
        pushFollow(FOLLOW_factor_op_in_synpred7_DnaSqlQuery690);
        factor_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_DnaSqlQuery

    // $ANTLR start synpred8_DnaSqlQuery
    public final void synpred8_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:272:5: ( LEFT_PAREN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:272:6: LEFT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred8_DnaSqlQuery919); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_DnaSqlQuery

    // $ANTLR start synpred9_DnaSqlQuery
    public final void synpred9_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:6: ( H_LV )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:294:7: H_LV
        {
        match(input,H_LV,FOLLOW_H_LV_in_synpred9_DnaSqlQuery1147); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_DnaSqlQuery

    // $ANTLR start synpred10_DnaSqlQuery
    public final void synpred10_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:298:6: ( H_AID )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:298:7: H_AID
        {
        match(input,H_AID,FOLLOW_H_AID_in_synpred10_DnaSqlQuery1201); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_DnaSqlQuery

    // $ANTLR start synpred13_DnaSqlQuery
    public final void synpred13_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:5: ( WHEN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:354:6: WHEN
        {
        match(input,WHEN,FOLLOW_WHEN_in_synpred13_DnaSqlQuery1585); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_DnaSqlQuery

    // $ANTLR start synpred14_DnaSqlQuery
    public final void synpred14_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:5: ( TRUE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:374:6: TRUE
        {
        match(input,TRUE,FOLLOW_TRUE_in_synpred14_DnaSqlQuery1759); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_DnaSqlQuery

    // $ANTLR start synpred15_DnaSqlQuery
    public final void synpred15_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:6: ( FALSE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:376:7: FALSE
        {
        match(input,FALSE,FOLLOW_FALSE_in_synpred15_DnaSqlQuery1781); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_DnaSqlQuery

    // $ANTLR start synpred16_DnaSqlQuery
    public final void synpred16_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:378:5: ( DATE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:378:6: DATE
        {
        match(input,DATE,FOLLOW_DATE_in_synpred16_DnaSqlQuery1802); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_DnaSqlQuery

    // $ANTLR start synpred17_DnaSqlQuery
    public final void synpred17_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:382:5: ( GUID )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:382:6: GUID
        {
        match(input,GUID,FOLLOW_GUID_in_synpred17_DnaSqlQuery1829); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_DnaSqlQuery

    // $ANTLR start synpred18_DnaSqlQuery
    public final void synpred18_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:386:5: ( BYTES )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:386:6: BYTES
        {
        match(input,BYTES,FOLLOW_BYTES_in_synpred18_DnaSqlQuery1856); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_DnaSqlQuery

    // $ANTLR start synpred19_DnaSqlQuery
    public final void synpred19_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:6: ( MINUS_SIGN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:390:7: MINUS_SIGN
        {
        match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_synpred19_DnaSqlQuery1882); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_DnaSqlQuery

    // $ANTLR start synpred20_DnaSqlQuery
    public final void synpred20_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:7: ( OR )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:412:8: OR
        {
        match(input,OR,FOLLOW_OR_in_synpred20_DnaSqlQuery2026); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_DnaSqlQuery

    // $ANTLR start synpred21_DnaSqlQuery
    public final void synpred21_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:7: ( OR )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:418:8: OR
        {
        match(input,OR,FOLLOW_OR_in_synpred21_DnaSqlQuery2059); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_DnaSqlQuery

    // $ANTLR start synpred22_DnaSqlQuery
    public final void synpred22_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:7: ( AND )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:430:8: AND
        {
        match(input,AND,FOLLOW_AND_in_synpred22_DnaSqlQuery2133); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_DnaSqlQuery

    // $ANTLR start synpred23_DnaSqlQuery
    public final void synpred23_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:7: ( AND )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:436:8: AND
        {
        match(input,AND,FOLLOW_AND_in_synpred23_DnaSqlQuery2166); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_DnaSqlQuery

    // $ANTLR start synpred24_DnaSqlQuery
    public final void synpred24_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:6: ( NOT )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:447:7: NOT
        {
        match(input,NOT,FOLLOW_NOT_in_synpred24_DnaSqlQuery2229); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_DnaSqlQuery

    // $ANTLR start synpred26_DnaSqlQuery
    public final void synpred26_DnaSqlQuery_fragment() throws RecognitionException {   
        Token l=null;
        Token r=null;
        ConditionExpression c = null;


        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:5: ( ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN ) )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:5: ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN )
        {
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:5: ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:453:6: ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN
        {
        l=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred26_DnaSqlQuery2278); if (state.failed) return ;
        pushFollow(FOLLOW_condition_exp_in_synpred26_DnaSqlQuery2282);
        c=condition_exp();

        state._fsp--;
        if (state.failed) return ;
        r=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_synpred26_DnaSqlQuery2286); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_DnaSqlQuery

    // $ANTLR start synpred28_DnaSqlQuery
    public final void synpred28_DnaSqlQuery_fragment() throws RecognitionException {   
        HierarchyPredicate h = null;


        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:455:5: (h= hierarchy_predicate )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:455:5: h= hierarchy_predicate
        {
        pushFollow(FOLLOW_hierarchy_predicate_in_synpred28_DnaSqlQuery2307);
        h=hierarchy_predicate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_DnaSqlQuery

    // $ANTLR start synpred30_DnaSqlQuery
    public final void synpred30_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:10: ( comp_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:467:11: comp_op
        {
        pushFollow(FOLLOW_comp_op_in_synpred30_DnaSqlQuery2400);
        comp_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_DnaSqlQuery

    // $ANTLR start synpred43_DnaSqlQuery
    public final void synpred43_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:4: ( table_join_type JOIN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:721:5: table_join_type JOIN
        {
        pushFollow(FOLLOW_table_join_type_in_synpred43_DnaSqlQuery3947);
        table_join_type();

        state._fsp--;
        if (state.failed) return ;
        match(input,JOIN,FOLLOW_JOIN_in_synpred43_DnaSqlQuery3949); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_DnaSqlQuery

    // $ANTLR start synpred44_DnaSqlQuery
    public final void synpred44_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:724:5: ( table_join_type RELATE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:724:6: table_join_type RELATE
        {
        pushFollow(FOLLOW_table_join_type_in_synpred44_DnaSqlQuery3984);
        table_join_type();

        state._fsp--;
        if (state.failed) return ;
        match(input,RELATE,FOLLOW_RELATE_in_synpred44_DnaSqlQuery3986); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_DnaSqlQuery

    // $ANTLR start synpred46_DnaSqlQuery
    public final void synpred46_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:843:22: ( hierachy_direct_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:843:23: hierachy_direct_op
        {
        pushFollow(FOLLOW_hierachy_direct_op_in_synpred46_DnaSqlQuery4493);
        hierachy_direct_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_DnaSqlQuery

    // $ANTLR start synpred47_DnaSqlQuery
    public final void synpred47_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:847:6: ( hierachy_relative_op )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:847:7: hierachy_relative_op
        {
        pushFollow(FOLLOW_hierachy_relative_op_in_synpred47_DnaSqlQuery4531);
        hierachy_relative_op();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_DnaSqlQuery

    // $ANTLR start synpred48_DnaSqlQuery
    public final void synpred48_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:9: ( RELATIVE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:851:10: RELATIVE
        {
        match(input,RELATIVE,FOLLOW_RELATIVE_in_synpred48_DnaSqlQuery4574); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_DnaSqlQuery

    // $ANTLR start synpred49_DnaSqlQuery
    public final void synpred49_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:9: ( RANGE )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:852:10: RANGE
        {
        match(input,RANGE,FOLLOW_RANGE_in_synpred49_DnaSqlQuery4598); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_DnaSqlQuery

    // $ANTLR start synpred50_DnaSqlQuery
    public final void synpred50_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:862:6: ( IS LEAF )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:862:7: IS LEAF
        {
        match(input,IS,FOLLOW_IS_in_synpred50_DnaSqlQuery4643); if (state.failed) return ;
        match(input,LEAF,FOLLOW_LEAF_in_synpred50_DnaSqlQuery4645); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_DnaSqlQuery

    // $ANTLR start synpred51_DnaSqlQuery
    public final void synpred51_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:5: ( USING LEFT_PAREN )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:870:6: USING LEFT_PAREN
        {
        match(input,USING,FOLLOW_USING_in_synpred51_DnaSqlQuery4705); if (state.failed) return ;
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred51_DnaSqlQuery4707); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_DnaSqlQuery

    // $ANTLR start synpred52_DnaSqlQuery
    public final void synpred52_DnaSqlQuery_fragment() throws RecognitionException {   
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:878:5: ( USING )
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:878:6: USING
        {
        match(input,USING,FOLLOW_USING_in_synpred52_DnaSqlQuery4767); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_DnaSqlQuery

    // Delegated rules

    public final boolean synpred23_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_DnaSqlQuery() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_DnaSqlQuery_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\20\15\uffff";
    static final String DFA2_maxS =
        "\1\36\15\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA2_specialS =
        "\1\0\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "153:4: ( ( ENUM )=> (t= ENUM ) l= LESS_THAN_OP c= class_reference g= GREATER_THAN_OP | t= BOOLEAN | t= BYTES | t= BYTE | t= DATE | t= DOUBLE | t= FLOAT | t= GUID | t= INT | t= LONG | t= SHORT | t= STRING | t= REGULAR_ID )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==ENUM) && (synpred1_DnaSqlQuery())) {s = 1;}

                        else if ( (LA2_0==BOOLEAN) ) {s = 2;}

                        else if ( (LA2_0==BYTES) ) {s = 3;}

                        else if ( (LA2_0==BYTE) ) {s = 4;}

                        else if ( (LA2_0==DATE) ) {s = 5;}

                        else if ( (LA2_0==DOUBLE) ) {s = 6;}

                        else if ( (LA2_0==FLOAT) ) {s = 7;}

                        else if ( (LA2_0==GUID) ) {s = 8;}

                        else if ( (LA2_0==INT) ) {s = 9;}

                        else if ( (LA2_0==LONG) ) {s = 10;}

                        else if ( (LA2_0==SHORT) ) {s = 11;}

                        else if ( (LA2_0==STRING) ) {s = 12;}

                        else if ( (LA2_0==REGULAR_ID) ) {s = 13;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\26\uffff";
    static final String DFA19_eofS =
        "\26\uffff";
    static final String DFA19_minS =
        "\1\5\3\uffff\16\11\4\uffff";
    static final String DFA19_maxS =
        "\1\u0117\3\uffff\16\45\4\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\16\uffff\1\6\1\7\1\5\1\4";
    static final String DFA19_specialS =
        "\1\0\25\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\22\1\uffff\1\22\7\uffff\1\22\4\uffff\1\22\1\uffff\1\22\2"+
            "\uffff\1\22\4\uffff\1\4\6\uffff\1\23\1\uffff\5\1\2\uffff\2\3"+
            "\3\uffff\2\2\4\uffff\5\22\14\uffff\1\5\155\uffff\1\6\52\uffff"+
            "\1\7\5\uffff\1\10\1\11\4\uffff\1\12\1\uffff\1\13\16\uffff\1"+
            "\14\4\uffff\1\15\3\uffff\1\16\11\uffff\1\17\1\20\2\uffff\1\21",
            "",
            "",
            "",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "\1\24\33\uffff\1\25",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "264:1: value_exp_primary returns [ValueExpression exp=null] : (e= set_fct_spec | c= case_exp | h= hierarchy_fun_spec | f= function_spec | o= column_ref | u= unsigned_value_spec | ( LEFT_PAREN )=> (l= LEFT_PAREN ) v= value_exp r= RIGHT_PAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_0>=COUNT && LA19_0<=MIN)) ) {s = 1;}

                        else if ( ((LA19_0>=COALESCE && LA19_0<=CASE)) ) {s = 2;}

                        else if ( ((LA19_0>=H_LV && LA19_0<=H_AID)) ) {s = 3;}

                        else if ( (LA19_0==REGULAR_ID) ) {s = 4;}

                        else if ( (LA19_0==DELIMITED_ID) ) {s = 5;}

                        else if ( (LA19_0==DATA) ) {s = 6;}

                        else if ( (LA19_0==LENGTH) ) {s = 7;}

                        else if ( (LA19_0==MORE) ) {s = 8;}

                        else if ( (LA19_0==NAME) ) {s = 9;}

                        else if ( (LA19_0==NULLABLE) ) {s = 10;}

                        else if ( (LA19_0==NUMBER) ) {s = 11;}

                        else if ( (LA19_0==REPEATABLE) ) {s = 12;}

                        else if ( (LA19_0==SCALE) ) {s = 13;}

                        else if ( (LA19_0==SERIALIZABLE) ) {s = 14;}

                        else if ( (LA19_0==TYPE) ) {s = 15;}

                        else if ( (LA19_0==UNCOMMITTED) ) {s = 16;}

                        else if ( (LA19_0==UNNAMED) ) {s = 17;}

                        else if ( (LA19_0==APPROXIMATE_NUM_LIT||LA19_0==MINUS_SIGN||LA19_0==ARGUMENT_ID||LA19_0==BYTES||LA19_0==DATE||LA19_0==GUID||(LA19_0>=TRUE && LA19_0<=EXACT_NUM_LIT)) ) {s = 18;}

                        else if ( (LA19_0==LEFT_PAREN) && (synpred8_DnaSqlQuery())) {s = 19;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\21\uffff";
    static final String DFA33_eofS =
        "\21\uffff";
    static final String DFA33_minS =
        "\1\5\1\uffff\16\11\1\uffff";
    static final String DFA33_maxS =
        "\1\u0117\1\uffff\16\62\1\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\16\uffff\1\2";
    static final String DFA33_specialS =
        "\21\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\1\uffff\1\1\7\uffff\1\1\4\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\1\1\4\uffff\1\2\6\uffff\1\1\1\uffff\5\1\2\uffff\2\1\3\uffff"+
            "\2\1\4\uffff\5\1\14\uffff\1\3\155\uffff\1\4\52\uffff\1\5\5\uffff"+
            "\1\6\1\7\4\uffff\1\10\1\uffff\1\11\16\uffff\1\12\4\uffff\1\13"+
            "\3\uffff\1\14\11\uffff\1\15\1\16\2\uffff\1\17",
            "",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            "\1\1\33\uffff\1\1\1\20\13\uffff\1\20",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "336:1: function_parameter returns [IFunctionParameter para=null] : (e= value_exp | t= table_ref_ref );";
        }
    }
    static final String DFA53_eotS =
        "\66\uffff";
    static final String DFA53_eofS =
        "\66\uffff";
    static final String DFA53_minS =
        "\1\5\1\0\1\uffff\16\0\45\uffff";
    static final String DFA53_maxS =
        "\1\u0117\1\0\1\uffff\16\0\45\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\16\uffff\1\4\42\uffff\1\1\1\3";
    static final String DFA53_specialS =
        "\1\uffff\1\0\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16\45\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\21\1\uffff\1\21\4\uffff\4\21\1\uffff\2\21\1\uffff\1\21\1"+
            "\uffff\1\21\2\uffff\1\21\4\uffff\1\3\1\uffff\2\21\3\uffff\1"+
            "\1\1\uffff\5\21\2\uffff\2\21\3\uffff\2\21\4\uffff\5\21\2\uffff"+
            "\1\2\4\21\1\uffff\4\21\1\4\155\uffff\1\5\52\uffff\1\6\5\uffff"+
            "\1\7\1\10\4\uffff\1\11\1\uffff\1\12\16\uffff\1\13\4\uffff\1"+
            "\14\3\uffff\1\15\11\uffff\1\16\1\17\2\uffff\1\20",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "451:1: condition_primary returns [ConditionExpression ce=null] options {backtrack=true; } : ( ( ( LEFT_PAREN )=>l= LEFT_PAREN c= condition_exp r= RIGHT_PAREN ) | e= exists_predicate | h= hierarchy_predicate | p= predicate );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_DnaSqlQuery()) ) {s = 52;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_DnaSqlQuery()) ) {s = 53;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_4 = input.LA(1);

                         
                        int index53_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_DnaSqlQuery()) ) {s = 53;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index53_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA53_14 = input.LA(1);

                         
                        int index53_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA53_15 = input.LA(1);

                         
                        int index53_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA53_16 = input.LA(1);

                         
                        int index53_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred28_DnaSqlQuery()&&(unserved_as_id))) ) {s = 53;}

                        else if ( ((unserved_as_id)) ) {s = 17;}

                         
                        input.seek(index53_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\21\uffff";
    static final String DFA103_eofS =
        "\21\uffff";
    static final String DFA103_minS =
        "\1\137\1\36\17\uffff";
    static final String DFA103_maxS =
        "\1\137\1\u0117\17\uffff";
    static final String DFA103_acceptS =
        "\2\uffff\1\1\16\2";
    static final String DFA103_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\1",
            "\1\3\6\uffff\1\2\44\uffff\1\4\155\uffff\1\5\52\uffff\1\6\5"+
            "\uffff\1\7\1\10\4\uffff\1\11\1\uffff\1\12\16\uffff\1\13\4\uffff"+
            "\1\14\3\uffff\1\15\11\uffff\1\16\1\17\2\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "869:1: hierachy_using[HierarchyPredicate hp] : ( ( USING LEFT_PAREN )=> (u= USING l= LEFT_PAREN ) fh= id c= COMMA sh= id r= RIGHT_PAREN | ( USING )=> (u= USING ) h= id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_1 = input.LA(1);

                         
                        int index103_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA103_1==LEFT_PAREN) && (synpred51_DnaSqlQuery())) {s = 2;}

                        else if ( (LA103_1==REGULAR_ID) && (synpred52_DnaSqlQuery())) {s = 3;}

                        else if ( (LA103_1==DELIMITED_ID) && (synpred52_DnaSqlQuery())) {s = 4;}

                        else if ( (LA103_1==DATA) && (synpred52_DnaSqlQuery())) {s = 5;}

                        else if ( (LA103_1==LENGTH) && (synpred52_DnaSqlQuery())) {s = 6;}

                        else if ( (LA103_1==MORE) && (synpred52_DnaSqlQuery())) {s = 7;}

                        else if ( (LA103_1==NAME) && (synpred52_DnaSqlQuery())) {s = 8;}

                        else if ( (LA103_1==NULLABLE) && (synpred52_DnaSqlQuery())) {s = 9;}

                        else if ( (LA103_1==NUMBER) && (synpred52_DnaSqlQuery())) {s = 10;}

                        else if ( (LA103_1==REPEATABLE) && (synpred52_DnaSqlQuery())) {s = 11;}

                        else if ( (LA103_1==SCALE) && (synpred52_DnaSqlQuery())) {s = 12;}

                        else if ( (LA103_1==SERIALIZABLE) && (synpred52_DnaSqlQuery())) {s = 13;}

                        else if ( (LA103_1==TYPE) && (synpred52_DnaSqlQuery())) {s = 14;}

                        else if ( (LA103_1==UNCOMMITTED) && (synpred52_DnaSqlQuery())) {s = 15;}

                        else if ( (LA103_1==UNNAMED) && (synpred52_DnaSqlQuery())) {s = 16;}

                         
                        input.seek(index103_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ARGUMENT_ID_in_argument_declaration136 = new BitSet(new long[]{0x000000007FF90000L});
    public static final BitSet FOLLOW_data_type_in_argument_declaration140 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_argument_modifier_in_argument_declaration151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_data_type179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LESS_THAN_OP_in_data_type184 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_class_reference_in_data_type191 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_data_type195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_data_type203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTES_in_data_type212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_data_type222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_data_type232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_data_type242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_data_type251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GUID_in_data_type261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data_type272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_data_type284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_data_type297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data_type307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGULAR_ID_in_data_type315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_class_reference343 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_PERIOD_in_class_reference369 = new BitSet(new long[]{0x0000000040000202L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_class_reference374 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_default_value_spec_in_argument_modifier408 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_not_null_spec_in_argument_modifier412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_null_spec_in_argument_modifier421 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_default_value_spec_in_argument_modifier425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_value_spec449 = new BitSet(new long[]{0x3E000000025000A0L});
    public static final BitSet FOLLOW_constant_exp_in_default_value_spec454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not_null_spec478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NULL_in_not_null_spec483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_value_exp510 = new BitSet(new long[]{0x0000000400000082L});
    public static final BitSet FOLLOW_term_op_in_value_exp532 = new BitSet(new long[]{0x3E18CFA4425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_term_in_value_exp540 = new BitSet(new long[]{0x0000000400000082L});
    public static final BitSet FOLLOW_term_op_in_value_exp566 = new BitSet(new long[]{0x3E18CFA4425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_term_in_value_exp574 = new BitSet(new long[]{0x0000000400000082L});
    public static final BitSet FOLLOW_PLUS_SIGN_in_term_op615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_SIGN_in_term_op627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term649 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_factor_op_in_term665 = new BitSet(new long[]{0x3E18CFB8425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_factor_in_term673 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_factor_op_in_term696 = new BitSet(new long[]{0x3E18CFB8425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_factor_in_term704 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ASTERISK_in_factor_op741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOLIDUS_in_factor_op754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_primary_in_factor780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_SIGN_in_sign809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_SIGN_in_sign821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_fct_spec_in_value_exp_primary840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_exp_in_value_exp_primary853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierarchy_fun_spec_in_value_exp_primary870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_spec_in_value_exp_primary881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_ref_in_value_exp_primary893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_spec_in_value_exp_primary908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_value_exp_primary926 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_value_exp_primary931 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_value_exp_primary935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_set_fct_spec961 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_set_fct_spec963 = new BitSet(new long[]{0x3E18FFA8425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_ASTERISK_in_set_fct_spec976 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_set_quantifier_in_set_fct_spec993 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_set_fct_spec999 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_set_fct_spec1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_set_fct_spec1027 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SUM_in_set_fct_spec1037 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_set_fct_spec1041 = new BitSet(new long[]{0x3E18FFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_set_quantifier_in_set_fct_spec1046 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_set_fct_spec1052 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_set_fct_spec1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_set_fct_spec1074 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_MIN_in_set_fct_spec1085 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_set_fct_spec1089 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_set_fct_spec1094 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_set_fct_spec1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_set_quantifier1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_set_quantifier1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_H_LV_in_hierarchy_fun_spec1154 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_hierarchy_fun_spec1157 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_ref_in_hierarchy_fun_spec1167 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PERIOD_in_hierarchy_fun_spec1169 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierarchy_fun_spec1173 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_hierarchy_fun_spec1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_H_AID_in_hierarchy_fun_spec1207 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_hierarchy_fun_spec1209 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_ref_in_hierarchy_fun_spec1219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PERIOD_in_hierarchy_fun_spec1221 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierarchy_fun_spec1225 = new BitSet(new long[]{0x0003004000000000L});
    public static final BitSet FOLLOW_REL_in_hierarchy_fun_spec1247 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_ABO_in_hierarchy_fun_spec1251 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_hierarchy_fun_spec1256 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_hierarchy_fun_spec1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_spec1310 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_spec1317 = new BitSet(new long[]{0x3E18CFE0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_function_parameter_in_function_spec1334 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_function_spec1349 = new BitSet(new long[]{0x3E1CCFE0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_function_parameter_in_function_spec1357 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_spec1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_function_name1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_function_parameter1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_ref_in_function_parameter1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_abbreviation_in_case_exp1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_spec_in_case_exp1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COALESCE_in_case_abbreviation1517 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_case_abbreviation1527 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1531 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_case_abbreviation1536 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_case_abbreviation1540 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_case_abbreviation1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_spec1577 = new BitSet(new long[]{0x3E38CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_WHEN_in_case_spec1598 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_case_spec1602 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_THEN_in_case_spec1607 = new BitSet(new long[]{0x3E18CFA2425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_result_in_case_spec1611 = new BitSet(new long[]{0x01A0000000000000L});
    public static final BitSet FOLLOW_value_exp_in_case_spec1629 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_WHEN_in_case_spec1638 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_case_spec1642 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_THEN_in_case_spec1647 = new BitSet(new long[]{0x3E18CFA2425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_result_in_case_spec1651 = new BitSet(new long[]{0x01A0000000000000L});
    public static final BitSet FOLLOW_ELSE_in_case_spec1668 = new BitSet(new long[]{0x3E18CFA2425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_result_in_case_spec1672 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_END_in_case_spec1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_result1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_exp_in_unsigned_value_spec1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_spec_in_unsigned_value_spec1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant_exp1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant_exp1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_constant_exp1808 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_constant_exp1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GUID_in_constant_exp1835 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_constant_exp1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTES_in_constant_exp1862 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CHAR_STRING_in_constant_exp1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_SIGN_in_constant_exp1888 = new BitSet(new long[]{0x3000000000000020L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant_exp1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACT_NUM_LIT_in_constant_exp1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPROXIMATE_NUM_LIT_in_constant_exp1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_STRING_in_constant_exp1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_ID_in_argument_spec1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_term_in_condition_exp2015 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_OR_in_condition_exp2032 = new BitSet(new long[]{0x7E18CFA34256F0A2L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_term_in_condition_exp2040 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_OR_in_condition_exp2065 = new BitSet(new long[]{0x7E18CFA34256F0A2L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_term_in_condition_exp2073 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_condition_factor_in_condition_term2122 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_AND_in_condition_term2139 = new BitSet(new long[]{0xBE18CFA34256F0A2L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_factor_in_condition_term2147 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_AND_in_condition_term2172 = new BitSet(new long[]{0xBE18CFA34256F0A2L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_factor_in_condition_term2180 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_NOT_in_condition_factor2234 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_primary_in_condition_factor2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_condition_primary2278 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_condition_primary2282 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_condition_primary2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exists_predicate_in_condition_primary2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierarchy_predicate_in_condition_primary2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_condition_primary2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_exists_predicate2344 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_subquery_in_exists_predicate2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_predicate2384 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_comp_predicate_in_predicate2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_predicate2420 = new BitSet(new long[]{0x0000000100000000L,0x00000000000001DCL});
    public static final BitSet FOLLOW_between_predicate_in_predicate2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_predicate_in_predicate2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_predicate_in_predicate2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_predicate_in_predicate2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_predicate_in_predicate2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_comp_predicate2576 = new BitSet(new long[]{0x3E18CFA2425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_subquery_in_comp_predicate2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_in_comp_predicate2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_OP_in_comp_op2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUALS_OP_in_comp_op2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OP_in_comp_op2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_comp_op2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUALS_OP_in_comp_op2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_comp_op2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BETWEEN_in_between_predicate2689 = new BitSet(new long[]{0x3E18CFA2425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate2694 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_AND_in_between_predicate2696 = new BitSet(new long[]{0x3E18CFA2425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_row_value_constructor_in_between_predicate2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_predicate2728 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_in_predicate_value_in_in_predicate2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_in_predicate_value2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_in_predicate_value2762 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_in_value_list_in_in_predicate_value2766 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_in_predicate_value2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_in_value_list2793 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_in_value_list2798 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_in_value_list2802 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_LIKE_in_like_predicate2829 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_pattern_in_like_predicate2834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ESCAPE_in_like_predicate2837 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_escape_char_in_like_predicate2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARTS_WITH_in_string_predicate2862 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_ENDS_WITH_in_string_predicate2866 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_CONTAINS_in_string_predicate2870 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_pattern_in_string_predicate2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_pattern2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_escape_char2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_null_predicate2958 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_NOT_in_null_predicate2964 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NULL_in_null_predicate2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_row_value_constructor2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_row_value_constructor3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGULAR_ID_in_id3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITED_ID_in_id3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_reserved_word_in_id3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_eof3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_query_declare3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QUERY_in_query_declare3105 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_query_declare3110 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_argument_list_in_query_declare3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_query_declare3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_with_statement_in_query_declare3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_query_statement_in_query_declare3150 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_query_declare3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_argument_list3188 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_argument_declaration_in_argument_list3199 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_argument_list3219 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_argument_declaration_in_argument_list3226 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_argument_list3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_body_in_query_statement3278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_union_statement_in_query_statement3289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_select_statement_in_query_body3314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_from_statement_in_query_body3326 = new BitSet(new long[]{0x0000000000000002L,0x0000021008000000L});
    public static final BitSet FOLLOW_where_statement_in_query_body3341 = new BitSet(new long[]{0x0000000000000002L,0x0000021000000000L});
    public static final BitSet FOLLOW_group_statement_in_query_body3361 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_having_statement_in_query_body3379 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_order_statement_in_query_body3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_subquery3439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_query_statement_in_subquery3453 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_subquery3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_union_statement3493 = new BitSet(new long[]{0x0000200000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ALL_in_union_statement3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_query_body_in_union_statement3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_ref_in_column_ref3538 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PERIOD_in_column_ref3542 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_column_ref3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_table_ref_ref3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_statement3599 = new BitSet(new long[]{0x0004002000000002L});
    public static final BitSet FOLLOW_subquery_in_with_statement3612 = new BitSet(new long[]{0x0004000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_alias_spec_in_with_statement3614 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_with_statement3632 = new BitSet(new long[]{0x0004002000000002L});
    public static final BitSet FOLLOW_subquery_in_with_statement3639 = new BitSet(new long[]{0x0004000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_alias_spec_in_with_statement3641 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement3682 = new BitSet(new long[]{0x3E18FFA0425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_set_quantifier_in_select_statement3695 = new BitSet(new long[]{0x3E18CFA0425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_derived_column_in_select_statement3709 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_statement3723 = new BitSet(new long[]{0x3E1CCFA0425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_derived_column_in_select_statement3730 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_value_exp_in_derived_column3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_alias_spec_in_derived_column3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from_statement3820 = new BitSet(new long[]{0x0000002040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_statement_in_from_statement3834 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_from_statement3844 = new BitSet(new long[]{0x0004002040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_statement_in_from_statement3851 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_table_ref_aux_in_table_ref_statement3904 = new BitSet(new long[]{0x0000000000000002L,0x00000000007C0000L});
    public static final BitSet FOLLOW_table_join_in_table_ref_statement3917 = new BitSet(new long[]{0x0000000000000002L,0x00000000007C0000L});
    public static final BitSet FOLLOW_table_join_type_in_table_join3955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_JOIN_in_table_join3959 = new BitSet(new long[]{0x0000002040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_statement_in_table_join3964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_table_join_spec_in_table_join3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_join_type_in_table_join3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RELATE_in_table_join3996 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_relation_in_table_join4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_ref_in_table_relation4035 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_relation_spec_in_table_relation4039 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_table_ref_alias_spec_in_table_relation4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_table_modifier_in_table_relation4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_relation_spec4072 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_relation_spec4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_table_join_type4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_table_join_type4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_in_table_join_type4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_join_spec4149 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_table_join_spec4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_simple_in_table_ref_aux4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_query_ref_simple_in_table_ref_aux4189 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_table_modifier_in_table_ref_aux4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_table_ref_simple4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_table_ref_alias_spec_in_table_ref_simple4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_table_ref_alias_spec4257 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_table_ref_alias_spec4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_query_ref_simple4294 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_query_ref_alias_spec_in_query_ref_simple4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_query_ref_alias_spec4324 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_query_ref_alias_spec4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_alias_spec4359 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_alias_spec4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_table_modifier4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_UPDATE_in_table_modifier4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_table_name4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_statement4444 = new BitSet(new long[]{0x3E18CFA34256F0A2L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_where_statement4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_ref_ref_in_hierarchy_predicate4477 = new BitSet(new long[]{0x0000000000000000L,0x0000000F00000200L});
    public static final BitSet FOLLOW_hierachy_direct_op_in_hierarchy_predicate4499 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_ref_in_hierarchy_predicate4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_hierachy_using_in_hierarchy_predicate4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierachy_relative_op_in_hierarchy_predicate4537 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_ref_in_hierarchy_predicate4542 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_hierachy_using_in_hierarchy_predicate4556 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_RELATIVE_in_hierarchy_predicate4580 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_hierarchy_predicate4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_hierarchy_predicate4604 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_hierarchy_predicate4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_hierarchy_predicate4651 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LEAF_in_hierarchy_predicate4655 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_USING_in_hierarchy_predicate4672 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierarchy_predicate4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_hierachy_using4713 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_hierachy_using4717 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierachy_using4732 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_COMMA_in_hierachy_using4736 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierachy_using4740 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_hierachy_using4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_hierachy_using4773 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_hierachy_using4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHILDOF_in_hierachy_direct_op4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTOF_in_hierachy_direct_op4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCENDANTOF_in_hierachy_relative_op4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANCESTOROF_in_hierachy_relative_op4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group_statement4885 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_group_statement4889 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_group_column_in_group_statement4901 = new BitSet(new long[]{0x0004000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_group_statement4910 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_group_column_in_group_statement4916 = new BitSet(new long[]{0x0004000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_group_property_in_group_statement4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_exp_in_group_column4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_group_property4972 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_ROLLUP_in_group_property4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUBE_in_group_property5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_having_statement5036 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_having_statement5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_order_statement5074 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_BY_in_order_statement5076 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_order_expression_in_order_statement5087 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_order_statement5096 = new BitSet(new long[]{0x3E18CFA0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_order_expression_in_order_statement5102 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_value_exp_in_order_expression5127 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_ordering_spec_in_order_expression5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_ordering_spec5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_spec5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_mapping_declare5194 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ORM_in_mapping_declare5198 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_mapping_declare5203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_argument_list_in_mapping_declare5211 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_mapping_statement_in_mapping_declare5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_mapping_declare5243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_with_statement_in_mapping_declare5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_query_statement_in_mapping_declare5265 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_mapping_override_in_mapping_declare5280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_mapping_declare5298 = new BitSet(new long[]{0x0100000000000002L,0x0000030008000000L});
    public static final BitSet FOLLOW_where_statement_in_mapping_declare5308 = new BitSet(new long[]{0x0100000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_having_statement_in_mapping_declare5328 = new BitSet(new long[]{0x0100000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_order_statement_in_mapping_declare5345 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_mapping_declare5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAPPING_in_mapping_statement5406 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_mapping_statement5424 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_PERIOD_in_mapping_statement5448 = new BitSet(new long[]{0x0000000040000202L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_mapping_statement5453 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_OVERRIDE_in_mapping_override5513 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_mapping_override5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement5559 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement5563 = new BitSet(new long[]{0x0000002040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_name_in_insert_statement5579 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_insert_columns_in_insert_statement5595 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_insert_values_in_insert_statement5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_insert_statement5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_insert_columns5642 = new BitSet(new long[]{0x0004004040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_insert_columns5655 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_columns5674 = new BitSet(new long[]{0x0004004040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_insert_columns5682 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_columns5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUES_in_insert_values5736 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_insert_values5748 = new BitSet(new long[]{0x3E1CCFE0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_insert_values5757 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_values5776 = new BitSet(new long[]{0x3E1CCFE0425080A0L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_value_exp_in_insert_values5783 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_values5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement5835 = new BitSet(new long[]{0x0000002040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_statement_in_update_statement5851 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_statement_in_update_statement5859 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_where_statement_in_update_statement5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_statement5896 = new BitSet(new long[]{0x0004000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_assign_statement_in_set_statement5902 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_COMMA_in_set_statement5921 = new BitSet(new long[]{0x0004000040000002L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_assign_statement_in_set_statement5928 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_id_in_assign_statement5963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_OP_in_assign_statement5967 = new BitSet(new long[]{0x3E18CFA2425080A2L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_row_value_constructor_in_assign_statement5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement6007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement6011 = new BitSet(new long[]{0x0000002040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_table_ref_statement_in_delete_statement6026 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_where_statement_in_delete_statement6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_insert_declare6074 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_INSERT_in_insert_declare6078 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_insert_declare6083 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_argument_list_in_insert_declare6091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_insert_declare6099 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_insert_statement_in_insert_declare6103 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_insert_declare6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_update_declare6154 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_UPDATE_in_update_declare6158 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_update_declare6163 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_argument_list_in_update_declare6171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_update_declare6179 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_update_statement_in_update_declare6183 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_update_declare6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_delete_declare6231 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_DELETE_in_delete_declare6235 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_delete_declare6240 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_argument_list_in_delete_declare6248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_delete_declare6256 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_delete_statement_in_delete_declare6260 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_delete_declare6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_declare_in_command_declare6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_declare_in_command_declare6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_declare_in_command_declare6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_table_abs_declaration6359 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ABSTABLE_in_table_abs_declaration6363 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_table_abs_declaration6368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_table_abs_declaration6376 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_table_abs_statement_in_table_abs_declaration6380 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_table_abs_declaration6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_table_normal_declaration6434 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_TABLE_in_table_normal_declaration6438 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_id_in_table_normal_declaration6443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_table_normal_declaration6451 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_table_normal_statement_in_table_normal_declaration6455 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_END_in_table_normal_declaration6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_column_type_reference6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_column_type_reference6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_column_type_reference6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_column_type_reference6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GUID_in_column_type_reference6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_column_type_reference6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_column_type_reference6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NTEXT_in_column_type_reference6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_column_type_reference6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_column_type_reference6692 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_CHAR_in_column_type_reference6702 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_NCHAR_in_column_type_reference6712 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_NVARCHAR_in_column_type_reference6722 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_VARBINARY_in_column_type_reference6732 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_column_type_reference6742 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_column_type_reference6757 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6761 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_column_type_reference6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_in_column_type_reference6781 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_column_type_reference6790 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6794 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_COMMA_in_column_type_reference6797 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_column_type_reference6801 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_column_type_reference6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_declare_in_sql_declare6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapping_declare_in_sql_declare6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_non_reserved_word12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LENGTH_in_non_reserved_word12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MORE_in_non_reserved_word12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_non_reserved_word12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULLABLE_in_non_reserved_word12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_non_reserved_word12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATABLE_in_non_reserved_word12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_non_reserved_word12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERIALIZABLE_in_non_reserved_word12128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_non_reserved_word12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNCOMMITTED_in_non_reserved_word12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNNAMED_in_non_reserved_word12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_synpred1_DnaSqlQuery172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_op_in_synpred4_DnaSqlQuery526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_op_in_synpred5_DnaSqlQuery560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_op_in_synpred6_DnaSqlQuery659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_op_in_synpred7_DnaSqlQuery690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred8_DnaSqlQuery919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_H_LV_in_synpred9_DnaSqlQuery1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_H_AID_in_synpred10_DnaSqlQuery1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_synpred13_DnaSqlQuery1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_synpred14_DnaSqlQuery1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_synpred15_DnaSqlQuery1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_synpred16_DnaSqlQuery1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GUID_in_synpred17_DnaSqlQuery1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTES_in_synpred18_DnaSqlQuery1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_SIGN_in_synpred19_DnaSqlQuery1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred20_DnaSqlQuery2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred21_DnaSqlQuery2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred22_DnaSqlQuery2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred23_DnaSqlQuery2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_synpred24_DnaSqlQuery2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred26_DnaSqlQuery2278 = new BitSet(new long[]{0x3E18CFA34256F0A0L,0x00000000000007DFL,0x0100000000000000L,0x0002860800000000L,0x0000000000980221L});
    public static final BitSet FOLLOW_condition_exp_in_synpred26_DnaSqlQuery2282 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_synpred26_DnaSqlQuery2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierarchy_predicate_in_synpred28_DnaSqlQuery2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_synpred30_DnaSqlQuery2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_join_type_in_synpred43_DnaSqlQuery3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_JOIN_in_synpred43_DnaSqlQuery3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_join_type_in_synpred44_DnaSqlQuery3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RELATE_in_synpred44_DnaSqlQuery3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierachy_direct_op_in_synpred46_DnaSqlQuery4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hierachy_relative_op_in_synpred47_DnaSqlQuery4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_in_synpred48_DnaSqlQuery4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_synpred49_DnaSqlQuery4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_synpred50_DnaSqlQuery4643 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LEAF_in_synpred50_DnaSqlQuery4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_synpred51_DnaSqlQuery4705 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred51_DnaSqlQuery4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_synpred52_DnaSqlQuery4767 = new BitSet(new long[]{0x0000000000000002L});

}