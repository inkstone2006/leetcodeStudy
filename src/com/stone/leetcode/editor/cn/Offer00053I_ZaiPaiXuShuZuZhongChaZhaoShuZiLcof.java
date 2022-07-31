//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics数组 | 二分查找 
//
// 👍 337, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 剑指 Offer 53 - I、在排序数组中查找数字 I
 *
 * @author 李宏钊
 * @since 2022-07-31 17:13:36
 */
public class Offer00053I_ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new Offer00053I_ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(solution.search(nums, target));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int time = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    time++;
                }
            }
            return time;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}