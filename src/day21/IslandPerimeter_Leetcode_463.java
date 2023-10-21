package day21;

public class IslandPerimeter_Leetcode_463 {

    //??
    public static int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) num++; //** UP
                    if (j == 0 || grid[i][j - 1] == 0) num++; //** LEFT
                    if (i == rows - 1 || grid[i + 1][j] == 0) num++; //** DOWN
                    if (j == cols - 1 || grid[i][j + 1] == 0) num++; //** RIGHT
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}}));
    }
}
