package com.fizzbuzz

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class FizzBuzzTest {

    @Test
     fun `return fizz if 3 number is divided by 3`() {
        assertThat(fizz(3),equalTo("fizz"))
    }

    fun fizz(number: Int) = "fizz"
}