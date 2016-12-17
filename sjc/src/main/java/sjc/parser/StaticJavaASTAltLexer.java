// $ANTLR 3.5 /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g 2013-07-08 19:31:25
 
package sjc.parser;

/**
 * StaticJava lexer.
 *
 * @author robby
 */


import org.antlr.runtime.*;

@SuppressWarnings("all")
public class StaticJavaASTAltLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int ASSIGN_STMT=4;
	public static final int BINARY_EXP=5;
	public static final int BODY=6;
	public static final int BOOLEAN=7;
	public static final int CLASS_DEF=8;
	public static final int COMP_UNIT=9;
	public static final int END=10;
	public static final int FALSE_LIT=11;
	public static final int FIELD_DECL=12;
	public static final int ID=13;
	public static final int IF_STMT=14;
	public static final int INT=15;
	public static final int INT_LIT=16;
	public static final int INVOKE_EXP=17;
	public static final int INVOKE_STMT=18;
	public static final int LIST=19;
	public static final int LOCAL_DECL=20;
	public static final int MAIN_DECL=21;
	public static final int METHOD_DECL=22;
	public static final int NUM_INT=23;
	public static final int OPTION=24;
	public static final int PARAM=25;
	public static final int PAREN_EXP=26;
	public static final int RETURN_STMT=27;
	public static final int TRUE_LIT=28;
	public static final int TYPE=29;
	public static final int UNARY_EXP=30;
	public static final int VAR_REF_EXP=31;
	public static final int VOID=32;
	public static final int WHILE_STMT=33;
	public static final int WS=34;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public StaticJavaASTAltLexer() {} 
	public StaticJavaASTAltLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public StaticJavaASTAltLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:12:7: ( '!' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:12:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:13:7: ( '!=' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:13:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:14:7: ( '%' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:14:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:15:7: ( '&&' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:15:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:16:7: ( '(' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:16:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:17:7: ( ')' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:17:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:18:7: ( '*' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:18:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:19:7: ( '+' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:19:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:20:7: ( ',' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:20:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:21:7: ( '-' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:21:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:22:7: ( '.' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:22:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:23:7: ( '/' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:23:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:24:7: ( ';' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:24:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:25:7: ( '<' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:25:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:26:7: ( '<=' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:26:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:27:7: ( '=' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:27:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:28:7: ( '==' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:28:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:29:7: ( '>' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:29:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:30:7: ( '>=' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:30:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:31:7: ( '[' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:31:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:32:7: ( ']' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:32:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:33:7: ( 'boolean' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:33:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:34:7: ( 'class' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:34:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:35:7: ( 'else' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:35:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:36:7: ( 'false' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:36:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:37:7: ( 'if' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:37:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:38:7: ( 'int' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:38:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:39:7: ( 'public' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:39:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:40:7: ( 'return' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:40:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:41:7: ( 'static' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:41:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:42:7: ( 'true' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:42:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:43:7: ( 'void' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:43:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:44:7: ( 'while' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:44:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:45:7: ( '{' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:45:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:46:7: ( '||' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:46:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:47:7: ( '}' )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:47:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:266:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:266:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:267:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM_INT"
	public final void mNUM_INT() throws RecognitionException {
		try {
			int _type = NUM_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:2: ( ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* ) )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			{
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:6: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:12: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:271:23: ( '0' .. '9' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM_INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:276:2: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:276:4: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ID | NUM_INT | WS )
		int alt4=39;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:112: T__52
				{
				mT__52(); 

				}
				break;
			case 19 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:118: T__53
				{
				mT__53(); 

				}
				break;
			case 20 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:124: T__54
				{
				mT__54(); 

				}
				break;
			case 21 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:130: T__55
				{
				mT__55(); 

				}
				break;
			case 22 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:136: T__56
				{
				mT__56(); 

				}
				break;
			case 23 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:142: T__57
				{
				mT__57(); 

				}
				break;
			case 24 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:148: T__58
				{
				mT__58(); 

				}
				break;
			case 25 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:154: T__59
				{
				mT__59(); 

				}
				break;
			case 26 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:160: T__60
				{
				mT__60(); 

				}
				break;
			case 27 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:166: T__61
				{
				mT__61(); 

				}
				break;
			case 28 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:172: T__62
				{
				mT__62(); 

				}
				break;
			case 29 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:178: T__63
				{
				mT__63(); 

				}
				break;
			case 30 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:184: T__64
				{
				mT__64(); 

				}
				break;
			case 31 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:190: T__65
				{
				mT__65(); 

				}
				break;
			case 32 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:196: T__66
				{
				mT__66(); 

				}
				break;
			case 33 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:202: T__67
				{
				mT__67(); 

				}
				break;
			case 34 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:208: T__68
				{
				mT__68(); 

				}
				break;
			case 35 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:214: T__69
				{
				mT__69(); 

				}
				break;
			case 36 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:220: T__70
				{
				mT__70(); 

				}
				break;
			case 37 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:226: ID
				{
				mID(); 

				}
				break;
			case 38 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:229: NUM_INT
				{
				mNUM_INT(); 

				}
				break;
			case 39 :
				// /Users/robby/Workspaces/SireumV2/compiler-sjc/src-sjc/sjc/parser/StaticJavaASTAlt.g:1:237: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\1\44\13\uffff\1\46\1\50\1\52\2\uffff\13\40\16\uffff\4\40\1\73"+
		"\13\40\1\uffff\1\107\10\40\1\120\1\40\1\uffff\3\40\1\125\1\126\2\40\1"+
		"\131\1\uffff\1\132\3\40\2\uffff\1\136\1\40\2\uffff\1\140\1\141\1\142\1"+
		"\uffff\1\143\4\uffff";
	static final String DFA4_eofS =
		"\144\uffff";
	static final String DFA4_minS =
		"\1\11\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\146\1\165\1\145\1"+
		"\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154\1\44\1\164\1\142"+
		"\1\164\1\141\1\165\2\151\1\154\1\163\1\145\1\163\1\uffff\1\44\1\154\1"+
		"\165\1\164\1\145\1\144\1\154\1\145\1\163\1\44\1\145\1\uffff\1\151\1\162"+
		"\1\151\2\44\1\145\1\141\1\44\1\uffff\1\44\1\143\1\156\1\143\2\uffff\1"+
		"\44\1\156\2\uffff\3\44\1\uffff\1\44\4\uffff";
	static final String DFA4_maxS =
		"\1\175\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\156\1\165\1\145"+
		"\1\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154\1\172\1\164"+
		"\1\142\1\164\1\141\1\165\2\151\1\154\1\163\1\145\1\163\1\uffff\1\172\1"+
		"\154\1\165\1\164\1\145\1\144\1\154\1\145\1\163\1\172\1\145\1\uffff\1\151"+
		"\1\162\1\151\2\172\1\145\1\141\1\172\1\uffff\1\172\1\143\1\156\1\143\2"+
		"\uffff\1\172\1\156\2\uffff\3\172\1\uffff\1\172\4\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff\1\24"+
		"\1\25\13\uffff\1\42\1\43\1\44\1\45\1\46\1\47\1\2\1\1\1\17\1\16\1\21\1"+
		"\20\1\23\1\22\20\uffff\1\32\13\uffff\1\33\10\uffff\1\30\4\uffff\1\37\1"+
		"\40\2\uffff\1\27\1\31\3\uffff\1\41\1\uffff\1\34\1\35\1\36\1\26";
	static final String DFA4_specialS =
		"\144\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\42\1\uffff\2\42\22\uffff\1\42\1\1\2\uffff\1\40\1\2\1\3\1\uffff\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\41\1\uffff\1\14\1\15\1\16\1\17\2"+
			"\uffff\32\40\1\20\1\uffff\1\21\1\uffff\1\40\1\uffff\1\40\1\22\1\23\1"+
			"\40\1\24\1\25\2\40\1\26\6\40\1\27\1\40\1\30\1\31\1\32\1\40\1\33\1\34"+
			"\3\40\1\35\1\36\1\37",
			"\1\43",
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
			"\1\45",
			"\1\47",
			"\1\51",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57\7\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
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
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\121",
			"",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\127",
			"\1\130",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\137",
			"",
			"",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ID | NUM_INT | WS );";
		}
	}

}
