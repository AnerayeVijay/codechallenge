package com.fibonacci
//a series of numbers in which each number
// ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
fun fibonacciOf(index: Int): Int {
    if (index < 2) {
        return index
    } else {
        return (fibonacciOf(index - 1) + fibonacciOf(index - 2))
    }
}

fun fibonacciOfUsingForLoop() {
    var temp = 0
    var a = 0
    var b = 1
    var t = 10
    for (i in 1..t) {
        print("$a ")
        temp = a + b
        a = b
        b = temp

    }
}

fun fibonacciOfUsingWhileLoop() {
    var temp = 0
    var a = 0
    var b = 1
    var t = 10
    while (t>0) {
        print("$a ")
        temp = a + b
        a = b
        b = temp
        t-=1
    }
}

fun fibonacciOfUsingUpToGivenNumber() {
    var temp = 0
    var a = 0
    var b = 1
    var n = 100
    while (a<=n) {
        print("$a ")
        temp = a + b
        a = b
        b = temp

    }
}


fun main(args: Array<String>) {
    fibonacciOfUsingForLoop()
    println()
    fibonacciOfUsingWhileLoop()
    println()
    fibonacciOfUsingUpToGivenNumber()
    println()
    for(i in 0..9){
        print("${fibonacciOf(i)} ")
    }
}
//1,1,2,3,5,8

