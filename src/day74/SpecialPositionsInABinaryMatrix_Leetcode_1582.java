package day74;

public class SpecialPositionsInABinaryMatrix_Leetcode_1582 {

    //??
    public static int numSpecial(int[][] mat) {

        int row = mat.length, col = mat[0].length;
        int[] rowSum = new int[row], colSum = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        int numSpecialPositions = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) numSpecialPositions++;
            }
        }
        return numSpecialPositions;

    }

    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{1, 0, 0,}, {0, 0, 1}, {1, 0, 0}}));
    }
}
