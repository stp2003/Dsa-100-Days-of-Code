package day27;

public class MaximizeTheTopmostElementAfterKMoves_Leetcode_2202 {

    //??
    public static int maximumTop(int[] nums, int k) {

        if (nums.length == 1 && k % 2 == 1) return -1;
        if (k == 1) return nums[1];

        int ans = 0;

        if (k > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        } else if (k == nums.length) {
            for (int i = 0; i < k - 1; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        } else {
            for (int i = 0; i < nums.length; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return Math.max(ans, nums[k]);
        }
    }

    public static void main(String[] args) {
        System.out.println(maximumTop(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
