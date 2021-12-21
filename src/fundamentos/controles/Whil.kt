package fundamentos.controles


fun main(args: Array<String>) {

    var opcao=0
    while (opcao != -1){//-1 sai do laço
        val line= readLine()?: "0"
         opcao = line.toIntOrNull() ?: 0//faz cpm qie pegue o numero digitado e imprima

        println("voce escolheu a opcao $opcao")
    }
    println("Ate a proxima")
}