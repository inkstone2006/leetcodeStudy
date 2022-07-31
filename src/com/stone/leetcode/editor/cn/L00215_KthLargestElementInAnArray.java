//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4], k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6], k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
// Related Topics数组 | 分治 | 快速选择 | 排序 | 堆（优先队列） 
//
// 👍 1781, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 215、数组中的第K个最大元素
 *
 * @author 李宏钊
 * @since 2022-07-31 16:37:25
 */
public class L00215_KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution solution = new L00215_KthLargestElementInAnArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if (k > nums.length) {
                return -1;
            }
            Queue<Integer> queue = new PriorityQueue<>(nums.length, (a, b) -> b - a);
            int index = 0;
            while (index < nums.length) {
                queue.offer(nums[index]);
                index++;
            }
            int result = 0;
            while (k > 0) {
                result = queue.poll();
                k--;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}