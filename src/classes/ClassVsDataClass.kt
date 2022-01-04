package classes

class Geladeira (val marca: String, val litros: Int)

data class Televisao(val marca: String ,val polegadas: Int )

fun main(args: Array<String>) {
val g1 = Geladeira("brastemp",320)
val g2 =Geladeira("Brastemp",320)

println(g1==g2)

    val tv1= Televisao ("sansung",32)
    val tv2= Televisao ("sansung",32)

    println(tv1== tv2)
    println(tv1=== tv2)
    println(tv1.toString())
    println(tv1.copy(polegadas=42))

    //DESTRUCTURING EM DATA CLASS
    val (marca,pol) = tv1
    println("$marca $pol")


}