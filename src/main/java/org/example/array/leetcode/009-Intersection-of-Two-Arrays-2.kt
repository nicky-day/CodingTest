package org.example.array.leetcode

class Intersection_of_Two_Arrays_2_Kotlin {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (num in nums1) {
            map[num] = (map[num] ?: 0) + 1
        }

        val result = mutableListOf<Int>()
        for (num in nums2) {
            if (map[num] != null && map[num]!! > 0) {
                result.add(num)
                map[num] = map[num]!! - 1
            }
        }
        return result.toIntArray()
    }
}

fun main() {
    val solution = Intersection_of_Two_Arrays_2_Kotlin()
    println(solution.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).joinToString(", ")) // [2, 2]
    println(solution.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).joinToString(", ")) // [4, 9]
}
