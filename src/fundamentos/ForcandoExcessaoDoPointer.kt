package fundamentos

fun main(args: Array<String>) {
//FORÇANDO EXCESSAO
    var a: Int?=null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc())
}