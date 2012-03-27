// $ANTLR 3.1.2 E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g 2010-05-28 10:30:25

package org.eclipse.jt.sql.assist.parser.internal.antlr.parsers;



import org.antlr.runtime.*;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrErrorReporter;
import org.eclipse.jt.sql.assist.parser.internal.antlr.AntlrPositionConvertor;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DnaSqlQueryLexer extends Lexer {
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
    public static final int CATALOG=166;
    public static final int UPDATE=90;
    public static final int ZONE=288;
    public static final int EQUALS_OP=65;
    public static final int SCALE=261;
    public static final int ANY=157;
    public static final int X=151;
    public static final int TIME=272;
    public static final int ALTER=156;
    public static final int BOOLEAN=19;
    public static final int ELSE=55;
    public static final int GREATER_THAN_OR_EQUALS_OP=14;
    public static final int COUNT=39;
    public static final int NULL=33;
    public static final int DIAGNOSTICS=194;
    public static final int TEXT=120;
    public static final int ASTERISK=35;
    public static final int COLON=293;
    public static final int HAVING=104;
    public static final int SET=114;
    public static final int J=137;
    public static final int INDICATOR=214;
    public static final int ADD=155;
    public static final int TRUE=57;
    public static final int DAY=185;
    public static final int UNDERSCORE=10;
    public static final int UNIQUE=277;
    public static final int SHORT=28;
    public static final int UNKNOWN=278;
    public static final int GRANT=210;
    public static final int MINUTE=230;
    public static final int TYPE=275;
    public static final int O=142;
    public static final int OUTPUT=246;
    public static final int PUBLIC=252;
    public static final int LONG=27;
    public static final int NULLABLE=239;
    public static final int INPUT=217;
    public static final int H_LV=46;
    public static final int PERCENT=291;
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
    public static final int AT=159;
    public static final int INTERSECT=220;
    public static final int DISTINCT=44;
    public static final int SPACE=269;
    public static final int DELIMITED_ID=74;
    public static final int CASCADE=163;
    public static final int PRIOR=250;
    public static final int CHAR=122;
    public static final int NCHAR=123;
    public static final int WRITE=286;
    public static final int DOUBLE_QUOTE=6;
    public static final int OF=242;
    public static final int DATA=184;
    public static final int ORM=108;
    public static final int A=128;
    public static final int VARCHAR=126;
    public static final int RELATE=83;
    public static final int NTEXT=119;
    public static final int SCROLL=263;
    public static final int CASE=52;
    public static final int INTRODUCER=299;
    public static final int DEFERRED=191;
    public static final int DEALLOCATE=186;
    public static final int TABLE=117;
    public static final int C=130;
    public static final int SEMICOLON=294;
    public static final int CHECK=168;
    public static final int KEY=224;
    public static final int REFERENCES=255;
    public static final int L=139;
    public static final int FIRST=206;
    public static final int DOMAIN=198;
    public static final int CHILDOF=96;
    public static final int ALL=45;
    public static final int COLUMN=172;
    public static final int NAME=234;
    public static final int INSERT=111;
    public static final int PARENTOF=97;
    public static final int VARYING=283;
    public static final int CREATE=180;
    public static final int WHERE=91;
    public static final int DIRECT=196;
    public static final int USING=95;
    public static final int INITIALLY=215;
    public static final int LEADING=226;
    public static final int CURRENT=182;
    public static final int I=136;
    public static final int QUERY=76;
    public static final int INNER=216;
    public static final int ROWS=260;
    public static final int ABO=49;
    public static final int F=133;
    public static final int BIT=161;
    public static final int VALUE=282;
    public static final int DECIMAL=188;
    public static final int RIGHT_BRACKET=298;
    public static final int K=138;
    public static final int ARGUMENT_ID=15;
    public static final int DOUBLE_PERIOD=8;
    public static final int VARBINARY=125;
    public static final int ANCESTOROF=99;
    public static final int LEFT_BRACKET=297;
    public static final int B=129;
    public static final int GROUP=100;
    public static final int IDENTITY=212;
    public static final int CONTAINS=72;
    public static final int MINUS_SIGN=7;
    public static final int LEFT=84;
    public static final int TEMPORARY=271;
    public static final int OUTER=245;
    public static final int NVARCHAR=124;
    public static final int ENUM=16;
    public static final int SQL=270;
    public static final int OVERLAPS=247;
    public static final int ROLLUP=102;
    public static final int H=135;
    public static final int BLOB=118;
    public static final int ISOLATION=223;
    public static final int IMMEDIATE=213;
    public static final int LENGTH=227;
    public static final int IS=73;
    public static final int G=134;
    public static final int EXACT_NUM_LIT=61;
    public static final int USER=281;
    public static final int NO=238;
    public static final int ACTION=154;
    public static final int MIN=43;
    public static final int ASC=106;
    public static final int QUOTE=11;
    public static final int BEGIN=77;
    public static final int HOUR=211;
    public static final int Z=153;
    public static final int COLLATION=171;
    public static final int DEFINE=75;
    public static final int SEPARATOR=302;
    public static final int CONVERT=178;
    public static final int EXTRACT=204;
    public static final int EOF=-1;
    public static final int CROSS=181;
    public static final int NAMES=235;
    public static final int CLOSE=169;
    public static final int SIZE=267;
    public static final int SOLIDUS=36;
    public static final int REL=48;
    public static final int REVOKE=258;
    public static final int Y=152;
    public static final int RIGHT_PAREN=38;
    public static final int H_AID=47;
    public static final int E=132;
    public static final int UNSIGNED_INTEGER=60;

      private AntlrErrorReporter reporter;
      public void setReporter(AntlrErrorReporter reporter) {
        this.reporter=reporter;
      }
    	public void emitErrorMessage(String msg) {
        if( reporter != null ) {
          reporter.reportMsg(null,msg);
        }
    	} 


    // delegates
    // delegators

    public DnaSqlQueryLexer() {;} 
    public DnaSqlQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DnaSqlQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g"; }

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1259:11: ( 'A' | 'a' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1260:11: ( 'B' | 'b' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1261:11: ( 'C' | 'c' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1262:11: ( 'D' | 'd' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1263:11: ( 'E' | 'e' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1264:11: ( 'F' | 'f' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1265:11: ( 'G' | 'g' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1266:11: ( 'H' | 'h' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1267:11: ( 'I' | 'i' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1268:11: ( 'J' | 'j' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1269:11: ( 'K' | 'k' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1270:11: ( 'L' | 'l' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1271:11: ( 'M' | 'm' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1272:11: ( 'N' | 'n' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1273:11: ( 'O' | 'o' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1274:11: ( 'P' | 'p' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1275:11: ( 'Q' | 'q' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1276:11: ( 'R' | 'r' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1277:11: ( 'S' | 's' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1278:11: ( 'T' | 't' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1279:11: ( 'U' | 'u' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1280:11: ( 'V' | 'v' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1281:11: ( 'W' | 'w' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1282:11: ( 'X' | 'x' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1283:11: ( 'Y' | 'y' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1284:11: ( 'Z' | 'z' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "ABO"
    public final void mABO() throws RecognitionException {
        try {
            int _type = ABO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1286:5: ( A B O )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1286:7: A B O
            {
            mA(); 
            mB(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABO"

    // $ANTLR start "ABSTABLE"
    public final void mABSTABLE() throws RecognitionException {
        try {
            int _type = ABSTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1287:10: ( A B S T A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1287:12: A B S T A B L E
            {
            mA(); 
            mB(); 
            mS(); 
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTABLE"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1288:8: ( A C T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1288:10: A C T I O N
            {
            mA(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1289:5: ( A D D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1289:7: A D D
            {
            mA(); 
            mD(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1290:5: ( A L L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1290:7: A L L
            {
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "ALTER"
    public final void mALTER() throws RecognitionException {
        try {
            int _type = ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1291:7: ( A L T E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1291:9: A L T E R
            {
            mA(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALTER"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1292:5: ( A N D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1292:7: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1293:5: ( A N Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1293:7: A N Y
            {
            mA(); 
            mN(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1294:4: ( A S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1294:6: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1295:5: ( A S C )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1295:7: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "ASSERTION"
    public final void mASSERTION() throws RecognitionException {
        try {
            int _type = ASSERTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1296:11: ( A S S E R T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1296:13: A S S E R T I O N
            {
            mA(); 
            mS(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERTION"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1297:4: ( A T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1297:6: A T
            {
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AUTHORIZATION"
    public final void mAUTHORIZATION() throws RecognitionException {
        try {
            int _type = AUTHORIZATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1298:15: ( A U T H O R I Z A T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1298:17: A U T H O R I Z A T I O N
            {
            mA(); 
            mU(); 
            mT(); 
            mH(); 
            mO(); 
            mR(); 
            mI(); 
            mZ(); 
            mA(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTHORIZATION"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1299:5: ( A V G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1299:7: A V G
            {
            mA(); 
            mV(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1300:7: ( B E G I N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1300:9: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1301:9: ( B E T W E E N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1301:11: B E T W E E N
            {
            mB(); 
            mE(); 
            mT(); 
            mW(); 
            mE(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BIT"
    public final void mBIT() throws RecognitionException {
        try {
            int _type = BIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1302:5: ( B I T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1302:7: B I T
            {
            mB(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT"

    // $ANTLR start "BOTH"
    public final void mBOTH() throws RecognitionException {
        try {
            int _type = BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1303:6: ( B O T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1303:8: B O T H
            {
            mB(); 
            mO(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOTH"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1304:4: ( B Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1304:6: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1305:9: ( C A S C A D E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1305:11: C A S C A D E
            {
            mC(); 
            mA(); 
            mS(); 
            mC(); 
            mA(); 
            mD(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "CASCADED"
    public final void mCASCADED() throws RecognitionException {
        try {
            int _type = CASCADED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1306:10: ( C A S C A D E D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1306:12: C A S C A D E D
            {
            mC(); 
            mA(); 
            mS(); 
            mC(); 
            mA(); 
            mD(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASCADED"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1307:6: ( C A S E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1307:8: C A S E
            {
            mC(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1308:6: ( C A S T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1308:8: C A S T
            {
            mC(); 
            mA(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "CATALOG"
    public final void mCATALOG() throws RecognitionException {
        try {
            int _type = CATALOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1309:9: ( C A T A L O G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1309:11: C A T A L O G
            {
            mC(); 
            mA(); 
            mT(); 
            mA(); 
            mL(); 
            mO(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATALOG"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1310:6: ( C H A R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1310:8: C H A R
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1311:11: ( C H A R A C T E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1311:13: C H A R A C T E R
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 
            mA(); 
            mC(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "CHECK"
    public final void mCHECK() throws RecognitionException {
        try {
            int _type = CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1312:7: ( C H E C K )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1312:9: C H E C K
            {
            mC(); 
            mH(); 
            mE(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHECK"

    // $ANTLR start "CHILDOF"
    public final void mCHILDOF() throws RecognitionException {
        try {
            int _type = CHILDOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1313:9: ( C H I L D O F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1313:11: C H I L D O F
            {
            mC(); 
            mH(); 
            mI(); 
            mL(); 
            mD(); 
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHILDOF"

    // $ANTLR start "CLOSE"
    public final void mCLOSE() throws RecognitionException {
        try {
            int _type = CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1314:7: ( C L O S E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1314:9: C L O S E
            {
            mC(); 
            mL(); 
            mO(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1315:10: ( C O A L E S C E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1315:12: C O A L E S C E
            {
            mC(); 
            mO(); 
            mA(); 
            mL(); 
            mE(); 
            mS(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1316:9: ( C O L L A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1316:11: C O L L A T E
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "COLLATION"
    public final void mCOLLATION() throws RecognitionException {
        try {
            int _type = COLLATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1317:11: ( C O L L A T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1317:13: C O L L A T I O N
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mA(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLATION"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1318:8: ( C O L U M N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1318:10: C O L U M N
            {
            mC(); 
            mO(); 
            mL(); 
            mU(); 
            mM(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1319:8: ( C O M M I T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1319:10: C O M M I T
            {
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1320:9: ( C O N N E C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1320:11: C O N N E C T
            {
            mC(); 
            mO(); 
            mN(); 
            mN(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "CONNECTION"
    public final void mCONNECTION() throws RecognitionException {
        try {
            int _type = CONNECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1321:12: ( C O N N E C T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1321:14: C O N N E C T I O N
            {
            mC(); 
            mO(); 
            mN(); 
            mN(); 
            mE(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECTION"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1322:10: ( C O N T A I N S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1322:12: C O N T A I N S
            {
            mC(); 
            mO(); 
            mN(); 
            mT(); 
            mA(); 
            mI(); 
            mN(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "CONSTRAINT"
    public final void mCONSTRAINT() throws RecognitionException {
        try {
            int _type = CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1323:12: ( C O N S T R A I N T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1323:14: C O N S T R A I N T
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mR(); 
            mA(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRAINT"

    // $ANTLR start "CONSTRAINTS"
    public final void mCONSTRAINTS() throws RecognitionException {
        try {
            int _type = CONSTRAINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1324:13: ( C O N S T R A I N T S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1324:15: C O N S T R A I N T S
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mR(); 
            mA(); 
            mI(); 
            mN(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRAINTS"

    // $ANTLR start "CONVERT"
    public final void mCONVERT() throws RecognitionException {
        try {
            int _type = CONVERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1325:9: ( C O N V E R T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1325:11: C O N V E R T
            {
            mC(); 
            mO(); 
            mN(); 
            mV(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONVERT"

    // $ANTLR start "CORRESPONDING"
    public final void mCORRESPONDING() throws RecognitionException {
        try {
            int _type = CORRESPONDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1326:15: ( C O R R E S P O N D I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1326:17: C O R R E S P O N D I N G
            {
            mC(); 
            mO(); 
            mR(); 
            mR(); 
            mE(); 
            mS(); 
            mP(); 
            mO(); 
            mN(); 
            mD(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORRESPONDING"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1327:7: ( C O U N T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1327:9: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1328:8: ( C R E A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1328:10: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1329:7: ( C R O S S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1329:9: C R O S S
            {
            mC(); 
            mR(); 
            mO(); 
            mS(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CROSS"

    // $ANTLR start "CUBE"
    public final void mCUBE() throws RecognitionException {
        try {
            int _type = CUBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1330:6: ( C U B E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1330:8: C U B E
            {
            mC(); 
            mU(); 
            mB(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CUBE"

    // $ANTLR start "CURRENT"
    public final void mCURRENT() throws RecognitionException {
        try {
            int _type = CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1331:9: ( C U R R E N T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1331:11: C U R R E N T
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT"

    // $ANTLR start "CURSOR"
    public final void mCURSOR() throws RecognitionException {
        try {
            int _type = CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1332:8: ( C U R S O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1332:10: C U R S O R
            {
            mC(); 
            mU(); 
            mR(); 
            mS(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURSOR"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1333:6: ( D A T A )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1333:8: D A T A
            {
            mD(); 
            mA(); 
            mT(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1334:5: ( D A Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1334:7: D A Y
            {
            mD(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "DEALLOCATE"
    public final void mDEALLOCATE() throws RecognitionException {
        try {
            int _type = DEALLOCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1335:12: ( D E A L L O C A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1335:14: D E A L L O C A T E
            {
            mD(); 
            mE(); 
            mA(); 
            mL(); 
            mL(); 
            mO(); 
            mC(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEALLOCATE"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1336:5: ( D E C )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1336:7: D E C
            {
            mD(); 
            mE(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1337:9: ( D E C I M A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1337:11: D E C I M A L
            {
            mD(); 
            mE(); 
            mC(); 
            mI(); 
            mM(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1338:9: ( D E C L A R E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1338:11: D E C L A R E
            {
            mD(); 
            mE(); 
            mC(); 
            mL(); 
            mA(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1339:9: ( D E F A U L T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1339:11: D E F A U L T
            {
            mD(); 
            mE(); 
            mF(); 
            mA(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFERRABLE"
    public final void mDEFERRABLE() throws RecognitionException {
        try {
            int _type = DEFERRABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1340:12: ( D E F E R R A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1340:14: D E F E R R A B L E
            {
            mD(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mR(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFERRABLE"

    // $ANTLR start "DEFERRED"
    public final void mDEFERRED() throws RecognitionException {
        try {
            int _type = DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1341:10: ( D E F E R R E D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1341:12: D E F E R R E D
            {
            mD(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mR(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFERRED"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1342:8: ( D E F I N E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1342:10: D E F I N E
            {
            mD(); 
            mE(); 
            mF(); 
            mI(); 
            mN(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1343:8: ( D E L E T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1343:10: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1344:6: ( D E S C )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1344:8: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1345:10: ( D E S C R I B E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1345:12: D E S C R I B E
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 
            mR(); 
            mI(); 
            mB(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "DESCRIPTOR"
    public final void mDESCRIPTOR() throws RecognitionException {
        try {
            int _type = DESCRIPTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1346:12: ( D E S C R I P T O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1346:14: D E S C R I P T O R
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 
            mR(); 
            mI(); 
            mP(); 
            mT(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIPTOR"

    // $ANTLR start "DIAGNOSTICS"
    public final void mDIAGNOSTICS() throws RecognitionException {
        try {
            int _type = DIAGNOSTICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1347:13: ( D I A G N O S T I C S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1347:15: D I A G N O S T I C S
            {
            mD(); 
            mI(); 
            mA(); 
            mG(); 
            mN(); 
            mO(); 
            mS(); 
            mT(); 
            mI(); 
            mC(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIAGNOSTICS"

    // $ANTLR start "DIFF"
    public final void mDIFF() throws RecognitionException {
        try {
            int _type = DIFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1348:6: ( D I F F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1348:8: D I F F
            {
            mD(); 
            mI(); 
            mF(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIFF"

    // $ANTLR start "DIRECT"
    public final void mDIRECT() throws RecognitionException {
        try {
            int _type = DIRECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1349:8: ( D I R E C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1349:10: D I R E C T
            {
            mD(); 
            mI(); 
            mR(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIRECT"

    // $ANTLR start "DISCONNECT"
    public final void mDISCONNECT() throws RecognitionException {
        try {
            int _type = DISCONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1350:12: ( D I S C O N N E C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1350:14: D I S C O N N E C T
            {
            mD(); 
            mI(); 
            mS(); 
            mC(); 
            mO(); 
            mN(); 
            mN(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISCONNECT"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1351:10: ( D I S T I N C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1351:12: D I S T I N C T
            {
            mD(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mN(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "DOMAIN"
    public final void mDOMAIN() throws RecognitionException {
        try {
            int _type = DOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1352:8: ( D O M A I N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1352:10: D O M A I N
            {
            mD(); 
            mO(); 
            mM(); 
            mA(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1353:6: ( D R O P )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1353:8: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1354:6: ( E L S E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1354:8: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1355:5: ( E N D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1355:7: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ENDS_WITH"
    public final void mENDS_WITH() throws RecognitionException {
        try {
            int _type = ENDS_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1356:11: ( E N D S '_' W I T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1356:13: E N D S '_' W I T H
            {
            mE(); 
            mN(); 
            mD(); 
            mS(); 
            match('_'); 
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDS_WITH"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1357:8: ( E S C A P E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1357:10: E S C A P E
            {
            mE(); 
            mS(); 
            mC(); 
            mA(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1358:8: ( E X C E P T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1358:10: E X C E P T
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "EXCEPTION"
    public final void mEXCEPTION() throws RecognitionException {
        try {
            int _type = EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1359:11: ( E X C E P T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1359:13: E X C E P T I O N
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION"

    // $ANTLR start "EXECUTE"
    public final void mEXECUTE() throws RecognitionException {
        try {
            int _type = EXECUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1360:9: ( E X E C U T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1360:11: E X E C U T E
            {
            mE(); 
            mX(); 
            mE(); 
            mC(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXECUTE"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1361:8: ( E X I S T S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1361:10: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1362:10: ( E X T E R N A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1362:12: E X T E R N A L
            {
            mE(); 
            mX(); 
            mT(); 
            mE(); 
            mR(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "EXTRACT"
    public final void mEXTRACT() throws RecognitionException {
        try {
            int _type = EXTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1363:9: ( E X T R A C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1363:11: E X T R A C T
            {
            mE(); 
            mX(); 
            mT(); 
            mR(); 
            mA(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTRACT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1364:7: ( F A L S E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1364:9: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FETCH"
    public final void mFETCH() throws RecognitionException {
        try {
            int _type = FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1365:7: ( F E T C H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1365:9: F E T C H
            {
            mF(); 
            mE(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FETCH"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1366:7: ( F I R S T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1366:9: F I R S T
            {
            mF(); 
            mI(); 
            mR(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1367:5: ( F O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1367:7: F O R
            {
            mF(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOREIGN"
    public final void mFOREIGN() throws RecognitionException {
        try {
            int _type = FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1368:9: ( F O R E I G N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1368:11: F O R E I G N
            {
            mF(); 
            mO(); 
            mR(); 
            mE(); 
            mI(); 
            mG(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREIGN"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1369:6: ( F R O M )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1369:8: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1370:6: ( F U L L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1370:8: F U L L
            {
            mF(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1371:5: ( G E T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1371:7: G E T
            {
            mG(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1372:8: ( G L O B A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1372:10: G L O B A L
            {
            mG(); 
            mL(); 
            mO(); 
            mB(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "GRANT"
    public final void mGRANT() throws RecognitionException {
        try {
            int _type = GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1373:7: ( G R A N T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1373:9: G R A N T
            {
            mG(); 
            mR(); 
            mA(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRANT"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1374:7: ( G R O U P )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1374:9: G R O U P
            {
            mG(); 
            mR(); 
            mO(); 
            mU(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "H_LV"
    public final void mH_LV() throws RecognitionException {
        try {
            int _type = H_LV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1375:6: ( H '_' L V )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1375:8: H '_' L V
            {
            mH(); 
            match('_'); 
            mL(); 
            mV(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "H_LV"

    // $ANTLR start "H_AID"
    public final void mH_AID() throws RecognitionException {
        try {
            int _type = H_AID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1376:7: ( H '_' A I D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1376:9: H '_' A I D
            {
            mH(); 
            match('_'); 
            mA(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "H_AID"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1377:8: ( H A V I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1377:10: H A V I N G
            {
            mH(); 
            mA(); 
            mV(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            int _type = HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1378:6: ( H O U R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1378:8: H O U R
            {
            mH(); 
            mO(); 
            mU(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOUR"

    // $ANTLR start "IDENTITY"
    public final void mIDENTITY() throws RecognitionException {
        try {
            int _type = IDENTITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1379:10: ( I D E N T I T Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1379:12: I D E N T I T Y
            {
            mI(); 
            mD(); 
            mE(); 
            mN(); 
            mT(); 
            mI(); 
            mT(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTITY"

    // $ANTLR start "IMMEDIATE"
    public final void mIMMEDIATE() throws RecognitionException {
        try {
            int _type = IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1380:11: ( I M M E D I A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1380:13: I M M E D I A T E
            {
            mI(); 
            mM(); 
            mM(); 
            mE(); 
            mD(); 
            mI(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMEDIATE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1381:4: ( I N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1381:6: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDICATOR"
    public final void mINDICATOR() throws RecognitionException {
        try {
            int _type = INDICATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1382:11: ( I N D I C A T O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1382:13: I N D I C A T O R
            {
            mI(); 
            mN(); 
            mD(); 
            mI(); 
            mC(); 
            mA(); 
            mT(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDICATOR"

    // $ANTLR start "INITIALLY"
    public final void mINITIALLY() throws RecognitionException {
        try {
            int _type = INITIALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1383:11: ( I N I T I A L L Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1383:13: I N I T I A L L Y
            {
            mI(); 
            mN(); 
            mI(); 
            mT(); 
            mI(); 
            mA(); 
            mL(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITIALLY"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1384:7: ( I N N E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1384:9: I N N E R
            {
            mI(); 
            mN(); 
            mN(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1385:7: ( I N P U T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1385:9: I N P U T
            {
            mI(); 
            mN(); 
            mP(); 
            mU(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "INSENSITIVE"
    public final void mINSENSITIVE() throws RecognitionException {
        try {
            int _type = INSENSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1386:13: ( I N S E N S I T I V E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1386:15: I N S E N S I T I V E
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mN(); 
            mS(); 
            mI(); 
            mT(); 
            mI(); 
            mV(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSENSITIVE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1387:8: ( I N S E R T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1387:10: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1388:9: ( I N T E G E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1388:11: I N T E G E R
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "INTERSECT"
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1389:11: ( I N T E R S E C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1389:13: I N T E R S E C T
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERSECT"

    // $ANTLR start "INTERVAL"
    public final void mINTERVAL() throws RecognitionException {
        try {
            int _type = INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1390:10: ( I N T E R V A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1390:12: I N T E R V A L
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mV(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERVAL"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1391:6: ( I N T O )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1391:8: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1392:4: ( I S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1392:6: I S
            {
            mI(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ISLEAP"
    public final void mISLEAP() throws RecognitionException {
        try {
            int _type = ISLEAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1393:8: ( I S L E A P )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1393:10: I S L E A P
            {
            mI(); 
            mS(); 
            mL(); 
            mE(); 
            mA(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISLEAP"

    // $ANTLR start "ISOLATION"
    public final void mISOLATION() throws RecognitionException {
        try {
            int _type = ISOLATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1394:11: ( I S O L A T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1394:13: I S O L A T I O N
            {
            mI(); 
            mS(); 
            mO(); 
            mL(); 
            mA(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOLATION"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1395:6: ( J O I N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1395:8: J O I N
            {
            mJ(); 
            mO(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1396:5: ( K E Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1396:7: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1397:6: ( L A S T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1397:8: L A S T
            {
            mL(); 
            mA(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAST"

    // $ANTLR start "LEAF"
    public final void mLEAF() throws RecognitionException {
        try {
            int _type = LEAF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1398:6: ( L E A F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1398:8: L E A F
            {
            mL(); 
            mE(); 
            mA(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEAF"

    // $ANTLR start "LEADING"
    public final void mLEADING() throws RecognitionException {
        try {
            int _type = LEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1399:9: ( L E A D I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1399:11: L E A D I N G
            {
            mL(); 
            mE(); 
            mA(); 
            mD(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1400:6: ( L E F T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1400:8: L E F T
            {
            mL(); 
            mE(); 
            mF(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "LENGTH"
    public final void mLENGTH() throws RecognitionException {
        try {
            int _type = LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1401:8: ( L E N G T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1401:10: L E N G T H
            {
            mL(); 
            mE(); 
            mN(); 
            mG(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH"

    // $ANTLR start "LEVEL"
    public final void mLEVEL() throws RecognitionException {
        try {
            int _type = LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1402:7: ( L E V E L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1402:9: L E V E L
            {
            mL(); 
            mE(); 
            mV(); 
            mE(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEVEL"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1403:6: ( L I K E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1403:8: L I K E
            {
            mL(); 
            mI(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LOCAL"
    public final void mLOCAL() throws RecognitionException {
        try {
            int _type = LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1404:7: ( L O C A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1404:9: L O C A L
            {
            mL(); 
            mO(); 
            mC(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCAL"

    // $ANTLR start "MAPPING"
    public final void mMAPPING() throws RecognitionException {
        try {
            int _type = MAPPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1405:9: ( M A P P I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1405:11: M A P P I N G
            {
            mM(); 
            mA(); 
            mP(); 
            mP(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAPPING"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1406:5: ( M A X )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1406:7: M A X
            {
            mM(); 
            mA(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1407:5: ( M I N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1407:7: M I N
            {
            mM(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MINUTE"
    public final void mMINUTE() throws RecognitionException {
        try {
            int _type = MINUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1408:8: ( M I N U T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1408:10: M I N U T E
            {
            mM(); 
            mI(); 
            mN(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUTE"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1409:8: ( M O D U L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1409:10: M O D U L E
            {
            mM(); 
            mO(); 
            mD(); 
            mU(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1410:7: ( M O N T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1410:9: M O N T H
            {
            mM(); 
            mO(); 
            mN(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "MORE"
    public final void mMORE() throws RecognitionException {
        try {
            int _type = MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1411:6: ( M O R E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1411:8: M O R E
            {
            mM(); 
            mO(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MORE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1412:6: ( N A M E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1412:8: N A M E
            {
            mN(); 
            mA(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "NAMES"
    public final void mNAMES() throws RecognitionException {
        try {
            int _type = NAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1413:7: ( N A M E S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1413:9: N A M E S
            {
            mN(); 
            mA(); 
            mM(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMES"

    // $ANTLR start "NATIONAL"
    public final void mNATIONAL() throws RecognitionException {
        try {
            int _type = NATIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1414:10: ( N A T I O N A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1414:12: N A T I O N A L
            {
            mN(); 
            mA(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIONAL"

    // $ANTLR start "NATURAL"
    public final void mNATURAL() throws RecognitionException {
        try {
            int _type = NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1415:9: ( N A T U R A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1415:11: N A T U R A L
            {
            mN(); 
            mA(); 
            mT(); 
            mU(); 
            mR(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATURAL"

    // $ANTLR start "NO"
    public final void mNO() throws RecognitionException {
        try {
            int _type = NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1416:4: ( N O )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1416:6: N O
            {
            mN(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NO"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1417:5: ( N O T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1417:7: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1418:6: ( N U L L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1418:8: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "NULLABLE"
    public final void mNULLABLE() throws RecognitionException {
        try {
            int _type = NULLABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1419:10: ( N U L L A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1419:12: N U L L A B L E
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULLABLE"

    // $ANTLR start "NULLIF"
    public final void mNULLIF() throws RecognitionException {
        try {
            int _type = NULLIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1420:8: ( N U L L I F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1420:10: N U L L I F
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULLIF"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1421:8: ( N U M B E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1421:10: N U M B E R
            {
            mN(); 
            mU(); 
            mM(); 
            mB(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1422:4: ( O F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1422:6: O F
            {
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1423:4: ( O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1423:6: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "ONLY"
    public final void mONLY() throws RecognitionException {
        try {
            int _type = ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1424:6: ( O N L Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1424:8: O N L Y
            {
            mO(); 
            mN(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONLY"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1425:8: ( O P T I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1425:10: O P T I O N
            {
            mO(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTION"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1426:4: ( O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1426:6: O R
            {
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1427:7: ( O R D E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1427:9: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "ORM"
    public final void mORM() throws RecognitionException {
        try {
            int _type = ORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1428:5: ( O R M )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1428:7: O R M
            {
            mO(); 
            mR(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORM"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1429:7: ( O U T E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1429:9: O U T E R
            {
            mO(); 
            mU(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "OUTPUT"
    public final void mOUTPUT() throws RecognitionException {
        try {
            int _type = OUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1430:8: ( O U T P U T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1430:10: O U T P U T
            {
            mO(); 
            mU(); 
            mT(); 
            mP(); 
            mU(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUTPUT"

    // $ANTLR start "OVERLAPS"
    public final void mOVERLAPS() throws RecognitionException {
        try {
            int _type = OVERLAPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1431:10: ( O V E R L A P S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1431:12: O V E R L A P S
            {
            mO(); 
            mV(); 
            mE(); 
            mR(); 
            mL(); 
            mA(); 
            mP(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERLAPS"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1432:10: ( O V E R R I D E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1432:12: O V E R R I D E
            {
            mO(); 
            mV(); 
            mE(); 
            mR(); 
            mR(); 
            mI(); 
            mD(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "PARENTOF"
    public final void mPARENTOF() throws RecognitionException {
        try {
            int _type = PARENTOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1433:10: ( P A R E N T O F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1433:12: P A R E N T O F
            {
            mP(); 
            mA(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENTOF"

    // $ANTLR start "PARTIAL"
    public final void mPARTIAL() throws RecognitionException {
        try {
            int _type = PARTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1434:9: ( P A R T I A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1434:11: P A R T I A L
            {
            mP(); 
            mA(); 
            mR(); 
            mT(); 
            mI(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARTIAL"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1435:9: ( P R I M A R Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1435:11: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "PRIOR"
    public final void mPRIOR() throws RecognitionException {
        try {
            int _type = PRIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1436:7: ( P R I O R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1436:9: P R I O R
            {
            mP(); 
            mR(); 
            mI(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIOR"

    // $ANTLR start "PRIVILEGES"
    public final void mPRIVILEGES() throws RecognitionException {
        try {
            int _type = PRIVILEGES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1437:12: ( P R I V I L E G E S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1437:14: P R I V I L E G E S
            {
            mP(); 
            mR(); 
            mI(); 
            mV(); 
            mI(); 
            mL(); 
            mE(); 
            mG(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVILEGES"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1438:8: ( P U B L I C )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1438:10: P U B L I C
            {
            mP(); 
            mU(); 
            mB(); 
            mL(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1439:7: ( Q U E R Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1439:9: Q U E R Y
            {
            mQ(); 
            mU(); 
            mE(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUERY"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1440:7: ( R A N G E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1440:9: R A N G E
            {
            mR(); 
            mA(); 
            mN(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1441:6: ( R E A D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1441:8: R E A D
            {
            mR(); 
            mE(); 
            mA(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1442:6: ( R E A L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1442:8: R E A L
            {
            mR(); 
            mE(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "REFERENCES"
    public final void mREFERENCES() throws RecognitionException {
        try {
            int _type = REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1443:12: ( R E F E R E N C E S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1443:14: R E F E R E N C E S
            {
            mR(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mE(); 
            mN(); 
            mC(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCES"

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1444:5: ( R E L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1444:7: R E L
            {
            mR(); 
            mE(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REL"

    // $ANTLR start "RELATE"
    public final void mRELATE() throws RecognitionException {
        try {
            int _type = RELATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1445:8: ( R E L A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1445:10: R E L A T E
            {
            mR(); 
            mE(); 
            mL(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATE"

    // $ANTLR start "RELATIVE"
    public final void mRELATIVE() throws RecognitionException {
        try {
            int _type = RELATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1446:10: ( R E L A T I V E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1446:12: R E L A T I V E
            {
            mR(); 
            mE(); 
            mL(); 
            mA(); 
            mT(); 
            mI(); 
            mV(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATIVE"

    // $ANTLR start "REPEATABLE"
    public final void mREPEATABLE() throws RecognitionException {
        try {
            int _type = REPEATABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1447:12: ( R E P E A T A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1447:14: R E P E A T A B L E
            {
            mR(); 
            mE(); 
            mP(); 
            mE(); 
            mA(); 
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEATABLE"

    // $ANTLR start "RESTRICT"
    public final void mRESTRICT() throws RecognitionException {
        try {
            int _type = RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1448:10: ( R E S T R I C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1448:12: R E S T R I C T
            {
            mR(); 
            mE(); 
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESTRICT"

    // $ANTLR start "REVOKE"
    public final void mREVOKE() throws RecognitionException {
        try {
            int _type = REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1449:8: ( R E V O K E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1449:10: R E V O K E
            {
            mR(); 
            mE(); 
            mV(); 
            mO(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVOKE"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1450:7: ( R I G H T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1450:9: R I G H T
            {
            mR(); 
            mI(); 
            mG(); 
            mH(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1451:10: ( R O L L B A C K )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1451:12: R O L L B A C K
            {
            mR(); 
            mO(); 
            mL(); 
            mL(); 
            mB(); 
            mA(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "ROLLUP"
    public final void mROLLUP() throws RecognitionException {
        try {
            int _type = ROLLUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1452:8: ( R O L L U P )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1452:10: R O L L U P
            {
            mR(); 
            mO(); 
            mL(); 
            mL(); 
            mU(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLUP"

    // $ANTLR start "ROWS"
    public final void mROWS() throws RecognitionException {
        try {
            int _type = ROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1453:6: ( R O W S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1453:8: R O W S
            {
            mR(); 
            mO(); 
            mW(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWS"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1454:7: ( S C A L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1454:9: S C A L E
            {
            mS(); 
            mC(); 
            mA(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1455:8: ( S C H E M A )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1455:10: S C H E M A
            {
            mS(); 
            mC(); 
            mH(); 
            mE(); 
            mM(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "SCROLL"
    public final void mSCROLL() throws RecognitionException {
        try {
            int _type = SCROLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1456:8: ( S C R O L L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1456:10: S C R O L L
            {
            mS(); 
            mC(); 
            mR(); 
            mO(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCROLL"

    // $ANTLR start "SECOND"
    public final void mSECOND() throws RecognitionException {
        try {
            int _type = SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1457:8: ( S E C O N D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1457:10: S E C O N D
            {
            mS(); 
            mE(); 
            mC(); 
            mO(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECOND"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1458:8: ( S E L E C T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1458:10: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SERIALIZABLE"
    public final void mSERIALIZABLE() throws RecognitionException {
        try {
            int _type = SERIALIZABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1459:14: ( S E R I A L I Z A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1459:16: S E R I A L I Z A B L E
            {
            mS(); 
            mE(); 
            mR(); 
            mI(); 
            mA(); 
            mL(); 
            mI(); 
            mZ(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERIALIZABLE"

    // $ANTLR start "SESSION"
    public final void mSESSION() throws RecognitionException {
        try {
            int _type = SESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1460:9: ( S E S S I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1460:11: S E S S I O N
            {
            mS(); 
            mE(); 
            mS(); 
            mS(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SESSION"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1461:5: ( S E T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1461:7: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1462:6: ( S I Z E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1462:8: S I Z E
            {
            mS(); 
            mI(); 
            mZ(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "SOME"
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1463:6: ( S O M E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1463:8: S O M E
            {
            mS(); 
            mO(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOME"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1464:7: ( S P A C E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1464:9: S P A C E
            {
            mS(); 
            mP(); 
            mA(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "SQL"
    public final void mSQL() throws RecognitionException {
        try {
            int _type = SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1465:5: ( S Q L )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1465:7: S Q L
            {
            mS(); 
            mQ(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL"

    // $ANTLR start "STARTS_WITH"
    public final void mSTARTS_WITH() throws RecognitionException {
        try {
            int _type = STARTS_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1466:13: ( S T A R T S '_' W I T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1466:15: S T A R T S '_' W I T H
            {
            mS(); 
            mT(); 
            mA(); 
            mR(); 
            mT(); 
            mS(); 
            match('_'); 
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STARTS_WITH"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1467:5: ( S U M )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1467:7: S U M
            {
            mS(); 
            mU(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1468:7: ( T A B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1468:9: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "TEMPORARY"
    public final void mTEMPORARY() throws RecognitionException {
        try {
            int _type = TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1469:11: ( T E M P O R A R Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1469:13: T E M P O R A R Y
            {
            mT(); 
            mE(); 
            mM(); 
            mP(); 
            mO(); 
            mR(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPORARY"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1470:6: ( T H E N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1470:8: T H E N
            {
            mT(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1471:6: ( T I M E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1471:8: T I M E
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "TIMESTAMP"
    public final void mTIMESTAMP() throws RecognitionException {
        try {
            int _type = TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1472:11: ( T I M E S T A M P )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1472:13: T I M E S T A M P
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMESTAMP"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1473:4: ( T O )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1473:6: T O
            {
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1474:6: ( T R U E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1474:8: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1475:6: ( T Y P E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1475:8: T Y P E
            {
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "UNCOMMITTED"
    public final void mUNCOMMITTED() throws RecognitionException {
        try {
            int _type = UNCOMMITTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1476:13: ( U N C O M M I T T E D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1476:15: U N C O M M I T T E D
            {
            mU(); 
            mN(); 
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 
            mT(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNCOMMITTED"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1477:7: ( U N I O N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1477:9: U N I O N
            {
            mU(); 
            mN(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1478:8: ( U N I Q U E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1478:10: U N I Q U E
            {
            mU(); 
            mN(); 
            mI(); 
            mQ(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "UNKNOWN"
    public final void mUNKNOWN() throws RecognitionException {
        try {
            int _type = UNKNOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1479:9: ( U N K N O W N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1479:11: U N K N O W N
            {
            mU(); 
            mN(); 
            mK(); 
            mN(); 
            mO(); 
            mW(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN"

    // $ANTLR start "UNNAMED"
    public final void mUNNAMED() throws RecognitionException {
        try {
            int _type = UNNAMED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1480:9: ( U N N A M E D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1480:11: U N N A M E D
            {
            mU(); 
            mN(); 
            mN(); 
            mA(); 
            mM(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNNAMED"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1481:8: ( U P D A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1481:10: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "USAGE"
    public final void mUSAGE() throws RecognitionException {
        try {
            int _type = USAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1482:7: ( U S A G E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1482:9: U S A G E
            {
            mU(); 
            mS(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USAGE"

    // $ANTLR start "USER"
    public final void mUSER() throws RecognitionException {
        try {
            int _type = USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1483:6: ( U S E R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1483:8: U S E R
            {
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USER"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1484:7: ( U S I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1484:9: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1485:7: ( V A L U E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1485:9: V A L U E
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1486:8: ( V A L U E S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1486:10: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VARYING"
    public final void mVARYING() throws RecognitionException {
        try {
            int _type = VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1487:9: ( V A R Y I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1487:11: V A R Y I N G
            {
            mV(); 
            mA(); 
            mR(); 
            mY(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARYING"

    // $ANTLR start "VIEW"
    public final void mVIEW() throws RecognitionException {
        try {
            int _type = VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1488:6: ( V I E W )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1488:8: V I E W
            {
            mV(); 
            mI(); 
            mE(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIEW"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1489:6: ( W H E N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1489:8: W H E N
            {
            mW(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1490:7: ( W H E R E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1490:9: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1491:6: ( W I T H )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1491:8: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "WORK"
    public final void mWORK() throws RecognitionException {
        try {
            int _type = WORK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1492:6: ( W O R K )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1492:8: W O R K
            {
            mW(); 
            mO(); 
            mR(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORK"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1493:7: ( W R I T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1493:9: W R I T E
            {
            mW(); 
            mR(); 
            mI(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1494:6: ( Y E A R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1494:8: Y E A R
            {
            mY(); 
            mE(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "ZONE"
    public final void mZONE() throws RecognitionException {
        try {
            int _type = ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1495:6: ( Z O N E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1495:8: Z O N E
            {
            mZ(); 
            mO(); 
            mN(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZONE"

    // $ANTLR start "DESCENDANTOF"
    public final void mDESCENDANTOF() throws RecognitionException {
        try {
            int _type = DESCENDANTOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1497:14: ( D E S C E N D A N T O F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1497:16: D E S C E N D A N T O F
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 
            mE(); 
            mN(); 
            mD(); 
            mA(); 
            mN(); 
            mT(); 
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCENDANTOF"

    // $ANTLR start "ANCESTOROF"
    public final void mANCESTOROF() throws RecognitionException {
        try {
            int _type = ANCESTOROF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1498:12: ( A N C E S T O R O F )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1498:14: A N C E S T O R O F
            {
            mA(); 
            mN(); 
            mC(); 
            mE(); 
            mS(); 
            mT(); 
            mO(); 
            mR(); 
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANCESTOROF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1500:5: ( I N T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1500:7: I N T
            {
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1501:7: ( F L O A T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1501:9: F L O A T
            {
            mF(); 
            mL(); 
            mO(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1502:8: ( D O U B L E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1502:10: D O U B L E
            {
            mD(); 
            mO(); 
            mU(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1503:6: ( D A T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1503:8: D A T E
            {
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1504:9: ( B O O L E A N )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1504:11: B O O L E A N
            {
            mB(); 
            mO(); 
            mO(); 
            mL(); 
            mE(); 
            mA(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "GUID"
    public final void mGUID() throws RecognitionException {
        try {
            int _type = GUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1505:6: ( G U I D )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1505:8: G U I D
            {
            mG(); 
            mU(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GUID"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1506:6: ( B Y T E )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1506:8: B Y T E
            {
            mB(); 
            mY(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "BYTES"
    public final void mBYTES() throws RecognitionException {
        try {
            int _type = BYTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1507:7: ( B Y T E S )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1507:9: B Y T E S
            {
            mB(); 
            mY(); 
            mT(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTES"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1508:6: ( E N U M )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1508:8: E N U M
            {
            mE(); 
            mN(); 
            mU(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1509:7: ( S H O R T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1509:9: S H O R T
            {
            mS(); 
            mH(); 
            mO(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1510:6: ( L O N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1510:8: L O N G
            {
            mL(); 
            mO(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1511:8: ( S T R I N G )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1511:10: S T R I N G
            {
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "BLOB"
    public final void mBLOB() throws RecognitionException {
        try {
            int _type = BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1514:6: ( B L O B )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1514:8: B L O B
            {
            mB(); 
            mL(); 
            mO(); 
            mB(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOB"

    // $ANTLR start "NTEXT"
    public final void mNTEXT() throws RecognitionException {
        try {
            int _type = NTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1515:7: ( N T E X T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1515:9: N T E X T
            {
            mN(); 
            mT(); 
            mE(); 
            mX(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NTEXT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1516:6: ( T E X T )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1516:8: T E X T
            {
            mT(); 
            mE(); 
            mX(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1517:8: ( B I N A R Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1517:10: B I N A R Y
            {
            mB(); 
            mI(); 
            mN(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "NCHAR"
    public final void mNCHAR() throws RecognitionException {
        try {
            int _type = NCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1518:7: ( N C H A R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1518:9: N C H A R
            {
            mN(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NCHAR"

    // $ANTLR start "NVARCHAR"
    public final void mNVARCHAR() throws RecognitionException {
        try {
            int _type = NVARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1519:10: ( N V A R C H A R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1519:12: N V A R C H A R
            {
            mN(); 
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NVARCHAR"

    // $ANTLR start "VARBINARY"
    public final void mVARBINARY() throws RecognitionException {
        try {
            int _type = VARBINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1520:11: ( V A R B I N A R Y )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1520:13: V A R B I N A R Y
            {
            mV(); 
            mA(); 
            mR(); 
            mB(); 
            mI(); 
            mN(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARBINARY"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1521:9: ( V A R C H A R )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1521:11: V A R C H A R
            {
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "NUMERIC"
    public final void mNUMERIC() throws RecognitionException {
        try {
            int _type = NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1522:9: ( N U M E R I C )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1522:11: N U M E R I C
            {
            mN(); 
            mU(); 
            mM(); 
            mE(); 
            mR(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERIC"

    // $ANTLR start "ARGUMENT_ID"
    public final void mARGUMENT_ID() throws RecognitionException {
        try {
            int _type = ARGUMENT_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1526:3: ( '@' ( REGULAR_ID )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1526:5: '@' ( REGULAR_ID )?
            {
            match('@'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1526:9: ( REGULAR_ID )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='\u007F' && LA1_0<='\u00FF')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1526:9: REGULAR_ID
                    {
                    mREGULAR_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARGUMENT_ID"

    // $ANTLR start "REGULAR_ID"
    public final void mREGULAR_ID() throws RecognitionException {
        try {
            int _type = REGULAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1529:12: ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '_' | '0' .. '9' )* )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1530:3: ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '_' | '0' .. '9' )*
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1530:3: ( SIMPLE_LETTER )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1530:4: SIMPLE_LETTER
            {
            mSIMPLE_LETTER(); 

            }

            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1530:19: ( SIMPLE_LETTER | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u007F' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u007F' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGULAR_ID"

    // $ANTLR start "EXACT_NUM_LIT"
    public final void mEXACT_NUM_LIT() throws RecognitionException {
        try {
            int _type = EXACT_NUM_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1533:15: ( UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? | ) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' | '.' '.' )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='.') ) {
                switch ( input.LA(2) ) {
                case '.':
                    {
                    alt9=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt9=2;
                    }
                    break;
                default:
                    alt9=3;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1534:5: UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? | ) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    mUNSIGNED_INTEGER(); 
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1535:5: ( '.' ( UNSIGNED_INTEGER )? | )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                    switch (alt4) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1535:7: '.' ( UNSIGNED_INTEGER )?
                            {
                            match('.'); 
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1535:11: ( UNSIGNED_INTEGER )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1535:12: UNSIGNED_INTEGER
                                    {
                                    mUNSIGNED_INTEGER(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1536:7: 
                            {
                            _type=UNSIGNED_INTEGER;

                            }
                            break;

                    }

                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1537:7: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1537:9: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1537:21: ( '+' | '-' )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0=='+'||LA5_0=='-') ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mUNSIGNED_INTEGER(); 
                             _type=APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1538:5: '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    match('.'); 
                    mUNSIGNED_INTEGER(); 
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1538:26: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1538:28: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1538:40: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            mUNSIGNED_INTEGER(); 
                             _type=APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1539:5: '.'
                    {
                    match('.'); 
                    _type=PERIOD;

                    }
                    break;
                case 4 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1540:5: '.' '.'
                    {
                    match('.'); 
                    match('.'); 
                    _type=DOUBLE_PERIOD;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXACT_NUM_LIT"

    // $ANTLR start "APPROXIMATE_NUM_LIT"
    public final void mAPPROXIMATE_NUM_LIT() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1544:21: ()
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1544:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "APPROXIMATE_NUM_LIT"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1547:18: ( ( '0' .. '9' )+ )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1548:3: ( '0' .. '9' )+
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1548:3: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1548:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "CHAR_STRING"
    public final void mCHAR_STRING() throws RecognitionException {
        try {
            int _type = CHAR_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1551:13: ( '\\'' (~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' | QUOTE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\'') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='\u0000' && LA12_1<='\uFFFF')) ) {
                    alt12=1;
                }
                else {
                    alt12=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1552:5: '\\'' (~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
                    {
                    match('\''); 
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1552:10: (~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
                    loop11:
                    do {
                        int alt11=4;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\'') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='\'') ) {
                                alt11=2;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }
                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                            alt11=3;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1552:11: ~ ( '\\'' | '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1552:35: '\\'' '\\''
                    	    {
                    	    match('\''); 
                    	    match('\''); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1552:48: NEWLINE
                    	    {
                    	    mNEWLINE(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1553:5: QUOTE
                    {
                    mQUOTE(); 
                    _type=QUOTE;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_STRING"

    // $ANTLR start "DELIMITED_ID"
    public final void mDELIMITED_ID() throws RecognitionException {
        try {
            int _type = DELIMITED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1556:14: ( '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1557:3: '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"'
            {
            match('\"'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1557:7: (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\"') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='\"') ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1557:8: ~ ( '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1557:31: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELIMITED_ID"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1561:9: ( '%' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1561:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1562:11: ( '&' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1562:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1563:16: ( '\\'' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1563:18: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1564:12: ( '(' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1564:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1565:13: ( ')' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1565:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1566:10: ( '*' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1566:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "PLUS_SIGN"
    public final void mPLUS_SIGN() throws RecognitionException {
        try {
            int _type = PLUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1567:11: ( '+' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1567:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_SIGN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1568:7: ( ',' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1568:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "MINUS_SIGN"
    public final void mMINUS_SIGN() throws RecognitionException {
        try {
            int _type = MINUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1569:12: ( '-' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1569:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_SIGN"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1570:17: ( '.' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1570:19: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "SOLIDUS"
    public final void mSOLIDUS() throws RecognitionException {
        try {
            int _type = SOLIDUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1571:9: ( '/' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1571:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOLIDUS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1572:7: ( ':' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1572:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1573:11: ( ';' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1573:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LESS_THAN_OP"
    public final void mLESS_THAN_OP() throws RecognitionException {
        try {
            int _type = LESS_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1574:14: ( '<' ( '>' | '=' )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1574:16: '<' ( '>' | '=' )?
            {
            match('<'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1574:20: ( '>' | '=' )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='>') ) {
                alt14=1;
            }
            else if ( (LA14_0=='=') ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1574:21: '>'
                    {
                    match('>'); 
                    _type=NOT_EQUALS_OP;

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1574:50: '='
                    {
                    match('='); 
                    _type=LESS_THAN_OR_EQUALS_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OP"

    // $ANTLR start "EQUALS_OP"
    public final void mEQUALS_OP() throws RecognitionException {
        try {
            int _type = EQUALS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1575:11: ( '=' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1575:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS_OP"

    // $ANTLR start "GREATER_THAN_OP"
    public final void mGREATER_THAN_OP() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1576:17: ( '>' ( '=' )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1576:19: '>' ( '=' )?
            {
            match('>'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1576:23: ( '=' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='=') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1576:24: '='
                    {
                    match('='); 
                    _type=GREATER_THAN_OR_EQUALS_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OP"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1577:15: ( '?' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1577:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "VERTICAL_BAR"
    public final void mVERTICAL_BAR() throws RecognitionException {
        try {
            int _type = VERTICAL_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1578:14: ( '|' ( '|' )? )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1578:16: '|' ( '|' )?
            {
            match('|'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1578:20: ( '|' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='|') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1578:21: '|'
                    {
                    match('|'); 
                    _type=CONCATENATION_OP;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTICAL_BAR"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1580:14: ( '[' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1580:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1581:15: ( ']' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1581:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "NOT_EQUALS_OP"
    public final void mNOT_EQUALS_OP() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1583:24: ( '<' '>' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1583:26: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUALS_OP"

    // $ANTLR start "LESS_THAN_OR_EQUALS_OP"
    public final void mLESS_THAN_OR_EQUALS_OP() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1584:33: ( '<' '=' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1584:35: '<' '='
            {
            match('<'); 
            match('='); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUALS_OP"

    // $ANTLR start "GREATER_THAN_OR_EQUALS_OP"
    public final void mGREATER_THAN_OR_EQUALS_OP() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1585:36: ( '>' '=' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1585:38: '>' '='
            {
            match('>'); 
            match('='); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUALS_OP"

    // $ANTLR start "CONCATENATION_OP"
    public final void mCONCATENATION_OP() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1586:27: ( '|' '|' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1586:29: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "CONCATENATION_OP"

    // $ANTLR start "DOUBLE_PERIOD"
    public final void mDOUBLE_PERIOD() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1587:24: ( '.' '.' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1587:26: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_PERIOD"

    // $ANTLR start "INTRODUCER"
    public final void mINTRODUCER() throws RecognitionException {
        try {
            int _type = INTRODUCER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1589:12: ( UNDERSCORE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1589:14: UNDERSCORE
            {
            mUNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTRODUCER"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1590:21: ( '_' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1590:23: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "SIMPLE_LETTER"
    public final void mSIMPLE_LETTER() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1593:15: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u007F' .. '\\u00FF' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u007F' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIMPLE_LETTER"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1597:11: ( ( COMMENT | ( BLANK | NEWLINE )+ ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:3: ( COMMENT | ( BLANK | NEWLINE )+ )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:3: ( COMMENT | ( BLANK | NEWLINE )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='-') ) {
                alt18=1;
            }
            else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:4: COMMENT
                    {
                    mCOMMENT(); 

                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:14: ( BLANK | NEWLINE )+
                    {
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:14: ( BLANK | NEWLINE )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\t'||LA17_0==' ') ) {
                            alt17=1;
                        }
                        else if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:15: BLANK
                    	    {
                    	    mBLANK(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1598:23: NEWLINE
                    	    {
                    	    mNEWLINE(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1602:9: ( '-' '-' (~ ( '\\r' | '\\n' ) )* NEWLINE )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1603:3: '-' '-' (~ ( '\\r' | '\\n' ) )* NEWLINE
            {
            match('-'); 
            match('-'); 
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1603:11: (~ ( '\\r' | '\\n' ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1603:13: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            mNEWLINE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1607:9: ( ( '\\r' ( '\\n' )? | '\\n' ) )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:3: ( '\\r' ( '\\n' )? | '\\n' )
            {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:3: ( '\\r' ( '\\n' )? | '\\n' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\r') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\n') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:5: '\\r' ( '\\n' )?
                    {
                    match('\r'); 
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:10: ( '\\n' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\n') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:11: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1608:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "BLANK"
    public final void mBLANK() throws RecognitionException {
        try {
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1612:7: ( ' ' | '\\t' )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "BLANK"

    // $ANTLR start "ANY_CHAR"
    public final void mANY_CHAR() throws RecognitionException {
        try {
            int _type = ANY_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1616:10: ( . )
            // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1617:3: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY_CHAR"

    public void mTokens() throws RecognitionException {
        // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:8: ( ABO | ABSTABLE | ACTION | ADD | ALL | ALTER | AND | ANY | AS | ASC | ASSERTION | AT | AUTHORIZATION | AVG | BEGIN | BETWEEN | BIT | BOTH | BY | CASCADE | CASCADED | CASE | CAST | CATALOG | CHAR | CHARACTER | CHECK | CHILDOF | CLOSE | COALESCE | COLLATE | COLLATION | COLUMN | COMMIT | CONNECT | CONNECTION | CONTAINS | CONSTRAINT | CONSTRAINTS | CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CUBE | CURRENT | CURSOR | DATA | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE | DEFERRED | DEFINE | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS | DIFF | DIRECT | DISCONNECT | DISTINCT | DOMAIN | DROP | ELSE | END | ENDS_WITH | ESCAPE | EXCEPT | EXCEPTION | EXECUTE | EXISTS | EXTERNAL | EXTRACT | FALSE | FETCH | FIRST | FOR | FOREIGN | FROM | FULL | GET | GLOBAL | GRANT | GROUP | H_LV | H_AID | HAVING | HOUR | IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT | INSENSITIVE | INSERT | INTEGER | INTERSECT | INTERVAL | INTO | IS | ISLEAP | ISOLATION | JOIN | KEY | LAST | LEAF | LEADING | LEFT | LENGTH | LEVEL | LIKE | LOCAL | MAPPING | MAX | MIN | MINUTE | MODULE | MONTH | MORE | NAME | NAMES | NATIONAL | NATURAL | NO | NOT | NULL | NULLABLE | NULLIF | NUMBER | OF | ON | ONLY | OPTION | OR | ORDER | ORM | OUTER | OUTPUT | OVERLAPS | OVERRIDE | PARENTOF | PARTIAL | PRIMARY | PRIOR | PRIVILEGES | PUBLIC | QUERY | RANGE | READ | REAL | REFERENCES | REL | RELATE | RELATIVE | REPEATABLE | RESTRICT | REVOKE | RIGHT | ROLLBACK | ROLLUP | ROWS | SCALE | SCHEMA | SCROLL | SECOND | SELECT | SERIALIZABLE | SESSION | SET | SIZE | SOME | SPACE | SQL | STARTS_WITH | SUM | TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TO | TRUE | TYPE | UNCOMMITTED | UNION | UNIQUE | UNKNOWN | UNNAMED | UPDATE | USAGE | USER | USING | VALUE | VALUES | VARYING | VIEW | WHEN | WHERE | WITH | WORK | WRITE | YEAR | ZONE | DESCENDANTOF | ANCESTOROF | INT | FLOAT | DOUBLE | DATE | BOOLEAN | GUID | BYTE | BYTES | ENUM | SHORT | LONG | STRING | BLOB | NTEXT | TEXT | BINARY | NCHAR | NVARCHAR | VARBINARY | VARCHAR | NUMERIC | ARGUMENT_ID | REGULAR_ID | EXACT_NUM_LIT | CHAR_STRING | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS_SIGN | COMMA | MINUS_SIGN | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OP | EQUALS_OP | GREATER_THAN_OP | QUESTION_MARK | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | ANY_CHAR )
        int alt22=259;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:10: ABO
                {
                mABO(); 

                }
                break;
            case 2 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:14: ABSTABLE
                {
                mABSTABLE(); 

                }
                break;
            case 3 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:23: ACTION
                {
                mACTION(); 

                }
                break;
            case 4 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:30: ADD
                {
                mADD(); 

                }
                break;
            case 5 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:34: ALL
                {
                mALL(); 

                }
                break;
            case 6 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:38: ALTER
                {
                mALTER(); 

                }
                break;
            case 7 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:44: AND
                {
                mAND(); 

                }
                break;
            case 8 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:48: ANY
                {
                mANY(); 

                }
                break;
            case 9 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:52: AS
                {
                mAS(); 

                }
                break;
            case 10 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:55: ASC
                {
                mASC(); 

                }
                break;
            case 11 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:59: ASSERTION
                {
                mASSERTION(); 

                }
                break;
            case 12 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:69: AT
                {
                mAT(); 

                }
                break;
            case 13 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:72: AUTHORIZATION
                {
                mAUTHORIZATION(); 

                }
                break;
            case 14 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:86: AVG
                {
                mAVG(); 

                }
                break;
            case 15 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:90: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 16 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:96: BETWEEN
                {
                mBETWEEN(); 

                }
                break;
            case 17 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:104: BIT
                {
                mBIT(); 

                }
                break;
            case 18 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:108: BOTH
                {
                mBOTH(); 

                }
                break;
            case 19 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:113: BY
                {
                mBY(); 

                }
                break;
            case 20 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:116: CASCADE
                {
                mCASCADE(); 

                }
                break;
            case 21 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:124: CASCADED
                {
                mCASCADED(); 

                }
                break;
            case 22 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:133: CASE
                {
                mCASE(); 

                }
                break;
            case 23 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:138: CAST
                {
                mCAST(); 

                }
                break;
            case 24 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:143: CATALOG
                {
                mCATALOG(); 

                }
                break;
            case 25 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:151: CHAR
                {
                mCHAR(); 

                }
                break;
            case 26 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:156: CHARACTER
                {
                mCHARACTER(); 

                }
                break;
            case 27 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:166: CHECK
                {
                mCHECK(); 

                }
                break;
            case 28 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:172: CHILDOF
                {
                mCHILDOF(); 

                }
                break;
            case 29 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:180: CLOSE
                {
                mCLOSE(); 

                }
                break;
            case 30 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:186: COALESCE
                {
                mCOALESCE(); 

                }
                break;
            case 31 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:195: COLLATE
                {
                mCOLLATE(); 

                }
                break;
            case 32 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:203: COLLATION
                {
                mCOLLATION(); 

                }
                break;
            case 33 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:213: COLUMN
                {
                mCOLUMN(); 

                }
                break;
            case 34 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:220: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 35 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:227: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 36 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:235: CONNECTION
                {
                mCONNECTION(); 

                }
                break;
            case 37 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:246: CONTAINS
                {
                mCONTAINS(); 

                }
                break;
            case 38 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:255: CONSTRAINT
                {
                mCONSTRAINT(); 

                }
                break;
            case 39 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:266: CONSTRAINTS
                {
                mCONSTRAINTS(); 

                }
                break;
            case 40 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:278: CONVERT
                {
                mCONVERT(); 

                }
                break;
            case 41 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:286: CORRESPONDING
                {
                mCORRESPONDING(); 

                }
                break;
            case 42 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:300: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 43 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:306: CREATE
                {
                mCREATE(); 

                }
                break;
            case 44 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:313: CROSS
                {
                mCROSS(); 

                }
                break;
            case 45 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:319: CUBE
                {
                mCUBE(); 

                }
                break;
            case 46 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:324: CURRENT
                {
                mCURRENT(); 

                }
                break;
            case 47 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:332: CURSOR
                {
                mCURSOR(); 

                }
                break;
            case 48 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:339: DATA
                {
                mDATA(); 

                }
                break;
            case 49 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:344: DAY
                {
                mDAY(); 

                }
                break;
            case 50 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:348: DEALLOCATE
                {
                mDEALLOCATE(); 

                }
                break;
            case 51 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:359: DEC
                {
                mDEC(); 

                }
                break;
            case 52 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:363: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 53 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:371: DECLARE
                {
                mDECLARE(); 

                }
                break;
            case 54 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:379: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 55 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:387: DEFERRABLE
                {
                mDEFERRABLE(); 

                }
                break;
            case 56 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:398: DEFERRED
                {
                mDEFERRED(); 

                }
                break;
            case 57 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:407: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 58 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:414: DELETE
                {
                mDELETE(); 

                }
                break;
            case 59 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:421: DESC
                {
                mDESC(); 

                }
                break;
            case 60 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:426: DESCRIBE
                {
                mDESCRIBE(); 

                }
                break;
            case 61 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:435: DESCRIPTOR
                {
                mDESCRIPTOR(); 

                }
                break;
            case 62 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:446: DIAGNOSTICS
                {
                mDIAGNOSTICS(); 

                }
                break;
            case 63 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:458: DIFF
                {
                mDIFF(); 

                }
                break;
            case 64 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:463: DIRECT
                {
                mDIRECT(); 

                }
                break;
            case 65 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:470: DISCONNECT
                {
                mDISCONNECT(); 

                }
                break;
            case 66 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:481: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 67 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:490: DOMAIN
                {
                mDOMAIN(); 

                }
                break;
            case 68 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:497: DROP
                {
                mDROP(); 

                }
                break;
            case 69 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:502: ELSE
                {
                mELSE(); 

                }
                break;
            case 70 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:507: END
                {
                mEND(); 

                }
                break;
            case 71 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:511: ENDS_WITH
                {
                mENDS_WITH(); 

                }
                break;
            case 72 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:521: ESCAPE
                {
                mESCAPE(); 

                }
                break;
            case 73 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:528: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 74 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:535: EXCEPTION
                {
                mEXCEPTION(); 

                }
                break;
            case 75 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:545: EXECUTE
                {
                mEXECUTE(); 

                }
                break;
            case 76 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:553: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 77 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:560: EXTERNAL
                {
                mEXTERNAL(); 

                }
                break;
            case 78 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:569: EXTRACT
                {
                mEXTRACT(); 

                }
                break;
            case 79 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:577: FALSE
                {
                mFALSE(); 

                }
                break;
            case 80 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:583: FETCH
                {
                mFETCH(); 

                }
                break;
            case 81 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:589: FIRST
                {
                mFIRST(); 

                }
                break;
            case 82 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:595: FOR
                {
                mFOR(); 

                }
                break;
            case 83 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:599: FOREIGN
                {
                mFOREIGN(); 

                }
                break;
            case 84 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:607: FROM
                {
                mFROM(); 

                }
                break;
            case 85 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:612: FULL
                {
                mFULL(); 

                }
                break;
            case 86 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:617: GET
                {
                mGET(); 

                }
                break;
            case 87 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:621: GLOBAL
                {
                mGLOBAL(); 

                }
                break;
            case 88 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:628: GRANT
                {
                mGRANT(); 

                }
                break;
            case 89 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:634: GROUP
                {
                mGROUP(); 

                }
                break;
            case 90 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:640: H_LV
                {
                mH_LV(); 

                }
                break;
            case 91 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:645: H_AID
                {
                mH_AID(); 

                }
                break;
            case 92 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:651: HAVING
                {
                mHAVING(); 

                }
                break;
            case 93 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:658: HOUR
                {
                mHOUR(); 

                }
                break;
            case 94 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:663: IDENTITY
                {
                mIDENTITY(); 

                }
                break;
            case 95 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:672: IMMEDIATE
                {
                mIMMEDIATE(); 

                }
                break;
            case 96 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:682: IN
                {
                mIN(); 

                }
                break;
            case 97 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:685: INDICATOR
                {
                mINDICATOR(); 

                }
                break;
            case 98 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:695: INITIALLY
                {
                mINITIALLY(); 

                }
                break;
            case 99 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:705: INNER
                {
                mINNER(); 

                }
                break;
            case 100 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:711: INPUT
                {
                mINPUT(); 

                }
                break;
            case 101 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:717: INSENSITIVE
                {
                mINSENSITIVE(); 

                }
                break;
            case 102 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:729: INSERT
                {
                mINSERT(); 

                }
                break;
            case 103 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:736: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 104 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:744: INTERSECT
                {
                mINTERSECT(); 

                }
                break;
            case 105 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:754: INTERVAL
                {
                mINTERVAL(); 

                }
                break;
            case 106 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:763: INTO
                {
                mINTO(); 

                }
                break;
            case 107 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:768: IS
                {
                mIS(); 

                }
                break;
            case 108 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:771: ISLEAP
                {
                mISLEAP(); 

                }
                break;
            case 109 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:778: ISOLATION
                {
                mISOLATION(); 

                }
                break;
            case 110 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:788: JOIN
                {
                mJOIN(); 

                }
                break;
            case 111 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:793: KEY
                {
                mKEY(); 

                }
                break;
            case 112 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:797: LAST
                {
                mLAST(); 

                }
                break;
            case 113 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:802: LEAF
                {
                mLEAF(); 

                }
                break;
            case 114 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:807: LEADING
                {
                mLEADING(); 

                }
                break;
            case 115 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:815: LEFT
                {
                mLEFT(); 

                }
                break;
            case 116 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:820: LENGTH
                {
                mLENGTH(); 

                }
                break;
            case 117 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:827: LEVEL
                {
                mLEVEL(); 

                }
                break;
            case 118 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:833: LIKE
                {
                mLIKE(); 

                }
                break;
            case 119 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:838: LOCAL
                {
                mLOCAL(); 

                }
                break;
            case 120 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:844: MAPPING
                {
                mMAPPING(); 

                }
                break;
            case 121 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:852: MAX
                {
                mMAX(); 

                }
                break;
            case 122 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:856: MIN
                {
                mMIN(); 

                }
                break;
            case 123 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:860: MINUTE
                {
                mMINUTE(); 

                }
                break;
            case 124 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:867: MODULE
                {
                mMODULE(); 

                }
                break;
            case 125 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:874: MONTH
                {
                mMONTH(); 

                }
                break;
            case 126 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:880: MORE
                {
                mMORE(); 

                }
                break;
            case 127 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:885: NAME
                {
                mNAME(); 

                }
                break;
            case 128 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:890: NAMES
                {
                mNAMES(); 

                }
                break;
            case 129 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:896: NATIONAL
                {
                mNATIONAL(); 

                }
                break;
            case 130 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:905: NATURAL
                {
                mNATURAL(); 

                }
                break;
            case 131 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:913: NO
                {
                mNO(); 

                }
                break;
            case 132 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:916: NOT
                {
                mNOT(); 

                }
                break;
            case 133 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:920: NULL
                {
                mNULL(); 

                }
                break;
            case 134 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:925: NULLABLE
                {
                mNULLABLE(); 

                }
                break;
            case 135 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:934: NULLIF
                {
                mNULLIF(); 

                }
                break;
            case 136 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:941: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 137 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:948: OF
                {
                mOF(); 

                }
                break;
            case 138 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:951: ON
                {
                mON(); 

                }
                break;
            case 139 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:954: ONLY
                {
                mONLY(); 

                }
                break;
            case 140 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:959: OPTION
                {
                mOPTION(); 

                }
                break;
            case 141 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:966: OR
                {
                mOR(); 

                }
                break;
            case 142 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:969: ORDER
                {
                mORDER(); 

                }
                break;
            case 143 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:975: ORM
                {
                mORM(); 

                }
                break;
            case 144 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:979: OUTER
                {
                mOUTER(); 

                }
                break;
            case 145 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:985: OUTPUT
                {
                mOUTPUT(); 

                }
                break;
            case 146 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:992: OVERLAPS
                {
                mOVERLAPS(); 

                }
                break;
            case 147 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1001: OVERRIDE
                {
                mOVERRIDE(); 

                }
                break;
            case 148 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1010: PARENTOF
                {
                mPARENTOF(); 

                }
                break;
            case 149 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1019: PARTIAL
                {
                mPARTIAL(); 

                }
                break;
            case 150 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1027: PRIMARY
                {
                mPRIMARY(); 

                }
                break;
            case 151 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1035: PRIOR
                {
                mPRIOR(); 

                }
                break;
            case 152 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1041: PRIVILEGES
                {
                mPRIVILEGES(); 

                }
                break;
            case 153 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1052: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 154 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1059: QUERY
                {
                mQUERY(); 

                }
                break;
            case 155 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1065: RANGE
                {
                mRANGE(); 

                }
                break;
            case 156 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1071: READ
                {
                mREAD(); 

                }
                break;
            case 157 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1076: REAL
                {
                mREAL(); 

                }
                break;
            case 158 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1081: REFERENCES
                {
                mREFERENCES(); 

                }
                break;
            case 159 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1092: REL
                {
                mREL(); 

                }
                break;
            case 160 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1096: RELATE
                {
                mRELATE(); 

                }
                break;
            case 161 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1103: RELATIVE
                {
                mRELATIVE(); 

                }
                break;
            case 162 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1112: REPEATABLE
                {
                mREPEATABLE(); 

                }
                break;
            case 163 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1123: RESTRICT
                {
                mRESTRICT(); 

                }
                break;
            case 164 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1132: REVOKE
                {
                mREVOKE(); 

                }
                break;
            case 165 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1139: RIGHT
                {
                mRIGHT(); 

                }
                break;
            case 166 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1145: ROLLBACK
                {
                mROLLBACK(); 

                }
                break;
            case 167 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1154: ROLLUP
                {
                mROLLUP(); 

                }
                break;
            case 168 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1161: ROWS
                {
                mROWS(); 

                }
                break;
            case 169 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1166: SCALE
                {
                mSCALE(); 

                }
                break;
            case 170 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1172: SCHEMA
                {
                mSCHEMA(); 

                }
                break;
            case 171 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1179: SCROLL
                {
                mSCROLL(); 

                }
                break;
            case 172 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1186: SECOND
                {
                mSECOND(); 

                }
                break;
            case 173 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1193: SELECT
                {
                mSELECT(); 

                }
                break;
            case 174 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1200: SERIALIZABLE
                {
                mSERIALIZABLE(); 

                }
                break;
            case 175 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1213: SESSION
                {
                mSESSION(); 

                }
                break;
            case 176 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1221: SET
                {
                mSET(); 

                }
                break;
            case 177 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1225: SIZE
                {
                mSIZE(); 

                }
                break;
            case 178 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1230: SOME
                {
                mSOME(); 

                }
                break;
            case 179 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1235: SPACE
                {
                mSPACE(); 

                }
                break;
            case 180 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1241: SQL
                {
                mSQL(); 

                }
                break;
            case 181 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1245: STARTS_WITH
                {
                mSTARTS_WITH(); 

                }
                break;
            case 182 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1257: SUM
                {
                mSUM(); 

                }
                break;
            case 183 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1261: TABLE
                {
                mTABLE(); 

                }
                break;
            case 184 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1267: TEMPORARY
                {
                mTEMPORARY(); 

                }
                break;
            case 185 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1277: THEN
                {
                mTHEN(); 

                }
                break;
            case 186 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1282: TIME
                {
                mTIME(); 

                }
                break;
            case 187 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1287: TIMESTAMP
                {
                mTIMESTAMP(); 

                }
                break;
            case 188 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1297: TO
                {
                mTO(); 

                }
                break;
            case 189 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1300: TRUE
                {
                mTRUE(); 

                }
                break;
            case 190 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1305: TYPE
                {
                mTYPE(); 

                }
                break;
            case 191 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1310: UNCOMMITTED
                {
                mUNCOMMITTED(); 

                }
                break;
            case 192 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1322: UNION
                {
                mUNION(); 

                }
                break;
            case 193 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1328: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 194 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1335: UNKNOWN
                {
                mUNKNOWN(); 

                }
                break;
            case 195 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1343: UNNAMED
                {
                mUNNAMED(); 

                }
                break;
            case 196 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1351: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 197 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1358: USAGE
                {
                mUSAGE(); 

                }
                break;
            case 198 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1364: USER
                {
                mUSER(); 

                }
                break;
            case 199 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1369: USING
                {
                mUSING(); 

                }
                break;
            case 200 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1375: VALUE
                {
                mVALUE(); 

                }
                break;
            case 201 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1381: VALUES
                {
                mVALUES(); 

                }
                break;
            case 202 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1388: VARYING
                {
                mVARYING(); 

                }
                break;
            case 203 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1396: VIEW
                {
                mVIEW(); 

                }
                break;
            case 204 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1401: WHEN
                {
                mWHEN(); 

                }
                break;
            case 205 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1406: WHERE
                {
                mWHERE(); 

                }
                break;
            case 206 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1412: WITH
                {
                mWITH(); 

                }
                break;
            case 207 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1417: WORK
                {
                mWORK(); 

                }
                break;
            case 208 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1422: WRITE
                {
                mWRITE(); 

                }
                break;
            case 209 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1428: YEAR
                {
                mYEAR(); 

                }
                break;
            case 210 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1433: ZONE
                {
                mZONE(); 

                }
                break;
            case 211 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1438: DESCENDANTOF
                {
                mDESCENDANTOF(); 

                }
                break;
            case 212 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1451: ANCESTOROF
                {
                mANCESTOROF(); 

                }
                break;
            case 213 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1462: INT
                {
                mINT(); 

                }
                break;
            case 214 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1466: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 215 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1472: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 216 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1479: DATE
                {
                mDATE(); 

                }
                break;
            case 217 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1484: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 218 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1492: GUID
                {
                mGUID(); 

                }
                break;
            case 219 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1497: BYTE
                {
                mBYTE(); 

                }
                break;
            case 220 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1502: BYTES
                {
                mBYTES(); 

                }
                break;
            case 221 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1508: ENUM
                {
                mENUM(); 

                }
                break;
            case 222 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1513: SHORT
                {
                mSHORT(); 

                }
                break;
            case 223 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1519: LONG
                {
                mLONG(); 

                }
                break;
            case 224 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1524: STRING
                {
                mSTRING(); 

                }
                break;
            case 225 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1531: BLOB
                {
                mBLOB(); 

                }
                break;
            case 226 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1536: NTEXT
                {
                mNTEXT(); 

                }
                break;
            case 227 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1542: TEXT
                {
                mTEXT(); 

                }
                break;
            case 228 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1547: BINARY
                {
                mBINARY(); 

                }
                break;
            case 229 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1554: NCHAR
                {
                mNCHAR(); 

                }
                break;
            case 230 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1560: NVARCHAR
                {
                mNVARCHAR(); 

                }
                break;
            case 231 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1569: VARBINARY
                {
                mVARBINARY(); 

                }
                break;
            case 232 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1579: VARCHAR
                {
                mVARCHAR(); 

                }
                break;
            case 233 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1587: NUMERIC
                {
                mNUMERIC(); 

                }
                break;
            case 234 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1595: ARGUMENT_ID
                {
                mARGUMENT_ID(); 

                }
                break;
            case 235 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1607: REGULAR_ID
                {
                mREGULAR_ID(); 

                }
                break;
            case 236 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1618: EXACT_NUM_LIT
                {
                mEXACT_NUM_LIT(); 

                }
                break;
            case 237 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1632: CHAR_STRING
                {
                mCHAR_STRING(); 

                }
                break;
            case 238 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1644: DELIMITED_ID
                {
                mDELIMITED_ID(); 

                }
                break;
            case 239 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1657: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 240 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1665: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 241 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1675: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 242 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1686: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 243 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1698: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 244 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1707: PLUS_SIGN
                {
                mPLUS_SIGN(); 

                }
                break;
            case 245 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1717: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 246 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1723: MINUS_SIGN
                {
                mMINUS_SIGN(); 

                }
                break;
            case 247 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1734: SOLIDUS
                {
                mSOLIDUS(); 

                }
                break;
            case 248 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1742: COLON
                {
                mCOLON(); 

                }
                break;
            case 249 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1748: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 250 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1758: LESS_THAN_OP
                {
                mLESS_THAN_OP(); 

                }
                break;
            case 251 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1771: EQUALS_OP
                {
                mEQUALS_OP(); 

                }
                break;
            case 252 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1781: GREATER_THAN_OP
                {
                mGREATER_THAN_OP(); 

                }
                break;
            case 253 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1797: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 254 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1811: VERTICAL_BAR
                {
                mVERTICAL_BAR(); 

                }
                break;
            case 255 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1824: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 256 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1837: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 257 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1851: INTRODUCER
                {
                mINTRODUCER(); 

                }
                break;
            case 258 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1862: SEPARATOR
                {
                mSEPARATOR(); 

                }
                break;
            case 259 :
                // E:\\D&A_IDE_DEV\\Source_COM\\org.eclipse.jt.sql.assist.parser.antlr\\src\\org\\eclipse\\jt\\sql\\assist\\parser\\internal\\antlr\\parsers\\DnaSqlQuery.g:1:1872: ANY_CHAR
                {
                mANY_CHAR(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\31\67\5\uffff\1\66\7\uffff\1\u00ab\20\uffff\3\67\1\u00bd"+
        "\1\u00c0\4\67\1\u00c6\41\67\1\u0105\1\u010c\16\67\1\u0126\2\67\1"+
        "\u012a\1\u012d\3\67\1\u0132\23\67\1\u0154\17\67\30\uffff\1\67\1"+
        "\u016b\1\u016c\1\u016d\1\u016e\1\67\1\uffff\1\67\1\u0171\1\uffff"+
        "\1\67\1\u0173\1\67\1\u0175\1\67\1\uffff\1\67\1\u0178\31\67\1\u019b"+
        "\4\67\1\u01a3\5\67\1\u01aa\12\67\1\u01b7\7\67\1\u01c0\4\67\1\uffff"+
        "\1\u01c5\5\67\1\uffff\5\67\1\u01d2\13\67\1\u01df\1\67\1\u01e1\5"+
        "\67\1\uffff\1\u01ea\2\67\1\uffff\1\u01ed\1\67\1\uffff\4\67\1\uffff"+
        "\6\67\1\u01fd\13\67\1\u020b\7\67\1\u0213\1\u0214\5\67\1\uffff\26"+
        "\67\4\uffff\2\67\1\uffff\1\67\1\uffff\1\67\1\uffff\1\67\1\u0239"+
        "\1\uffff\3\67\1\u023e\1\67\1\u0240\1\67\1\u0242\1\u0243\1\67\1\u0245"+
        "\4\67\1\u024b\20\67\1\u025c\1\67\1\uffff\5\67\1\u0265\1\u0266\1"+
        "\uffff\3\67\1\u026a\1\67\1\u026c\1\uffff\1\67\1\u026e\6\67\1\u0275"+
        "\1\67\1\u0277\1\67\1\uffff\3\67\1\u027c\1\u027d\3\67\1\uffff\1\67"+
        "\1\u0282\1\u0283\1\67\1\uffff\1\67\1\u0287\11\67\1\u0292\1\uffff"+
        "\1\67\1\u0294\1\u0295\2\67\1\u0298\1\67\1\u029a\1\u029b\2\67\1\u029e"+
        "\1\uffff\1\67\1\uffff\3\67\1\u02a3\3\67\1\u02a8\1\uffff\2\67\1\uffff"+
        "\1\67\1\u02ae\14\67\1\u02bd\1\uffff\1\67\1\u02bf\1\u02c0\12\67\1"+
        "\uffff\7\67\2\uffff\1\u02d2\1\u02d3\1\67\1\u02d5\1\u02d6\1\u02d7"+
        "\1\u02d8\1\67\1\u02db\2\67\1\u02de\12\67\1\u02e9\1\u02ea\1\u02eb"+
        "\2\67\1\u02ee\1\u02ef\1\u02f0\4\67\1\u02f5\1\67\1\uffff\1\u02f7"+
        "\2\67\1\u02fa\1\uffff\1\67\1\uffff\1\67\2\uffff\1\67\1\uffff\1\67"+
        "\1\u02ff\3\67\1\uffff\5\67\1\u0308\5\67\1\u030e\1\u030f\3\67\1\uffff"+
        "\10\67\2\uffff\3\67\1\uffff\1\67\1\uffff\1\67\1\uffff\6\67\1\uffff"+
        "\1\u0326\1\uffff\1\u0327\1\67\1\u0329\1\u032a\2\uffff\1\67\1\u032c"+
        "\1\u032d\1\u032e\2\uffff\3\67\1\uffff\3\67\1\u0336\1\u0337\5\67"+
        "\1\uffff\1\67\2\uffff\1\67\1\u033f\1\uffff\1\u0340\2\uffff\1\u0341"+
        "\1\67\1\uffff\4\67\1\uffff\1\u0347\1\u0348\2\67\1\uffff\2\67\1\u034d"+
        "\1\67\1\u034f\1\uffff\1\67\1\u0351\4\67\1\u0356\4\67\1\u035b\2\67"+
        "\1\uffff\1\67\2\uffff\4\67\1\u0364\1\u0365\1\u0366\1\u0367\6\67"+
        "\1\u036e\2\67\2\uffff\1\67\4\uffff\1\67\1\u0373\1\uffff\1\u0374"+
        "\1\u0375\1\uffff\2\67\1\u0378\6\67\1\u037f\3\uffff\1\u0381\1\u0382"+
        "\3\uffff\3\67\1\u0386\1\uffff\1\67\1\uffff\1\u0388\1\67\1\uffff"+
        "\4\67\1\uffff\1\67\1\u038f\6\67\1\uffff\1\67\1\u0398\1\u0399\1\67"+
        "\1\u039b\2\uffff\2\67\1\u039f\5\67\1\u03a6\1\u03a7\1\u03a8\2\67"+
        "\1\u03ab\2\67\1\u03ae\3\67\1\u03b3\1\u03b4\2\uffff\1\67\2\uffff"+
        "\1\u03b6\3\uffff\1\u03b7\4\67\1\u03bc\1\67\2\uffff\2\67\1\u03c0"+
        "\2\67\1\u03c3\1\67\3\uffff\1\u03c5\1\67\1\u03c7\2\67\2\uffff\1\67"+
        "\1\u03cb\1\u03cc\1\67\1\uffff\1\67\1\uffff\1\u03cf\1\uffff\1\u03d0"+
        "\3\67\1\uffff\3\67\1\u03d7\1\uffff\1\67\1\u03d9\1\67\1\u03db\2\67"+
        "\1\u03de\1\67\4\uffff\1\u03e0\1\u03e1\1\67\1\u03e3\1\67\1\u03e5"+
        "\1\uffff\1\u03e6\3\67\3\uffff\1\67\1\u03eb\1\uffff\2\67\1\u03ee"+
        "\3\67\1\uffff\1\u03f2\2\uffff\3\67\1\uffff\1\67\1\uffff\1\u03f7"+
        "\1\u03f8\1\u03f9\1\u03fb\1\67\1\u03fd\1\uffff\1\u03fe\1\67\1\u0400"+
        "\2\67\1\u0404\1\67\1\u0406\2\uffff\1\67\1\uffff\2\67\1\u040a\1\uffff"+
        "\4\67\1\u040f\1\u0410\3\uffff\2\67\1\uffff\2\67\1\uffff\1\67\1\u0416"+
        "\1\u0417\1\67\2\uffff\1\u0419\2\uffff\2\67\1\u041c\1\67\1\uffff"+
        "\3\67\1\uffff\2\67\1\uffff\1\u0423\1\uffff\1\u0424\1\uffff\1\u0425"+
        "\1\67\1\u0427\2\uffff\2\67\2\uffff\2\67\1\u042c\2\67\1\u042f\1\uffff"+
        "\1\67\1\uffff\1\67\1\uffff\2\67\1\uffff\1\67\2\uffff\1\67\1\uffff"+
        "\1\u0436\2\uffff\3\67\1\u043a\1\uffff\1\67\1\u043c\1\uffff\1\u043d"+
        "\1\67\1\u043f\1\uffff\1\67\1\u0441\2\67\3\uffff\1\u0444\1\uffff"+
        "\1\67\2\uffff\1\u0446\1\uffff\2\67\1\u0449\1\uffff\1\67\1\uffff"+
        "\2\67\1\u044d\1\uffff\1\67\1\u044f\2\67\2\uffff\1\u0452\4\67\2\uffff"+
        "\1\u0457\1\uffff\1\67\1\u0459\1\uffff\5\67\1\u045f\3\uffff\1\u0460"+
        "\1\uffff\1\u0461\1\u0462\1\u0463\1\u0464\1\uffff\1\67\1\u0466\1"+
        "\uffff\1\u0467\1\u0468\2\67\1\u046b\1\67\1\uffff\3\67\1\uffff\1"+
        "\67\2\uffff\1\67\1\uffff\1\67\1\uffff\1\u0473\1\67\1\uffff\1\u0475"+
        "\1\uffff\2\67\1\uffff\1\u0478\2\67\1\uffff\1\67\1\uffff\2\67\1\uffff"+
        "\2\67\1\u0480\1\u0481\1\uffff\1\u0482\1\uffff\1\u0483\1\67\1\u0485"+
        "\1\u0486\1\u0487\6\uffff\1\67\3\uffff\2\67\1\uffff\2\67\1\u048d"+
        "\1\u048e\1\67\1\u0490\1\u0491\1\uffff\1\67\1\uffff\1\u0493\1\u0494"+
        "\1\uffff\1\67\1\u0497\1\u0498\1\67\1\u049a\1\u049b\1\67\4\uffff"+
        "\1\67\3\uffff\1\u049e\1\u049f\1\u04a0\2\67\2\uffff\1\67\2\uffff"+
        "\1\67\2\uffff\1\u04a5\1\67\2\uffff\1\67\2\uffff\1\u04a8\1\u04a9"+
        "\3\uffff\1\67\1\u04ab\1\u04ac\1\67\1\uffff\1\67\1\u04af\2\uffff"+
        "\1\u04b0\2\uffff\1\u04b1\1\u04b2\4\uffff";
    static final String DFA22_eofS =
        "\u04b3\uffff";
    static final String DFA22_minS =
        "\1\0\1\102\1\105\2\101\1\114\1\101\1\105\1\101\1\104\1\117\1\105"+
        "\3\101\1\106\1\101\1\125\1\101\1\103\1\101\1\116\1\101\1\110\1\105"+
        "\1\117\5\uffff\1\0\7\uffff\1\55\20\uffff\1\103\1\107\1\117\2\60"+
        "\1\124\1\114\1\104\1\124\1\60\1\116\1\107\2\117\1\123\1\101\1\102"+
        "\1\101\1\105\1\117\1\101\1\115\1\124\1\101\1\117\1\104\2\103\1\123"+
        "\2\117\2\122\1\124\2\114\1\111\1\117\1\101\1\124\1\101\1\125\1\126"+
        "\2\60\1\115\1\105\1\111\1\131\1\101\1\123\1\103\1\113\1\104\1\120"+
        "\1\116\1\115\1\105\1\114\1\60\1\110\1\101\2\60\2\124\1\105\1\60"+
        "\1\111\1\122\1\102\1\105\1\114\1\101\1\107\1\116\1\117\1\101\1\103"+
        "\2\101\1\114\1\115\1\132\2\115\1\125\1\60\1\105\1\115\1\102\1\120"+
        "\1\101\1\103\1\104\1\114\1\105\1\124\1\105\1\111\1\122\1\101\1\116"+
        "\30\uffff\1\105\4\60\1\124\1\uffff\1\105\1\60\1\uffff\1\111\1\60"+
        "\1\105\1\60\1\110\1\uffff\1\105\1\60\1\101\1\127\1\111\1\110\1\114"+
        "\1\102\1\103\1\101\1\122\1\103\1\114\1\122\1\105\1\114\2\116\1\114"+
        "\1\115\1\122\1\101\2\123\1\101\1\103\1\114\1\60\1\105\1\101\1\102"+
        "\1\101\1\60\1\103\1\105\1\106\1\107\1\120\1\60\1\115\1\105\1\103"+
        "\1\105\1\123\1\101\1\105\1\101\1\115\1\123\1\60\1\103\1\123\1\114"+
        "\1\104\1\102\1\116\1\125\1\60\1\111\1\126\1\122\1\111\1\uffff\1"+
        "\60\1\111\2\105\1\125\1\124\1\uffff\1\114\2\105\2\116\1\60\1\107"+
        "\1\124\1\104\1\105\1\124\1\101\1\107\1\105\1\124\1\125\1\105\1\60"+
        "\1\120\1\60\1\111\1\105\1\130\1\102\1\114\1\uffff\1\60\1\101\1\122"+
        "\1\uffff\1\60\1\105\1\uffff\1\131\1\105\1\111\1\122\1\uffff\1\115"+
        "\1\105\1\114\1\122\1\114\1\123\1\60\1\104\2\105\1\117\1\124\1\110"+
        "\1\107\1\122\1\114\1\117\1\105\1\60\1\111\1\105\1\123\1\117\1\103"+
        "\1\111\1\122\2\60\2\105\1\120\1\124\1\105\1\uffff\1\116\1\105\1"+
        "\114\1\105\1\116\1\107\1\122\1\101\2\117\1\116\1\101\1\102\1\125"+
        "\1\127\1\110\1\116\1\124\1\113\1\122\1\105\1\123\4\uffff\1\101\1"+
        "\122\1\uffff\1\117\1\uffff\1\122\1\uffff\1\117\1\60\1\uffff\1\122"+
        "\1\105\1\116\1\60\1\105\1\60\1\101\2\60\1\114\1\60\1\113\1\104\1"+
        "\117\1\105\1\60\2\105\1\124\1\101\1\105\1\124\1\101\1\115\1\111"+
        "\1\105\1\124\1\123\1\105\1\122\1\125\1\116\1\60\1\114\1\uffff\1"+
        "\101\1\115\1\124\1\111\1\114\2\60\1\uffff\1\111\1\117\1\103\1\60"+
        "\1\116\1\60\1\uffff\1\137\1\60\1\120\1\125\1\101\1\122\1\124\1\120"+
        "\1\60\1\124\1\60\1\124\1\uffff\1\111\1\110\1\105\2\60\1\101\1\124"+
        "\1\120\1\uffff\1\104\2\60\1\116\1\uffff\1\107\1\60\1\103\1\116\1"+
        "\122\1\124\1\111\2\101\1\104\1\124\1\60\1\uffff\1\124\2\60\1\111"+
        "\1\114\1\60\1\114\2\60\1\110\1\114\1\60\1\uffff\1\111\1\uffff\1"+
        "\124\1\122\1\117\1\60\1\124\1\122\1\105\1\60\1\uffff\1\122\1\103"+
        "\1\uffff\1\122\1\60\1\125\1\122\1\117\1\114\1\101\1\122\1\111\1"+
        "\116\2\111\1\131\1\102\1\60\1\uffff\1\124\2\60\1\101\1\122\1\113"+
        "\1\122\1\124\1\105\1\124\1\105\1\114\1\115\1\uffff\1\101\1\103\1"+
        "\111\1\116\1\105\1\116\1\124\2\uffff\2\60\1\117\4\60\1\105\1\60"+
        "\1\107\1\105\1\60\1\115\1\125\1\116\1\115\1\117\1\124\2\111\1\110"+
        "\1\105\3\60\2\105\3\60\1\124\1\102\1\124\1\116\1\60\1\122\1\uffff"+
        "\1\60\1\131\1\105\1\60\1\uffff\1\101\1\uffff\1\104\2\uffff\1\117"+
        "\1\uffff\1\103\1\60\1\117\1\122\1\116\1\uffff\1\123\1\103\1\122"+
        "\1\111\1\122\1\60\1\124\1\116\1\124\1\123\1\105\2\60\1\122\1\114"+
        "\1\105\1\uffff\1\111\1\116\1\117\1\122\1\101\1\105\1\116\1\105\2"+
        "\uffff\2\116\1\124\1\uffff\1\117\1\uffff\1\127\1\uffff\2\124\1\103"+
        "\1\116\1\123\1\105\1\uffff\1\60\1\uffff\1\60\1\107\2\60\2\uffff"+
        "\1\114\3\60\2\uffff\1\107\1\123\1\105\1\uffff\1\101\1\124\1\123"+
        "\2\60\1\101\1\124\1\120\2\111\1\uffff\1\110\2\uffff\1\116\1\60\1"+
        "\uffff\1\60\2\uffff\1\60\1\105\1\uffff\1\116\1\105\1\101\1\116\1"+
        "\uffff\2\60\1\111\1\122\1\uffff\1\106\1\102\1\60\1\110\1\60\1\uffff"+
        "\1\124\1\60\1\116\1\101\1\111\1\122\1\60\1\114\1\124\1\101\1\103"+
        "\1\60\1\101\1\120\1\uffff\1\105\2\uffff\1\124\2\105\1\111\4\60\1"+
        "\114\1\101\1\114\1\124\1\117\1\104\1\60\1\107\1\123\2\uffff\1\122"+
        "\4\uffff\1\124\1\60\1\uffff\2\60\1\uffff\2\105\1\60\1\115\1\127"+
        "\1\105\2\116\1\101\1\60\3\uffff\2\60\3\uffff\1\117\1\114\1\111\1"+
        "\60\1\uffff\1\111\1\uffff\1\60\1\116\1\uffff\1\116\1\105\1\107\1"+
        "\124\1\uffff\1\106\1\60\1\124\1\103\1\124\1\101\1\116\1\124\1\uffff"+
        "\1\105\2\60\1\120\1\60\2\uffff\1\101\1\124\1\60\1\102\1\104\1\103"+
        "\1\105\1\114\3\60\1\103\1\116\1\60\1\123\1\111\1\60\1\105\1\124"+
        "\1\101\2\60\2\uffff\1\116\2\uffff\1\60\3\uffff\1\60\1\105\1\101"+
        "\1\122\1\124\1\60\1\111\2\uffff\1\114\1\111\1\60\1\101\1\124\1\60"+
        "\1\107\3\uffff\1\60\1\107\1\60\1\114\1\101\2\uffff\1\103\2\60\1"+
        "\114\1\uffff\1\101\1\uffff\1\60\1\uffff\1\60\1\120\1\104\1\131\1"+
        "\uffff\1\105\1\117\1\114\1\60\1\uffff\1\103\1\60\1\126\1\60\1\101"+
        "\1\116\1\60\1\103\4\uffff\2\60\1\111\1\60\1\116\1\60\1\uffff\1\60"+
        "\1\137\2\101\3\uffff\1\104\1\60\1\uffff\1\111\1\116\1\60\1\107\1"+
        "\101\1\122\1\uffff\1\60\2\uffff\1\122\1\105\1\117\1\uffff\1\132"+
        "\1\uffff\4\60\1\105\1\60\1\uffff\1\60\1\105\1\60\1\111\1\123\1\60"+
        "\1\117\1\60\2\uffff\1\117\1\uffff\1\102\1\104\1\60\1\uffff\1\124"+
        "\1\105\2\101\2\60\3\uffff\1\124\1\105\1\uffff\2\124\1\uffff\1\117"+
        "\2\60\1\114\2\uffff\1\60\2\uffff\1\103\1\114\1\60\1\117\1\uffff"+
        "\1\124\1\114\1\117\1\uffff\1\124\1\131\1\uffff\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\114\1\60\2\uffff\1\105\1\122\2\uffff\1\123\1\105"+
        "\1\60\1\107\1\106\1\60\1\uffff\1\113\1\uffff\1\105\1\uffff\1\102"+
        "\1\103\1\uffff\1\124\2\uffff\1\132\1\uffff\1\60\2\uffff\1\127\1"+
        "\122\1\115\1\60\1\uffff\1\124\1\60\1\uffff\1\60\1\122\1\60\1\uffff"+
        "\1\117\1\60\1\116\1\101\3\uffff\1\60\1\uffff\1\122\2\uffff\1\60"+
        "\1\uffff\1\117\1\116\1\60\1\uffff\1\116\1\uffff\1\116\1\114\1\60"+
        "\1\uffff\1\117\1\60\1\116\1\124\2\uffff\1\60\1\103\1\111\1\110\1"+
        "\116\2\uffff\1\60\1\uffff\1\124\1\60\1\uffff\1\122\1\111\1\131\1"+
        "\116\1\105\1\60\3\uffff\1\60\1\uffff\4\60\1\uffff\1\105\1\60\1\uffff"+
        "\2\60\1\114\1\105\1\60\1\101\1\uffff\1\111\1\131\1\120\1\uffff\1"+
        "\124\2\uffff\1\131\1\uffff\1\106\1\uffff\1\60\1\124\1\uffff\1\60"+
        "\1\uffff\1\116\1\124\1\uffff\1\60\1\104\1\105\1\uffff\1\122\1\uffff"+
        "\1\124\1\105\1\uffff\1\124\1\103\2\60\1\uffff\1\60\1\uffff\1\60"+
        "\1\126\3\60\6\uffff\1\123\3\uffff\1\105\1\123\1\uffff\1\102\1\124"+
        "\2\60\1\105\2\60\1\uffff\1\111\1\uffff\2\60\1\uffff\1\111\2\60\1"+
        "\117\2\60\1\123\4\uffff\1\105\3\uffff\3\60\1\114\1\110\2\uffff\1"+
        "\104\2\uffff\1\117\2\uffff\1\60\1\116\2\uffff\1\106\2\uffff\2\60"+
        "\3\uffff\1\105\2\60\1\116\1\uffff\1\107\1\60\2\uffff\1\60\2\uffff"+
        "\2\60\4\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\166\1\171\1\165\1\162\1\170\2\165\1\157\1\163\1\157"+
        "\1\145\2\157\2\166\2\165\1\157\1\165\1\171\1\163\1\151\1\162\1\145"+
        "\1\157\5\uffff\1\uffff\7\uffff\1\55\20\uffff\1\171\1\147\1\163\2"+
        "\u00ff\2\164\1\144\1\164\1\u00ff\3\164\1\157\1\164\1\151\1\162\1"+
        "\165\2\157\1\163\1\165\1\171\1\163\1\157\1\165\1\164\1\143\1\163"+
        "\2\157\2\162\1\164\2\154\1\151\2\157\1\164\1\154\1\165\1\166\2\u00ff"+
        "\1\155\1\145\1\151\1\171\1\166\1\163\1\156\1\153\1\162\1\170\1\156"+
        "\1\164\1\145\1\155\1\u00ff\1\150\1\141\2\u00ff\2\164\1\145\1\u00ff"+
        "\1\151\1\162\1\142\1\145\1\167\1\166\1\147\1\156\1\157\1\162\1\164"+
        "\1\141\1\162\1\154\1\155\1\172\1\155\1\170\1\165\1\u00ff\1\145\1"+
        "\155\1\142\1\160\1\151\1\156\1\144\1\162\1\145\1\164\1\145\1\151"+
        "\1\162\1\141\1\156\30\uffff\1\145\4\u00ff\1\164\1\uffff\1\145\1"+
        "\u00ff\1\uffff\1\151\1\u00ff\1\145\1\u00ff\1\150\1\uffff\1\145\1"+
        "\u00ff\1\141\1\167\1\151\1\150\1\154\1\142\1\164\1\141\1\162\1\143"+
        "\1\154\1\163\1\145\1\154\1\166\1\156\1\165\1\155\1\162\1\141\2\163"+
        "\1\151\1\143\1\154\1\u00ff\1\145\1\141\1\142\1\145\1\u00ff\1\164"+
        "\1\145\1\146\1\147\1\160\1\u00ff\1\155\1\145\1\143\1\162\1\163\1"+
        "\141\1\145\1\141\1\155\1\163\1\u00ff\1\143\1\163\1\154\1\144\1\142"+
        "\1\156\1\165\1\u00ff\1\151\1\166\1\162\1\151\1\uffff\1\u00ff\1\151"+
        "\2\145\1\165\1\164\1\uffff\1\154\2\145\2\156\1\u00ff\1\147\1\164"+
        "\1\146\1\145\1\164\1\141\1\147\1\145\1\164\1\165\1\145\1\u00ff\1"+
        "\160\1\u00ff\1\165\1\145\1\170\1\145\1\154\1\uffff\1\u00ff\1\141"+
        "\1\162\1\uffff\1\u00ff\1\145\1\uffff\1\171\1\160\1\151\1\162\1\uffff"+
        "\1\166\1\164\1\154\1\162\1\154\1\163\1\u00ff\1\154\2\145\1\157\1"+
        "\164\1\150\1\147\1\162\1\154\1\157\1\145\1\u00ff\1\151\1\145\1\163"+
        "\1\157\1\143\1\151\1\162\2\u00ff\2\145\1\160\1\164\1\145\1\uffff"+
        "\1\156\1\145\1\154\1\145\1\156\1\147\1\162\1\141\1\161\1\157\1\156"+
        "\1\141\1\171\1\165\1\167\1\150\1\162\1\164\1\153\1\162\1\145\1\163"+
        "\4\uffff\1\141\1\162\1\uffff\1\157\1\uffff\1\162\1\uffff\1\157\1"+
        "\u00ff\1\uffff\1\162\1\145\1\156\1\u00ff\1\145\1\u00ff\1\141\2\u00ff"+
        "\1\154\1\u00ff\1\153\1\144\1\157\1\145\1\u00ff\2\145\1\164\1\141"+
        "\1\145\1\164\1\141\1\155\1\151\1\145\1\164\1\163\1\145\1\162\1\165"+
        "\1\156\1\u00ff\1\154\1\uffff\1\141\1\155\1\164\1\151\1\154\2\u00ff"+
        "\1\uffff\1\151\1\157\1\143\1\u00ff\1\156\1\u00ff\1\uffff\1\137\1"+
        "\u00ff\1\160\1\165\1\141\1\162\1\164\1\160\1\u00ff\1\164\1\u00ff"+
        "\1\164\1\uffff\1\151\1\150\1\145\2\u00ff\1\141\1\164\1\160\1\uffff"+
        "\1\144\2\u00ff\1\156\1\uffff\1\162\1\u00ff\1\143\2\162\1\164\1\151"+
        "\2\141\1\144\1\164\1\u00ff\1\uffff\1\164\2\u00ff\1\151\1\154\1\u00ff"+
        "\1\154\2\u00ff\1\150\1\154\1\u00ff\1\uffff\1\151\1\uffff\1\164\1"+
        "\162\1\157\1\u00ff\1\164\1\162\1\145\1\u00ff\1\uffff\1\162\1\143"+
        "\1\uffff\1\162\1\u00ff\1\165\1\162\1\157\1\162\1\141\1\162\1\151"+
        "\1\156\2\151\1\171\1\165\1\u00ff\1\uffff\1\164\2\u00ff\1\141\1\162"+
        "\1\153\1\162\1\164\1\145\1\164\1\145\1\154\1\155\1\uffff\1\141\1"+
        "\143\1\151\1\156\1\145\1\156\1\164\2\uffff\2\u00ff\1\157\4\u00ff"+
        "\1\145\1\u00ff\1\147\1\145\1\u00ff\1\155\1\165\1\156\1\155\1\157"+
        "\1\164\2\151\1\150\1\145\3\u00ff\2\145\3\u00ff\1\164\1\142\1\164"+
        "\1\156\1\u00ff\1\162\1\uffff\1\u00ff\1\171\1\145\1\u00ff\1\uffff"+
        "\1\141\1\uffff\1\144\2\uffff\1\157\1\uffff\1\143\1\u00ff\1\157\1"+
        "\162\1\156\1\uffff\1\163\1\143\1\162\1\151\1\162\1\u00ff\1\164\1"+
        "\156\1\164\1\163\1\145\2\u00ff\1\162\1\154\1\145\1\uffff\1\151\1"+
        "\156\1\157\1\162\1\141\1\145\1\156\1\145\2\uffff\2\156\1\164\1\uffff"+
        "\1\157\1\uffff\1\167\1\uffff\2\164\1\143\1\156\1\163\1\145\1\uffff"+
        "\1\u00ff\1\uffff\1\u00ff\1\147\2\u00ff\2\uffff\1\154\3\u00ff\2\uffff"+
        "\1\147\1\166\1\145\1\uffff\1\141\1\164\1\163\2\u00ff\1\141\1\164"+
        "\1\160\2\151\1\uffff\1\150\2\uffff\1\156\1\u00ff\1\uffff\1\u00ff"+
        "\2\uffff\1\u00ff\1\145\1\uffff\1\156\1\145\1\141\1\156\1\uffff\2"+
        "\u00ff\1\151\1\162\1\uffff\1\146\1\142\1\u00ff\1\150\1\u00ff\1\uffff"+
        "\1\164\1\u00ff\1\156\1\141\1\151\1\162\1\u00ff\1\154\1\164\1\141"+
        "\1\143\1\u00ff\1\141\1\160\1\uffff\1\151\2\uffff\1\164\2\145\1\151"+
        "\4\u00ff\1\154\1\141\1\154\1\164\1\157\1\144\1\u00ff\1\147\1\163"+
        "\2\uffff\1\162\4\uffff\1\164\1\u00ff\1\uffff\2\u00ff\1\uffff\2\145"+
        "\1\u00ff\1\155\1\167\1\145\2\156\1\141\1\u00ff\3\uffff\2\u00ff\3"+
        "\uffff\1\157\1\154\1\151\1\u00ff\1\uffff\1\151\1\uffff\1\u00ff\1"+
        "\156\1\uffff\1\156\1\145\1\147\1\164\1\uffff\1\146\1\u00ff\1\164"+
        "\1\143\1\164\1\141\1\156\1\164\1\uffff\1\151\2\u00ff\1\160\1\u00ff"+
        "\2\uffff\1\145\1\164\1\u00ff\1\160\1\144\1\143\1\145\1\154\3\u00ff"+
        "\1\143\1\156\1\u00ff\1\163\1\151\1\u00ff\1\145\1\164\1\141\2\u00ff"+
        "\2\uffff\1\156\2\uffff\1\u00ff\3\uffff\1\u00ff\1\145\1\141\1\162"+
        "\1\164\1\u00ff\1\151\2\uffff\1\154\1\151\1\u00ff\1\141\1\164\1\u00ff"+
        "\1\147\3\uffff\1\u00ff\1\147\1\u00ff\1\154\1\141\2\uffff\1\143\2"+
        "\u00ff\1\154\1\uffff\1\141\1\uffff\1\u00ff\1\uffff\1\u00ff\1\160"+
        "\1\144\1\171\1\uffff\1\145\1\157\1\154\1\u00ff\1\uffff\1\143\1\u00ff"+
        "\1\166\1\u00ff\1\141\1\156\1\u00ff\1\143\4\uffff\2\u00ff\1\151\1"+
        "\u00ff\1\156\1\u00ff\1\uffff\1\u00ff\1\137\2\141\3\uffff\1\144\1"+
        "\u00ff\1\uffff\1\151\1\156\1\u00ff\1\147\1\141\1\162\1\uffff\1\u00ff"+
        "\2\uffff\1\162\1\145\1\157\1\uffff\1\172\1\uffff\4\u00ff\1\145\1"+
        "\u00ff\1\uffff\1\u00ff\1\145\1\u00ff\1\151\1\163\1\u00ff\1\157\1"+
        "\u00ff\2\uffff\1\157\1\uffff\1\142\1\144\1\u00ff\1\uffff\1\164\1"+
        "\145\2\141\2\u00ff\3\uffff\1\164\1\145\1\uffff\2\164\1\uffff\1\157"+
        "\2\u00ff\1\154\2\uffff\1\u00ff\2\uffff\1\143\1\154\1\u00ff\1\157"+
        "\1\uffff\1\164\1\154\1\157\1\uffff\1\164\1\171\1\uffff\1\u00ff\1"+
        "\uffff\1\u00ff\1\uffff\1\u00ff\1\154\1\u00ff\2\uffff\1\145\1\162"+
        "\2\uffff\1\163\1\145\1\u00ff\1\147\1\146\1\u00ff\1\uffff\1\153\1"+
        "\uffff\1\145\1\uffff\1\142\1\143\1\uffff\1\164\2\uffff\1\172\1\uffff"+
        "\1\u00ff\2\uffff\1\167\1\162\1\155\1\u00ff\1\uffff\1\164\1\u00ff"+
        "\1\uffff\1\u00ff\1\162\1\u00ff\1\uffff\1\157\1\u00ff\1\156\1\141"+
        "\3\uffff\1\u00ff\1\uffff\1\162\2\uffff\1\u00ff\1\uffff\1\157\1\156"+
        "\1\u00ff\1\uffff\1\156\1\uffff\1\156\1\154\1\u00ff\1\uffff\1\157"+
        "\1\u00ff\1\156\1\164\2\uffff\1\u00ff\1\143\1\151\1\150\1\156\2\uffff"+
        "\1\u00ff\1\uffff\1\164\1\u00ff\1\uffff\1\162\1\151\1\171\1\156\1"+
        "\145\1\u00ff\3\uffff\1\u00ff\1\uffff\4\u00ff\1\uffff\1\145\1\u00ff"+
        "\1\uffff\2\u00ff\1\154\1\145\1\u00ff\1\141\1\uffff\1\151\1\171\1"+
        "\160\1\uffff\1\164\2\uffff\1\171\1\uffff\1\146\1\uffff\1\u00ff\1"+
        "\164\1\uffff\1\u00ff\1\uffff\1\156\1\164\1\uffff\1\u00ff\1\144\1"+
        "\145\1\uffff\1\162\1\uffff\1\164\1\145\1\uffff\1\164\1\143\2\u00ff"+
        "\1\uffff\1\u00ff\1\uffff\1\u00ff\1\166\3\u00ff\6\uffff\1\163\3\uffff"+
        "\1\145\1\163\1\uffff\1\142\1\164\2\u00ff\1\145\2\u00ff\1\uffff\1"+
        "\151\1\uffff\2\u00ff\1\uffff\1\151\2\u00ff\1\157\2\u00ff\1\163\4"+
        "\uffff\1\145\3\uffff\3\u00ff\1\154\1\150\2\uffff\1\144\2\uffff\1"+
        "\157\2\uffff\1\u00ff\1\156\2\uffff\1\146\2\uffff\2\u00ff\3\uffff"+
        "\1\145\2\u00ff\1\156\1\uffff\1\147\1\u00ff\2\uffff\1\u00ff\2\uffff"+
        "\2\u00ff\4\uffff";
    static final String DFA22_acceptS =
        "\32\uffff\1\u00ea\1\u00eb\2\u00ec\1\u00ed\1\uffff\1\u00ef\1\u00f0"+
        "\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\uffff\1\u00f7\1\u00f8"+
        "\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100"+
        "\1\u0101\3\u0102\1\u0103\1\u00eb\147\uffff\1\u00ea\1\u00ec\1\u00ed"+
        "\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5"+
        "\1\u0102\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc"+
        "\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\6\uffff\1\11\2\uffff\1"+
        "\14\5\uffff\1\23\76\uffff\1\140\6\uffff\1\153\31\uffff\1\u0083\3"+
        "\uffff\1\u008d\2\uffff\1\u008a\4\uffff\1\u0089\41\uffff\1\u00bc"+
        "\26\uffff\1\10\1\7\1\16\1\1\2\uffff\1\12\1\uffff\1\5\1\uffff\1\4"+
        "\2\uffff\1\21\42\uffff\1\63\7\uffff\1\61\6\uffff\1\106\14\uffff"+
        "\1\122\10\uffff\1\126\4\uffff\1\u00d5\14\uffff\1\157\14\uffff\1"+
        "\171\1\uffff\1\172\10\uffff\1\u0084\2\uffff\1\u008f\17\uffff\1\u009f"+
        "\15\uffff\1\u00b0\7\uffff\1\u00b4\1\u00b6\44\uffff\1\u00db\4\uffff"+
        "\1\22\1\uffff\1\u00e1\1\uffff\1\27\1\26\1\uffff\1\31\5\uffff\1\55"+
        "\20\uffff\1\73\10\uffff\1\u00d8\1\60\3\uffff\1\77\1\uffff\1\104"+
        "\1\uffff\1\u00dd\6\uffff\1\105\1\uffff\1\124\4\uffff\1\125\1\u00da"+
        "\4\uffff\1\132\1\135\3\uffff\1\152\12\uffff\1\156\1\uffff\1\163"+
        "\1\161\2\uffff\1\160\1\uffff\1\u00df\1\166\2\uffff\1\176\4\uffff"+
        "\1\177\4\uffff\1\u0085\5\uffff\1\u008b\16\uffff\1\u00a8\1\uffff"+
        "\1\u009c\1\u009d\21\uffff\1\u00b1\1\u00b2\1\uffff\1\u00e3\1\u00bd"+
        "\1\u00b9\1\u00ba\2\uffff\1\u00be\2\uffff\1\u00c6\12\uffff\1\u00cb"+
        "\1\u00ce\1\u00cc\2\uffff\1\u00cf\1\u00d1\1\u00d2\4\uffff\1\6\1\uffff"+
        "\1\u00dc\2\uffff\1\17\4\uffff\1\33\10\uffff\1\52\5\uffff\1\54\1"+
        "\35\26\uffff\1\u00d6\1\121\1\uffff\1\120\1\117\1\uffff\1\130\1\131"+
        "\1\133\7\uffff\1\143\1\144\7\uffff\1\165\1\167\1\175\5\uffff\1\u0080"+
        "\1\u00e2\4\uffff\1\u00e5\1\uffff\1\u008e\1\uffff\1\u0090\4\uffff"+
        "\1\u0097\4\uffff\1\u009a\10\uffff\1\u00a5\1\u009b\1\u00de\1\u00a9"+
        "\6\uffff\1\u00b3\4\uffff\1\u00b7\1\u00c7\1\u00c5\2\uffff\1\u00c0"+
        "\6\uffff\1\u00c8\1\uffff\1\u00cd\1\u00d0\3\uffff\1\3\1\uffff\1\u00e4"+
        "\6\uffff\1\57\10\uffff\1\41\1\42\1\uffff\1\53\3\uffff\1\71\6\uffff"+
        "\1\72\1\103\1\u00d7\2\uffff\1\100\2\uffff\1\111\4\uffff\1\114\1"+
        "\110\1\uffff\1\127\1\134\4\uffff\1\146\3\uffff\1\154\2\uffff\1\164"+
        "\1\uffff\1\174\1\uffff\1\173\3\uffff\1\u0088\1\u0087\2\uffff\1\u0091"+
        "\1\u008c\6\uffff\1\u0099\1\uffff\1\u00a7\1\uffff\1\u00a0\2\uffff"+
        "\1\u00a4\1\uffff\1\u00ab\1\u00aa\1\uffff\1\u00ad\1\uffff\1\u00ac"+
        "\1\u00e0\4\uffff\1\u00c1\2\uffff\1\u00c4\3\uffff\1\u00c9\4\uffff"+
        "\1\20\1\u00d9\1\24\1\uffff\1\30\1\uffff\1\34\1\56\1\uffff\1\43\3"+
        "\uffff\1\50\1\uffff\1\37\3\uffff\1\66\4\uffff\1\65\1\64\5\uffff"+
        "\1\113\1\116\1\uffff\1\123\2\uffff\1\147\6\uffff\1\162\1\170\1\u0082"+
        "\1\uffff\1\u00e9\4\uffff\1\u0096\2\uffff\1\u0095\6\uffff\1\u00af"+
        "\3\uffff\1\u00c3\1\uffff\1\u00c2\1\u00ca\1\uffff\1\u00e8\1\uffff"+
        "\1\2\2\uffff\1\25\1\uffff\1\36\2\uffff\1\45\3\uffff\1\70\1\uffff"+
        "\1\74\2\uffff\1\102\4\uffff\1\115\1\uffff\1\151\5\uffff\1\136\1"+
        "\u0081\1\u0086\1\u00e6\1\u0092\1\u0093\1\uffff\1\u0094\1\u00a6\1"+
        "\u00a1\2\uffff\1\u00a3\7\uffff\1\13\1\uffff\1\32\2\uffff\1\40\7"+
        "\uffff\1\107\1\112\1\150\1\141\1\uffff\1\142\1\155\1\137\5\uffff"+
        "\1\u00b8\1\u00bb\1\uffff\1\u00e7\1\u00d4\1\uffff\1\44\1\46\2\uffff"+
        "\1\67\1\75\1\uffff\1\62\1\101\2\uffff\1\u0098\1\u00a2\1\u009e\4"+
        "\uffff\1\47\2\uffff\1\76\1\145\1\uffff\1\u00b5\1\u00bf\2\uffff\1"+
        "\u00d3\1\u00ae\1\15\1\51";
    static final String DFA22_specialS =
        "\1\1\36\uffff\1\0\u0493\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\66\1\63\1\65\2\66\1\64\22\66\1\63\1\66\1\37\2\66\1\40\1"+
            "\41\1\36\1\42\1\43\1\44\1\45\1\46\1\47\1\35\1\50\12\34\1\51"+
            "\1\52\1\53\1\54\1\55\1\56\1\32\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1"+
            "\24\1\25\1\26\1\27\1\33\1\30\1\31\1\60\1\66\1\61\1\66\1\62\1"+
            "\66\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\33\1\30"+
            "\1\31\1\66\1\57\2\66\u0081\33\uff00\66",
            "\1\72\1\75\1\77\7\uffff\1\76\1\uffff\1\70\4\uffff\1\73\1\74"+
            "\1\100\1\71\13\uffff\1\72\1\75\1\77\7\uffff\1\76\1\uffff\1\70"+
            "\4\uffff\1\73\1\74\1\100\1\71",
            "\1\103\3\uffff\1\102\2\uffff\1\105\2\uffff\1\104\11\uffff"+
            "\1\101\13\uffff\1\103\3\uffff\1\102\2\uffff\1\105\2\uffff\1"+
            "\104\11\uffff\1\101",
            "\1\106\6\uffff\1\107\3\uffff\1\113\2\uffff\1\111\2\uffff\1"+
            "\112\2\uffff\1\110\13\uffff\1\106\6\uffff\1\107\3\uffff\1\113"+
            "\2\uffff\1\111\2\uffff\1\112\2\uffff\1\110",
            "\1\116\3\uffff\1\114\3\uffff\1\117\5\uffff\1\115\2\uffff\1"+
            "\120\16\uffff\1\116\3\uffff\1\114\3\uffff\1\117\5\uffff\1\115"+
            "\2\uffff\1\120",
            "\1\124\1\uffff\1\121\4\uffff\1\123\4\uffff\1\122\23\uffff"+
            "\1\124\1\uffff\1\121\4\uffff\1\123\4\uffff\1\122",
            "\1\132\3\uffff\1\131\3\uffff\1\127\2\uffff\1\125\2\uffff\1"+
            "\130\2\uffff\1\126\2\uffff\1\133\13\uffff\1\132\3\uffff\1\131"+
            "\3\uffff\1\127\2\uffff\1\125\2\uffff\1\130\2\uffff\1\126\2\uffff"+
            "\1\133",
            "\1\137\6\uffff\1\135\5\uffff\1\136\2\uffff\1\134\17\uffff"+
            "\1\137\6\uffff\1\135\5\uffff\1\136\2\uffff\1\134",
            "\1\142\15\uffff\1\141\17\uffff\1\140\1\uffff\1\142\15\uffff"+
            "\1\141",
            "\1\146\10\uffff\1\145\1\143\4\uffff\1\144\20\uffff\1\146\10"+
            "\uffff\1\145\1\143\4\uffff\1\144",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\1\152\3\uffff\1\151\3\uffff\1\154\5\uffff\1\153\21\uffff"+
            "\1\152\3\uffff\1\151\3\uffff\1\154\5\uffff\1\153",
            "\1\156\7\uffff\1\157\5\uffff\1\155\21\uffff\1\156\7\uffff"+
            "\1\157\5\uffff\1\155",
            "\1\160\1\uffff\1\164\13\uffff\1\163\4\uffff\1\161\1\162\1"+
            "\165\12\uffff\1\160\1\uffff\1\164\13\uffff\1\163\4\uffff\1\161"+
            "\1\162\1\165",
            "\1\173\7\uffff\1\167\1\uffff\1\171\1\uffff\1\166\2\uffff\1"+
            "\170\1\172\17\uffff\1\173\7\uffff\1\167\1\uffff\1\171\1\uffff"+
            "\1\166\2\uffff\1\170\1\172",
            "\1\175\20\uffff\1\174\2\uffff\1\176\13\uffff\1\175\20\uffff"+
            "\1\174\2\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0083\3\uffff\1\u0081\3\uffff\1\u0082\5\uffff\1\u0080\21"+
            "\uffff\1\u0083\3\uffff\1\u0081\3\uffff\1\u0082\5\uffff\1\u0080",
            "\1\u0085\1\uffff\1\u0086\2\uffff\1\u0084\1\u008b\5\uffff\1"+
            "\u008c\1\u0087\1\u0089\2\uffff\1\u0088\1\u008a\15\uffff\1\u0085"+
            "\1\uffff\1\u0086\2\uffff\1\u0084\1\u008b\5\uffff\1\u008c\1\u0087"+
            "\1\u0089\2\uffff\1\u0088\1\u008a",
            "\1\u0092\3\uffff\1\u008d\2\uffff\1\u0090\1\u0091\5\uffff\1"+
            "\u008f\2\uffff\1\u008e\6\uffff\1\u0093\7\uffff\1\u0092\3\uffff"+
            "\1\u008d\2\uffff\1\u0090\1\u0091\5\uffff\1\u008f\2\uffff\1\u008e"+
            "\6\uffff\1\u0093",
            "\1\u0095\1\uffff\1\u0096\2\uffff\1\u0094\32\uffff\1\u0095"+
            "\1\uffff\1\u0096\2\uffff\1\u0094",
            "\1\u0097\7\uffff\1\u0098\27\uffff\1\u0097\7\uffff\1\u0098",
            "\1\u009a\1\u0099\5\uffff\1\u009c\2\uffff\1\u009b\25\uffff"+
            "\1\u009a\1\u0099\5\uffff\1\u009c\2\uffff\1\u009b",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a2\1\uffff\2\u00a2\1\uffff\ufff2\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
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
            "\1\u00b7\1\u00b9\24\uffff\1\u00b8\11\uffff\1\u00b7\1\u00b9"+
            "\24\uffff\1\u00b8",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\3\uffff\1\u00bc\33\uffff\1\u00bb\3\uffff\1\u00bc",
            "\12\67\7\uffff\2\67\1\u00bf\17\67\1\u00be\7\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\u00bf\17\67\1\u00be\7\67\4\uffff\u0081\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u00c1\37\uffff\1\u00c1",
            "\1\u00c2\7\uffff\1\u00c3\27\uffff\1\u00c2\7\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\12\67\7\uffff\23\67\1\u00c7\6\67\4\uffff\1\67\1\uffff\23"+
            "\67\1\u00c7\6\67\4\uffff\u0081\67",
            "\1\u00c9\5\uffff\1\u00c8\31\uffff\1\u00c9\5\uffff\1\u00c8",
            "\1\u00cb\14\uffff\1\u00ca\22\uffff\1\u00cb\14\uffff\1\u00ca",
            "\1\u00cd\4\uffff\1\u00cc\32\uffff\1\u00cd\4\uffff\1\u00cc",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\1\u00d0\36\uffff\1\u00cf\1\u00d0",
            "\1\u00d1\3\uffff\1\u00d2\3\uffff\1\u00d3\27\uffff\1\u00d1"+
            "\3\uffff\1\u00d2\3\uffff\1\u00d3",
            "\1\u00d5\17\uffff\1\u00d4\17\uffff\1\u00d5\17\uffff\1\u00d4",
            "\1\u00d6\12\uffff\1\u00d9\1\u00da\1\u00d7\3\uffff\1\u00db"+
            "\2\uffff\1\u00d8\13\uffff\1\u00d6\12\uffff\1\u00d9\1\u00da\1"+
            "\u00d7\3\uffff\1\u00db\2\uffff\1\u00d8",
            "\1\u00dc\11\uffff\1\u00dd\25\uffff\1\u00dc\11\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00e1\1\uffff\1\u00e2\2\uffff\1\u00df\5\uffff\1\u00e3\6"+
            "\uffff\1\u00e0\15\uffff\1\u00e1\1\uffff\1\u00e2\2\uffff\1\u00df"+
            "\5\uffff\1\u00e3\6\uffff\1\u00e0",
            "\1\u00e4\7\uffff\1\u00e5\27\uffff\1\u00e4\7\uffff\1\u00e5",
            "\1\u00e6\4\uffff\1\u00e7\32\uffff\1\u00e6\4\uffff\1\u00e7",
            "\1\u00eb\4\uffff\1\u00ea\13\uffff\1\u00e9\1\u00e8\15\uffff"+
            "\1\u00eb\4\uffff\1\u00ea\13\uffff\1\u00e9\1\u00e8",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\20\uffff\1\u00ee\16\uffff\1\u00ed\20\uffff\1\u00ee",
            "\1\u00ef\1\uffff\1\u00f0\3\uffff\1\u00f2\12\uffff\1\u00f1"+
            "\16\uffff\1\u00ef\1\uffff\1\u00f0\3\uffff\1\u00f2\12\uffff\1"+
            "\u00f1",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\15\uffff\1\u00ff\21\uffff\1\u00fe\15\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\12\uffff\1\u0102\24\uffff\1\u0101\12\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\12\67\7\uffff\3\67\1\u0107\4\67\1\u010b\4\67\1\u0109\1\67"+
            "\1\u010a\2\67\1\u0108\1\u0106\6\67\4\uffff\1\67\1\uffff\3\67"+
            "\1\u0107\4\67\1\u010b\4\67\1\u0109\1\67\1\u010a\2\67\1\u0108"+
            "\1\u0106\6\67\4\uffff\u0081\67",
            "\12\67\7\uffff\13\67\1\u010e\2\67\1\u010d\13\67\4\uffff\1"+
            "\67\1\uffff\13\67\1\u010e\2\67\1\u010d\13\67\4\uffff\u0081\67",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0115\4\uffff\1\u0114\7\uffff\1\u0113\7\uffff\1\u0116\12"+
            "\uffff\1\u0115\4\uffff\1\u0114\7\uffff\1\u0113\7\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\12\uffff\1\u0119\24\uffff\1\u0118\12\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011c\11\uffff\1\u011b\3\uffff\1\u011d\21\uffff\1\u011c"+
            "\11\uffff\1\u011b\3\uffff\1\u011d",
            "\1\u011f\7\uffff\1\u011e\27\uffff\1\u011f\7\uffff\1\u011e",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0122\6\uffff\1\u0121\30\uffff\1\u0122\6\uffff\1\u0121",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0125\1\u0124\36\uffff\1\u0125\1\u0124",
            "\12\67\7\uffff\23\67\1\u0127\6\67\4\uffff\1\67\1\uffff\23"+
            "\67\1\u0127\6\67\4\uffff\u0081\67",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\12\67\7\uffff\3\67\1\u012c\10\67\1\u012b\15\67\4\uffff\1"+
            "\67\1\uffff\3\67\1\u012c\10\67\1\u012b\15\67\4\uffff\u0081\67",
            "\12\67\7\uffff\13\67\1\u012e\16\67\4\uffff\1\67\1\uffff\13"+
            "\67\1\u012e\16\67\4\uffff\u0081\67",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\12\uffff\1\u0138\24\uffff\1\u0137\12\uffff\1\u0138",
            "\1\u013a\4\uffff\1\u013c\5\uffff\1\u0139\3\uffff\1\u013b\2"+
            "\uffff\1\u013e\2\uffff\1\u013d\12\uffff\1\u013a\4\uffff\1\u013c"+
            "\5\uffff\1\u0139\3\uffff\1\u013b\2\uffff\1\u013e\2\uffff\1\u013d",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\6\uffff\1\u0144\11\uffff\1\u0143\16\uffff\1\u0142"+
            "\6\uffff\1\u0144\11\uffff\1\u0143",
            "\1\u0149\10\uffff\1\u0147\5\uffff\1\u0146\1\u0148\1\u0145"+
            "\16\uffff\1\u0149\10\uffff\1\u0147\5\uffff\1\u0146\1\u0148\1"+
            "\u0145",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014c\20\uffff\1\u014b\16\uffff\1\u014c\20\uffff\1\u014b",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\12\uffff\1\u0152\24\uffff\1\u0151\12\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u015a\3\uffff\1\u015b\3\uffff\1\u0159\27\uffff\1\u015a"+
            "\3\uffff\1\u015b\3\uffff\1\u0159",
            "\1\u015e\5\uffff\1\u015d\1\uffff\1\u015f\2\uffff\1\u015c\24"+
            "\uffff\1\u015e\5\uffff\1\u015d\1\uffff\1\u015f\2\uffff\1\u015c",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0162\5\uffff\1\u0161\31\uffff\1\u0162\5\uffff\1\u0161",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
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
            "\1\u016a\37\uffff\1\u016a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u016f\37\uffff\1\u016f",
            "",
            "\1\u0170\37\uffff\1\u0170",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0172\37\uffff\1\u0172",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0174\37\uffff\1\u0174",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0176\37\uffff\1\u0176",
            "",
            "\1\u0177\37\uffff\1\u0177",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "\1\u017f\1\uffff\1\u0181\16\uffff\1\u0180\16\uffff\1\u017f"+
            "\1\uffff\1\u0181\16\uffff\1\u0180",
            "\1\u0182\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0187\1\u0186\36\uffff\1\u0187\1\u0186",
            "\1\u0188\37\uffff\1\u0188",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018a\4\uffff\1\u018b\1\u018c\1\uffff\1\u018d\27\uffff"+
            "\1\u018a\4\uffff\1\u018b\1\u018c\1\uffff\1\u018d",
            "\1\u018e\37\uffff\1\u018e",
            "\1\u018f\10\uffff\1\u0190\26\uffff\1\u018f\10\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0193\37\uffff\1\u0193",
            "\1\u0194\37\uffff\1\u0194",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0197\3\uffff\1\u0196\3\uffff\1\u0198\27\uffff\1\u0197"+
            "\3\uffff\1\u0196\3\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\12\67\7\uffff\10\67\1\u019d\2\67\1\u019c\16\67\4\uffff\1"+
            "\67\1\uffff\10\67\1\u019d\2\67\1\u019c\16\67\4\uffff\u0081\67",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "\1\u01a2\3\uffff\1\u01a1\33\uffff\1\u01a2\3\uffff\1\u01a1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01a5\20\uffff\1\u01a4\16\uffff\1\u01a5\20\uffff\1\u01a4",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\u01a8\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "\12\67\7\uffff\22\67\1\u01ab\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u01ab\7\67\4\uffff\u0081\67",
            "\1\u01ac\37\uffff\1\u01ac",
            "\1\u01ad\37\uffff\1\u01ad",
            "\1\u01ae\37\uffff\1\u01ae",
            "\1\u01b0\14\uffff\1\u01af\22\uffff\1\u01b0\14\uffff\1\u01af",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b2\37\uffff\1\u01b2",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\u01b6\37\uffff\1\u01b6",
            "\12\67\7\uffff\4\67\1\u01b8\25\67\4\uffff\1\67\1\uffff\4\67"+
            "\1\u01b8\25\67\4\uffff\u0081\67",
            "\1\u01b9\37\uffff\1\u01b9",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\u01bc\37\uffff\1\u01bc",
            "\1\u01bd\37\uffff\1\u01bd",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "\1\u01c4\37\uffff\1\u01c4",
            "",
            "\12\67\7\uffff\4\67\1\u01c6\11\67\1\u01c7\13\67\4\uffff\1"+
            "\67\1\uffff\4\67\1\u01c6\11\67\1\u01c7\13\67\4\uffff\u0081\67",
            "\1\u01c8\37\uffff\1\u01c8",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "\1\u01d1\37\uffff\1\u01d1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "\1\u01d6\1\uffff\1\u01d5\35\uffff\1\u01d6\1\uffff\1\u01d5",
            "\1\u01d7\37\uffff\1\u01d7",
            "\1\u01d8\37\uffff\1\u01d8",
            "\1\u01d9\37\uffff\1\u01d9",
            "\1\u01da\37\uffff\1\u01da",
            "\1\u01db\37\uffff\1\u01db",
            "\1\u01dc\37\uffff\1\u01dc",
            "\1\u01dd\37\uffff\1\u01dd",
            "\1\u01de\37\uffff\1\u01de",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01e0\37\uffff\1\u01e0",
            "\12\67\7\uffff\24\67\1\u01e2\5\67\4\uffff\1\67\1\uffff\24"+
            "\67\1\u01e2\5\67\4\uffff\u0081\67",
            "\1\u01e4\13\uffff\1\u01e3\23\uffff\1\u01e4\13\uffff\1\u01e3",
            "\1\u01e5\37\uffff\1\u01e5",
            "\1\u01e6\37\uffff\1\u01e6",
            "\1\u01e8\2\uffff\1\u01e7\34\uffff\1\u01e8\2\uffff\1\u01e7",
            "\1\u01e9\37\uffff\1\u01e9",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01eb\37\uffff\1\u01eb",
            "\1\u01ec\37\uffff\1\u01ec",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u01ee\37\uffff\1\u01ee",
            "",
            "\1\u01ef\37\uffff\1\u01ef",
            "\1\u01f1\12\uffff\1\u01f0\24\uffff\1\u01f1\12\uffff\1\u01f0",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "",
            "\1\u01f4\1\uffff\1\u01f5\6\uffff\1\u01f6\26\uffff\1\u01f4"+
            "\1\uffff\1\u01f5\6\uffff\1\u01f6",
            "\1\u01f7\16\uffff\1\u01f8\20\uffff\1\u01f7\16\uffff\1\u01f8",
            "\1\u01f9\37\uffff\1\u01f9",
            "\1\u01fa\37\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "\1\u01fc\37\uffff\1\u01fc",
            "\12\67\7\uffff\1\u01fe\31\67\4\uffff\1\67\1\uffff\1\u01fe"+
            "\31\67\4\uffff\u0081\67",
            "\1\u01ff\7\uffff\1\u0200\27\uffff\1\u01ff\7\uffff\1\u0200",
            "\1\u0201\37\uffff\1\u0201",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "\1\u0204\37\uffff\1\u0204",
            "\1\u0205\37\uffff\1\u0205",
            "\1\u0206\37\uffff\1\u0206",
            "\1\u0207\37\uffff\1\u0207",
            "\1\u0208\37\uffff\1\u0208",
            "\1\u0209\37\uffff\1\u0209",
            "\1\u020a\37\uffff\1\u020a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u020c\37\uffff\1\u020c",
            "\1\u020d\37\uffff\1\u020d",
            "\1\u020e\37\uffff\1\u020e",
            "\1\u020f\37\uffff\1\u020f",
            "\1\u0210\37\uffff\1\u0210",
            "\1\u0211\37\uffff\1\u0211",
            "\1\u0212\37\uffff\1\u0212",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0215\37\uffff\1\u0215",
            "\1\u0216\37\uffff\1\u0216",
            "\1\u0217\37\uffff\1\u0217",
            "\1\u0218\37\uffff\1\u0218",
            "\1\u0219\37\uffff\1\u0219",
            "",
            "\1\u021a\37\uffff\1\u021a",
            "\1\u021b\37\uffff\1\u021b",
            "\1\u021c\37\uffff\1\u021c",
            "\1\u021d\37\uffff\1\u021d",
            "\1\u021e\37\uffff\1\u021e",
            "\1\u021f\37\uffff\1\u021f",
            "\1\u0220\37\uffff\1\u0220",
            "\1\u0221\37\uffff\1\u0221",
            "\1\u0223\1\uffff\1\u0222\35\uffff\1\u0223\1\uffff\1\u0222",
            "\1\u0224\37\uffff\1\u0224",
            "\1\u0225\37\uffff\1\u0225",
            "\1\u0226\37\uffff\1\u0226",
            "\1\u0228\1\u0229\25\uffff\1\u0227\10\uffff\1\u0228\1\u0229"+
            "\25\uffff\1\u0227",
            "\1\u022a\37\uffff\1\u022a",
            "\1\u022b\37\uffff\1\u022b",
            "\1\u022c\37\uffff\1\u022c",
            "\1\u022d\3\uffff\1\u022e\33\uffff\1\u022d\3\uffff\1\u022e",
            "\1\u022f\37\uffff\1\u022f",
            "\1\u0230\37\uffff\1\u0230",
            "\1\u0231\37\uffff\1\u0231",
            "\1\u0232\37\uffff\1\u0232",
            "\1\u0233\37\uffff\1\u0233",
            "",
            "",
            "",
            "",
            "\1\u0234\37\uffff\1\u0234",
            "\1\u0235\37\uffff\1\u0235",
            "",
            "\1\u0236\37\uffff\1\u0236",
            "",
            "\1\u0237\37\uffff\1\u0237",
            "",
            "\1\u0238\37\uffff\1\u0238",
            "\12\67\7\uffff\22\67\1\u023a\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u023a\7\67\4\uffff\u0081\67",
            "",
            "\1\u023b\37\uffff\1\u023b",
            "\1\u023c\37\uffff\1\u023c",
            "\1\u023d\37\uffff\1\u023d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u023f\37\uffff\1\u023f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0241\37\uffff\1\u0241",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0244\37\uffff\1\u0244",
            "\12\67\7\uffff\1\u0246\31\67\4\uffff\1\67\1\uffff\1\u0246"+
            "\31\67\4\uffff\u0081\67",
            "\1\u0247\37\uffff\1\u0247",
            "\1\u0248\37\uffff\1\u0248",
            "\1\u0249\37\uffff\1\u0249",
            "\1\u024a\37\uffff\1\u024a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u024c\37\uffff\1\u024c",
            "\1\u024d\37\uffff\1\u024d",
            "\1\u024e\37\uffff\1\u024e",
            "\1\u024f\37\uffff\1\u024f",
            "\1\u0250\37\uffff\1\u0250",
            "\1\u0251\37\uffff\1\u0251",
            "\1\u0252\37\uffff\1\u0252",
            "\1\u0253\37\uffff\1\u0253",
            "\1\u0254\37\uffff\1\u0254",
            "\1\u0255\37\uffff\1\u0255",
            "\1\u0256\37\uffff\1\u0256",
            "\1\u0257\37\uffff\1\u0257",
            "\1\u0258\37\uffff\1\u0258",
            "\1\u0259\37\uffff\1\u0259",
            "\1\u025a\37\uffff\1\u025a",
            "\1\u025b\37\uffff\1\u025b",
            "\12\67\7\uffff\4\67\1\u025e\14\67\1\u025d\10\67\4\uffff\1"+
            "\67\1\uffff\4\67\1\u025e\14\67\1\u025d\10\67\4\uffff\u0081\67",
            "\1\u025f\37\uffff\1\u025f",
            "",
            "\1\u0260\37\uffff\1\u0260",
            "\1\u0261\37\uffff\1\u0261",
            "\1\u0262\37\uffff\1\u0262",
            "\1\u0263\37\uffff\1\u0263",
            "\1\u0264\37\uffff\1\u0264",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0267\37\uffff\1\u0267",
            "\1\u0268\37\uffff\1\u0268",
            "\1\u0269\37\uffff\1\u0269",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u026b\37\uffff\1\u026b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u026d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u026f\37\uffff\1\u026f",
            "\1\u0270\37\uffff\1\u0270",
            "\1\u0271\37\uffff\1\u0271",
            "\1\u0272\37\uffff\1\u0272",
            "\1\u0273\37\uffff\1\u0273",
            "\1\u0274\37\uffff\1\u0274",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0276\37\uffff\1\u0276",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0278\37\uffff\1\u0278",
            "",
            "\1\u0279\37\uffff\1\u0279",
            "\1\u027a\37\uffff\1\u027a",
            "\1\u027b\37\uffff\1\u027b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u027e\37\uffff\1\u027e",
            "\1\u027f\37\uffff\1\u027f",
            "\1\u0280\37\uffff\1\u0280",
            "",
            "\1\u0281\37\uffff\1\u0281",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0284\37\uffff\1\u0284",
            "",
            "\1\u0286\12\uffff\1\u0285\24\uffff\1\u0286\12\uffff\1\u0285",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0288\37\uffff\1\u0288",
            "\1\u028a\3\uffff\1\u0289\33\uffff\1\u028a\3\uffff\1\u0289",
            "\1\u028b\37\uffff\1\u028b",
            "\1\u028c\37\uffff\1\u028c",
            "\1\u028d\37\uffff\1\u028d",
            "\1\u028e\37\uffff\1\u028e",
            "\1\u028f\37\uffff\1\u028f",
            "\1\u0290\37\uffff\1\u0290",
            "\1\u0291\37\uffff\1\u0291",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0293\37\uffff\1\u0293",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0296\37\uffff\1\u0296",
            "\1\u0297\37\uffff\1\u0297",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0299\37\uffff\1\u0299",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u029c\37\uffff\1\u029c",
            "\1\u029d\37\uffff\1\u029d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u029f\37\uffff\1\u029f",
            "",
            "\1\u02a0\37\uffff\1\u02a0",
            "\1\u02a1\37\uffff\1\u02a1",
            "\1\u02a2\37\uffff\1\u02a2",
            "\12\67\7\uffff\22\67\1\u02a4\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u02a4\7\67\4\uffff\u0081\67",
            "\1\u02a5\37\uffff\1\u02a5",
            "\1\u02a6\37\uffff\1\u02a6",
            "\1\u02a7\37\uffff\1\u02a7",
            "\12\67\7\uffff\1\u02aa\7\67\1\u02a9\21\67\4\uffff\1\67\1\uffff"+
            "\1\u02aa\7\67\1\u02a9\21\67\4\uffff\u0081\67",
            "",
            "\1\u02ab\37\uffff\1\u02ab",
            "\1\u02ac\37\uffff\1\u02ac",
            "",
            "\1\u02ad\37\uffff\1\u02ad",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02af\37\uffff\1\u02af",
            "\1\u02b0\37\uffff\1\u02b0",
            "\1\u02b1\37\uffff\1\u02b1",
            "\1\u02b2\5\uffff\1\u02b3\31\uffff\1\u02b2\5\uffff\1\u02b3",
            "\1\u02b4\37\uffff\1\u02b4",
            "\1\u02b5\37\uffff\1\u02b5",
            "\1\u02b6\37\uffff\1\u02b6",
            "\1\u02b7\37\uffff\1\u02b7",
            "\1\u02b8\37\uffff\1\u02b8",
            "\1\u02b9\37\uffff\1\u02b9",
            "\1\u02ba\37\uffff\1\u02ba",
            "\1\u02bb\22\uffff\1\u02bc\14\uffff\1\u02bb\22\uffff\1\u02bc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u02be\37\uffff\1\u02be",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02c1\37\uffff\1\u02c1",
            "\1\u02c2\37\uffff\1\u02c2",
            "\1\u02c3\37\uffff\1\u02c3",
            "\1\u02c4\37\uffff\1\u02c4",
            "\1\u02c5\37\uffff\1\u02c5",
            "\1\u02c6\37\uffff\1\u02c6",
            "\1\u02c7\37\uffff\1\u02c7",
            "\1\u02c8\37\uffff\1\u02c8",
            "\1\u02c9\37\uffff\1\u02c9",
            "\1\u02ca\37\uffff\1\u02ca",
            "",
            "\1\u02cb\37\uffff\1\u02cb",
            "\1\u02cc\37\uffff\1\u02cc",
            "\1\u02cd\37\uffff\1\u02cd",
            "\1\u02ce\37\uffff\1\u02ce",
            "\1\u02cf\37\uffff\1\u02cf",
            "\1\u02d0\37\uffff\1\u02d0",
            "\1\u02d1\37\uffff\1\u02d1",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02d4\37\uffff\1\u02d4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\22\67\1\u02d9\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u02d9\7\67\4\uffff\u0081\67",
            "\1\u02da\37\uffff\1\u02da",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02dc\37\uffff\1\u02dc",
            "\1\u02dd\37\uffff\1\u02dd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02df\37\uffff\1\u02df",
            "\1\u02e0\37\uffff\1\u02e0",
            "\1\u02e1\37\uffff\1\u02e1",
            "\1\u02e2\37\uffff\1\u02e2",
            "\1\u02e3\37\uffff\1\u02e3",
            "\1\u02e4\37\uffff\1\u02e4",
            "\1\u02e5\37\uffff\1\u02e5",
            "\1\u02e6\37\uffff\1\u02e6",
            "\1\u02e7\37\uffff\1\u02e7",
            "\1\u02e8\37\uffff\1\u02e8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02ec\37\uffff\1\u02ec",
            "\1\u02ed\37\uffff\1\u02ed",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02f1\37\uffff\1\u02f1",
            "\1\u02f2\37\uffff\1\u02f2",
            "\1\u02f3\37\uffff\1\u02f3",
            "\1\u02f4\37\uffff\1\u02f4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02f6\37\uffff\1\u02f6",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u02f8\37\uffff\1\u02f8",
            "\1\u02f9\37\uffff\1\u02f9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u02fb\37\uffff\1\u02fb",
            "",
            "\1\u02fc\37\uffff\1\u02fc",
            "",
            "",
            "\1\u02fd\37\uffff\1\u02fd",
            "",
            "\1\u02fe\37\uffff\1\u02fe",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0300\37\uffff\1\u0300",
            "\1\u0301\37\uffff\1\u0301",
            "\1\u0302\37\uffff\1\u0302",
            "",
            "\1\u0303\37\uffff\1\u0303",
            "\1\u0304\37\uffff\1\u0304",
            "\1\u0305\37\uffff\1\u0305",
            "\1\u0306\37\uffff\1\u0306",
            "\1\u0307\37\uffff\1\u0307",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0309\37\uffff\1\u0309",
            "\1\u030a\37\uffff\1\u030a",
            "\1\u030b\37\uffff\1\u030b",
            "\1\u030c\37\uffff\1\u030c",
            "\1\u030d\37\uffff\1\u030d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0310\37\uffff\1\u0310",
            "\1\u0311\37\uffff\1\u0311",
            "\1\u0312\37\uffff\1\u0312",
            "",
            "\1\u0313\37\uffff\1\u0313",
            "\1\u0314\37\uffff\1\u0314",
            "\1\u0315\37\uffff\1\u0315",
            "\1\u0316\37\uffff\1\u0316",
            "\1\u0317\37\uffff\1\u0317",
            "\1\u0318\37\uffff\1\u0318",
            "\1\u0319\37\uffff\1\u0319",
            "\1\u031a\37\uffff\1\u031a",
            "",
            "",
            "\1\u031b\37\uffff\1\u031b",
            "\1\u031c\37\uffff\1\u031c",
            "\1\u031d\37\uffff\1\u031d",
            "",
            "\1\u031e\37\uffff\1\u031e",
            "",
            "\1\u031f\37\uffff\1\u031f",
            "",
            "\1\u0320\37\uffff\1\u0320",
            "\1\u0321\37\uffff\1\u0321",
            "\1\u0322\37\uffff\1\u0322",
            "\1\u0323\37\uffff\1\u0323",
            "\1\u0324\37\uffff\1\u0324",
            "\1\u0325\37\uffff\1\u0325",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0328\37\uffff\1\u0328",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u032b\37\uffff\1\u032b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u032f\37\uffff\1\u032f",
            "\1\u0330\2\uffff\1\u0331\34\uffff\1\u0330\2\uffff\1\u0331",
            "\1\u0332\37\uffff\1\u0332",
            "",
            "\1\u0333\37\uffff\1\u0333",
            "\1\u0334\37\uffff\1\u0334",
            "\1\u0335\37\uffff\1\u0335",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0338\37\uffff\1\u0338",
            "\1\u0339\37\uffff\1\u0339",
            "\1\u033a\37\uffff\1\u033a",
            "\1\u033b\37\uffff\1\u033b",
            "\1\u033c\37\uffff\1\u033c",
            "",
            "\1\u033d\37\uffff\1\u033d",
            "",
            "",
            "\1\u033e\37\uffff\1\u033e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0342\37\uffff\1\u0342",
            "",
            "\1\u0343\37\uffff\1\u0343",
            "\1\u0344\37\uffff\1\u0344",
            "\1\u0345\37\uffff\1\u0345",
            "\1\u0346\37\uffff\1\u0346",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0349\37\uffff\1\u0349",
            "\1\u034a\37\uffff\1\u034a",
            "",
            "\1\u034b\37\uffff\1\u034b",
            "\1\u034c\37\uffff\1\u034c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u034e\37\uffff\1\u034e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0350\37\uffff\1\u0350",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0352\37\uffff\1\u0352",
            "\1\u0353\37\uffff\1\u0353",
            "\1\u0354\37\uffff\1\u0354",
            "\1\u0355\37\uffff\1\u0355",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0357\37\uffff\1\u0357",
            "\1\u0358\37\uffff\1\u0358",
            "\1\u0359\37\uffff\1\u0359",
            "\1\u035a\37\uffff\1\u035a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u035c\37\uffff\1\u035c",
            "\1\u035d\37\uffff\1\u035d",
            "",
            "\1\u035f\3\uffff\1\u035e\33\uffff\1\u035f\3\uffff\1\u035e",
            "",
            "",
            "\1\u0360\37\uffff\1\u0360",
            "\1\u0361\37\uffff\1\u0361",
            "\1\u0362\37\uffff\1\u0362",
            "\1\u0363\37\uffff\1\u0363",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0368\37\uffff\1\u0368",
            "\1\u0369\37\uffff\1\u0369",
            "\1\u036a\37\uffff\1\u036a",
            "\1\u036b\37\uffff\1\u036b",
            "\1\u036c\37\uffff\1\u036c",
            "\1\u036d\37\uffff\1\u036d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u036f\37\uffff\1\u036f",
            "\1\u0370\37\uffff\1\u0370",
            "",
            "",
            "\1\u0371\37\uffff\1\u0371",
            "",
            "",
            "",
            "",
            "\1\u0372\37\uffff\1\u0372",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0376\37\uffff\1\u0376",
            "\1\u0377\37\uffff\1\u0377",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0379\37\uffff\1\u0379",
            "\1\u037a\37\uffff\1\u037a",
            "\1\u037b\37\uffff\1\u037b",
            "\1\u037c\37\uffff\1\u037c",
            "\1\u037d\37\uffff\1\u037d",
            "\1\u037e\37\uffff\1\u037e",
            "\12\67\7\uffff\22\67\1\u0380\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u0380\7\67\4\uffff\u0081\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "\1\u0383\37\uffff\1\u0383",
            "\1\u0384\37\uffff\1\u0384",
            "\1\u0385\37\uffff\1\u0385",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0387\37\uffff\1\u0387",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0389\37\uffff\1\u0389",
            "",
            "\1\u038a\37\uffff\1\u038a",
            "\1\u038b\37\uffff\1\u038b",
            "\1\u038c\37\uffff\1\u038c",
            "\1\u038d\37\uffff\1\u038d",
            "",
            "\1\u038e\37\uffff\1\u038e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0390\37\uffff\1\u0390",
            "\1\u0391\37\uffff\1\u0391",
            "\1\u0392\37\uffff\1\u0392",
            "\1\u0393\37\uffff\1\u0393",
            "\1\u0394\37\uffff\1\u0394",
            "\1\u0395\37\uffff\1\u0395",
            "",
            "\1\u0397\3\uffff\1\u0396\33\uffff\1\u0397\3\uffff\1\u0396",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u039a\37\uffff\1\u039a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u039c\3\uffff\1\u039d\33\uffff\1\u039c\3\uffff\1\u039d",
            "\1\u039e\37\uffff\1\u039e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03a1\15\uffff\1\u03a0\21\uffff\1\u03a1\15\uffff\1\u03a0",
            "\1\u03a2\37\uffff\1\u03a2",
            "\1\u03a3\37\uffff\1\u03a3",
            "\1\u03a4\37\uffff\1\u03a4",
            "\1\u03a5\37\uffff\1\u03a5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03a9\37\uffff\1\u03a9",
            "\1\u03aa\37\uffff\1\u03aa",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03ac\37\uffff\1\u03ac",
            "\1\u03ad\37\uffff\1\u03ad",
            "\12\67\7\uffff\10\67\1\u03af\21\67\4\uffff\1\67\1\uffff\10"+
            "\67\1\u03af\21\67\4\uffff\u0081\67",
            "\1\u03b0\37\uffff\1\u03b0",
            "\1\u03b1\37\uffff\1\u03b1",
            "\1\u03b2\37\uffff\1\u03b2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u03b5\37\uffff\1\u03b5",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03b8\37\uffff\1\u03b8",
            "\1\u03b9\37\uffff\1\u03b9",
            "\1\u03ba\37\uffff\1\u03ba",
            "\1\u03bb\37\uffff\1\u03bb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03bd\37\uffff\1\u03bd",
            "",
            "",
            "\1\u03be\37\uffff\1\u03be",
            "\1\u03bf\37\uffff\1\u03bf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03c1\37\uffff\1\u03c1",
            "\1\u03c2\37\uffff\1\u03c2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03c4\37\uffff\1\u03c4",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03c6\37\uffff\1\u03c6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03c8\37\uffff\1\u03c8",
            "\1\u03c9\37\uffff\1\u03c9",
            "",
            "",
            "\1\u03ca\37\uffff\1\u03ca",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03cd\37\uffff\1\u03cd",
            "",
            "\1\u03ce\37\uffff\1\u03ce",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03d1\37\uffff\1\u03d1",
            "\1\u03d2\37\uffff\1\u03d2",
            "\1\u03d3\37\uffff\1\u03d3",
            "",
            "\1\u03d4\37\uffff\1\u03d4",
            "\1\u03d5\37\uffff\1\u03d5",
            "\1\u03d6\37\uffff\1\u03d6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u03d8\37\uffff\1\u03d8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03da\37\uffff\1\u03da",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03dc\37\uffff\1\u03dc",
            "\1\u03dd\37\uffff\1\u03dd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03df\37\uffff\1\u03df",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03e2\37\uffff\1\u03e2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03e4\37\uffff\1\u03e4",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03e7",
            "\1\u03e8\37\uffff\1\u03e8",
            "\1\u03e9\37\uffff\1\u03e9",
            "",
            "",
            "",
            "\1\u03ea\37\uffff\1\u03ea",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u03ec\37\uffff\1\u03ec",
            "\1\u03ed\37\uffff\1\u03ed",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03ef\37\uffff\1\u03ef",
            "\1\u03f0\37\uffff\1\u03f0",
            "\1\u03f1\37\uffff\1\u03f1",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u03f3\37\uffff\1\u03f3",
            "\1\u03f4\37\uffff\1\u03f4",
            "\1\u03f5\37\uffff\1\u03f5",
            "",
            "\1\u03f6\37\uffff\1\u03f6",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\3\67\1\u03fa\26\67\4\uffff\1\67\1\uffff\3\67"+
            "\1\u03fa\26\67\4\uffff\u0081\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03fc\37\uffff\1\u03fc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u03ff\37\uffff\1\u03ff",
            "\12\67\7\uffff\10\67\1\u0401\21\67\4\uffff\1\67\1\uffff\10"+
            "\67\1\u0401\21\67\4\uffff\u0081\67",
            "\1\u0402\37\uffff\1\u0402",
            "\1\u0403\37\uffff\1\u0403",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0405\37\uffff\1\u0405",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u0407\37\uffff\1\u0407",
            "",
            "\1\u0408\37\uffff\1\u0408",
            "\1\u0409\37\uffff\1\u0409",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u040b\37\uffff\1\u040b",
            "\1\u040c\37\uffff\1\u040c",
            "\1\u040d\37\uffff\1\u040d",
            "\1\u040e\37\uffff\1\u040e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "\1\u0411\37\uffff\1\u0411",
            "\1\u0412\37\uffff\1\u0412",
            "",
            "\1\u0413\37\uffff\1\u0413",
            "\1\u0414\37\uffff\1\u0414",
            "",
            "\1\u0415\37\uffff\1\u0415",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0418\37\uffff\1\u0418",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u041a\37\uffff\1\u041a",
            "\1\u041b\37\uffff\1\u041b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u041d\37\uffff\1\u041d",
            "",
            "\1\u041e\37\uffff\1\u041e",
            "\1\u041f\37\uffff\1\u041f",
            "\1\u0420\37\uffff\1\u0420",
            "",
            "\1\u0421\37\uffff\1\u0421",
            "\1\u0422\37\uffff\1\u0422",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0426\37\uffff\1\u0426",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u0428\37\uffff\1\u0428",
            "\1\u0429\37\uffff\1\u0429",
            "",
            "",
            "\1\u042a\37\uffff\1\u042a",
            "\1\u042b\37\uffff\1\u042b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u042d\37\uffff\1\u042d",
            "\1\u042e\37\uffff\1\u042e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0430\37\uffff\1\u0430",
            "",
            "\1\u0431\37\uffff\1\u0431",
            "",
            "\1\u0432\37\uffff\1\u0432",
            "\1\u0433\37\uffff\1\u0433",
            "",
            "\1\u0434\37\uffff\1\u0434",
            "",
            "",
            "\1\u0435\37\uffff\1\u0435",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\1\u0437\37\uffff\1\u0437",
            "\1\u0438\37\uffff\1\u0438",
            "\1\u0439\37\uffff\1\u0439",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u043b\37\uffff\1\u043b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u043e\37\uffff\1\u043e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0440\37\uffff\1\u0440",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0442\37\uffff\1\u0442",
            "\1\u0443\37\uffff\1\u0443",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0445\37\uffff\1\u0445",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0447\37\uffff\1\u0447",
            "\1\u0448\37\uffff\1\u0448",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u044a\37\uffff\1\u044a",
            "",
            "\1\u044b\37\uffff\1\u044b",
            "\1\u044c\37\uffff\1\u044c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u044e\37\uffff\1\u044e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0450\37\uffff\1\u0450",
            "\1\u0451\37\uffff\1\u0451",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0453\37\uffff\1\u0453",
            "\1\u0454\37\uffff\1\u0454",
            "\1\u0455\37\uffff\1\u0455",
            "\1\u0456\37\uffff\1\u0456",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0458\37\uffff\1\u0458",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u045a\37\uffff\1\u045a",
            "\1\u045b\37\uffff\1\u045b",
            "\1\u045c\37\uffff\1\u045c",
            "\1\u045d\37\uffff\1\u045d",
            "\1\u045e\37\uffff\1\u045e",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0465\37\uffff\1\u0465",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0469\37\uffff\1\u0469",
            "\1\u046a\37\uffff\1\u046a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u046c\37\uffff\1\u046c",
            "",
            "\1\u046d\37\uffff\1\u046d",
            "\1\u046e\37\uffff\1\u046e",
            "\1\u046f\37\uffff\1\u046f",
            "",
            "\1\u0470\37\uffff\1\u0470",
            "",
            "",
            "\1\u0471\37\uffff\1\u0471",
            "",
            "\1\u0472\37\uffff\1\u0472",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0474\37\uffff\1\u0474",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0476\37\uffff\1\u0476",
            "\1\u0477\37\uffff\1\u0477",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0479\37\uffff\1\u0479",
            "\1\u047a\37\uffff\1\u047a",
            "",
            "\1\u047b\37\uffff\1\u047b",
            "",
            "\1\u047c\37\uffff\1\u047c",
            "\1\u047d\37\uffff\1\u047d",
            "",
            "\1\u047e\37\uffff\1\u047e",
            "\1\u047f\37\uffff\1\u047f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0484\37\uffff\1\u0484",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0488\37\uffff\1\u0488",
            "",
            "",
            "",
            "\1\u0489\37\uffff\1\u0489",
            "\1\u048a\37\uffff\1\u048a",
            "",
            "\1\u048b\37\uffff\1\u048b",
            "\1\u048c\37\uffff\1\u048c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u048f\37\uffff\1\u048f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "\1\u0492\37\uffff\1\u0492",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\22\67\1\u0495\7\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u0495\7\67\4\uffff\u0081\67",
            "",
            "\1\u0496\37\uffff\1\u0496",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u0499\37\uffff\1\u0499",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u049c\37\uffff\1\u049c",
            "",
            "",
            "",
            "",
            "\1\u049d\37\uffff\1\u049d",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u04a1\37\uffff\1\u04a1",
            "\1\u04a2\37\uffff\1\u04a2",
            "",
            "",
            "\1\u04a3\37\uffff\1\u04a3",
            "",
            "",
            "\1\u04a4\37\uffff\1\u04a4",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u04a6\37\uffff\1\u04a6",
            "",
            "",
            "\1\u04a7\37\uffff\1\u04a7",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            "\1\u04aa\37\uffff\1\u04aa",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\1\u04ad\37\uffff\1\u04ad",
            "",
            "\1\u04ae\37\uffff\1\u04ae",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67\4\uffff\u0081"+
            "\67",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABO | ABSTABLE | ACTION | ADD | ALL | ALTER | AND | ANY | AS | ASC | ASSERTION | AT | AUTHORIZATION | AVG | BEGIN | BETWEEN | BIT | BOTH | BY | CASCADE | CASCADED | CASE | CAST | CATALOG | CHAR | CHARACTER | CHECK | CHILDOF | CLOSE | COALESCE | COLLATE | COLLATION | COLUMN | COMMIT | CONNECT | CONNECTION | CONTAINS | CONSTRAINT | CONSTRAINTS | CONVERT | CORRESPONDING | COUNT | CREATE | CROSS | CUBE | CURRENT | CURSOR | DATA | DAY | DEALLOCATE | DEC | DECIMAL | DECLARE | DEFAULT | DEFERRABLE | DEFERRED | DEFINE | DELETE | DESC | DESCRIBE | DESCRIPTOR | DIAGNOSTICS | DIFF | DIRECT | DISCONNECT | DISTINCT | DOMAIN | DROP | ELSE | END | ENDS_WITH | ESCAPE | EXCEPT | EXCEPTION | EXECUTE | EXISTS | EXTERNAL | EXTRACT | FALSE | FETCH | FIRST | FOR | FOREIGN | FROM | FULL | GET | GLOBAL | GRANT | GROUP | H_LV | H_AID | HAVING | HOUR | IDENTITY | IMMEDIATE | IN | INDICATOR | INITIALLY | INNER | INPUT | INSENSITIVE | INSERT | INTEGER | INTERSECT | INTERVAL | INTO | IS | ISLEAP | ISOLATION | JOIN | KEY | LAST | LEAF | LEADING | LEFT | LENGTH | LEVEL | LIKE | LOCAL | MAPPING | MAX | MIN | MINUTE | MODULE | MONTH | MORE | NAME | NAMES | NATIONAL | NATURAL | NO | NOT | NULL | NULLABLE | NULLIF | NUMBER | OF | ON | ONLY | OPTION | OR | ORDER | ORM | OUTER | OUTPUT | OVERLAPS | OVERRIDE | PARENTOF | PARTIAL | PRIMARY | PRIOR | PRIVILEGES | PUBLIC | QUERY | RANGE | READ | REAL | REFERENCES | REL | RELATE | RELATIVE | REPEATABLE | RESTRICT | REVOKE | RIGHT | ROLLBACK | ROLLUP | ROWS | SCALE | SCHEMA | SCROLL | SECOND | SELECT | SERIALIZABLE | SESSION | SET | SIZE | SOME | SPACE | SQL | STARTS_WITH | SUM | TABLE | TEMPORARY | THEN | TIME | TIMESTAMP | TO | TRUE | TYPE | UNCOMMITTED | UNION | UNIQUE | UNKNOWN | UNNAMED | UPDATE | USAGE | USER | USING | VALUE | VALUES | VARYING | VIEW | WHEN | WHERE | WITH | WORK | WRITE | YEAR | ZONE | DESCENDANTOF | ANCESTOROF | INT | FLOAT | DOUBLE | DATE | BOOLEAN | GUID | BYTE | BYTES | ENUM | SHORT | LONG | STRING | BLOB | NTEXT | TEXT | BINARY | NCHAR | NVARCHAR | VARBINARY | VARCHAR | NUMERIC | ARGUMENT_ID | REGULAR_ID | EXACT_NUM_LIT | CHAR_STRING | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS_SIGN | COMMA | MINUS_SIGN | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OP | EQUALS_OP | GREATER_THAN_OP | QUESTION_MARK | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | ANY_CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_31 = input.LA(1);

                        s = -1;
                        if ( ((LA22_31>='\u0000' && LA22_31<='\t')||(LA22_31>='\u000B' && LA22_31<='\f')||(LA22_31>='\u000E' && LA22_31<='\uFFFF')) ) {s = 162;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='A'||LA22_0=='a') ) {s = 1;}

                        else if ( (LA22_0=='B'||LA22_0=='b') ) {s = 2;}

                        else if ( (LA22_0=='C'||LA22_0=='c') ) {s = 3;}

                        else if ( (LA22_0=='D'||LA22_0=='d') ) {s = 4;}

                        else if ( (LA22_0=='E'||LA22_0=='e') ) {s = 5;}

                        else if ( (LA22_0=='F'||LA22_0=='f') ) {s = 6;}

                        else if ( (LA22_0=='G'||LA22_0=='g') ) {s = 7;}

                        else if ( (LA22_0=='H'||LA22_0=='h') ) {s = 8;}

                        else if ( (LA22_0=='I'||LA22_0=='i') ) {s = 9;}

                        else if ( (LA22_0=='J'||LA22_0=='j') ) {s = 10;}

                        else if ( (LA22_0=='K'||LA22_0=='k') ) {s = 11;}

                        else if ( (LA22_0=='L'||LA22_0=='l') ) {s = 12;}

                        else if ( (LA22_0=='M'||LA22_0=='m') ) {s = 13;}

                        else if ( (LA22_0=='N'||LA22_0=='n') ) {s = 14;}

                        else if ( (LA22_0=='O'||LA22_0=='o') ) {s = 15;}

                        else if ( (LA22_0=='P'||LA22_0=='p') ) {s = 16;}

                        else if ( (LA22_0=='Q'||LA22_0=='q') ) {s = 17;}

                        else if ( (LA22_0=='R'||LA22_0=='r') ) {s = 18;}

                        else if ( (LA22_0=='S'||LA22_0=='s') ) {s = 19;}

                        else if ( (LA22_0=='T'||LA22_0=='t') ) {s = 20;}

                        else if ( (LA22_0=='U'||LA22_0=='u') ) {s = 21;}

                        else if ( (LA22_0=='V'||LA22_0=='v') ) {s = 22;}

                        else if ( (LA22_0=='W'||LA22_0=='w') ) {s = 23;}

                        else if ( (LA22_0=='Y'||LA22_0=='y') ) {s = 24;}

                        else if ( (LA22_0=='Z'||LA22_0=='z') ) {s = 25;}

                        else if ( (LA22_0=='@') ) {s = 26;}

                        else if ( (LA22_0=='X'||LA22_0=='x'||(LA22_0>='\u007F' && LA22_0<='\u00FF')) ) {s = 27;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 28;}

                        else if ( (LA22_0=='.') ) {s = 29;}

                        else if ( (LA22_0=='\'') ) {s = 30;}

                        else if ( (LA22_0=='\"') ) {s = 31;}

                        else if ( (LA22_0=='%') ) {s = 32;}

                        else if ( (LA22_0=='&') ) {s = 33;}

                        else if ( (LA22_0=='(') ) {s = 34;}

                        else if ( (LA22_0==')') ) {s = 35;}

                        else if ( (LA22_0=='*') ) {s = 36;}

                        else if ( (LA22_0=='+') ) {s = 37;}

                        else if ( (LA22_0==',') ) {s = 38;}

                        else if ( (LA22_0=='-') ) {s = 39;}

                        else if ( (LA22_0=='/') ) {s = 40;}

                        else if ( (LA22_0==':') ) {s = 41;}

                        else if ( (LA22_0==';') ) {s = 42;}

                        else if ( (LA22_0=='<') ) {s = 43;}

                        else if ( (LA22_0=='=') ) {s = 44;}

                        else if ( (LA22_0=='>') ) {s = 45;}

                        else if ( (LA22_0=='?') ) {s = 46;}

                        else if ( (LA22_0=='|') ) {s = 47;}

                        else if ( (LA22_0=='[') ) {s = 48;}

                        else if ( (LA22_0==']') ) {s = 49;}

                        else if ( (LA22_0=='_') ) {s = 50;}

                        else if ( (LA22_0=='\t'||LA22_0==' ') ) {s = 51;}

                        else if ( (LA22_0=='\r') ) {s = 52;}

                        else if ( (LA22_0=='\n') ) {s = 53;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='$')||LA22_0=='\\'||LA22_0=='^'||LA22_0=='`'||LA22_0=='{'||(LA22_0>='}' && LA22_0<='~')||(LA22_0>='\u0100' && LA22_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}