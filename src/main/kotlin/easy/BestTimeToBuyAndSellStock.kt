package easy

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var minPrice = Int.MAX_VALUE

    prices.forEach {
        if (it < minPrice) minPrice = it
        else if (it - minPrice > maxProfit) maxProfit = it - minPrice
    }

    return maxProfit
}

fun main() {
    val prices = intArrayOf(7,1,5,3,6,4)
    val solution = maxProfit(prices)
    println(solution)
}