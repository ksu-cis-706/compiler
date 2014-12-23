// Generated from StaticJavaV4.g4 by ANTLR 4.4
package sjc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StaticJavaV4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, ID=38, INT=39, WS=40, 
		ERROR=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'true'", "'return'", "'!='", "'class'", "'||'", "'while'", 
		"';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'if'", "'<='", "'int'", 
		"'null'", "'('", "'*'", "','", "'.'", "'false'", "'boolean'", "'>='", 
		"'['", "'=='", "'<'", "']'", "'public'", "'>'", "'!'", "'static'", "'%'", 
		"'else'", "')'", "'+'", "'-'", "ID", "INT", "WS", "ERROR"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_classDefinition = 1, RULE_mainMethodDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_methodDeclaration = 4, RULE_type = 5, 
		RULE_returnType = 6, RULE_params = 7, RULE_param = 8, RULE_methodBody = 9, 
		RULE_localDeclaration = 10, RULE_statement = 11, RULE_assignStatement = 12, 
		RULE_ifStatement = 13, RULE_whileStatement = 14, RULE_invokeExpStatement = 15, 
		RULE_returnStatement = 16, RULE_exp = 17, RULE_invoke = 18, RULE_args = 19;
	public static final String[] ruleNames = {
		"compilationUnit", "classDefinition", "mainMethodDeclaration", "fieldDeclaration", 
		"methodDeclaration", "type", "returnType", "params", "param", "methodBody", 
		"localDeclaration", "statement", "assignStatement", "ifStatement", "whileStatement", 
		"invokeExpStatement", "returnStatement", "exp", "invoke", "args"
	};

	@Override
	public String getGrammarFileName() { return "StaticJavaV4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StaticJavaV4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StaticJavaV4Parser.EOF, 0); }
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); classDefinition();
			setState(41); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__8);
			setState(44); match(T__32);
			setState(45); match(ID);
			setState(46); match(T__27);
			setState(47); mainMethodDeclaration();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				setState(50);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48); fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(49); methodDeclaration();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Token id3;
		public List<TerminalNode> ID() { return getTokens(StaticJavaV4Parser.ID); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(StaticJavaV4Parser.ID, i);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(T__8);
			setState(58); match(T__5);
			setState(59); match(T__28);
			setState(60); ((MainMethodDeclarationContext)_localctx).id1 = match(ID);
			setState(61);
			if (!( "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(62); match(T__19);
			setState(63); ((MainMethodDeclarationContext)_localctx).id2 = match(ID);
			setState(64);
			if (!( "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(65); match(T__12);
			setState(66); match(T__9);
			setState(67); ((MainMethodDeclarationContext)_localctx).id3 = match(ID);
			setState(68); match(T__2);
			setState(69); match(T__27);
			setState(70); methodBody();
			setState(71); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(T__5);
			setState(74); type();
			setState(75); match(ID);
			setState(76); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T__5);
			setState(79); returnType();
			setState(80); match(ID);
			setState(81); match(T__19);
			setState(83);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__14) {
				{
				setState(82); params();
				}
			}

			setState(85); match(T__2);
			setState(86); match(T__27);
			setState(87); methodBody();
			setState(88); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeContext extends TypeContext {
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(T__14);
				}
				break;
			case T__21:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidTypeContext extends ReturnTypeContext {
		public VoidTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonVoidReturnTypeContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitNonVoidReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnType);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94); match(T__28);
				}
				break;
			case T__21:
			case T__14:
				_localctx = new NonVoidReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); param();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(99); match(T__17);
				setState(100); param();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); type();
			setState(107); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__14) {
				{
				{
				setState(109); localDeclaration();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(115); statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); type();
			setState(122); match(ID);
			setState(123); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125); assignStatement();
				}
				break;
			case 2:
				{
				setState(126); ifStatement();
				}
				break;
			case 3:
				{
				setState(127); whileStatement();
				}
				break;
			case 4:
				{
				setState(128); invokeExpStatement();
				}
				break;
			case 5:
				{
				setState(129); returnStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(ID);
			setState(133); match(T__25);
			setState(134); exp(0);
			setState(135); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> ts = new ArrayList<StatementContext>();
		public List<StatementContext> fs = new ArrayList<StatementContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(T__23);
			setState(138); match(T__19);
			setState(139); exp(0);
			setState(140); match(T__2);
			setState(141); match(T__27);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(142); ((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).ts.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); match(T__24);
			setState(158);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(149); match(T__3);
				setState(150); match(T__27);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					{
					setState(151); ((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).fs.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157); match(T__24);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(T__30);
			setState(161); match(T__19);
			setState(162); exp(0);
			setState(163); match(T__2);
			setState(164); match(T__27);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__23) | (1L << ID))) != 0)) {
				{
				{
				setState(165); statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeExpStatementContext extends ParserRuleContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvokeExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_invokeExpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); invoke();
			setState(174); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T__34);
			setState(178);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(177); exp(0);
				}
			}

			setState(180); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(StaticJavaV4Parser.ID, 0); }
		public IdExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends ExpContext {
		public TrueLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeExpContext extends ExpContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExpContext {
		public Token INT;
		public TerminalNode INT() { return getToken(StaticJavaV4Parser.INT, 0); }
		public IntLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends ExpContext {
		public NullLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends ExpContext {
		public FalseLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__0) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(184); exp(8);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185); ((UnaryExpContext)_localctx).op = match(T__6);
				setState(186); exp(7);
				}
				break;
			case 3:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); ((IntLiteralContext)_localctx).INT = match(INT);
				setState(188);
				if (!( new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($INT.text).bitLength() < 32 ");
				}
				break;
			case 4:
				{
				_localctx = new TrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189); match(T__35);
				}
				break;
			case 5:
				{
				_localctx = new FalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190); match(T__15);
				}
				break;
			case 6:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); match(T__20);
				}
				break;
			case 7:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192); match(T__19);
				setState(193); exp(0);
				setState(194); match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); invoke();
				}
				break;
			case 9:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__18) | (1L << T__4))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(202); ((BinaryExpContext)_localctx).e2 = exp(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(205); ((BinaryExpContext)_localctx).e2 = exp(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__13) | (1L << T__10) | (1L << T__7))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(208); ((BinaryExpContext)_localctx).e2 = exp(5);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(210);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__11) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(211); ((BinaryExpContext)_localctx).e2 = exp(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213); ((BinaryExpContext)_localctx).op = match(T__26);
						setState(214); ((BinaryExpContext)_localctx).e2 = exp(3);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(216); ((BinaryExpContext)_localctx).op = match(T__31);
						setState(217); ((BinaryExpContext)_localctx).e2 = exp(2);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InvokeContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(StaticJavaV4Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StaticJavaV4Parser.ID, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_invoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(223); ((InvokeContext)_localctx).id1 = match(ID);
				setState(224); match(T__16);
				}
				break;
			}
			setState(227); ((InvokeContext)_localctx).id2 = match(ID);
			setState(228); match(T__19);
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(229); args();
				}
			}

			setState(232); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaticJavaV4Visitor ) return ((StaticJavaV4Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); exp(0);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(235); match(T__17);
				setState(236); exp(0);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 17: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mainMethodDeclaration_sempred(MainMethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return  "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) ;
		case 1: return  "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) ;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return  new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 ;
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		case 8: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6V\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7_\n\7\3\b\3\b\5\bc\n\b\3\t\3\t"+
		"\3\t\7\th\n\t\f\t\16\tk\13\t\3\n\3\n\3\n\3\13\7\13q\n\13\f\13\16\13t\13"+
		"\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0085\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3\17\3\17\3\17\3\17\7\17\u009b"+
		"\n\17\f\17\16\17\u009e\13\17\3\17\5\17\u00a1\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00a9\n\20\f\20\16\20\u00ac\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\5\22\u00b5\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\24\3\24\5\24"+
		"\u00e4\n\24\3\24\3\24\3\24\5\24\u00e9\n\24\3\24\3\24\3\25\3\25\3\25\7"+
		"\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3\25\2\3$\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\6\3\2&\'\5\2\3\3\25\25##\6\2\21\21\32\32\35"+
		"\35  \4\2\6\6\34\34\u0102\2*\3\2\2\2\4-\3\2\2\2\6;\3\2\2\2\bK\3\2\2\2"+
		"\nP\3\2\2\2\f^\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22l\3\2\2\2\24r\3\2\2\2"+
		"\26{\3\2\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2\2\34\u008b\3\2\2\2\36\u00a2"+
		"\3\2\2\2 \u00af\3\2\2\2\"\u00b2\3\2\2\2$\u00c8\3\2\2\2&\u00e3\3\2\2\2"+
		"(\u00ec\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-.\7\37\2\2./\7\7\2\2/\60"+
		"\7(\2\2\60\61\7\f\2\2\61\66\5\6\4\2\62\65\5\b\5\2\63\65\5\n\6\2\64\62"+
		"\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\66\3\2\2\29:\7\17\2\2:\5\3\2\2\2;<\7\37\2\2<=\7\"\2\2=>\7\13\2\2"+
		">?\7(\2\2?@\6\4\2\3@A\7\24\2\2AB\7(\2\2BC\6\4\3\3CD\7\33\2\2DE\7\36\2"+
		"\2EF\7(\2\2FG\7%\2\2GH\7\f\2\2HI\5\24\13\2IJ\7\17\2\2J\7\3\2\2\2KL\7\""+
		"\2\2LM\5\f\7\2MN\7(\2\2NO\7\n\2\2O\t\3\2\2\2PQ\7\"\2\2QR\5\16\b\2RS\7"+
		"(\2\2SU\7\24\2\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7%\2\2XY\7"+
		"\f\2\2YZ\5\24\13\2Z[\7\17\2\2[\13\3\2\2\2\\_\7\31\2\2]_\7\22\2\2^\\\3"+
		"\2\2\2^]\3\2\2\2_\r\3\2\2\2`c\7\13\2\2ac\5\f\7\2b`\3\2\2\2ba\3\2\2\2c"+
		"\17\3\2\2\2di\5\22\n\2ef\7\26\2\2fh\5\22\n\2ge\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2j\21\3\2\2\2ki\3\2\2\2lm\5\f\7\2mn\7(\2\2n\23\3\2\2\2oq"+
		"\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2"+
		"uw\5\30\r\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\25\3\2\2\2zx\3\2"+
		"\2\2{|\5\f\7\2|}\7(\2\2}~\7\n\2\2~\27\3\2\2\2\177\u0085\5\32\16\2\u0080"+
		"\u0085\5\34\17\2\u0081\u0085\5\36\20\2\u0082\u0085\5 \21\2\u0083\u0085"+
		"\5\"\22\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\31\3\2\2\2\u0086\u0087\7(\2\2"+
		"\u0087\u0088\7\16\2\2\u0088\u0089\5$\23\2\u0089\u008a\7\n\2\2\u008a\33"+
		"\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\7\24\2\2\u008d\u008e\5$\23\2"+
		"\u008e\u008f\7%\2\2\u008f\u0093\7\f\2\2\u0090\u0092\5\30\r\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u00a0\7\17\2\2\u0097\u0098\7"+
		"$\2\2\u0098\u009c\7\f\2\2\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u0097\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\24\2"+
		"\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7%\2\2\u00a6\u00aa\7\f\2\2\u00a7\u00a9"+
		"\5\30\r\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7\17\2\2\u00ae\37\3\2\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7\n\2\2\u00b1"+
		"!\3\2\2\2\u00b2\u00b4\7\5\2\2\u00b3\u00b5\5$\23\2\u00b4\u00b3\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\n\2\2\u00b7#\3"+
		"\2\2\2\u00b8\u00b9\b\23\1\2\u00b9\u00ba\t\2\2\2\u00ba\u00c9\5$\23\n\u00bb"+
		"\u00bc\7!\2\2\u00bc\u00c9\5$\23\t\u00bd\u00be\7)\2\2\u00be\u00c9\6\23"+
		"\4\3\u00bf\u00c9\7\4\2\2\u00c0\u00c9\7\30\2\2\u00c1\u00c9\7\23\2\2\u00c2"+
		"\u00c3\7\24\2\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\7%\2\2\u00c5\u00c9\3\2"+
		"\2\2\u00c6\u00c9\5&\24\2\u00c7\u00c9\7(\2\2\u00c8\u00b8\3\2\2\2\u00c8"+
		"\u00bb\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2"+
		"\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00de\3\2\2\2\u00ca\u00cb\f\b\2\2\u00cb\u00cc\t\3"+
		"\2\2\u00cc\u00dd\5$\23\t\u00cd\u00ce\f\7\2\2\u00ce\u00cf\t\2\2\2\u00cf"+
		"\u00dd\5$\23\b\u00d0\u00d1\f\6\2\2\u00d1\u00d2\t\4\2\2\u00d2\u00dd\5$"+
		"\23\7\u00d3\u00d4\f\5\2\2\u00d4\u00d5\t\5\2\2\u00d5\u00dd\5$\23\6\u00d6"+
		"\u00d7\f\4\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00dd\5$\23\5\u00d9\u00da\f\3"+
		"\2\2\u00da\u00db\7\b\2\2\u00db\u00dd\5$\23\4\u00dc\u00ca\3\2\2\2\u00dc"+
		"\u00cd\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d6\3\2"+
		"\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df%\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2"+
		"\u00e4\7\27\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\7(\2\2\u00e6\u00e8\7\24\2\2\u00e7\u00e9\5(\25\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7%"+
		"\2\2\u00eb\'\3\2\2\2\u00ec\u00f1\5$\23\2\u00ed\u00ee\7\26\2\2\u00ee\u00f0"+
		"\5$\23\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f1\3\2\2\2\26\64\66U^birx\u0084"+
		"\u0093\u009c\u00a0\u00aa\u00b4\u00c8\u00dc\u00de\u00e3\u00e8\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}