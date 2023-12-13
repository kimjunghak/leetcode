package easy

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) {
        result = result xor num
    }
    return result
}

fun main() {
    val nums = intArrayOf(4,1,2,1,2)
    val solution = singleNumber(nums)
    println(solution)
}