package day57;

import java.util.Arrays;

public class ArrayPartition_Leetcode_561 {

    //??
    public static int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {
            res = res + Math.min(nums[i], nums[i + 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1, 2, 3, 4, 5}));
    }
}
