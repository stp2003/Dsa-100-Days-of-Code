package day111;

public class MinimumFallingPathSum_Leetcode_931 {

    //??
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        if (len == 0) return 0;
        int[][] dp = new int[len][len];
        System.arraycopy(matrix[0], 0, dp[0], 0, len);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[i][j] = Math.min(Math.min(j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE, j + 1 < len ? dp[i - 1][j + 1] : Integer.MAX_VALUE), dp[i - 1][j]) + matrix[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++)
            res = Math.min(res, dp[len - 1][i]);
        return res;
    }

    public static void main(String[] args) {

    }
}
