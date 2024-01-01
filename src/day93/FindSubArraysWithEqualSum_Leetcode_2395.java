package day93;

public class FindSubArraysWithEqualSum_Leetcode_2395 {

    //??
    public static boolean findSubArrays(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[i + 1] == nums[j] + nums[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubArrays(new int[]{4, 2, 4}));
    }
}
