package fundamentos

fun main() {
    print1a10()
}

fun print1a10() {

    for (numero in 1..20)
        println(numero)
}

fun print10a1() {

    for (numero in 1 downTo 20) {
        println(numero)
    }
    fun printPar1a10() {

        for (numero in 1..20 step 2) {
            println(numero)
        }
    }
}
