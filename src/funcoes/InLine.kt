package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transacao")
    try {
        funcao()//executando...
    } finally {
    }
    println("Fechando transacao")
}

fun main(args: Array<String>) {
    transacao {
        println("executando...")
    }
}