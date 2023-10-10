package com.zbn.t20230923;

/**
 * 1768. 交替合并字符串
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 *
 * 返回 合并后的字符串 。
 */
public class Solution1 {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int j = 0;
        for (int i = 0; i < chars1.length; i++) {
            result = result + chars1[i];
            if (j < chars2.length) {
                result = result + chars2[j];
                j ++;
            }
        }
        while (j < chars2.length) {
            result = result + chars2[j];
            j ++;
        }
        return result;
    }
}
