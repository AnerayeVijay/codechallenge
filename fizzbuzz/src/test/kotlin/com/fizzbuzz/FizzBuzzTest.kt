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

     fun buzz(number:  Int)= "buzz"
}
