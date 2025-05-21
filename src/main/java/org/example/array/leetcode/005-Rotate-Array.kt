package org.example.array.leetcode

class Rotate_Array_Kotlin {
    fun rotate(nums: IntArray, k: Int) {
        for (i in 0 until k) {
            val last = nums[nums.size - 1]
            for (j in nums.size - 1 downTo 1) {
                nums[j] = nums[j - 1]
            }
            nums[0] = last
        }
    }
}

fun main() {
    val rotateArray = Rotate_Array_Kotlin()
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    rotateArray.rotate(nums, k)
    println(nums.joinToString(", ")) // Expected output: [5, 6, 7, 1, 2, 3, 4]
}
