//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics栈 | 递归 | 链表 | 双指针 
//
// 👍 320, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 剑指 Offer 06、从尾到头打印链表
 *
 * @author 李宏钊
 * @since 2022-07-31 17:05:41
 */
public class Offer00006_CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        Solution solution = new Offer00006_CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        solution.reversePrint(node1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            LinkedList<Integer> stack = new LinkedList<Integer>();

            while (head != null) {
                stack.addLast(head.val);
                head = head.next;
            }

            int[] result = new int[stack.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = stack.removeLast();
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}