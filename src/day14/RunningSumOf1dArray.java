package day14;

import java.util.Arrays;

public class RunningSumOf1dArray {

    //??
    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{4, 5, 6, 9, 3})));
    }
}
