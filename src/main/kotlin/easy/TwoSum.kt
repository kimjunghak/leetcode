package easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, num ->
        map[target - num]?.let { return intArrayOf(it, index) }
        map[num] = index
    }

    return intArrayOf()
}

fun main() {
    val solution = twoSum(intArrayOf(2, 7, 11, 15), 9)
    println(solution.toList())
}