package day13;

public class CountNegativeNumbersInASortedMatrix_Leetcode_1351 {

    //??
    public static int countNegatives(int[][] grid) {

        int count = 0;
        int col = grid[0].length;

        for (int[] ints : grid) {
            for (int j = 0; j < col; j++) {
                if (ints[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{1, 2, 3, 4, 5}, {-4, -8, 6, -5, 3}}));
    }
}
