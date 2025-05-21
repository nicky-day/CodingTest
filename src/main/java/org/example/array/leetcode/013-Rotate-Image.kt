package org.example.array.leetcode

class Rotate_Image_Kotlin {
    // 행렬을 전치시키고(행과 열을 교환), 각 열을 뒤집어 90도 회전된 행렬을 얻는다.
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size
        // 1. 행렬을 전치
        for (i in 0 until n) {
            for (j in i until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        // 2. 각 열을 뒤집기
        for (i in 0 until n) {
            for (j in 0 until n / 2) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][n - j - 1]
                matrix[i][n - j - 1] = temp
            }
        }
    }
}

fun main() {
    val solution = Rotate_Image_Kotlin()
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    solution.rotate(matrix)
    for (row in matrix) {
        println(row.joinToString(", "))
    }
}
