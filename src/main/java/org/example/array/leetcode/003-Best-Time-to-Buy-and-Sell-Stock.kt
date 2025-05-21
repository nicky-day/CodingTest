package org.example.array.leetcode

class Best_Time_to_Buy_and_Sell_Stock_Kotlin {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice
            }
        }
        return maxProfit
    }
}

fun main() {
    val stock = Best_Time_to_Buy_and_Sell_Stock_Kotlin()
    println(stock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))) // 5
    println(stock.maxProfit(intArrayOf(7, 6, 4, 3, 1))) // 0
}
