package day37;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber_Leetcode_414 {

    //??
    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        HashSet<Integer> res = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(nums[i]);
            if (res.size() == 3) return nums[i];

        }
        return nums[nums.length - 1];
    }


    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 2, 3}));
    }
}
