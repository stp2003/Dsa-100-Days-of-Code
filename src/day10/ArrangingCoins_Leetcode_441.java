package day10;

public class ArrangingCoins_Leetcode_441 {

    //??
    public static int arrangeCoins(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n - count;
        }
        return n < 0 ? count - 1 : count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
