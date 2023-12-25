package module4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task2Test {

    @Test
    fun multiply() {
        val task2 = Task2()
        assertEquals(0, task2.multiply(0, 0))
        assertEquals(0, task2.multiply(0, 1))
        assertEquals(0, task2.multiply(1, 0))
        assertEquals(1, task2.multiply(1, 1))
        assertEquals(2, task2.multiply(1, 2))
        assertEquals(2, task2.multiply(2, 1))
        assertEquals(4, task2.multiply(2, 2))
        assertEquals(6, task2.multiply(2, 3))
        assertEquals(6, task2.multiply(3, 2))
        assertEquals(9, task2.multiply(3, 3))
        assertEquals(12, task2.multiply(3, 4))
        assertEquals(12, task2.multiply(4, 3))
        assertEquals(16, task2.multiply(4, 4))
        assertEquals(20, task2.multiply(4, 5))
        assertEquals(20, task2.multiply(5, 4))
        assertEquals(25, task2.multiply(5, 5))
        assertEquals(30, task2.multiply(5, 6))
        assertEquals(30, task2.multiply(6, 5))
        assertEquals(36, task2.multiply(6, 6))
        assertEquals(42, task2.multiply(6, 7))
        assertEquals(42, task2.multiply(7, 6))
        assertEquals(49, task2.multiply(7, 7))
        assertEquals(56, task2.multiply(7, 8))
        assertEquals(56, task2.multiply(8, 7))
        assertEquals(64, task2.multiply(8, 8))
        assertEquals(72, task2.multiply(8, 9))
        assertEquals(72, task2.multiply(9, 8))
        assertEquals(81, task2.multiply(9, 9))
        assertEquals(90, task2.multiply(9, 10))
        assertEquals(90, task2.multiply(10, 9))
        assertEquals(100, task2.multiply(10, 10))
        assertEquals(110, task2.multiply(10, 11))
        assertEquals(110, task2.multiply(11, 10))
        assertEquals(121, task2.multiply(11, 11))
        assertEquals(132, task2.multiply(11, 12))
    }
}