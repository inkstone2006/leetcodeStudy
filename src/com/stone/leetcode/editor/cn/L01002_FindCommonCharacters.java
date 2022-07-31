//给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答
//案。
// 
//
// 示例 1： 
//
// 
//输入：words = ["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 100 
// words[i] 由小写英文字母组成 
// 
// Related Topics数组 | 哈希表 | 字符串 
//
// 👍 281, 👎 0 
//
//
//
//


package com.stone.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002、查找共用字符
 *
 * @author 李宏钊
 * @since 2022-07-31 16:50:41
 */
public class L01002_FindCommonCharacters {
    public static void main(String[] args) {
        Solution solution = new L01002_FindCommonCharacters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> commonChars(String[] A) {
            int[] minFrequency = new int[26];
            Arrays.fill(minFrequency, Integer.MAX_VALUE);
            for (String word : A) {
                int[] currentFrequency = new int[26];
                int length = word.length();
                for (int i = 0; i < length; i++) {
                    char ch = word.charAt(i);
                    ++currentFrequency[ch - 'a'];
                }
                for (int i = 0; i < 26; i++) {
                    minFrequency[i] = Math.min(minFrequency[i], currentFrequency[i]);
                }
            }

            List<String> anStrings = new ArrayList<>();
            for (int i = 0; i < 26; ++i) {
                for (int j = 0; j < minFrequency[i]; ++j) {
                    anStrings.add(String.valueOf((char) (i + 'a')));
                }
            }


            return anStrings;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}