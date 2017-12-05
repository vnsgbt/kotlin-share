package io.esi.ees

typealias CustomerName = String

@Deprecated("Customer is now called AwesomeCustomer", replaceWith = ReplaceWith("AwesomeCustomer"))
data class Customer(val name: CustomerName, val email: String)

typealias AwesomeCustomer = Customer

fun validateName(input: String) = input != ""

fun main(args: Array<String>) {

    val customer = Customer("Joe Smith", "joe@gmail.com")

    validateName(customer.name)

    val name : String = "Joe Smith"

    validateName(name)
}