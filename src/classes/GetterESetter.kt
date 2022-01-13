package classes

class Cliente2{
constructor(nome: String){
    this.nome = nome
}
    var nome: String
    get()= "meu nome é${field}"//get recebe um valor
    set(value){             //set retorna
    field= value.takeIf {value.isNotEmpty()  }?: " Anonimo"//takeIf é lambda
}
}
fun main(args: Array<String>) {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("jo")
    println(c2.nome)
}