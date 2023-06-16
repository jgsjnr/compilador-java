// Generated from .\A3.g4 by ANTLR 4.13.0
 
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class A3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CHAR=3, STRING=4, SCANNER=5, LER=6, ESCREVER=7, SOMA=8, 
		SUB=9, DIV=10, MULT=11, INICIO=12, FIM=13, OPREL=14, COMENTARIO=15, OP_ATR=16, 
		WHILE=17, DO=18, PARA=19, SE=20, SENAO=21, AC=22, FC=23, AP=24, FP=25, 
		PV=26, ASPAS=27, ID=28, DG=29, VL=30, TX=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "CHAR", "STRING", "SCANNER", "LER", "ESCREVER", "SOMA", 
			"SUB", "DIV", "MULT", "INICIO", "FIM", "OPREL", "COMENTARIO", "OP_ATR", 
			"WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", "PV", "ASPAS", 
			"ID", "DG", "VL", "TX", "WS", "AZMIN", "AZMAI", "DIGIT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'quebrado'", "'letra'", "'ideia'", "'scan'", "'ler'", 
			"'escrever'", "'+'", "'-'", "'/'", "'*'", "'inicio'", "'fim'", null, 
			"'//'", "'='", "'enquanto'", "'do'", "'para'", "'se'", "'senao'", "'{'", 
			"'}'", "'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "CHAR", "STRING", "SCANNER", "LER", "ESCREVER", 
			"SOMA", "SUB", "DIV", "MULT", "INICIO", "FIM", "OPREL", "COMENTARIO", 
			"OP_ATR", "WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", 
			"PV", "ASPAS", "ID", "DG", "VL", "TX", "WS"
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

	 
	    ControleVariavel cv = new ControleVariavel();
	    Saida w = new Saida(cv);


	public A3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000 \u0103\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0094\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0004\u001b\u00c2\b\u001b\u000b\u001b\f\u001b\u00c3"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00ca\b\u001b"+
		"\n\u001b\f\u001b\u00cd\t\u001b\u0001\u001c\u0004\u001c\u00d0\b\u001c\u000b"+
		"\u001c\f\u001c\u00d1\u0001\u001c\u0003\u001c\u00d5\b\u001c\u0001\u001c"+
		"\u0005\u001c\u00d8\b\u001c\n\u001c\f\u001c\u00db\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u00df\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0004"+
		"\u001e\u00e4\b\u001e\u000b\u001e\f\u001e\u00e5\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u00ec\b\u001e\n\u001e\f\u001e\u00ef"+
		"\t\u001e\u0004\u001e\u00f1\b\u001e\u000b\u001e\f\u001e\u00f2\u0001\u001f"+
		"\u0004\u001f\u00f6\b\u001f\u000b\u001f\f\u001f\u00f7\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0000"+
		"\u0000$\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A\u0000"+
		"C\u0000E\u0000G\u0000\u0001\u0000\u0006\u0002\u0000<<>>\u0002\u0000--"+
		"__\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0003\u0000\t\n\r\r  \u0114"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0001I\u0001\u0000"+
		"\u0000\u0000\u0003P\u0001\u0000\u0000\u0000\u0005Y\u0001\u0000\u0000\u0000"+
		"\u0007_\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000bj\u0001"+
		"\u0000\u0000\u0000\rn\u0001\u0000\u0000\u0000\u000fw\u0001\u0000\u0000"+
		"\u0000\u0011y\u0001\u0000\u0000\u0000\u0013{\u0001\u0000\u0000\u0000\u0015"+
		"}\u0001\u0000\u0000\u0000\u0017\u007f\u0001\u0000\u0000\u0000\u0019\u0086"+
		"\u0001\u0000\u0000\u0000\u001b\u0093\u0001\u0000\u0000\u0000\u001d\u0095"+
		"\u0001\u0000\u0000\u0000\u001f\u0098\u0001\u0000\u0000\u0000!\u009a\u0001"+
		"\u0000\u0000\u0000#\u00a3\u0001\u0000\u0000\u0000%\u00a6\u0001\u0000\u0000"+
		"\u0000\'\u00ab\u0001\u0000\u0000\u0000)\u00ae\u0001\u0000\u0000\u0000"+
		"+\u00b4\u0001\u0000\u0000\u0000-\u00b6\u0001\u0000\u0000\u0000/\u00b8"+
		"\u0001\u0000\u0000\u00001\u00ba\u0001\u0000\u0000\u00003\u00bc\u0001\u0000"+
		"\u0000\u00005\u00be\u0001\u0000\u0000\u00007\u00c1\u0001\u0000\u0000\u0000"+
		"9\u00cf\u0001\u0000\u0000\u0000;\u00de\u0001\u0000\u0000\u0000=\u00f0"+
		"\u0001\u0000\u0000\u0000?\u00f5\u0001\u0000\u0000\u0000A\u00fb\u0001\u0000"+
		"\u0000\u0000C\u00fd\u0001\u0000\u0000\u0000E\u00ff\u0001\u0000\u0000\u0000"+
		"G\u0101\u0001\u0000\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005o\u0000\u0000"+
		"KL\u0005r\u0000\u0000LM\u0005m\u0000\u0000MN\u0005a\u0000\u0000NO\u0005"+
		"l\u0000\u0000O\u0002\u0001\u0000\u0000\u0000PQ\u0005q\u0000\u0000QR\u0005"+
		"u\u0000\u0000RS\u0005e\u0000\u0000ST\u0005b\u0000\u0000TU\u0005r\u0000"+
		"\u0000UV\u0005a\u0000\u0000VW\u0005d\u0000\u0000WX\u0005o\u0000\u0000"+
		"X\u0004\u0001\u0000\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005e\u0000\u0000"+
		"[\\\u0005t\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005a\u0000\u0000^\u0006"+
		"\u0001\u0000\u0000\u0000_`\u0005i\u0000\u0000`a\u0005d\u0000\u0000ab\u0005"+
		"e\u0000\u0000bc\u0005i\u0000\u0000cd\u0005a\u0000\u0000d\b\u0001\u0000"+
		"\u0000\u0000ef\u0005s\u0000\u0000fg\u0005c\u0000\u0000gh\u0005a\u0000"+
		"\u0000hi\u0005n\u0000\u0000i\n\u0001\u0000\u0000\u0000jk\u0005l\u0000"+
		"\u0000kl\u0005e\u0000\u0000lm\u0005r\u0000\u0000m\f\u0001\u0000\u0000"+
		"\u0000no\u0005e\u0000\u0000op\u0005s\u0000\u0000pq\u0005c\u0000\u0000"+
		"qr\u0005r\u0000\u0000rs\u0005e\u0000\u0000st\u0005v\u0000\u0000tu\u0005"+
		"e\u0000\u0000uv\u0005r\u0000\u0000v\u000e\u0001\u0000\u0000\u0000wx\u0005"+
		"+\u0000\u0000x\u0010\u0001\u0000\u0000\u0000yz\u0005-\u0000\u0000z\u0012"+
		"\u0001\u0000\u0000\u0000{|\u0005/\u0000\u0000|\u0014\u0001\u0000\u0000"+
		"\u0000}~\u0005*\u0000\u0000~\u0016\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005i\u0000\u0000\u0080\u0081\u0005n\u0000\u0000\u0081\u0082\u0005i"+
		"\u0000\u0000\u0082\u0083\u0005c\u0000\u0000\u0083\u0084\u0005i\u0000\u0000"+
		"\u0084\u0085\u0005o\u0000\u0000\u0085\u0018\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005f\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089\u0005"+
		"m\u0000\u0000\u0089\u001a\u0001\u0000\u0000\u0000\u008a\u0094\u0007\u0000"+
		"\u0000\u0000\u008b\u008c\u0005>\u0000\u0000\u008c\u0094\u0005=\u0000\u0000"+
		"\u008d\u008e\u0005<\u0000\u0000\u008e\u0094\u0005=\u0000\u0000\u008f\u0090"+
		"\u0005=\u0000\u0000\u0090\u0094\u0005=\u0000\u0000\u0091\u0092\u0005!"+
		"\u0000\u0000\u0092\u0094\u0005=\u0000\u0000\u0093\u008a\u0001\u0000\u0000"+
		"\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000"+
		"\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u001c\u0001\u0000\u0000\u0000\u0095\u0096\u0005/\u0000\u0000"+
		"\u0096\u0097\u0005/\u0000\u0000\u0097\u001e\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005=\u0000\u0000\u0099 \u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"e\u0000\u0000\u009b\u009c\u0005n\u0000\u0000\u009c\u009d\u0005q\u0000"+
		"\u0000\u009d\u009e\u0005u\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f"+
		"\u00a0\u0005n\u0000\u0000\u00a0\u00a1\u0005t\u0000\u0000\u00a1\u00a2\u0005"+
		"o\u0000\u0000\u00a2\"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005d\u0000"+
		"\u0000\u00a4\u00a5\u0005o\u0000\u0000\u00a5$\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005p\u0000\u0000\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005"+
		"r\u0000\u0000\u00a9\u00aa\u0005a\u0000\u0000\u00aa&\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005s\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad"+
		"(\u0001\u0000\u0000\u0000\u00ae\u00af\u0005s\u0000\u0000\u00af\u00b0\u0005"+
		"e\u0000\u0000\u00b0\u00b1\u0005n\u0000\u0000\u00b1\u00b2\u0005a\u0000"+
		"\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3*\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005{\u0000\u0000\u00b5,\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"}\u0000\u0000\u00b7.\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005(\u0000"+
		"\u0000\u00b90\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb"+
		"2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005;\u0000\u0000\u00bd4\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf6\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0003A \u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c5\u00ca\u0003A \u0000\u00c6\u00ca\u0003C!\u0000\u00c7\u00ca\u0003"+
		"E\"\u0000\u00c8\u00ca\u0005_\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc8\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0003E\"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0005.\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d9\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0003E\"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da:\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00df\u00037\u001b\u0000\u00dd\u00df\u0003E\"\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df<\u0001\u0000\u0000\u0000\u00e0\u00e4\u0003A \u0000\u00e1\u00e4"+
		"\u0003C!\u0000\u00e2\u00e4\u0003E\"\u0000\u00e3\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ec\u0003A \u0000\u00e8\u00ec\u0003C!\u0000\u00e9\u00ec"+
		"\u0003E\"\u0000\u00ea\u00ec\u0007\u0001\u0000\u0000\u00eb\u00e7\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3>\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003G#"+
		"\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006\u001f\u0000"+
		"\u0000\u00fa@\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0002\u0000\u0000"+
		"\u00fcB\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0003\u0000\u0000\u00fe"+
		"D\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0004\u0000\u0000\u0100F\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0007\u0005\u0000\u0000\u0102H\u0001\u0000"+
		"\u0000\u0000\u000f\u0000\u0093\u00c3\u00c9\u00cb\u00d1\u00d4\u00d9\u00de"+
		"\u00e3\u00e5\u00eb\u00ed\u00f2\u00f7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}