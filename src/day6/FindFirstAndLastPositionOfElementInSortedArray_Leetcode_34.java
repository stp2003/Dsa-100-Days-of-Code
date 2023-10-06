package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray_Leetcode_34 {

    //??
    public static int[] searchRange(int[] nums, int target) {

        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            ans.add(i);
        }

        int[] res = new int[2];  // as there will only be 2 elements in the resultant array -> start and end index

        res[0] = ans.indexOf(target);
        res[1] = ans.lastIndexOf(target);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 8, 9, 8};
        int tar = 8;
        System.out.println(Arrays.toString(searchRange(nums, tar)));
    }

}
