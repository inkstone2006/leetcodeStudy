//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics栈 | 字符串 
//
// 👍 3425, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 20、有效的括号
 *
 * @author 李宏钊
 * @since 2022-07-31 15:59:26
 */
public class L00020_ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new L00020_ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if (s == null || s.length() == 0) {
                return true;
            }

            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');

            Deque<Character> dq = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    dq.push(c);
                } else {
                    if (dq.size() == 0 || map.get(c) != dq.pop()) {
                        return false;
                    }
                }
            }
            return dq.size() == 0;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}