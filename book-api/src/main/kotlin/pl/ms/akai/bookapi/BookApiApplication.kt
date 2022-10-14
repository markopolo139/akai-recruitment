package pl.ms.akai.bookapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.client.RestTemplate
import pl.ms.akai.bookapi.app.Book
import java.math.RoundingMode

@SpringBootApplication
class BookApiApplication

fun getBooks(): List<Book> {
	val restTemplate = RestTemplate()
	val url = "https://akai-recruitment.herokuapp.com/book"

	return restTemplate.getForEntity(url, arrayOf<Book>().javaClass).body?.toList() ?: emptyList()
}

fun biggestAvgMark(list: List<Book>): List<Pair<String,Double>> =
	list.groupBy ({ it.author }, { it.rating }).mapValues { it.value.average() }.toList()
		.sortedByDescending { it.second }.take(3)


fun main(args: Array<String>) {
	runApplication<BookApiApplication>(*args)

	val books = getBooks()

	biggestAvgMark(books).forEach {
		println("${it.first} - ${it.second.toBigDecimal().setScale(2, RoundingMode.HALF_UP)}")
	}

}
