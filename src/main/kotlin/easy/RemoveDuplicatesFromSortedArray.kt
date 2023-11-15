package easy

fun removeDuplicates(nums: IntArray): Int {
    val set = nums.toSet()

    set.forEachIndexed { index, value -> nums[index] = value }
    return set.size
}

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val solution = removeDuplicates(nums)
    println(solution)

    for (i in 0..<solution) {
        print( nums[i] )
    }
}