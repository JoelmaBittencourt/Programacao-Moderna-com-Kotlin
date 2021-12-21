package fundamentos.controles

fun main(args: Array<String>) {


    val nota = 2

    when (nota) {
        10, 9 -> print("Fantastico")//10 ou 9
        8, 7 -> println("Parabens")
        6, 5, 4 -> ("Tem como recuperar")
        in 0..3 -> println("Te vejo no proximo semestre")//entre 0 e 3
        else -> println("Nota invalida")//ultimo caso
    }
}
