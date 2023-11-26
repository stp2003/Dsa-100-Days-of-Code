package day57;

public class KeepMultiplyingFoundValuesByTwo_Leetcode_2154 {

    //??
    public static int findFinalValue(int[] nums, int original) {

        for (int num : nums) {
            if (num == original) {
                original = 2 * original;
                return findFinalValue(nums, original);
            }
        }
        return original;
    }

    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{1, 2, 3, 6, 12, 24}, 3));
    }
}
