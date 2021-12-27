package fundamentos

import java.util.*

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase(Locale.getDefault()))
    } else if (x is Int) {
        println(x.plus(3))

    }
}

fun souEsperto2(x: Any) {
    when (x) {
        is String -> println(x.uppercase(Locale.getDefault()))
        is Int -> println(x.plus(3))
        else -> println("repense a sua vida")
    }
}


fun main(args: Array<String>) {
    souEsperto("ola")
    souEsperto(9)

    souEsperto2(7)
    souEsperto2("ola")
    souEsperto2(true)
}