package day8;

import java.util.Scanner;

public class UglyNumber_Leetcode_263 {

    //??
    public static boolean isUgly(int n) {

        if (n == 0) return false;

        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {

            if (n % 5 == 0) n /= 5;
            else if (n % 3 == 0) n /= 3;
            else if (n % 2 == 0) n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isUgly(n));
    }
}
