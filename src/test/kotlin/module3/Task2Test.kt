package module3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task2Test {

    @Test
    fun solution() {
val task2 = Task2()
        assertEquals(0, task2.solution("sadbutsad", "sad"))
        assertEquals(-1, task2.solution("codemama", "ostad"))
        assertEquals(0, task2.solution("aiohn", "aiohn"))
        assertEquals(0, task2.solution("aaiougrt", "a"))
        assertEquals(1, task2.solution("aaiougrt", "ai"))
        assertEquals(2, task2.solution("aaiougrt", "iou"))
        assertEquals(3, task2.solution("aaiougrt", "ou"))
        assertEquals(4, task2.solution("aaiougrt", "ug"))
        assertEquals(5, task2.solution("aaiougrt", "gr"))
        assertEquals(6, task2.solution("aaiougrt", "rt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rttttttttttttttt"))
        assertEquals(-1, task2.solution("aaiougrt", "rtttttttttttttttt"))
    }
}