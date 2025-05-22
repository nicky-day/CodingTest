package org.example.string.leetcode

class Valid_Palindrome_Kotlin {
    fun isPalindrome(s: String): Boolean {
        val filteredChars = s.filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = filteredChars.length - 1

        while (left < right) {
            if (filteredChars[left] != filteredChars[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}

fun main() {
    val valid_Palindrome_Kotlin = Valid_Palindrome_Kotlin()

    val s = "A man, a plan, a canal: Panama"
    println(valid_Palindrome_Kotlin.isPalindrome(s)) // true

    val s2 = "race a car"
    println(valid_Palindrome_Kotlin.isPalindrome(s2)) // false

    val s3 = " "
    println(valid_Palindrome_Kotlin.isPalindrome(s3)) // true
}
