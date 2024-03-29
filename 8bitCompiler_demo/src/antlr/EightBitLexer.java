// Generated from grammar/EightBit.g4 by ANTLR 4.5.3
package eightBit.compile;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EightBitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NUMBER=24, 
		STRING=25, NOT=26, EQ=27, NEQ=28, LEQ=29, OR=30, TRUE=31, FALSE=32, MUL=33, 
		DIV=34, ADD=35, SUB=36, ID=37, SLC=38, MLC=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "NUMBER", "INTEGER", 
		"STRING", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", 
		"ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'main'", "'('", "')'", "','", "';'", "'let'", "'{'", "'}'", 
		"'='", "'while'", "'if'", "'else'", "'for'", "'return'", "'print_string'", 
		"'print_number'", "'print_boolean'", "'&&'", "'>'", "'<'", "'>='", "'null'", 
		null, null, "'!'", "'=='", "'!='", "'<='", "'||'", "'true'", "'false'", 
		"'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUMBER", "STRING", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", 
		"MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
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


	public EightBitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EightBit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\5\31\u00c2\n\31\3\31\3\31\3\31\5\31\u00c7\n\31\3\32\6\32\u00ca"+
		"\n\32\r\32\16\32\u00cb\3\33\3\33\7\33\u00d0\n\33\f\33\16\33\u00d3\13\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\7\'\u00fa\n\'\f\'\16\'\u00fd\13\'\3(\3(\3(\3(\7(\u0103\n(\f(\16"+
		"(\u0106\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0111\n)\f)\16)\u0114\13)\3"+
		")\5)\u0117\n)\3)\3)\3)\3)\3*\6*\u011e\n*\r*\16*\u011f\3*\3*\4\u0104\u0112"+
		"\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*\3\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62;"+
		"C\\aac|\5\2\13\f\17\17\"\"\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Y\3\2\2\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2"+
		"\2\2\rd\3\2\2\2\17f\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3"+
		"\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35~\3\2\2\2\37\u0082\3\2\2\2!\u0089\3\2"+
		"\2\2#\u0096\3\2\2\2%\u00a3\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3\2\2\2+\u00b6"+
		"\3\2\2\2-\u00b8\3\2\2\2/\u00bb\3\2\2\2\61\u00c1\3\2\2\2\63\u00c9\3\2\2"+
		"\2\65\u00cd\3\2\2\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00db\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e4\3\2\2\2C\u00e9\3\2\2\2E\u00ef\3\2\2\2G"+
		"\u00f1\3\2\2\2I\u00f3\3\2\2\2K\u00f5\3\2\2\2M\u00f7\3\2\2\2O\u00fe\3\2"+
		"\2\2Q\u010c\3\2\2\2S\u011d\3\2\2\2UV\7h\2\2VW\7w\2\2WX\7p\2\2X\4\3\2\2"+
		"\2YZ\7o\2\2Z[\7c\2\2[\\\7k\2\2\\]\7p\2\2]\6\3\2\2\2^_\7*\2\2_\b\3\2\2"+
		"\2`a\7+\2\2a\n\3\2\2\2bc\7.\2\2c\f\3\2\2\2de\7=\2\2e\16\3\2\2\2fg\7n\2"+
		"\2gh\7g\2\2hi\7v\2\2i\20\3\2\2\2jk\7}\2\2k\22\3\2\2\2lm\7\177\2\2m\24"+
		"\3\2\2\2no\7?\2\2o\26\3\2\2\2pq\7y\2\2qr\7j\2\2rs\7k\2\2st\7n\2\2tu\7"+
		"g\2\2u\30\3\2\2\2vw\7k\2\2wx\7h\2\2x\32\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7"+
		"u\2\2|}\7g\2\2}\34\3\2\2\2~\177\7h\2\2\177\u0080\7q\2\2\u0080\u0081\7"+
		"t\2\2\u0081\36\3\2\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7v\2\2\u0085\u0086\7w\2\2\u0086\u0087\7t\2\2\u0087\u0088\7p\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7a\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7i\2\2\u0095\"\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098"+
		"\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7a\2\2\u009c\u009d\7p\2\2\u009d\u009e\7w\2\2\u009e\u009f\7o\2\2"+
		"\u009f\u00a0\7d\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7t\2\2\u00a2$\3\2\2"+
		"\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa\7d\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7(\2"+
		"\2\u00b2\u00b3\7(\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5*\3\2\2\2"+
		"\u00b6\u00b7\7>\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba\7?\2"+
		"\2\u00ba.\3\2\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7"+
		"n\2\2\u00be\u00bf\7n\2\2\u00bf\60\3\2\2\2\u00c0\u00c2\7/\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\5\63\32\2"+
		"\u00c4\u00c5\7\60\2\2\u00c5\u00c7\5\63\32\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\62\3\2\2\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\64"+
		"\3\2\2\2\u00cd\u00d1\7$\2\2\u00ce\u00d0\n\3\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5\66\3\2\2\2\u00d6\u00d7"+
		"\7#\2\2\u00d78\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da:\3"+
		"\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00dd<\3\2\2\2\u00de\u00df"+
		"\7>\2\2\u00df\u00e0\7?\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7~\2\2\u00e2\u00e3"+
		"\7~\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7w\2\2\u00e7\u00e8\7g\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"D\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2"+
		"H\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6L"+
		"\3\2\2\2\u00f7\u00fb\t\4\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcN\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2\u0100\u0104"+
		"\3\2\2\2\u0101\u0103\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b(\2\2\u010bP\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7\61\2\2"+
		"\u010e\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0117\7\17\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\f\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\b)\2\2\u011bR\3\2\2\2\u011c\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\b*\2\2\u0122T\3\2\2\2\f\2\u00c1\u00c6\u00cb\u00d1\u00fb"+
		"\u0104\u0112\u0116\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}