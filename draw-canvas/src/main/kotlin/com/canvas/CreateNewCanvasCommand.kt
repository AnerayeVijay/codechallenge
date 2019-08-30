package com.canas

class CreateNewCanvasCommand(private val canvas: Canvas) : Command {

    override fun execute(): String  = canvas.createCanvas(drawnSpaces(), canvas)()

    fun drawnSpaces(): (Int, Int) -> String = { _: Int, _: Int -> " " }

    override fun toString(): String {
        return "CreateNewCanvasCommand"
    }

}