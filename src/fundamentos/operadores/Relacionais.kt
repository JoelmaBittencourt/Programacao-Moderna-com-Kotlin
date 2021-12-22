package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {

    println(3 !== 2)
    println("Banana" === "Banana")

    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1= Date(0)//1/1/1970
    val d2= Date(0)

    //IGUALDADE REFERENCIAL
    println("Resultado com'===' ${d1===d2}")//falso por que os endereços sao diferentes

    //IGUALDADE ESTRUTURAL
    println("Resultado com'===' ${d1==d2}")//verdadeiro por que o conteudo é igual,iquals
    println("Resultado com'===' ${d1.equals(d2)}")//mesma coisa de cima
}