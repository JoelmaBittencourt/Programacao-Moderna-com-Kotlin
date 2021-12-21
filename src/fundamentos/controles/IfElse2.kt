package fundamentos.controles

fun main(args: Array<String>) {

    val num2 = 2
    val num3 = 5

    val maiorValor = if (num2 > num3) {
        println("proocessando if...")
        num2
    } else {
        println("processando else...")
        num3
    }
    println("O maior valor é $maiorValor")
}