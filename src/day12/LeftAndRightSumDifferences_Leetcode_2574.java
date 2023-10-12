package day12;

import java.util.Arrays;

public class LeftAndRightSumDifferences_Leetcode_2574 {

    //??
    public static int[] leftRightDifference(int[] nums) {

        int rightSum = 0;
        int leftSum = 0;

        int[] res = new int[nums.length];

        //** sum of array
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            res[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10, 5, 6, 8})));
    }
}
