package day28;

import java.util.Arrays;

public class SeparateTheDigitsInAnArray_Leetcode_2553 {

    //??
    public static int[] separateDigits(int[] nums) {

        StringBuilder res = new StringBuilder();

        for (int i : nums) {
            res.append(i);
        }

        int[] ans = new int[res.length()];
        for (int i = 0; i < res.length(); i++) {
            ans[i] = res.charAt(i) - '0';
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[]{1, 2, 3, 4, 5})));
    }
}
