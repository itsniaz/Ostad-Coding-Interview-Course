package module3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task1Test {

    @Test
    fun makeStringAccordingToIndices() {
        val task1 = Task1()
        assertEquals("codemama", task1.makeStringAccordingToIndices("mamacode", intArrayOf(4, 5, 6, 7, 0, 1, 2, 3)))
        assertEquals("aiohn", task1.makeStringAccordingToIndices("aiohn", intArrayOf(3, 1, 4, 2, 0)))
        assertEquals("art", task1.makeStringAccordingToIndices("aaiougrt", intArrayOf(4, 0, 2, 6, 7, 3, 1, 5)))
        assertEquals("rat", task1.makeStringAccordingToIndices("art", intArrayOf(1, 0, 2)))
        assertEquals("cdelotee", task1.makeStringAccordingToIndices("leetcode", intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)))
        assertEquals("ot", task1.makeStringAccordingToIndices("ot", intArrayOf(0, 1)))
        assertEquals("cha", task1.makeStringAccordingToIndices("cha", intArrayOf(1, 2, 0)))
    }
}