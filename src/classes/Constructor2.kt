package classes

class Filme2(val nome : String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("Mostros S.A",2001,"Comedia")
    println("${filme.genero} ${filme.nome} foi lancado em ${filme.anoLancamento}")
}