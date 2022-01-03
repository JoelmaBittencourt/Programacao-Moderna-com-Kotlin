package funcoes

inline fun <T> executandoComLog(nomeFuncao: String, funcao: () -> T): T {
    println("entrando no metodo $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("metodo $nomeFuncao finalizando...")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}
fun main(args: Array<String>) {
    val resultado= executandoComLog("somar"){
        somar2(4,5)
    }
    println(resultado)
}