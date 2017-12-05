package io.esi.ees

class KotlinNulls {

    fun validateCustomer(customer: CustomerKotlin) {
        if (customer.name.startsWith("A")) {
            throw Exception("Names are not allowed to start with A")
        }
    }

    fun validateJavaCustomer(customer: CustomerJava?) {
        //customer !! .id
        if (customer?.name?.startsWith("A") == true) {
            throw Exception("Names are not allowed to start with A")
        }
    }


}

fun main(args: Array<String>) {

    var myString: String? = "Something"
    myString = null

    KotlinNulls().validateJavaCustomer(null)

    // try to avoid nullable
}