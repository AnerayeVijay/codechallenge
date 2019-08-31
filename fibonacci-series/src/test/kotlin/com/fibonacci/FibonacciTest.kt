package com.fibonacci

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FibonacciTest {

   @ParameterizedTest
   @CsvSource(value = arrayOf("1,1",
       "2,1",
       "3,2",
       "5,5",
       "6,8"))
    fun `fibonacci of index is 1`(index: Int, fibonacci: Int) {
        assertThat(fibonacciOf(index), equalTo(fibonacci))
    }

}
