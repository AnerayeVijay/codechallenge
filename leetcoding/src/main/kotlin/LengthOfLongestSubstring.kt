/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */

fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    var a_pointer = 0
    var b_pointer = 0
    val set = mutableSetOf<Char>()
    while (b_pointer < s.length) {
        if(set.contains(s[b_pointer])) {
            set.remove(s[a_pointer++])
        } else {
            set.add(s[b_pointer++])
            max = Math.max(set.size,max)
        }
    }


    return max
}

fun main(args: Array<String>) {
    println(lengthOfLongestSubstring("abcabcbb"))
   // println(lengthOfLongestSubstring("bbbbb"))
   // println(lengthOfLongestSubstring("pwwkew"))
}