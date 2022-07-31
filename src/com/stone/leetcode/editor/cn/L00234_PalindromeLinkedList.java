//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics栈 | 递归 | 链表 | 双指针 
//
// 👍 1456, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 234、回文链表
 *
 * @author 李宏钊
 * @since 2022-07-31 16:38:13
 */
public class L00234_PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new L00234_PalindromeLinkedList().new Solution();
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
        public boolean isPalindrome(ListNode head) {
            ListNode slow, fast;
            slow = fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            if (fast != null)
                slow = slow.next;

            ListNode left = head;
            ListNode right = reverse(slow);
            while (right != null) {
                if (left.val != right.val)
                    return false;
                left = left.next;
                right = right.next;
            }
            return true;
        }

        ListNode reverse(ListNode head) {
            ListNode pre = null, cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}