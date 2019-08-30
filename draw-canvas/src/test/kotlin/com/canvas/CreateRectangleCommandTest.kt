package com.canas

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
class CreateRectangleCommandTest {
    @Test
    fun `should drawn rectangle`() {
        val canvasLine = CreateRectangleCommand(arrayOf("R", "16", "1", "20", "3"), Canvas(20, 4))
        assertThat(
            canvasLine.execute(), equalTo(
                "---------------------\n" +
                        "|               xxxxx|\n" +
                        "|               x   x|\n" +
                        "|               xxxxx|\n" +
                        "|                    |\n" +
                        "---------------------"
            )
        )
    }
}