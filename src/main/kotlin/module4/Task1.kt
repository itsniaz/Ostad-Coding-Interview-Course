package module4


/*
Task 1:


Write a function that does the following task.


Given a string s, return true if it is a palindrome, or false otherwise.


The input string is given as a string ‘s’.
You must use Recursion to solve the problem.


Also, mention the Time and Space Complexity of your solution.


Constraints:
1 <= s.length <= 105


Example 1:
Input: s = "madam"
Output: true


Example 2:
Input: s = "adam"
Output: false


Example 3:
Input: s = "tenet"
Output: true
* */

fun main(){
    val s = "madam"
    val result = Task1().isPalindrome(s)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module4/Task1Test.kt
}
class Task1 {

        //Time complexity = O(n)
        //Space complexity = O(n)
        fun isPalindrome(s: String): Boolean {
            if (s.isEmpty() || s.length == 1) return true
            if (s[0] != s[s.length - 1]) return false
            return isPalindrome(s.substring(1, s.length - 1))
        }
}