// Generated from C:/Users/Piotrek/Desktop/lupin_antlr/src/gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatykaParser}.
 */
public interface gramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gramatykaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gramatykaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(gramatykaParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(gramatykaParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(gramatykaParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(gramatykaParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(gramatykaParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(gramatykaParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStatement(gramatykaParser.DropTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStatement(gramatykaParser.DropTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#insertIntoStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoStatement(gramatykaParser.InsertIntoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#insertIntoStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoStatement(gramatykaParser.InsertIntoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#deleteFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromStatement(gramatykaParser.DeleteFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#deleteFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromStatement(gramatykaParser.DeleteFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionList(gramatykaParser.ColumnDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionList(gramatykaParser.ColumnDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(gramatykaParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(gramatykaParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(gramatykaParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(gramatykaParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(gramatykaParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(gramatykaParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramatykaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramatykaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(gramatykaParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(gramatykaParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(gramatykaParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(gramatykaParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(gramatykaParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(gramatykaParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(gramatykaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(gramatykaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gramatykaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gramatykaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramatykaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramatykaParser.FactorContext ctx);
}