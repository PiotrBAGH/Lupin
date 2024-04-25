import java.util.List;
import java.util.Arrays;

public class Tokens {
    public static final String SELECT = "(?i)select";
    public static final String FROM = "(?i)from";
    public static final String WHERE = "(?i)where";
    public static final String UPDATE = "(?i)update";
    public static final String DELETE = "(?i)delete";
    public static final String INSERT = "(?i)insert";
    public static final String VALUES = "(?i)values";
    public static final String JOIN = "(?i)join";
    public static final String ON = "(?i)on";
    public static final String ORDER = "(?i)order";
    public static final String BY = "(?i)by";
    public static final String GROUP = "(?i)group";
    public static final String HAVING = "(?i)having";
    public static final String CREATE = "(?i)create";
    public static final String ALTER = "(?i)alter";
    public static final String DROP = "(?i)drop";
    public static final String SET = "(?i)set";
    public static final String BEGIN = "(?i)begin";
    public static final String DECLARE = "(?i)declare";
    public static final String FUNCTION = "(?i)function";
    public static final String LANGUAGE = "(?i)language";

    // Data types
    public static final String INT = "(?i)int";
    public static final String VARCHAR = "(?i)varchar";
    public static final String FLOAT = "(?i)float";

    // Operators
    public static final String EQUALS = "=";
    public static final String LESS_THAN = "<";
    public static final String GREATER_THAN = ">";
    public static final String LESS_OR_EQUAL = "<=";
    public static final String GREATER_OR_EQUAL = ">=";
    public static final String NOT_EQUAL = "<>";
    public static final String PLUS = "\\+";
    public static final String MINUS = "-";
    public static final String DIVIDE = "/";
    public static final String TIMES = "\\*";

    // Symbols
    public static final String COMMA = ",";
    public static final String DOT = "\\.";
    public static final String SEMICOLON = ";";
    public static final String LEFT_PARENTHESIS = "\\(";
    public static final String RIGHT_PARENTHESIS = "\\)";

    // Logical operators
    public static final String AND = "(?i)and";
    public static final String OR = "(?i)or";
    public static final String NOT = "(?i)not";

    // Utility
    public static final String DISTINCT = "(?i)distinct";
    public static final String LIMIT = "(?i)limit";
    public static final String ASC = "(?i)asc";
    public static final String DESC = "(?i)desc";
    public static final String BETWEEN = "(?i)between";
    public static final String LIKE = "(?i)like";
    public static final String IN = "(?i)in";
    public static final String NULL = "(?i)null";

    // Aggregate functions
    public static final String SUM = "(?i)sum";
    public static final String AVG = "(?i)avg";
    public static final String MIN = "(?i)min";
    public static final String MAX = "(?i)max";
    public static final String COUNT = "(?i)count";

    public static final String WHITESPACE = "\\s+";
    public static final List<String> SQL_TOKENS = Arrays.asList(
            SELECT, FROM, WHERE, UPDATE, DELETE, INSERT, VALUES, JOIN, ON,
            ORDER, BY, GROUP, HAVING, CREATE, ALTER, DROP, SET, BEGIN, DECLARE,
            FUNCTION, LANGUAGE, INT, VARCHAR, FLOAT, EQUALS, LESS_THAN, GREATER_THAN,
            LESS_OR_EQUAL, GREATER_OR_EQUAL, NOT_EQUAL, PLUS, MINUS, DIVIDE, TIMES,
            COMMA, DOT, SEMICOLON, LEFT_PARENTHESIS, RIGHT_PARENTHESIS, AND, OR, NOT,
            DISTINCT, LIMIT, ASC, DESC, BETWEEN, LIKE, IN, NULL, SUM, AVG, MIN, MAX, COUNT
    );
    private static String removeExtraWhitespace(String input) {
        return input.replaceAll(WHITESPACE, " ");
    }
}
