// Generated from c:\Users\jose\Desktop\UAM\Teoria da Computação e Compiladores\A3\A3.g4 by ANTLR 4.9.2
 import java.util.*; 
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OPREL=7, LINE_COMMENT=8, 
		OP_ATR=9, AC=10, FC=11, AP=12, FP=13, PV=14, ID=15, VL=16, NUM=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OPREL", "LINE_COMMENT", 
			"OP_ATR", "AC", "FC", "AP", "FP", "PV", "ID", "VL", "NUM", "WS", "AZMIN", 
			"AZMAI", "DIGIT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'int'", "'letra'", "'quebrado'", "'ideia'", 
			null, "'//'", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "OPREL", "LINE_COMMENT", "OP_ATR", 
			"AC", "FC", "AP", "FP", "PV", "ID", "VL", "NUM", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20r\n\20\f\20\16"+
		"\20u\13\20\3\21\3\21\5\21y\n\21\3\22\6\22|\n\22\r\22\16\22}\3\23\6\23"+
		"\u0081\n\23\r\23\16\23\u0082\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2\3\2\7\4\2>>@@\3\2c|\3\2"+
		"C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3/\3\2\2\2\5\66\3"+
		"\2\2\2\7:\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rM\3\2\2\2\17\\\3\2\2\2\21^\3"+
		"\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35"+
		"k\3\2\2\2\37m\3\2\2\2!x\3\2\2\2#{\3\2\2\2%\u0080\3\2\2\2\'\u0086\3\2\2"+
		"\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\60\7k\2\2\60\61\7p\2"+
		"\2\61\62\7k\2\2\62\63\7e\2\2\63\64\7k\2\2\64\65\7q\2\2\65\4\3\2\2\2\66"+
		"\67\7h\2\2\678\7k\2\289\7o\2\29\6\3\2\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2="+
		"\b\3\2\2\2>?\7n\2\2?@\7g\2\2@A\7v\2\2AB\7t\2\2BC\7c\2\2C\n\3\2\2\2DE\7"+
		"s\2\2EF\7w\2\2FG\7g\2\2GH\7d\2\2HI\7t\2\2IJ\7c\2\2JK\7f\2\2KL\7q\2\2L"+
		"\f\3\2\2\2MN\7k\2\2NO\7f\2\2OP\7g\2\2PQ\7k\2\2QR\7c\2\2R\16\3\2\2\2S]"+
		"\t\2\2\2TU\7@\2\2U]\7?\2\2VW\7>\2\2W]\7?\2\2XY\7?\2\2Y]\7?\2\2Z[\7#\2"+
		"\2[]\7?\2\2\\S\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\X\3\2\2\2\\Z\3\2\2\2]\20"+
		"\3\2\2\2^_\7\61\2\2_`\7\61\2\2`\22\3\2\2\2ab\7?\2\2b\24\3\2\2\2cd\7}\2"+
		"\2d\26\3\2\2\2ef\7\177\2\2f\30\3\2\2\2gh\7*\2\2h\32\3\2\2\2ij\7+\2\2j"+
		"\34\3\2\2\2kl\7=\2\2l\36\3\2\2\2ms\5\'\24\2nr\5\'\24\2or\5)\25\2pr\5+"+
		"\26\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t \3"+
		"\2\2\2us\3\2\2\2vy\5\37\20\2wy\5+\26\2xv\3\2\2\2xw\3\2\2\2y\"\3\2\2\2"+
		"z|\5+\26\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~$\3\2\2\2\177\u0081"+
		"\5-\27\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\23\2\2\u0085&\3\2\2\2"+
		"\u0086\u0087\t\3\2\2\u0087(\3\2\2\2\u0088\u0089\t\4\2\2\u0089*\3\2\2\2"+
		"\u008a\u008b\t\5\2\2\u008b,\3\2\2\2\u008c\u008d\t\6\2\2\u008d.\3\2\2\2"+
		"\t\2\\qsx}\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}