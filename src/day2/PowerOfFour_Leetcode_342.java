package day2;

import java.util.Scanner;

public class PowerOfFour_Leetcode_342 {

    //??
    public static boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPowerOfFour(n));
    }
}
