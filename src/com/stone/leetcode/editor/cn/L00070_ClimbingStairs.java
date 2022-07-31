//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
// Related Topics记忆化搜索 | 数学 | 动态规划 
//
// 👍 2554, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 70、爬楼梯
 *
 * @author 李宏钊
 * @since 2022-07-31 16:20:21
 */
public class L00070_ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new L00070_ClimbingStairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            int memo[] = new int[n + 1];
            return climbStairsMemo(n, memo);
        }

        public int climbStairsMemo(int n, int[] memo) {
            if (memo[n] > 0) return memo[n];

            if (n == 1) {
                memo[n] = 1;
            } else if (n == 2) {
                memo[n] = 2;
            } else {
                memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
            }
            return memo[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}