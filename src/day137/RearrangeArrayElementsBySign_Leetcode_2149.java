package day137;

import java.util.Arrays;

public class RearrangeArrayElementsBySign_Leetcode_2149 {

    //??
    public static int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, 8, 9, 6, 3})));
    }
}
