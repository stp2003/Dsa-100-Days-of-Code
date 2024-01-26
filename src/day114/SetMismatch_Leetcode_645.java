package day114;

import java.util.Arrays;

public class SetMismatch_Leetcode_645 {

    //??
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                ans[0] = nums[i];
            }
        }
        int total = 0, actual = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            total += i + 1;
            actual += nums[i];
        }

        ans[1] = total - (actual - ans[0]);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 5, 9, 3})));
    }
}
