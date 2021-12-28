package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado a $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("joao", "maria"))
    println(relacaoDeTrabalho(funcionario = "joao", chefe = "Maria"))
}