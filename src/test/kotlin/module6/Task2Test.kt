package module6

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task2Test {

    @Test
    fun removeDuplicates() {
        val task2 = Task2()
        assertEquals("ca", task2.removeDuplicates("abbaca"))
        assertEquals("ay", task2.removeDuplicates("azxxzy"))
        assertEquals("a", task2.removeDuplicates("a"))
        assertEquals("", task2.removeDuplicates(""))
        assertEquals("a", task2.removeDuplicates("aa"))
        assertEquals("a", task2.removeDuplicates("aaa"))
    }
}