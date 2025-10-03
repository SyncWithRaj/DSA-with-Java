package com.raj.Questions;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    //129
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum *= 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }
        return helper(node.left, sum) + helper(node.right, sum);
    }

    //124
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return 0;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0, left);
        left = Math.max(0, right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans, pathSum);

        return Math.max(left, right) + node.val;
    }

    //E
    boolean findPath(Node node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0);
    }
    boolean helper(Node node, int[] arr, int index) {
        if (node == null) {
            return false;
        }
        if (index >= arr.length || node.val != arr[index]){
            return false;
        }
        if (node.left == null && node.right == null && index = arr.length - 1){
            return true;
        }
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }

    //Q.
    int countPaths(Node node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    int helper(Node node, int sum, List<Integer> path){
        if (node == null){
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;
        // how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();

            if (s == sum) {
                count++;
            }
        }

        count += helper(node.left, s, path) + helper(node.right, s, path);

        // backtrack
        path.remove(path.size() - 1);
        return count;
    }

    //Q. put above ans in list same question just making changes
    List<List<Integer>> countPaths(Node node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path);
        return paths;
    }

    void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths){
        if (node == null){
            return 0;
        }

        path.add(node.val);

        if (node.val == sum && node.left == null && nod.right == null) {
            path.add(new ArrayList<>(path));
        }else{
            helper(node.left, sum-node.val, path, paths);
            helper(node.right, sum-node.val, path, paths);
        }
        path.remove(path.size() - 1);
    }
}
