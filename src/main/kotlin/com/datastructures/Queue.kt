package com.datastructures

class Queue(size: Int) {
    var size = -1
    var queue = IntArray(size)

    fun isEmpty(): Boolean = size == -1

    fun enqueue(item: Int) {
       size++
       queue[size] = item
    }

    fun dequeue(): Int {
        return queue[0]
    }
}