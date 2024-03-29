/**
 * https://leetcode.com/problems/add-digits/
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 */
fun addDigit(digit: Int): Int {
    var num = digit
    var sum = 0
    if(digit<=9) return digit
    while (num > 0) {
        sum+= num%10
        num /= 10
    }

    return addDigit(sum)

    //return 1 + (digit -1) % 9


}

fun main() {
    println(addDigit(898))
}
