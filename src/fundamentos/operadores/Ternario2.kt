package fundamentos.operadores


fun obtresultado(nota: Double): String = if (nota>=6.0)"passou" else "reprovou"
fun main(args: Array<String>) {
    println(obtresultado(6.5))
}