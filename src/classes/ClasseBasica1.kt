package classes

class Cliente {
    var nome: String = ""

}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "joao"
    println("O cliente é ${cliente.nome}")

    cliente.nome = "maria"
    println("O cliente é ${cliente.nome}")

    cliente.nome = "batata"
    println("O cliente é ${cliente.nome}")
}