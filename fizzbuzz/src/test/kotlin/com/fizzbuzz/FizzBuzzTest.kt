package com.fizzbuzz

import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals


class FizzBuzzTest {

    @Test
    fun `return fizz if 3 number is divided by 3`() {
        assertEquals(fizz(3),("fizz"))
    }

    @Test
    fun `return null if 2 number is not divided by 3`() {
        assertNull(fizz(2))
    }

    @Test
    fun `give buzz if number is multiplication of 5`() {
        assertEquals(buzz(5), ("buzz"))
    }

    @Test
    fun `give null if number is not multiple of 5`() {
        assertNull(buzz(6))
    }

    @ParameterizedTest
    @CsvSource(value = arrayOf("1,1",
        "2,2",
        "3,fizz",
        "4,4",
        "5,buzz",
        "6,fizz",
        "7,7",
        "8,8",
        "9,fizz",
        "10,buzz",
        "11,11",
        "12,fizz",
        "13,13",
        "14,14",
        "15,fizzbuzz",
        "16,16"))
    fun `fizzbuzz if number is multiple of 5 and three`(number: Int, fizzBuzz: String ) {
        assertEquals(fizzBuzz(number), (fizzBuzz))
    }

}

