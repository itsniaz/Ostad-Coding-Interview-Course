package module1

import org.testng.annotations.Test
import java.lang.Exception

/*
Task 1:
Given an integer ‘n’, write a function to calculate the factorial of a given non-negative integer 'n'.
 */
@Test
fun main(){
    val factorial = Factorial()
    println(factorial.findFactorialIterative(12))
}
class Factorial {

    fun findFactorialIterative(n : Int) : Int{
        if(n<0)
            throw Exception("n should be a non negative integer")
        if (n==0)
            return 1

        var factorial = 1
        for(i in n downTo 1 step 1){
            factorial*=i
        }
        return factorial
    }

    fun findFactorialRecursive(n : Int) : Int{
        return when {
            n<0 -> throw Exception("n should be a non negative integer")
            n==0 -> 1
            else -> n*findFactorialRecursive(n-1)
        }
    }
}

