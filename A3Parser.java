// Generated from .\A3.g4 by ANTLR 4.13.0
 
    import java.util.*;
    import java.io.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, SOMA=5, INICIO=6, FIM=7, OPREL=8, COMENTARIO=9, 
		OP_ATR=10, WHILE=11, DO=12, PARA=13, SE=14, SENAO=15, AC=16, FC=17, AP=18, 
		FP=19, PV=20, ID=21, VL=22, WS=23;
	public static final int
		RULE_start = 0, RULE_bloco = 1, RULE_declaracoes = 2, RULE_declararVar = 3, 
		RULE_atrbVar = 4, RULE_tipo = 5, RULE_cond = 6, RULE_for = 7, RULE_comp = 8, 
		RULE_pri = 9, RULE_seg = 10, RULE_dowhile = 11, RULE_while = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloco", "declaracoes", "declararVar", "atrbVar", "tipo", "cond", 
			"for", "comp", "pri", "seg", "dowhile", "while"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'letra'", "'quebrado'", "'ideia'", "'+'", "'inicio'", 
			"'fim'", null, "'//'", "'='", "'enquanto'", "'do'", "'para'", "'se'", 
			"'senao'", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SOMA", "INICIO", "FIM", "OPREL", "COMENTARIO", 
			"OP_ATR", "WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", 
			"PV", "ID", "VL", "WS"
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
			setState(27);
			match(INICIO);
			w.printInicio();
			setState(29);
			bloco();
			setState(30);
			match(FIM);
			w.printFim();
			setState(32);
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
			setState(34);
			((BlocoContext)_localctx).AC = match(AC);
			w.bloco((((BlocoContext)_localctx).AC!=null?((BlocoContext)_localctx).AC.getText():null));
			setState(36);
			declaracoes();
			setState(37);
			((BlocoContext)_localctx).FC = match(FC);
			w.bloco((((BlocoContext)_localctx).FC!=null?((BlocoContext)_localctx).FC.getText():null));
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(39);
				((BlocoContext)_localctx).PV = match(PV);
				}
				break;
			}
			w.bloco((((BlocoContext)_localctx).PV!=null?((BlocoContext)_localctx).PV.getText():null));
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2193438L) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
					{
					setState(44);
					declararVar();
					}
					break;
				case AC:
					{
					setState(45);
					bloco();
					}
					break;
				case SE:
					{
					setState(46);
					cond();
					}
					break;
				case DO:
					{
					setState(47);
					dowhile();
					}
					break;
				case ID:
					{
					setState(48);
					atrbVar();
					}
					break;
				case WHILE:
					{
					setState(49);
					while_();
					}
					break;
				case PARA:
					{
					setState(50);
					for_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
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
		public Token VL;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public TerminalNode VL() { return getToken(A3Parser.VL, 0); }
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
			setState(56);
			((DeclararVarContext)_localctx).tipo = tipo();
			setState(57);
			((DeclararVarContext)_localctx).ID = match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(58);
				match(OP_ATR);
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VL) {
				{
				setState(61);
				((DeclararVarContext)_localctx).VL = match(VL);
				}
			}

			setState(64);
			match(PV);
			w.variavel((((DeclararVarContext)_localctx).ID!=null?((DeclararVarContext)_localctx).ID.getText():null), (((DeclararVarContext)_localctx).tipo!=null?_input.getText(((DeclararVarContext)_localctx).tipo.start,((DeclararVarContext)_localctx).tipo.stop):null), 0, (((DeclararVarContext)_localctx).VL!=null?((DeclararVarContext)_localctx).VL.getText():null));
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
		public Token VL;
		public Token PV;
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public TerminalNode VL() { return getToken(A3Parser.VL, 0); }
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
			setState(67);
			((AtrbVarContext)_localctx).ID = match(ID);
			setState(68);
			match(OP_ATR);
			setState(69);
			((AtrbVarContext)_localctx).VL = match(VL);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(70);
				((AtrbVarContext)_localctx).PV = match(PV);
				}
			}

			w.atrbVar((((AtrbVarContext)_localctx).ID!=null?((AtrbVarContext)_localctx).ID.getText():null), (((AtrbVarContext)_localctx).VL!=null?((AtrbVarContext)_localctx).VL.getText():null), (((AtrbVarContext)_localctx).PV!=null?((AtrbVarContext)_localctx).PV.getText():null));
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
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
		enterRule(_localctx, 12, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SE);
			setState(78);
			match(AP);
			setState(79);
			comp();
			setState(80);
			match(FP);
			w.se();
			setState(82);
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
		enterRule(_localctx, 14, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PARA);
			setState(85);
			match(AP);
			w.para();
			setState(87);
			declararVar();
			setState(88);
			comp();
			setState(89);
			atrbVar();
			setState(90);
			((ForContext)_localctx).FP = match(FP);
			w.fechaCond((((ForContext)_localctx).FP!=null?((ForContext)_localctx).FP.getText():null));
			setState(92);
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
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((CompContext)_localctx).pri = pri();
			setState(95);
			((CompContext)_localctx).OPREL = match(OPREL);
			setState(96);
			((CompContext)_localctx).seg = seg();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(97);
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
		public TerminalNode VL() { return getToken(A3Parser.VL, 0); }
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
		enterRule(_localctx, 18, RULE_pri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(VL);
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
		public TerminalNode VL() { return getToken(A3Parser.VL, 0); }
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
		enterRule(_localctx, 20, RULE_seg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VL);
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
		enterRule(_localctx, 22, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DO);
			w.faca();
			setState(108);
			bloco();
			setState(109);
			match(WHILE);
			setState(110);
			match(AP);
			setState(111);
			comp();
			setState(112);
			match(FP);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(113);
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
		enterRule(_localctx, 24, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(WHILE);
			setState(119);
			match(AP);
			setState(120);
			comp();
			setState(121);
			match(FP);
			w.enquanto();
			setState(123);
			bloco();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(124);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001"+
		"\u0003\u0003\u0003?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"c\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bs\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0001\u0001\u0000\u0001\u0004\u0082\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u00045\u0001\u0000"+
		"\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000"+
		"\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eT\u0001\u0000"+
		"\u0000\u0000\u0010^\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000"+
		"\u0014h\u0001\u0000\u0000\u0000\u0016j\u0001\u0000\u0000\u0000\u0018v"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0000\uffff\uffff\u0000\u001b"+
		"\u001c\u0005\u0006\u0000\u0000\u001c\u001d\u0006\u0000\uffff\uffff\u0000"+
		"\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u0007\u0000\u0000"+
		"\u001f \u0006\u0000\uffff\uffff\u0000 !\u0005\u0014\u0000\u0000!\u0001"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u0010\u0000\u0000#$\u0006\u0001\uffff"+
		"\uffff\u0000$%\u0003\u0004\u0002\u0000%&\u0005\u0011\u0000\u0000&(\u0006"+
		"\u0001\uffff\uffff\u0000\')\u0005\u0014\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0006\u0001"+
		"\uffff\uffff\u0000+\u0003\u0001\u0000\u0000\u0000,4\u0003\u0006\u0003"+
		"\u0000-4\u0003\u0002\u0001\u0000.4\u0003\f\u0006\u0000/4\u0003\u0016\u000b"+
		"\u000004\u0003\b\u0004\u000014\u0003\u0018\f\u000024\u0003\u000e\u0007"+
		"\u00003,\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000"+
		"\u0000\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000089\u0003\n\u0005\u00009;\u0005\u0015"+
		"\u0000\u0000:<\u0005\n\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=?\u0005\u0016\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0014\u0000\u0000AB\u0006\u0003\uffff\uffff\u0000B\u0007\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0015\u0000\u0000DE\u0005\n\u0000\u0000EG\u0005"+
		"\u0016\u0000\u0000FH\u0005\u0014\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0004\uffff"+
		"\uffff\u0000J\t\u0001\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000L\u000b"+
		"\u0001\u0000\u0000\u0000MN\u0005\u000e\u0000\u0000NO\u0005\u0012\u0000"+
		"\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0013\u0000\u0000QR\u0006\u0006\uffff"+
		"\uffff\u0000RS\u0003\u0002\u0001\u0000S\r\u0001\u0000\u0000\u0000TU\u0005"+
		"\r\u0000\u0000UV\u0005\u0012\u0000\u0000VW\u0006\u0007\uffff\uffff\u0000"+
		"WX\u0003\u0006\u0003\u0000XY\u0003\u0010\b\u0000YZ\u0003\b\u0004\u0000"+
		"Z[\u0005\u0013\u0000\u0000[\\\u0006\u0007\uffff\uffff\u0000\\]\u0003\u0002"+
		"\u0001\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0003\u0012\t\u0000_`\u0005"+
		"\b\u0000\u0000`b\u0003\u0014\n\u0000ac\u0005\u0014\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0006\b\uffff\uffff\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0005\u0016"+
		"\u0000\u0000g\u0013\u0001\u0000\u0000\u0000hi\u0005\u0016\u0000\u0000"+
		"i\u0015\u0001\u0000\u0000\u0000jk\u0005\f\u0000\u0000kl\u0006\u000b\uffff"+
		"\uffff\u0000lm\u0003\u0002\u0001\u0000mn\u0005\u000b\u0000\u0000no\u0005"+
		"\u0012\u0000\u0000op\u0003\u0010\b\u0000pr\u0005\u0013\u0000\u0000qs\u0005"+
		"\u0014\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0006\u000b\uffff\uffff\u0000u\u0017\u0001"+
		"\u0000\u0000\u0000vw\u0005\u000b\u0000\u0000wx\u0005\u0012\u0000\u0000"+
		"xy\u0003\u0010\b\u0000yz\u0005\u0013\u0000\u0000z{\u0006\f\uffff\uffff"+
		"\u0000{}\u0003\u0002\u0001\u0000|~\u0005\u0014\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0006\f\uffff\uffff\u0000\u0080\u0019\u0001\u0000\u0000\u0000"+
		"\t(35;>Gbr}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}