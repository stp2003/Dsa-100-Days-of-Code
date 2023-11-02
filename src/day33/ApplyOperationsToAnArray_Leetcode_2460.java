package day33;

import java.util.Arrays;

public class ApplyOperationsToAnArray_Leetcode_2460 {

    //??
    public static int[] applyOperations(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                ans[j++] = 2 * nums[i];
                nums[i++] = 0;
            } else {
                ans[j++] = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[]{1, 2, 3, 3, 4})));
    }
}
