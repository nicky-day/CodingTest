package org.example.array.leetcode

class Remove_Duplicates_from_Sorted_Array_Kotlin {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var uniqueCount = 1 // 첫 번째 요소는 항상 포함되므로 1로 초기화
        for (i in 1 until nums.size) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i]
                uniqueCount++
            }
        }
        return uniqueCount
    }
}

fun main() {
    val problem = Remove_Duplicates_from_Sorted_Array_Kotlin()
    val nums = intArrayOf(1, 1, 2)
    val length = problem.removeDuplicates(nums)
    println("Length of unique elements: $length")
    println("Modified array: ${nums.sliceArray(0 until length).contentToString()}")
}
