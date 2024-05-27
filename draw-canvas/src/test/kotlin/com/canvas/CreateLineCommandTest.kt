package com.canvas

import com.canas.Canvas
import com.canas.CreateLineCommand
import com.canas.drawnLine
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CreateLineCommandTest {

    @Test
    fun `should give black space for  (1, 2, 6, 2) at (6,2)`() {
        assertEquals(
            drawnLine(1, 2, 6, 2)(6,2),
            ("x")
        )
    }

    @Test
    fun `should give black space (1 2 6 2) at 6, 6 `() {
        assertEquals(
            drawnLine(1, 2, 6, 2)(6, 7),
            (" "))
    }

    @Test
    fun `drawn line at position 2,2 (1,2,6,2)`() {
        assertEquals(
            drawnLine(1, 2, 2, 2)(2, 2),
            ("x"))
    }

    @Test
    fun `should drawn lines in canvas of ( 20 4) for command  L 1 2 6 2`() {
        val canvasLine = CreateLineCommand(arrayOf("L","1", "2", "6", "2"), Canvas(20,4))
        assertEquals(canvasLine.execute(), ("---------------------\n" +
                "|                    |\n" +
                "|xxxxxx              |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "---------------------")
        )
    }

    @Test
    fun `should drawn lines in canvas of ( 20 4) for command  L 6 3 6 4`() {
        val canvasLine = CreateLineCommand(arrayOf("L","6", "3", "6", "4"), Canvas(20,4))
        assertEquals(canvasLine.execute(), ("---------------------\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|     x              |\n" +
                "|     x              |\n" +
                "---------------------")
        )
    }

}
