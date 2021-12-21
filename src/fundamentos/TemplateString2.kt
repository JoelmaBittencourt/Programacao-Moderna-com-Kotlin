package fundamentos

fun main(args: Array<String>) {

  //  val bomHumor=true
    val devDeusa= true
    val rica= true
    val bomHumor=false



    println("hoje estou ${if (bomHumor) "feliz" else "chateado"}")
    println("hoje sou uma pessoa ${if (rica) "rica" else "pobre, pobre"}")
    println("hoje sou uma completa ${if (devDeusa) "DevDeusa" else "desempregadaaa"}")
}