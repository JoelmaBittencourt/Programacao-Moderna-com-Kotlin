package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("branco", 2021, Dono("Gustavo", 24))

    println(carro.cor)
    carro.cor = "branco"

    carro.anoFabricacao
    println(carro.anoFabricacao)
    println(carro.dono.idade)
    carro.dono.idade = 25
}
