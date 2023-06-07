// Generated from c:\Users\jose\Desktop\UAM\Teoria da Computação e Compiladores\A3\A3.g4 by ANTLR 4.9.2
 
    import java.util.*;
    import java.io.*;
    import java.util.ArrayList;
    import java.io.FileWriter;
    import java.io.IOException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INICIO=5, FIM=6, OPREL=7, COMENTARIO=8, 
		OP_ATR=9, WHILE=10, DO=11, PARA=12, SE=13, SENAO=14, AC=15, FC=16, AP=17, 
		FP=18, PV=19, ID=20, VL=21, VL2=22, NUM=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "INICIO", "FIM", "OPREL", "COMENTARIO", 
			"OP_ATR", "WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", 
			"PV", "ID", "VL", "VL2", "NUM", "WS", "AZMIN", "AZMAI", "DIGIT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'letra'", "'quebrado'", "'ideia'", "'inicio'", "'fim'", 
			null, "'//'", "'='", "'enquanto'", "'do'", "'para'", "'se'", "'senao'", 
			"'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INICIO", "FIM", "OPREL", "COMENTARIO", 
			"OP_ATR", "WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", 
			"PV", "ID", "VL", "VL2", "NUM", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009b\n\25\f\25\16\25\u009e"+
		"\13\25\3\26\3\26\5\26\u00a2\n\26\3\27\3\27\5\27\u00a6\n\27\3\30\6\30\u00a9"+
		"\n\30\r\30\16\30\u00aa\3\31\6\31\u00ae\n\31\r\31\16\31\u00af\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\2\65\2\67\29\2\3\2\7\4\2>>@@\3\2c|\3\2C\\\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3;\3\2\2\2\5B\3\2\2\2"+
		"\7H\3\2\2\2\tQ\3\2\2\2\13W\3\2\2\2\r^\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2"+
		"\23p\3\2\2\2\25r\3\2\2\2\27{\3\2\2\2\31~\3\2\2\2\33\u0083\3\2\2\2\35\u0086"+
		"\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2"+
		"\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u00a1\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00ad\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2"+
		"\2\29\u00b9\3\2\2\2;<\7p\2\2<=\7q\2\2=>\7t\2\2>?\7o\2\2?@\7c\2\2@A\7n"+
		"\2\2A\4\3\2\2\2BC\7n\2\2CD\7g\2\2DE\7v\2\2EF\7t\2\2FG\7c\2\2G\6\3\2\2"+
		"\2HI\7s\2\2IJ\7w\2\2JK\7g\2\2KL\7d\2\2LM\7t\2\2MN\7c\2\2NO\7f\2\2OP\7"+
		"q\2\2P\b\3\2\2\2QR\7k\2\2RS\7f\2\2ST\7g\2\2TU\7k\2\2UV\7c\2\2V\n\3\2\2"+
		"\2WX\7k\2\2XY\7p\2\2YZ\7k\2\2Z[\7e\2\2[\\\7k\2\2\\]\7q\2\2]\f\3\2\2\2"+
		"^_\7h\2\2_`\7k\2\2`a\7o\2\2a\16\3\2\2\2bl\t\2\2\2cd\7@\2\2dl\7?\2\2ef"+
		"\7>\2\2fl\7?\2\2gh\7?\2\2hl\7?\2\2ij\7#\2\2jl\7?\2\2kb\3\2\2\2kc\3\2\2"+
		"\2ke\3\2\2\2kg\3\2\2\2ki\3\2\2\2l\20\3\2\2\2mn\7\61\2\2no\7\61\2\2o\22"+
		"\3\2\2\2pq\7?\2\2q\24\3\2\2\2rs\7g\2\2st\7p\2\2tu\7s\2\2uv\7w\2\2vw\7"+
		"c\2\2wx\7p\2\2xy\7v\2\2yz\7q\2\2z\26\3\2\2\2{|\7f\2\2|}\7q\2\2}\30\3\2"+
		"\2\2~\177\7r\2\2\177\u0080\7c\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2"+
		"\2\u0082\32\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\34\3\2"+
		"\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7q\2\2\u008b\36\3\2\2\2\u008c\u008d\7}\2\2\u008d "+
		"\3\2\2\2\u008e\u008f\7\177\2\2\u008f\"\3\2\2\2\u0090\u0091\7*\2\2\u0091"+
		"$\3\2\2\2\u0092\u0093\7+\2\2\u0093&\3\2\2\2\u0094\u0095\7=\2\2\u0095("+
		"\3\2\2\2\u0096\u009c\5\63\32\2\u0097\u009b\5\63\32\2\u0098\u009b\5\65"+
		"\33\2\u0099\u009b\5\67\34\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d*\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\5)\25\2\u00a0\u00a2"+
		"\5/\30\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2,\3\2\2\2\u00a3"+
		"\u00a6\5)\25\2\u00a4\u00a6\5/\30\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6.\3\2\2\2\u00a7\u00a9\5\67\34\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\60\3\2\2\2\u00ac"+
		"\u00ae\59\35\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\31\2\2\u00b2"+
		"\62\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b88\3\2\2\2\u00b9\u00ba\t\6\2\2\u00ba"+
		":\3\2\2\2\n\2k\u009a\u009c\u00a1\u00a5\u00aa\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}