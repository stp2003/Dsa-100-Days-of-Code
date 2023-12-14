package day75;

import java.util.Arrays;

public class DifferenceBetweenOnesAndZerosInRowAndColumn_Leetcode_2482 {

    //??
    public static int[][] onesMinusZeros(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    row[i] += grid[i][j];
                    col[j] += grid[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = (2 * row[i] - n) + (2 * col[j] - m);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}})));
    }
}
