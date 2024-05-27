package com.factorial

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class FactorialTest {

    @ParameterizedTest
    @CsvSource(value = arrayOf("1,1",
        "2,2",
        "3,6"))
    fun `factorial of {0} is {1}`(number: Int, factorial: Int) {
        assertEquals(factorialOf(number), (factorial))
    }

    @ParameterizedTest
    @CsvSource(value = arrayOf("1,1",
        "2,2",
        "3,6"))
    fun `factorial of {0} is {1} by Tail Recursion way`(number: Int, factorial: Int) {
        assertEquals(tailFactorialOf(number), (factorial))
    }

}

