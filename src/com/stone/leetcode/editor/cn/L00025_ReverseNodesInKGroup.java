//给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。 
//
// k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[2,1,4,3,5]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], k = 3
//输出：[3,2,1,4,5]
// 
//
// 
//提示：
//
// 
// 链表中的节点数目为 n 
// 1 <= k <= n <= 5000 
// 0 <= Node.val <= 1000 
// 
//
// 
//
// 进阶：你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗？ 
//
// 
// 
// Related Topics递归 | 链表 
//
// 👍 1735, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 25、K 个一组翻转链表
 *
 * @author 李宏钊
 * @since 2022-07-31 16:02:44
 */
public class L00025_ReverseNodesInKGroup {
    public static void main(String[] args) {
        Solution solution = new L00025_ReverseNodesInKGroup().new Solution();
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
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null) return null;
            ListNode a = head;
            ListNode b = head;
            for (int i = 0; i < k; i++) {
                if (b == null) return head;
                b = b.next;
            }
            ListNode nextHead = reverse(a, b);
            a.next = reverseKGroup(b, k);
            return nextHead;
        }

        ListNode reverse(ListNode a, ListNode b) {
            ListNode preNode = null;
            ListNode currNode = a;
            ListNode nextNode = a;

            while (currNode != b) {
                nextNode = currNode.next;
                currNode.next = preNode;
                preNode = currNode;
                currNode = nextNode;
            }

            return preNode;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}