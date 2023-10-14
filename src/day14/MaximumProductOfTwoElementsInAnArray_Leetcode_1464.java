package day14;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray_Leetcode_1464 {

    //??
    public static int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int ans = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            ans = (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,4,5,6,3}));
    }
}
