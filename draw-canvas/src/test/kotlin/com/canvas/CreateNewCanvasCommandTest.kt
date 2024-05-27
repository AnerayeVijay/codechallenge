package com.canas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CreateNewCanvasCommandTest {
    @Test
    fun `create canvas with height=2 and width =20`() {
        assertEquals(
            CanvasCommandFactory.canvasCommand(
                arrayOf(
                    "C",
                    "20",
                    "2"
                )
            ).execute(),
            ("---------------------\n" +
                    "|                    |\n" +
                    "|                    |\n" +
                    "---------------------")
        )
    }
}