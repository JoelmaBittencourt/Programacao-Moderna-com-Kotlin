package funcoes

fun imprimeirMaior(a:Int, b:Int){
    println(Math.max(a,b))
}
fun imprimirMaior2 (a:Int, b:Int): Unit {
    println(Math.max(a, b))
}
fun imprimirMaior3 (a:Int, b:Int): Unit {
    println(Math.max(a, b))
    return
}
fun imprimirMaior4 (a:Int, b:Int): Unit {
    println(Math.max(a, b))
    return Unit
}
fun main(args: Array<String>) {
    imprimeirMaior(2,1)
    imprimirMaior2(2,1)
    imprimirMaior3(2,1)
    imprimirMaior4(2,1).run {2>5}.run {print("resultado = $this")
}
}