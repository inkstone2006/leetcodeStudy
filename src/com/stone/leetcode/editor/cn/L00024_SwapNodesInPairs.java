//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
// Related Topics递归 | 链表 
//
// 👍 1490, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 24、两两交换链表中的节点
 *
 * @author 李宏钊
 * @since 2022-07-31 16:02:03
 */
public class L00024_SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new L00024_SwapNodesInPairs().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode nextNode = head.next;
            head.next = swapPairs(nextNode.next);
            nextNode.next = head;

            return nextNode;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}