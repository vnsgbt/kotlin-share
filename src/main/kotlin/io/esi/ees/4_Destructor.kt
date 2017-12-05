package io.esi.ees

fun returnPair(): Pair<String, String> {
    return Pair("first", "second")
}

fun main(args: Array<String>) {
    val pair = returnPair()

    val (_, second) = returnPair()
    val (name, email) = Email("Steve", "s@esi")

    println("$pair $second $name $email")
}