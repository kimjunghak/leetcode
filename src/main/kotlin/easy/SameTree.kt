package easy

import easy.common.TreeNode
import easy.common.makeTreeNode

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if(p == null && q == null) return true
    if(p == null || q == null) return false

    if(p.`val` != q.`val`) return false
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

fun main() {
    val solution = isSameTree(makeTreeNode(listOf(1,2,3)), makeTreeNode(listOf(1,2,3)))
    println(solution)
}