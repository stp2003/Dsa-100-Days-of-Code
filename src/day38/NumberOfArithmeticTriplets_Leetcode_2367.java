package day38;

public class NumberOfArithmeticTriplets_Leetcode_2367 {

    //??
    public static int arithmeticTriplets(int[] nums, int diff) {

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
