package com.factorial

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FactorialTest {

    @ParameterizedTest
    @CsvSource(value = arrayOf("1,1",
        "2,2",
        "3,6"))
    fun `factorial of {0} is {1}`(number: Int, factorial: Int) {
        assertThat(factorialOf(number), equalTo(factorial))
    }



}
