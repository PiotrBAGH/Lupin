import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Grammar {
    private static final String WHITESPACE_REGEX = Tokens.WHITESPACE;

    public static void main(String[] args) {
        String query = "SELECT column1, column2 FROM table1 WHERE condition = true;";
        parseQuery(query);
    }

    private static void parseQuery(String query) {
        String[] tokens = query.split(WHITESPACE_REGEX);
        for (String token : tokens) {
            if (matches(token, Tokens.SELECT)) {
                System.out.println("SELECT statement");
            } else if (matches(token, Tokens.FROM)) {
                System.out.println("FROM clause");
            } else if (matches(token, Tokens.WHERE)) {
                System.out.println("WHERE clause");
            } else if (matches(token, Tokens.UPDATE)) {
                System.out.println("UPDATE statement");
            } else if (matches(token, Tokens.DELETE)) {
                System.out.println("DELETE statement");
            } else if (matches(token, Tokens.INSERT)) {
                System.out.println("INSERT statement");
            } else if (matches(token, Tokens.VALUES)) {
                System.out.println("VALUES clause");
            } else if (matches(token, Tokens.JOIN)) {
                System.out.println("JOIN clause");
            } else if (matches(token, Tokens.ON)) {
                System.out.println("ON clause");
            } else if (matches(token, Tokens.ORDER)) {
                System.out.println("ORDER BY clause");
            } else if (matches(token, Tokens.BY)) {
                System.out.println("BY clause");
            } else if (matches(token, Tokens.GROUP)) {
                System.out.println("GROUP BY clause");
            } else if (matches(token, Tokens.HAVING)) {
                System.out.println("HAVING clause");
            } else if (matches(token, Tokens.CREATE)) {
                System.out.println("CREATE statement");
            } else if (matches(token, Tokens.ALTER)) {
                System.out.println("ALTER statement");
            } else if (matches(token, Tokens.DROP)) {
                System.out.println("DROP statement");
            } else if (matches(token, Tokens.SET)) {
                System.out.println("SET statement");
            } else if (matches(token, Tokens.BEGIN)) {
                System.out.println("BEGIN statement");
            } else if (matches(token, Tokens.DECLARE)) {
                System.out.println("DECLARE statement");
            } else if (matches(token, Tokens.FUNCTION)) {
                System.out.println("FUNCTION statement");
            } else if (matches(token, Tokens.LANGUAGE)) {
                System.out.println("LANGUAGE statement");
            } else if (matches(token, Tokens.INT)) {
                System.out.println("INT data type");
            } else if (matches(token, Tokens.VARCHAR)) {
                System.out.println("VARCHAR data type");
            } else if (matches(token, Tokens.FLOAT)) {
                System.out.println("FLOAT data type");
            } else if (matches(token, Tokens.EQUALS)) {
                System.out.println("= data type");
            } else {
                System.out.println("Unknown token: " + token);
            }            
        }
    }

    private static boolean matches(String token, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(token);
        return m.matches();
    }
}
