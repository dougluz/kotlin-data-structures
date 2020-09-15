package com.douglas.algorithms

import com.douglas.datastructures.Stack

fun decimalToBinary(decNumber: Int): String {
    val stack = Stack(4)
    var number = decNumber
    var rem: Int
    var binaryString = ""

    if (number == 0) stack.push(number)
    while (number > 0) {
        rem = number % 2
        stack.push(rem)
        number /= 2
    }
    while (!stack.isEmpty()) {
        binaryString += stack.pop().toString()
    }
    return binaryString
}