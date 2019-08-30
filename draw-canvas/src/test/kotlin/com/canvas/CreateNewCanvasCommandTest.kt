package com.canas

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
class CreateNewCanvasCommandTest {
    @Test
    fun `create canvas with height=2 and width =20`() {
        assertThat(
            CanvasCommandFactory.canvasCommand(
                arrayOf(
                    "C",
                    "20",
                    "2"
                )
            ).execute(),
            equalTo("---------------------\n" +
                    "|                    |\n" +
                    "|                    |\n" +
                    "---------------------")
        )
    }
}