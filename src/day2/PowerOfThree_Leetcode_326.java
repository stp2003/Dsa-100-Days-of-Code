package day2;

import java.util.Scanner;

public class PowerOfThree_Leetcode_326 {

    //??
    public static boolean isPowerOfThree(int n) {

        if (n <= 0)
            return false;

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPowerOfThree(n));
    }
}
