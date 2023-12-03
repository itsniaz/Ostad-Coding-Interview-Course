
import module1.SumOfNaturalNumbers
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumOfNaturalNumbersTest {

    @Test
    fun testSumOfNaturalNumbers() {

        // Test cases with expected results
        assertEquals(1, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 1))
        assertEquals(3, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 2))
        assertEquals(5, SumOfNaturalNumbers().findSumOfNaturalNumbers(5, 5))
        assertEquals(55, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 10))
        assertEquals(55, SumOfNaturalNumbers().findSumOfNaturalNumbers(10, 1)) // b > a
        assertEquals(5050, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 100))
        assertEquals(15150, SumOfNaturalNumbers().findSumOfNaturalNumbers(100, 200))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-10, 10))
        assertEquals(100000, SumOfNaturalNumbers().findSumOfNaturalNumbers(100000, 100000))
        assertEquals(50005000, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 10000))
        assertEquals(3825, SumOfNaturalNumbers().findSumOfNaturalNumbers(50, 100))
        assertEquals(357, SumOfNaturalNumbers().findSumOfNaturalNumbers(13, 29))
        assertEquals(30, SumOfNaturalNumbers().findSumOfNaturalNumbers(4, 8))
        assertEquals(42, SumOfNaturalNumbers().findSumOfNaturalNumbers(3, 9))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(0, 0))
        assertEquals(1, SumOfNaturalNumbers().findSumOfNaturalNumbers(0, 1))
        assertEquals(1, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 0)) // b > a
        assertEquals(199999, SumOfNaturalNumbers().findSumOfNaturalNumbers(99999, 100000))
        assertEquals(50010051, SumOfNaturalNumbers().findSumOfNaturalNumbers(100, 10001))
        assertEquals(12377750, SumOfNaturalNumbers().findSumOfNaturalNumbers(500, 5000))
        assertEquals(4059, SumOfNaturalNumbers().findSumOfNaturalNumbers(9, 90))
        assertEquals(500500, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 1000))
        assertEquals(500500, SumOfNaturalNumbers().findSumOfNaturalNumbers(1000, 1)) // b > a
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-5, 5))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-100, 100))
        assertEquals(-375750, SumOfNaturalNumbers().findSumOfNaturalNumbers(-1000, -500))
        assertEquals(-45, SumOfNaturalNumbers().findSumOfNaturalNumbers(-10, -5))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-1, 1))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-50, 50))
        assertEquals(-15, SumOfNaturalNumbers().findSumOfNaturalNumbers(-5, 0))
        assertEquals(0, SumOfNaturalNumbers().findSumOfNaturalNumbers(-100000, 100000))
        assertEquals(10, SumOfNaturalNumbers().findSumOfNaturalNumbers(10, 10))
        assertEquals(705082704, SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 100000))
        assertEquals(704584203, SumOfNaturalNumbers().findSumOfNaturalNumbers(999, 100000))

    }
}
