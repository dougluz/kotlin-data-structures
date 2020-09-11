package com.datastructures

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class QueueTest {
    lateinit var queue: Queue
    @Before
    fun init() {
        queue = Queue(4)
    }

    @Test
    fun `it starts empty`() {
        assertEquals(0, queue.size)
        assertEquals(true, queue.isEmpty())
    }

    @Test
    fun `enqueues elements`() {
        queue.enqueue(1)
        assertEquals(1, queue.size)
        queue.enqueue(2)
        assertEquals(2, queue.size)
        queue.enqueue(3)
        assertEquals(3, queue.size)

        assertEquals(false, queue.isEmpty())
    }

    @Test
    fun `dequeue elements`() {
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        assertEquals(1, queue.dequeue())
        assertEquals(2, queue.dequeue())
        assertEquals(3, queue.dequeue())
    }
}