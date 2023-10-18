package day18;

public class SubarrayProductLessThanK_Leetcode_713 {

    //??
    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k == 0) return 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long mul = 1;
            for (int j = i; j < nums.length; j++) {
                mul *= nums[j];
                if (mul < k) count++;
                else break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{1, 2, 3, 4}, 100));
    }
}
