package org.example.recursion_tree.leetcode

class Maximum_Depth_of_Binary_Tree_Kotlin {
    /**
     * 1. 재귀 함수를 사용하여 트리를 순회합니다.
     * 2. 현재 노드가 null이면 0을 반환합니다.
     * 3. 왼쪽과 오른쪽 서브트리의 최대 깊이를 재귀적으로 구합니다.

     * 4. 현재 노드의 깊이는 왼쪽과 오른쪽 서브트리 깊이 중 큰 값에 1을 더한 값입니다.
     * 5. 시간 복잡도는 O(N)이며, N은 트리의 노드 수입니다.
     * 6. 공간 복잡도는 O(H)이며, H는 트리의 높이입니다.
     *
     * 재귀를 사용하는 이유 : 트리 구조는 자연스럽게 재귀적으로 탐색할 수 있기 때문에,
     * 각 노드에서 왼쪽과 오른쪽 서브트리를 재귀적으로 호출하여 최대 깊이를 계산합니다.
     */
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return Math.max(leftDepth, rightDepth) + 1
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}


fun main() {
    val maximumDepthOfBinaryTreeKotlin = Maximum_Depth_of_Binary_Tree_Kotlin()

    // Example usage
    val root = Maximum_Depth_of_Binary_Tree_Kotlin.TreeNode(3)
    root.left = Maximum_Depth_of_Binary_Tree_Kotlin.TreeNode(9)
    root.right = Maximum_Depth_of_Binary_Tree_Kotlin.TreeNode(20)
    root.right!!.left = Maximum_Depth_of_Binary_Tree_Kotlin.TreeNode(15)
    root.right!!.right = Maximum_Depth_of_Binary_Tree_Kotlin.TreeNode(7)

    val depth = maximumDepthOfBinaryTreeKotlin.maxDepth(root)
    println(depth) // Output: 3
}
