package day134;

import java.util.Arrays;

public class CherryPickupII_Leetcode_1463 {

    //??
    public static int[][][] dp;

    public static int helper(int[][] grid, int i, int robot1, int robot2) {
        int m = grid.length;
        int n = grid[0].length;

        if (robot1 < 0 || robot2 < 0 || robot1 >= n || robot2 >= n) return 0;
        if (i == m) return 0;
        if (dp[i][robot1][robot2] != -1) return dp[i][robot1][robot2];

        int ans = 0;
        ans += grid[i][robot1];
        if (robot1 != robot2) ans += grid[i][robot2];

        int maxNextRow = 0;
        for (int x = robot1 - 1; x <= robot1 + 1; x++) {
            for (int y = robot2 - 1; y <= robot2 + 1; y++) {
                maxNextRow = Math.max(maxNextRow, helper(grid, i + 1, x, y));
            }
        }
        ans += maxNextRow;
        return dp[i][robot1][robot2] = ans;
    }

    public static int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n][n];
        for (int[][] arr2D : dp)
            for (int[] arr1D : arr2D)
                Arrays.fill(arr1D, -1);
        return helper(grid, 0, 0, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(cherryPickup(new int[][]{{4, 4, 5, 6}, {1, 4, 7, 923, 456}}));
    }
}
