package fundamentos.operadores

fun main(args: Array<String>) {

    val executou1: Boolean = true
    val executou2: Boolean = true

    val sorvete: Boolean = executou1 || executou2
    val comproutv: Boolean = executou1 && executou2
    val comproutv1: Boolean = executou1 xor executou2

    println(sorvete)
    println(comproutv)
    println(comproutv1)

//OPERADOR UNARIO
if(!sorvete){
println(" saude agradece!")
}
}