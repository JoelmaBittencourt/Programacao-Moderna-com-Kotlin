package fundamentos

fun main(args: Array<String>) {

    //TIPOS NUMERICOS INTEIROS
    val num1:Byte=127
    val num2:Short=32767
    val num3:Int= 2_147_483_647
    val num4:Long= 9_000_458_558_487_545_484//long.MAX_VALUE

    //TIPOS NUMERICOS REAIS
    val num5:Float =3.145F
    val num6: Double= 3.14

    //TIPO CARACTERE
    val char: Char = '?'//OUTROS EXEMPLOS...'1','G', ''

    //TIPO BOOLEAN
    val boolean:Boolean=true //ou false

    println(listOf(num1,num2,num3,num4,num5,num6,char,boolean))
    println(2 is Int)//2 é int?
   // print(10.dec)
}