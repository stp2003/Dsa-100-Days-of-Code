package day124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArraysWithMaxDifference_Leetcode_2966 {

    //??
    public static int[][] divideArray(int[] nums, int k) {

        Arrays.sort(nums);
        int[][] result = new int[0][0];

        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0) {
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                } else {
                    return new int[0][0];
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 2, 3, 6, 7}, 5)));
    }
}
