package fundamentos

fun main(){
    var nome: String = "Gustavo"
    var nome1: String? = null
    var nome3: String? = null

    println(nome.length)
    println(nome1!!.length)
    println(nome3?.length?.toShort())
}