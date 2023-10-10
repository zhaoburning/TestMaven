package com.zbn.t20231009;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Solution1 {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String path = "";
        backTrack(root, path);

        return result;
    }
    void backTrack(TreeNode tree, String path) {
        if (tree.left == null && tree.right == null) {
            path = path + tree.val;
            result.add(path);
        }
        path = path + tree.val + "->";
        if (tree.left != null) {
            backTrack(tree.left, path);
        }
        if (tree.right != null) {
            backTrack(tree.right, path);
        }

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
