package day82;

import java.util.Arrays;

public class FirstMissingPositive_Leetcode_41 {

    //??
    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int res = 1;
        for (int num : nums) {
            if (num == res) {
                res++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }
}
