package day59;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray_Leetcode_1979 {

    //??
    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;

        return gcd(num2, num1 % num2);
    }


    public static int findGCD(int[] nums) {

        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length - 1];

        return gcd(n1, n2);

    }

    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{1, 2, 3, 4, 5, 10}));
    }
}
