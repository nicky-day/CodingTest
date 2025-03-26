package org.example.math.leetcode

class Palindrome_Number_Kotlin {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x < 10) return true
        if (x % 10 == 0) return false

    }
}

fun main() {
    val palindrome_Number_Kotlin = Palindrome_Number_Kotlin()
}
