//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
// Related Topics字符串 | 动态规划 
//
// 👍 5514, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 5、最长回文子串
 *
 * @author 李宏钊
 * @since 2022-07-31 15:55:51
 */
public class L00005_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new L00005_LongestPalindromicSubstring().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            String result = "";
            for (int i = 0; i <= s.length() - 1; i++) {
                String s1 = palindrome(s, i, i);
                String s2 = palindrome(s, i, i + 1);
                result = (result.length() > s1.length()) ? result : s1;
                result = (result.length() > s2.length()) ? result : s2;
            }
            return result;
        }

        String palindrome(String s, int l, int r) {
            while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            return s.substring(l + 1, r);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}