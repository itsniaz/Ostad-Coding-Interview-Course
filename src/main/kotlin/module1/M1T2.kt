package module1

/*
Task 2:
A function to calculate the sum of all natural numbers between ‘a’ to  'b'.
Constraints:
1 <= a, b <= 10^5
*/

fun main(){
    print(SumOfNaturalNumbers().findSumOfNaturalNumbers(1, 4))
}

class SumOfNaturalNumbers {

    fun findSumOfNaturalNumbers(a : Int, b : Int) : Int{
        var sum = 0
        for(i in a..b){
            sum+=i
        }

        return sum
    }
}