package day71;

import java.util.Arrays;

public class TransposeMatrix_Leetcode_867 {

    //??
    public static int[][] transpose(int[][] matrix) {

        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
