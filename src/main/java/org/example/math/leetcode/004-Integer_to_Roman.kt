package org.example.math.leetcode

class Integer_to_Roman_Kotlin {
    fun intToRoman(num: Int): String {
        /**
         * 특정 숫자들은 뺄셈 형식으로 표기된다.
         * 4, 9, 40, 90, 400, 900
         */
        val valueSymbols = listOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        var number = num
        val result = StringBuilder()

        for ((value, symbol) in valueSymbols) {
            while (number >= value) {
                number -= value
                result.append(symbol)
            }
        }

        return result.toString()
    }
}

fun main() {
    val integerToRoman = Integer_to_Roman_Kotlin()
    println(integerToRoman.intToRoman(3)) // "III"
    println(integerToRoman.intToRoman(4)) // "IV"
    println(integerToRoman.intToRoman(9)) // "IX"
    println(integerToRoman.intToRoman(58)) // "LVIII"
    println(integerToRoman.intToRoman(1994)) // "MCMXCIV"
}
