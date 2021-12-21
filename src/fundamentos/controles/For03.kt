package fundamentos.controles

fun main(args: Array<String>) {

    for (i in 0..100 step 5) {//conte de 0 a 100,de 5 em 5
        println(i)
    }
    for (i in 100 downTo 0 step 5) {//conte de 100 a 0,de 5 em 5
        println(i)
    }
}