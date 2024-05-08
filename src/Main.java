import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {

        String sqlQuery = "SELECT * FROM table WHERE column = 'value';";

        CharStream input = CharStreams.fromString(sqlQuery);

        gramatykaLexer lexer = new gramatykaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        gramatykaParser parser = new gramatykaParser(tokens);

        ParseTree tree = parser.start();

        System.out.println("Parse Tree: " + tree.toStringTree(parser));
    }
}
