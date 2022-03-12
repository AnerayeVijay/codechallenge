/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.



Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]



Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.


 */
fun sortedSquares(array: IntArray): IntArray {
    var result : IntArray = intArrayOf()
    var left = 0;
    val length = array.size
    var right = length-1
    for ( i in length-1 downTo 0) {
        if(Math.abs(array[left]) > Math.abs(array[right])) {
            result[i] = array[left] * array[left]
            left++
        } else {
            result[i] = array[right] * array[right]
            right--
        }
    }
    return result
}

fun main() {
    val arary =intArrayOf(-4,-1,0,3,10)
    sortedSquares(arary).forEach { t -> println(t) }
}