package day6;

import java.util.Scanner;

public class IntegerBreak_Leetcode_343 {

    //??
    public static int integerBreak(int n) {

        if (n == 2) return 1;
        if (n == 3) return 2;

        int noOfThrees = n / 3;
        int reminder = n % 3;

        if (reminder == 0) {
            return ((int) Math.pow(3, noOfThrees));
        } else if (reminder == 1) {
            return ((int) Math.pow(3, noOfThrees - 1) * 4);
        } else {
            return ((int) Math.pow(3, noOfThrees) * 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(integerBreak(n));
    }
}
