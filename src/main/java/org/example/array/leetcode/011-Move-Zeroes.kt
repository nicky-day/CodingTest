package org.example.array.leetcode

class Move_Zeroes_Kotlin {
    fun moveZeroes(nums: IntArray) {
        var lastNonZeroFoundAt = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i]
                lastNonZeroFoundAt++
            }
        }
        for (i in lastNonZeroFoundAt until nums.size) {
            nums[i] = 0
        }
    }
}

fun main() {
    val solution = Move_Zeroes_Kotlin()
    val nums1 = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(nums1)
    println(nums1.joinToString(", ")) // Expected output: [1, 3, 12, 0, 0]

    val nums2 = intArrayOf(0)
    solution.moveZeroes(nums2)
    println(nums2.joinToString(", ")) // Expected output: [0]
}
