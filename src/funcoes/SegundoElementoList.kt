package funcoes

fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

//List a = ...
//List<String> s =
//List<Int>= ...

fun main(args: Array<String>) {

    val list = listOf("joao","maria","pedro")
    println(list.secondOrNull())
}