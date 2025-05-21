package org.example.array.leetcode

class Best_Time_to_Buy_and_Sell_Stock_2_Kotlin {
    fun maxProfit(prices: IntArray): Int {
        var totalProfit = 0

        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1]
            }
        }

        return totalProfit
    }
}

fun main() {
    val stock = Best_Time_to_Buy_and_Sell_Stock_2_Kotlin()
    println(stock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))) // 7
    println(stock.maxProfit(intArrayOf(1, 2, 3, 4, 5))) // 4
    println(stock.maxProfit(intArrayOf(7, 6, 4, 3, 1))) // 0
}
