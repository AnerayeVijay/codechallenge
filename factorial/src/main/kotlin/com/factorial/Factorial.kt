package com.factorial

fun factorialOf(number: Int): Int = when {
    number == 0  -> 1
    else -> (number * factorialOf(number - 1))
}