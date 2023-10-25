package day25;

public class MinimumOperationsToReduceXToZero_Leetcode_1658 {

    //??
    public static int minOperations(int[] nums, int x) {

        int target = -x;

        for (int i : nums) target += i;

        if (target == 0) return nums.length;
        if (target < 0) return -1;
        int res = -1, sum = 0, left = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > target) {
                sum -= nums[left++];
            }
            if (sum == target) {
                res = Math.max(res, i - left + 1);
            }
        }

        return res == -1 ? -1 : nums.length - res;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1, 2, 3, 4, 5}, 5));
    }

}
