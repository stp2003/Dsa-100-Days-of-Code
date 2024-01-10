package day102;

class TreeNode {
    int val;
    day102.TreeNode left;
    day102.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, day102.TreeNode left, day102.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class AmountOfTimeForBinaryTreeToBeInfected_Leetcode_2385 {

    //??
    private int maxi = Integer.MIN_VALUE;


    public int amountOfTime(TreeNode root, int start) {

        calculateInfectionTime(root, start, true);
        return maxi;
    }


    private int calculateInfectionTime(TreeNode root, int start, boolean isStartNode) {

        if (root == null) return 0;

        if (root.val == start && isStartNode) {

            maxi = Math.max(maxi, calculateInfectionTime(root, start, false) - 1);
            return -1;
        }

        int leftHeight = calculateInfectionTime(root.left, start, isStartNode);
        int rightHeight = calculateInfectionTime(root.right, start, isStartNode);

        if (leftHeight < 0 || rightHeight < 0) {

            maxi = Math.max(maxi, Math.abs(leftHeight) + Math.abs(rightHeight));
            return Math.min(leftHeight, rightHeight) - 1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
