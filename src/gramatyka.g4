grammar gramatyka;

// Reguła startowa, z której parser rozpoczyna przetwarzanie.
start: sqlStatement+;

// Obsługa różnych instrukcji SQL.
sqlStatement
    : selectStatement
    | createTableStatement
    | dropTableStatement
    | insertIntoStatement
    | deleteFromStatement
    ;

// Obsługa zapytania SELECT z opcjonalnym warunkiem WHERE.
selectStatement
    : SELECT selectList FROM tableName (WHERE expression)? SEMICOLON
    ;

// Obsługa tworzenia tabeli z listą definicji kolumn.
createTableStatement
    : CREATE TABLE tableName '(' columnDefinitionList ')' SEMICOLON
    ;

// Obsługa usuwania tabeli.
dropTableStatement
    : DROP TABLE tableName SEMICOLON
    ;

// Obsługa dodawania rekordów do tabeli.
insertIntoStatement
    : INSERT INTO tableName '(' columnNameList ')' VALUES '(' valueList ')' SEMICOLON
    ;

// Obsługa usuwania rekordów z tabeli na podstawie warunku.
deleteFromStatement
    : DELETE FROM tableName (WHERE expression)? SEMICOLON
    ;

// Lista definicji kolumn w CREATE TABLE.
columnDefinitionList
    : columnDefinition (',' columnDefinition)*
    ;

// Definicja pojedynczej kolumny, która może zawierać klucz główny.
columnDefinition
    : columnName dataType (PRIMARY_KEY)?
    ;

// Lista nazw kolumn używanych w INSERT INTO.
columnNameList
    : columnName (',' columnName)*
    ;

// Lista wartości używanych w INSERT INTO.
valueList
    : value (',' value)*
    ;

// Pojedyncza wartość, która może być literałem liczbowym lub łańcuchowym.
value
    : NUMERIC_LITERAL
    | STRING_LITERAL
    ;

// Nazwa tabeli.
tableName
    : IDENTIFIER
    ;

// Nazwa kolumny.
columnName
    : IDENTIFIER
    ;

// Lista selekcji kolumn w SELECT, może być '*' dla wszystkich kolumn.
selectList
    : '*'
    | columnNameList
    ;

// Typy danych dla definicji kolumn.
dataType
    : INT
    | VARCHAR '(' NUMERIC_LITERAL ')'
    | BOOLEAN
    | DATE
    | FLOAT
    ;

// Wyrażenie, np. dla klauzuli WHERE, obsługuje operatory logiczne i porównania.
expression
    : term ((AND | OR) term)*
    ;

// Element wyrażenia, może być operatorem porównania między faktorami.
term
    : factor ((EQUAL | NOT_EQUAL | GREATER_THAN | LESS_THAN | GREATER_EQUAL | LESS_EQUAL) factor)?
    ;

// Podstawowy element wyrażenia, może być identyfikatorem, literałem lub innym wyrażeniem.
factor
    : columnName
    | STRING_LITERAL
    | NUMERIC_LITERAL
    | '(' expression ')'
    ;


// Spis tokenów dla interpretera SQL LUPIN
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
AND : 'AND';
OR : 'OR';
INSERT : 'INSERT';
INTO : 'INTO';
VALUES : 'VALUES';
UPDATE : 'UPDATE';
SET : 'SET';
DELETE : 'DELETE';
CREATE : 'CREATE';
TABLE : 'TABLE';
DROP : 'DROP';
PRIMARY_KEY : 'PRIMARY KEY';
SEMICOLON : ';'; // Dodano, aby obsłużyć średnik na końcu instrukcji
EQUAL : '=';
NOT_EQUAL : '<>' | '!=';
GREATER_THAN : '>';
LESS_THAN : '<';
GREATER_EQUAL : '>=';
LESS_EQUAL : '<=';

// Typy danych
INT : 'INT';
VARCHAR : 'VARCHAR';
BOOLEAN : 'BOOLEAN';
DATE : 'DATE';
FLOAT : 'FLOAT';

// Inne używane tokeny
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
STRING_LITERAL : '\'' ( ~['\\] | '\\' . )* '\'';
NUMERIC_LITERAL : [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip; // Ignorowanie białych znaków
