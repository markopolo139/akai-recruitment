package pl.ms.akai.bookapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookApiApplication

fun main(args: Array<String>) {
	runApplication<BookApiApplication>(*args)

	/*
    Twoim zadaniem jest napisanie prostego programu do pobierania i transformowania danych
    udostępnianych przez API. Dokumentacje API możesz znależć pod poniższym linkiem:
    https://akai-recruitment.herokuapp.com/documentation.html
    Całe API zawiera jeden endpoint: https://akai-recruitment.herokuapp.com/book
    Endpoint ten zwraca liste książek zawierajacch informację takie jak:
    - id
    - tytuł
    - autor
    - ocena
    Twoim zadaniem jest:
    1. Stworzenie odpowiedniej klasy do przechowywania informacji o książce
    2. Sparsowanie danych udostępnianych przez endpoint. Aby ułatwić to zadanie,
       do projektu są dołaczone 3 najpopularniejsze biblioteki do parsowania JSONów
       do obiektów Javy/Kotlina - Gson, Org.Json, Jackson. Możesz wykorzystać dowolną z nich
    3. Po sparsowaniu JSONu do obiektów Kotlina, uzupełnij program o funkcję wypisującą 3 autorów z
       najwyższą średnią ocen. Na przykład, gdy osoba X jest autorem książki A z oceną 9 i B z oceną 8,
       to powinna zostać wyświetlona informacja: X - 8.5
 */

}
