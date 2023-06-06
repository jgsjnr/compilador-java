// Generated from A3.g4 by ANTLR 4.13.0
 import java.util.*; 
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
			"AZMAI", "DIGIT"
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
		"\u0004\u0000\u0012\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000en\b\u000e\n\u000e\f\u000e"+
		"q\t\u000e\u0001\u000f\u0001\u000f\u0003\u000fu\b\u000f\u0001\u0010\u0004"+
		"\u0010x\b\u0010\u000b\u0010\f\u0010y\u0001\u0011\u0004\u0011}\b\u0011"+
		"\u000b\u0011\f\u0011~\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0000\'\u0000)\u0000\u0001\u0000\u0005"+
		"\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0001\u0000az\u0001\u0000AZ\u0001"+
		"\u000009\u008e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001+"+
		"\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00056\u0001\u0000"+
		"\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000"+
		"\u000bI\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000fZ\u0001"+
		"\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013_\u0001\u0000\u0000"+
		"\u0000\u0015a\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019"+
		"e\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000\u001di\u0001"+
		"\u0000\u0000\u0000\u001ft\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000"+
		"\u0000#|\u0001\u0000\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u0084"+
		"\u0001\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005n\u0000\u0000-.\u0005i\u0000\u0000./\u0005c\u0000\u0000"+
		"/0\u0005i\u0000\u000001\u0005o\u0000\u00001\u0002\u0001\u0000\u0000\u0000"+
		"23\u0005f\u0000\u000034\u0005i\u0000\u000045\u0005m\u0000\u00005\u0004"+
		"\u0001\u0000\u0000\u000067\u0005i\u0000\u000078\u0005n\u0000\u000089\u0005"+
		"t\u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005l\u0000\u0000;<\u0005"+
		"e\u0000\u0000<=\u0005t\u0000\u0000=>\u0005r\u0000\u0000>?\u0005a\u0000"+
		"\u0000?\b\u0001\u0000\u0000\u0000@A\u0005q\u0000\u0000AB\u0005u\u0000"+
		"\u0000BC\u0005e\u0000\u0000CD\u0005b\u0000\u0000DE\u0005r\u0000\u0000"+
		"EF\u0005a\u0000\u0000FG\u0005d\u0000\u0000GH\u0005o\u0000\u0000H\n\u0001"+
		"\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005d\u0000\u0000KL\u0005e"+
		"\u0000\u0000LM\u0005i\u0000\u0000MN\u0005a\u0000\u0000N\f\u0001\u0000"+
		"\u0000\u0000OY\u0007\u0000\u0000\u0000PQ\u0005>\u0000\u0000QY\u0005=\u0000"+
		"\u0000RS\u0005<\u0000\u0000SY\u0005=\u0000\u0000TU\u0005=\u0000\u0000"+
		"UY\u0005=\u0000\u0000VW\u0005!\u0000\u0000WY\u0005=\u0000\u0000XO\u0001"+
		"\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\u000e\u0001\u0000"+
		"\u0000\u0000Z[\u0005/\u0000\u0000[\\\u0005/\u0000\u0000\\\u0010\u0001"+
		"\u0000\u0000\u0000]^\u0005=\u0000\u0000^\u0012\u0001\u0000\u0000\u0000"+
		"_`\u0005{\u0000\u0000`\u0014\u0001\u0000\u0000\u0000ab\u0005}\u0000\u0000"+
		"b\u0016\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000d\u0018\u0001\u0000"+
		"\u0000\u0000ef\u0005)\u0000\u0000f\u001a\u0001\u0000\u0000\u0000gh\u0005"+
		";\u0000\u0000h\u001c\u0001\u0000\u0000\u0000io\u0003%\u0012\u0000jn\u0003"+
		"%\u0012\u0000kn\u0003\'\u0013\u0000ln\u0003)\u0014\u0000mj\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\u001e\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000ru\u0003\u001d"+
		"\u000e\u0000su\u0003)\u0014\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000u \u0001\u0000\u0000\u0000vx\u0003)\u0014\u0000wv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\"\u0001\u0000\u0000\u0000{}\u0007\u0001\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0006\u0011\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0007\u0002\u0000\u0000\u0083&\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0007\u0003\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086\u0087\u0007"+
		"\u0004\u0000\u0000\u0087*\u0001\u0000\u0000\u0000\u0007\u0000Xmoty~\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}