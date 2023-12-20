package day81;

public class MaximumAscendingSubarraySum_Leetcode_1800 {

    //??
    public static int maxAscendingSum(int[] nums) {

        int ans = nums[0], flag = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                flag += nums[i];
            else
                flag = nums[i];
            ans = Math.max(ans, flag);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
    }
}
