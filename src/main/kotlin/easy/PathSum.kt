package easy

import easy.common.TreeNode
import easy.common.makeTreeNode

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) return false
    val rootVal = root.`val`
    val left = root.left
    val right = root.right
    if(left == null && right == null) return targetSum - rootVal == 0
    return hasPathSum(left, targetSum - rootVal) || hasPathSum(right, targetSum - rootVal)
}

fun main() {
    val solution = hasPathSum(makeTreeNode(listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1)), 22)
    println(solution)
}

