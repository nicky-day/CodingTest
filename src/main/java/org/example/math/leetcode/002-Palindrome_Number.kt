package org.example.math.leetcode

class Palindrome_Number_Kotlin {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false             // 음수는 Palindrome이 될 수 없음

        // 숫자를 문자열로 변환하여 비교
        return x.toString() == x.toString().reversed()
    }

    fun isPalindrome2(x: Int): Boolean {
        // 음수이거나 0으로 끝나는 수는 회문이 아님. (0은 예외)
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var num = x
        var reversed = 0

        while (num > reversed) {       // 숫자의 절반만 뒤집으면 됨
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10
        }

        // 숫자의 길이가 홀수일 때, reversed는 num보다 1자리 더 많음
        // 예를 들어, 12321의 경우 num은 12, reversed는 123이 되어야 함
        return num == reversed || num == reversed / 10
    }
}

fun main() {
    val palindrome_Number_Kotlin = Palindrome_Number_Kotlin()
    println(palindrome_Number_Kotlin.isPalindrome(121)) // true
}
