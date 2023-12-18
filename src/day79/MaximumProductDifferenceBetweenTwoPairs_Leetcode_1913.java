package day79;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs_Leetcode_1913 {

    //??
    public static int maxProductDifference(int[] nums) {

        Arrays.sort(nums);
        int w = nums[nums.length - 1], x = nums[nums.length - 2], y = nums[0], z = nums[1];
        return ((w * x) - (y * z));
    }

    public static void main(String[] args) {
        System.out.println(maxProductDifference(new int[]{5, 6, 2, 7, 4}));
    }
}
