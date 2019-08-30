package com.fizzbuzz

fun fizz(number: Int) = when {
    number % 3 ==0 -> "fizz"
    else -> null
}