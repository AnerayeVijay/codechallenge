package com.factorial

fun factorialOf(number: Int): Int = when {
    number == 0  -> 1
    else -> (number * factorialOf(number - 1))
}

fun tailFactorialOf(number: Int, nextNumber : Int = 1) : Int = when {
    number == 0 -> nextNumber
    else -> tailFactorialOf(number - 1, number * nextNumber)
}