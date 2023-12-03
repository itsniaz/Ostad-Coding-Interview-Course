package module1

/*
Task 2:
A function to calculate the sum of all natural numbers between ‘a’ to  'b'.
Constraints:
1 <= a, b <= 10^5
*/

fun main(){
    println(SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 1))
    println(SumOfNaturalNumbers().findSumOfNaturalNumbers(10, 6))
}

class SumOfNaturalNumbers {

    fun findSumOfNaturalNumbers(a : Int, b : Int) : Int{
        var sum = 0
        val upperBound = if (a > b) a else b
        val lowerBound =  if (b < a) b else a
        val n = upperBound - lowerBound + 1
        sum = n * (upperBound + lowerBound) / 2
        return sum
    }
}