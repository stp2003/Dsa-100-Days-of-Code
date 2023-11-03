package day34;

import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget_Leetcode_2824 {

    //??
    public static int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);

        int count = 0, left = 0, right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(List.of(1, 2, 3, 4, 5), 5));
    }
}
