package easy

import easy.common.TreeNode
import easy.common.makeTreeNode

fun inorderTraversal(root: TreeNode?): List<Int> {
    if(root == null) return emptyList()

    val result = mutableListOf<Int>()
    if(root.left != null) result.addAll(inorderTraversal(root.left))
    result.add(root.`val`)
    if(root.right != null) result.addAll(inorderTraversal(root.right))

    return result
}

fun main() {
    val solution = inorderTraversal(makeTreeNode(listOf()))
    println(solution)
}