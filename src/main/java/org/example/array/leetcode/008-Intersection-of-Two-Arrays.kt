package org.example.array.leetcode

class Intersection_of_Two_Arrays_Kotlin {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        val intersection = set1.intersect(set2)
        return intersection.toIntArray()
    }
}

fun main() {
    val solution = Intersection_of_Two_Arrays_Kotlin()
    println(solution.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).joinToString(", ")) // [2]
    println(solution.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).joinToString(", ")) // [4, 9]
}
