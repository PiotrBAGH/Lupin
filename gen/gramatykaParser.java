// Generated from C:/Users/Piotrek/Desktop/lupin_antlr/src/gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SELECT=5, FROM=6, WHERE=7, AND=8, OR=9, 
		INSERT=10, INTO=11, VALUES=12, UPDATE=13, SET=14, DELETE=15, CREATE=16, 
		TABLE=17, DROP=18, PRIMARY_KEY=19, SEMICOLON=20, EQUAL=21, NOT_EQUAL=22, 
		GREATER_THAN=23, LESS_THAN=24, GREATER_EQUAL=25, LESS_EQUAL=26, INT=27, 
		VARCHAR=28, BOOLEAN=29, DATE=30, FLOAT=31, IDENTIFIER=32, STRING_LITERAL=33, 
		NUMERIC_LITERAL=34, WS=35;
	public static final int
		RULE_start = 0, RULE_sqlStatement = 1, RULE_selectStatement = 2, RULE_createTableStatement = 3, 
		RULE_dropTableStatement = 4, RULE_insertIntoStatement = 5, RULE_deleteFromStatement = 6, 
		RULE_columnDefinitionList = 7, RULE_columnDefinition = 8, RULE_columnNameList = 9, 
		RULE_valueList = 10, RULE_value = 11, RULE_tableName = 12, RULE_columnName = 13, 
		RULE_selectList = 14, RULE_dataType = 15, RULE_expression = 16, RULE_term = 17, 
		RULE_factor = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sqlStatement", "selectStatement", "createTableStatement", "dropTableStatement", 
			"insertIntoStatement", "deleteFromStatement", "columnDefinitionList", 
			"columnDefinition", "columnNameList", "valueList", "value", "tableName", 
			"columnName", "selectList", "dataType", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", 
			"'OR'", "'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", 
			"'CREATE'", "'TABLE'", "'DROP'", "'PRIMARY KEY'", "';'", "'='", null, 
			"'>'", "'<'", "'>='", "'<='", "'INT'", "'VARCHAR'", "'BOOLEAN'", "'DATE'", 
			"'FLOAT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", 
			"INSERT", "INTO", "VALUES", "UPDATE", "SET", "DELETE", "CREATE", "TABLE", 
			"DROP", "PRIMARY_KEY", "SEMICOLON", "EQUAL", "NOT_EQUAL", "GREATER_THAN", 
			"LESS_THAN", "GREATER_EQUAL", "LESS_EQUAL", "INT", "VARCHAR", "BOOLEAN", 
			"DATE", "FLOAT", "IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL", "WS"
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
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				sqlStatement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 361504L) != 0) );
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
	public static class SqlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public DropTableStatementContext dropTableStatement() {
			return getRuleContext(DropTableStatementContext.class,0);
		}
		public InsertIntoStatementContext insertIntoStatement() {
			return getRuleContext(InsertIntoStatementContext.class,0);
		}
		public DeleteFromStatementContext deleteFromStatement() {
			return getRuleContext(DeleteFromStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				selectStatement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				createTableStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				dropTableStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				insertIntoStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				deleteFromStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(gramatykaParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(gramatykaParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramatykaParser.SEMICOLON, 0); }
		public TerminalNode WHERE() { return getToken(gramatykaParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(SELECT);
			setState(51);
			selectList();
			setState(52);
			match(FROM);
			setState(53);
			tableName();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(54);
				match(WHERE);
				setState(55);
				expression();
				}
			}

			setState(58);
			match(SEMICOLON);
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
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(gramatykaParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(gramatykaParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnDefinitionListContext columnDefinitionList() {
			return getRuleContext(ColumnDefinitionListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramatykaParser.SEMICOLON, 0); }
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitCreateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitCreateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CREATE);
			setState(61);
			match(TABLE);
			setState(62);
			tableName();
			setState(63);
			match(T__0);
			setState(64);
			columnDefinitionList();
			setState(65);
			match(T__1);
			setState(66);
			match(SEMICOLON);
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
	public static class DropTableStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(gramatykaParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(gramatykaParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramatykaParser.SEMICOLON, 0); }
		public DropTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDropTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDropTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitDropTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableStatementContext dropTableStatement() throws RecognitionException {
		DropTableStatementContext _localctx = new DropTableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dropTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DROP);
			setState(69);
			match(TABLE);
			setState(70);
			tableName();
			setState(71);
			match(SEMICOLON);
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
	public static class InsertIntoStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(gramatykaParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(gramatykaParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(gramatykaParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramatykaParser.SEMICOLON, 0); }
		public InsertIntoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertIntoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInsertIntoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInsertIntoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInsertIntoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoStatementContext insertIntoStatement() throws RecognitionException {
		InsertIntoStatementContext _localctx = new InsertIntoStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insertIntoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(INSERT);
			setState(74);
			match(INTO);
			setState(75);
			tableName();
			setState(76);
			match(T__0);
			setState(77);
			columnNameList();
			setState(78);
			match(T__1);
			setState(79);
			match(VALUES);
			setState(80);
			match(T__0);
			setState(81);
			valueList();
			setState(82);
			match(T__1);
			setState(83);
			match(SEMICOLON);
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
	public static class DeleteFromStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(gramatykaParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(gramatykaParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramatykaParser.SEMICOLON, 0); }
		public TerminalNode WHERE() { return getToken(gramatykaParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteFromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDeleteFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDeleteFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitDeleteFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFromStatementContext deleteFromStatement() throws RecognitionException {
		DeleteFromStatementContext _localctx = new DeleteFromStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deleteFromStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DELETE);
			setState(86);
			match(FROM);
			setState(87);
			tableName();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(88);
				match(WHERE);
				setState(89);
				expression();
				}
			}

			setState(92);
			match(SEMICOLON);
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
	public static class ColumnDefinitionListContext extends ParserRuleContext {
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public ColumnDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterColumnDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitColumnDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitColumnDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionListContext columnDefinitionList() throws RecognitionException {
		ColumnDefinitionListContext _localctx = new ColumnDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			columnDefinition();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(95);
				match(T__2);
				setState(96);
				columnDefinition();
				}
				}
				setState(101);
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
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode PRIMARY_KEY() { return getToken(gramatykaParser.PRIMARY_KEY, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			columnName();
			setState(103);
			dataType();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY_KEY) {
				{
				setState(104);
				match(PRIMARY_KEY);
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
	public static class ColumnNameListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			columnName();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(108);
				match(T__2);
				setState(109);
				columnName();
				}
				}
				setState(114);
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			value();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(116);
				match(T__2);
				setState(117);
				value();
				}
				}
				setState(122);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(gramatykaParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gramatykaParser.STRING_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramatykaParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER);
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramatykaParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IDENTIFIER);
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
	public static class SelectListContext extends ParserRuleContext {
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectList);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				columnNameList();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramatykaParser.INT, 0); }
		public TerminalNode VARCHAR() { return getToken(gramatykaParser.VARCHAR, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(gramatykaParser.NUMERIC_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramatykaParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(gramatykaParser.DATE, 0); }
		public TerminalNode FLOAT() { return getToken(gramatykaParser.FLOAT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dataType);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(INT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(VARCHAR);
				setState(135);
				match(T__0);
				setState(136);
				match(NUMERIC_LITERAL);
				setState(137);
				match(T__1);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(DATE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(gramatykaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(gramatykaParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(gramatykaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(gramatykaParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			term();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				term();
				}
				}
				setState(150);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(gramatykaParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(gramatykaParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(gramatykaParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(gramatykaParser.LESS_THAN, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(gramatykaParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(gramatykaParser.LESS_EQUAL, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			factor();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				factor();
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
	public static class FactorContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(gramatykaParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(gramatykaParser.NUMERIC_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				columnName();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(NUMERIC_LITERAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__0);
				setState(160);
				expression();
				setState(161);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001#\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007b\b"+
		"\u0007\n\u0007\f\u0007e\t\u0007\u0001\b\u0001\b\u0001\b\u0003\bj\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\to\b\t\n\t\f\tr\t\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\nw\b\n\n\n\f\nz\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u0084\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u008e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0093\b\u0010\n\u0010\f\u0010\u0096\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u009b\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a4\b\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003\u0001\u0000"+
		"!\"\u0001\u0000\b\t\u0001\u0000\u0015\u001a\u00a7\u0000\'\u0001\u0000"+
		"\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000"+
		"\u0006<\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nI\u0001\u0000"+
		"\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000"+
		"\u0010f\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014s"+
		"\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018}\u0001\u0000"+
		"\u0000\u0000\u001a\u007f\u0001\u0000\u0000\u0000\u001c\u0083\u0001\u0000"+
		"\u0000\u0000\u001e\u008d\u0001\u0000\u0000\u0000 \u008f\u0001\u0000\u0000"+
		"\u0000\"\u0097\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001"+
		"\u0000\u0000\u0000+1\u0003\u0004\u0002\u0000,1\u0003\u0006\u0003\u0000"+
		"-1\u0003\b\u0004\u0000.1\u0003\n\u0005\u0000/1\u0003\f\u0006\u00000+\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000023\u0005\u0005\u0000\u000034\u0003\u001c\u000e\u000045\u0005"+
		"\u0006\u0000\u000058\u0003\u0018\f\u000067\u0005\u0007\u0000\u000079\u0003"+
		" \u0010\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0014\u0000\u0000;\u0005\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u0011\u0000\u0000>?\u0003\u0018"+
		"\f\u0000?@\u0005\u0001\u0000\u0000@A\u0003\u000e\u0007\u0000AB\u0005\u0002"+
		"\u0000\u0000BC\u0005\u0014\u0000\u0000C\u0007\u0001\u0000\u0000\u0000"+
		"DE\u0005\u0012\u0000\u0000EF\u0005\u0011\u0000\u0000FG\u0003\u0018\f\u0000"+
		"GH\u0005\u0014\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\n\u0000"+
		"\u0000JK\u0005\u000b\u0000\u0000KL\u0003\u0018\f\u0000LM\u0005\u0001\u0000"+
		"\u0000MN\u0003\u0012\t\u0000NO\u0005\u0002\u0000\u0000OP\u0005\f\u0000"+
		"\u0000PQ\u0005\u0001\u0000\u0000QR\u0003\u0014\n\u0000RS\u0005\u0002\u0000"+
		"\u0000ST\u0005\u0014\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005"+
		"\u000f\u0000\u0000VW\u0005\u0006\u0000\u0000WZ\u0003\u0018\f\u0000XY\u0005"+
		"\u0007\u0000\u0000Y[\u0003 \u0010\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u0014\u0000\u0000"+
		"]\r\u0001\u0000\u0000\u0000^c\u0003\u0010\b\u0000_`\u0005\u0003\u0000"+
		"\u0000`b\u0003\u0010\b\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000f\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003\u001a\r\u0000gi\u0003"+
		"\u001e\u000f\u0000hj\u0005\u0013\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kp\u0003\u001a"+
		"\r\u0000lm\u0005\u0003\u0000\u0000mo\u0003\u001a\r\u0000nl\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000sx\u0003\u0016\u000b\u0000tu\u0005\u0003\u0000\u0000uw\u0003\u0016"+
		"\u000b\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0015\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000\u0000|\u0017\u0001"+
		"\u0000\u0000\u0000}~\u0005 \u0000\u0000~\u0019\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005 \u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0005\u0004\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u001d"+
		"\u0001\u0000\u0000\u0000\u0085\u008e\u0005\u001b\u0000\u0000\u0086\u0087"+
		"\u0005\u001c\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089"+
		"\u0005\"\u0000\u0000\u0089\u008e\u0005\u0002\u0000\u0000\u008a\u008e\u0005"+
		"\u001d\u0000\u0000\u008b\u008e\u0005\u001e\u0000\u0000\u008c\u008e\u0005"+
		"\u001f\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u0086\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u001f\u0001"+
		"\u0000\u0000\u0000\u008f\u0094\u0003\"\u0011\u0000\u0090\u0091\u0007\u0001"+
		"\u0000\u0000\u0091\u0093\u0003\"\u0011\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095!\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0003$\u0012\u0000\u0098"+
		"\u0099\u0007\u0002\u0000\u0000\u0099\u009b\u0003$\u0012\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b#\u0001"+
		"\u0000\u0000\u0000\u009c\u00a4\u0003\u001a\r\u0000\u009d\u00a4\u0005!"+
		"\u0000\u0000\u009e\u00a4\u0005\"\u0000\u0000\u009f\u00a0\u0005\u0001\u0000"+
		"\u0000\u00a0\u00a1\u0003 \u0010\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000"+
		"\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000"+
		"\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4%\u0001\u0000\u0000\u0000\r"+
		")08Zcipx\u0083\u008d\u0094\u009a\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}