package day101;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    day101.TreeNode left;
    day101.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, day101.TreeNode left, day101.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeafSimilarTrees_Leetcode_872 {

    //??
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        checkLeftSimilar(list1, root1);
        checkLeftSimilar(list2, root2);

        return list1.equals(list2);
    }

    public void checkLeftSimilar(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        } else {
            checkLeftSimilar(list, root.left);
            checkLeftSimilar(list, root.right);
        }
    }
}
