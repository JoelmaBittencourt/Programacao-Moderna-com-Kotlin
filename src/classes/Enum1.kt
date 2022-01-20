package classes

import sun.tools.jconsole.Version.print
import java.sql.DriverManager.println

enum class DiaSemana{
    DOMINGO,SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO
}
enum class Porque{
    TRABALHAR,NAMORO,FESTA,SAIDINHA
}


fun main(args: Array<String>) {
    println("O melhor dia da semana é ${DiaSemana.SABADO} por que tem ${Porque.FESTA}")

    println("O pior dia da semana é ${DiaSemana.SEGUNDA} porque tem que ${Porque.TRABALHAR}")
}