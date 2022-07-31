//给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics栈 | 树 | 深度优先搜索 | 二叉树 
//
// 👍 1516, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94、二叉树的中序遍历
 *
 * @author 李宏钊
 * @since 2022-07-31 16:26:21
 */
public class L00094_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new L00094_BinaryTreeInorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            middle(root, res);
            return res;
        }

        private void middle(TreeNode root, List<Integer> res) {
            Stack<TreeNode> stack = new Stack<>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }

                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}