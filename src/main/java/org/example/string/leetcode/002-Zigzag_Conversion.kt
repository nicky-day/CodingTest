package org.example.string.leetcode

class Zigzag_Conversion_Kotlin {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        // s.length = 3, numRows = 4의 경우 최대 3개의 StringBuilder만 필요
        val rows = MutableList(minOf(numRows, s.length)) { StringBuilder() }
        var curRow = 0
        var goingDown = false       // 현재 아래로 내려가는 중인지 위로 올라가는 중인지 여부

        for (c in s) {
            rows[curRow].append(c)
            // 맨 위(curRow = 0)까지 올라가면 아래로 방향 전환
            // 맨 아래(curRow = numRows - 1)까지 내려가면 위로 방향 전환
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown
            curRow += if (goingDown) 1 else -1
        }

        return rows.joinToString("") { it.toString() }
    }
}

fun main() {
    val zigzag_Conversion_Kotlin = Zigzag_Conversion_Kotlin()

    val s = "PAYPALISHIRING"
    val numRows = 3
    println(zigzag_Conversion_Kotlin.convert(s, numRows)) // "PAHNAPLSIIGYIR"

    val s2 = "PAYPALISHIRING"
    val numRows2 = 4
    println(zigzag_Conversion_Kotlin.convert(s2, numRows2)) // "PINALSIGYAHRPI"
}
