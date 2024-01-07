package day99;

public class ArithmeticSlices_Leetcode_413 {

    //??
    public static int numberOfArithmeticSlices(int[] nums) {

        int curr = 0;
        int ans = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr++;
                ans = ans + curr;
            } else {
                curr = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5}));
    }
}
