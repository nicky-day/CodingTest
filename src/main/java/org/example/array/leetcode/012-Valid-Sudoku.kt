package org.example.array.leetcode

class Valid_Sudoku_Kotlin {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // 각 행, 열, 3*3 박스에 숫자가 중복되는지 체크하기 위한 배열
        val rows = Array(9) { BooleanArray(9) }
        val cols = Array(9) { BooleanArray(9) }
        val boxes = Array(9) { BooleanArray(9) }

        // i는 행, j는 열을 나타냄
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val num = board[i][j]
                if (num != '.') {
                    // 배열의 인덱스는 0부터 시작하므로 '1'은 0, '2'는 1, ..., '9'는 8로 변환
                    val index = num - '1'
                    // (i / 3)은 어느 세로 3*3에 속하는지, (j / 3)은 어느 가로 3*3에 속하는지 계산
                    // 3을 곱해주는 이유는 세로 3*3에 가로 3*3이 3개가 있으므로
                    // boxIndex는 0부터 8까지의 값을 가짐
                    val boxIndex = (i / 3) * 3 + j / 3

                    if (rows[i][index] || cols[j][index] || boxes[boxIndex][index]) {
                        return false
                    }

                    rows[i][index] = true
                    cols[j][index] = true
                    boxes[boxIndex][index] = true
                }
            }
        }
        return true
    }
}

fun main() {
    val solution = Valid_Sudoku_Kotlin()
    val board = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '9', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '2', '.', '4', '6', '8', '.'),
        charArrayOf('.', '6', '.', '.', '.', '2', '8', '.', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    println(solution.isValidSudoku(board)) // Expected output: true
}
