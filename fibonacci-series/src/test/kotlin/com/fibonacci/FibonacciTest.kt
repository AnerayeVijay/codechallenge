package com.fibonacci

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals


class FibonacciTest {

   @ParameterizedTest
   @CsvSource(value = arrayOf("1,1",
       "2,1",
       "3,2",
       "5,5",
       "6,8"))
    fun `fibonacci of index is 1`(index: Int, fibonacci: Int) {
        assertEquals(fibonacciOf(index), fibonacci)
    }

}
