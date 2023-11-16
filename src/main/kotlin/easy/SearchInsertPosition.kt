package easy

fun searchInsert(nums: IntArray, target: Int): Int {
    if(nums[0] > target) return 0

    var start = 0
    var end = nums.size - 1
    var pivot = 0
    var mid = 0
    while (start <= end) {
        mid = (start + end) / 2
        pivot = nums[mid]

        if(pivot < target) start = mid + 1
        else if(pivot > target) end = mid - 1
        else return mid
    }

    return if(pivot < target) mid + 1 else mid
}

fun main() {
    val solution = searchInsert(intArrayOf(1, 3, 5, 6), 2)
    println(solution)
}