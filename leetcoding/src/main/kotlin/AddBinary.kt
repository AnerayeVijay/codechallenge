import java.lang.StringBuilder

/**
 * https://leetcode.com/problems/add-binary/
 * Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 */

fun addBinary(s1: String,s2: String) : String {
    val sb = StringBuilder()
    var len1 = s1.length-1
    var len2 = s2.length-1
    var carry = 0
    while (len1>=0 || len2>=0) {
        var sum = carry
        if(len1>=0) {
            sum+= s1[len1--] - '0'
        }
        if(len2>=0) {
            sum+= s2[len2--] - '0'
        }
        carry = sum /2
        sb.insert(0,sum % 2)
    }
    if(carry>0) {
        sb.insert(0,1)
    }
    return sb.toString()
}


fun main() {
    val s1 = "11"
    val s2 = "1"
    println(addBinary(s1,s2))
    println(addBinary("1010","1011"))


}