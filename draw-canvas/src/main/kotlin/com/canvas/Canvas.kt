package com.canas

class Canvas(val width: Int, val height: Int) {

    fun createCanvas(fn: (Int, Int) -> String, canvas: Canvas): () -> String {
        return {
            val canvasBody = (1..canvas.height).map { yPosition ->
                var body = canvasHeight
                (1..canvas.width).map { xPosition ->
                    body += fn(xPosition, yPosition)
                }
                body.plus(canvasHeight)

            }.joinToString(separator = newline)
            val line = createLength.repeat(canvas.width + 1)
            val canvas = line.plus(newline).plus(canvasBody).plus(newline).plus(line)
            println(canvas)
            canvas
        }
    }

    private val createLength = "-"
    private val canvasHeight = "|"
    private val newline = "\n"

}