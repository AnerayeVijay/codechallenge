package com.fibonacci

fun fibonacciOf(index: Int): Int {
    if (index < 2) {
        return index
    } else {
        return (fibonacciOf(index - 1) + fibonacciOf(index - 2))
    }
}