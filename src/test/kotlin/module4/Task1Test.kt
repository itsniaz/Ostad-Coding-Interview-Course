package module4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task1Test {

    @Test
    fun isPalindrome() {
        val task1 = Task1()
        assertTrue(task1.isPalindrome("madam"))
        assertFalse(task1.isPalindrome("adam"))
        assertTrue(task1.isPalindrome("tenet"))
        assertTrue(task1.isPalindrome("racecar"))
        assertFalse(task1.isPalindrome("hello"))
        assertTrue(task1.isPalindrome("noon"))
        assertFalse(task1.isPalindrome("world"))


    }
}