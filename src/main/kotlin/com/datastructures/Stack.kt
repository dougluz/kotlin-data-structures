package com.datastructures

class Stack (size: Int) {
    private var stackSize = size
    private var stackArr = IntArray(stackSize)
    private var top = -1

    fun push(item: Int)  {
        if (this.isStackFull())
            this.increaseStackCapacity()
        top += 1
        println("adding: $item")
        this.stackArr[top] = item
    }

    fun pop(): Int {
        if (this.isStackEmpty())
            throw Exception("Stack is empty. Can not remove element")

        var item = this.stackArr[this.top]
        top -= 1
        println("Removed item $item")
        return item
    }

    fun size(): Int = top + 1

    fun peek(): Int = stackArr[this.top]

    fun clear() {
        stackArr = IntArray(stackSize)
        top = -1
    }

    private fun isStackFull(): Boolean {
        return top == stackSize - 1
    }

    private fun isStackEmpty(): Boolean {
        return top == - 1
    }

    private fun increaseStackCapacity() {
        val newStack = IntArray(this.stackSize * 2)
        for (i in 0 until stackSize)
            newStack[i] = this.stackArr[i]
        this.stackArr = newStack
        this.stackSize = this.stackSize * 2
    }
}