package day150;

class TreeNode {
    int val;
    day150.TreeNode left;
    day150.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, day150.TreeNode left, day150.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class DiameterOfBinaryTree_Leetcode_543 {

    //??
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return maxDia;
    }

    private int maxDia = 0;

    private int findDia(TreeNode root) {

        if (root == null) return 0;
        int leftDepth = findDia(root.left);
        int rightDepth = findDia(root.right);
        int currDia = leftDepth + rightDepth;
        maxDia = Math.max(maxDia, currDia);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
