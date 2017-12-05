package io.esi.ees

data class CustomerKotlin(val id: Int,
                          var name: String,
                          var email: String)

fun main(args: Array<String>) {

    val customer = CustomerKotlin(1, "A", "B")

    customer.email = "Steve"

    println(customer)

    copyClass()

    SingletonKotlin.property
}

data class Email(val name: String, val email: String)
data class Contacts(val company: String, val emails: List<Email>)

fun copyClass() {

    val contacts = Contacts("Company1", listOf(Email("Name1", "Email1"), Email("Name2", "Email2")))

    val contactsCopy = contacts.copy()

    contactsCopy.emails.forEach {
        println(it)
    }
}

object SingletonKotlin {
    val property = "Something"
}

