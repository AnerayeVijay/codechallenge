package com.canas

class CreateLineCommand(val commands: Array<String>, val canvas: Canvas) : Command {

    override fun execute(): String {
        val canvasWithLine = canvas.createCanvas(
            drawnLine(
                commands[1].toInt(),
                commands[2].toInt(),
                commands[3].toInt(),
                commands[4].toInt()
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
