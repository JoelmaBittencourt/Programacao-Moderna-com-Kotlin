package classes

import sun.security.util.Debug.println

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1,"Domingo",false),
    SEGUNDA(2,"Segunda",true),
    TERCA(3,"Terça",true),
    QUARTA(3,"Quarta",true),
    QUINTA(4,"Quinta",true),
    SEXTA(5,"Sexta",true),
    SABADO(6,"Sabado",false)
}
fun main(args: Array<String>) {
    for(dia in DiaSemana2.values()){
        println("${dia.nome} é um dia ${if(dia.util) "util" else "do fim de semana"}")
    }
}

fun println(s: String) {

}
