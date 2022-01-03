package funcoes

fun <E> filtrar(lista: List<E>, filtro:(E) -> Boolean):List<E>{
    val listaFiltrada = ArrayList<E>()
    for (e in lista) if (filtro(e)) {
        listaFiltrada.add(e)
    }
    return listaFiltrada
}
fun comDuasLetras(nome:String): Boolean{
    return nome.length == 2
}
fun comTresLetras(nome:String): Boolean {
    return nome.length == 3
}

fun comQuatroLetras(nome:String): Boolean {
    return nome.length == 4
}

fun comCincoLetras(nome:String): Boolean {
    return nome.length == 5
}

fun comSeisLetras(nome:String): Boolean {
    return nome.length == 6
}
fun main(args: Array<String>) {
    val nomes = listOf("Ana","Pedro","Jo","Gui","Rebeca")
    println(filtrar(nomes,:: comDuasLetras))
    println(filtrar(nomes,:: comTresLetras))
    println(filtrar(nomes,:: comQuatroLetras))
    println(filtrar(nomes,:: comCincoLetras))
    println(filtrar(nomes,:: comSeisLetras))

}


