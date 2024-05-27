package com.canvas

import com.canas.CanvasCommandFactory
import com.canas.CanvasCommandFactory.canvasCommand
import com.canas.CanvasException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals


class CanvasTest {

    @ParameterizedTest
    @CsvSource(value = arrayOf("C,CreateNewCanvasCommand",
        "R,createRectangle",
        "L,drawLineInCanvas",
        "A,UnKnownCommand"))
    fun `understand command for canvas`(command: String,className: String) {
        assertEquals(CanvasCommandFactory.canvasCommand(arrayOf(command)).toString(), (className))
    }

    @Test
     fun `throw exception if not all parameter provided to create canvas`() {
        assertThrows<CanvasException> {canvasCommand(arrayOf("C")).execute()}
    }


    @Test
    fun `create line with 1,2,6,2`() {
        val canvas =canvasCommand(arrayOf("L","1","2","6","2")).execute()
        assertEquals(canvas, "|       |\\n|xxxxxx |\\n|       |\\n|       |")
    }

    @Test
     fun `create line with L 6 3 6 4`() {
        assertEquals(canvasCommand(arrayOf("L", "6", "3", "6", "4")).execute(), ("|       |\\n|       |\\n|     x |\\n|     x |"))

    }



    @Test
    fun `create line with x for given parameter`() {
        assertEquals(createLineFor(1,2,6,2), ("xxxxxx"))
    }

    private fun createLineFor(x1: Int, y1: Int, x2: Int, y2: Int): String? {
        return when(x1-x2) {
            0 -> " "
            else -> "x".repeat(x2+1-x1)
        }
    }

}

