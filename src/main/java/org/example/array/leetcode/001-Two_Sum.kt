package org.example.array.leetcode

class Two_Sum_Kotlin {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val complement = target - nums[i]
            val finalI = i
            val index = nums.indexOfFirst { it == complement && nums.indexOf(it) != finalI }
            if (index != -1) {
                return intArrayOf(i, index)
            }
        }
        return intArrayOf(0)
    }
}

fun main() {
    val problem = Two_Sum()
    val nums = intArrayOf(3, 3)
    val target = 6
    println(problem.twoSum(nums, target).contentToString())
}
