package io.esi.ees

class IsHere {

    fun printMessage(message: String, prefix: String = "", suffix: String = "") {
        println("$prefix $message $suffix")
    }
}

fun main(args: Array<String>) {

    val isHere = IsHere()

    isHere.printMessage("One")
    isHere.printMessage("One", "Two")
    isHere.printMessage(suffix = "One", message = "Two", prefix = "Three")
}

