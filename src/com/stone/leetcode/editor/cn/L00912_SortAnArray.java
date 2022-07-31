//给你一个整数数组 nums，请你将该数组升序排列。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,2,3,1]
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：nums = [5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 5 * 10⁴ 
// -5 * 10⁴ <= nums[i] <= 5 * 10⁴ 
// 
// Related Topics数组 | 分治 | 桶排序 | 计数排序 | 基数排序 | 排序 | 堆（优先队列） | 归并排序 
//
// 👍 630, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 912、排序数组
 *
 * @author 李宏钊
 * @since 2022-07-31 16:50:01
 */
public class L00912_SortAnArray {
    public static void main(String[] args) {
        Solution solution = new L00912_SortAnArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArray(int[] nums) {
            int[] result = new int[nums.length];
            Queue<Integer> queue = new PriorityQueue<>(nums.length);
            int index = 0;
            while (index < nums.length) {
                queue.offer(nums[index]);
                index++;
            }
            index = 0;
            while (index < nums.length) {
                result[index] = queue.poll();
                index++;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}