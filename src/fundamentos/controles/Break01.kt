package fundamentos.controles

fun main(args: Array<String>) {
    for(i in 1 ..10){//conte de 1 ate 10
        if(i==5){//se for = 5
            break//para
        }
        println("Atual: $i")
    }
}