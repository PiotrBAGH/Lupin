# Interpreter SQL - Lupin

To prosta aplikacja napisana w języku Java, która pełni rolę interpretera SQL o nazwie "Lupin". Pozwala ona na analizę zapytań SQL i identyfikację różnych ich elementów, takich jak instrukcje, klauzule, typy danych i operatory.

## Użycie

1. **Klasa Tokens**: Definiuje wyrażenia regularne dla słów kluczowych SQL, typów danych, operatorów, symboli, operatorów logicznych, słów narzędziowych i funkcji agregujących.

2. **Klasa Grammar**: Zawiera główną logikę analizy zapytań SQL.
   - Metoda `parseQuery` dzieli wejściowe zapytanie SQL na tokeny, używając białych znaków jako separatora, a następnie identyfikuje typ każdego tokena.
   - Na podstawie zidentyfikowanego typu tokena, drukuje odpowiadające mu informacje, takie jak instrukcje SQL, klauzule, typy danych i operatory.

## Przykład

Dla poniższego zapytania SQL:

```sql
SELECT kolumna1, kolumna2 FROM tabela1 WHERE warunek = true;
