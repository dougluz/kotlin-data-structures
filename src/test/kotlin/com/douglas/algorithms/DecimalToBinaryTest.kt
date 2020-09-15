package com.douglas.algorithms

import org.junit.Assert
import org.junit.Test

class DecimalToBinaryTest {
    @Test
    fun `should return the correct decimal value`() {
        Assert.assertEquals("0", decimalToBinary(0))
        Assert.assertEquals("1", decimalToBinary(1))
        Assert.assertEquals("10", decimalToBinary(2))
        Assert.assertEquals("11", decimalToBinary(3))
        Assert.assertEquals("100", decimalToBinary(4))
        Assert.assertEquals("101", decimalToBinary(5))
        Assert.assertEquals("110", decimalToBinary(6))
        Assert.assertEquals("111", decimalToBinary(7))
        Assert.assertEquals("1000", decimalToBinary(8))
        Assert.assertEquals("1001", decimalToBinary(9))
        Assert.assertEquals("1010", decimalToBinary(10))
    }
}