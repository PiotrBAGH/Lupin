# LUPIN SQL Interpreter

## Opis projektu
LUPIN to innowacyjny projekt interpretera SQL, który ma na celu mostkowanie między językiem Java a bazami danych SQL poprzez dynamiczne tworzenie zapytań SQL na podstawie analizy funkcji Java. Projekt wykorzystuje odpowiednie biblioteki do analizy i interpretacji kodu Java, co pozwala na przekształcanie logiki biznesowej napisanej w Java bezpośrednio na zapytania SQL.

## Technologia
LUPIN jest napisany w języku Java, co gwarantuje wysoką kompatybilność i wydajność w środowiskach baz danych. Interpreter korzysta z bibliotek takich jak `JavaParser` do analizy kodu źródłowego Java i generowania na jego podstawie odpowiednich instrukcji SQL.

## Funkcje
- **Analiza Kodu Java:** Interpreter czyta i analizuje funkcje zdefiniowane w języku Java.
- **Generowanie Zapytań SQL:** Na podstawie analizy kodu, LUPIN generuje zapytania SQL, które odpowiadają logice zaimplementowanej w funkcjach Java.
- **Wsparcie dla Różnych Dialektów SQL:** LUPIN może być konfigurowany do współpracy z różnymi systemami zarządzania bazami danych, takimi jak MySQL, PostgreSQL, Oracle itp.
- **Integracja z Istniejącymi Projektami Java:** Możliwość łatwej integracji z istniejącymi projektami Java bez potrzeby modyfikacji istniejącego kodu źródłowego.

## Jak to działa?
1. **Definicja Funkcji Java:** Użytkownik definiuje funkcje w Java, które opisują logikę biznesową.
2. **Analiza Funkcji:** LUPIN analizuje te funkcje, wyodrębniając niezbędne operacje i logikę.
3. **Generowanie Zapytań SQL:** Na podstawie wyodrębnionej logiki, interpreter generuje zapytania SQL.

## Przykłady Użycia
```java
public class Example {
    public List<Customer> findCustomersWithOverduePayments() {
        // Java method logic here
    }
}
