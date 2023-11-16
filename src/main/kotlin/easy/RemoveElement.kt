package easy

fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[count++] = nums[i]
        }
    }

    return count
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val solution = removeElement(nums, 3)
    println(solution)

    for (i in 0..<solution) {
        print(nums[i])
    }
}