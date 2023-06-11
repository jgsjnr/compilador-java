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
		T__0=1, T__1=2, T__2=3, T__3=4, SCANNER=5, LER=6, ESCREVER=7, SOMA=8, 
		SUB=9, DIV=10, MULT=11, INICIO=12, FIM=13, OPREL=14, COMENTARIO=15, OP_ATR=16, 
		WHILE=17, DO=18, PARA=19, SE=20, SENAO=21, AC=22, FC=23, AP=24, FP=25, 
		PV=26, ASPAS=27, ID=28, DG=29, VL=30, WS=31, TX=32;
	public static final int
		RULE_start = 0, RULE_bloco = 1, RULE_declaracoes = 2, RULE_declararVar = 3, 
		RULE_atrbVar = 4, RULE_vlatrb = 5, RULE_tipo = 6, RULE_cond = 7, RULE_else = 8, 
		RULE_for = 9, RULE_comp = 10, RULE_pri = 11, RULE_seg = 12, RULE_dowhile = 13, 
		RULE_while = 14, RULE_calc = 15, RULE_membfim = 16, RULE_op = 17, RULE_aritm = 18, 
		RULE_geo = 19, RULE_cont_op = 20, RULE_op_aritm = 21, RULE_op_geo = 22, 
		RULE_ler = 23, RULE_escrever = 24, RULE_texto = 25, RULE_descrito = 26, 
		RULE_scan = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloco", "declaracoes", "declararVar", "atrbVar", "vlatrb", 
			"tipo", "cond", "else", "for", "comp", "pri", "seg", "dowhile", "while", 
			"calc", "membfim", "op", "aritm", "geo", "cont_op", "op_aritm", "op_geo", 
			"ler", "escrever", "texto", "descrito", "scan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'letra'", "'quebrado'", "'ideia'", "'scan'", "'ler'", 
			"'escrever'", "'+'", "'-'", "'/'", "'*'", "'inicio'", "'fim'", null, 
			"'//'", "'='", "'enquanto'", "'do'", "'para'", "'se'", "'senao'", "'{'", 
			"'}'", "'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SCANNER", "LER", "ESCREVER", "SOMA", "SUB", 
			"DIV", "MULT", "INICIO", "FIM", "OPREL", "COMENTARIO", "OP_ATR", "WHILE", 
			"DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", "PV", "ASPAS", "ID", 
			"DG", "VL", "WS", "TX"
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
			setState(58);
			match(INICIO);
			w.printInicio();
			setState(60);
			bloco();
			setState(61);
			match(FIM);
			w.printFim();
			setState(63);
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
			setState(67);
			((BlocoContext)_localctx).AC = match(AC);
			w.bloco((((BlocoContext)_localctx).AC!=null?((BlocoContext)_localctx).AC.getText():null));
			setState(69);
			declaracoes();
			setState(70);
			((BlocoContext)_localctx).FC = match(FC);
			w.bloco((((BlocoContext)_localctx).FC!=null?((BlocoContext)_localctx).FC.getText():null));
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(72);
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
		public List<ScanContext> scan() {
			return getRuleContexts(ScanContext.class);
		}
		public ScanContext scan(int i) {
			return getRuleContext(ScanContext.class,i);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << SCANNER) | (1L << LER) | (1L << ESCREVER) | (1L << WHILE) | (1L << DO) | (1L << PARA) | (1L << SE) | (1L << AC) | (1L << ID))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
					{
					setState(78);
					declararVar();
					}
					break;
				case AC:
					{
					setState(79);
					bloco();
					}
					break;
				case SE:
					{
					setState(80);
					cond();
					}
					break;
				case DO:
					{
					setState(81);
					dowhile();
					}
					break;
				case ID:
					{
					setState(82);
					atrbVar();
					}
					break;
				case WHILE:
					{
					setState(83);
					while();
					}
					break;
				case PARA:
					{
					setState(84);
					for();
					}
					break;
				case LER:
					{
					setState(85);
					ler();
					}
					break;
				case ESCREVER:
					{
					setState(86);
					escrever();
					}
					break;
				case SCANNER:
					{
					setState(87);
					scan();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
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
			setState(93);
			((DeclararVarContext)_localctx).tipo = tipo();
			setState(94);
			((DeclararVarContext)_localctx).ID = match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(95);
				match(OP_ATR);
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==DG) {
				{
				setState(98);
				((DeclararVarContext)_localctx).pri = pri();
				}
			}

			setState(101);
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
			setState(104);
			((AtrbVarContext)_localctx).ID = match(ID);
			setState(105);
			match(OP_ATR);
			setState(106);
			((AtrbVarContext)_localctx).vlatrb = vlatrb();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(107);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				pri();
				}
				break;
			case 2:
				{
				setState(113);
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
			setState(116);
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
			setState(118);
			match(SE);
			setState(119);
			match(AP);
			setState(120);
			comp();
			setState(121);
			match(FP);
			w.se();
			setState(123);
			bloco();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(124);
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
			setState(127);
			match(SENAO);
			w.senao();
			setState(129);
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
			setState(131);
			match(PARA);
			setState(132);
			match(AP);
			w.para();
			setState(134);
			declararVar();
			setState(135);
			comp();
			setState(136);
			atrbVar();
			setState(137);
			((ForContext)_localctx).FP = match(FP);
			w.fechaCond((((ForContext)_localctx).FP!=null?((ForContext)_localctx).FP.getText():null));
			setState(139);
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
			setState(141);
			((CompContext)_localctx).pri = pri();
			setState(142);
			((CompContext)_localctx).OPREL = match(OPREL);
			setState(143);
			((CompContext)_localctx).seg = seg();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(144);
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
			setState(149);
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
			setState(151);
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
			setState(153);
			match(DO);
			w.faca();
			setState(155);
			bloco();
			setState(156);
			match(WHILE);
			setState(157);
			match(AP);
			setState(158);
			comp();
			setState(159);
			match(FP);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(160);
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
			setState(165);
			match(WHILE);
			setState(166);
			match(AP);
			setState(167);
			comp();
			setState(168);
			match(FP);
			w.enquanto();
			setState(170);
			bloco();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(171);
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
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public MembfimContext membfim() {
			return getRuleContext(MembfimContext.class,0);
		}
		public Cont_opContext cont_op() {
			return getRuleContext(Cont_opContext.class,0);
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
			setState(176);
			op();
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(177);
				membfim();
				}
				break;
			case 2:
				{
				setState(178);
				cont_op();
				}
				break;
			case 3:
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(179);
					match(PV);
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

	public static class MembfimContext extends ParserRuleContext {
		public PriContext pri;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public MembfimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membfim; }
	}

	public final MembfimContext membfim() throws RecognitionException {
		MembfimContext _localctx = new MembfimContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_membfim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(184);
				((MembfimContext)_localctx).pri = pri();
				}
				break;
			case 2:
				{
				setState(185);
				calc();
				}
				break;
			}
			w.coletaOp((((MembfimContext)_localctx).pri!=null?_input.getText(((MembfimContext)_localctx).pri.start,((MembfimContext)_localctx).pri.stop):null));
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
		public AritmContext aritm() {
			return getRuleContext(AritmContext.class,0);
		}
		public GeoContext geo() {
			return getRuleContext(GeoContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case DG:
				{
				setState(190);
				aritm();
				}
				break;
			case AP:
				{
				setState(191);
				geo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AritmContext extends ParserRuleContext {
		public PriContext pri;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public Op_aritmContext op_aritm() {
			return getRuleContext(Op_aritmContext.class,0);
		}
		public AritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritm; }
	}

	public final AritmContext aritm() throws RecognitionException {
		AritmContext _localctx = new AritmContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aritm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((AritmContext)_localctx).pri = pri();
			setState(195);
			op_aritm();
			w.coletaOp((((AritmContext)_localctx).pri!=null?_input.getText(((AritmContext)_localctx).pri.start,((AritmContext)_localctx).pri.stop):null));
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

	public static class GeoContext extends ParserRuleContext {
		public PriContext pri;
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public Op_geoContext op_geo() {
			return getRuleContext(Op_geoContext.class,0);
		}
		public MembfimContext membfim() {
			return getRuleContext(MembfimContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public GeoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geo; }
	}

	public final GeoContext geo() throws RecognitionException {
		GeoContext _localctx = new GeoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_geo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(AP);
			setState(199);
			((GeoContext)_localctx).pri = pri();
			setState(200);
			op_geo();
			setState(201);
			membfim();
			setState(202);
			match(FP);
			w.coletaOp((((GeoContext)_localctx).pri!=null?_input.getText(((GeoContext)_localctx).pri.start,((GeoContext)_localctx).pri.stop):null));
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

	public static class Cont_opContext extends ParserRuleContext {
		public Op_aritmContext op_aritm() {
			return getRuleContext(Op_aritmContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Cont_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_op; }
	}

	public final Cont_opContext cont_op() throws RecognitionException {
		Cont_opContext _localctx = new Cont_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cont_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			op_aritm();
			setState(206);
			calc();
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

	public static class Op_aritmContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(A3Parser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(A3Parser.SUB, 0); }
		public Op_aritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_aritm; }
	}

	public final Op_aritmContext op_aritm() throws RecognitionException {
		Op_aritmContext _localctx = new Op_aritmContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_aritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUB) ) {
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

	public static class Op_geoContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(A3Parser.DIV, 0); }
		public TerminalNode MULT() { return getToken(A3Parser.MULT, 0); }
		public Op_geoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_geo; }
	}

	public final Op_geoContext op_geo() throws RecognitionException {
		Op_geoContext _localctx = new Op_geoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_geo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MULT) ) {
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
		public Token ID;
		public TerminalNode LER() { return getToken(A3Parser.LER, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LER);
			setState(213);
			match(AP);
			setState(214);
			((LerContext)_localctx).ID = match(ID);
			setState(215);
			match(FP);
			setState(216);
			match(PV);
			w.ler((((LerContext)_localctx).ID!=null?((LerContext)_localctx).ID.getText():null));
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
		public TextoContext texto;
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
		enterRule(_localctx, 48, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ESCREVER);
			setState(220);
			match(AP);
			setState(221);
			((EscreverContext)_localctx).texto = texto();
			setState(222);
			match(FP);
			setState(223);
			match(PV);
			w.escreve((((EscreverContext)_localctx).texto!=null?_input.getText(((EscreverContext)_localctx).texto.start,((EscreverContext)_localctx).texto.stop):null));
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
		public DescritoContext descrito() {
			return getRuleContext(DescritoContext.class,0);
		}
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ASPAS);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASPAS:
				{
				setState(227);
				descrito();
				}
				break;
			case ID:
			case DG:
				{
				setState(228);
				pri();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
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

	public static class DescritoContext extends ParserRuleContext {
		public List<TerminalNode> ASPAS() { return getTokens(A3Parser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(A3Parser.ASPAS, i);
		}
		public TerminalNode TX() { return getToken(A3Parser.TX, 0); }
		public DescritoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descrito; }
	}

	public final DescritoContext descrito() throws RecognitionException {
		DescritoContext _localctx = new DescritoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_descrito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ASPAS);
			setState(234);
			match(TX);
			setState(235);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCANNER() { return getToken(A3Parser.SCANNER, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(SCANNER);
			setState(238);
			match(PV);
			w.scan();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5\5\5"+
		"c\n\5\3\5\5\5f\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\7\3"+
		"\7\5\7u\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\5\f\u0094\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00af\n\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\5"+
		"\21\u00b9\n\21\3\22\3\22\5\22\u00bd\n\22\3\22\3\22\3\23\3\23\5\23\u00c3"+
		"\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00e8\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\3\6\3\2\36\37\3\2\n\13\3"+
		"\2\f\r\2\u00f0\2:\3\2\2\2\4D\3\2\2\2\6\\\3\2\2\2\b_\3\2\2\2\nj\3\2\2\2"+
		"\ft\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22\u0081\3\2\2\2\24\u0085\3\2\2\2"+
		"\26\u008f\3\2\2\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36"+
		"\u00a7\3\2\2\2 \u00b2\3\2\2\2\"\u00bc\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3"+
		"\2\2\2(\u00c8\3\2\2\2*\u00cf\3\2\2\2,\u00d2\3\2\2\2.\u00d4\3\2\2\2\60"+
		"\u00d6\3\2\2\2\62\u00dd\3\2\2\2\64\u00e4\3\2\2\2\66\u00eb\3\2\2\28\u00ef"+
		"\3\2\2\2:;\b\2\1\2;<\b\2\1\2<=\7\16\2\2=>\b\2\1\2>?\5\4\3\2?@\7\17\2\2"+
		"@A\b\2\1\2AB\7\34\2\2BC\b\2\1\2C\3\3\2\2\2DE\b\3\1\2EF\7\30\2\2FG\b\3"+
		"\1\2GH\5\6\4\2HI\7\31\2\2IK\b\3\1\2JL\7\34\2\2KJ\3\2\2\2KL\3\2\2\2LM\3"+
		"\2\2\2MN\b\3\1\2NO\b\3\1\2O\5\3\2\2\2P[\5\b\5\2Q[\5\4\3\2R[\5\20\t\2S"+
		"[\5\34\17\2T[\5\n\6\2U[\5\36\20\2V[\5\24\13\2W[\5\60\31\2X[\5\62\32\2"+
		"Y[\58\35\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2"+
		"ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]\7\3\2\2\2^\\\3\2\2\2_`\5\16\b\2`b\7\36\2\2ac\7\22\2\2ba\3\2\2\2bc"+
		"\3\2\2\2ce\3\2\2\2df\5\30\r\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\34\2\2"+
		"hi\b\5\1\2i\t\3\2\2\2jk\7\36\2\2kl\7\22\2\2ln\5\f\7\2mo\7\34\2\2nm\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\b\6\1\2q\13\3\2\2\2ru\5\30\r\2su\5 \21\2tr"+
		"\3\2\2\2ts\3\2\2\2u\r\3\2\2\2vw\t\2\2\2w\17\3\2\2\2xy\7\26\2\2yz\7\32"+
		"\2\2z{\5\26\f\2{|\7\33\2\2|}\b\t\1\2}\177\5\4\3\2~\u0080\5\22\n\2\177"+
		"~\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7\27\2\2\u0082"+
		"\u0083\b\n\1\2\u0083\u0084\5\4\3\2\u0084\23\3\2\2\2\u0085\u0086\7\25\2"+
		"\2\u0086\u0087\7\32\2\2\u0087\u0088\b\13\1\2\u0088\u0089\5\b\5\2\u0089"+
		"\u008a\5\26\f\2\u008a\u008b\5\n\6\2\u008b\u008c\7\33\2\2\u008c\u008d\b"+
		"\13\1\2\u008d\u008e\5\4\3\2\u008e\25\3\2\2\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0093\5\32\16\2\u0092\u0094\7\34\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\f\1\2\u0096"+
		"\27\3\2\2\2\u0097\u0098\t\3\2\2\u0098\31\3\2\2\2\u0099\u009a\t\3\2\2\u009a"+
		"\33\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\b\17\1\2\u009d\u009e\5\4"+
		"\3\2\u009e\u009f\7\23\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\u00a3\7\33\2\2\u00a2\u00a4\7\34\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\17\1\2\u00a6\35\3\2\2\2\u00a7"+
		"\u00a8\7\23\2\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab"+
		"\7\33\2\2\u00ab\u00ac\b\20\1\2\u00ac\u00ae\5\4\3\2\u00ad\u00af\7\34\2"+
		"\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\b\20\1\2\u00b1\37\3\2\2\2\u00b2\u00b8\5$\23\2\u00b3\u00b9\5\"\22\2\u00b4"+
		"\u00b9\5*\26\2\u00b5\u00b7\7\34\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bd\5\30\r\2\u00bb\u00bd\5 \21\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\b\22\1\2\u00bf#\3\2\2\2\u00c0\u00c3\5&\24\2\u00c1\u00c3\5(\25\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c5\5\30\r\2"+
		"\u00c5\u00c6\5,\27\2\u00c6\u00c7\b\24\1\2\u00c7\'\3\2\2\2\u00c8\u00c9"+
		"\7\32\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\5.\30\2\u00cb\u00cc\5\"\22"+
		"\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\b\25\1\2\u00ce)\3\2\2\2\u00cf\u00d0"+
		"\5,\27\2\u00d0\u00d1\5 \21\2\u00d1+\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3"+
		"-\3\2\2\2\u00d4\u00d5\t\5\2\2\u00d5/\3\2\2\2\u00d6\u00d7\7\b\2\2\u00d7"+
		"\u00d8\7\32\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\7\33\2\2\u00da\u00db"+
		"\7\34\2\2\u00db\u00dc\b\31\1\2\u00dc\61\3\2\2\2\u00dd\u00de\7\t\2\2\u00de"+
		"\u00df\7\32\2\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2"+
		"\7\34\2\2\u00e2\u00e3\b\32\1\2\u00e3\63\3\2\2\2\u00e4\u00e7\7\35\2\2\u00e5"+
		"\u00e8\5\66\34\2\u00e6\u00e8\5\30\r\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\35\2\2\u00ea\65\3\2\2\2\u00eb"+
		"\u00ec\7\35\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7\35\2\2\u00ee\67\3\2"+
		"\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\b\35\1\2\u00f2"+
		"9\3\2\2\2\22KZ\\bent\177\u0093\u00a3\u00ae\u00b6\u00b8\u00bc\u00c2\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}