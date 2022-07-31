//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics哈希表 | 字符串 | 滑动窗口 
//
// 👍 7921, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.HashMap;

/**
 * 3、无重复字符的最长子串
 *
 * @author 李宏钊
 * @since 2022-07-31 15:55:09
 */
public class L00003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new L00003_LongestSubstringWithoutRepeatingCharacters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> window = new HashMap<Character, Integer>();
            int left = 0;
            int right = 0;
            int res = 0;
            while (right < s.length()) {
                char c = s.charAt(right);
                right++;
                window.put(c, window.getOrDefault(c, 0) + 1);

                while (window.get(c) > 1) {
                    char d = s.charAt(left);
                    left++;
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
                if (right - left > res) {
                    res = right - left;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}