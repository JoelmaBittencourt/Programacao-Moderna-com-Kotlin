package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(Produto: Produto): Boolean= this.preco> Produto.preco

fun main(args:Array<String>){
    val p1=Produto("Ipad",2349.00)
    val p2= Produto(preco = 3.59, nome = "Borracha")
    println(p1 maisCaroQue p2)
    println(p2 maisCaroQue p1)
}