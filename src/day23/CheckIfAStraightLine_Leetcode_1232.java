package day23;

public class CheckIfAStraightLine_Leetcode_1232 {

    //??
    public static boolean checkStraightLine(int[][] coordinates) {

        int x1, y1, x2, y2;

        x1 = coordinates[0][0];
        y1 = coordinates[0][1];
        x2 = coordinates[1][0];
        y2 = coordinates[1][1];

        //** slope finding ->
        for (int i = 2; i < coordinates.length; i++) {
            if (((coordinates[i][1] - y1) * (x2 - x1)) != ((y2 - y1) * (coordinates[i][0] - x1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1, 2}, {2, 3}, {4, 5}, {6, 7}}));
    }
}
