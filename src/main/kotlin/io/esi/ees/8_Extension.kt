package io.esi.ees

fun main(args: Array<String>) {
    println(greeting().right2left())
}

fun greeting () = "Hello!"

fun String.right2left() = this.reversed()