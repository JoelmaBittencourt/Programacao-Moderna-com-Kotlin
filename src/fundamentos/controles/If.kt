package fundamentos.controles

fun main(args: Array<String>) {

    val nota=-2

    if(nota>=7.0 && nota<=10.0){
        print("Aprovado!")
    }
    else if(nota<=5.5 && nota >=0){
        println("Reprovado com louvor")
    }
    else{
        println("Erro")
    }
}