package fundamentos

fun main(args: Array<String>) {
val valor:Any = "abc"

if (valor is String){
    println(valor)
}
else if  (valor !is String){
    println("não é uma String")
}
}