/**
 *  https://leetcode.com/problems/two-sum/
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].

 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int,Int>()
    nums.forEachIndexed {i, x ->
        val need =  target -x
        if(map.containsKey(need)) {
            return intArrayOf(map[need]!!,i)
        }
        map[x] =i
    }
    return intArrayOf()
}

fun twoSumWithNoMap(nums: IntArray, target: Int): IntArray {
    val size = nums.size
    for(i in 0 until size){
        for(j in i until size){
            if(nums[i] +  nums[j] == target) {
                    return intArrayOf(i,j)
            }
        }
    }

    return intArrayOf()
}

fun main() {
    val inputArr = intArrayOf(2, 7, 11, 15)
    twoSum(inputArr,9).forEach { println(it)}
    twoSumWithNoMap(inputArr,18).forEach { println(it)}
}
