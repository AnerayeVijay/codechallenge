package com.fizzbuzz

import junit.framework.Assert.assertNull
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `return fizz if 3 number is divided by 3`() {
        assertThat(fizz(3),equalTo("fizz"))
    }

    @Test
    fun `return null if 2 number is not divided by 3`() {
        assertNull(fizz(2))
    }

    @Test
    fun `give buzz if number is multiplication of 5`() {
        assertThat(buzz(5), equalTo("buzz"))
    }

    @Test
    fun `give null if number is not multiple of 5`() {
        assertNull(buzz(6))
    }

    @Test
    fun `fizzbuzz if number is multiple of 5 and three`() {
        assertThat(fizzBuzz(15), equalTo("fizzbuzz"))
    }

    @Test
    fun `print number if is not multiple of 3 or 5`() {
        assertThat(fizzBuzz(4), equalTo("4"))
    }
}

