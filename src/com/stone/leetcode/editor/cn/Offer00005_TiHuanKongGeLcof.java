//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics字符串 
//
// 👍 323, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

/**
 * 剑指 Offer 05、替换空格
 *
 * @author 李宏钊
 * @since 2022-07-31 16:53:55
 */
public class Offer00005_TiHuanKongGeLcof {
    public static void main(String[] args) {
        String s = "We are happy.";
        Solution solution = new Offer00005_TiHuanKongGeLcof().new Solution();
        solution.replaceSpace(s);
        System.out.println(solution.replaceSpace(s));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            return s.replace(" ", "%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}