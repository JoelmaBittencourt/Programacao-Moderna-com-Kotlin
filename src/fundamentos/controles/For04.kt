package fundamentos.controles


fun main(args: Array<String>) {
    val alunos = arrayListOf("Andre", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) {//mostre os alunos por indice
        println("$indice- $aluno")//mostre os nomes apartir do indice
        println("$indice- $aluno")//mostre os nomes apartir do indice+1
    }
}
