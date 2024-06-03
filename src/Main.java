import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SQLVisitor visitor = new SQLVisitor();

        while (true) {
            System.out.println("Enter your SQL query (or type 'exit' to quit):");
            String sqlQuery = scanner.nextLine();

            if (sqlQuery.trim().equalsIgnoreCase("exit")) {
                break;
            }

            try {
                CharStream charStream = CharStreams.fromString(sqlQuery);
                gramatykaLexer lexer = new gramatykaLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                gramatykaParser parser = new gramatykaParser(tokens);
                ParseTree tree = parser.start(); // Zmienione na start()

                visitor.visit(tree);
            } catch (Exception e) {
                System.err.println("Error processing query: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

class SQLVisitor extends gramatykaBaseVisitor<Void> {

    @Override
    public Void visitCreateTableStatement(gramatykaParser.CreateTableStatementContext ctx) {
        String tableName = ctx.tableName().getText();
        List<String> columns = new ArrayList<>();
        for (gramatykaParser.ColumnDefinitionContext columnCtx : ctx.columnDefinitionList().columnDefinition()) {
            columns.add(columnCtx.columnName().getText());
        }

        try {
            Files.createFile(Paths.get(tableName + ".csv"));
            String header = String.join(",", columns);
            Files.write(Paths.get(tableName + ".csv"), Collections.singletonList(header));
            System.out.println("Table " + tableName + " created successfully.");
        } catch (IOException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Void visitInsertIntoStatement(gramatykaParser.InsertIntoStatementContext ctx) {
        String tableName = ctx.tableName().getText();
        List<String> values = new ArrayList<>();
        for (gramatykaParser.ValueContext valueCtx : ctx.valueList().value()) {
            values.add(valueCtx.getText());
        }

        try {
            Files.write(Paths.get(tableName + ".csv"), Collections.singletonList(String.join(",", values)), StandardOpenOption.APPEND);
            System.out.println("Data inserted into table " + tableName + " successfully.");
        } catch (IOException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Void visitSelectStatement(gramatykaParser.SelectStatementContext ctx) {
        String tableName = ctx.tableName().getText();
        List<String> selectedColumns = new ArrayList<>();

        if (ctx.selectList().columnNameList() != null) {
            for (gramatykaParser.ColumnNameContext columnCtx : ctx.selectList().columnNameList().columnName()) {
                selectedColumns.add(columnCtx.getText());
            }
        } else {
            selectedColumns.add("*");
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(tableName + ".csv"));
            String header = lines.get(0);
            String[] headers = header.split(",");

            List<String> resultLines = new ArrayList<>();
            resultLines.add(header); // Add header back

            for (String line : lines.subList(1, lines.size())) {
                String[] values = line.split(",");
                if (ctx.WHERE() == null || evaluateWhereClause(ctx.expression(), headers, values)) {
                    if (selectedColumns.contains("*")) {
                        resultLines.add(line);
                    } else {
                        List<String> selectedValues = new ArrayList<>();
                        for (String column : selectedColumns) {
                            int index = Arrays.asList(headers).indexOf(column);
                            if (index != -1) {
                                selectedValues.add(values[index]);
                            }
                        }
                        resultLines.add(String.join(",", selectedValues));
                    }
                }
            }

            for (String resultLine : resultLines) {
                System.out.println(resultLine);
            }
        } catch (IOException e) {
            System.err.println("Error reading table: " + e.getMessage());
        }
        return null;
    }


    private boolean evaluateWhereClause(gramatykaParser.ExpressionContext exprCtx, String[] headers, String[] values) {
        // Evaluate the expression in the WHERE clause
        if (exprCtx.term().size() > 1) {
            boolean result = evaluateTerm(exprCtx.term(0), headers, values);
            for (int i = 1; i < exprCtx.term().size(); i++) {
                String operator = exprCtx.getChild(2 * i - 1).getText();
                if (operator.equalsIgnoreCase("AND")) {
                    result &= evaluateTerm(exprCtx.term(i), headers, values);
                } else if (operator.equalsIgnoreCase("OR")) {
                    result |= evaluateTerm(exprCtx.term(i), headers, values);
                }
            }
            return result;
        } else {
            return evaluateTerm(exprCtx.term(0), headers, values);
        }
    }

    private boolean evaluateTerm(gramatykaParser.TermContext termCtx, String[] headers, String[] values) {
        if (termCtx.factor().size() == 2) {
            String left = termCtx.factor(0).getText();
            String operator = termCtx.getChild(1).getText();
            String right = termCtx.factor(1).getText();

            int leftIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals(left)) {
                    leftIndex = i;
                    break;
                }
            }

            if (leftIndex == -1) {
                return false; // Column not found
            }

            String leftValue = values[leftIndex];
            boolean isLeftNumeric = leftValue.matches("-?\\d+(\\.\\d+)?");
            boolean isRightNumeric = right.matches("-?\\d+(\\.\\d+)?");

            switch (operator) {
                case "=":
                    return leftValue.equals(right);
                case "<>":
                case "!=":
                    return !leftValue.equals(right);
                case ">":
                    if (isLeftNumeric && isRightNumeric) {
                        return Double.parseDouble(leftValue) > Double.parseDouble(right);
                    } else {
                        return leftValue.compareTo(right) > 0;
                    }
                case "<":
                    if (isLeftNumeric && isRightNumeric) {
                        return Double.parseDouble(leftValue) < Double.parseDouble(right);
                    } else {
                        return leftValue.compareTo(right) < 0;
                    }
                case ">=":
                    if (isLeftNumeric && isRightNumeric) {
                        return Double.parseDouble(leftValue) >= Double.parseDouble(right);
                    } else {
                        return leftValue.compareTo(right) >= 0;
                    }
                case "<=":
                    if (isLeftNumeric && isRightNumeric) {
                        return Double.parseDouble(leftValue) <= Double.parseDouble(right);
                    } else {
                        return leftValue.compareTo(right) <= 0;
                    }
                default:
                    return false;
            }
        } else if (termCtx.factor().size() == 1 && termCtx.IS() != null) {
            String left = termCtx.factor(0).getText();
            boolean not = termCtx.NOT() != null;

            int leftIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals(left)) {
                    leftIndex = i;
                    break;
                }
            }

            if (leftIndex == -1) {
                return false; // Column not found
            }

            String leftValue = values[leftIndex];

            if (not) {
                return !leftValue.isEmpty();
            } else {
                return leftValue.isEmpty();
            }
        }
        return false;
    }
    @Override
    public Void visitDeleteFromStatement(gramatykaParser.DeleteFromStatementContext ctx) {
        String tableName = ctx.tableName().getText();

        try {
            List<String> lines = Files.readAllLines(Paths.get(tableName + ".csv"));
            String header = lines.get(0);
            String[] headers = header.split(",");

            List<String> remainingLines = new ArrayList<>();
            remainingLines.add(header); // Add header back

            for (String line : lines.subList(1, lines.size())) {
                String[] values = line.split(",");
                if (ctx.WHERE() != null) {
                    if (evaluateWhereClause(ctx.expression(), headers, values)) {
                        // This row matches the WHERE clause, so we skip adding it to remainingLines
                        continue;
                    }
                }
                remainingLines.add(line);
            }

            // Write remaining lines back to the file
            Files.write(Paths.get(tableName + ".csv"), remainingLines);
        } catch (IOException e) {
            System.err.println("Error reading/writing table: " + e.getMessage());
        }
        return null;
    }
    @Override
    public Void visitDropTableStatement(gramatykaParser.DropTableStatementContext ctx) {
        String tableName = ctx.tableName().getText();

        try {
            Files.deleteIfExists(Paths.get(tableName + ".csv"));
            System.out.println("Table " + tableName + " dropped successfully.");
        } catch (IOException e) {
            System.err.println("Error dropping table: " + e.getMessage());
        }
        return null;
    }
}
