package easy

import easy.common.TreeNode
import easy.common.makeTreeNode
import kotlin.math.min

fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val left = root.left
    val right = root.right

    if(left == null) return minDepth(right) + 1
    if(right == null) return minDepth(left) + 1
    return min(minDepth(left), minDepth(right)) + 1
}

fun main() {
    val solution = minDepth(makeTreeNode(listOf(3,9,20,null,null,15,7)))
    println(solution)
}