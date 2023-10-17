package day17;

public class Convert1DArrayInto2DArray_Leetcode_2022 {

    //??
    public static int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] ans = new int[m][n];

        for (int i = 0; i < original.length; ++i) {
            ans[i / n][i % n] = original[i];
        }
        return ans;
    }
}
