package fundamentos

fun soma(a:Int ,b:Int=1): Int{
    return a+b
}
fun subtracao(c: Int, d:Int=-10):Int{
        return c-d
}
//fun divisao(e:Int, f:Int=7): Int{}
fun divisao(e:Int, f:Int): Int {
    return e/f
}



fun main(args: Array<String>) {
    println(soma(2,3))
   // println(soma(11))


    println(subtracao(5,7))
    println(subtracao(9))

    println(divisao(4,2))
   // println(divisao(1))
}