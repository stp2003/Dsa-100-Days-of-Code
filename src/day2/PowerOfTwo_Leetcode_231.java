package day2;

import java.util.Scanner;

public class PowerOfTwo_Leetcode_231 {

    //??
    public static boolean isPowerOfTwo(int n) {

        if (n == 0)
            return false;

        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
}
