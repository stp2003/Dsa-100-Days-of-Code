package day9;

import java.util.Arrays;

public class SortArrayByParity_Leetcode_905 {

    //??
    public static int[] sortArrayByParity(int[] nums) {

        int evenPos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                int temp = nums[evenPos];
                nums[evenPos] = nums[i];
                nums[i] = temp;

                evenPos++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,6,8,9,6,4,8,3,1};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
