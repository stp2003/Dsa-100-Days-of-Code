package day5;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements_Leetcode_2148 {

    //??
    public static int countElements(int[] nums) {


        Arrays.sort(nums);

        int count = 0;

        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] > nums[0]  &&  nums[i] < nums[nums.length - 1])  count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = new int[] {11,7,2,15};
        System.out.println(countElements(nums));
    }
}
