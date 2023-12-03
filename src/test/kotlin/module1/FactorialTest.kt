package module1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FactorialTest {

    @Test
    fun findFactorialIterative() {
        //Write testcases with assert statements for your solution
        val factorial = Factorial()
        assertEquals(120, factorial.findFactorialIterative(5))
        assertEquals(1, factorial.findFactorialIterative(0))
        assertEquals(1, factorial.findFactorialIterative(1))
        assertEquals(2, factorial.findFactorialIterative(2))
        assertEquals(6, factorial.findFactorialIterative(3))
        assertEquals(24, factorial.findFactorialIterative(4))
        assertEquals(120, factorial.findFactorialIterative(5))


    }

    @Test
    fun findFactorialRecursive() {
        val factorial = Factorial()
        assertEquals(120, factorial.findFactorialRecursive(5))
        assertEquals(1, factorial.findFactorialRecursive(0))
        assertEquals(1, factorial.findFactorialRecursive(1))
        assertEquals(2, factorial.findFactorialRecursive(2))
        assertEquals(6, factorial.findFactorialRecursive(3))
        assertEquals(24, factorial.findFactorialRecursive(4))
    }
}