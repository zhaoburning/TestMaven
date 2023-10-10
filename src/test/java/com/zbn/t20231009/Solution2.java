package com.zbn.t20231009;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<String> result = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        String s = "";
        backTrack(s, n, n);
        return result;
    }

    void backTrack(String s, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            backTrack(s + "(", left - 1, right);
        }

        // 可用的括号 右括号大于左括号时，说明有 左括号先放置，才会是有效的括号组合
        if (right > left) {
            backTrack(s + ")", left, right - 1);
        }
    }
}
