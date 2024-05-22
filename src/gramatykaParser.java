// Generated from C:/Users/Piotrek/Desktop/Lupin/src/gramatyka.g4 by ANTLR 4.13.1
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
		TABLE=17, DROP=18, PRIMARY_KEY=19, NOT_NULL=20, DEFAULT=21, SEMICOLON=22, 
		EQUAL=23, NOT_EQUAL=24, GREATER_THAN=25, LESS_THAN=26, GREATER_EQUAL=27, 
		LESS_EQUAL=28, IS=29, NOT=30, NULL=31, INT=32, VARCHAR=33, BOOLEAN=34, 
		DATE=35, FLOAT=36, DECIMAL=37, IDENTIFIER=38, STRING_LITERAL=39, NUMERIC_LITERAL=40, 
		WS=41;
	public static final int
		RULE_start = 0, RULE_sqlStatement = 1, RULE_selectStatement = 2, RULE_createTableStatement = 3, 
		RULE_dropTableStatement = 4, RULE_insertIntoStatement = 5, RULE_deleteFromStatement = 6, 
		RULE_columnDefinitionList = 7, RULE_columnDefinition = 8, RULE_columnConstraint = 9, 
		RULE_columnNameList = 10, RULE_valueList = 11, RULE_value = 12, RULE_tableName = 13, 
		RULE_columnName = 14, RULE_selectList = 15, RULE_dataType = 16, RULE_expression = 17, 
		RULE_term = 18, RULE_factor = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sqlStatement", "selectStatement", "createTableStatement", "dropTableStatement", 
			"insertIntoStatement", "deleteFromStatement", "columnDefinitionList", 
			"columnDefinition", "columnConstraint", "columnNameList", "valueList", 
			"value", "tableName", "columnName", "selectList", "dataType", "expression", 
			"term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", 
			"'OR'", "'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", 
			"'CREATE'", "'TABLE'", "'DROP'", "'PRIMARY KEY'", "'NOT NULL'", "'DEFAULT'", 
			"';'", "'='", null, "'>'", "'<'", "'>='", "'<='", "'IS'", "'NOT'", "'NULL'", 
			"'INT'", "'VARCHAR'", "'BOOLEAN'", "'DATE'", "'FLOAT'", "'DECIMAL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", 
			"INSERT", "INTO", "VALUES", "UPDATE", "SET", "DELETE", "CREATE", "TABLE", 
			"DROP", "PRIMARY_KEY", "NOT_NULL", "DEFAULT", "SEMICOLON", "EQUAL", "NOT_EQUAL", 
			"GREATER_THAN", "LESS_THAN", "GREATER_EQUAL", "LESS_EQUAL", "IS", "NOT", 
			"NULL", "INT", "VARCHAR", "BOOLEAN", "DATE", "FLOAT", "DECIMAL", "IDENTIFIER", 
			"STRING_LITERAL", "NUMERIC_LITERAL", "WS"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				sqlStatement();
				}
				}
				setState(43); 
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				selectStatement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				createTableStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				dropTableStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				insertIntoStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
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
			setState(52);
			match(SELECT);
			setState(53);
			selectList();
			setState(54);
			match(FROM);
			setState(55);
			tableName();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(56);
				match(WHERE);
				setState(57);
				expression();
				}
			}

			setState(60);
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
			setState(62);
			match(CREATE);
			setState(63);
			match(TABLE);
			setState(64);
			tableName();
			setState(65);
			match(T__0);
			setState(66);
			columnDefinitionList();
			setState(67);
			match(T__1);
			setState(68);
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
			setState(70);
			match(DROP);
			setState(71);
			match(TABLE);
			setState(72);
			tableName();
			setState(73);
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
			setState(75);
			match(INSERT);
			setState(76);
			match(INTO);
			setState(77);
			tableName();
			setState(78);
			match(T__0);
			setState(79);
			columnNameList();
			setState(80);
			match(T__1);
			setState(81);
			match(VALUES);
			setState(82);
			match(T__0);
			setState(83);
			valueList();
			setState(84);
			match(T__1);
			setState(85);
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
			setState(87);
			match(DELETE);
			setState(88);
			match(FROM);
			setState(89);
			tableName();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(90);
				match(WHERE);
				setState(91);
				expression();
				}
			}

			setState(94);
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
			setState(96);
			columnDefinition();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(97);
				match(T__2);
				setState(98);
				columnDefinition();
				}
				}
				setState(103);
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
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
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
			setState(104);
			columnName();
			setState(105);
			dataType();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(106);
				columnConstraint();
				}
				}
				setState(111);
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
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY_KEY() { return getToken(gramatykaParser.PRIMARY_KEY, 0); }
		public TerminalNode NOT_NULL() { return getToken(gramatykaParser.NOT_NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(gramatykaParser.DEFAULT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnConstraint);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(PRIMARY_KEY);
				}
				break;
			case NOT_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(NOT_NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(DEFAULT);
				setState(115);
				value();
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
		enterRule(_localctx, 20, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			columnName();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(119);
				match(T__2);
				setState(120);
				columnName();
				}
				}
				setState(125);
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
		enterRule(_localctx, 22, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			value();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				setState(128);
				value();
				}
				}
				setState(133);
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
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 26, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 28, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 30, RULE_selectList);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
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
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(gramatykaParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(gramatykaParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode BOOLEAN() { return getToken(gramatykaParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(gramatykaParser.DATE, 0); }
		public TerminalNode FLOAT() { return getToken(gramatykaParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(gramatykaParser.DECIMAL, 0); }
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
		enterRule(_localctx, 32, RULE_dataType);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(INT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(VARCHAR);
				setState(146);
				match(T__0);
				setState(147);
				match(NUMERIC_LITERAL);
				setState(148);
				match(T__1);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(DATE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(FLOAT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(DECIMAL);
				setState(153);
				match(T__0);
				setState(154);
				match(NUMERIC_LITERAL);
				setState(155);
				match(T__2);
				setState(156);
				match(NUMERIC_LITERAL);
				setState(157);
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
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			term();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				term();
				}
				}
				setState(167);
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
		public TerminalNode IS() { return getToken(gramatykaParser.IS, 0); }
		public TerminalNode NULL() { return getToken(gramatykaParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(gramatykaParser.NOT, 0); }
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				factor();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) {
					{
					setState(169);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(170);
					factor();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				factor();
				setState(174);
				match(IS);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(175);
					match(NOT);
					}
				}

				setState(178);
				match(NULL);
				}
				break;
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
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				columnName();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(NUMERIC_LITERAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(T__0);
				setState(186);
				expression();
				setState(187);
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
		"\u0004\u0001)\u00c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006]\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bl\b\b\n\b\f\bo\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tu\b\t\u0001\n\u0001\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0082\b\u000b\n\u000b\f\u000b\u0085"+
		"\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u008f\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u009f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a4"+
		"\b\u0011\n\u0011\f\u0011\u00a7\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00ac\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00b1\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b5\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00be\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0003\u0001\u0000\'(\u0001\u0000\b\t\u0001\u0000\u0017\u001c"+
		"\u00c5\u0000)\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004"+
		"4\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bF\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e"+
		"`\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012t\u0001"+
		"\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000"+
		"\u0000\u0018\u0086\u0001\u0000\u0000\u0000\u001a\u0088\u0001\u0000\u0000"+
		"\u0000\u001c\u008a\u0001\u0000\u0000\u0000\u001e\u008e\u0001\u0000\u0000"+
		"\u0000 \u009e\u0001\u0000\u0000\u0000\"\u00a0\u0001\u0000\u0000\u0000"+
		"$\u00b4\u0001\u0000\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000(*\u0003"+
		"\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001\u0001\u0000"+
		"\u0000\u0000-3\u0003\u0004\u0002\u0000.3\u0003\u0006\u0003\u0000/3\u0003"+
		"\b\u0004\u000003\u0003\n\u0005\u000013\u0003\f\u0006\u00002-\u0001\u0000"+
		"\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000"+
		"\u000045\u0005\u0005\u0000\u000056\u0003\u001e\u000f\u000067\u0005\u0006"+
		"\u0000\u00007:\u0003\u001a\r\u000089\u0005\u0007\u0000\u00009;\u0003\""+
		"\u0011\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\u0016\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0010\u0000\u0000?@\u0005\u0011\u0000\u0000@A\u0003\u001a"+
		"\r\u0000AB\u0005\u0001\u0000\u0000BC\u0003\u000e\u0007\u0000CD\u0005\u0002"+
		"\u0000\u0000DE\u0005\u0016\u0000\u0000E\u0007\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0012\u0000\u0000GH\u0005\u0011\u0000\u0000HI\u0003\u001a\r\u0000"+
		"IJ\u0005\u0016\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0005\n\u0000"+
		"\u0000LM\u0005\u000b\u0000\u0000MN\u0003\u001a\r\u0000NO\u0005\u0001\u0000"+
		"\u0000OP\u0003\u0014\n\u0000PQ\u0005\u0002\u0000\u0000QR\u0005\f\u0000"+
		"\u0000RS\u0005\u0001\u0000\u0000ST\u0003\u0016\u000b\u0000TU\u0005\u0002"+
		"\u0000\u0000UV\u0005\u0016\u0000\u0000V\u000b\u0001\u0000\u0000\u0000"+
		"WX\u0005\u000f\u0000\u0000XY\u0005\u0006\u0000\u0000Y\\\u0003\u001a\r"+
		"\u0000Z[\u0005\u0007\u0000\u0000[]\u0003\"\u0011\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0016\u0000\u0000_\r\u0001\u0000\u0000\u0000`e\u0003\u0010\b\u0000ab"+
		"\u0005\u0003\u0000\u0000bd\u0003\u0010\b\u0000ca\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\u000f\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003"+
		"\u001c\u000e\u0000im\u0003 \u0010\u0000jl\u0003\u0012\t\u0000kj\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000n\u0011\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000pu\u0005\u0013\u0000\u0000qu\u0005\u0014\u0000\u0000rs\u0005"+
		"\u0015\u0000\u0000su\u0003\u0018\f\u0000tp\u0001\u0000\u0000\u0000tq\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000"+
		"\u0000v{\u0003\u001c\u000e\u0000wx\u0005\u0003\u0000\u0000xz\u0003\u001c"+
		"\u000e\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0015\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0083\u0003\u0018\f\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u0082\u0003\u0018\f\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0017\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0007"+
		"\u0000\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"&\u0000\u0000\u0089\u001b\u0001\u0000\u0000\u0000\u008a\u008b\u0005&\u0000"+
		"\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c\u008f\u0005\u0004\u0000"+
		"\u0000\u008d\u008f\u0003\u0014\n\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u001f\u0001\u0000\u0000\u0000"+
		"\u0090\u009f\u0005 \u0000\u0000\u0091\u0092\u0005!\u0000\u0000\u0092\u0093"+
		"\u0005\u0001\u0000\u0000\u0093\u0094\u0005(\u0000\u0000\u0094\u009f\u0005"+
		"\u0002\u0000\u0000\u0095\u009f\u0005\"\u0000\u0000\u0096\u009f\u0005#"+
		"\u0000\u0000\u0097\u009f\u0005$\u0000\u0000\u0098\u0099\u0005%\u0000\u0000"+
		"\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b\u0005(\u0000\u0000\u009b"+
		"\u009c\u0005\u0003\u0000\u0000\u009c\u009d\u0005(\u0000\u0000\u009d\u009f"+
		"\u0005\u0002\u0000\u0000\u009e\u0090\u0001\u0000\u0000\u0000\u009e\u0091"+
		"\u0001\u0000\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e\u0096"+
		"\u0001\u0000\u0000\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009f!\u0001\u0000\u0000\u0000\u00a0\u00a5\u0003"+
		"$\u0012\u0000\u00a1\u00a2\u0007\u0001\u0000\u0000\u00a2\u00a4\u0003$\u0012"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6#\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0003&\u0013\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000\u00aa"+
		"\u00ac\u0003&\u0013\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b5\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003&\u0013\u0000\u00ae\u00b0\u0005\u001d\u0000\u0000\u00af\u00b1\u0005"+
		"\u001e\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001f\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b5%\u0001\u0000"+
		"\u0000\u0000\u00b6\u00be\u0003\u001c\u000e\u0000\u00b7\u00be\u0005\'\u0000"+
		"\u0000\u00b8\u00be\u0005(\u0000\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000"+
		"\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00be\'\u0001\u0000\u0000\u0000\u0010+"+
		"2:\\emt{\u0083\u008e\u009e\u00a5\u00ab\u00b0\u00b4\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}