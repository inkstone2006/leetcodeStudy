//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
// Related Topics数组 | 双指针 
//
// 👍 1675, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 283、移动零
 *
 * @author 李宏钊
 * @since 2022-07-31 16:39:36
 */
public class L00283_MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new L00283_MoveZeroes().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int p = removeElement(nums, 0);
            for (; p < nums.length; p++) {
                nums[p] = 0;
            }
        }

        int removeElement(int[] nums, int val) {
            if (nums.length == 0) return 0;
            int slow = 0, fast = 0;
            while (fast < nums.length) {
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}