// Generated from grammar/EightBit.g4 by ANTLR 4.5.3
package eightBit.compile;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightBitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, NUMBER=22, STRING=23, NOT=24, 
		EQ=25, NEQ=26, LEQ=27, OR=28, TRUE=29, FALSE=30, MUL=31, DIV=32, ADD=33, 
		SUB=34, ID=35, SLC=36, MLC=37, WS=38;
	public static final int
		RULE_eightProgram = 0, RULE_eightFunction = 1, RULE_formals = 2, RULE_idList = 3, 
		RULE_id = 4, RULE_funBody = 5, RULE_emptyStatement = 6, RULE_letStatement = 7, 
		RULE_assignStmtList = 8, RULE_closedStatement = 9, RULE_assignStatement = 10, 
		RULE_whileStatement = 11, RULE_ifStatement = 12, RULE_callStatement = 13, 
		RULE_returnStatement = 14, RULE_blockStatement = 15, RULE_closedList = 16, 
		RULE_print_string = 17, RULE_print_number = 18, RULE_print_boolean = 19, 
		RULE_expr = 20, RULE_relMonom = 21, RULE_relOperation = 22, RULE_relOperator = 23, 
		RULE_arithOperation = 24, RULE_arithMonom = 25, RULE_arithSingle = 26, 
		RULE_constant = 27, RULE_arguments = 28, RULE_args = 29;
	public static final String[] ruleNames = {
		"eightProgram", "eightFunction", "formals", "idList", "id", "funBody", 
		"emptyStatement", "letStatement", "assignStmtList", "closedStatement", 
		"assignStatement", "whileStatement", "ifStatement", "callStatement", "returnStatement", 
		"blockStatement", "closedList", "print_string", "print_number", "print_boolean", 
		"expr", "relMonom", "relOperation", "relOperator", "arithOperation", "arithMonom", 
		"arithSingle", "constant", "arguments", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'('", "')'", "','", "';'", "'let'", "'{'", "'}'", "'='", 
		"'while'", "'if'", "'else'", "'return'", "'print_string'", "'print_number'", 
		"'print_boolean'", "'&&'", "'>'", "'<'", "'>='", "'null'", null, null, 
		"'!'", "'=='", "'!='", "'<='", "'||'", "'true'", "'false'", "'*'", "'/'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"STRING", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", 
		"ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EightBit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EightBitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EightProgramContext extends ParserRuleContext {
		public List<EightFunctionContext> eightFunction() {
			return getRuleContexts(EightFunctionContext.class);
		}
		public EightFunctionContext eightFunction(int i) {
			return getRuleContext(EightFunctionContext.class,i);
		}
		public EightProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eightProgram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitEightProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EightProgramContext eightProgram() throws RecognitionException {
		EightProgramContext _localctx = new EightProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eightProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				eightFunction();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class EightFunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public FunBodyContext funBody() {
			return getRuleContext(FunBodyContext.class,0);
		}
		public EightFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eightFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitEightFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EightFunctionContext eightFunction() throws RecognitionException {
		EightFunctionContext _localctx = new EightFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eightFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
			id();
			setState(67);
			formals();
			setState(68);
			funBody();
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

	public static class FormalsContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(72);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(71);
				idList();
				}
			}

			setState(74);
			match(T__2);
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

	public static class IdListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			id();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(77);
				match(T__3);
				setState(78);
				id();
				}
				}
				setState(83);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EightBitParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
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

	public static class FunBodyContext extends ParserRuleContext {
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public FunBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitFunBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunBodyContext funBody() throws RecognitionException {
		FunBodyContext _localctx = new FunBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funBody);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				letStatement();
				}
				break;
			case T__6:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				closedStatement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				emptyStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__4);
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

	public static class LetStatementContext extends ParserRuleContext {
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public AssignStmtListContext assignStmtList() {
			return getRuleContext(AssignStmtListContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__5);
			setState(94);
			match(T__6);
			setState(96);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(95);
				assignStmtList();
				}
			}

			setState(98);
			match(T__7);
			setState(99);
			closedStatement();
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

	public static class AssignStmtListContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public List<AssignStmtListContext> assignStmtList() {
			return getRuleContexts(AssignStmtListContext.class);
		}
		public AssignStmtListContext assignStmtList(int i) {
			return getRuleContext(AssignStmtListContext.class,i);
		}
		public AssignStmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmtList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitAssignStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtListContext assignStmtList() throws RecognitionException {
		AssignStmtListContext _localctx = new AssignStmtListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStmtList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			assignStatement();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(T__4);
					setState(103);
					assignStmtList();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ClosedStatementContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public Print_stringContext print_string() {
			return getRuleContext(Print_stringContext.class,0);
		}
		public Print_numberContext print_number() {
			return getRuleContext(Print_numberContext.class,0);
		}
		public Print_booleanContext print_boolean() {
			return getRuleContext(Print_booleanContext.class,0);
		}
		public ClosedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitClosedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedStatementContext closedStatement() throws RecognitionException {
		ClosedStatementContext _localctx = new ClosedStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closedStatement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				assignStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				callStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				blockStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				print_string();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				print_number();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				print_boolean();
				}
				break;
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			id();
			setState(121);
			match(T__8);
			setState(122);
			expr();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__9);
			setState(125);
			match(T__1);
			setState(126);
			expr();
			setState(127);
			match(T__2);
			setState(128);
			closedStatement();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__10);
			setState(131);
			match(T__1);
			setState(132);
			expr();
			setState(133);
			match(T__2);
			setState(134);
			closedStatement();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(135);
				match(T__11);
				setState(136);
				closedStatement();
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

	public static class CallStatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			id();
			setState(140);
			arguments();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__12);
			setState(143);
			expr();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public ClosedListContext closedList() {
			return getRuleContext(ClosedListContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__6);
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				setState(146);
				closedList();
				}
			}

			setState(149);
			match(T__7);
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

	public static class ClosedListContext extends ParserRuleContext {
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public ClosedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitClosedList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedListContext closedList() throws RecognitionException {
		ClosedListContext _localctx = new ClosedListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_closedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			closedStatement();
			setState(153);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(152);
				match(T__4);
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(155);
				closedStatement();
				setState(157);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(156);
					match(T__4);
					}
				}

				}
				}
				setState(163);
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

	public static class Print_stringContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitPrint_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stringContext print_string() throws RecognitionException {
		Print_stringContext _localctx = new Print_stringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			setState(165);
			match(T__1);
			setState(166);
			expr();
			setState(167);
			match(T__2);
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

	public static class Print_numberContext extends ParserRuleContext {
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public Print_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitPrint_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_numberContext print_number() throws RecognitionException {
		Print_numberContext _localctx = new Print_numberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__14);
			setState(170);
			match(T__1);
			setState(171);
			callStatement();
			setState(172);
			match(T__2);
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

	public static class Print_booleanContext extends ParserRuleContext {
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public Print_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitPrint_boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_booleanContext print_boolean() throws RecognitionException {
		Print_booleanContext _localctx = new Print_booleanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(175);
			match(T__1);
			setState(176);
			callStatement();
			setState(177);
			match(T__2);
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

	public static class ExprContext extends ParserRuleContext {
		public List<RelMonomContext> relMonom() {
			return getRuleContexts(RelMonomContext.class);
		}
		public RelMonomContext relMonom(int i) {
			return getRuleContext(RelMonomContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			relMonom();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(180);
				match(OR);
				setState(181);
				relMonom();
				}
				}
				setState(186);
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

	public static class RelMonomContext extends ParserRuleContext {
		public List<RelOperationContext> relOperation() {
			return getRuleContexts(RelOperationContext.class);
		}
		public RelOperationContext relOperation(int i) {
			return getRuleContext(RelOperationContext.class,i);
		}
		public RelMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitRelMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelMonomContext relMonom() throws RecognitionException {
		RelMonomContext _localctx = new RelMonomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			relOperation();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(188);
				match(T__16);
				setState(189);
				relOperation();
				}
				}
				setState(194);
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

	public static class RelOperationContext extends ParserRuleContext {
		public List<ArithOperationContext> arithOperation() {
			return getRuleContexts(ArithOperationContext.class);
		}
		public ArithOperationContext arithOperation(int i) {
			return getRuleContext(ArithOperationContext.class,i);
		}
		public List<RelOperatorContext> relOperator() {
			return getRuleContexts(RelOperatorContext.class);
		}
		public RelOperatorContext relOperator(int i) {
			return getRuleContext(RelOperatorContext.class,i);
		}
		public RelOperationContext relOperation() {
			return getRuleContext(RelOperationContext.class,0);
		}
		public RelOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitRelOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperationContext relOperation() throws RecognitionException {
		RelOperationContext _localctx = new RelOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relOperation);
		int _la;
		try {
			setState(206);
			switch (_input.LA(1)) {
			case T__1:
			case T__20:
			case NUMBER:
			case STRING:
			case TRUE:
			case FALSE:
			case SUB:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				arithOperation();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << EQ) | (1L << NEQ) | (1L << LEQ))) != 0)) {
					{
					{
					setState(196);
					relOperator();
					setState(197);
					arithOperation();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(NOT);
				setState(205);
				relOperation();
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

	public static class RelOperatorContext extends ParserRuleContext {
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitRelOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << EQ) | (1L << NEQ) | (1L << LEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ArithOperationContext extends ParserRuleContext {
		public Token oper;
		public List<ArithMonomContext> arithMonom() {
			return getRuleContexts(ArithMonomContext.class);
		}
		public ArithMonomContext arithMonom(int i) {
			return getRuleContext(ArithMonomContext.class,i);
		}
		public ArithOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOperationContext arithOperation() throws RecognitionException {
		ArithOperationContext _localctx = new ArithOperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arithOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			arithMonom();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					((ArithOperationContext)_localctx).oper = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((ArithOperationContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(212);
					arithMonom();
					}
					} 
				}
				setState(217);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ArithMonomContext extends ParserRuleContext {
		public Token oper;
		public List<ArithSingleContext> arithSingle() {
			return getRuleContexts(ArithSingleContext.class);
		}
		public ArithSingleContext arithSingle(int i) {
			return getRuleContext(ArithSingleContext.class,i);
		}
		public ArithMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithMonomContext arithMonom() throws RecognitionException {
		ArithMonomContext _localctx = new ArithMonomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arithMonom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			arithSingle();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(219);
						((ArithMonomContext)_localctx).oper = match(MUL);
						}
						break;
					case DIV:
						{
						setState(220);
						match(DIV);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223);
					arithSingle();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ArithSingleContext extends ParserRuleContext {
		public ArithSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithSingle; }
	 
		public ArithSingleContext() { }
		public void copyFrom(ArithSingleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithParsSingleContext extends ArithSingleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArithParsSingleContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithParsSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithMinusSingleContext extends ArithSingleContext {
		public ArithOperationContext arithOperation() {
			return getRuleContext(ArithOperationContext.class,0);
		}
		public ArithMinusSingleContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithMinusSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithIdSingleContext extends ArithSingleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArithIdSingleContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithIdSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithConstantSingleContext extends ArithSingleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArithConstantSingleContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArithConstantSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithSingleContext arithSingle() throws RecognitionException {
		ArithSingleContext _localctx = new ArithSingleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arithSingle);
		int _la;
		try {
			setState(240);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new ArithMinusSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(SUB);
				setState(230);
				arithOperation();
				}
				break;
			case T__1:
				_localctx = new ArithParsSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__1);
				setState(232);
				expr();
				setState(233);
				match(T__2);
				}
				break;
			case ID:
				_localctx = new ArithIdSingleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				id();
				setState(237);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(236);
					arguments();
					}
				}

				}
				break;
			case T__20:
			case NUMBER:
			case STRING:
			case TRUE:
			case FALSE:
				_localctx = new ArithConstantSingleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				constant();
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNumContext extends ConstantContext {
		public TerminalNode NUMBER() { return getToken(EightBitParser.NUMBER, 0); }
		public ExprNumContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ConstantContext {
		public TerminalNode STRING() { return getToken(EightBitParser.STRING, 0); }
		public ExprStringContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFalseContext extends ConstantContext {
		public ExprFalseContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends ConstantContext {
		public ExprTrueContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ConstantContext {
		public ExprNullContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(FALSE);
				}
				break;
			case T__20:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(T__20);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__1);
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << NUMBER) | (1L << STRING) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << ID))) != 0)) {
				{
				setState(250);
				args();
				}
			}

			setState(253);
			match(T__2);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EightBitVisitor ) return ((EightBitVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expr();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(256);
				match(T__3);
				setState(257);
				expr();
				}
				}
				setState(262);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u010a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4K\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\7\5R\n\5\f\5\16\5U\13\5\3\6\3\6\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\5\tc\n\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0096\n\21\3\21\3\21\3\22"+
		"\3\22\5\22\u009c\n\22\3\22\3\22\5\22\u00a0\n\22\7\22\u00a2\n\22\f\22\16"+
		"\22\u00a5\13\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00b9\n\26\f\26\16\26\u00bc\13"+
		"\26\3\27\3\27\3\27\7\27\u00c1\n\27\f\27\16\27\u00c4\13\27\3\30\3\30\3"+
		"\30\3\30\7\30\u00ca\n\30\f\30\16\30\u00cd\13\30\3\30\3\30\5\30\u00d1\n"+
		"\30\3\31\3\31\3\32\3\32\3\32\7\32\u00d8\n\32\f\32\16\32\u00db\13\32\3"+
		"\33\3\33\3\33\5\33\u00e0\n\33\3\33\7\33\u00e3\n\33\f\33\16\33\u00e6\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f0\n\34\3\34\5\34"+
		"\u00f3\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u00fa\n\35\3\36\3\36\5\36\u00fe"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\7\37\u0105\n\37\f\37\16\37\u0108\13\37"+
		"\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<\2\4\4\2\24\26\33\35\3\2#$\u0110\2?\3\2\2\2\4C\3\2\2\2\6H\3\2\2\2\b"+
		"N\3\2\2\2\nV\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22g\3\2\2\2\24"+
		"x\3\2\2\2\26z\3\2\2\2\30~\3\2\2\2\32\u0084\3\2\2\2\34\u008d\3\2\2\2\36"+
		"\u0090\3\2\2\2 \u0093\3\2\2\2\"\u0099\3\2\2\2$\u00a6\3\2\2\2&\u00ab\3"+
		"\2\2\2(\u00b0\3\2\2\2*\u00b5\3\2\2\2,\u00bd\3\2\2\2.\u00d0\3\2\2\2\60"+
		"\u00d2\3\2\2\2\62\u00d4\3\2\2\2\64\u00dc\3\2\2\2\66\u00f2\3\2\2\28\u00f9"+
		"\3\2\2\2:\u00fb\3\2\2\2<\u0101\3\2\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CD\7\3\2\2DE\5\n\6\2EF\5\6\4\2FG\5\f\7\2"+
		"G\5\3\2\2\2HJ\7\4\2\2IK\5\b\5\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\5\2"+
		"\2M\7\3\2\2\2NS\5\n\6\2OP\7\6\2\2PR\5\n\6\2QO\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2VW\7%\2\2W\13\3\2\2\2X\\\5\20\t\2Y"+
		"\\\5\24\13\2Z\\\5\16\b\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\7"+
		"\7\2\2^\17\3\2\2\2_`\7\b\2\2`b\7\t\2\2ac\5\22\n\2ba\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2de\7\n\2\2ef\5\24\13\2f\21\3\2\2\2gl\5\26\f\2hi\7\7\2\2ik\5"+
		"\22\n\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23\3\2\2\2nl\3\2\2\2"+
		"oy\5\26\f\2py\5\30\r\2qy\5\32\16\2ry\5\34\17\2sy\5\36\20\2ty\5 \21\2u"+
		"y\5$\23\2vy\5&\24\2wy\5(\25\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2"+
		"xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\5\n\6"+
		"\2{|\7\13\2\2|}\5*\26\2}\27\3\2\2\2~\177\7\f\2\2\177\u0080\7\4\2\2\u0080"+
		"\u0081\5*\26\2\u0081\u0082\7\5\2\2\u0082\u0083\5\24\13\2\u0083\31\3\2"+
		"\2\2\u0084\u0085\7\r\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5*\26\2\u0087"+
		"\u0088\7\5\2\2\u0088\u008b\5\24\13\2\u0089\u008a\7\16\2\2\u008a\u008c"+
		"\5\24\13\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\33\3\2\2\2\u008d"+
		"\u008e\5\n\6\2\u008e\u008f\5:\36\2\u008f\35\3\2\2\2\u0090\u0091\7\17\2"+
		"\2\u0091\u0092\5*\26\2\u0092\37\3\2\2\2\u0093\u0095\7\t\2\2\u0094\u0096"+
		"\5\"\22\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\7\n\2\2\u0098!\3\2\2\2\u0099\u009b\5\24\13\2\u009a\u009c"+
		"\7\7\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d"+
		"\u009f\5\24\13\2\u009e\u00a0\7\7\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4#\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a6\u00a7\7\20\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5*\26\2\u00a9\u00aa"+
		"\7\5\2\2\u00aa%\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00ae\5\34\17\2\u00ae\u00af\7\5\2\2\u00af\'\3\2\2\2\u00b0\u00b1\7\22"+
		"\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4\7\5\2\2\u00b4"+
		")\3\2\2\2\u00b5\u00ba\5,\27\2\u00b6\u00b7\7\36\2\2\u00b7\u00b9\5,\27\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb+\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5.\30\2\u00be"+
		"\u00bf\7\23\2\2\u00bf\u00c1\5.\30\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3-\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00cb\5\62\32\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\5\62"+
		"\32\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1\5.\30\2\u00d0\u00c5\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1/\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3\61\3\2\2\2\u00d4"+
		"\u00d9\5\64\33\2\u00d5\u00d6\t\3\2\2\u00d6\u00d8\5\64\33\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\63\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e4\5\66\34\2\u00dd\u00e0\7!\2"+
		"\2\u00de\u00e0\7\"\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e3\5\66\34\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\65\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8\u00f3\5\62\32\2\u00e9\u00ea\7\4\2\2"+
		"\u00ea\u00eb\5*\26\2\u00eb\u00ec\7\5\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ef"+
		"\5\n\6\2\u00ee\u00f0\5:\36\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00f3\58\35\2\u00f2\u00e7\3\2\2\2\u00f2\u00e9\3\2"+
		"\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\67\3\2\2\2\u00f4\u00fa"+
		"\7\30\2\2\u00f5\u00fa\7\31\2\2\u00f6\u00fa\7\37\2\2\u00f7\u00fa\7 \2\2"+
		"\u00f8\u00fa\7\27\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa9\3\2\2\2\u00fb"+
		"\u00fd\7\4\2\2\u00fc\u00fe\5<\37\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\5\2\2\u0100;\3\2\2\2\u0101\u0106"+
		"\5*\26\2\u0102\u0103\7\6\2\2\u0103\u0105\5*\26\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107=\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\32AJS[blx\u008b\u0095\u009b\u009f\u00a3\u00ba\u00c2"+
		"\u00cb\u00d0\u00d9\u00df\u00e4\u00ef\u00f2\u00f9\u00fd\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}