package com.myapp.smartdevices

fun main() {
    val child = 10
    val adult = 32
    val seniorCitizen = 80

    val onMonday = false
    println("The movie ticket price for child of age $child is \$${movieTicket(child, onMonday)}")
    println("The movie ticket price for adult of age $adult is \$${movieTicket(adult, onMonday)}")
    println(
        "The movie ticket price for seniorCitizen of age $seniorCitizen is \$${
            movieTicket(seniorCitizen, onMonday)
        }"
    )

}

fun movieTicket(age: Int, onMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 30..60 -> if (onMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}