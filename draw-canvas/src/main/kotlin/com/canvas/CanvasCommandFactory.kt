package com.canas

object CanvasCommandFactory {
    var canvas: Canvas? = null
    fun canvasCommand(commands: Array<String>): Command =
        when (commands[0]) {
            "C" -> {
                when(commands.size) {
                    3 -> {
                        canvas = Canvas(commands[1].toInt(), commands[2].toInt())
                        CreateNewCanvasCommand(canvas!!)
                    }
                    else -> throw CanvasException("Wrong Command! To create new canvas try 'C w h',  example: 'C 20 4")
                }
            }
            "R" -> CreateRectangleCommand(commands, canvas!!)
            "L" -> CreateLineCommand(commands, canvas!!)
            else -> UnKnownCommand()
        }
}