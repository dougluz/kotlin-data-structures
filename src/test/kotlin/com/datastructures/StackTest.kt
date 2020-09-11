package com.datastructures

import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StackTest {
    lateinit var stack: Stack

    @Before
    fun init() {
        stack = Stack(4)
    }

    @Test
    fun `starts empty`() {
        assertEquals(0, stack.size())
    }

    @Test
    fun `pushes elements`() {
        stack.push(1)
        assertEquals(1, stack.size())
        stack.push(2)
        assertEquals(2, stack.size())
        stack.push(3)
        assertEquals(3, stack.size())
        assertEquals(true, stack.size() > 0)
    }

    @Test
    fun `Implements LIFO logic`() {
        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.pop())
        assertEquals(2, stack.pop())
        assertEquals(1, stack.pop())
    }

    @Test
    fun `don't allow pop elements in a empty array`() {
        try {
            stack.pop()
            Assert.fail("Should have thrown a exception")
        } catch (e: Exception) {
            val expectedMessage = "Stack is empty. Can not remove element"
            assertEquals(expectedMessage, e.message)
        }
    }

    @Test
    fun `Allows to peek the top element`() {
        stack.push(1)
        assertEquals(1, stack.peek())
        stack.push(2)
        assertEquals(2, stack.peek())
        stack.push(3)
        assertEquals(3, stack.peek())
    }

    @Test
    fun `Returns the correct size`() {
        assertEquals(0, stack.size())
        stack.push(1)
        assertEquals(1, stack.size())
        stack.push(2)
        assertEquals(2, stack.size())
        stack.push(3)
        assertEquals(3, stack.size())

        stack.clear()
        assertEquals(0, stack.size())
    }
}