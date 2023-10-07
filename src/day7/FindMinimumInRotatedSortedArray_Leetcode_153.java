package day7;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray_Leetcode_153 {

    //??
    public static int findMin(int[] nums) {

        Arrays.sort(nums);

        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,6,8,9,6,4,8,3,1};
        System.out.println(findMin(nums));
    }
}
