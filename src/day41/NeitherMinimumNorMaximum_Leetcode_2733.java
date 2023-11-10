package day41;

import java.util.Arrays;

public class NeitherMinimumNorMaximum_Leetcode_2733 {

    //??
    public static int findNonMinOrMax(int[] nums) {

        int n = nums.length;
        if (n < 3)
            return -1;

        Arrays.sort(nums);
        return nums[1];
    }

    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{1, 2, 3, 4, 5}));
    }
}
