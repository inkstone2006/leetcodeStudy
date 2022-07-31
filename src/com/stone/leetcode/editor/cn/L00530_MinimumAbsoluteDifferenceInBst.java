//给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。 
//
// 差值是一个正数，其数值等于两值之差的绝对值。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [4,2,6,1,3]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：root = [1,0,48,null,null,12,49]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目范围是 [2, 10⁴] 
// 0 <= Node.val <= 10⁵ 
// 
//
// 
//
// 注意：本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-
//nodes/ 相同 
// Related Topics树 | 深度优先搜索 | 广度优先搜索 | 二叉搜索树 | 二叉树 
//
// 👍 364, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 530、二叉搜索树的最小绝对差
 *
 * @author 李宏钊
 * @since 2022-07-31 16:44:13
 */
public class L00530_MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        Solution solution = new L00530_MinimumAbsoluteDifferenceInBst().new Solution();
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
        public int getMinimumDifference(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();
            int min = Integer.MAX_VALUE;
            middle(root, list);

            for (int i = 1; i < list.size(); i++) {
                min = Math.min(min, list.get(i) - list.get(i - 1));
            }

            return min;
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