package com.zbn.t20230923;

/**
 * 11. 盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 * <p>
 * 说明：你不能倾斜容器。
 */
public class Solution2 {
    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 1; i <= height.length - 1; i++) {
            for (int j = i + 1; j <= height.length; j++) {
                int area = Math.min(height[i - 1], height[j - 1]) * (j - i);
                if (area > result) {
                    result = area;
                }
            }
        }
        return result;
    }
    public int maxArea2(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

}
