package com.canvas

import com.canas.Canvas
import com.canas.CreateRectangleCommand
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CreateRectangleCommandTest {
    @Test
    fun `should drawn rectangle`() {
        val canvasLine = CreateRectangleCommand(arrayOf("R", "16", "1", "20", "3"), Canvas(20, 4))
        assertEquals(
            canvasLine.execute(), (
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