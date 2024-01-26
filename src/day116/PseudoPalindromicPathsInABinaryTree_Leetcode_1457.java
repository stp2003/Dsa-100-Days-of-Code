package day116;

class TreeNode {
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

    public static class PseudoPalindromicPathsInABinaryTree_Leetcode_1457 {

        //??
        int[] map = new int[9];
        int res = 0;

        public void dfs(TreeNode root) {
            map[root.val - 1]++;
            if (root.left == null && root.right == null) {
                int cnt = 0;
                for (int i = 0; i < 9; ++i) {
                    cnt += map[i] % 2;
                }
                if (cnt <= 1) {
                    res++;
                }
            }
            if (root.left != null) {
                dfs(root.left);
            }
            if (root.right != null) {
                dfs(root.right);
            }
            map[root.val - 1]--;
        }

        public int pseudoPalindromicPaths(TreeNode root) {
            dfs(root);
            return res;
        }
    }
}
