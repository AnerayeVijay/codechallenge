package com.canas

class CreateLineCommand(private val command: Array<String>, private val canvas: Canvas) : Command {

    override fun execute(): String {
        val canvasWithLine = canvas.createCanvas(
            drawnLine(
                command[1].toInt(),
                command[2].toInt(),
                command[3].toInt(),
                command[4].toInt()
            ), canvas
        )
        return canvasWithLine()
    }
    override fun toString(): String {
        return "drawLineInCanvas"
    }
}

fun drawnLine(x1: Int, y1: Int, x2: Int, y2: Int): (Int, Int) -> String = { xPosition: Int, yPosition: Int ->
    val lineChar = "x"
    when {
        xPosition in x1..x2 && (yPosition == y1 || yPosition == y2) -> lineChar
        yPosition in y1..y2 && (xPosition == x1 || xPosition == x2) -> lineChar
        else -> " "
    }
}
