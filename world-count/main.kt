fun main() {
    val sentences = arrayOf(
        "Taki mamy klimat",
        "Wszędzie dobrze ale w domu najlepiej",
        "Wyskoczył jak Filip z konopii",
        "Gdzie kucharek sześć tam nie ma co jeść",
        "Nie ma to jak w domu",
        "Konduktorze łaskawy zabierz nas do Warszawy",
        "Jeżeli nie zjesz obiadu to nie dostaniesz deseru",
        "Bez pracy nie ma kołaczy",
        "Kto sieje wiatr ten zbiera burzę",
        "Być szybkim jak wiatr",
        "Kopać pod kimś dołki",
        "Gdzie raki zimują",
        "Gdzie pieprz rośnie",
        "Swoją drogą to gdzie rośnie pieprz?",
        "Mam nadzieję, że poradzisz sobie z tym zadaniem bez problemu",
        "Nie powinno sprawić żadnego problemu, bo Google jest dozwolony"
    )

    val map = sentences.joinToString(separator =  " ").lowercase().split(" ")
        .map { it.trim('?',',','.','/',';',':','\\' ) }.groupingBy { it }.eachCount().toList()
        .sortedByDescending { it.second }.toMap().asSequence().take(3)
        

    map.forEach { println("${it.key} - ${it.value}") }

}