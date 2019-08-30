package com.canas

import com.canas.CanvasCommandFactory.canvasCommand
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CanvasTest {

    @ParameterizedTest
    @CsvSource(value = arrayOf("C,CreateNewCanvasCommand",
        "R,createRectangle",
        "L,drawLineInCanvas",
        "A,UnKnownCommand"))
    fun `understand command for canvas`(command: String,className: String) {
        assertThat(CanvasCommandFactory.canvasCommand(arrayOf(command)).toString(), equalTo(className))
    }

    @Test
     fun `throw exception if not all parameter provided to create canvas`() {
        assertThrows<CanvasException> {canvasCommand(arrayOf("C")).execute()}
    }


    @Test
    fun `create line with 1,2,6,2`() {
        val canvas =canvasCommand(arrayOf("L","1","2","6","2")).execute()
        assertThat(canvas, equalTo("|       |\\n|xxxxxx |\\n|       |\\n|       |"))
    }

    @Test
     fun `create line with L 6 3 6 4`() {
        assertThat(canvasCommand(arrayOf("L", "6", "3", "6", "4")).execute(), equalTo("|       |\\n|       |\\n|     x |\\n|     x |"))

    }



    @Test
    fun `create line with x for given parameter`() {
        assertThat(createLineFor(1,2,6,2), equalTo("xxxxxx"))
    }

    private fun createLineFor(x1: Int, y1: Int, x2: Int, y2: Int): String? {
        return when(x1-x2) {
            0 -> " "
            else -> "x".repeat(x2+1-x1)
        }
    }

}

