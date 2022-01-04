package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome= nome
        this.genero= genero
        this.anoLancamento=anoLancamento

    }

}
fun main(args: Array<String>) {
    val filme = Filme("o poderoso chefao",1972, "drama")
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}")
}