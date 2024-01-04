package day96;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMakeArrayEmpty_Leetcode_2870 {

    //??
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        int start = 0;
        while (start < nums.length) {
            int flag = start;

            while (flag < nums.length && nums[flag] == nums[start]) {
                flag++;
            }
            int count = flag - start;
            if (count == 1) return -1;
            ans += count / 3;

            if (count % 3 != 0) ans++;
            start = flag;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1, 1, 2, 2, 3, 6, 6, 4}));
    }
}
