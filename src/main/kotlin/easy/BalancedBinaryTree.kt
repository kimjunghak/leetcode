package easy

import easy.common.TreeNode
import easy.common.makeTreeNode
import kotlin.math.abs

fun isBalanced(root: TreeNode?): Boolean {
    if (root == null) return true
    val left = root.left
    val right = root.right
    return (abs(depth(left) - depth(right)) <= 1) && isBalanced(left) && isBalanced(right)
}

private fun depth(root: TreeNode?): Int {
    if (root == null) return 0
    return maxOf(depth(root.left), depth(root.right)) + 1
}

fun main() {
    val solution = isBalanced(makeTreeNode(listOf(1,2,2,3,3,null,null,4,4)))
    println(solution)
}