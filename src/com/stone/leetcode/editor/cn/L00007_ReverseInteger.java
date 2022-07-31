//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
// Related Topics数学 
//
// 👍 3574, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 7、整数反转
 *
 * @author 李宏钊
 * @since 2022-07-31 15:56:32
 */
public class L00007_ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new L00007_ReverseInteger().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x = x / 10;

                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                    return 0;  //7是2^31 - 1的个位数
                if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0; //8是-2^31的个位数

                rev = rev * 10 + pop;
            }
            return rev;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}