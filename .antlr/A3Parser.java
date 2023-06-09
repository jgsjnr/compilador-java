// Generated from c:\Users\jose\Desktop\UAM\Teoria da Computação e Compiladores\A3\A3.g4 by ANTLR 4.9.2
 
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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SOMA=5, INICIO=6, FIM=7, OPREL=8, COMENTARIO=9, 
		OP_ATR=10, WHILE=11, DO=12, PARA=13, SE=14, SENAO=15, AC=16, FC=17, AP=18, 
		FP=19, PV=20, ID=21, DG=22, VL=23, WS=24;
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
			"PV", "ID", "DG", "VL", "WS"
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.incEsco();
			setState(36);
			((BlocoContext)_localctx).AC = match(AC);
			w.bloco((((BlocoContext)_localctx).AC!=null?((BlocoContext)_localctx).AC.getText():null));
			setState(38);
			declaracoes();
			setState(39);
			((BlocoContext)_localctx).FC = match(FC);
			w.bloco((((BlocoContext)_localctx).FC!=null?((BlocoContext)_localctx).FC.getText():null));
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(41);
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
		public List<WhileContext> while() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<ForContext> for() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << WHILE) | (1L << DO) | (1L << PARA) | (1L << SE) | (1L << AC) | (1L << ID))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
					{
					setState(47);
					declararVar();
					}
					break;
				case AC:
					{
					setState(48);
					bloco();
					}
					break;
				case SE:
					{
					setState(49);
					cond();
					}
					break;
				case DO:
					{
					setState(50);
					dowhile();
					}
					break;
				case ID:
					{
					setState(51);
					atrbVar();
					}
					break;
				case WHILE:
					{
					setState(52);
					while();
					}
					break;
				case PARA:
					{
					setState(53);
					for();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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
	}

	public final DeclararVarContext declararVar() throws RecognitionException {
		DeclararVarContext _localctx = new DeclararVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declararVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((DeclararVarContext)_localctx).tipo = tipo();
			setState(60);
			((DeclararVarContext)_localctx).ID = match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(61);
				match(OP_ATR);
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==DG) {
				{
				setState(64);
				((DeclararVarContext)_localctx).pri = pri();
				}
			}

			setState(67);
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

	public static class AtrbVarContext extends ParserRuleContext {
		public Token ID;
		public PriContext pri;
		public Token PV;
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public AtrbVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrbVar; }
	}

	public final AtrbVarContext atrbVar() throws RecognitionException {
		AtrbVarContext _localctx = new AtrbVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrbVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((AtrbVarContext)_localctx).ID = match(ID);
			setState(71);
			match(OP_ATR);
			setState(72);
			((AtrbVarContext)_localctx).pri = pri();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(73);
				((AtrbVarContext)_localctx).PV = match(PV);
				}
			}

			w.atrbVar((((AtrbVarContext)_localctx).ID!=null?((AtrbVarContext)_localctx).ID.getText():null), (((AtrbVarContext)_localctx).pri!=null?_input.getText(((AtrbVarContext)_localctx).pri.start,((AtrbVarContext)_localctx).pri.stop):null), (((AtrbVarContext)_localctx).PV!=null?((AtrbVarContext)_localctx).PV.getText():null));
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SE);
			setState(81);
			match(AP);
			setState(82);
			comp();
			setState(83);
			match(FP);
			w.se();
			setState(85);
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
	}

	public final ForContext for() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(PARA);
			setState(88);
			match(AP);
			w.para();
			setState(90);
			declararVar();
			setState(91);
			comp();
			setState(92);
			atrbVar();
			setState(93);
			((ForContext)_localctx).FP = match(FP);
			w.fechaCond((((ForContext)_localctx).FP!=null?((ForContext)_localctx).FP.getText():null));
			setState(95);
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
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((CompContext)_localctx).pri = pri();
			setState(98);
			((CompContext)_localctx).OPREL = match(OPREL);
			setState(99);
			((CompContext)_localctx).seg = seg();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(100);
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

	public static class PriContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public PriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pri; }
	}

	public final PriContext pri() throws RecognitionException {
		PriContext _localctx = new PriContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class SegContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public SegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seg; }
	}

	public final SegContext seg() throws RecognitionException {
		SegContext _localctx = new SegContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DO);
			w.faca();
			setState(111);
			bloco();
			setState(112);
			match(WHILE);
			setState(113);
			match(AP);
			setState(114);
			comp();
			setState(115);
			match(FP);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(116);
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
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHILE);
			setState(122);
			match(AP);
			setState(123);
			comp();
			setState(124);
			match(FP);
			w.enquanto();
			setState(126);
			bloco();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(127);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\5\5A\n\5\3\5\5\5D\n\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nh\n"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rx\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0083\n\16\3\16\3\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\3\6\3\2\27\30\2"+
		"\u0087\2\34\3\2\2\2\4%\3\2\2\2\6:\3\2\2\2\b=\3\2\2\2\nH\3\2\2\2\fP\3\2"+
		"\2\2\16R\3\2\2\2\20Y\3\2\2\2\22c\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3"+
		"\2\2\2\32{\3\2\2\2\34\35\b\2\1\2\35\36\7\b\2\2\36\37\b\2\1\2\37 \5\4\3"+
		"\2 !\7\t\2\2!\"\b\2\1\2\"#\7\26\2\2#$\b\2\1\2$\3\3\2\2\2%&\b\3\1\2&\'"+
		"\7\22\2\2\'(\b\3\1\2()\5\6\4\2)*\7\23\2\2*,\b\3\1\2+-\7\26\2\2,+\3\2\2"+
		"\2,-\3\2\2\2-.\3\2\2\2./\b\3\1\2/\60\b\3\1\2\60\5\3\2\2\2\619\5\b\5\2"+
		"\629\5\4\3\2\639\5\16\b\2\649\5\30\r\2\659\5\n\6\2\669\5\32\16\2\679\5"+
		"\20\t\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66"+
		"\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2"+
		"\2=>\5\f\7\2>@\7\27\2\2?A\7\f\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5\24"+
		"\13\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\26\2\2FG\b\5\1\2G\t\3\2\2\2HI"+
		"\7\27\2\2IJ\7\f\2\2JL\5\24\13\2KM\7\26\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NO\b\6\1\2O\13\3\2\2\2PQ\t\2\2\2Q\r\3\2\2\2RS\7\20\2\2ST\7\24\2\2TU"+
		"\5\22\n\2UV\7\25\2\2VW\b\b\1\2WX\5\4\3\2X\17\3\2\2\2YZ\7\17\2\2Z[\7\24"+
		"\2\2[\\\b\t\1\2\\]\5\b\5\2]^\5\22\n\2^_\5\n\6\2_`\7\25\2\2`a\b\t\1\2a"+
		"b\5\4\3\2b\21\3\2\2\2cd\5\24\13\2de\7\n\2\2eg\5\26\f\2fh\7\26\2\2gf\3"+
		"\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\n\1\2j\23\3\2\2\2kl\t\3\2\2l\25\3\2\2\2"+
		"mn\t\3\2\2n\27\3\2\2\2op\7\16\2\2pq\b\r\1\2qr\5\4\3\2rs\7\r\2\2st\7\24"+
		"\2\2tu\5\22\n\2uw\7\25\2\2vx\7\26\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz"+
		"\b\r\1\2z\31\3\2\2\2{|\7\r\2\2|}\7\24\2\2}~\5\22\n\2~\177\7\25\2\2\177"+
		"\u0080\b\16\1\2\u0080\u0082\5\4\3\2\u0081\u0083\7\26\2\2\u0082\u0081\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\16\1\2\u0085"+
		"\33\3\2\2\2\13,8:@CLgw\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}