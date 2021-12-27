package fundamentos

fun imprimirConceito(nota: Double) {

    when (nota as? Int ?: 7) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1 -> println("E")
        else -> println("nota invalida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayListOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota)
    }
}

