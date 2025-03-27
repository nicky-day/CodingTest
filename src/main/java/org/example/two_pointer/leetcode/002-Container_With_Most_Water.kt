package org.example.two_pointer.leetcode

class Container_With_Most_Water_Kotlin {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left < right) {
            val minHeight = minOf(height[left], height[right])
            val width = right - left
            val area = minHeight * width
            maxArea = maxOf(maxArea, area)

            // 더 낮은 쪽을 이동
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}

fun main() {
    val container = Container_With_Most_Water_Kotlin()
    println(container.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))) // 49
    println(container.maxArea(intArrayOf(1, 1))) // 1
    println(container.maxArea(intArrayOf(4, 3, 2, 1, 4))) // 16
    println(container.maxArea(intArrayOf(1, 2, 1))) // 2
}
