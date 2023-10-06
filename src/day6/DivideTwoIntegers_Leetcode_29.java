package day6;

import java.util.Scanner;

public class DivideTwoIntegers_Leetcode_29 {

    //??
    public static int divide(int dividend, int divisor) {

        long p = (long) dividend / (long) divisor;

        if (p > (long) Math.pow(2, 31) - 1) {
            p = (long) Math.pow(2, 31) - 1;
        }
        if (p < (-1) * (long) Math.pow(2, 31)) {
            p = (long) Math.pow(-2, 31);
        }
        return (int) p;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        System.out.println(divide(dividend, divisor));
    }
}
