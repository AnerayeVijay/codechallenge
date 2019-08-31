package com.factorial

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class FactorialTest {

    @Test
    fun `factorial of 1 is 1`() {
        assertThat(factorialOf(1), equalTo(1))
    }

    @Test
    internal fun `factorial of 2 is 2`() {
        assertThat(factorialOf(2), equalTo(2))
    }

    @Test
    internal fun `factorial of 3 is 6`() {
        assertThat(factorialOf(3), equalTo(6))
    }

    fun factorialOf(number: Int): Int = when {
        number == 0  -> 1
        else -> (number * factorialOf(number-1))
    }
}