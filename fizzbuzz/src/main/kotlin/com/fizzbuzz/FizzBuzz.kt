package com.fizzbuzz

fun fizz(number: Int) = when {
    number % 3 ==0 -> "fizz"
    else -> null
}

fun buzz(number:  Int)= when {
    number % 5 == 0 -> "buzz"
    else -> null
}

infix fun String?.compose (other: String?): String? = when  {
    other == null -> this
    this == null -> other
    else -> this + other
}

fun fizzBuzz(number: Int) = fizz(number) compose buzz(number) ?: number.toString()