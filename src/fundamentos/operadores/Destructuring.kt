package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
val (marca,modelo) = Carro("Ford","Fusion")

    println("$marca,$modelo" )

    val(marido,mulher)= listOf("julia","maria")
    println("$mulher e $marido  ")

  val(_,_,_, quintoLugar) = listOf("primeiro","segundo","teceiro","quarto","quinto")
   println("$quintoLugar")
}