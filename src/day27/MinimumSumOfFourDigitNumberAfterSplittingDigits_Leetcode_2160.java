package day27;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits_Leetcode_2160 {

    //??
    public static int minimumSum(int num) {

        int[] digits = new int[4];
        int cur = 0;

        while (num > 0) {
            digits[cur++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);

        int num1 = digits[0] * 10 + digits[2];
        int num2 = digits[1] * 10 + digits[3];

        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2329));
    }
}
