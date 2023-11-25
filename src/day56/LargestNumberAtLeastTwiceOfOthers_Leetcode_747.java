package day56;

public class LargestNumberAtLeastTwiceOfOthers_Leetcode_747 {

    //??
    public static int dominantIndex(int[] nums) {

        int largest = -1;
        int flag = -1;
        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                flag = largest;
                largest = nums[i];
                res = i;
            } else if (nums[i] > flag) {
                flag = nums[i];
            }
        }
        if (largest >= 2 * flag) {
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1, 2, 3, 4, 5}));
    }
}
