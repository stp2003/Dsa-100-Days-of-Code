package day10;

public class ClimbingStairs_Leetcode_70 {

    //??
    public static int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int x = 1, y = 2;
        for (int i = 2; i < n; i++) {
            int steps = x;
            x = y;
            y = steps + x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(8));
    }
}
