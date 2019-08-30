package com.canas

class CreateRectangleCommand(private val commands: Array<String>, private val canvas: Canvas) : Command {
    override fun execute():String {
        val createLineCommand = CreateLineCommand(commands,canvas)
        return createLineCommand.execute()
    }

    override fun toString(): String {
        return "createRectangle"
    }

}