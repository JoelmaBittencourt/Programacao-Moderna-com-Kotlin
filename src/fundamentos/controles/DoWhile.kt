package fundamentos.controles

fun main(args: Array<String>) {
    var opcao = 0

    do {
        val batata = readLine() ?: "0"//leia batata
        opcao = batata.toIntOrNull() ?: 0//batata e substituida por 0
        println("Voce escolheu a opcao $opcao")

    } while (opcao != -1)//para quando digitar -1
    println("Ate a proxima!")
}