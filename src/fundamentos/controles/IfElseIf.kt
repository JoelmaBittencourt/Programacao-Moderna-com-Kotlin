package fundamentos.controles

fun main(args: Array<String>) {


    val nota = 9// se fosse numero quebrado tem que especificar ou daria erro

    //USANDO OPERADOR RANGE
    if (9 <= nota && nota <= 0) {
        println("Fantastico")
    } else if (nota in 7..8) {
        println("Parabens")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no proximo semestre")
    } else {
        println("Nota invalida")
    }
}