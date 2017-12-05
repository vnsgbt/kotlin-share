package io.esi.ees

fun main(args: Array<String>) {

    println("Hello!")
    greet("ESI")

    println("2 plus 3 is ${sum(2, 3)}")

    "all caps".allCaps()
}

fun greet(friend: String) {
    println("Hello $friend")
}

fun sum(x: Int, y: Int) = x + y

fun String.allCaps() = println(this.toUpperCase())

