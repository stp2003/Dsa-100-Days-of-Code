package day31;

public class NumberOfWaysToSplitArray_Leetcode_2270 {

    //??
    public static int waysToSplitArray(int[] nums) {

        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int ans = 0;
        long currentSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentSum += nums[i];
            if (currentSum >= sum - currentSum) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}
