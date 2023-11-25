package easy

import easy.common.TreeNode
import easy.common.makeTreeNode
import java.util.LinkedList

fun isSymmetric(root: TreeNode?): Boolean {
    if(root == null) return true

    val linkedList = LinkedList<TreeNode?>()
    linkedList.add(root.left)
    linkedList.add(root.right)
    while (!linkedList.isEmpty()) {
        val left = linkedList.poll()
        val right = linkedList.poll()

        if(left == null && right == null) continue
        if(left == null || right == null) return false
        if(left.`val` != right.`val`) return false
        else {
            linkedList.add(left.left)
            linkedList.add(right.right)
            linkedList.add(left.right)
            linkedList.add(right.left)
        }
    }
    return true
}

fun main() {
//    val solution = isSymmetric(makeTreeNode(listOf(1,2,2,3,4,4,3)))
    val solution = isSymmetric(makeTreeNode(listOf(9,-42,-42,null,76,76,null,null,13,null,13)))
    println(solution)
}