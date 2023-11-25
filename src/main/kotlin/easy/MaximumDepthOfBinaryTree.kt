package easy

import easy.common.TreeNode
import easy.common.makeTreeNode

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
}

fun main() {
    val solution = maxDepth(makeTreeNode(listOf(1,null,2)))
    println(solution)
}