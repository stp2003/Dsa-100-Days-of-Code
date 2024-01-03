package day95;

public class SetMatrixZeroes_Leetcode_73 {

    //??
    public void setZeroes(int[][] matrix) {

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        //** Iterate through the matrix to identify zeroes and mark corresponding rows and columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                //** for each element that is zero, marks the corresponding row and column
                //** by setting the corresponding indices in row and col arrays to 1.
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;  //** Set the entire row or column to zero
                }
            }
        }

    }
}
