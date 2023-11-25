package easy

import easy.common.TreeNode
import easy.common.makeTreeNode

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val result = if( root.left == null && root.right != null) {
        maxDepth(root.right) + 1
    } else if(root.left != null && root.right == null) {
        maxDepth(root.left) + 1
    } else {
        maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
    }
    return result
}

fun main() {
    val solution = maxDepth(makeTreeNode(listOf(1,null,2)))
    println(solution)
}