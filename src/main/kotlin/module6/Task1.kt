package module6

import java.util.*

/*
Task 1:


Write a function that does the following task.


Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.


An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Also, mention the Time and Space Complexity of your solution.


Constraints:
1 <= s.length <= 10^4
s consists of brackets only '()[]{}'.



Example 1:
Input: s = "()"
Output: true


Example 2:
Input: s = "()[]{}"
Output: true


Example 3:
Input: s = "(]"
Output: false


Example 4:
Input: s = "{()}"
Output: true


Example 5:
Input: s = "{(})"
Output: false


* */

fun main(){
    val s = "()[]{}"
    val task1 = Task1()
    val result = task1.isValid(s)
    println(result)
    //More TestCases Can be Found under src/test/kotlin/module6/Task1Test.kt
}
class Task1 {

        //Time complexity = O(n)
        //Space complexity = O(n)
        fun isValid(s: String): Boolean {
            val stack = Stack<Char>()
            for (c in s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c)
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop()
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop()
                } else {
                    return false
                }
            }
            return stack.isEmpty()
        }
}