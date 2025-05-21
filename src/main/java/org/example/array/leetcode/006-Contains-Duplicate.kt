package org.example.array.leetcode

class Contains_Duplicate_Kotlin {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (num in nums) {
            if (num in seen) {
                return true
            }
            seen.add(num)
        }
        return false
    }
}

fun main() {
    val solution = Contains_Duplicate_Kotlin()
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 1))) // true
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 4))) // false
    println(solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))) // true
}
