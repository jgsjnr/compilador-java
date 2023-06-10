// Generated from .\A3.g4 by ANTLR 4.13.0
 
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class A3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LER=5, ESCREVER=6, SOMA=7, SUB=8, DIV=9, 
		MULT=10, INICIO=11, FIM=12, OPREL=13, COMENTARIO=14, OP_ATR=15, WHILE=16, 
		DO=17, PARA=18, SE=19, SENAO=20, AC=21, FC=22, AP=23, FP=24, PV=25, ASPAS=26, 
		ID=27, DG=28, VL=29, WS=30;
	public static final int
		RULE_start = 0, RULE_bloco = 1, RULE_declaracoes = 2, RULE_declararVar = 3, 
		RULE_atrbVar = 4, RULE_vlatrb = 5, RULE_tipo = 6, RULE_cond = 7, RULE_else = 8, 
		RULE_for = 9, RULE_comp = 10, RULE_pri = 11, RULE_seg = 12, RULE_dowhile = 13, 
		RULE_while = 14, RULE_calc = 15, RULE_membfim = 16, RULE_op = 17, RULE_ler = 18, 
		RULE_escrever = 19, RULE_texto = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloco", "declaracoes", "declararVar", "atrbVar", "vlatrb", 
			"tipo", "cond", "else", "for", "comp", "pri", "seg", "dowhile", "while", 
			"calc", "membfim", "op", "ler", "escrever", "texto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'letra'", "'quebrado'", "'ideia'", "'ler'", "'escrever'", 
			"'+'", "'-'", "'/'", "'*'", "'inicio'", "'fim'", null, "'//'", "'='", 
			"'enquanto'", "'do'", "'para'", "'se'", "'senao'", "'{'", "'}'", "'('", 
			"')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "LER", "ESCREVER", "SOMA", "SUB", "DIV", 
			"MULT", "INICIO", "FIM", "OPREL", "COMENTARIO", "OP_ATR", "WHILE", "DO", 
			"PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", "PV", "ASPAS", "ID", "DG", 
			"VL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "A3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    ControleVariavel cv = new ControleVariavel();
	    Saida w = new Saida(cv);

	public A3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(A3Parser.INICIO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(A3Parser.FIM, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.limpaCodigo();
			w.importacao();
			setState(44);
			match(INICIO);
			w.printInicio();
			setState(46);
			bloco();
			setState(47);
			match(FIM);
			w.printFim();
			setState(49);
			match(PV);
			w.erros();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public Token AC;
		public Token FC;
		public Token PV;
		public TerminalNode AC() { return getToken(A3Parser.AC, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode FC() { return getToken(A3Parser.FC, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.incEsco();
			setState(53);
			((BlocoContext)_localctx).AC = match(AC);
			w.bloco((((BlocoContext)_localctx).AC!=null?((BlocoContext)_localctx).AC.getText():null));
			setState(55);
			declaracoes();
			setState(56);
			((BlocoContext)_localctx).FC = match(FC);
			w.bloco((((BlocoContext)_localctx).FC!=null?((BlocoContext)_localctx).FC.getText():null));
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(58);
				((BlocoContext)_localctx).PV = match(PV);
				}
				break;
			}
			w.bloco((((BlocoContext)_localctx).PV!=null?((BlocoContext)_localctx).PV.getText():null));
			w.decEsco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclararVarContext> declararVar() {
			return getRuleContexts(DeclararVarContext.class);
		}
		public DeclararVarContext declararVar(int i) {
			return getRuleContext(DeclararVarContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<DowhileContext> dowhile() {
			return getRuleContexts(DowhileContext.class);
		}
		public DowhileContext dowhile(int i) {
			return getRuleContext(DowhileContext.class,i);
		}
		public List<AtrbVarContext> atrbVar() {
			return getRuleContexts(AtrbVarContext.class);
		}
		public AtrbVarContext atrbVar(int i) {
			return getRuleContext(AtrbVarContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<LerContext> ler() {
			return getRuleContexts(LerContext.class);
		}
		public LerContext ler(int i) {
			return getRuleContext(LerContext.class,i);
		}
		public List<EscreverContext> escrever() {
			return getRuleContexts(EscreverContext.class);
		}
		public EscreverContext escrever(int i) {
			return getRuleContext(EscreverContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137298046L) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
					{
					setState(64);
					declararVar();
					}
					break;
				case AC:
					{
					setState(65);
					bloco();
					}
					break;
				case SE:
					{
					setState(66);
					cond();
					}
					break;
				case DO:
					{
					setState(67);
					dowhile();
					}
					break;
				case ID:
					{
					setState(68);
					atrbVar();
					}
					break;
				case WHILE:
					{
					setState(69);
					while_();
					}
					break;
				case PARA:
					{
					setState(70);
					for_();
					}
					break;
				case LER:
					{
					setState(71);
					ler();
					}
					break;
				case ESCREVER:
					{
					setState(72);
					escrever();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararVarContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public PriContext pri;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public DeclararVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDeclararVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDeclararVar(this);
		}
	}

	public final DeclararVarContext declararVar() throws RecognitionException {
		DeclararVarContext _localctx = new DeclararVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declararVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((DeclararVarContext)_localctx).tipo = tipo();
			setState(79);
			((DeclararVarContext)_localctx).ID = match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(80);
				match(OP_ATR);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==DG) {
				{
				setState(83);
				((DeclararVarContext)_localctx).pri = pri();
				}
			}

			setState(86);
			match(PV);
			w.variavel((((DeclararVarContext)_localctx).ID!=null?((DeclararVarContext)_localctx).ID.getText():null), (((DeclararVarContext)_localctx).tipo!=null?_input.getText(((DeclararVarContext)_localctx).tipo.start,((DeclararVarContext)_localctx).tipo.stop):null), (((DeclararVarContext)_localctx).pri!=null?_input.getText(((DeclararVarContext)_localctx).pri.start,((DeclararVarContext)_localctx).pri.stop):null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrbVarContext extends ParserRuleContext {
		public Token ID;
		public VlatrbContext vlatrb;
		public Token PV;
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public VlatrbContext vlatrb() {
			return getRuleContext(VlatrbContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public AtrbVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrbVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterAtrbVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitAtrbVar(this);
		}
	}

	public final AtrbVarContext atrbVar() throws RecognitionException {
		AtrbVarContext _localctx = new AtrbVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrbVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((AtrbVarContext)_localctx).ID = match(ID);
			setState(90);
			match(OP_ATR);
			setState(91);
			((AtrbVarContext)_localctx).vlatrb = vlatrb();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(92);
				((AtrbVarContext)_localctx).PV = match(PV);
				}
			}

			w.atrbVar((((AtrbVarContext)_localctx).ID!=null?((AtrbVarContext)_localctx).ID.getText():null), (((AtrbVarContext)_localctx).vlatrb!=null?_input.getText(((AtrbVarContext)_localctx).vlatrb.start,((AtrbVarContext)_localctx).vlatrb.stop):null), (((AtrbVarContext)_localctx).PV!=null?((AtrbVarContext)_localctx).PV.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class VlatrbContext extends ParserRuleContext {
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public VlatrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlatrb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterVlatrb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitVlatrb(this);
		}
	}

	public final VlatrbContext vlatrb() throws RecognitionException {
		VlatrbContext _localctx = new VlatrbContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vlatrb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				pri();
				}
				break;
			case 2:
				{
				setState(98);
				calc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(A3Parser.SE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SE);
			setState(104);
			match(AP);
			setState(105);
			comp();
			setState(106);
			match(FP);
			w.se();
			setState(108);
			bloco();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(109);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(A3Parser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SENAO);
			w.senao();
			setState(114);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public Token FP;
		public TerminalNode PARA() { return getToken(A3Parser.PARA, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public DeclararVarContext declararVar() {
			return getRuleContext(DeclararVarContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public AtrbVarContext atrbVar() {
			return getRuleContext(AtrbVarContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PARA);
			setState(117);
			match(AP);
			w.para();
			setState(119);
			declararVar();
			setState(120);
			comp();
			setState(121);
			atrbVar();
			setState(122);
			((ForContext)_localctx).FP = match(FP);
			w.fechaCond((((ForContext)_localctx).FP!=null?((ForContext)_localctx).FP.getText():null));
			setState(124);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public PriContext pri;
		public Token OPREL;
		public SegContext seg;
		public Token PV;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public TerminalNode OPREL() { return getToken(A3Parser.OPREL, 0); }
		public SegContext seg() {
			return getRuleContext(SegContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((CompContext)_localctx).pri = pri();
			setState(127);
			((CompContext)_localctx).OPREL = match(OPREL);
			setState(128);
			((CompContext)_localctx).seg = seg();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(129);
				((CompContext)_localctx).PV = match(PV);
				}
			}

			w.comp((((CompContext)_localctx).pri!=null?_input.getText(((CompContext)_localctx).pri.start,((CompContext)_localctx).pri.stop):null), (((CompContext)_localctx).OPREL!=null?((CompContext)_localctx).OPREL.getText():null), (((CompContext)_localctx).seg!=null?_input.getText(((CompContext)_localctx).seg.start,((CompContext)_localctx).seg.stop):null), (((CompContext)_localctx).PV!=null?((CompContext)_localctx).PV.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class PriContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public PriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitPri(this);
		}
	}

	public final PriContext pri() throws RecognitionException {
		PriContext _localctx = new PriContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SegContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public SegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterSeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitSeg(this);
		}
	}

	public final SegContext seg() throws RecognitionException {
		SegContext _localctx = new SegContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_seg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DowhileContext extends ParserRuleContext {
		public Token PV;
		public TerminalNode DO() { return getToken(A3Parser.DO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(A3Parser.WHILE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDowhile(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DO);
			w.faca();
			setState(140);
			bloco();
			setState(141);
			match(WHILE);
			setState(142);
			match(AP);
			setState(143);
			comp();
			setState(144);
			match(FP);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(145);
				((DowhileContext)_localctx).PV = match(PV);
				}
			}

			w.enquanto(); w.fechaCond((((DowhileContext)_localctx).PV!=null?((DowhileContext)_localctx).PV.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public Token PV;
		public TerminalNode WHILE() { return getToken(A3Parser.WHILE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(WHILE);
			setState(151);
			match(AP);
			setState(152);
			comp();
			setState(153);
			match(FP);
			w.enquanto();
			setState(155);
			bloco();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(156);
				((WhileContext)_localctx).PV = match(PV);
				}
			}

			w.fechaCond((((WhileContext)_localctx).PV!=null?((WhileContext)_localctx).PV.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalcContext extends ParserRuleContext {
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public MembfimContext membfim() {
			return getRuleContext(MembfimContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			pri();
			setState(162);
			op();
			setState(163);
			membfim();
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(164);
				match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MembfimContext extends ParserRuleContext {
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public MembfimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membfim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterMembfim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitMembfim(this);
		}
	}

	public final MembfimContext membfim() throws RecognitionException {
		MembfimContext _localctx = new MembfimContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_membfim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(167);
				pri();
				}
				break;
			case 2:
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AP) {
					{
					setState(168);
					match(AP);
					}
				}

				setState(171);
				calc();
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(172);
					match(FP);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(A3Parser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(A3Parser.SUB, 0); }
		public TerminalNode DIV() { return getToken(A3Parser.DIV, 0); }
		public TerminalNode MULT() { return getToken(A3Parser.MULT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(A3Parser.LER, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LER);
			setState(180);
			match(AP);
			setState(181);
			texto();
			setState(182);
			match(FP);
			setState(183);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscreverContext extends ParserRuleContext {
		public TerminalNode ESCREVER() { return getToken(A3Parser.ESCREVER, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ESCREVER);
			setState(186);
			match(AP);
			setState(187);
			texto();
			setState(188);
			match(FP);
			setState(189);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public List<TerminalNode> ASPAS() { return getTokens(A3Parser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(A3Parser.ASPAS, i);
		}
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ASPAS);
			setState(192);
			match(ID);
			setState(193);
			match(ASPAS);
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
		"\u0004\u0001\u001e\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002J\b\u0002\n\u0002\f\u0002M\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003R\b\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"o\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0083\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0093\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00a6\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00aa\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ae\b\u0010\u0003\u0010\u00b0"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0003\u0001"+
		"\u0000\u0001\u0004\u0001\u0000\u001b\u001c\u0001\u0000\u0007\n\u00c4\u0000"+
		"*\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000"+
		"\u0000\nc\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001"+
		"\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000"+
		"\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000"+
		"\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000"+
		"\u001c\u0096\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000"+
		" \u00af\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b3"+
		"\u0001\u0000\u0000\u0000&\u00b9\u0001\u0000\u0000\u0000(\u00bf\u0001\u0000"+
		"\u0000\u0000*+\u0006\u0000\uffff\uffff\u0000+,\u0006\u0000\uffff\uffff"+
		"\u0000,-\u0005\u000b\u0000\u0000-.\u0006\u0000\uffff\uffff\u0000./\u0003"+
		"\u0002\u0001\u0000/0\u0005\f\u0000\u000001\u0006\u0000\uffff\uffff\u0000"+
		"12\u0005\u0019\u0000\u000023\u0006\u0000\uffff\uffff\u00003\u0001\u0001"+
		"\u0000\u0000\u000045\u0006\u0001\uffff\uffff\u000056\u0005\u0015\u0000"+
		"\u000067\u0006\u0001\uffff\uffff\u000078\u0003\u0004\u0002\u000089\u0005"+
		"\u0016\u0000\u00009;\u0006\u0001\uffff\uffff\u0000:<\u0005\u0019\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0006\u0001\uffff\uffff\u0000>?\u0006\u0001\uffff\uffff"+
		"\u0000?\u0003\u0001\u0000\u0000\u0000@J\u0003\u0006\u0003\u0000AJ\u0003"+
		"\u0002\u0001\u0000BJ\u0003\u000e\u0007\u0000CJ\u0003\u001a\r\u0000DJ\u0003"+
		"\b\u0004\u0000EJ\u0003\u001c\u000e\u0000FJ\u0003\u0012\t\u0000GJ\u0003"+
		"$\u0012\u0000HJ\u0003&\u0013\u0000I@\u0001\u0000\u0000\u0000IA\u0001\u0000"+
		"\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000ID\u0001"+
		"\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0005\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0003\f\u0006\u0000OQ\u0005"+
		"\u001b\u0000\u0000PR\u0005\u000f\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SU\u0003\u0016\u000b"+
		"\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0019\u0000\u0000WX\u0006\u0003\uffff\uffff\u0000"+
		"X\u0007\u0001\u0000\u0000\u0000YZ\u0005\u001b\u0000\u0000Z[\u0005\u000f"+
		"\u0000\u0000[]\u0003\n\u0005\u0000\\^\u0005\u0019\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0004\uffff\uffff\u0000`\t\u0001\u0000\u0000\u0000ad\u0003\u0016"+
		"\u000b\u0000bd\u0003\u001e\u000f\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000"+
		"\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\u0013\u0000\u0000hi\u0005\u0017"+
		"\u0000\u0000ij\u0003\u0014\n\u0000jk\u0005\u0018\u0000\u0000kl\u0006\u0007"+
		"\uffff\uffff\u0000ln\u0003\u0002\u0001\u0000mo\u0003\u0010\b\u0000nm\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0014\u0000\u0000qr\u0006\b\uffff\uffff\u0000rs\u0003\u0002"+
		"\u0001\u0000s\u0011\u0001\u0000\u0000\u0000tu\u0005\u0012\u0000\u0000"+
		"uv\u0005\u0017\u0000\u0000vw\u0006\t\uffff\uffff\u0000wx\u0003\u0006\u0003"+
		"\u0000xy\u0003\u0014\n\u0000yz\u0003\b\u0004\u0000z{\u0005\u0018\u0000"+
		"\u0000{|\u0006\t\uffff\uffff\u0000|}\u0003\u0002\u0001\u0000}\u0013\u0001"+
		"\u0000\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005\r"+
		"\u0000\u0000\u0080\u0082\u0003\u0018\f\u0000\u0081\u0083\u0005\u0019\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\n\uffff\uffff"+
		"\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0001\u0000"+
		"\u0000\u0087\u0017\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0001\u0000"+
		"\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0011\u0000"+
		"\u0000\u008b\u008c\u0006\r\uffff\uffff\u0000\u008c\u008d\u0003\u0002\u0001"+
		"\u0000\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u008f\u0005\u0017\u0000"+
		"\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0092\u0005\u0018\u0000\u0000"+
		"\u0091\u0093\u0005\u0019\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0006\r\uffff\uffff\u0000\u0095\u001b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u0098\u0005\u0017\u0000\u0000"+
		"\u0098\u0099\u0003\u0014\n\u0000\u0099\u009a\u0005\u0018\u0000\u0000\u009a"+
		"\u009b\u0006\u000e\uffff\uffff\u0000\u009b\u009d\u0003\u0002\u0001\u0000"+
		"\u009c\u009e\u0005\u0019\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0006\u000e\uffff\uffff\u0000\u00a0\u001d\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0003\"\u0011\u0000"+
		"\u00a3\u00a5\u0003 \u0010\u0000\u00a4\u00a6\u0005\u0019\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u001f\u0001\u0000\u0000\u0000\u00a7\u00b0\u0003\u0016\u000b\u0000\u00a8"+
		"\u00aa\u0005\u0017\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0003\u001e\u000f\u0000\u00ac\u00ae\u0005\u0018\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0007\u0002\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0005\u0000\u0000\u00b4\u00b5\u0005\u0017\u0000\u0000\u00b5\u00b6\u0003"+
		"(\u0014\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b8\u0005\u0019"+
		"\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0006\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0017\u0000\u0000\u00bb\u00bc\u0003(\u0014\u0000"+
		"\u00bc\u00bd\u0005\u0018\u0000\u0000\u00bd\u00be\u0005\u0019\u0000\u0000"+
		"\u00be\'\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001a\u0000\u0000\u00c0"+
		"\u00c1\u0005\u001b\u0000\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2"+
		")\u0001\u0000\u0000\u0000\u000f;IKQT]cn\u0082\u0092\u009d\u00a5\u00a9"+
		"\u00ad\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}