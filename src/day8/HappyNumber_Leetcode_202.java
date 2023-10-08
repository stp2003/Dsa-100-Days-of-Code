package day8;

import java.util.Scanner;

public class HappyNumber_Leetcode_202 {

    //??
    public static boolean isHappy(int n) {

        int sum = 0;

        while (n > 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }

        if (sum == 1) {
            return true;
        } else if (sum == 4) {     // corner case as 4 will result in 4 at last of all the operaions.
            return false;
        }
        return isHappy(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isHappy(n));
    }
}
