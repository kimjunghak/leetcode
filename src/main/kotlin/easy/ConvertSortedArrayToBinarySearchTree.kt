package easy

import easy.common.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null

    val mid = nums.size / 2
    val root = TreeNode(nums[mid])
    root.left = sortedArrayToBST(nums.sliceArray(0..<mid))
    root.right = sortedArrayToBST(nums.sliceArray(mid+1..<nums.size))
    return root
}

fun main() {
    val solution = sortedArrayToBST(intArrayOf(-10,-3,0,5,9))
    println(solution)
}