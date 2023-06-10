// Generated from c:\Users\jose\Desktop\UAM\Teoria da Computação e Compiladores\A3\A3.g4 by ANTLR 4.9.2
 
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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << LER) | (1L << ESCREVER) | (1L << WHILE) | (1L << DO) | (1L << PARA) | (1L << SE) | (1L << AC) | (1L << ID))) != 0)) {
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
					while();
					}
					break;
				case PARA:
					{
					setState(70);
					for();
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
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
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
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
				else();
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(A3Parser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else() throws RecognitionException {
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(A3Parser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(A3Parser.SUB, 0); }
		public TerminalNode DIV() { return getToken(A3Parser.DIV, 0); }
		public TerminalNode MULT() { return getToken(A3Parser.MULT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\5\5\5T\n"+
		"\5\3\5\5\5W\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6`\n\6\3\6\3\6\3\7\3\7\5"+
		"\7f\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0085"+
		"\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0095\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a0"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a8\n\21\3\22\3\22\5\22\u00ac"+
		"\n\22\3\22\3\22\5\22\u00b0\n\22\5\22\u00b2\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\3\6\3"+
		"\2\35\36\3\2\t\f\2\u00c6\2,\3\2\2\2\4\66\3\2\2\2\6M\3\2\2\2\bP\3\2\2\2"+
		"\n[\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22r\3\2\2\2\24v\3\2\2\2"+
		"\26\u0080\3\2\2\2\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u008c\3\2\2\2\36"+
		"\u0098\3\2\2\2 \u00a3\3\2\2\2\"\u00b1\3\2\2\2$\u00b3\3\2\2\2&\u00b5\3"+
		"\2\2\2(\u00bb\3\2\2\2*\u00c1\3\2\2\2,-\b\2\1\2-.\b\2\1\2./\7\r\2\2/\60"+
		"\b\2\1\2\60\61\5\4\3\2\61\62\7\16\2\2\62\63\b\2\1\2\63\64\7\33\2\2\64"+
		"\65\b\2\1\2\65\3\3\2\2\2\66\67\b\3\1\2\678\7\27\2\289\b\3\1\29:\5\6\4"+
		"\2:;\7\30\2\2;=\b\3\1\2<>\7\33\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\3"+
		"\1\2@A\b\3\1\2A\5\3\2\2\2BL\5\b\5\2CL\5\4\3\2DL\5\20\t\2EL\5\34\17\2F"+
		"L\5\n\6\2GL\5\36\20\2HL\5\24\13\2IL\5&\24\2JL\5(\25\2KB\3\2\2\2KC\3\2"+
		"\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PQ\5\16\b\2QS\7"+
		"\35\2\2RT\7\21\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\30\r\2VU\3\2\2\2"+
		"VW\3\2\2\2WX\3\2\2\2XY\7\33\2\2YZ\b\5\1\2Z\t\3\2\2\2[\\\7\35\2\2\\]\7"+
		"\21\2\2]_\5\f\7\2^`\7\33\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\6\1\2b"+
		"\13\3\2\2\2cf\5\30\r\2df\5 \21\2ec\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\t\2"+
		"\2\2h\17\3\2\2\2ij\7\25\2\2jk\7\31\2\2kl\5\26\f\2lm\7\32\2\2mn\b\t\1\2"+
		"np\5\4\3\2oq\5\22\n\2po\3\2\2\2pq\3\2\2\2q\21\3\2\2\2rs\7\26\2\2st\b\n"+
		"\1\2tu\5\4\3\2u\23\3\2\2\2vw\7\24\2\2wx\7\31\2\2xy\b\13\1\2yz\5\b\5\2"+
		"z{\5\26\f\2{|\5\n\6\2|}\7\32\2\2}~\b\13\1\2~\177\5\4\3\2\177\25\3\2\2"+
		"\2\u0080\u0081\5\30\r\2\u0081\u0082\7\17\2\2\u0082\u0084\5\32\16\2\u0083"+
		"\u0085\7\33\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\b\f\1\2\u0087\27\3\2\2\2\u0088\u0089\t\3\2\2\u0089"+
		"\31\3\2\2\2\u008a\u008b\t\3\2\2\u008b\33\3\2\2\2\u008c\u008d\7\23\2\2"+
		"\u008d\u008e\b\17\1\2\u008e\u008f\5\4\3\2\u008f\u0090\7\22\2\2\u0090\u0091"+
		"\7\31\2\2\u0091\u0092\5\26\f\2\u0092\u0094\7\32\2\2\u0093\u0095\7\33\2"+
		"\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\b\17\1\2\u0097\35\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009a\7\31\2\2\u009a"+
		"\u009b\5\26\f\2\u009b\u009c\7\32\2\2\u009c\u009d\b\20\1\2\u009d\u009f"+
		"\5\4\3\2\u009e\u00a0\7\33\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\20\1\2\u00a2\37\3\2\2\2\u00a3\u00a4"+
		"\5\30\r\2\u00a4\u00a5\5$\23\2\u00a5\u00a7\5\"\22\2\u00a6\u00a8\7\33\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8!\3\2\2\2\u00a9\u00b2"+
		"\5\30\r\2\u00aa\u00ac\7\31\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00af\5 \21\2\u00ae\u00b0\7\32\2\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4%\3\2\2\2\u00b5"+
		"\u00b6\7\7\2\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\7"+
		"\32\2\2\u00b9\u00ba\7\33\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc"+
		"\u00bd\7\31\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7"+
		"\33\2\2\u00c0)\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3\7\35\2\2\u00c3"+
		"\u00c4\7\34\2\2\u00c4+\3\2\2\2\21=KMSV_ep\u0084\u0094\u009f\u00a7\u00ab"+
		"\u00af\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}