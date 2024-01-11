package day103;

class TreeNode {
    int val;
    day103.TreeNode left;
    day103.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, day103.TreeNode left, day103.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumDifferenceBetweenNodeAndAncestor_Leetcode_1026 {

    //??
    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return 0;
        int min = root.val, max = root.val;
        diff(root, min, max);
        return diff;
    }

    public int diff = 0;

    public void diff(TreeNode root, int min, int max) {
        if (root == null)
            return;
        diff = Math.max(diff, Math.max(Math.abs(min - root.val), Math.abs(max - root.val)));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        diff(root.left, min, max);
        diff(root.right, min, max);
    }
}
