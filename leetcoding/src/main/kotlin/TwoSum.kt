
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val size = nums.size
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


fun main() {
    val inputArr = intArrayOf(2, 7, 11, 15)
    val target = 9
    twoSum(inputArr,9).forEach { println(it)}
}
