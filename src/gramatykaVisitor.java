// Generated from C:/Users/Piotrek/Desktop/Lupin/src/gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramatykaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramatykaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gramatykaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(gramatykaParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(gramatykaParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(gramatykaParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#dropTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStatement(gramatykaParser.DropTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#insertIntoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoStatement(gramatykaParser.InsertIntoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#deleteFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromStatement(gramatykaParser.DeleteFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinitionList(gramatykaParser.ColumnDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(gramatykaParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(gramatykaParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#columnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameList(gramatykaParser.ColumnNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(gramatykaParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramatykaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(gramatykaParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(gramatykaParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(gramatykaParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(gramatykaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gramatykaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramatykaParser.FactorContext ctx);
}