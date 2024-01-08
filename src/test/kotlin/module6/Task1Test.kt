package module6

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task1Test {

    @Test
    fun isValid() {
        val task1 = Task1()
        assertTrue(task1.isValid("()"))
        assertTrue(task1.isValid("()[]{}"))
        assertFalse(task1.isValid("(]"))
        assertTrue(task1.isValid("{()}"))
        assertFalse(task1.isValid("{(})"))
        assertTrue(task1.isValid("({[]})"))
        assertFalse(task1.isValid("({[}])"))
    }
}