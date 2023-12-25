package module4


/*

Task 2:


Write a function that does the following task.


Write a recursive function to multiply given two positive integers ‘a’ and ‘b’ without using the * operator (multiplication operator). You can only use + operator (addition operator) and - operator (subtraction operator).


Also, mention the Time and Space Complexity of your solution


Constraints:
1 <= a, b <= 105


Example 1:
Input: a = 4, b = 5
Output: 20


Example 2:
Input: a = 3, b = 3
Output: 9


Example 3:
Input: a = 0, b = 2
Output: 0
 */

fun main(){
    val a = 4
    val b = 5
    val result = Task2().multiply(a, b)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module4/Task2Test.kt
}
class Task2 {

    //Time complexity = O(n)
    //Space complexity = O(n)
    fun multiply(a: Int, b: Int): Int {
        if (a == 0 || b == 0) return 0
        if (a == 1) return b
        if (b == 1) return a
        return if (a > b) a + multiply(a, b - 1) else b + multiply(a - 1, b)
    }
}